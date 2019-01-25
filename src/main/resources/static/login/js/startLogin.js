$(function () {

    $("#loginbutton").click(function () {
        var userName1=$("#userName1").val();
        var userPwd=$("#userPwd").val();
        var rememberMe=$('#idcheckbox').is(':checked')//返回true/false

        if(userName1 == "" && userPwd == ""){
            $('#infoSpan').text("请输入用户名和密码")
        }else {
            $.post("userLoginController/startlogin",{"userName":userName1,"userPwd":userPwd,"rememberMe":rememberMe},function (msg) {
                if(msg==""){
                    sessionStorage.setItem("userName",userName1)
                    window.location.href="index.html";
                }else{
                    //alert(msg)
                    $('#infoSpan').text(msg)
                }
            });
        }
    })


})