package com.panyu.panyuprojectims.controller.LL_controller.message_controller;

import com.panyu.panyuprojectims.service.LlWallMountedOnuNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("LL")
public class LlWallMountedOnuNewController {

    @Autowired
    private LlWallMountedOnuNewService llWallMountedOnuNewService;

    @RequestMapping("insertLlWallMountedOnuNew")
    public @ResponseBody String insertLlWallMountedOnuNew(
            String newWallMountedOnuId,
            String newWallMountedOnuNumber,
            String newWallMountedOnuSize
    ){
        newWallMountedOnuId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = llWallMountedOnuNewService.insertLlWallMountedOnuNew(newWallMountedOnuId, newWallMountedOnuNumber, newWallMountedOnuSize);
        return newWallMountedOnuId;
    }
}
