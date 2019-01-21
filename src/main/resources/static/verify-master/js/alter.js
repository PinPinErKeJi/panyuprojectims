$(function () {
    $('#mpanel4').slideVerify({
        type : 2,		//类型
        vOffset : 5,	//误差量，根据需求自行调整
        vSpace : 5,	//间隔
        imgName : ['1.jpg', '2.jpg'],
        imgSize : {
            width: '400px',
            height: '300px',
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
//		        	alert('验证成功，添加你自己的代码！');
            //......后续操作
            $('.slideVerify').hide();
            $('.verifyTel').show();
        },
        error : function() {
//		        	alert('验证失败！');
        }

    });

    //验证
    $('.verifyTel .tel').blur(function () {
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
            $(".msgs").click (function change () {
                var time=60;
                var code=$(this);
                if (validCode) {
                    validCode=false;
                    code.addClass("msgs1");
                    var t=setInterval(function  () {
                        time--;
                        code.html(time+"秒");
                        if (time==0) {
                            clearInterval(t);
                            code.html("重新获取");
                            validCode=true;
                            code.removeClass("msgs1");
                        }
                    },1000)
                }
            })

            //下一步
            $("#next").click(function(){
                    $('.verifyTel').hide();
                    $('.verifyPwd').show();
            });
        }
    })



    //修改密码
    $("#sure").click(function(){
        $('.verifyPwd .pwd').blur(function () {
            var pwd = $('.pwd').val();
            var regPwd = /^[A-Za-z0-9]{6,16}$/;
            if (!regPwd.test(pwd)){
                $('.error1').text('密码6~16位字母和数字组成！');
            }else {
                $('.error1').text('');
            }
            $('.surePwd').blur(function () {
                var surePwd = $('.surePwd').val();
                if (surePwd != pwd){
                    $('.error2').text('密码不一致！');
                }else {
                    $('.error2').text('');
                }
            })
        })
    });

})