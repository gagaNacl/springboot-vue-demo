# fullstack-springboot-vue

## 项目简介

本项目是一个基于 **Spring Boot 3.x**（Java 17+）和 **Vue 3**（Composition API）的前后端分离全栈练手项目，采用 RESTful API 设计，实现了用户认证、数据增删改查等基础功能。  
后端整合 Spring Security、JPA/Hibernate 和 MySQL，提供高性能接口服务；前端基于 Vue 3、Pinia、Vite 和 Element Plus 构建响应式用户界面。  

## 核心特点

- 🔐 用户认证：登录、注册、权限控制  
- 📦 后端技术：Spring Boot 3.x、Spring Security、Spring Data JPA、MySQL  
- 🎨 前端技术：Vue 3 Composition API、Pinia、Vite、Element Plus  
- ⚙️ RESTful 设计：统一接口规范与错误处理  
- 📚 模块化：清晰的项目结构，适合二次开发和功能扩展  

## 项目结构

```
fullstack-springboot-vue/
├── backend/            # 后端服务
│   ├── src/main/java/com/yourapp/
│   │   ├── common/
│   │   ├── config/
│   │   ├── controller/
│   │   ├── dto/
│   │   ├── entity/
│   │   ├── exception/
│   │   ├── repository/
│   │   ├── security/
│   │   ├── service/
│   │   └── utils/
│   ├── pom.xml
│   └── ...
├── frontend/           # 前端应用
│   ├── src/
│   │   ├── api/
│   │   ├── assets/
│   │   ├── components/
│   │   ├── layouts/
│   │   ├── router/
│   │   ├── stores/
│   │   ├── utils/
│   │   └── views/
│   ├── package.json
│   └── ...
├── docs/               # 项目文档
│   └── 开发规范.md
└── README.md
```

## 环境与依赖

### 后端
- JDK 17+
- Maven 3.6+
- MySQL 5.7+

### 前端
- Node.js v22.14.0
- npm 11.2.0

## 快速启动

### 后端启动

```bash
cd backend
./mvnw clean spring-boot:run
```

- 默认使用 `application-dev.yml`，请修改 `src/main/resources` 下的 MySQL 连接配置。

### 前端启动

```bash
cd frontend
npm install
npm run dev
```

- 默认访问 `http://localhost:3000`。

## 常用脚本

- 后端  
  - `./mvnw clean` 清理项目  
  - `./mvnw package` 打包 Jar  

- 前端  
  - `npm run build` 构建生产包  
  - `npm run lint` 代码检查  

## 开发规范

详细开发规范请参考 [docs/开发规范.md](docs/开发规范.md)。

## 贡献

欢迎 Fork、Star 或提交 PR，一起完善项目！

## 许可

本项目遵循 MIT 许可证，详情见 [LICENSE](LICENSE)。
