# fullstack-springboot-vue

本项目是一个基于 **Spring Boot 3.x**（Java 17+）和 **Vue 3** 的前后端分离全栈练手仓库，采用 RESTful API 设计，仅作个人练习与二次开发参考。

## 核心特点

- 🔐 **用户认证**：集成 Spring Security，实现登录、注册与权限控制  
- 📦 **后端**：  
  - Spring Boot 3.x + Java 17+  
  - Spring Security、JPA/Hibernate 与 MySQL  
  - 清晰的模块化结构与高性能 RESTful 接口  
- 🎨 **前端**：  
  - Vue 3 Composition API  
  - Pinia 状态管理  
  - Vite 构建工具  
  - Element Plus UI 组件  
- ⚙️ **项目结构**：前后端各自独立目录，代码易读、易维护  
- 📚 **学习&扩展**：适合作为全栈入门模板，方便二次开发与功能扩展

---

## 快速上手

```bash
# 克隆仓库
git clone https://github.com/你的用户名/fullstack-springboot-vue.git
cd fullstack-springboot-vue

# 启动后端（假设已配置好 MySQL）
cd backend
./mvnw spring-boot:run

# 启动前端
cd ../frontend
npm install
npm run dev
