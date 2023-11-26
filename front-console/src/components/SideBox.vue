<template>
    <lay-menu class="sidestyle" :selected-key="selectedKey" @change-selected-Key="changeSelectedKey" @change-open-keys="changeOpenKeys" v-model:openKeys="openKeys2" :tree="true">
      <div class="title">
        宿舍管理系统
      </div>
      <lay-menu-item id="1">用户管理</lay-menu-item>
      <lay-menu-item id="2">楼宇管理</lay-menu-item>
      <lay-menu-item id="3">房间管理</lay-menu-item>
      <lay-menu-item id="4">宿舍分配</lay-menu-item> 
      <lay-menu-item id="5">调换审核</lay-menu-item>  
    </lay-menu>
</template>

<script setup>
import { ref } from 'vue'

const openKeys2 = ref(["7"])
const selectedKey = ref("5")
const changeSelectedKey = (val) => {
  selectedKey.value = val;
}

const changeOpenKeys = (val) => {
  openKeys2.value = val;
}
</script>

<style scoped>
.sidebox{
  width: 100%;
  height: 100%;
  font-size: 14px;
  padding: 10px;
}
.sidestyle {
  /* background-color: #001529; */
  background-color: #001529;
  color: #fff;
  font-size: 14px;
  height: 100%;
  width: 100%;
  padding: 10px;
   
}

.title {
  background-color:#001529;
  height: 50px;
  font-size: 20px;
  font-style: italic;
  font-weight: 400;
  text-align: center;
  color: #fff;
}
</style>
