import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import MembersView from '@/views/MembersView.vue'
import MemberTypeView from '@/views/MemberTypeView.vue'
import AttendanceView from '@/views/AttendanceView.vue'
import ExerciseView from '@/views/ExerciseView.vue'
import AccountView from '@/views/AccountView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },
  {
    path: '/members',
    // name: 'members',
    component: MembersView
  },
  {
    path : '/member-type',
    name : 'member type',
    component : MemberTypeView
  },
  {
    path : '/attendance',
    name : 'attendance', 
    component : AttendanceView
  },
  {
    path : '/exercise',
    name : 'exercise',
    component : ExerciseView
  },
  {
    path : '/account',
    name : 'account', 
    component : AccountView
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
