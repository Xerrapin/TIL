import VueRouter from "vue-router";
import List from '../components/List.vue'
import Home from '../components/Home.vue'
import Vue from 'vue'
Vue.use(VueRouter)
const routes = [{
        path: "/list",
        component: List
    },
    {
        path: "/",
        component: Home
    },
];
const router = new VueRouter({routes: routes, mode: 'history'});
export default router;