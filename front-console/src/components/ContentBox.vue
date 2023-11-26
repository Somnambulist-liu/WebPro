<template>
  <div class="table">
    <lay-menu v-model:selected-key="selectedKey" v-model:open-keys="openKeys1">
      <lay-sub-menu>
          <template #title>
            admin
          </template>
          <lay-menu-item>修改密码</lay-menu-item> 
          <lay-menu-item>退出登录</lay-menu-item>
        </lay-sub-menu>
      </lay-menu>
  </div>
  <div class="sizestyle">
    <lay-panel >
      <lay-page-header content="详情页面" @back="handleBack"></lay-page-header>
    </lay-panel>
  </div>
  <div class="body">

  </div>
</template>

<script setup>
</script>

<style scoped>
.table{
  width: 100%;
  height: 10%;
  position:relative;
  top:0px;
  align-items: center;
  text-align: end;
}
.sizestyle{
  width: 100%;
  height: 10%;
  position:relative;
  top: 0px;
  align-items: center;
}
.body{
  width: 100%;
  height: 80%;
  position:relative;
  top: 0px;
  align-items: center;
  background-color: bisque;
}
</style>
