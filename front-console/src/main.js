import { createApp } from 'vue'
import App from './App.vue'
import router from './router/router.js'

import axios from 'axios'
axios.defaults.baseURL = 'http://localhost:8080/';

let app = createApp(App)
app.use(router);
app.mount('#app');
