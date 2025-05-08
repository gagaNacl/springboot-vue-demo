<template>
  <el-container class="layout-container">
    <el-header height="60px">
      <header-section />
    </el-header>

    <el-main>
      <router-view />
    </el-main>

    <el-footer height="60px">
      <footer-section />
    </el-footer>
  </el-container>
</template>

<script setup>
import HeaderSection from './HeaderSection.vue'
import FooterSection from './FooterSection.vue'
</script>

<style scoped>
.layout-container {
  min-height: 100vh;
}

.el-header {
  background-color: #fff;
  border-bottom: 1px solid #e6e6e6;
  position: fixed;
  width: 100%;
  top: 0;
  z-index: 999;
}

.el-main {
  padding-top: 60px;
  background-color: #f5f7fa;
}

.el-footer {
  background-color: #fff;
  border-top: 1px solid #e6e6e6;
}
</style>
