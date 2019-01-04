package com.panyu.panyuprojectims.controller.LL_controller.message_controller;

import com.panyu.panyuprojectims.service.LlWallMountedOnuWornService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("LL")
public class LlWallMountedOnuWornController {

    @Autowired
    private LlWallMountedOnuWornService llWallMountedOnuWornService;

    @RequestMapping("insertLlWallMountedOnuWorn")
    public @ResponseBody String insertLlWallMountedOnuWorn(
            String wornWallMountedOnuId,
            String wornWallMountedOnuNumber,
            String wornWallMountedOnuSize
    ){
        wornWallMountedOnuId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = llWallMountedOnuWornService.insertLlWallMountedOnuWorn(wornWallMountedOnuId, wornWallMountedOnuNumber, wornWallMountedOnuSize);
        return wornWallMountedOnuId;
    }
}
