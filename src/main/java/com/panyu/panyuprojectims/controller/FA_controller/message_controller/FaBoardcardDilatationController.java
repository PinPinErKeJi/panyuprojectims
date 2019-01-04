package com.panyu.panyuprojectims.controller.FA_controller.message_controller;

import com.panyu.panyuprojectims.service.FaBoardcardDilatationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("FA")
public class FaBoardcardDilatationController {
    @Autowired private FaBoardcardDilatationService faBoardcardDilatationService;

    //添加
    @RequestMapping("insertFaBoardcardDilatation")
    public @ResponseBody String insertFaBoardcardDilatation(
                                       String boardCardDilatationId,
                                       String boardCardNumber,
                                       String boardCardName,
                                       String veneerFunction,
                                       String placeEquipment,
                                       String boardCardDesignQuantity,
                                       String boardCardSupplier,
                                       String boardCardContacts){

        boardCardDilatationId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        boolean b = faBoardcardDilatationService.insertFaBoardcardDilatation(boardCardDilatationId,
                boardCardNumber,
                boardCardName,
                veneerFunction,
                placeEquipment,
                boardCardDesignQuantity,
                boardCardSupplier,
                boardCardContacts);
        return boardCardDilatationId;
    }
}
