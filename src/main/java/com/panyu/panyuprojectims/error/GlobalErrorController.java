package com.panyu.panyuprojectims.error;


import com.panyu.panyuprojectims.utils.ExceptionEnum;
import com.panyu.panyuprojectims.utils.Result;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

//普通异常处理使用error页面处理   ，异步异常统一返回result(status,message,data)对象
@Controller
@RequestMapping("/error")
public class GlobalErrorController  extends AbstractErrorController {

    private static final String ERROR_PATH  = "error";

    public GlobalErrorController(ErrorAttributes errorAttributes) {
        super(errorAttributes);
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
    @RequestMapping("text/html")
    public ModelAndView errorHtml(HttpServletRequest request, HttpServletResponse response){
        //text/html=普通请求：request=" + request
        ModelAndView mav=new ModelAndView(ERROR_PATH);
        /** model对象包含了异常信息 */
        Map<String,Object> model = getErrorAttributes(request,isIncludeStackTrace(request, MediaType.TEXT_HTML));
        //返回错误状态码
        HttpStatus  httpStatus = getStatus(request);
        // 2 返回错误提示
        ExceptionEnum ee = getMessage(httpStatus);
        Result<String> result=new Result<String>(String.valueOf(ee.getType()),ee.getCode(),ee.getMsg());
        //3.将错误信息放到mav中
        mav.addObject("result",result);
        //统一异常处理信息mav
        return mav;
    }

    @RequestMapping("/ajaxerror")
    @ResponseBody
    //设置响应状态码为：200，结合前端约定的规范处理。也可不设置状态码，前端ajax调用使用error函数进行控制处理
    @ResponseStatus(value = HttpStatus.OK)
    public Result<String> error(HttpServletRequest request, Exception e){
        //model对象包含异常信息
        Map<String ,Object> model = getErrorAttributes(request,isIncludeStackTrace(request,MediaType.TEXT_HTML));
        //1.返回状态码（可以根据异常对象返回对应的错误信息）
        HttpStatus httpStatus = getStatus(request);
        //2.返回错误提示
        ExceptionEnum ee = getMessage(httpStatus);
        Result<String> result=new Result<String>(String.valueOf(ee.getType()),ee.getCode(),ee.getMsg());
        //3将错误信息返回
        return result;
    }
    //根据error状态码，返回不同的异常内容
    @SuppressWarnings("static-access")
    private ExceptionEnum getMessage(HttpStatus httpStatus){
        if(httpStatus.is4xxClientError()){
            //4开头的状态码
            if (400==httpStatus.BAD_REQUEST.value()){
                return ExceptionEnum.BAD_REQUEST;
            }else if (403==httpStatus.FORBIDDEN.value()){
                return  ExceptionEnum.FORBIDDEN;
            }else  if(404==httpStatus.NOT_FOUND.value()){
                return  ExceptionEnum.NOT_FOUND;
            }
        }else  if (httpStatus.is5xxServerError()){
            //5开头的状态码
            if(500==httpStatus.INTERNAL_SERVER_ERROR.value()){
                    return ExceptionEnum.SERVER_EPT;
            }
        }
        //统一返回一个未知错误
        return ExceptionEnum.UNKNOW_ERROR;
    }
    private boolean isIncludeStackTrace(HttpServletRequest request, MediaType produces) {
        ErrorProperties .IncludeStacktrace include = getErrorProperties().getIncludeStacktrace();
        if (include == ErrorProperties.IncludeStacktrace.ALWAYS){
            return true;
        }
        if(include ==  ErrorProperties.IncludeStacktrace.ON_TRACE_PARAM){
            return  getTraceParameter(request);
        }

        return false;

    }

    /**
     * 此处也可以通过注入ServerProperties获取ErrorProperties
     * @return
     */
    protected ErrorProperties getErrorProperties() {
        return new ErrorProperties();
    }
}
