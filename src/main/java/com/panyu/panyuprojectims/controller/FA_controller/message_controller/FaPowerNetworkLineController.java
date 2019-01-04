package com.panyu.panyuprojectims.controller.FA_controller.message_controller;

import com.panyu.panyuprojectims.service.FaPowerNetworkLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("FA")
public class FaPowerNetworkLineController {
    @Autowired private FaPowerNetworkLineService faPowerNetworkLineService;

    //添加
    @RequestMapping("insertFaPowerNetworkLine")
    public @ResponseBody String insertFaPowerNetworkLine(String powerNetworkLineId,
                                    String powerNumber,
                                    String cableType,
                                    String specificationModel,
                                    String numberOfBranches,
                                    String singleLength,
                                    String totalLength,
                                    String froms,
                                    String to1,
                                    String powerSupplier,
                                    String powerContacts){
        powerNetworkLineId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        String[] split = cableType.split(",");

        boolean b = faPowerNetworkLineService.insertFaPowerNetworkLine(powerNetworkLineId,
                powerNumber,
                split[0],
                specificationModel,
                numberOfBranches,
                singleLength,
                totalLength,
                froms,
                to1,
                powerSupplier,
                powerContacts);
        return powerNetworkLineId;
    }
}
