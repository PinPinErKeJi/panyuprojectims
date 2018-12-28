package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.IndoorCoverageInformation;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

import java.util.List;

public interface IndoorCoverageInformationService{


    //根据信息id获取包含的模块id
    List<String> selectIndoorCoverageIdList(String indoorInformationId);

    //添加
    int insertIndoorCoverageInformation(String indoorInformationId,
                                        String operator,
                                        String buildingProject,
                                        String buildYear,
                                        String planStationName,
                                        String actualStationName,
                                        String indoorLongitude,
                                        String indoorLatitude,
                                        String province,
                                        String city,
                                        String county,
                                        String subordinateDepartment,
                                        String coverType,
                                        String icSupervisoryUnitId,
                                        String icConstructionId,
                                        String icDesignUnitId,
                                        String bbuNumberId,
                                        String rruNumber,
                                        String lightNumberId,
                                        String passiveDeviceNumberId,
                                        String antennaNumberId,
                                        String cableLengthId,
                                        String ammeterNumber
    );


    //模糊匹配查询展示室内覆盖基本信息数据
    PageHelperUtil selectAllIndoorCoverageInformation(
            int start,
            int end,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String professionResponsiblePerson,
            String districtHead,
            String siteLeader
    );
    //根据室内覆盖基本信息ID查询关联的小表ID（基于删除大表必须先删除小表的规则）
    String selectIcSupervisoryUnitIdByIndoorInformationId(String indoorInformationId);
    String selectIcConstructionIdByIndoorInformationId(String indoorInformationId);
    String selectIcDesignUnitIdByIndoorInformationId(String indoorInformationId);
    String selectBbuNumberIdByIndoorInformationId(String indoorInformationId);
    String selectLightNumberIdByIndoorInformationId(String indoorInformationId);
    String selectPassiveDeviceNumberIdByIndoorInformationId(String indoorInformationId);
    String selectAntennaNumberIdByIndoorInformationId(String indoorInformationId);
    String selectCableLengthIdByIndoorInformationId(String indoorInformationId);
    //根据室内覆盖基本信息ID删除选中项
    int deleteIndoorCoverageInformationByIndoorInformationId(String indoorInformationId);

    //导出室内覆盖Excel空表格
    List<IndoorCoverageInformation> importIndoorCoverInformationNullExcel();

    //导出室内覆盖Excel表格数据
    List<IndoorCoverageInformation> importIndoorCoverInformationExcel(String[] ids);

    //导入数据
    boolean add(String indoorInformationId,//基本信息ID
                String operator,//运营商
                String buildingProject,//建设项目名称
                String buildYear,//建设年份
                String planStationName,//规划站名
                String actualStationName,//实际站名
                String indoorLongitude,//经度
                String indoorLatitude,//纬度
                String province,//省
                String city,//市
                String county,//区(县)
                String subordinateDepartment,//所属部门
                String coverType,//覆盖类型
                String icSupervisoryUnitId,//监理单位ID
                String icConstructionId,//施工单位ID
                String icDesignUnitId,//设计单位ID
                String bbuNumberId,//BBU数量ID
                String lightNumberId,//光分布设备数量ID
                String passiveDeviceNumberId,//无源器件数量ID
                String antennaNumberId,//天线数量ID
                String cableLengthId,//线缆长度ID
                String professionResponsiblePerson,//专业负责人
                String districtHead,//区域负责人
                String siteLeader,//现场负责人
                String icCorporateName,//公司名称
                String personInCharge,//负责人
                String designCorporateName,//公司名称
                String designPersonInCharge,//负责人
                String centralization,//集中放置
                String wallHangingWall,//小区挂墙
                String rruNumber,//RRU数量
                String easyMacro,//EasyMacro
                String bookrruNotIntegratedAntenna,//BOOK RRU(不集成天线)
                String bookrruIntegratedAntenna,//BOOK RRU(集成天线)
                String hub,//HUB
                String pruIntegratedAntenna,//PRU（集成天线）
                String pruNotIntegratedAntenna,//PRU（不集成天线）
                String accessUnit,//接入单元（近端）
                String extensionUnit,//扩展单元
                String remoteDeviceIndoor,//远端设备(室内)
                String remoteDeviceOutdoor,//远端设备(室外)
                String powerDivider,//功分器
                String coupler,//耦合器
                String roadConnector,//合路器
                String loadNumber,//负载
                String indoorAntenna,//室内天线
                String outdoorAntenna,//室外天线
                String elevatorAntenna,//电梯天线
                String gpsAntenna,//GPS天线
                String networkLine,//网线
                String photoelectricCompositeCable,//光电复合缆
                String sevenEighthsFeeder,//7/8馈线
                String ahalfFeeder,//1/2馈线
                String ammeterNumber);//电表数量（端）
}