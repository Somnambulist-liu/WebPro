<template>
  <div class="home-ui">
      <div class="side">
        <SideBox/>
      </div>
      <div class="content">
        <router-view></router-view>
      </div>
  </div>
</template>

<script setup>
  import SideBox from './SideBox.vue';

</script>

<style scoped>
.home-ui {
  width: 100%;
  height: 100%;
  background-color: #f0fcff;
}
.side {
  width: 15%;
  height: 100%;
  position: absolute;
  top: 0;
  left: 0;
  background-color: #177cb0;
}

.content {
  width: 85%;
  height: 100%;
  position: absolute;
  top: 0;
  left: 15%;
  background-color: #ffffff;
}
</style>