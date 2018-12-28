package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.LlDesignInstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class LlDesignInstituteController {

    @Autowired
    private LlDesignInstituteService llDesignInstituteService;

    @RequestMapping("insertLlDesignInstitute")
    public @ResponseBody String insertLlDesignInstitute(
            String designInstituteId,
            String companyName,
            String designPersonnel
    ){
        designInstituteId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = llDesignInstituteService.insertLlDesignInstitute(designInstituteId, companyName, designPersonnel);
        return designInstituteId;
    }
}
