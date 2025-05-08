<template>
  <div class="info-container">
    <el-result icon="info" title="信息管理" sub-title="该模块正在开发中...">
      <template #extra>
        <el-button type="primary" @click="$router.push('/')">返回首页</el-button>
      </template>
    </el-result>
  </div>
</template>

<style scoped>
.info-container {
  padding: 40px;
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 400px;
}
</style>
