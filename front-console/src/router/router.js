import {createRouter, createWebHashHistory} from 'vue-router'

const router = createRouter({
    // 配置路由和组件之间的映射关系
    history: createWebHashHistory(),
    routes: [
        {
            path: '/',
            component: () => import('../components/HomeUi.vue'),
            index: true
        },
        {
            path: '/login',
            name: 'login',
            component: () => import('../views/login.vue')
        }
    ]
})


export default router;
