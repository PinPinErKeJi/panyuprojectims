function isError(result){
    var flag=true;
    if(result && result.status){
        flag = false;
        if(result.status == "-1" || result.status == "-101"){
            alert(result.data);
        }else if(result.status=="400"){
            //请求有误
            window.location.href="/400.html";
        }else if(result.status=="403"){
            //未授权页面
            window.location.href="/400.html"
        }else if(result.status=="404"){
            //没有资源
            window.location.href="/405.html"
        }else if(result.status=="500"){
            //异常操作
            window.location.href="/500.html"
        }
    }
    return flag;
}