package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.GarrisonDTO;
import com.panyu.panyuprojectims.entity.HnGarrisonInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HnGarrisonInformationDao{

    //分页模糊匹配查询展示基本信息数据总条数
    long getHnGarrisonInformationRowCount(
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("buildingProject") String buildingProject,
            @Param("operator") String operator,
            @Param("singleProjectName") String singleProjectName,
            @Param("keyword") String onSiteSupervision,
            @Param("keyword") String professionResponsiblePerson,
            @Param("keyword") String districtHead);
    //分页模糊匹配查询展示基本信息数据
    List<HnGarrisonInformation> selectHnGarrisonInformation(
            @Param("start") int start,
            @Param("end") int end,
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("buildingProject") String buildingProject,
            @Param("operator") String operator,
            @Param("singleProjectName") String singleProjectName,
            @Param("keyword") String onSiteSupervision,
            @Param("keyword") String professionResponsiblePerson,
            @Param("keyword") String districtHead);

    //添加
    int insertHnGarrisonInformation(@Param("garrisonInformationId") String garrisonInformationId,
                                    @Param("operator") String operator,
                                    @Param("buildingProject") String buildingProject,
                                    @Param("buildYear") String buildYear,
                                    @Param("singleProjectName") String singleProjectName,
                                    @Param("province") String province,
                                    @Param("city") String city,
                                    @Param("county") String county,
                                    @Param("regionalType") String regionalType,
                                    @Param("garrisonLongitude") String garrisonLongitude,
                                    @Param("garrisonLatitude") String garrisonLatitude,
                                    @Param("constructionNature") String constructionNature,
                                    @Param("ascriptionEndBureau") String ascriptionEndBureau,
                                    @Param("supervisorUnitId") String supervisorUnitId,
                                    @Param("constructionOrganizationId") String constructionOrganizationId,
                                    @Param("designUnitId") String designUnitId,
                                    @Param("primarySplitterNumberId") String primarySplitterNumberId,
                                    @Param("secondSplitterNumberId") String secondSplitterNumberId,
                                    @Param("primarySplitterBoxId") String primarySplitterBoxId,
                                    @Param("secondSplitterBoxId") String secondSplitterBoxId,
                                    @Param("cableConnectorBoxId") String cableConnectorBoxId,
                                    @Param("cableLengthId") String cableLengthId
    );


    //删除
    //删除驻地网基本信息数据时首先根据驻地网基本信息表的ID字段查询出关联的字表ID
    //查询驻地网监理单位表ID字段
    String selectSupervisorUnitIdByGarrisonInformationId(@Param("garrisonInformationId") String garrisonInformationId);
    //查询驻地网施工单位表ID字段
    String selectConstructionOrganizationIdByGarrisonInformationId(@Param("garrisonInformationId") String garrisonInformationId);
    //查询驻地网设计单位表ID字段
    String selectDesignUnitIdByGarrisonInformationId(@Param("garrisonInformationId") String garrisonInformationId);
    //查询一级分光器设计数量表ID字段
    String selectPrimarySplitterNumberIdByGarrisonInformationId(@Param("garrisonInformationId") String garrisonInformationId);
    //查询二级分光器设计数量表ID字段
    String selectSecondSplitterNumberIdByGarrisonInformationId(@Param("garrisonInformationId") String garrisonInformationId);
    //查询一级分光器箱设计数量表ID字段
    String selectPrimarySplitterBoxIdByGarrisonInformationId(@Param("garrisonInformationId") String garrisonInformationId);
    //查询二级分光器箱设计数量表ID字段
    String selectSecondSplitterBoxIdByGarrisonInformationId(@Param("garrisonInformationId") String garrisonInformationId);
    //查询光缆交接箱设计数量表ID字段
    String selectCableConnectorBoxIdByGarrisonInformationId(@Param("garrisonInformationId") String garrisonInformationId);
    //查询光缆长度表ID字段
    String selectCableLengthIdByGarrisonInformationId(@Param("garrisonInformationId") String garrisonInformationId);
    //根据ID字段删除驻地网基本信息
    int deleteHnGarrisonInformationByGarrisonInformationId(@Param("garrisonInformationId") String garrisonInformationId);


    /*
  * 导出Excel空表格
  * */
    List<HnGarrisonInformation> exportExcel_HnGarrisonInformation();

    /*
    * 导出Excel表格数据
    * */
    List<HnGarrisonInformation> export_HnGarrisonInformation(String[] ids);

}