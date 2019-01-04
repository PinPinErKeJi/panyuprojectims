package com.panyu.panyuprojectims.controller.HN_controller.message_controller;

import com.panyu.panyuprojectims.service.HnSecondSplitterBoxNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("HN")
public class HnSecondSplitterBoxNumberController {
    @Autowired private HnSecondSplitterBoxNumberService hnSecondSplitterBoxNumberService;


    //添加
    @RequestMapping("insertHnSecondSplitterBoxNumber")
    public @ResponseBody String insertHnSecondSplitterBoxNumber(String secondSplitterBoxId, String secondAnchorearType, String secondWallMounted){

        secondSplitterBoxId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = hnSecondSplitterBoxNumberService.insertHnSecondSplitterBoxNumber(secondSplitterBoxId, secondAnchorearType, secondWallMounted);
        return secondSplitterBoxId;
    }
}
