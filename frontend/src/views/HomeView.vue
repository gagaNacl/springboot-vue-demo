<template>
  <div class="home-container">
    <!-- 页眉：网站 Logo 和登录/注册按钮 -->
    <header class="home-header">
      <!-- Logo 区域，展示网站标题或图标 -->
      <div class="logo">🌟 欢迎来到我的网站</div>
      <!-- 登录/注册 按钮区域 -->
      <div class="auth-buttons">
        <!-- Element Plus 主色按钮，点击跳转到登录页面 -->
        <el-button type="primary" @click="goToLogin">登录</el-button>
        <!-- Element Plus 成功色按钮，点击跳转到注册页面 -->
        <el-button type="success" @click="goToRegister">注册</el-button>
      </div>
    </header>

    <!-- 主体内容：欢迎信息 -->
    <main class="home-main">
      <!-- 一级标题，欢迎用户 -->
      <h1>你好！欢迎使用我们的系统</h1>
      <!-- 简短说明，提示项目技术栈 -->
      <p>这是一个基于 Vue3 + SpringBoot 的全栈练手模板。</p>
    </main>
  </div>
</template>

<script setup>
// 引入 Vue Router 的 useRouter，用于页面导航
import { useRouter } from 'vue-router'

// 按需引入 Element Plus 按钮组件
import { ElButton } from 'element-plus'

// 获取路由实例，以便调用路由跳转方法
const router = useRouter()

/**
 * 跳转到登录页面
 */
const goToLogin = () => {
  // 使用 router.push 进行路由导航
  router.push('/login')
}

/**
 * 跳转到注册页面
 */
const goToRegister = () => {
  // 使用 router.push 进行路由导航
  router.push('/register')
}
</script>

<style scoped>
/* 整体容器：垂直 Flex 布局，撑满视口高度 */
.home-container {
  display: flex;
  flex-direction: column;
  min-height: 100vh;
}

/* 页眉样式：水平 Flex，左右两端对齐，垂直居中 */
.home-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 1rem 2rem;
  background-color: #409eff; /* Element Plus 默认蓝色 */
  color: #fff;              /* 白色文字 */
}

/* Logo 样式：字体加大加粗 */
.logo {
  font-size: 1.5rem;
  font-weight: bold;
}

/* 按钮组：按钮之间添加左侧间距 */
.auth-buttons > * {
  margin-left: 10px;
}

/* 主体内容样式：占满剩余空间，居中显示 */
.home-main {
  flex: 1;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  font-size: 1.2rem;
  padding: 2rem;
}
</style>
