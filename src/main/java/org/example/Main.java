package org.example;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Main {

    // 创建一个带缓冲队列的线程池
    private static final ThreadPoolExecutor executor = new ThreadPoolExecutor(20,
            100,
            10,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(10000));

    private static final String BAIDU_SEARCH_URL = "https://www.baidu.com/s?wd=";

    // 这里不建议执行次数太多，百度会封IP导致调用失败,
    // TODO 最好是使用IP代理池实现，
    private static final int EXECUTE_TIMES = 100;

    public static void main(String[] args) {
        for (int i = 0; i < EXECUTE_TIMES; i++) {
            int requestId = i + 1;
            executor.execute(() -> doSearch(BAIDU_SEARCH_URL + RandomUtil.randomEle(Constant.keywords), requestId));
        }
        executor.shutdown();
    }

    /**
     * 执行查询
     * @param url 查询URL
     * @param requestId 请求ID，用于记录日志
     */
    public static void doSearch(String url, int requestId){
        System.out.println("requestId :" + requestId);
        // 构建请求对象
        HttpRequest request = HttpUtil.createGet(url);
        // 设置user-agent 防止被BAN
        String userAgent = RandomUtil.randomEle(Constant.userAgents);
        request.header("user-agent", userAgent);
        request.header("Host", "www.baidu.com");
        // 发送请求
        try (HttpResponse response = request.execute()){
            Document document = Jsoup.parse(response.body());
            // 通过路径获取搜索结果
            Elements elements = document.select("html body div div div div");
            if (elements.isEmpty()) {
                System.err.println("requestId : " + requestId + ", 查询异常或查询结果为空！" + url);
                return;
            }
            // 过滤不需要的结果
            List<String> results = elements.stream()
                    .filter(element -> (element.hasClass("result-op") || element.hasClass("result"))
                            && element.hasClass("c-container"))
                    .map(Element::text)
                    .collect(Collectors.toList());
            for (String result : results) {
                System.out.println("requestId :" + requestId + " > " + result);
            }
        } catch (Exception e) {
            System.err.println("requestId :" + requestId + ", 请求异常！");
        }
    }
}