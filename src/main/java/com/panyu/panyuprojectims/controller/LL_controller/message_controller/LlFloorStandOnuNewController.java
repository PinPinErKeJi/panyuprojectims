package com.panyu.panyuprojectims.controller.LL_controller.message_controller;

import com.panyu.panyuprojectims.service.LlFloorStandOnuNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("LL")
public class LlFloorStandOnuNewController {

    @Autowired
    private LlFloorStandOnuNewService llFloorStandOnuNewService;

    @RequestMapping("insertLlFloorStandOnuNew")
    public @ResponseBody String insertLlFloorStandOnuNew(
            String newFloorStandId,
            String newFloorStandNumber,
            String newFloorStandSize
    ){
        newFloorStandId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = llFloorStandOnuNewService.insertLlFloorStandOnuNew(newFloorStandId, newFloorStandNumber, newFloorStandSize);
        return newFloorStandId;
    }
}
