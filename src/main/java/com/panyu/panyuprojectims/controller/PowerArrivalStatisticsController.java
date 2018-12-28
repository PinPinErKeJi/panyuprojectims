package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.PowerArrivalStatisticsService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PowerArrivalStatisticsController {

    @Autowired
    private PowerArrivalStatisticsService powerArrivalStatisticsService;

    @RequestMapping("selectPowerArrivalStatistics")
    public @ResponseBody
    PageHelperUtil selectPowerArrivalStatistics(
            Integer page, Integer rows,
            String province,
            String city,
            String county,
            String buildYear,
            String operator,
            String buildingProject,
            String siteSupervision,
            String projectLeader
    ){
        PageHelperUtil pageHelperUtil = powerArrivalStatisticsService.selectPowerArrivalStatistics(page, rows, province, city, county, buildYear, operator, buildingProject, siteSupervision, projectLeader);
        return pageHelperUtil;
    }
}
