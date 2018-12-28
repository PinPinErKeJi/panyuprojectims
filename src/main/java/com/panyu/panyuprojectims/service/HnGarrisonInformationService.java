package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.HnGarrisonInformation;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

import java.util.List;

public interface HnGarrisonInformationService{


    //根据驻地网信息id查询包含的id集合
    List<String> selectGarrisonIdList(String garrisonInformationId);


    //导入数据添加
    boolean add(String garrisonInformationId,
                String operator,
                String buildingProject,
                String buildYear,
                String singleProjectName,
                String province,
                String city,
                String county,
                String regionalType,
                String garrisonLongitude,
                String garrisonLatitude,
                String constructionNature,
                String ascriptionEndBureau,

                String supervisorUnitId,
                String constructionOrganizationId,
                String designUnitId,
                String primarySplitterNumberId,
                String secondSplitterNumberId,
                String primarySplitterBoxId,
                String secondSplitterBoxId,
                String cableConnectorBoxId,
                String cableLengthId,
                // 1.
                String onSiteSupervision,
                String professionResponsiblePerson,
                String districtHead,
                //2.
                String constructionCorporateName,
                String constructionLinkman,
                //3.
                String designCorporateName,
                String designConstructionLinkman,
                //4.
                String primaryOneToFour,
                String primaryOneToEight,
                String primaryOneToSixteen,
                //5.
                String secondOneToFour,
                String secondOneToEight,
                String secondOneToSixteen,
                String oneToThirtyTwo,
                String oneToSixtyFour,
                //6.
                String primaryAnchorearType,
                String primaryWallMounted,
                //7.
                String secondAnchorearType,
                String secondWallMounted,
                //8.
                String cableFloorType,
                String cableWallMounted,
                //9.
                String gysts,
                String gysta,
                String buriedServiceLightguide,
                String wallCable,
                String inBridgeCable,
                String gyfxts);




    //添加
    int insertHnGarrisonInformation(String garrisonInformationId,
                                    String operator,
                                    String buildingProject,
                                    String buildYear,
                                    String singleProjectName,
                                    String province,
                                    String city,
                                    String county,
                                    String regionalType,
                                    String garrisonLongitude,
                                    String garrisonLatitude,
                                    String constructionNature,
                                    String ascriptionEndBureau,
                                    String supervisorUnitId,
                                    String constructionOrganizationId,
                                    String designUnitId,
                                    String primarySplitterNumberId,
                                    String secondSplitterNumberId,
                                    String primarySplitterBoxId,
                                    String secondSplitterBoxId,
                                    String cableConnectorBoxId,
                                    String cableLengthId
    );

    //删除
    //删除驻地网基本信息数据时首先根据驻地网基本信息表的ID字段查询出关联的字表ID
    //查询驻地网监理单位表ID字段
    String selectSupervisorUnitIdByGarrisonInformationId(String garrisonInformationId);
    //查询驻地网施工单位表ID字段
    String selectConstructionOrganizationIdByGarrisonInformationId(String garrisonInformationId);
    //查询驻地网设计单位表ID字段
    String selectDesignUnitIdByGarrisonInformationId(String garrisonInformationId);
    //查询一级分光器设计数量表ID字段
    String selectPrimarySplitterNumberIdByGarrisonInformationId(String garrisonInformationId);
    //查询二级分光器设计数量表ID字段
    String selectSecondSplitterNumberIdByGarrisonInformationId(String garrisonInformationId);
    //查询一级分光器箱设计数量表ID字段
    String selectPrimarySplitterBoxIdByGarrisonInformationId(String garrisonInformationId);
    //查询二级分光器箱设计数量表ID字段
    String selectSecondSplitterBoxIdByGarrisonInformationId(String garrisonInformationId);
    //查询光缆交接箱设计数量表ID字段
    String selectCableConnectorBoxIdByGarrisonInformationId(String garrisonInformationId);
    //查询光缆长度表ID字段
    String selectCableLengthIdByGarrisonInformationId(String garrisonInformationId);
    //根据ID字段删除驻地网基本信息
    int deleteHnGarrisonInformationByGarrisonInformationId(String garrisonInformationId);



    //分页模糊匹配查询展示基本信息数据
    PageHelperUtil selectHnGarrisonInformation(
            int page,
            int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String singleProjectName,
            String onSiteSupervision,
            String professionResponsiblePerson,
            String districtHead
    );


    //导出Excel空表格
    List<HnGarrisonInformation> exportExcel_HnGarrisonInformation();


     //导出Excel表格数据
    List<HnGarrisonInformation> export_HnGarrisonInformation(String[] ids);
}