import { createWebHistory, createRouter } from "vue-router";

const routes =  [
  {
    path: "/",
    alias: "/training-descriptions",
    name: "training-descriptions",
    component: () => import("./components/TrainingDescriptionList")
  },
  {
    path: "/training-descriptions/:id",
    name: "training-description-details",
    component: () => import("./components/TrainingDescription")
  },
  {
    path: "/add",
    name: "add",
    component: () => import("./components/AddTrainingDescription")
  }
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;