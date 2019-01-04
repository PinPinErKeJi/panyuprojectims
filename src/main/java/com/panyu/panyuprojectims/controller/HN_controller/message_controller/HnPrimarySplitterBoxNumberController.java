package com.panyu.panyuprojectims.controller.HN_controller.message_controller;

import com.panyu.panyuprojectims.service.HnPrimarySplitterBoxNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("HN")
public class HnPrimarySplitterBoxNumberController {
    @Autowired private HnPrimarySplitterBoxNumberService hnPrimarySplitterBoxNumberService;

    //添加
    @RequestMapping("insertHnPrimarySplitterBoxNumber")
    public @ResponseBody String insertHnPrimarySplitterBoxNumber(String primarySplitterBoxId, String primaryAnchorearType, String primaryWallMounted){
        primarySplitterBoxId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = hnPrimarySplitterBoxNumberService.insertHnPrimarySplitterBoxNumber(primarySplitterBoxId, primaryAnchorearType, primaryWallMounted);

        return primarySplitterBoxId;
    }

}
