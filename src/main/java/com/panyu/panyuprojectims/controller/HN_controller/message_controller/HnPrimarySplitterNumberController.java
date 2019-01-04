package com.panyu.panyuprojectims.controller.HN_controller.message_controller;

import com.panyu.panyuprojectims.service.HnPrimarySplitterNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("HN")
public class HnPrimarySplitterNumberController {
    @Autowired private HnPrimarySplitterNumberService hnPrimarySplitterNumberService;

    //添加
    @RequestMapping("insertHnPrimarySplitterNumber")
    public @ResponseBody String insertHnPrimarySplitterNumber(String primarySplitterNumberId, String primaryOneToFour, String primaryOneToEight, String primaryOneToSixteen){
        primarySplitterNumberId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = hnPrimarySplitterNumberService.insertHnPrimarySplitterNumber(primarySplitterNumberId, primaryOneToFour, primaryOneToEight, primaryOneToSixteen);
        return primarySplitterNumberId;
    }




}
