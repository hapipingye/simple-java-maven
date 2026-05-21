package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * App 类的 JUnit Jupiter 单元测试
 *
 * <p>验证 {@link App} 的构造器行为和核心方法逻辑。
 *
 * <h3>测试覆盖</h3>
 * <ul>
 *   <li>无参构造器 → getMessage 应返回 "Hello World!"</li>
 *   <li>带参构造器 → getMessage 应返回自定义消息</li>
 *   <li>add 方法 → 正常返回两数之和</li>
 * </ul>
 */
public class AppTest {

    /**
     * 测试 1：无参构造器创建的对象，getMessage 应返回默认问候语
     */
    @Test
    @DisplayName("无参构造器应返回默认消息 \"Hello World!\"")
    public void testAppHasAGreeting() {
        App app = new App();
        assertNotNull(app, "App 实例不应为 null");
        assertEquals("Hello World!", app.getMessage(),
                "默认消息应为 \"Hello World!\"");
    }

    /**
     * 测试 2：带参构造器应正确保存并使用自定义消息
     */
    @Test
    @DisplayName("带参构造器应返回自定义消息")
    public void testAppWithCustomMessage() {
        String customMessage = "CI/CD is awesome!";
        App app = new App(customMessage);
        assertEquals(customMessage, app.getMessage(),
                "自定义消息应与传入参数一致");
    }

    /**
     * 测试 3：add 方法应正确计算两数之和
     *
     * <p><b>学生任务</b>：这是一个故意添加的失败用例，请你修复 App 中的 bug 使其通过。
     * 提示：检查 {@link App#add(int, int)} 的实现是否正确。
     */
    @Test
    @DisplayName("add 方法应正确计算两数之和")
    public void testAdd() {
        App app = new App();
        assertEquals(7, app.add(3, 4), "3 + 4 应等于 7");
    }
}
