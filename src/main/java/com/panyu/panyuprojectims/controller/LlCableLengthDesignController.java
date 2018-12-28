package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.LlCableLengthDesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class LlCableLengthDesignController {

    @Autowired
    private LlCableLengthDesignService llCableLengthDesignService;

    @RequestMapping("insertLlCableLengthDesign")
    public @ResponseBody
    String insertLlCableLengthDesign(
            String cableLengthDesignId,
            String gystsSuspended,
            String gystsSuspensionWire,
            String gysta,
            String plowInOpticalCable,
            String wallCable,
            String inBridgeCable,
            String gyfxts
    ){
        cableLengthDesignId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = llCableLengthDesignService.insertLlCableLengthDesign(cableLengthDesignId, gystsSuspended, gystsSuspensionWire, gysta, plowInOpticalCable, wallCable, inBridgeCable, gyfxts);
        return cableLengthDesignId;
    }
}
