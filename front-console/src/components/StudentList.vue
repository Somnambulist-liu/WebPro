<template>
    <div class="container">
        <div class="toolbar">
            <div class="add">
                <button @click="toAdd">新增</button>
            </div>
            <div class="search">
                <input type="text" v-model="page.searchWord" placeholder="请输入姓名或学号">
                <button @click="toSearch">查询</button>
            </div>
            <div class="loginOut">
                <button @click="toLoginOut">退出登录</button>
            </div>
        </div>
        <div class="body">
            <table class="table" v-if="datastate">
                <tr>
                    <th>学号</th>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>班级</th>
                    <th>专业</th>
                    <th>电话</th>
                    <th>选项</th>
                </tr>
                <tr v-for="item in student">
                    <td>{{ item.studentNum }}</td>
                    <td>{{ item.studentName }}</td>
                    <td>{{ item.studentGender }}</td>
                    <td>{{ item.studentClassName }}</td>
                    <td>{{ item.studentMajor }}</td>
                    <td>{{ item.studentPhone }}</td>
                    <td class="options">
                        <button @click="toDelete(item.studentId)">删除</button>
                    </td>
                </tr>
            </table>
        </div>
        <div class="subfield">
            <span class="pagebox">
                <button @click="changePageUp">上一页</button>
                <span id="pageIndex">第{{page.pageIndex}}页 / 共{{page.pageTotal}}页</span>
                <button @click="changePageDown">下一页</button>
            </span>
        </div>
    </div>
</template>

<script setup>
    import axios from 'axios'
    import {ref, reactive, onBeforeMount} from 'vue'
    import router from '../router/router'
    //定义后端接受的数据数组
    let student = ref([])
    //判断后端数据接受是否成功的标志位
    const datastate = ref(false)
    //定义分页数据
    let page = reactive({
            pageIndex: 1,
            pageTotal: 1,
            pageSize: 10,
            searchWord: '',
    })
    //定义搜所函数
    function toSearch(searchWord){
        if(searchWord){
            reloadDate()
        }
    }

    function changePageUp(){
        if(page.pageIndex > 1){
            page.pageIndex--
            reloadDate()
        }else{
            alert('已经是第一页了')
        }
    }
    function changePageDown(){
        if(page.pageIndex < page.pageTotal){
            page.pageIndex++
            reloadDate()
        }else{
            alert('已经是最后一页了')
        }
    }

    //在组件挂载时，获取后端数据
    onBeforeMount(() => {
        reloadDate();
    })

    function reloadDate(){
        axios.post('/student/pages', page).then(function(res) {
            student.value = res.data.data
            page.pageIndex = res.data.pageIndex
            page.pageTotal = res.data.pageTotal
            datastate.value = true
        }).catch(function(err) {
            alert(err)
        })
    }
    function toAdd(){
        router.push('/add/')
    }

    function toDelete(id){
        if(confirm('是否确认删除该学生信息？')){
            axios.delete('/student/'+ id).then(function(res) {
                alert('删除成功！')
                location.reload()
            }).catch(function(err) {
                alert(err)
            })
        }
    }

    //定义退出登录函数
    function toLoginOut(){
        localStorage.removeItem('token')
        router.push('/login')
        location.reload()
    }       
</script>

<style scoped lang="css">
.search{
    width: 35%;
    height: 50px;
    line-height: 50px;
    border-radius: 5px;
    position: absolute;
    display: flex;
    justify-content: space-between;
    left: 30%;
    top: 18px;
    align-items: center;
}
.add{
    position: absolute;
    top: 18px;
    left: 20px;
    height: 60px;
    width: 65px;
}
.add button{
    height: 50px;
    font-size: 20px;
    line-height: 50px;
    width: inherit;
    border-radius: 8px;
}
.search input {
    font-size: 20px;
    width: 70%;
    height: 50px;
    line-height: 46px;
    border-radius: 5px;
    border: 1px solid #ccc;
    padding: 0 10px;
}
.search button {
    height: 50px;
    font-size: 20px;
    line-height: 50px;
    width: 15%;
    border-radius: 8px;
}
.loginOut{
    width: 10%;
    height: 50px;
    line-height: 46px;
    position: absolute;
    top: 18px;
    right: 50px;
}
.loginOut button{
    font-size: 18px;
    height: 46px;
    line-height: 50px;
    border-radius: 8px;
    border: none;
    background-color: #FFCDD2;
}
.loginOut button:hover{
    background-color: #E57373;
}

.toolbar{
    display: flex;
    justify-items: space-between;
    width: 100%;
    height: 86px;
    border-radius: 10px;
    background-color: #e9f1f6;
}
.body{
    width: 100%;
    height: 560px;
    position: relative;
    top: 10px;
    background-color: #e3f9fd;
}
.subfield{
    width: 100%;
    height: 50px;
    border-radius: 10px;
    position: relative;
    top: 18px;
    background-color: #c2ccd0;
}
.pagebox{
    position: absolute;
    top: 12px;
    left: 40px;
    height: 30px;
    line-height: 30px;
    width: 300px;
}
#pageIndex{
    margin-left: 10px;
    margin-right: 10px;
}
.table{
    width: 100%;
    height: 100%;
    display: flex;
    flex-direction: column;
}
tr{
    display: flex;
    justify-content: space-between;
    align-items: center;
    height: 50px;
    line-height: 50px;
    border-bottom-width: 1px;
    border-bottom-style: solid;
    border-bottom-color: rgb(103, 103, 103);
}
th{
    font-size: 25px;
    height: 35px;
    width: 15%;
    line-height: 35px;
    text-align: center;
    border-radius: 5px;
    border: 1px solid rgb(240, 208, 208);
}
th:last-child{
    font-size: 25px;
    height: 35px;
    width: 10%;
    line-height: 35px;
    text-align: center;
    border-radius: 5px;
    border: 1px solid rgb(240, 208, 208);
}
td{
    width: 15%;
    line-height: 30px;
    height: 30px;
    font-size: 20px;
    text-align: center;
    border: 1px solid rgb(103, 103, 103);
}
td:last-child{
    width: 10%;
    line-height: 30px;
    height: 30px;
    font-size: 20px;
    text-align: center;
    border: 1px solid rgb(103, 103, 103);
}
.options button{
    margin: 0px 5px;
}
</style>