package org.example;

import cn.hutool.core.collection.ListUtil;

import java.util.List;

public interface Constant {
	// userAgent 列表
    List<String> userAgents = ListUtil.of(
            "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_6_8; en-us) AppleWebKit/534.50 (KHTML, like Gecko) Version/5.1 Safari/534.50",
            "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-us) AppleWebKit/534.50 (KHTML, like Gecko) Version/5.1 Safari/534.50",
            "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:38.0) Gecko/20100101 Firefox/38.0",
            "Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; .NET4.0C; .NET4.0E; .NET CLR 2.0.50727; .NET CLR 3.0.30729; .NET CLR 3.5.30729; InfoPath.3; rv:11.0) like Gecko",
            "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)",
            "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.0; Trident/4.0)",
            "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0)",
            "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)",
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.6; rv:2.0.1) Gecko/20100101 Firefox/4.0.1",
            "Mozilla/5.0 (Windows NT 6.1; rv:2.0.1) Gecko/20100101 Firefox/4.0.1",
            "Opera/9.80 (Macintosh; Intel Mac OS X 10.6.8; U; en) Presto/2.8.131 Version/11.11",
            "Opera/9.80 (Windows NT 6.1; U; en) Presto/2.8.131 Version/11.11",
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_0) AppleWebKit/535.11 (KHTML, like Gecko) Chrome/17.0.963.56 Safari/535.11",
            "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; Maxthon 2.0)",
            "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; TencentTraveler 4.0)",
            "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1)",
            "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; The World)",
            "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; Trident/4.0; SE 2.X MetaSr 1.0; SE 2.X MetaSr 1.0; .NET CLR 2.0.50727; SE 2.X MetaSr 1.0)",
            "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; 360SE)",
            "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; Avant Browser)",
            "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1)",
            "Mozilla/5.0 (iPhone; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5",
            "Mozilla/5.0 (iPod; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5",
            "Mozilla/5.0 (iPad; U; CPU OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5",
            "Mozilla/5.0 (Linux; U; Android 2.3.7; en-us; Nexus One Build/FRF91) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1",
            "MQQBrowser/26 Mozilla/5.0 (Linux; U; Android 2.3.7; zh-cn; MB200 Build/GRJ22; CyanogenMod-7) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1",
            "Opera/9.80 (Android 2.3.4; Linux; Opera Mobi/build-1107180945; U; en-GB) Presto/2.8.149 Version/11.10",
            "Mozilla/5.0 (Linux; U; Android 3.0; en-us; Xoom Build/HRI39) AppleWebKit/534.13 (KHTML, like Gecko) Version/4.0 Safari/534.13",
            "Mozilla/5.0 (BlackBerry; U; BlackBerry 9800; en) AppleWebKit/534.1+ (KHTML, like Gecko) Version/6.0.0.337 Mobile Safari/534.1+",
            "Mozilla/5.0 (hp-tablet; Linux; hpwOS/3.0.0; U; en-US) AppleWebKit/534.6 (KHTML, like Gecko) wOSBrowser/233.70 Safari/534.6 TouchPad/1.0",
            "Mozilla/5.0 (SymbianOS/9.4; Series60/5.0 NokiaN97-1/20.0.019; Profile/MIDP-2.1 Configuration/CLDC-1.1) AppleWebKit/525 (KHTML, like Gecko) BrowserNG/7.1.18124",
            "Mozilla/5.0 (compatible; MSIE 9.0; Windows Phone OS 7.5; Trident/5.0; IEMobile/9.0; HTC; Titan)",
            "UCWEB7.0.2.37/28/999",
            "NOKIA5700/ UCWEB7.0.2.37/28/999",
            "Openwave/ UCWEB7.0.2.37/28/999",
            "Mozilla/4.0 (compatible; MSIE 6.0; ) Opera/UCWEB7.0.2.37/28/999",
            "Mozilla/6.0 (iPhone; CPU iPhone OS 8_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/8.0 Mobile/10A5376e Safari/8536.25"
    );
    // 定义关键字
    List<String> keywords = ListUtil.of("Java", "C", "C++", "docker", "k8s", "native cloud",
            "jenkins", "git", "gitlab", "github", "git flow", "devops",
            "计算机导论",
            "高等数学",
            "应用创造学",
            "工程图学与计算机绘图",
            "面向对象程序设计",
            "概率论与数理统计",
            "离散数学",
            "软件工程概论",
            "数据结构",
            "计算机组成与结构",
            "操作系统",
            "计算机网络",
            "算法设计与分析",
            "软件工程经济学",
            "Java技术",
            "UML建模",
            "数据库系统概论",
            "编译原理",
            "软件体系结构",
            "程序分析",
            "软件过程与项目管理",
            "系统分析与设计",
            "程序测试",
            "模式识别",
            "嵌入式程序设计",
            "人机交互技术",
            "云计算",
            "计算机与网络安全",
            "计算机图形学",
            "数据挖掘技术",
            "分布对象技术",
            "网络多媒体",
            "网络程序设计",
            ".NET程序设计",
            "协议工程",
            "虚拟机",
            "访问控制列表",
            "线程",
            "多线程",
            "进程",
            "守护进程",
            "进程间通信",
            "死锁",
            "银行家算法",
            "内存管理",
            "虚拟地址",
            "物理地址",
            "引导盘",
            "页面失效",
            "后台进程/前台进程",
            "文件传送协议",
            "图形用户界面",
            "权限",
            "移植",
            "可移植系统接口",
            "分时",
            "工作区",
            "工作目录",
            "窗口管理器",
            "封装器",
            "字典",
            "堆",
            "优先级队列",
            "矩阵乘法",
            "贪心算法",
            "上界/下界",
            "最好情况/最坏情况/平均情况",
            "插入排序",
            "合并排序",
            "堆排序",
            "快速排序",
            "动态规划",
            "背包问题",
            "霍夫曼编码",
            "迪杰斯特拉算法",
            "贝尔曼-福德算法",
            "弗洛伊德算法",
            "回溯",
            "N皇后问题",
            "渐进增长",
            "线性规划",
            "随机数生成",
            "图的生成",
            "图论-多项式算法",
            "连通分支",
            "最小生成树",
            "最短路径",
            "NP问题",
            "旅行商问题",
            "同构",
            "压缩",
            "最长公共子串",
            "最短公共父串",
            "收敛速度",
            "集合",
            "线性方程组",
            "数据抽象",
            "数据元素",
            "数据对象",
            "数据类型",
            "逻辑结构",
            "物理结构",
            "线性结构/非线性结构",
            "线性表",
            "栈",
            "队列",
            "串",
            "图",
            "插入",
            "删除",
            "前趋",
            "后继",
            "直接前趋",
            "直接后继",
            "双端列表",
            "循环队列",
            "指针",
            "先进先出表（队列）",
            "后进先出表（队列）",
            "栈底/栈顶",
            "压入/弹出",
            "队头/队尾",
            "上溢/下溢",
            "数组",
            "矩阵",
            "多维数组",
            "以行为主/以列为主的顺序分配",
            "三角矩阵",
            "对称矩阵",
            "稀疏矩阵",
            "转置矩阵",
            "链表",
            "线性链表",
            "单链表",
            "多重链表",
            "循环链表",
            "双向链表",
            "十字链表",
            "广义表",
            "指针域",
            "头结点",
            "头指针/尾指针",
            "空白串",
            "空串（零串）Nullstring",
            "子串",
            "树",
            "子树",
            "森林",
            "根",
            "叶子",
            "深度",
            "双亲/孩子/兄弟/祖先/子孙",
            "二叉树",
            "平衡二叉树",
            "满二叉树",
            "完全二叉树",
            "遍历二叉树",
            "二叉排序树",
            "二叉查找树",
            "线索二叉树",
            "哈夫曼树",
            "有序树/无序树",
            "判定树",
            "数字查找树",
            "树的遍历",
            "先序遍历",
            "中序遍历",
            "后序遍历",
            "子图",
            "有向图/无向图",
            "完全图",
            "连通图",
            "非连通图",
            "强连通图",
            "弱连通图",
            "有向无环图",
            "重连通图",
            "二部图",
            "边",
            "顶点",
            "连接点",
            "初始结点",
            "终端结点",
            "相邻边",
            "相邻顶点",
            "关联边",
            "入度/出度",
            "有序对/无序对",
            "简单路径",
            "简单回路",
            "连通分量",
            "邻接矩阵",
            "邻接表",
            "邻接多重表",
            "遍历图",
            "生成树",
            "拓扑排序",
            "偏序",
            "AOV网",
            "AOE网",
            "关键路径",
            "线性查找（顺序查找）",
            "二分查找",
            "分块查找",
            "散列查找",
            "平均查找长度",
            "散列表",
            "散列函数",
            "直接定址法",
            "数字分析法",
            "平方取中法",
            "随机数法",
            "内部排序",
            "外部排序",
            "选择排序",
            "基数排序",
            "平衡归并排序",
            "二路平衡归并排序",
            "多步归并排序",
            "置换选择排序",
            "索引文件",
            "索引顺序文件",
            "索引非顺序文件",
            "多重链表文件",
            "倒排文件",
            "端口",
            "服务器",
            "客户端",
            "服务访问点",
            "开放系统互联",
            "物理层",
            "数据链路层",
            "网络层",
            "运输层",
            "会话层",
            "表示层",
            "应用层",
            "TCP/IP协议",
            "信道容量",
            "香农",
            "奈奎斯特",
            "双绞线",
            "同轴电缆",
            "光纤",
            "不归零码",
            "曼彻斯特编码",
            "调制",
            "脉码调制",
            "增量调制",
            "同步传输/异步传输",
            "循环冗余校验",
            "流量控制",
            "滑动窗口",
            "差错控制",
            "帧结构",
            "复用",
            "非对称数字用户线路",
            "电路交换和分组交换",
            "频分多路复用",
            "信令",
            "数据报",
            "虚电路",
            "帧中继",
            "信元",
            "拥塞",
            "反压",
            "令牌桶",
            "环形/总线形/树形和星形结构",
            "局域网",
            "集线器",
            "交换机",
            "路由器",
            "网桥",
            "以太网监听算法",
            "子网掩码",
            "三次握手",
            "地址解析协议",
            "瘦客户机",
            "网际控制报文协议",
            "因特网群组管理协议",
            "拒绝服务",
            "边界网关",
            "域名系统",
            "数据链路控制",
            "互联网电子邮件协议标准",
            "远程控制",
            "简单邮件传送协议",
            "计算机导论",
            "高等数学",
            "应用创造学",
            "工程图学与计算机绘图",
            "面向对象程序设计",
            "概率论与数理统计",
            "离散数学",
            "软件工程概论",
            "数据结构",
            "计算机组成与结构",
            "操作系统",
            "计算机网络",
            "算法设计与分析",
            "软件工程经济学",
            "Java技术",
            "UML建模",
            "数据库系统概论",
            "编译原理",
            "软件体系结构",
            "程序分析",
            "软件过程与项目管理",
            "系统分析与设计",
            "程序测试",
            "模式识别",
            "嵌入式程序设计",
            "人机交互技术",
            "云计算",
            "计算机与网络安全",
            "计算机图形学",
            "数据挖掘技术",
            "分布对象技术",
            "网络多媒体",
            "网络程序设计",
            ".NET程序设计",
            "协议工程",
            "虚拟机",
            "访问控制列表",
            "线程",
            "多线程",
            "进程",
            "守护进程",
            "进程间通信",
            "死锁",
            "银行家算法",
            "内存管理",
            "虚拟地址",
            "物理地址",
            "引导盘",
            "页面失效",
            "后台进程/前台进程",
            "文件传送协议",
            "图形用户界面",
            "权限",
            "移植",
            "可移植系统接口",
            "分时",
            "工作区",
            "工作目录",
            "窗口管理器",
            "封装器",
            "字典",
            "堆",
            "优先级队列",
            "矩阵乘法",
            "贪心算法",
            "上界/下界",
            "最好情况/最坏情况/平均情况",
            "插入排序",
            "合并排序",
            "堆排序",
            "快速排序",
            "动态规划",
            "背包问题",
            "霍夫曼编码",
            "迪杰斯特拉算法",
            "贝尔曼-福德算法",
            "弗洛伊德算法",
            "回溯",
            "N皇后问题",
            "渐进增长",
            "线性规划",
            "随机数生成",
            "图的生成",
            "图论-多项式算法",
            "连通分支",
            "最小生成树",
            "最短路径",
            "NP问题",
            "旅行商问题",
            "同构",
            "压缩",
            "最长公共子串",
            "最短公共父串",
            "收敛速度",
            "集合",
            "线性方程组",
            "数据抽象",
            "数据元素",
            "数据对象",
            "数据类型",
            "逻辑结构",
            "物理结构",
            "线性结构/非线性结构",
            "线性表",
            "栈",
            "队列",
            "串",
            "图",
            "插入",
            "删除",
            "前趋",
            "后继",
            "直接前趋",
            "直接后继",
            "双端列表",
            "循环队列",
            "指针",
            "先进先出表（队列）",
            "后进先出表（队列）",
            "栈底/栈顶",
            "压入/弹出",
            "队头/队尾",
            "上溢/下溢",
            "数组",
            "矩阵",
            "多维数组",
            "以行为主/以列为主的顺序分配",
            "三角矩阵",
            "对称矩阵",
            "稀疏矩阵",
            "转置矩阵",
            "链表",
            "线性链表",
            "单链表",
            "多重链表",
            "循环链表",
            "双向链表",
            "十字链表",
            "广义表",
            "指针域",
            "头结点",
            "头指针/尾指针",
            "空白串",
            "空串（零串）Nullstring",
            "子串",
            "树",
            "子树",
            "森林",
            "根",
            "叶子",
            "深度",
            "双亲/孩子/兄弟/祖先/子孙",
            "二叉树",
            "平衡二叉树",
            "满二叉树",
            "完全二叉树",
            "遍历二叉树",
            "二叉排序树",
            "二叉查找树",
            "线索二叉树",
            "哈夫曼树",
            "有序树/无序树",
            "判定树",
            "数字查找树",
            "树的遍历",
            "先序遍历",
            "中序遍历",
            "后序遍历",
            "子图",
            "有向图/无向图",
            "完全图",
            "连通图",
            "非连通图",
            "强连通图",
            "弱连通图",
            "有向无环图",
            "重连通图",
            "二部图",
            "边",
            "顶点",
            "连接点",
            "初始结点",
            "终端结点",
            "相邻边",
            "相邻顶点",
            "关联边",
            "入度/出度",
            "有序对/无序对",
            "简单路径",
            "简单回路",
            "连通分量",
            "邻接矩阵",
            "邻接表",
            "邻接多重表",
            "遍历图",
            "生成树",
            "拓扑排序",
            "偏序",
            "AOV网",
            "AOE网",
            "关键路径",
            "线性查找（顺序查找）",
            "二分查找",
            "分块查找",
            "散列查找",
            "平均查找长度",
            "散列表",
            "散列函数",
            "直接定址法",
            "数字分析法",
            "平方取中法",
            "随机数法",
            "内部排序",
            "外部排序",
            "选择排序",
            "基数排序",
            "平衡归并排序",
            "二路平衡归并排序",
            "多步归并排序",
            "置换选择排序",
            "索引文件",
            "索引顺序文件",
            "索引非顺序文件",
            "多重链表文件",
            "倒排文件",
            "端口",
            "服务器",
            "客户端",
            "服务访问点",
            "开放系统互联",
            "物理层",
            "数据链路层",
            "网络层",
            "运输层",
            "会话层",
            "表示层",
            "应用层",
            "TCP/IP协议",
            "信道容量",
            "香农",
            "奈奎斯特",
            "双绞线",
            "同轴电缆",
            "光纤",
            "不归零码",
            "曼彻斯特编码",
            "调制",
            "脉码调制",
            "增量调制",
            "同步传输/异步传输",
            "循环冗余校验",
            "流量控制",
            "滑动窗口",
            "差错控制",
            "帧结构",
            "复用",
            "非对称数字用户线路",
            "电路交换和分组交换",
            "频分多路复用",
            "信令",
            "数据报",
            "虚电路",
            "帧中继",
            "信元",
            "拥塞",
            "反压",
            "令牌桶",
            "环形/总线形/树形和星形结构",
            "局域网",
            "集线器",
            "交换机",
            "路由器",
            "网桥",
            "以太网监听算法",
            "子网掩码",
            "三次握手",
            "地址解析协议",
            "瘦客户机",
            "网际控制报文协议",
            "因特网群组管理协议",
            "拒绝服务",
            "边界网关",
            "域名系统",
            "数据链路控制",
            "互联网电子邮件协议标准",
            "远程控制",
            "简单邮件传送协议",
            "IntroductiontoComputerScience",
            "AdvancedMathematics",
            "CreativityMethodology",
            "EngineeringGraphicsandComputerGraphicsDrawings",
            "Object-orientedProgramming",
            "ProbabilityTheoryandStatistics",
            "DiscreteMathematics",
            "IntroductiontoSoftwareEngineering",
            "DataStructures",
            "ComputerOrganizationandArchitecture",
            "OperatingSystem",
            "ComputerNetwork",
            "AlgorithmDesignandAnalysis",
            "SoftwareEngineeringEconomics",
            "JavaTechnology",
            "UMLModeling(UnifiedModelingLanguageModeling)",
            "IntroductiontoDatabaseSystems",
            "PrincipleofCompiler",
            "SoftwareArchitecture",
            "ProgramAnalysis",
            "SoftwareProcessandProjectManagement",
            "SystemAnalysisandDesign",
            "ProgramTesting",
            "PatternRecognition",
            "EmbeddedProgramming",
            "Human-computerInteractionTechnology",
            "CloudComputing",
            "ComputerandNetworkSecurity",
            "ComputerGraphics",
            "DataMiningTechnology",
            "DistributedObjectTechnology",
            "InternetMultimedia",
            "NetworkProgramming",
            ".NETProgrammingDesign",
            "ProtocolEngineering",
            "VirtualMachine",
            "AccessControlList",
            "Thread",
            "Multithreading",
            "Process",
            "Daemon",
            "IPC(InterprocessCommunication)",
            "Deadlock",
            "Banker’salgorithm",
            "Memorymanagement",
            "Virtualaddress",
            "Physicaladdress",
            "BootDisk",
            "PageFault",
            "BackgroundProcess/ForegroundProcess",
            "FTP(FileTransferProtocol)",
            "GUI(GraphicalUserInterface)",
            "Permission",
            "Port/Ported/Porting",
            "PortableOperatingSystemInterface",
            "Time-sharing",
            "Workspace",
            "WorkingDirectory",
            "WindowManager",
            "Wrapper",
            "Dictionaries",
            "Heap",
            "Priorityqueue",
            "Matrixmultiplication",
            "Greedyalgorithm",
            "Upperbound/Lowerbound",
            "Bestcase/WorstCase/Averagecase",
            "Insertionsort",
            "Mergesort",
            "Heapsort",
            "Quicksort",
            "DP(DynamicProgramming)",
            "Knapsackproblem",
            "HuffmanCoding",
            "Dijkstra’salgorithm",
            "Bellman-Fordalgorithm",
            "Floyd-Warshallalgorithm",
            "Back-Tracking",
            "N-Queenproblem",
            "Asymptoticgrowth(包含O-notationΩ-notationΘ-notation)",
            "Linearprogramming",
            "Randomnumbergeneration",
            "Generatinggraphs",
            "GraphProblems–polynomialalgorithm",
            "Connectedcomponents",
            "MinimumSpanningTree",
            "Shortestpath",
            "Non-DeterministicPolynomialproblem",
            "Travelingsalesmanproblem",
            "Graphisomorphism",
            "Textcompression",
            "LongestCommonSubstring",
            "ShortestCommonSuperstring",
            "Rateofconvergence",
            "SetDataStructures",
            "LinearEquations",
            "Dataabstraction",
            "Dataelement",
            "Dataobject",
            "Datatype",
            "Logicalstructure",
            "Physicalstructure",
            "Linearstructure/Nonlinearstructure",
            "Linearlist",
            "Stack",
            "Queue",
            "String",
            "Graph",
            "Insertion",
            "Deletion",
            "Predecessor",
            "Successor",
            "Immediatepredecessor",
            "Immediatesuccessor",
            "Double-endedqueue",
            "Circularqueue",
            "Pointer",
            "First-infirst-outlist",
            "Last-infirst-outlist",
            "Bottom/Top",
            "Push/Pop",
            "Front/Rear",
            "Overflow/Underflow",
            "Array",
            "Matrix",
            "Multi-dimensionalarray",
            "Rowmajororder/Columnmajororder",
            "Triangularmatrix",
            "Symmetricmatrix",
            "Sparsematrix",
            "Transposedmatrix",
            "Linkedlist",
            "Linearlinkedlist",
            "Singlelinkedlist",
            "Multilinkedlist",
            "Circularlinkedlist",
            "Doublylinkedlist",
            "Orthogonallist",
            "Generalizedlist",
            "Pointerfield",
            "Headnode",
            "Headpointer/Tailpointer",
            "Blankstring",
            "Substring",
            "Tree",
            "Subtree",
            "Forest",
            "Root",
            "Leaf",
            "Depth",
            "Parents/Children/Brother/Ancestor/Descendant",
            "Binarytree",
            "Balancedbinarytree",
            "Fullbinarytree",
            "Completebinarytree",
            "Traversingbinarytree",
            "Binarysorttree",
            "Binarysearchtree",
            "Threadedbinarytree",
            "Huffmantree",
            "Orderedtree/Unorderedtree",
            "Decisiontree",
            "Digitalsearchtree",
            "Traversaloftree",
            "Preordertraversal",
            "Inordertraversal",
            "Postordertraversal",
            "Subgraph",
            "Digraph(directedgraph)/Undigraph(undirectedgraph)",
"Completegraph",
        "Connectedgraph",
        "Unconnectedgraph",
        "Stronglyconnectedgraph",
        "Weaklyconnectedgraph",
        "Directedacyclicgraph",
        "Biconnectedgraph",
        "Bipartitegraph",
        "Edge",
        "Vertex",
        "Articulationpoint",
        "Initialnode",
        "Terminalnode",
        "Adjacentedge",
        "Adjacentvertex",
        "Incidentedge",
        "In-degree/Out-degree",
        "Orderedpair/Unorderedpair",
        "Simplepath",
        "Simplecycle",
        "Connectedcomponent",
        "Adjacencymatrix",
        "Adjacencylist",
        "Adjacencymulti-list",
        "Traversinggraph",
        "Spanningtree",
        "Topologicalsort",
        "Partialorder",
        "ActivityOnVertexnetwork",
        "ActivityOnEdgenetwork",
        "Criticalpath",
        "Linearsearch(Sequentialsearch)",
        "Binarysearch",
        "Blocksearch",
        "Hashsearch",
        "Averagesearchlength",
        "Hashtable",
        "Hashfunction",
        "Immediatelyallocatingmethod",
        "Digitalanalysismethod",
        "Mid-squaremethod",
        "Randomnumbermethod",
        "Internalsort",
        "Externalsort",
        "Selectionsort",
        "Radixsort",
        "Balancemergingsort",
        "Balancetwo-waymergingsort",
        "Ployphasemergingsort",
        "Replacementselectionsort",
        "Indexedfile",
        "Indexedsequentialfile",
        "Indexednon-sequentialfile",
        "Multi-listfile",
        "Invertedfile",
            "Server",
            "Client",
            "SAP(ServiceAccessPoint)",
            "OSI(OpenSystemInterconnection)",
            "Physicallayer",
            "Datalinklayer",
            "Networklayer",
            "Transportlayer",
            "Sessionlayer",
            "Presentationlayer",
            "Applicationlayer",
            "TCP/IPprotocol",
            "Channelcapacity",
            "Shannon",
            "Nyquist",
            "UTP(UnshieldedTwistedPaired)",
            "Coaxialcable",
            "Opticalfiber",
            "NRZ(NonReturntoZero)",
            "Manchestercoding",
            "Modulation",
            "PCM(PulseCodeModulation)",
            "DM(DeltaModulation)",
            "Synchronoustransmission/ATM(Asynchronoustransmission)",
            "CRC(CyclicRedundancyCheck)",
            "Flowcontrol",
            "Slidingwindow",
            "Errorcontrol",
            "Framestructure",
            "Reuse",
            "ADSL(Asymmetricdigitalsubscriberline)",
            "Circuitswitchingandpacketswitching",
            "Frequencydivisionmultiplexing",
            "Signaling",
            "Datagram",
            "Virtualcircuit",
            "Framerelay",
            "Ceil",
            "Congestion",
            "Backpressure",
            "Tokenbucket",
            "Ring/bus/treeandstarstructure",
            "LAN(localareanetwork)",
            "Hub",
            "Switch",
            "Router",
            "Networkbridge",
            "Ethernetlisteneralgorithm",
            "Subnetmask",
            "Three-wayhandshake",
            "APP(Addressresolutionprotocol)",
            "Thinclient",
            "ICMP(InternetControlMessageProtocol)",
            "IGMP(InternetGroupManagementProtocol)",
            "Denialofservice",
            "Bordergateway",
            "DNS(DomainNameSystem)",
            "DLC(DataLinkControl)",
            "POP(PostOfficeProtocol)",
            "Remotecontrol",
            "SMTP(SimpleMailTransportProtocol)",
            "IntroductiontoComputerScience",
            "AdvancedMathematics",
            "CreativityMethodology",
            "EngineeringGraphicsandComputerGraphicsDrawings",
            "Object-orientedProgramming",
            "ProbabilityTheoryandStatistics",
            "DiscreteMathematics",
            "IntroductiontoSoftwareEngineering",
            "DataStructures",
            "ComputerOrganizationandArchitecture",
            "OperatingSystem",
            "ComputerNetwork",
            "AlgorithmDesignandAnalysis",
            "SoftwareEngineeringEconomics",
            "JavaTechnology",
            "UMLModeling(UnifiedModelingLanguageModeling)",
            "IntroductiontoDatabaseSystems",
            "PrincipleofCompiler",
            "SoftwareArchitecture",
            "ProgramAnalysis",
            "SoftwareProcessandProjectManagement",
            "SystemAnalysisandDesign",
            "ProgramTesting",
            "PatternRecognition",
            "EmbeddedProgramming",
            "Human-computerInteractionTechnology",
            "CloudComputing",
            "ComputerandNetworkSecurity",
            "ComputerGraphics",
            "DataMiningTechnology",
            "DistributedObjectTechnology",
            "InternetMultimedia",
            "NetworkProgramming",
            ".NETProgrammingDesign",
            "ProtocolEngineering",
            "VirtualMachine",
            "AccessControlList",
            "Thread",
            "Multithreading",
            "Process",
            "Daemon",
            "IPC(InterprocessCommunication)",
            "Deadlock",
            "Banker’salgorithm",
            "Memorymanagement",
            "Virtualaddress",
            "Physicaladdress",
            "BootDisk",
            "PageFault",
            "BackgroundProcess/ForegroundProcess",
            "FTP(FileTransferProtocol)",
            "GUI(GraphicalUserInterface)",
            "Permission",
            "Port/Ported/Porting",
            "PortableOperatingSystemInterface",
            "Time-sharing",
            "Workspace",
            "WorkingDirectory",
            "WindowManager",
            "Wrapper",
    "Dictionaries",
            "Heap",
            "Priorityqueue",
            "Matrixmultiplication",
            "Greedyalgorithm",
            "Upperbound/Lowerbound",
            "Bestcase/WorstCase/Averagecase",
            "Insertionsort",
            "Mergesort",
            "Heapsort",
            "Quicksort",
            "DP(DynamicProgramming)",
            "Knapsackproblem",
            "HuffmanCoding",
            "Dijkstra’salgorithm",
            "Bellman-Fordalgorithm",
            "Floyd-Warshallalgorithm",
            "Back-Tracking",
            "N-Queenproblem",
            "Asymptoticgrowth(包含O-notationΩ-notationΘ-notation)",
            "Linearprogramming",
            "Randomnumbergeneration",
            "Generatinggraphs",
            "GraphProblems–polynomialalgorithm",
            "Connectedcomponents",
            "MinimumSpanningTree",
            "Shortestpath",
            "Non-DeterministicPolynomialproblem",
            "Travelingsalesmanproblem",
            "Graphisomorphism",
            "Textcompression",
            "LongestCommonSubstring",
            "ShortestCommonSuperstring",
            "Rateofconvergence",
            "SetDataStructures",
            "LinearEquations",
            "Dataabstraction",
            "Dataelement",
            "Dataobject",
            "Datatype",
            "Logicalstructure",
            "Physicalstructure",
            "Linearstructure/Nonlinearstructure",
            "Linearlist",
            "Stack",
            "Queue",
            "String",
            "Graph",
            "Insertion",
            "Deletion",
            "Predecessor",
            "Successor",
            "Immediatepredecessor",
            "Immediatesuccessor",
            "Double-endedqueue",
            "Circularqueue",
            "Pointer",
            "First-infirst-outlist",
            "Last-infirst-outlist",
            "Bottom/Top",
            "Push/Pop",
            "Front/Rear",
            "Overflow/Underflow",
            "Array",
            "Matrix",
            "Multi-dimensionalarray",
            "Rowmajororder/Columnmajororder",
            "Triangularmatrix",
            "Symmetricmatrix",
            "Sparsematrix",
            "Transposedmatrix",
            "Linkedlist",
            "Linearlinkedlist",
            "Singlelinkedlist",
            "Multilinkedlist",
            "Circularlinkedlist",
            "Doublylinkedlist",
            "Orthogonallist",
            "Generalizedlist",
            "Pointerfield",
            "Headnode",
            "Headpointer/Tailpointer",
            "Blankstring",
            "Substring",
            "Tree",
            "Subtree",
            "Forest",
            "Root",
            "Leaf",
            "Depth",
            "Parents/Children/Brother/Ancestor/Descendant",
            "Binarytree",
            "Balancedbinarytree",
            "Fullbinarytree",
            "Completebinarytree",
            "Traversingbinarytree",
            "Binarysorttree",
            "Binarysearchtree",
            "Threadedbinarytree",
            "Huffmantree",
            "Orderedtree/Unorderedtree",
            "Decisiontree",
            "Digitalsearchtree",
            "Traversaloftree",
            "Preordertraversal",
            "Inordertraversal",
            "Postordertraversal",
            "Subgraph",
            "Digraph(directedgraph)/Undigraph(undirectedgraph)",
            "Completegraph",
            "Connectedgraph",
            "Unconnectedgraph",
            "Stronglyconnectedgraph",
            "Weaklyconnectedgraph",
            "Directedacyclicgraph",
            "Biconnectedgraph",
            "Bipartitegraph",
            "Edge",
            "Vertex",
            "Articulationpoint",
            "Initialnode",
            "Terminalnode",
            "Adjacentedge",
            "Adjacentvertex",
            "Incidentedge",
            "In-degree/Out-degree",
            "Orderedpair/Unorderedpair",
            "Simplepath",
            "Simplecycle",
            "Connectedcomponent",
            "Adjacencymatrix",
            "Adjacencylist",
            "Adjacencymulti-list",
            "Traversinggraph",
            "Spanningtree",
            "Topologicalsort",
            "Partialorder",
            "ActivityOnVertexnetwork",
            "ActivityOnEdgenetwork",
            "Criticalpath",
            "Linearsearch(Sequentialsearch)",
            "Binarysearch",
            "Blocksearch",
            "Hashsearch",
            "Averagesearchlength",
            "Hashtable",
            "Hashfunction",
            "Immediatelyallocatingmethod",
            "Digitalanalysismethod",
            "Mid-squaremethod",
            "Randomnumbermethod",
            "Internalsort",
            "Externalsort",
            "Selectionsort",
            "Radixsort",
            "Balancemergingsort",
            "Balancetwo-waymergingsort",
            "Ployphasemergingsort",
            "Replacementselectionsort",
            "Indexedfile",
            "Indexedsequentialfile",
            "Indexednon-sequentialfile",
            "Multi-listfile",
            "Invertedfile",
            "Port",
            "Server",
            "Client",
            "SAP(ServiceAccessPoint)",
            "OSI(OpenSystemInterconnection)",
            "Physicallayer",
            "Datalinklayer",
            "Networklayer",
            "Transportlayer",
            "Sessionlayer",
            "Presentationlayer",
            "Applicationlayer",
            "TCP/IPprotocol",
            "Channelcapacity",
            "Shannon",
            "Nyquist",
            "UTP(UnshieldedTwistedPaired)",
            "Coaxialcable",
            "Opticalfiber",
            "NRZ(NonReturntoZero)",
            "Manchestercoding",
            "Modulation",
            "PCM(PulseCodeModulation)",
            "DM(DeltaModulation)",
            "Synchronoustransmission/ATM(Asynchronoustransmission)",
            "CRC(CyclicRedundancyCheck)",
            "Flowcontrol",
            "Slidingwindow",
            "Errorcontrol",
            "Framestructure",
            "Reuse",
            "ADSL(Asymmetricdigitalsubscriberline)",
            "Circuitswitchingandpacketswitching",
            "Frequencydivisionmultiplexing",
            "Signaling",
            "Datagram",
            "Virtualcircuit",
            "Framerelay",
            "Ceil",
            "Congestion",
            "Backpressure",
            "Tokenbucket",
            "Ring/bus/treeandstarstructure",
            "LAN(localareanetwork)",
            "Hub",
            "Switch",
            "Router",
            "Networkbridge",
            "Ethernetlisteneralgorithm",
            "Subnetmask",
            "Three-wayhandshake",
            "APP(Addressresolutionprotocol)",
            "Thinclient",
            "ICMP(InternetControlMessageProtocol)",
            "IGMP(InternetGroupManagementProtocol)",
            "Denialofservice",
            "Bordergateway",
            "DNS(DomainNameSystem)",
            "DLC(DataLinkControl)",
            "POP(PostOfficeProtocol)",
            "Remotecontrol",
            "SMTP(SimpleMailTransportProtocol");
}