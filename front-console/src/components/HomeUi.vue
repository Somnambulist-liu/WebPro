<template>
  <div class="home-ui">
      <div class="side">
        <SideBox/>
      </div>
      <div class="content">
        <ContentBox/>
      </div>
  </div>
</template>

<script setup>
  import ContentBox from './ContentBox.vue';
  import SideBox from './SideBox.vue';

</script>

<style scoped>
.home-ui {
  margin: 0;
  padding: 0;
  display: flex;
  flex-direction: row;
}
.side {
  width: 15%;
  height: 100vh;
  background-color: aqua;
}

.content {
  width: 85%;
  height: 100vh;
  background-color: blue;
}
</style>