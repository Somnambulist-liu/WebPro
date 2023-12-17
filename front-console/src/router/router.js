import {createRouter, createWebHashHistory} from 'vue-router'

const router = createRouter({
    // 配置路由和组件之间的映射关系
    history: createWebHashHistory(),
    routes: [
        {

            path: '/',
            redirect: '/index',
            component: () => import('../components/HomeUi.vue'),
            name: 'home',
            meta: {
                title: '学生信息'
            },
            children:[
                {   
                    path: '/index',
                    component: () => import('../components/Index.vue'),
                    name: 'index',
                    meta: {
                        title: '首页'
                    }
                },
                {
                    path: '/student',
                    component: () => import('../components/StudentList.vue'),
                    name: 'student',
                    meta: {
                        title: '学生信息'
                    }
                },
                {
                    path: '/add',
                    component: () => import('../components/AddInfo.vue'),
                    name: 'addinfo',
                    meta: {
                        title: '添加信息'
                    }
                }
            ] 

        },
        {   
            path: '/login',
            component: () => import('../views/Login.vue'),
            name: 'login',
            meta: {
                title: '登录'
            }
        },
        {
            path: '/register',
            component: () => import('../views/Register.vue'),
            name:'register',
            meta: {
                title: '注册'
            }
        }
    ]
})

router.beforeEach((to, from, next) => {
    // 如果用户已经登录，直接跳转到目标页面
    if (localStorage.getItem('token')) {
      next()
    } else {
      // 如果用户未登录，并且试图访问需要登录的页面，则重定向到登录页面
      if (to.name === 'register' || to.name === 'login') {
        next()
      } else{
        next({ name: 'login' })
      }
    }
  })


export default router;
