
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
})