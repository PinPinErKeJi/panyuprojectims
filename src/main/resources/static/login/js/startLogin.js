$(function () {

    $("#loginbutton").click(function () {
        var userName1=$("#userName1").val();
        var userPwd=$("#userPwd").val();

        $.post("userLoginController/startlogin",{"userName":userName1,"userPwd":userPwd},function (msg) {
                if(msg==1){
                    alert("对不起用户名错误")
                }else if(msg==2){
                    alert("对不起密码输入错误")
                }else if(msg==""){
                    window.location.href="index.html";
                }
        });
    })

})