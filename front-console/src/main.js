import { createApp } from 'vue'
import App from './App.vue'
import router from './router/router.js'

import Layui from '@layui/layui-vue'
import '@layui/layui-vue/lib/index.css'

let app = createApp(App)
app.use(router);
app.use(Layui);
app.mount('#app');
