$(function () {
    //为表单元素添加失去焦点事件
    $("form :input").blur(function(){
        var $parent = $(this).parent();
        $parent.find(".msg").remove(); //删除以前的提醒元素（find()：查找匹配元素集中元素的所有匹配元素）
        //验证公司名
        if($(this).is("#companyName")){
            var nameVal = $.trim(this.value); //原生js去空格方式：this.replace(/(^\s*)|(\s*$)/g, "")
            var regCompany = /[~#^$@%&!*()<>:;'"{}【】  ]/;
            if( nameVal == ""){
                var errorMsg = " 请输入公司名！";
                //class='msg onError' 中间的空格是层叠样式的格式
                $parent.append("<span class='msg onError'>" + errorMsg + "</span>");
            }else if(nameVal.length < 4 || regCompany.test(nameVal)){
                var errorMsg = " 公司名长度4位以上，不包含特殊字符！";
                $parent.append("<span class='msg onError'>" + errorMsg + "</span>");
            } else{
                $parent.find(".onError").remove();
            }
        }
        //验证用户名
        if($(this).is("#userName")){
            var userVal = $.trim(this.value);
            //原生js去空格方式：this.replace(/(^\s*)|(\s*$)/g, "")
            var regUser = /[~#^$@%&!*()<>:;'"{}【】  ]/;
            if(userVal == ""){
                var errorMsg = " 请输入用户名！";
                $parent.append("<span class='msg onError'>" + errorMsg + "</span>");
            }else if(userVal.length < 2 || regUser.test(userVal)){
                var errorMsg = " 用户名长度2位以上，不包含特殊字符！";
                $parent.append("<span class='msg onError'>" + errorMsg + "</span>");
            }else{
                $parent.find(".onError").remove();
            }
        }
        //验证工号
        if($(this).is("#companyNumber")){
            var numVal = $.trim(this.value);
            //原生js去空格方式：this.replace(/(^\s*)|(\s*$)/g, "")
            var regNum = /[1-9A-GY]{1}[1239]{1}[1-5]{1}[0-9]{5}[0-9A-Z]{10}/;
            if(numVal == "" ){
                var errorMsg = " 请输入工号！";
                //class='msg onError' 中间的空格是层叠样式的格式
                $parent.append("<span class='msg onError'>" + errorMsg + "</span>");
            }else if(regNum.test(numVal)==false){
                var errorMsg = " 统一社会信用代码由18位数字或大写字母组成！";
                $parent.append("<span class='msg onError'>" + errorMsg + "</span>");
            }
            else{
                $parent.find(".onError").remove();
            }
        }
        //验证邮箱
        if($(this).is("#email")){
            var emailVal = $.trim(this.value);
            var regEmail = /.+@.+\.[a-zA-Z]{2,4}$/;
            if(emailVal== ""){
                var errorMsg = " 请输入E-Mail！";
                $parent.append("<span class='msg onError'>" + errorMsg + "</span>");
            }else if (!regEmail.test(emailVal)){
                var errorMsg = " 邮箱格式不正确！";
                $parent.append("<span class='msg onError'>" + errorMsg + "</span>");
            }else{
                $parent.find(".onError").remove();
            }
        }
        //验证密码
        if($(this).is("#password")){
            var pwdVal = $.trim(this.value);
            var regPwd = /^[A-Za-z0-9]{6,8}$/;
            if(pwdVal== ""){
                var errorMsg = " 请输入密码！";
                $parent.append("<span class='msg onError'>" + errorMsg + "</span>");
            }else if(regPwd.test(pwdVal)==false){
                var errorMsg = " 密码6~8位字母和数字组成！";
                $parent.append("<span class='msg onError'>" + errorMsg + "</span>");
            }
            else{
                $parent.find(".onError").remove();
            }
        }
        //确认密码
        if($(this).is("#surePassword")){
            var sureVal = $.trim(this.value);
            var pwdVal = $('#password').val();
            if(sureVal == ""){
                var errorMsg = " 请再次输入密码！";
                $parent.append("<span class='msg onError'>" + errorMsg + "</span>");
            }else if (sureVal != pwdVal){
                var errorM = " 密码不一致！";
                $parent.append("<span class='msg onError'>" + errorM + "</span>");
            }else{
                $parent.find(".onError").remove();
            }
        }
        //验证手机号
        if($(this).is("#tel")){
            var telVal = $.trim(this.value);
            var regTel = /^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/;
            if(telVal== ""){
                var errorMsg = " 请输入手机号！";
                $parent.append("<span class='msg onError'>" + errorMsg + "</span>");
            }else if(telVal != "" && !regTel.test(telVal)){
                var errorMsg = " 请输入有效手机号！";
                $parent.append("<span class='msg onError'>" + errorMsg + "</span>");
            }else{
                $parent.find(".onError").remove();
            }
        }
    }).keyup(function(){
        //triggerHandler 防止事件执行完后，浏览器自动为标签获得焦点
        $(this).triggerHandler("blur");
    }).focus(function(){
        $(this).triggerHandler("blur");
    });

//点击重置按钮时，通过trigger()来触发文本框的失去焦点事件
    $("#reset").click(function(){
        //trigger 事件执行完后，浏览器会为submit按钮获得焦点
        // $("form .required:input").trigger("blur");
        var numError = $("form .onError").length;
        if(numError){
            return false;
        }else{
            alert("注册成功！");
        }
    });

//用户协议,控制显示隐藏
    $('#agreement').on('click',function () {
        $('.mask').show();
    });
    $('.sureBut').on('click',function () {
        $('.mask').hide();
    });

});

$("#register").click( function () {
    //获取输入框的值
    var companyName=$("#companyName").val();
    var userName=$("#userName").val();
    var companyNumber=$("#companyNumber").val();
    var email=$("#email").val();
    var password=$("#password").val();
    var sureVal = $('#surePassword').val();
    var tel=$("#tel").val();
    var province=$("#province").val();
    var city=$("#city").val();
    var county=$("#county").val();
    var agree = $('.agree:checkbox:checked').val();

    if(companyName !=''&&userName !=''&&companyNumber!=''&&email !=''&&password!=''&&sureVal!=''&&tel!=''&&agree!=null){
        var numError = $("form .onError").length;
        if (!numError){
            $.post("userLoginController/userlogin",
                {"userCompanyName":companyName,"userName":userName,"userCompanycccNumber":companyNumber,"userEmail":email,"userPwd":password,"userTel":tel,
                    "userProvince":province,"userCity":city,"userCounty":county},
                function(msg){
                    if(msg>0){
                        alert("注册成功！请点击返回登录");
                        window.location.href="login.html";
                    }
                });
        }
    }else {
        alert('请填写完整信息！')
    }

});

//记住用户名密码
window.onload = function () {
    var user = document.getElementById('userName1'),
        pass = document.getElementById('userPwd'),
        check = document.getElementById('idcheckbox'),
        login = document.getElementById('loginbutton') ,
        localUser = localStorage.getItem('user') || '', //获取到user的值并保存
        localPass = localStorage.getItem('pass') || ''; //获取到pwd的值并保存
    user.value = localUser;
    pass.value = localPass;
    if (localUser !== '' && localPass !== '') {
        check.setAttribute('checked', '');
    }

    login.onclick= function() {
        if (check.checked) {
            localStorage.setItem('user', user.value);
            localStorage.setItem('pass', pass.value);
        } else {
            localStorage.setItem('user', '');
            localStorage.setItem('pass', '');
        }
    }
}


