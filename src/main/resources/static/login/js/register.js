
$(function () {
    $("#email").blur(function () {
        var userEmail = $(this).val();
        if (userEmail!=""){
            $.ajax({
                url:"userRegisterController/selectUserEmail",
                type:"post",
                data:$("#Reform").serialize(),
                dataType:"json",
                success:function (data) {
                    console.log(data);
                    if(data.msg==1){
                        $('#divMsg').css("color","green");
                        $('#divMsg').html("该用户可以注册,请继续");
                    } else{
                        $('#divMsg').css("color","red");
                        $('#divMsg').html("该用户已注册,请重新注册");
                    }
                }
            })
        }
    });

    $("#register").click(function () {
        $.ajax({
            url:"userRegisterController/register",
            type:"post",
            data:$("#Reform").serialize(),
            success:function (result) {
                if(result>0){
                    alert("注册成功！请点击返回登录");
                    window.location.href="login.html";
                }
            }
        })
    })
})

/*
* 第二种方案  可行
* */
/*
$(function () {
    $("#register").click( function () {

        var companyName=$("#companyName").val();
        var userName=$("#userName").val();
        var companyNumber=$("#companyNumber").val();
        var email=$("#email").val();
        var password=$("#password").val();
        var tel=$("#tel").val();
        var province=$("#province").val();
        var city=$("#city").val();
        var county=$("#county").val();

        $.post("userRegisterController/register",
            {"userCompanyName":companyName,"userName":userName,"userCompanycccNumber":companyNumber,"userEmail":email,"userPwd":password,"userTel":tel,
                "userProvince":province,"userCity":city,"userCounty":county},
            function(msg){
                if(msg>0){
                    alert("注册成功！请点击返回登录");
                    window.location.href="login.html";
                }
            });
    });
})*/
