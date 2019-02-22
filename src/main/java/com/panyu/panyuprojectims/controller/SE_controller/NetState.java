package com.panyu.panyuprojectims.controller.SE_controller;

import org.springframework.stereotype.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Controller
public class NetState {
    public boolean isConnect() throws IOException {
        boolean connect = false;
        Runtime runtime = Runtime.getRuntime();
        Process process;
        try {
            process = runtime.exec("ping " +"www.baidu.com");
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is,"GBK");
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            StringBuffer sb = new StringBuffer();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            is.close();
            isr.close();
            br.close();

            System.out.println("返回值  ："+sb);

            if (null != sb && !sb.toString().equals("")) {
                String logString = "";
                if (sb.toString().indexOf("TTL") > 0) {
                    // 网络畅通
                    connect = true;
                } else {
                    // 网络不畅通
                    connect = false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return connect;
    }
}
