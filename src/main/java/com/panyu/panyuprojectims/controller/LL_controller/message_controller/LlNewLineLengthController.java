package com.panyu.panyuprojectims.controller.LL_controller.message_controller;

import com.panyu.panyuprojectims.service.LlNewLineLengthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("LL")
public class LlNewLineLengthController {

    @Autowired
    private LlNewLineLengthService llNewLineLengthService;

    @RequestMapping("insertLlNewLineLength")
    public @ResponseBody String insertLlNewLineLength(
            String newLineLengthId,
            String newPoleLine,
            String newPipe,
            String directBurialOpticalCable,
            String pushPipe
    ){
        newLineLengthId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = llNewLineLengthService.insertLlNewLineLength(newLineLengthId, newPoleLine, newPipe, directBurialOpticalCable, pushPipe);
        return newLineLengthId;
    }
}
