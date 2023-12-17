<template>
    <div class="register">
      <div class="box">
        <div class="login" @click="toLogin">登录</div>
      </div>
      <h1 class="title">欢迎注册</h1>
      <div class="input-group">
        <label for="username">用户名：</label>
        <input type="text" v-model="user.userName" />
      </div>
      <div class="input-group">
        <label for="password">密码：</label>
        <input type="password" v-model="user.userPassword" />
      </div>
      <div class="input-group">
        <label for="confirmPassword">确认密码：</label>
        <input type="password" v-model="user.confirmPassword" />
      </div>
      <span>
        <button type="submit" @click="submitForm(user)">注册</button>
        <button type="reset" @click="resetForm">重置</button>
      </span>
    </div>
  </template>
  
  <script setup>
    import axios from "axios";
    import {reactive} from "vue";
    import router from '../router/router';
    const user = reactive({
      userName: "",
      userPassword: "",
      confirmPassword: "",
    })
    function submitForm(user) {
        if (user.userPassword !== user.confirmPassword) {
          alert("两次输入的密码不一致，请重新输入！");
          return;
        }
        // 在这里处理注册逻辑，例如发送请求到后端API进行注册
        console.log("注册信息：", user.userName, user.userPassword);
        axios.post("/user/register", {userName:user.userName, userPassword:user.userPassword}).then((res) => {
          console.log(res);
          if(res.status === 200)
          alert("注册成功！");
          router.push("/login")
        });
      }

    function resetForm() {
      user.userName = "";
      user.userPassword = "";
      user.confirmPassword = "";
    
    }
    function toLogin(){
      router.push("/login");
    }
  
  </script>
  
  <style scoped>
  .register {
    display: flex;
    margin: 100px auto;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    height: 500px;
    width: 600px;
    background-color: #FAFAFA;
  }
  .title {
    font-size: 2rem;
    color: #333;
    margin-bottom: 2rem;
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
  .login{
    height: 40px;
    width: 100px;
    text-align: center;
    font-size: 20px;
    font-weight: bold;
    border-radius: 30px;
    font-family: 'Courier New', Courier, monospace;
  }
  .login:hover{
    background-color: #ccd6e1;
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