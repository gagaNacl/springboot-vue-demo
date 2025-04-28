import { createRouter, createWebHistory } from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'home',
    component: () => import('@/views/HomeView.vue') // 你要有一个 Home.vue
  },
  {
    path: '/login',
    name: 'login',
    component: () => import('@/views/LoginView.vue') // 登陆页面
  },
  {
    path: '/register',
    name: 'register',
    component: () => import('@/views/RegisterView.vue') // 注册页面
  }
]

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes
})

export default router
