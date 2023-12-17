<template>
    <div class="title">学生管理系统</div>
    <div class="tags">
        <div id="tagInfo" @click="toStudentInfo">学生信息</div>
        <div id="tagInfo" @click="toAddInfo">添加信息</div>
    </div>
</template>

<script setup>
    import router from '../router/router';

    function toStudentInfo(){
        router.push('/student')
    };
    function toAddInfo(){
        router.push('/add')
    };
</script>

<style scoped>
.title{
    width: 100%;
    height: 100px;
    line-height: 100px;
    text-align: center;
    font-size: 25px;
    font-weight: bold;
    border-bottom-width: 5px;
    border-bottom-style: solid;
    border-bottom-color: rgb(7, 7, 7);
}
.tags{
    display: flex;
    text-align: center;
    justify-content: center;
    flex-direction: column;
    background-color: #1685a9;
}
.tags div{
    font-size: 22px;
    width: 100%;
    height: 80px;
    line-height: 80px;
    border-bottom-width: 2px;
    border-bottom-style: solid;
    border-bottom-color: rgb(7, 7, 7);
}
#tagInfo:hover{
    background-color: #1c98c1;
}
</style>
