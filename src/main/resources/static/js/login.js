//为表单的必填文本框添加提示信息（选择form中的所有后代input元素）
$("form :input.required").each(function () {
    //通过jquery api：$("HTML字符串") 创建jquery对象
    var $required = $("<strong class='high'>*</strong>");
    //添加到this对象的父级对象下
    $(this).parent().append($required);
});

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
        var regNum = /[0-9A-Z]{18}/;
        if(numVal == "" ){
            var errorMsg = " 请输入工号！";
            //class='msg onError' 中间的空格是层叠样式的格式
            $parent.append("<span class='msg onError'>" + errorMsg + "</span>");
        }else if(regNum.test(numVal)){
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
        }else if (emailVal != "" && !regEmail.test(emailVal)){
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
        if(pwdVal== "" || (pwdVal != "" && !regPwd.test(pwdVal))){
            var errorMsg = " 请输入密码！";
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
    //验证码
    if($(this).is("#code")){
        var codeVal = $.trim(this.value);
        var regCode = /^\d{6}$/;
        if(codeVal== ""){
            var errorMsg = " 请输入验证码！";
            $parent.append("<span class='msg onError'>" + errorMsg + "</span>");
        }else if(codeVal != "" && !regCode.test(codeVal)){
            var errorMsg = " 验证码错误！";
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
$('.mask').hide();
$('#agreement').on('click',function () {
    $('.mask').show();
});
$('.btn').on('click',function () {
    $('.mask').hide();
});



$(function () {
   var register = document.getElementById('degister');
   $('#register').on('click',function () {
       for (var i = 0; i < $('#Reform')[0].elements.length - 1;i++){
           if($('#Reform')[0].elements[i].value=="")
           {
               alert("当前表单不能有空项");
               $('#Reform')[0].elements[i].focus();
               return false;
           }
       }
       return true;
   })
    })