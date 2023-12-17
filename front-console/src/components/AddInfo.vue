<template>
    <div class="container">
        <div class="toolbar">
            <div class="search">
                <span>添加学生个人信息</span>
            </div>
            <div class="loginOut">
                <button @click="toLoginOut">退出登录</button>
            </div>
        </div>
        <div class="body">
            <table class="table">
                <tr class="title">
                    <th>学号</th>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>班级</th>
                    <th>专业</th>
                    <th>电话</th>
                </tr>
                <tr class="list">
                    <td>
                        <input type="text" v-model="studentForm.studentNum" placeholder="请输入学号（10位数字组成）" />
                    </td>
                    <td>
                        <input type="text" v-model="studentForm.studentName" placeholder="请输入姓名" />
                    </td>
                    <td>
                        <select  v-model="studentForm.studentGender">
                            <option value="男">男</option>
                            <option value="女">女</option>
                        </select>
                    </td>
                    <td>
                        <input type="text" v-model="studentForm.studentClassName" placeholder="请输入班级（2022级01班）" />
                    </td>
                    <td>
                        <select v-model="studentForm.studentMajor">
                            <option value="软件工程">软件工程</option>
                            <option value="计算机科学与技术">计算机科学与技术</option>
                            <option value="网络工程">网络工程</option>
                            <option value="网络工程">网络工程</option>
                        </select>
                    </td>
                    <td>
                        <input type="text" v-model="studentForm.studentPhone" placeholder="请输入电话（11位数字组成）" />
                    </td>
                </tr>
            </table>
        </div>
        <div class="subfield">
            <span class="pagebox">
                <button @click="reset">重置表单</button>
                <button @click="submitForm">提交信息</button>
            </span>
        </div>
    </div>
</template>

<script setup>
    import axios from 'axios'
    import {reactive} from 'vue'
    import router from '../router/router'
    //定义学生表单信息
    const studentForm = reactive({
        studentNum: '',
        studentName: '',
        studentGender: '',
        studentClassName: '',
        studentMajor: '',
        studentPhone: '',
    })

    function reset(){
        studentForm.studentNum = ''
        studentForm.studentName = ''
        studentForm.studentGender = ''
        studentForm.studentClassName = ''
        studentForm.studentMajor = ''
        studentForm.studentPhone = ''
    }
    function invatidForm(){
        if(!studentForm.studentNum ||!studentForm.studentName ||!studentForm.studentGender ||!studentForm.studentClassName ||!studentForm.studentMajor ||!studentForm.studentPhone){
            alert('请填写完整信息！')
            return false
        }
        return true
    }

    function submitForm(){
        invatidForm()
        axios.put('/student', studentForm).then(function(res) {
            alert('添加成功！')
            location.reload()
        }).catch(function(err) {
            alert(err)
        })
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
.search span{
    font-size: 25px;
    width: 70%;
    height: 50px;
    line-height: 46px;
    text-align: center;
}
.search button {
    height: 50px;
    font-size: 20px;
    line-height: 50px;
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
    left: 350px;
    height: 30px;
    line-height: 30px;
    width: 400px;
    display: flex;
    justify-content: space-between;
}
.pagebox button{
    height: 30px;
    line-height: 30px;
    border-radius: 5px;
    border: none;
    margin: auto;
    background-color: #FFCDD2;
}
.table{
    width: 600px;
    height: 380px;
    position: relative;
    top: 100px;
    left: 360px;
    display: flex;
    flex-direction: row;
}

.table tr{
    display: flex;
    flex-direction: column;
}
.title{
    width: 80px;
    height: 50px;
    line-height: 50px;
    text-align:justify;
    text-align-last:justify;
    position: relative;
    left: 100px;
}
.list{
    height: 50px;
    width: 250px;
    line-height: 50px;
    position: relative;
    left: 150px;
}
.list input{
    width: 200px;
    height: 30px;
    line-height: 30px;
    font-size: 16px;
}
.list select{
    width: 80px;
    height: 30px;
    line-height: 30px;
}
</style>