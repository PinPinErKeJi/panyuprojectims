package com.panyu.panyuprojectims.controller.BS_controller.message_controller;

import com.panyu.panyuprojectims.service.MachineRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("BS")
public class MachineRoomController {
    @Autowired private MachineRoomService machineRoomService;
    @RequestMapping("insertMachineRoom")
    public @ResponseBody String insertMachineRoom(String machineRoomId,
                                                  String machineRoomConstructionMode,
                                                  String machineRoomTypeName,
                                                  String machineRoomConstructionName,
                                                  String civilEngineeringContacts,
                                                  String machineRoomDecorateName,
                                                  String decorationUnitContacts){
        String[] split = machineRoomConstructionMode.split(",");
        String[] split1 = machineRoomTypeName.split(",");
        machineRoomId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        boolean b = machineRoomService.insertMachineRoom(
                machineRoomId,split[0],
                split1[0],
                machineRoomConstructionName,
                civilEngineeringContacts,
                machineRoomDecorateName,
                decorationUnitContacts);
        return machineRoomId;
    }
}
