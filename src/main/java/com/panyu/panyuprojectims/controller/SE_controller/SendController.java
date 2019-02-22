package com.panyu.panyuprojectims.controller.SE_controller;

import com.panyu.panyuprojectims.model.ResponseResult;
import com.panyu.panyuprojectims.send.MobileMessageCheck;
import com.panyu.panyuprojectims.send.SendCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/verify-master")
public class SendController {

    @RequestMapping("/sendCode")
    @ResponseBody
    public String sendCone(String userTel) throws Exception {
        NetState netState = new NetState();
        String senCode = "";
        try {
            boolean connect = netState.isConnect();
            if (connect == true) {
                String sen = SendCode.senCode(userTel);
                if (sen!=null && sen.equals("SUCCESS")) {
                    senCode="验证码发送成功,请注意查询。";
                } else {
                    senCode="验证码发送失败,请稍后继续。";
                }
            } else{
                senCode="服务器网络中断,请检查网络。";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return senCode;
    }

    @RequestMapping("/messageCheck")
    @ResponseBody
    public ResponseResult MobileMessageCheck(String userTel,String code,HttpServletResponse response) throws IOException {
        ResponseResult responseResult=new ResponseResult();
        String codeMessage = MobileMessageCheck.checkMsg(userTel, code);
        String cookieName = "codeMessage";
        String cookieValue= codeMessage;
        Cookie myCookie=new Cookie(cookieName,cookieValue);
        myCookie.setMaxAge(60*5);
        response.addCookie(myCookie);

        if (codeMessage!=null&&codeMessage.equals("SUCCESS")) {
            responseResult.setMsg("验证码输入正确，请继续。");
        } else {
            responseResult.setMsg("验证码验证错误，请重新输入");
            responseResult.setCode(1);
        }
        return responseResult;
    }
}
