package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.LlDesignInstituteDao;
import com.panyu.panyuprojectims.service.LlDesignInstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LlDesignInstituteServiceImpl implements LlDesignInstituteService{
    @Autowired
    private LlDesignInstituteDao llDesignInstituteDao;

    //根据线路设计单位表ID删除选中项
    @Override
    public int deleteLlDesignInstitute(String designInstituteId) {
        return llDesignInstituteDao.deleteLlDesignInstitute(designInstituteId);
    }
    //添加
    @Override
    public int insertLlDesignInstitute(String designInstituteId, String companyName, String designPersonnel) {
        return llDesignInstituteDao.insertLlDesignInstitute(designInstituteId, companyName, designPersonnel);
    }
}