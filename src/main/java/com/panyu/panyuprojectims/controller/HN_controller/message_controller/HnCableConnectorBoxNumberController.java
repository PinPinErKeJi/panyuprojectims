package com.panyu.panyuprojectims.controller.HN_controller.message_controller;

import com.panyu.panyuprojectims.service.HnCableConnectorBoxNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("HN")
public class HnCableConnectorBoxNumberController {
    @Autowired private HnCableConnectorBoxNumberService hnCableConnectorBoxNumberService;


    //添加
    @RequestMapping("insertHnCableConnectorBoxNumber")
    public @ResponseBody String insertHnCableConnectorBoxNumber(String cableConnectorBoxId, String cableFloorType, String cableWallMounted){
        cableConnectorBoxId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = hnCableConnectorBoxNumberService.insertHnCableConnectorBoxNumber(cableConnectorBoxId, cableFloorType, cableWallMounted);
        return cableConnectorBoxId;
    }

}
