$(function () {
    $('#mpanel4').slideVerify({
        type : 2,		//类型
        vOffset : 5,	//误差量，根据需求自行调整
        vSpace : 5,	//间隔
        imgName : ['1.jpg', '2.jpg'],
        imgSize : {
            width: '400px',
            height: '260px',
        },
        blockSize : {
            width: '40px',
            height: '40px',
        },
        barSize : {
            width : '400px',
            height : '40px',
        },
        ready : function() {
        },
        success : function() {
            //alert('验证成功，添加你自己的代码！');
            var userEmail =  $("#emailInput",parent.document).val();
            alert(userEmail);
            $('.slideVerify').hide();
            $.ajax({
                url:"../AM/selectTelByEmail",
                type:"post",
                dataType:"json",
                data:{userEmail:userEmail},
                success:function (userTel) {
                    //赋值
                    $("#tel").val(userTel);
                    //取值
                    var tt =  $("#tel").val();
                    console.log(tt+"tt");
                    $('.verifyTel').show();
                }
            })
        },
        error : function() {
        //alert('验证失败！');
        }
    });

    //验证
    $(".verifyTel .tel").mouseout(function () {
        var tel = $('.tel').val();
        var regTel = /^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/;
        if (tel == ''){
            $('.error').text('请输入手机号！')
        }else if(!regTel.test(tel)){
            $('.error').text('请输入正确手机号！')
        } else{
            $('.error').text('');
            //获取短信验证码
            var validCode=true;
            $("#btn").click (function change () {
                var time=60;
                var code=$(this);
                if (validCode) {
                    validCode=false;
                    code.addClass("msgs1");
                    var t=setInterval(function  () {
                        time--;
                        code.html(time+"秒");
                        if (time==0) {
                            $("#btn").removeAttr("disabled");
                            clearInterval(t);
                            code.html("重新获取");
                            validCode=true;
                            code.removeClass("msgs1");
                        }
                        if (time==59){
                            $("#btn").attr('disabled',true);
                            var userTel = $('.tel').val();
                            if (userTel!="") {
                                $.ajax({
                                    url:"sendCode",
                                    type:"post",
                                    dataType:"text",
                                    data:{userTel:userTel},
                                    success:function (senCode) {
                                        alert(senCode);
                                        /*clearInterval(t);
                                        code.html("重新获取");*/
                                    }
                                })
                            }
                        }
                    },1000)
                }
            })

            //下一步
            $("#next").click(function(){
                var userTel = $('.tel').val();
                var code = $(".c_code_msg").val();
                var cookie = $.cookie("cookieName");
                $.ajax({
                    url:"messageCheck",
                    type:"post",
                    dataType:"json",
                    data:{code:code,userTel:userTel},
                    success:function (responseResult) {
                        if (responseResult.code==0) {
                            $(".error").text();
                            $('.verifyTel').hide();
                            $('.verifyPwd').show();
                        } else if (cookie==null){
                            $(".error").text("验证码失效，请重新输入");
                        } else {
                            $(".error").text("验证码不正确");
                        }
                    }
                })
            });
        }
    })


    //修改密码
    $("#sure").click(function(){
        var pwd = $('.pwd').val();
        var regPwd = /^[A-Za-z0-9]{6,16}$/;
        var surePwd = $('.surePwd').val();
        $('.verifyPwd .pwd').blur(function () {
            if (!regPwd.test(pwd)){
                $('.error1').text('密码6~16位字母和数字组成！');
            }else {
                $('.error1').text('');
            }
            $('.surePwd').blur(function () {
                var pwd = $('.pwd').val();
                var surePwd = $('.surePwd').val();
                if (surePwd != pwd){
                    $('.error2').text('密码不一致！');
                }else {
                    $('.error2').text('');
                }
            })
        })
        if (pwd!=''&&surePwd!=''&&regPwd.test(pwd)==true&&pwd==surePwd){
            $('.error1').text('');
            $('.error2').text('');
            $('.verifyPwd').hide();
            var userTel =  $("#tel").val();
            var userlogpwd = $("#userLogPwd").val();
            $.ajax({
                url:"AM/updateUserLogpwdAndUserPwd",
                type:"post",
                dataType:"json",
                data:{userTel:userTel,userlogpwd:userlogpwd},
                success:function (flag) {
                    if (flag==true) {
                        alert("修改成功！")
                    } else {
                        alert("修改失败！")
                    }
                }
            })
            parent.location.reload();
        }
    });
})
