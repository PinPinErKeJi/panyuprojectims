package com.panyu.panyuprojectims.utils;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class MD5 {

    public String pwdMd5(String userName ,String userPwd){
        // 将用户名作为盐值
        ByteSource salt = ByteSource.Util.bytes(userName);
        String newPs = new SimpleHash("MD5", userPwd, salt, 1024).toHex();
        return newPs;
    }
}
