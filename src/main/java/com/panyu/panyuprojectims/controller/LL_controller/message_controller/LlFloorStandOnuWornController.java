package com.panyu.panyuprojectims.controller.LL_controller.message_controller;

import com.panyu.panyuprojectims.service.LlFloorStandOnuWornService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("LL")
public class LlFloorStandOnuWornController {

    @Autowired
    private LlFloorStandOnuWornService llFloorStandOnuWornService;

    @RequestMapping("insertLlFloorStandOnuWorn")
    public @ResponseBody String insertLlFloorStandOnuWorn(
            String wornFloorStandId,
            String wornFloorStandNumber,
            String wornFloorStandSize
    ){
        wornFloorStandId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = llFloorStandOnuWornService.insertLlFloorStandOnuWorn(wornFloorStandId, wornFloorStandNumber, wornFloorStandSize);
        return wornFloorStandId;
    }
}
