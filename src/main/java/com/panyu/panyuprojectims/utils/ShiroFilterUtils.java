package com.panyu.panyuprojectims.utils;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.panyu.panyuprojectims.entity.ResponseResult;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//shiro工具类
public class ShiroFilterUtils {
    private final static ObjectMapper objectMapper = new ObjectMapper();
    //判断请求是否是ajax
    public static boolean isaAjax(ServletRequest request){
        String header = ((HttpServletRequest) request).getHeader("X-Requested-With");
        if("XMLHttpRequest".equalsIgnoreCase(header)){
        //当前请求是ajax请求
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
    //Response 输出json
    public static void out(HttpServletResponse response , ResponseResult result){
        PrintWriter out = null;
        response.setCharacterEncoding("UTF-8");//设置编码
        response.setContentType("application/json");//设置返回类型

        try {
            out = response.getWriter();
            out.println(objectMapper.writeValueAsString(result));//输出
            System.out.println("用户在线数量限制响应json信息成功");
        } catch (IOException e) {
            System.out.println("用户在线数量限制响应json信息出错");
            e.printStackTrace();
        }finally {
            if(null != out){
                out.flush();
                out.close();
            }
        }

    }
}
