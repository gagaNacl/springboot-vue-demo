import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView,
    },
    {
      path: '/info',
      name: 'info',
      component: () => import('../views/InfoView.vue'),
    },
    {
      path: '/data',
      name: 'data',
      component: () => import('../views/DataView.vue'),
    },
    {
      path: '/system',
      name: 'system',
      component: () => import('../views/SystemView.vue'),
    },
  ],
})

export default router
