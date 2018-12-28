/**
 * Created by saturn on 2018/3/9.
 */

$(function () {
  var fixed = $('.captcha-fixed');
  var captcha = $('.captcha-img');
  var close = $('.captcha-close');
  var refresh = $('.captcha-refresh');
  var username = $('input[name="username"]');
  var password = $('input[name="password"]');
  var input = $('input[name="captcha"]');

  $('html').css('backgroundImage','url("static/img/bg_'+ parseInt(Math.random()*4+1) +'.jpg")');
  $('.snow-canvas').snow();

  input.on('click', function (ev) {
    ev.stopPropagation();
    fixed.addClass('active');
  });

  close.on('click', function (ev) {
    ev.stopPropagation();
    fixed.removeClass('active');
  });

  refresh.on('click', function (ev) {
    ev.stopPropagation();
    fixed.addClass('active');
    captcha.attr("src", captcha.data("src") + new Date().getTime());
  });

  $(document).on('click', function () {
    fixed.removeClass('active');
  });

  $('form').on('submit',function (ev) {
    // ev.preventDefault();
    var action = $(this).attr('action');
    var method = $(this).attr('method');
    if(username.val()===''){
      alert('用户名不能为空！');
      username.focus();
      return;
    }
    if(password.val()===''){
      alert('密码不能为空！');
      password.focus();
      return;
    }
    $.ajax({
      url:action,
      type:method,
      data:$(this).serialize(),
      success:function (result) {
        console.log(result);
      }
    });
  });
});