<template>
    <div class="login-container">
      <el-card class="login-card">
        <h2 class="login-title">登录</h2>
        
        <!-- 登录表单 -->
        <el-form :model="loginForm" status-icon ref="loginForm" label-width="100px">
          <el-form-item label="用户名" :rules="[{ required: true, message: '请输入用户名', trigger: 'blur' }]">
            <el-input v-model="loginForm.username" placeholder="请输入用户名" />
          </el-form-item>
  
          <el-form-item label="密码" :rules="[{ required: true, message: '请输入密码', trigger: 'blur' }]">
            <el-input
              type="password"
              v-model="loginForm.password"
              placeholder="请输入密码"
            />
          </el-form-item>
  
          <el-form-item>
            <el-button type="primary" @click="handleLogin">登录</el-button>
          </el-form-item>
        </el-form>
      </el-card>
    </div>
  </template>
  
  <script>
  import { ElForm, ElFormItem, ElInput, ElButton, ElCard } from 'element-plus';
  
  export default {
    name: 'LoginPage',
    components: {
      ElForm,
      ElFormItem,
      ElInput,
      ElButton,
      ElCard,
    },
    data() {
      return {
        loginForm: {
          username: '',
          password: '',
        },
      };
    },
    methods: {
      // 登录处理方法
      handleLogin() {
        const { username, password } = this.loginForm;
  
        if (username === 'admin' && password === '123456') {
          this.$router.push({ name: 'Home' }); // 登录成功，跳转到首页
        } else {
          this.$message.error('用户名或密码错误'); // 显示错误消息
        }
      },
    },
  };
  </script>
  
  <style scoped>
  .login-container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    background-color: #f4f6f9;
  }
  
  .login-card {
    width: 400px;
    padding: 20px;
  }
  
  .login-title {
    text-align: center;
    margin-bottom: 30px;
  }
  </style>
  