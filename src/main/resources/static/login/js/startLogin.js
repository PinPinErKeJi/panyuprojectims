$(function () {

    $("#loginbutton").click(function () {
        var userName1=$("#userName1").val();
        var userPwd=$("#userPwd").val();
        var rememberMe=$('#idcheckbox').is(':checked')//返回true/false

        $.post("userLoginController/startlogin",{"userName":userName1,"userPwd":userPwd,"rememberMe":rememberMe},function (msg) {
                if(msg==1){
                    alert("对不起用户名错误")
                }else if(msg==2){
                    alert("对不起密码输入错误")
                }else if(msg==""){
                    sessionStorage.setItem("userName",userName1)
                    window.location.href="index.html";
                }
        });
    })

})