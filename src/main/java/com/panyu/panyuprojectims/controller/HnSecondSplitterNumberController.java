package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.HnSecondSplitterNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class HnSecondSplitterNumberController {
    @Autowired private HnSecondSplitterNumberService hnSecondSplitterNumberService;

    //添加
    @RequestMapping("insertHnSecondSplitterNumber")
    public @ResponseBody String insertHnSecondSplitterNumber(String secondSplitterNumberId, String secondOneToFour, String secondOneToEight,
                                        String secondOneToSixteen, String oneToThirtyTwo, String oneToSixtyFour){
        secondSplitterNumberId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = hnSecondSplitterNumberService.insertHnSecondSplitterNumber(secondSplitterNumberId, secondOneToFour, secondOneToEight,
                secondOneToSixteen, oneToThirtyTwo, oneToSixtyFour);
        return secondSplitterNumberId;
    }
}
