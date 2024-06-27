import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/info-data',
      name: 'info-data',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/InfoData.vue')
    },
         {
            path: "/training-descriptions",
            alias: "/training-descriptions",
            name: "training-descriptions",
            component: () => import("../views/TrainingDescriptionList.vue")
          },
          {
            path: "/training-descriptions/:id",
            name: "training-description-details",
            component: () => import("../views/TrainingDescription.vue")
          },
          {
            path: "/add-training-description",
            name: "add training description",
            component: () => import("../views/AddTrainingDescription.vue")
          }
  ]
})

export default router
