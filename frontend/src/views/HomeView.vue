<template>
  <div class="home-container">
    <!-- 轮播展示区 -->
    <div class="carousel-section">
      <el-carousel height="400px">
        <el-carousel-item v-for="item in 4" :key="item">
          <div class="carousel-content">
            <h3>公告{{ item }}</h3>
          </div>
        </el-carousel-item>
      </el-carousel>
    </div>

    <!-- 功能模块区 -->
    <div class="modules-section">
      <el-row :gutter="20">
        <el-col :span="8" v-for="module in modules" :key="module.title">
          <el-card class="module-card" shadow="hover">
            <template #header>
              <div class="module-header">
                <el-icon :size="24">
                  <component :is="module.icon" />
                </el-icon>
                <span>{{ module.title }}</span>
              </div>
            </template>
            <div class="module-content">
              <p>{{ module.description }}</p>
              <el-button type="primary" @click="navigateToModule(module.route)">
                进入模块
              </el-button>
            </div>
          </el-card>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'

const router = useRouter()

const modules = ref([
  {
    title: '信息管理',
    description: '管理个人信息、用户信息和系统配置',
    icon: 'User',
    route: '/info',
  },
  {
    title: '数据展示',
    description: '查看各类数据统计和可视化图表',
    icon: 'DataLine',
    route: '/data',
  },
  {
    title: '系统功能',
    description: '访问系统核心功能和工具',
    icon: 'Setting',
    route: '/system',
  },
])

const navigateToModule = (route) => {
  router.push(route)
}
</script>

<style scoped>
.home-container {
  padding: 20px;
}

.carousel-section {
  margin-bottom: 40px;
}

.carousel-content {
  height: 100%;
  background-color: #409eff;
  display: flex;
  justify-content: center;
  align-items: center;
  color: #fff;
}

.carousel-content h3 {
  font-size: 24px;
  margin: 0;
}

.modules-section {
  margin-bottom: 40px;
}

.module-card {
  height: 100%;
  margin-bottom: 20px;
}

.module-header {
  display: flex;
  align-items: center;
  gap: 8px;
  font-size: 18px;
  font-weight: bold;
}

.module-content {
  text-align: center;
}

.module-content p {
  margin: 16px 0;
  color: #606266;
}
</style>
