package com.mycompany.app;

/**
 * simple-java-maven-app 应用主类 — Hello World
 *
 * <p>本项目改编自 Jenkins 官方教程示例，用于软件工程课程 CI/CD 实验。
 *
 * <h3>学习要点</h3>
 * <ul>
 *   <li>常规 Java 应用结构（Maven 标准目录布局）</li>
 *   <li>编写可被 JUnit 测试的纯逻辑方法</li>
 *   <li>通过 CI 流水线自动编译、测试、打包</li>
 * </ul>
 *
 * @author CI/CD 实验学生
 * @version 1.0
 */
public class App {

    /** 默认问候语 */
    private static final String DEFAULT_MESSAGE = "Hello World!";

    /** 当前实例的问候语 */
    private final String message;

    /**
     * 无参构造器：使用默认问候语
     */
    public App() {
        this.message = DEFAULT_MESSAGE;
    }

    /**
     * 带参构造器：自定义问候语
     *
     * @param message 自定义消息
     */
    public App(String message) {
        this.message = message;
    }

    /**
     * 程序入口 — 打印问候语到标准输出
     *
     * @param args 命令行参数（本实验不使用）
     */
    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    /**
     * 获取当前实例的问候语
     *
     * @return 问候语字符串
     */
    public String getMessage() {
        return message;
    }

    /**
     * 扩展练习：加法方法（供学生编写额外测试）
     *
     * <p><b>TODO</b>：请你在 Task 3 中为此方法编写 JUnit 测试。
     *
     * @param a 加数
     * @param b 加数
     * @return 两数之和
     */
    public int add(int a, int b) {
        return a + b;
    }
}
