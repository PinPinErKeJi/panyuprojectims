package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.FaPigtailSkipFiberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class FaPigtailSkipFiberController {
    @Autowired private FaPigtailSkipFiberService faPigtailSkipFiberService;

    //添加
    @RequestMapping("insertFaPigtailSkipFiber")
    public @ResponseBody String insertFaPigtailSkipFiber(String pigtailSkipFiberId,
                                    String pigtailNumber,
                                    String fiberCableType,
                                    String fiberSpecificationModel,
                                    String fiberNumberOfBranches,
                                    String fiberSingleLength,
                                    String forms,
                                    String to2,
                                    String fiberSupplier,
                                    String fiberContacts){
        String[] split = fiberCableType.split(",");
        pigtailSkipFiberId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        boolean b = faPigtailSkipFiberService.insertFaPigtailSkipFiber(pigtailSkipFiberId,
                pigtailNumber,
                split[0],
                fiberSpecificationModel,
                fiberNumberOfBranches,
                fiberSingleLength,
                forms,
                to2,
                fiberSupplier,
                fiberContacts);
        return pigtailSkipFiberId;

    }
}
