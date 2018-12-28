package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.FaFiberOpticChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class FaFiberOpticChannelController {
    @Autowired private FaFiberOpticChannelService faFiberOpticChannelService;

    //添加
    @RequestMapping("insertFaFiberOpticChannel")
    public @ResponseBody String insertFaFiberOpticChannel(String fiberOpticChannelId,
                                                          String fiberOpticNumber,
                                                          String fiberOpticDesignLength,
                                                          String fiberOpticSupplier,
                                                          String fiberOpticContacts){
        fiberOpticChannelId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        //System.out.println("id:"+fiberOpticChannelId);
        boolean b = faFiberOpticChannelService.insertFaFiberOpticChannel(fiberOpticChannelId,
                fiberOpticNumber,
                fiberOpticDesignLength,
                fiberOpticSupplier,
                fiberOpticContacts);

        return fiberOpticChannelId;
    }
}
