package com.panyu.panyuprojectims.controller.FA_controller.message_controller;

import com.panyu.panyuprojectims.service.FaWalkingFrameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("FA")
public class FaWalkingFrameController {
    @Autowired private FaWalkingFrameService faWalkingFrameService;

    //添加
    @RequestMapping("insertFaWalkingFrame")
    public @ResponseBody String insertFaWalkingFrame(String walkingFrameId,
                                String walkingNumber,
                                String walkingDesignLength,
                                String walkingFrameSupplier,
                                String walkingFrameContacts){
        walkingFrameId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        boolean b = faWalkingFrameService.insertFaWalkingFrame(walkingFrameId,
                walkingNumber,
                walkingDesignLength,
                walkingFrameSupplier,
                walkingFrameContacts);

        return walkingFrameId;
    }
}
