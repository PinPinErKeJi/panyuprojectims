$(function () {
   $(".email").mouseout(function () {
            var userEmail = $(".email").val();
            var Email = /.+@.+\.[a-zA-Z]{2,4}$/;
            if(Email.test(userEmail)){
                $('.error').text('');
            }

    })

    //邮箱验证
    $('.send').click(function () {
        var Email = /.+@.+\.[a-zA-Z]{2,4}$/;
        var userEmail = $(".email").val();
        if(userEmail==''){
            $('.error').text('请输入邮箱！');
        }else if (!Email.test(userEmail)){
            $('.error').text('邮箱格式不正确！');
        }else {
            $.ajax({
                url:"verify-master/AM/selectEmailByUserEmail",
                type:"post",
                data:{userEmail:userEmail},
                dataType:"json",
                success:function (responseResult) {
                    console.log(responseResult.msg)
                    if (responseResult.email!=userEmail) {
                        alert(responseResult.msg);
                    } else {
                        $('.verify').show();
                        $('#forgot-box').hide();
                    }
                }
            })
        }
    });
})