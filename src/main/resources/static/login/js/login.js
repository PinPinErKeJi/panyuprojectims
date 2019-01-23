$(function () {
    //邮箱验证
    $('.send').click(function () {
        var Email = /.+@.+\.[a-zA-Z]{2,4}$/;
        if($('.email').val()==''){
            $('.error').text('请输入邮箱！');
        }else if (!Email.test($('.email').val())){
            $('.error').text('邮箱格式不正确！');
        }else {
            $('.error').text('');
            $('.verify').show();
            $('#forgot-box').hide();
        }
    });
})
