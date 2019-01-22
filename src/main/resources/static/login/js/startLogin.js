$(function () {

    $("#loginbutton").click(function () {
        var userName1=$("#userName1").val();
        var userPwd=$("#userPwd").val();
        var rememberMe=$('#idcheckbox').is(':checked')//返回true/false

        $.post("userLoginController/startlogin",{"userName":userName1,"userPwd":userPwd,"rememberMe":rememberMe},function (msg) {

            if(msg==""){
                sessionStorage.setItem("userName",userName1)
                window.location.href="index.html";
            }else{
                alert(msg)
            }

        });
    })

})