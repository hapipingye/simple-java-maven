# simple-java-maven-app

> 软件工程课程 CI/CD 实验项目 — Jenkins 官方教程入门示例

## 项目简介

一个用于学习 CI/CD 流程的极简 Java + Maven 项目。包含：

- `App.java`：Hello World 主类
- `AppTest.java`：JUnit Jupiter 单元测试
- `pom.xml`：Maven 项目管理（编译/测试/打包/代码风格检查）
- `.github/workflows/ci.yml`：GitHub Actions 持续集成流水线

## 项目结构

```
simple-java-maven-app/
├── .github/
│   └── workflows/
│       └── ci.yml              # GitHub Actions CI/CD 配置（核心文件）
├── src/
│   ├── main/java/com/mycompany/app/
│   │   └── App.java            # 应用主类 — Hello World
│   └── test/java/com/mycompany/app/
│       └── AppTest.java        # JUnit Jupiter 单元测试
├── pom.xml                     # Maven 项目配置（坐标、依赖、插件）
├── checkstyle.xml              # Checkstyle 代码风格规则
├── .gitignore
└── README.md
```

## 前置条件

| 工具 | 最低版本 | 用途 |
|------|---------|------|
| **Java JDK** | 21+ | 编译运行 |
| **Apache Maven** | 3.9.9+ | 项目构建管理 |
| **Git** | 2.40+ | 版本控制 |

## 本地运行

```bash
# 1. 克隆项目
git clone <your-repo-url>
cd simple-java-maven-app

# 2. 代码风格检查
mvn checkstyle:check

# 3. 编译 + 测试
mvn verify

# 4. 打包可执行 JAR
mvn package -DskipTests

# 5. 运行 JAR
java -jar target/simple-java-maven-app-1.0-SNAPSHOT.jar
```

## CI/CD 流水线

```
git push → main
    │
    ├── checkstyle         代码风格检查
    │
    ├── build-and-test     JDK 21 | 22 | 23 矩阵编译 + 测试
    │
    ├── package            打包可执行 JAR
    │
    └── notify             汇总通知
```

每次 `git push` 到 `main` 分支或发起 Pull Request 时自动触发。

## 实验任务

1. **Fork 本项目** 到自己的 GitHub 账号
2. **观察** Actions 页面的流水线执行过程
3. **故意破坏** `App.java` 中的方法，触发 CI 失败
4. **修复** 错误并重新推送，看到流水线变绿
5. **为 `add` 方法编写 JUnit 测试**（任务 3 中的 TODO）

## 参考资料

- [Jenkins 官方教程 - simple-java-maven-app](https://github.com/jenkins-docs/simple-java-maven-app)
- [GitHub Actions 文档](https://docs.github.com/en/actions)
- [Maven Getting Started Guide](https://maven.apache.org/guides/getting-started/)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
