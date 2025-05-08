<template>
  <div class="footer-container">
    <div class="footer-content">
      <div class="copyright">© {{ currentYear }} 管理系统 All Rights Reserved.</div>
      <div class="links">
        <el-link type="primary" href="#" class="link-item">关于我们</el-link>
        <el-divider direction="vertical" />
        <el-link type="primary" href="#" class="link-item">使用帮助</el-link>
        <el-divider direction="vertical" />
        <el-link type="primary" href="#" class="link-item">联系我们</el-link>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'

const currentYear = ref(new Date().getFullYear())
</script>

<style scoped>
.footer-container {
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
}

.footer-content {
  text-align: center;
}

.copyright {
  color: #606266;
  font-size: 14px;
  margin-bottom: 8px;
}

.links {
  display: flex;
  align-items: center;
  justify-content: center;
}

.link-item {
  font-size: 14px;
}

.el-divider {
  margin: 0 16px;
}
</style>
