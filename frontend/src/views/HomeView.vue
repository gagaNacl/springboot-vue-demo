<template>
  <div class="home-container">
    <header class="home-header">
      <div class="logo">🌟 欢迎来到我的网站</div>
      <div class="auth-buttons">
        <el-button type="primary" @click="goToLogin">登录</el-button>
        <el-button type="success" @click="goToRegister">注册</el-button>
      </div>
    </header>

    <main class="home-main">
      <h1>你好！欢迎使用我们的系统</h1>
      <p>这是一个基于 Vue3 + SpringBoot 的全栈练手模板。</p>
    </main>
  </div>
</template>

<script setup>
import { useRouter } from 'vue-router'
import { ElButton } from 'element-plus'

const router = useRouter()

const goToLogin = () => {
  router.push('/login')
}

const goToRegister = () => {
  router.push('/register')
}
</script>

<style scoped>
.home-container {
  display: flex;
  flex-direction: column;
  min-height: 100vh;
}

.home-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 1rem 2rem;
  background-color: #409eff;
  color: #fff;
}

.logo {
  font-size: 1.5rem;
  font-weight: bold;
}

.auth-buttons > * {
  margin-left: 10px;
}

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
