<template>
  <div class="header-container">
    <div class="logo">
      <router-link to="/">
        <h1>管理系统</h1>
      </router-link>
    </div>

    <el-menu mode="horizontal" :ellipsis="false" class="main-menu">
      <el-menu-item index="1">首页</el-menu-item>
      <el-menu-item index="2">信息管理</el-menu-item>
      <el-menu-item index="3">数据展示</el-menu-item>
      <el-menu-item index="4">系统设置</el-menu-item>
    </el-menu>

    <div class="user-info">
      <el-dropdown>
        <span class="user-dropdown">
          <el-avatar :size="32" />
          <span>用户名</span>
        </span>
        <template #dropdown>
          <el-dropdown-menu>
            <el-dropdown-item>个人信息</el-dropdown-item>
            <el-dropdown-item>修改密码</el-dropdown-item>
            <el-dropdown-item divided>退出登录</el-dropdown-item>
          </el-dropdown-menu>
        </template>
      </el-dropdown>
    </div>
  </div>
</template>

<script setup>
// 后续可以添加用户状态管理和路由导航逻辑
</script>

<style scoped>
.header-container {
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 0 20px;
}

.logo {
  width: 200px;
}

.logo a {
  text-decoration: none;
  color: #303133;
}

.logo h1 {
  margin: 0;
  font-size: 20px;
}

.main-menu {
  flex: 1;
  justify-content: center;
  border-bottom: none;
}

.user-info {
  display: flex;
  align-items: center;
}

.user-dropdown {
  display: flex;
  align-items: center;
  cursor: pointer;
  padding: 0 8px;
}

.user-dropdown span {
  margin-left: 8px;
}
</style>
