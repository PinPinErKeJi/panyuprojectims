$(function () {
    $('.email').blur(function () {
        var Email = /.+@.+\.[a-zA-Z]{2,4}$/;
        if (!Email.test($('.email').val())){
            var errorMsg = " 邮箱格式不正确！";
            $('.error').append("<span class='msg onError'>" + errorMsg + "</span>");
        }
    })
})