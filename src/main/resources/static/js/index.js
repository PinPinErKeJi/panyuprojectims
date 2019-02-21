$(function () {
    $('.login-info-one').click(function () {
        if($(".message").css('display')=='none'){
            $(".message").css("display","block");
        }else {
            $(".message").css("display","none");
        }
    })
    $('body').click(function () {
        if($(".message").css('display')=='block'){
            $(".message").css("display","none");
        }
    })
})