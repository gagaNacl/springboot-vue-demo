<template>
  <div class="login-container">
    <el-card class="login-card">
      <h2 class="login-title">用户登录</h2>

      <el-form :model="loginForm" :rules="rules" ref="loginFormRef" label-width="80px">
        <el-form-item label="用户名" prop="username">
          <el-input v-model="loginForm.username" placeholder="请输入用户名" />
        </el-form-item>

        <el-form-item label="密码" prop="password">
          <el-input v-model="loginForm.password" placeholder="请输入密码" type="password" show-password />
        </el-form-item>

        <el-form-item>
          <el-button type="primary" @click="onSubmit" style="width: 100%">登录</el-button>
        </el-form-item>
      </el-form>
    </el-card>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import { ElMessage } from 'element-plus'

const router = useRouter()

// 表单数据
const loginForm = ref({
  username: '',
  password: ''
})

// 表单引用
const loginFormRef = ref()

// 校验规则
const rules = {
  username: [{ required: true, message: '请输入用户名', trigger: 'blur' }],
  password: [{ required: true, message: '请输入密码', trigger: 'blur' }]
}

// 点击登录
const onSubmit = () => {
  loginFormRef.value.validate((valid) => {
    if (valid) {
      // 模拟登录成功
      console.log('登录信息', loginForm.value)
      ElMessage.success('登录成功！')
      router.push('/')  // 登录成功跳回首页
    } else {
      console.log('验证失败')
      return false
    }
  })
}
</script>

<style scoped>
.login-container {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
  background: #f0f2f5;
}

.login-card {
  width: 400px;
  padding: 20px;
}

.login-title {
  text-align: center;
  margin-bottom: 20px;
}
</style>
