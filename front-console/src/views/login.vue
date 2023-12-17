<template>
    <div class="container">
      <div class="box">
        <div class="register" @click="toRegister">注册</div>
      </div>
      <h1 class="title">欢迎登录</h1>
      <div class="input-group">
        <label for="username">用户名：</label>
        <input type="text" v-model="loginForm.userName" />
      </div>
      <div class="input-group">
        <label for="password">密码：</label>
        <input type="password" v-model="loginForm.userPassword" />
      </div>
      <span>
      <button type="submit" @click="login">登录</button>
      <button type="reset" @click="resetForm">重置</button>
      </span>
    </div>
  </template>

  <script setup>
    import axios from "axios";
    import { reactive } from "vue";
    import router from '../router/router';
    //声明表单字段
    const loginForm = reactive({
      userName: "",
      userPassword: "",
    })
    //登录提交
    function login() {
      axios.post("/user/login", loginForm).then((res) => {
        if (res.data.code === 200) {
          alert("登录成功！");
          localStorage.setItem("token", "This is a token");
          // 跳转到首页
          router.push("/student");
        } else {
          alert("登录失败！");
        }
      }).catch((err) => {
        alert("登录出错！");
      });
    }
    function resetForm() {
      loginForm.userName = "";
      loginForm.userPassword = "";
    }
    function toRegister() {
      router.push("/register");
    }
  </script>
  
  <style scoped>
  .container {
    display: flex;
    margin: 100px auto;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    height: 500px;
    width: 600px;
    background-color: #FAFAFA;
  }
  .box{
    width: 100%;
    height: 50px;
    line-height: 50px;
    display: flex;
    justify-content: right;
    align-items: center;
    border-bottom-width: 3px;
    border-bottom-style: double;
    border-bottom-color: rgb(7, 7, 7);
  }
  .register{
    height: 40px;
    width: 100px;
    text-align: center;
    font-size: 20px;
    font-weight: bold;
    border-radius: 30px;
    font-family: 'Courier New', Courier, monospace;
  }
  .register:hover{
    background-color: #ccd6e1;
  }

  .title {
    font-size: 2rem;
    color: #333;
    margin-bottom: 2rem;
  }
  span {
    width: 200px;
    display: flex;
    justify-content: space-between;
  }
  
  .input-group {
    display: flex;
    flex-direction: column;
    margin-bottom: 1rem;
  }
  
  .input-group label {
    margin-bottom: 0.5rem;
  }
  
  .input-group input {
    padding: 0.5rem;
    font-size: 1rem;
  }
  
  button {
    margin: auto;
    padding: 0.5rem 1rem;
    font-size: 1rem;
    cursor: pointer;
  }
  </style>