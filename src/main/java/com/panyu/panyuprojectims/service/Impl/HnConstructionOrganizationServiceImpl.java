package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.HnConstructionOrganizationDao;
import com.panyu.panyuprojectims.entity.HnConstructionOrganization;
import com.panyu.panyuprojectims.service.HnConstructionOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HnConstructionOrganizationServiceImpl implements HnConstructionOrganizationService{
    @Autowired
    private HnConstructionOrganizationDao hnConstructionOrganizationDao;


    //根据驻地网施工单位表ID字段删除数据
    @Override
    public int deleteHnConstructionOrganizationByConstructionOrganizationId(String constructionOrganizationId) {
        return hnConstructionOrganizationDao.deleteHnConstructionOrganizationByConstructionOrganizationId(constructionOrganizationId);
    }

    //添加
    @Override
    public int insertHnConstructionOrganization(String constructionOrganizationId, String constructionCorporateName, String constructionLinkman) {
        return hnConstructionOrganizationDao.insertHnConstructionOrganization(constructionOrganizationId,constructionCorporateName,constructionLinkman);
    }
}