package com.panyu.panyuprojectims.entity;
public class ProjectProgress {
    private String projectProgressId;           //工程基本信息id
    private String operator;                     //运营商
    private String buildYear;                    //建设年份
    private String buildingProject;             //建设项目名称
    private String planningName;                //规划名称
    private String actualName;                  //实际名称
    private String planningLongitude;         //规划经度
    private String planningLatitude;          //规划纬度
    private String actualLongitude;           //实际经度
    private String actualLatitudes;           //实际纬度
    private String province;                   //省
    private String city;                       //市
    private String county;                    //县区
    private String regions;                   //区域
    private String onSiteSupervision;        //现场监理
    private String professionPeople;         //专业负责人
    private String districtHead;             //区域负责人
    private String overlayScene;             //覆盖场景

    private String skyBranchId;              //天支ID
    private String machineRoomId;           //机房ID
    private String electricPowerId;         //外电引入ID
    private String mainEquipmentId;         //主设备ID
    private String airConditionerId;        //空调ID
    private String fireId;                   //消防设施ID
    private String powerMonitoringId;      //动力监控ID
    //天支表字段
    private String constructionMode;         //天支建设方式
    private String basicType;                //基础类型
    private String foundationConstructionName; //基础施工单位
    private String basicUnitContacts;           //基础施工单位联系人
    private String skyBranchTypeName;      //天支类型
    private String skyBranchSupplierName;  //天支供货厂家
    private String skyBranchSupplierContacts;//天支供货厂家联系人
    private String skyBranchUnitName;       //天支施工单位
    private String skyConstructionUnitContacts;//天支施工单位联系人
    private String skyBranchHeight;        // 天支高度（M）
    //机房字段
    private String machineRoomConstructionMode;//机房建设方式
    private String machineRoomTypeName;         //机房类型
    private String machineRoomConstructionName;//土建单位
    private String civilEngineeringContacts;//土建单位联系人
    private String machineRoomDecorateName;     //装修单位
    private String decorationUnitContacts;//装修施工单位联系人
    //外电引入字段
    private String electricConstructionMode;    //外电建设方式
    private String electricType;                 //外电类型
    private String electricUnitName;            //外电施工单位
    private String electricUnitContacts;       //外电施工单位联系人
    //主设备字段
    private String equipmentConstructionMode;//主设备建设方式
    private String equipmentTypeName;//主设备类型
    private String equipmentSupplierName;//主设备供货厂家
    private String equipmentSupplierContacts;//主设备供货厂家联系人
    private String equipmentUnitName;//主设备施工单位
    private String equipmentUnitContacts;//主设备施工单位联系人
    //空调字段
    private String airConstructionMode;//空调建设方式
    private String conditioningBrandName;//空调品牌
    private String specificationTypeName;//空调规格类型
    private String airUnitName;//空调施工单位
    private String airConstructionContacts;//空调施工单位联系人
    //消防设施字段
    private String fireConstructionMode;//消防建设方式
    private String handHeldNumber;//手提式数量
    private String sprayingMethodNumber;//喷淋式数量
    private String fireSupplierName;//消防供货厂家
    private String fireSupplierContacts;//消防供货厂家联系人
    private String installationUnitName;//消防安装单位
    private String installationUnitContacts;//消防安装单位联系人
    //动力环境监控字段
    private String powerConstructionMode;//动力建设方式
    private String powerSupplierName;//动力供货厂家
    private String powerSupplierContacts;//动力供货厂家联系人
    private String powerUnitName;// 动力施工单位
    private String powerUnitContacts;//动力施工单位联系人

    public ProjectProgress() {
    }

    public ProjectProgress(String projectProgressId, String operator, String buildYear, String buildingProject, String planningName, String actualName, String planningLongitude, String planningLatitude, String actualLongitude, String actualLatitudes, String province, String city, String county, String regions, String onSiteSupervision, String professionPeople, String districtHead, String overlayScene, String skyBranchId, String machineRoomId, String electricPowerId, String mainEquipmentId, String airConditionerId, String fireId, String powerMonitoringId, String constructionMode, String basicType, String foundationConstructionName, String basicUnitContacts, String skyBranchTypeName, String skyBranchSupplierName, String skyBranchSupplierContacts, String skyBranchUnitName, String skyConstructionUnitContacts, String skyBranchHeight, String machineRoomConstructionMode, String machineRoomTypeName, String machineRoomConstructionName, String civilEngineeringContacts, String machineRoomDecorateName, String decorationUnitContacts, String electricConstructionMode, String electricType, String electricUnitName, String electricUnitContacts, String equipmentConstructionMode, String equipmentTypeName, String equipmentSupplierName, String equipmentSupplierContacts, String equipmentUnitName, String equipmentUnitContacts, String airConstructionMode, String conditioningBrandName, String specificationTypeName, String airUnitName, String airConstructionContacts, String fireConstructionMode, String handHeldNumber, String sprayingMethodNumber, String fireSupplierName, String fireSupplierContacts, String installationUnitName, String installationUnitContacts, String powerConstructionMode, String powerSupplierName, String powerSupplierContacts, String powerUnitName, String powerUnitContacts) {
        this.projectProgressId = projectProgressId;
        this.operator = operator;
        this.buildYear = buildYear;
        this.buildingProject = buildingProject;
        this.planningName = planningName;
        this.actualName = actualName;
        this.planningLongitude = planningLongitude;
        this.planningLatitude = planningLatitude;
        this.actualLongitude = actualLongitude;
        this.actualLatitudes = actualLatitudes;
        this.province = province;
        this.city = city;
        this.county = county;
        this.regions = regions;
        this.onSiteSupervision = onSiteSupervision;
        this.professionPeople = professionPeople;
        this.districtHead = districtHead;
        this.overlayScene = overlayScene;
        this.skyBranchId = skyBranchId;
        this.machineRoomId = machineRoomId;
        this.electricPowerId = electricPowerId;
        this.mainEquipmentId = mainEquipmentId;
        this.airConditionerId = airConditionerId;
        this.fireId = fireId;
        this.powerMonitoringId = powerMonitoringId;
        this.constructionMode = constructionMode;
        this.basicType = basicType;
        this.foundationConstructionName = foundationConstructionName;
        this.basicUnitContacts = basicUnitContacts;
        this.skyBranchTypeName = skyBranchTypeName;
        this.skyBranchSupplierName = skyBranchSupplierName;
        this.skyBranchSupplierContacts = skyBranchSupplierContacts;
        this.skyBranchUnitName = skyBranchUnitName;
        this.skyConstructionUnitContacts = skyConstructionUnitContacts;
        this.skyBranchHeight = skyBranchHeight;
        this.machineRoomConstructionMode = machineRoomConstructionMode;
        this.machineRoomTypeName = machineRoomTypeName;
        this.machineRoomConstructionName = machineRoomConstructionName;
        this.civilEngineeringContacts = civilEngineeringContacts;
        this.machineRoomDecorateName = machineRoomDecorateName;
        this.decorationUnitContacts = decorationUnitContacts;
        this.electricConstructionMode = electricConstructionMode;
        this.electricType = electricType;
        this.electricUnitName = electricUnitName;
        this.electricUnitContacts = electricUnitContacts;
        this.equipmentConstructionMode = equipmentConstructionMode;
        this.equipmentTypeName = equipmentTypeName;
        this.equipmentSupplierName = equipmentSupplierName;
        this.equipmentSupplierContacts = equipmentSupplierContacts;
        this.equipmentUnitName = equipmentUnitName;
        this.equipmentUnitContacts = equipmentUnitContacts;
        this.airConstructionMode = airConstructionMode;
        this.conditioningBrandName = conditioningBrandName;
        this.specificationTypeName = specificationTypeName;
        this.airUnitName = airUnitName;
        this.airConstructionContacts = airConstructionContacts;
        this.fireConstructionMode = fireConstructionMode;
        this.handHeldNumber = handHeldNumber;
        this.sprayingMethodNumber = sprayingMethodNumber;
        this.fireSupplierName = fireSupplierName;
        this.fireSupplierContacts = fireSupplierContacts;
        this.installationUnitName = installationUnitName;
        this.installationUnitContacts = installationUnitContacts;
        this.powerConstructionMode = powerConstructionMode;
        this.powerSupplierName = powerSupplierName;
        this.powerSupplierContacts = powerSupplierContacts;
        this.powerUnitName = powerUnitName;
        this.powerUnitContacts = powerUnitContacts;
    }

    public String getProjectProgressId() {
        return projectProgressId;
    }

    public void setProjectProgressId(String projectProgressId) {
        this.projectProgressId = projectProgressId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(String buildYear) {
        this.buildYear = buildYear;
    }

    public String getBuildingProject() {
        return buildingProject;
    }

    public void setBuildingProject(String buildingProject) {
        this.buildingProject = buildingProject;
    }

    public String getPlanningName() {
        return planningName;
    }

    public void setPlanningName(String planningName) {
        this.planningName = planningName;
    }

    public String getActualName() {
        return actualName;
    }

    public void setActualName(String actualName) {
        this.actualName = actualName;
    }

    public String getPlanningLongitude() {
        return planningLongitude;
    }

    public void setPlanningLongitude(String planningLongitude) {
        this.planningLongitude = planningLongitude;
    }

    public String getPlanningLatitude() {
        return planningLatitude;
    }

    public void setPlanningLatitude(String planningLatitude) {
        this.planningLatitude = planningLatitude;
    }

    public String getActualLongitude() {
        return actualLongitude;
    }

    public void setActualLongitude(String actualLongitude) {
        this.actualLongitude = actualLongitude;
    }

    public String getActualLatitudes() {
        return actualLatitudes;
    }

    public void setActualLatitudes(String actualLatitudes) {
        this.actualLatitudes = actualLatitudes;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }

    public String getOnSiteSupervision() {
        return onSiteSupervision;
    }

    public void setOnSiteSupervision(String onSiteSupervision) {
        this.onSiteSupervision = onSiteSupervision;
    }

    public String getProfessionPeople() {
        return professionPeople;
    }

    public void setProfessionPeople(String professionPeople) {
        this.professionPeople = professionPeople;
    }

    public String getDistrictHead() {
        return districtHead;
    }

    public void setDistrictHead(String districtHead) {
        this.districtHead = districtHead;
    }

    public String getOverlayScene() {
        return overlayScene;
    }

    public void setOverlayScene(String overlayScene) {
        this.overlayScene = overlayScene;
    }

    public String getSkyBranchId() {
        return skyBranchId;
    }

    public void setSkyBranchId(String skyBranchId) {
        this.skyBranchId = skyBranchId;
    }

    public String getMachineRoomId() {
        return machineRoomId;
    }

    public void setMachineRoomId(String machineRoomId) {
        this.machineRoomId = machineRoomId;
    }

    public String getElectricPowerId() {
        return electricPowerId;
    }

    public void setElectricPowerId(String electricPowerId) {
        this.electricPowerId = electricPowerId;
    }

    public String getMainEquipmentId() {
        return mainEquipmentId;
    }

    public void setMainEquipmentId(String mainEquipmentId) {
        this.mainEquipmentId = mainEquipmentId;
    }

    public String getAirConditionerId() {
        return airConditionerId;
    }

    public void setAirConditionerId(String airConditionerId) {
        this.airConditionerId = airConditionerId;
    }

    public String getFireId() {
        return fireId;
    }

    public void setFireId(String fireId) {
        this.fireId = fireId;
    }

    public String getPowerMonitoringId() {
        return powerMonitoringId;
    }

    public void setPowerMonitoringId(String powerMonitoringId) {
        this.powerMonitoringId = powerMonitoringId;
    }

    public String getConstructionMode() {
        return constructionMode;
    }

    public void setConstructionMode(String constructionMode) {
        this.constructionMode = constructionMode;
    }

    public String getBasicType() {
        return basicType;
    }

    public void setBasicType(String basicType) {
        this.basicType = basicType;
    }

    public String getFoundationConstructionName() {
        return foundationConstructionName;
    }

    public void setFoundationConstructionName(String foundationConstructionName) {
        this.foundationConstructionName = foundationConstructionName;
    }

    public String getBasicUnitContacts() {
        return basicUnitContacts;
    }

    public void setBasicUnitContacts(String basicUnitContacts) {
        this.basicUnitContacts = basicUnitContacts;
    }

    public String getSkyBranchTypeName() {
        return skyBranchTypeName;
    }

    public void setSkyBranchTypeName(String skyBranchTypeName) {
        this.skyBranchTypeName = skyBranchTypeName;
    }

    public String getSkyBranchSupplierName() {
        return skyBranchSupplierName;
    }

    public void setSkyBranchSupplierName(String skyBranchSupplierName) {
        this.skyBranchSupplierName = skyBranchSupplierName;
    }

    public String getSkyBranchSupplierContacts() {
        return skyBranchSupplierContacts;
    }

    public void setSkyBranchSupplierContacts(String skyBranchSupplierContacts) {
        this.skyBranchSupplierContacts = skyBranchSupplierContacts;
    }

    public String getSkyBranchUnitName() {
        return skyBranchUnitName;
    }

    public void setSkyBranchUnitName(String skyBranchUnitName) {
        this.skyBranchUnitName = skyBranchUnitName;
    }

    public String getSkyConstructionUnitContacts() {
        return skyConstructionUnitContacts;
    }

    public void setSkyConstructionUnitContacts(String skyConstructionUnitContacts) {
        this.skyConstructionUnitContacts = skyConstructionUnitContacts;
    }

    public String getSkyBranchHeight() {
        return skyBranchHeight;
    }

    public void setSkyBranchHeight(String skyBranchHeight) {
        this.skyBranchHeight = skyBranchHeight;
    }

    public String getMachineRoomConstructionMode() {
        return machineRoomConstructionMode;
    }

    public void setMachineRoomConstructionMode(String machineRoomConstructionMode) {
        this.machineRoomConstructionMode = machineRoomConstructionMode;
    }

    public String getMachineRoomTypeName() {
        return machineRoomTypeName;
    }

    public void setMachineRoomTypeName(String machineRoomTypeName) {
        this.machineRoomTypeName = machineRoomTypeName;
    }

    public String getMachineRoomConstructionName() {
        return machineRoomConstructionName;
    }

    public void setMachineRoomConstructionName(String machineRoomConstructionName) {
        this.machineRoomConstructionName = machineRoomConstructionName;
    }

    public String getCivilEngineeringContacts() {
        return civilEngineeringContacts;
    }

    public void setCivilEngineeringContacts(String civilEngineeringContacts) {
        this.civilEngineeringContacts = civilEngineeringContacts;
    }

    public String getMachineRoomDecorateName() {
        return machineRoomDecorateName;
    }

    public void setMachineRoomDecorateName(String machineRoomDecorateName) {
        this.machineRoomDecorateName = machineRoomDecorateName;
    }

    public String getDecorationUnitContacts() {
        return decorationUnitContacts;
    }

    public void setDecorationUnitContacts(String decorationUnitContacts) {
        this.decorationUnitContacts = decorationUnitContacts;
    }

    public String getElectricConstructionMode() {
        return electricConstructionMode;
    }

    public void setElectricConstructionMode(String electricConstructionMode) {
        this.electricConstructionMode = electricConstructionMode;
    }

    public String getElectricType() {
        return electricType;
    }

    public void setElectricType(String electricType) {
        this.electricType = electricType;
    }

    public String getElectricUnitName() {
        return electricUnitName;
    }

    public void setElectricUnitName(String electricUnitName) {
        this.electricUnitName = electricUnitName;
    }

    public String getElectricUnitContacts() {
        return electricUnitContacts;
    }

    public void setElectricUnitContacts(String electricUnitContacts) {
        this.electricUnitContacts = electricUnitContacts;
    }

    public String getEquipmentConstructionMode() {
        return equipmentConstructionMode;
    }

    public void setEquipmentConstructionMode(String equipmentConstructionMode) {
        this.equipmentConstructionMode = equipmentConstructionMode;
    }

    public String getEquipmentTypeName() {
        return equipmentTypeName;
    }

    public void setEquipmentTypeName(String equipmentTypeName) {
        this.equipmentTypeName = equipmentTypeName;
    }

    public String getEquipmentSupplierName() {
        return equipmentSupplierName;
    }

    public void setEquipmentSupplierName(String equipmentSupplierName) {
        this.equipmentSupplierName = equipmentSupplierName;
    }

    public String getEquipmentSupplierContacts() {
        return equipmentSupplierContacts;
    }

    public void setEquipmentSupplierContacts(String equipmentSupplierContacts) {
        this.equipmentSupplierContacts = equipmentSupplierContacts;
    }

    public String getEquipmentUnitName() {
        return equipmentUnitName;
    }

    public void setEquipmentUnitName(String equipmentUnitName) {
        this.equipmentUnitName = equipmentUnitName;
    }

    public String getEquipmentUnitContacts() {
        return equipmentUnitContacts;
    }

    public void setEquipmentUnitContacts(String equipmentUnitContacts) {
        this.equipmentUnitContacts = equipmentUnitContacts;
    }

    public String getAirConstructionMode() {
        return airConstructionMode;
    }

    public void setAirConstructionMode(String airConstructionMode) {
        this.airConstructionMode = airConstructionMode;
    }

    public String getConditioningBrandName() {
        return conditioningBrandName;
    }

    public void setConditioningBrandName(String conditioningBrandName) {
        this.conditioningBrandName = conditioningBrandName;
    }

    public String getSpecificationTypeName() {
        return specificationTypeName;
    }

    public void setSpecificationTypeName(String specificationTypeName) {
        this.specificationTypeName = specificationTypeName;
    }

    public String getAirUnitName() {
        return airUnitName;
    }

    public void setAirUnitName(String airUnitName) {
        this.airUnitName = airUnitName;
    }

    public String getAirConstructionContacts() {
        return airConstructionContacts;
    }

    public void setAirConstructionContacts(String airConstructionContacts) {
        this.airConstructionContacts = airConstructionContacts;
    }

    public String getFireConstructionMode() {
        return fireConstructionMode;
    }

    public void setFireConstructionMode(String fireConstructionMode) {
        this.fireConstructionMode = fireConstructionMode;
    }

    public String getHandHeldNumber() {
        return handHeldNumber;
    }

    public void setHandHeldNumber(String handHeldNumber) {
        this.handHeldNumber = handHeldNumber;
    }

    public String getSprayingMethodNumber() {
        return sprayingMethodNumber;
    }

    public void setSprayingMethodNumber(String sprayingMethodNumber) {
        this.sprayingMethodNumber = sprayingMethodNumber;
    }

    public String getFireSupplierName() {
        return fireSupplierName;
    }

    public void setFireSupplierName(String fireSupplierName) {
        this.fireSupplierName = fireSupplierName;
    }

    public String getFireSupplierContacts() {
        return fireSupplierContacts;
    }

    public void setFireSupplierContacts(String fireSupplierContacts) {
        this.fireSupplierContacts = fireSupplierContacts;
    }

    public String getInstallationUnitName() {
        return installationUnitName;
    }

    public void setInstallationUnitName(String installationUnitName) {
        this.installationUnitName = installationUnitName;
    }

    public String getInstallationUnitContacts() {
        return installationUnitContacts;
    }

    public void setInstallationUnitContacts(String installationUnitContacts) {
        this.installationUnitContacts = installationUnitContacts;
    }

    public String getPowerConstructionMode() {
        return powerConstructionMode;
    }

    public void setPowerConstructionMode(String powerConstructionMode) {
        this.powerConstructionMode = powerConstructionMode;
    }

    public String getPowerSupplierName() {
        return powerSupplierName;
    }

    public void setPowerSupplierName(String powerSupplierName) {
        this.powerSupplierName = powerSupplierName;
    }

    public String getPowerSupplierContacts() {
        return powerSupplierContacts;
    }

    public void setPowerSupplierContacts(String powerSupplierContacts) {
        this.powerSupplierContacts = powerSupplierContacts;
    }

    public String getPowerUnitName() {
        return powerUnitName;
    }

    public void setPowerUnitName(String powerUnitName) {
        this.powerUnitName = powerUnitName;
    }

    public String getPowerUnitContacts() {
        return powerUnitContacts;
    }

    public void setPowerUnitContacts(String powerUnitContacts) {
        this.powerUnitContacts = powerUnitContacts;
    }

    @Override
    public String toString() {
        return "ProjectProgress{" +
                "projectProgressId='" + projectProgressId + '\'' +
                ", operator='" + operator + '\'' +
                ", buildYear='" + buildYear + '\'' +
                ", buildingProject='" + buildingProject + '\'' +
                ", planningName='" + planningName + '\'' +
                ", actualName='" + actualName + '\'' +
                ", planningLongitude='" + planningLongitude + '\'' +
                ", planningLatitude='" + planningLatitude + '\'' +
                ", actualLongitude='" + actualLongitude + '\'' +
                ", actualLatitudes='" + actualLatitudes + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", regions='" + regions + '\'' +
                ", onSiteSupervision='" + onSiteSupervision + '\'' +
                ", professionPeople='" + professionPeople + '\'' +
                ", districtHead='" + districtHead + '\'' +
                ", overlayScene='" + overlayScene + '\'' +
                ", skyBranchId='" + skyBranchId + '\'' +
                ", machineRoomId='" + machineRoomId + '\'' +
                ", electricPowerId='" + electricPowerId + '\'' +
                ", mainEquipmentId='" + mainEquipmentId + '\'' +
                ", airConditionerId='" + airConditionerId + '\'' +
                ", fireId='" + fireId + '\'' +
                ", powerMonitoringId='" + powerMonitoringId + '\'' +
                ", constructionMode='" + constructionMode + '\'' +
                ", basicType='" + basicType + '\'' +
                ", foundationConstructionName='" + foundationConstructionName + '\'' +
                ", basicUnitContacts='" + basicUnitContacts + '\'' +
                ", skyBranchTypeName='" + skyBranchTypeName + '\'' +
                ", skyBranchSupplierName='" + skyBranchSupplierName + '\'' +
                ", skyBranchSupplierContacts='" + skyBranchSupplierContacts + '\'' +
                ", skyBranchUnitName='" + skyBranchUnitName + '\'' +
                ", skyConstructionUnitContacts='" + skyConstructionUnitContacts + '\'' +
                ", skyBranchHeight='" + skyBranchHeight + '\'' +
                ", machineRoomConstructionMode='" + machineRoomConstructionMode + '\'' +
                ", machineRoomTypeName='" + machineRoomTypeName + '\'' +
                ", machineRoomConstructionName='" + machineRoomConstructionName + '\'' +
                ", civilEngineeringContacts='" + civilEngineeringContacts + '\'' +
                ", machineRoomDecorateName='" + machineRoomDecorateName + '\'' +
                ", decorationUnitContacts='" + decorationUnitContacts + '\'' +
                ", electricConstructionMode='" + electricConstructionMode + '\'' +
                ", electricType='" + electricType + '\'' +
                ", electricUnitName='" + electricUnitName + '\'' +
                ", electricUnitContacts='" + electricUnitContacts + '\'' +
                ", equipmentConstructionMode='" + equipmentConstructionMode + '\'' +
                ", equipmentTypeName='" + equipmentTypeName + '\'' +
                ", equipmentSupplierName='" + equipmentSupplierName + '\'' +
                ", equipmentSupplierContacts='" + equipmentSupplierContacts + '\'' +
                ", equipmentUnitName='" + equipmentUnitName + '\'' +
                ", equipmentUnitContacts='" + equipmentUnitContacts + '\'' +
                ", airConstructionMode='" + airConstructionMode + '\'' +
                ", conditioningBrandName='" + conditioningBrandName + '\'' +
                ", specificationTypeName='" + specificationTypeName + '\'' +
                ", airUnitName='" + airUnitName + '\'' +
                ", airConstructionContacts='" + airConstructionContacts + '\'' +
                ", fireConstructionMode='" + fireConstructionMode + '\'' +
                ", handHeldNumber='" + handHeldNumber + '\'' +
                ", sprayingMethodNumber='" + sprayingMethodNumber + '\'' +
                ", fireSupplierName='" + fireSupplierName + '\'' +
                ", fireSupplierContacts='" + fireSupplierContacts + '\'' +
                ", installationUnitName='" + installationUnitName + '\'' +
                ", installationUnitContacts='" + installationUnitContacts + '\'' +
                ", powerConstructionMode='" + powerConstructionMode + '\'' +
                ", powerSupplierName='" + powerSupplierName + '\'' +
                ", powerSupplierContacts='" + powerSupplierContacts + '\'' +
                ", powerUnitName='" + powerUnitName + '\'' +
                ", powerUnitContacts='" + powerUnitContacts + '\'' +
                '}';
    }
}