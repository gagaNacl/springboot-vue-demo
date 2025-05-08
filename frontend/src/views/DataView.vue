<template>
  <div class="data-container">
    <el-result icon="data-line" title="数据展示" sub-title="该模块正在开发中...">
      <template #extra>
        <el-button type="primary" @click="$router.push('/')">返回首页</el-button>
      </template>
    </el-result>
  </div>
</template>

<style scoped>
.data-container {
  padding: 40px;
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 400px;
}
</style>
