
    $(function () {
        var formData=new FormData($("#Reform")[0]);
        $("#register").click( function () {
           // alert(123);
            $.ajax({
                url:'userLoginController/userlogin',
                type:'post',
                data:formData,
                secureuri: false,
                async: false,
                cache: false,
                contentType: false,
                processData: false,
                dataType: 'json',
                success:function(){

                }
            });
        });
    });
