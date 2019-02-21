$(function () {
    $('.login-info-one').click(function () {
        $(".none2").css("display","none");
        if($(".none1").css('display')=='none'){
            $(".none1").css("display","block");
        }else {
            $(".none1").css("display","none");
        }
    })

    $('.login-info-two').click(function () {
        $(".none1").css("display","none");
        if($(".none2").css('display')=='none'){
            $(".none2").css("display","block");
        }else {
            $(".none2").css("display","none");
        }
    })

})