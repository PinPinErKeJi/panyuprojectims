package com.panyu.panyuprojectims.entity;
public class FaEquipmentProjectProgress {
    private String equipmentProjectProgressId;//设备工程进度表ID
    private String operator;//运营商
    private String buildYear;//建设年份
    private String buildingProject;//建设项目
    private String motorRoomName;//机房名称
    private String motorRoomLongitude;//机房经度
    private String motorRoomLatitude;//机房纬度
    private String province;//省
    private String city;//市
    private String county;//县（区）
    private String onSiteSupervision;//现场监理
    private String projectLeader;//项目负责人


    private String newEquipmentId;//新增设备ID
    private String dilatantVeneerId;//扩容单板ID
    private String newCableId;//新增线缆ID
    private String newWalkingFrameId;//新增走线架ID
    private String newFiberOpticChannelId;//新增光纤槽道ID

    private String newEquipmentNumber;//编号
    private String newEquipmentType;//类型
    private String newEquipmentName;//设备名称
    private String newEquipmentModel;//设备型号
    private String newEquipmentArrival;//到货
    private String newEquipmentInstall;//安装
    private String newEquipmentPowerUp;//加电
    private String newEquipmentLinkDebugging;//链路调试
    private String singleMachineDebugging;//单机调试
    private String networkingDebugging;//联网调试
    private String cutAccessNetwork;//割接入网

    private String dilatantVeneerNumber;//编号
    private String dilatantVeneerName;//单板名称
    private String dilatantVeneerFunction;//单板功能
    private String veneerPlaceEquipment;//所在设备
    private String dilatantVeneerEsignQuantity;//设计数量
    private String dilatantVeneerInstall;//单板安装
    private String veneerCutAccessNetwork;//割接入网

    private String newCableNumber;//编号
    private String newCableType;//线缆类型
    private String newCableSpecificationModel;//规格型号
    private String newCableLength;//长度（m）
    private String newCableForm;//From
    private String newCableTo;//To
    private String cableConstructionProgress;//施工进度
    private String newCableMakespan;//完工时间

    private String newWalkingFrameLength;//长度（m）
    private String walkingConstructionProgress;//施工进度
    private String newWalkingFrameMakespan;//完工时间

    private String newFiberOpticChannelLength;//长度（m）
    private String channelConstructionProgress;//施工进度
    private String channelFrameMakespan;//完工时间

    public FaEquipmentProjectProgress() {
        super();
    }

    public FaEquipmentProjectProgress(String equipmentProjectProgressId, String operator, String buildYear, String buildingProject, String motorRoomName, String motorRoomLongitude, String motorRoomLatitude, String province, String city, String county, String onSiteSupervision, String projectLeader, String newEquipmentId, String dilatantVeneerId, String newCableId, String newWalkingFrameId, String newFiberOpticChannelId, String newEquipmentNumber, String newEquipmentType, String newEquipmentName, String newEquipmentModel, String newEquipmentArrival, String newEquipmentInstall, String newEquipmentPowerUp, String newEquipmentLinkDebugging, String singleMachineDebugging, String networkingDebugging, String cutAccessNetwork, String dilatantVeneerNumber, String dilatantVeneerName, String dilatantVeneerFunction, String veneerPlaceEquipment, String dilatantVeneerEsignQuantity, String dilatantVeneerInstall, String veneerCutAccessNetwork, String newCableNumber, String newCableType, String newCableSpecificationModel, String newCableLength, String newCableForm, String newCableTo, String cableConstructionProgress, String newCableMakespan, String newWalkingFrameLength, String walkingConstructionProgress, String newWalkingFrameMakespan, String newFiberOpticChannelLength, String channelConstructionProgress, String channelFrameMakespan) {
        this.equipmentProjectProgressId = equipmentProjectProgressId;
        this.operator = operator;
        this.buildYear = buildYear;
        this.buildingProject = buildingProject;
        this.motorRoomName = motorRoomName;
        this.motorRoomLongitude = motorRoomLongitude;
        this.motorRoomLatitude = motorRoomLatitude;
        this.province = province;
        this.city = city;
        this.county = county;
        this.onSiteSupervision = onSiteSupervision;
        this.projectLeader = projectLeader;
        this.newEquipmentId = newEquipmentId;
        this.dilatantVeneerId = dilatantVeneerId;
        this.newCableId = newCableId;
        this.newWalkingFrameId = newWalkingFrameId;
        this.newFiberOpticChannelId = newFiberOpticChannelId;
        this.newEquipmentNumber = newEquipmentNumber;
        this.newEquipmentType = newEquipmentType;
        this.newEquipmentName = newEquipmentName;
        this.newEquipmentModel = newEquipmentModel;
        this.newEquipmentArrival = newEquipmentArrival;
        this.newEquipmentInstall = newEquipmentInstall;
        this.newEquipmentPowerUp = newEquipmentPowerUp;
        this.newEquipmentLinkDebugging = newEquipmentLinkDebugging;
        this.singleMachineDebugging = singleMachineDebugging;
        this.networkingDebugging = networkingDebugging;
        this.cutAccessNetwork = cutAccessNetwork;
        this.dilatantVeneerNumber = dilatantVeneerNumber;
        this.dilatantVeneerName = dilatantVeneerName;
        this.dilatantVeneerFunction = dilatantVeneerFunction;
        this.veneerPlaceEquipment = veneerPlaceEquipment;
        this.dilatantVeneerEsignQuantity = dilatantVeneerEsignQuantity;
        this.dilatantVeneerInstall = dilatantVeneerInstall;
        this.veneerCutAccessNetwork = veneerCutAccessNetwork;
        this.newCableNumber = newCableNumber;
        this.newCableType = newCableType;
        this.newCableSpecificationModel = newCableSpecificationModel;
        this.newCableLength = newCableLength;
        this.newCableForm = newCableForm;
        this.newCableTo = newCableTo;
        this.cableConstructionProgress = cableConstructionProgress;
        this.newCableMakespan = newCableMakespan;
        this.newWalkingFrameLength = newWalkingFrameLength;
        this.walkingConstructionProgress = walkingConstructionProgress;
        this.newWalkingFrameMakespan = newWalkingFrameMakespan;
        this.newFiberOpticChannelLength = newFiberOpticChannelLength;
        this.channelConstructionProgress = channelConstructionProgress;
        this.channelFrameMakespan = channelFrameMakespan;
    }

    public String getEquipmentProjectProgressId() {
        return equipmentProjectProgressId;
    }

    public void setEquipmentProjectProgressId(String equipmentProjectProgressId) {
        this.equipmentProjectProgressId = equipmentProjectProgressId;
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

    public String getMotorRoomName() {
        return motorRoomName;
    }

    public void setMotorRoomName(String motorRoomName) {
        this.motorRoomName = motorRoomName;
    }

    public String getMotorRoomLongitude() {
        return motorRoomLongitude;
    }

    public void setMotorRoomLongitude(String motorRoomLongitude) {
        this.motorRoomLongitude = motorRoomLongitude;
    }

    public String getMotorRoomLatitude() {
        return motorRoomLatitude;
    }

    public void setMotorRoomLatitude(String motorRoomLatitude) {
        this.motorRoomLatitude = motorRoomLatitude;
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

    public String getOnSiteSupervision() {
        return onSiteSupervision;
    }

    public void setOnSiteSupervision(String onSiteSupervision) {
        this.onSiteSupervision = onSiteSupervision;
    }

    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
    }

    public String getNewEquipmentId() {
        return newEquipmentId;
    }

    public void setNewEquipmentId(String newEquipmentId) {
        this.newEquipmentId = newEquipmentId;
    }

    public String getDilatantVeneerId() {
        return dilatantVeneerId;
    }

    public void setDilatantVeneerId(String dilatantVeneerId) {
        this.dilatantVeneerId = dilatantVeneerId;
    }

    public String getNewCableId() {
        return newCableId;
    }

    public void setNewCableId(String newCableId) {
        this.newCableId = newCableId;
    }

    public String getNewWalkingFrameId() {
        return newWalkingFrameId;
    }

    public void setNewWalkingFrameId(String newWalkingFrameId) {
        this.newWalkingFrameId = newWalkingFrameId;
    }

    public String getNewFiberOpticChannelId() {
        return newFiberOpticChannelId;
    }

    public void setNewFiberOpticChannelId(String newFiberOpticChannelId) {
        this.newFiberOpticChannelId = newFiberOpticChannelId;
    }

    public String getNewEquipmentNumber() {
        return newEquipmentNumber;
    }

    public void setNewEquipmentNumber(String newEquipmentNumber) {
        this.newEquipmentNumber = newEquipmentNumber;
    }

    public String getNewEquipmentType() {
        return newEquipmentType;
    }

    public void setNewEquipmentType(String newEquipmentType) {
        this.newEquipmentType = newEquipmentType;
    }

    public String getNewEquipmentName() {
        return newEquipmentName;
    }

    public void setNewEquipmentName(String newEquipmentName) {
        this.newEquipmentName = newEquipmentName;
    }

    public String getNewEquipmentModel() {
        return newEquipmentModel;
    }

    public void setNewEquipmentModel(String newEquipmentModel) {
        this.newEquipmentModel = newEquipmentModel;
    }

    public String getNewEquipmentArrival() {
        return newEquipmentArrival;
    }

    public void setNewEquipmentArrival(String newEquipmentArrival) {
        this.newEquipmentArrival = newEquipmentArrival;
    }

    public String getNewEquipmentInstall() {
        return newEquipmentInstall;
    }

    public void setNewEquipmentInstall(String newEquipmentInstall) {
        this.newEquipmentInstall = newEquipmentInstall;
    }

    public String getNewEquipmentPowerUp() {
        return newEquipmentPowerUp;
    }

    public void setNewEquipmentPowerUp(String newEquipmentPowerUp) {
        this.newEquipmentPowerUp = newEquipmentPowerUp;
    }

    public String getNewEquipmentLinkDebugging() {
        return newEquipmentLinkDebugging;
    }

    public void setNewEquipmentLinkDebugging(String newEquipmentLinkDebugging) {
        this.newEquipmentLinkDebugging = newEquipmentLinkDebugging;
    }

    public String getSingleMachineDebugging() {
        return singleMachineDebugging;
    }

    public void setSingleMachineDebugging(String singleMachineDebugging) {
        this.singleMachineDebugging = singleMachineDebugging;
    }

    public String getNetworkingDebugging() {
        return networkingDebugging;
    }

    public void setNetworkingDebugging(String networkingDebugging) {
        this.networkingDebugging = networkingDebugging;
    }

    public String getCutAccessNetwork() {
        return cutAccessNetwork;
    }

    public void setCutAccessNetwork(String cutAccessNetwork) {
        this.cutAccessNetwork = cutAccessNetwork;
    }

    public String getDilatantVeneerNumber() {
        return dilatantVeneerNumber;
    }

    public void setDilatantVeneerNumber(String dilatantVeneerNumber) {
        this.dilatantVeneerNumber = dilatantVeneerNumber;
    }

    public String getDilatantVeneerName() {
        return dilatantVeneerName;
    }

    public void setDilatantVeneerName(String dilatantVeneerName) {
        this.dilatantVeneerName = dilatantVeneerName;
    }

    public String getDilatantVeneerFunction() {
        return dilatantVeneerFunction;
    }

    public void setDilatantVeneerFunction(String dilatantVeneerFunction) {
        this.dilatantVeneerFunction = dilatantVeneerFunction;
    }

    public String getVeneerPlaceEquipment() {
        return veneerPlaceEquipment;
    }

    public void setVeneerPlaceEquipment(String veneerPlaceEquipment) {
        this.veneerPlaceEquipment = veneerPlaceEquipment;
    }

    public String getDilatantVeneerEsignQuantity() {
        return dilatantVeneerEsignQuantity;
    }

    public void setDilatantVeneerEsignQuantity(String dilatantVeneerEsignQuantity) {
        this.dilatantVeneerEsignQuantity = dilatantVeneerEsignQuantity;
    }

    public String getDilatantVeneerInstall() {
        return dilatantVeneerInstall;
    }

    public void setDilatantVeneerInstall(String dilatantVeneerInstall) {
        this.dilatantVeneerInstall = dilatantVeneerInstall;
    }

    public String getVeneerCutAccessNetwork() {
        return veneerCutAccessNetwork;
    }

    public void setVeneerCutAccessNetwork(String veneerCutAccessNetwork) {
        this.veneerCutAccessNetwork = veneerCutAccessNetwork;
    }

    public String getNewCableNumber() {
        return newCableNumber;
    }

    public void setNewCableNumber(String newCableNumber) {
        this.newCableNumber = newCableNumber;
    }

    public String getNewCableType() {
        return newCableType;
    }

    public void setNewCableType(String newCableType) {
        this.newCableType = newCableType;
    }

    public String getNewCableSpecificationModel() {
        return newCableSpecificationModel;
    }

    public void setNewCableSpecificationModel(String newCableSpecificationModel) {
        this.newCableSpecificationModel = newCableSpecificationModel;
    }

    public String getNewCableLength() {
        return newCableLength;
    }

    public void setNewCableLength(String newCableLength) {
        this.newCableLength = newCableLength;
    }

    public String getNewCableForm() {
        return newCableForm;
    }

    public void setNewCableForm(String newCableForm) {
        this.newCableForm = newCableForm;
    }

    public String getNewCableTo() {
        return newCableTo;
    }

    public void setNewCableTo(String newCableTo) {
        this.newCableTo = newCableTo;
    }

    public String getCableConstructionProgress() {
        return cableConstructionProgress;
    }

    public void setCableConstructionProgress(String cableConstructionProgress) {
        this.cableConstructionProgress = cableConstructionProgress;
    }

    public String getNewCableMakespan() {
        return newCableMakespan;
    }

    public void setNewCableMakespan(String newCableMakespan) {
        this.newCableMakespan = newCableMakespan;
    }

    public String getNewWalkingFrameLength() {
        return newWalkingFrameLength;
    }

    public void setNewWalkingFrameLength(String newWalkingFrameLength) {
        this.newWalkingFrameLength = newWalkingFrameLength;
    }

    public String getWalkingConstructionProgress() {
        return walkingConstructionProgress;
    }

    public void setWalkingConstructionProgress(String walkingConstructionProgress) {
        this.walkingConstructionProgress = walkingConstructionProgress;
    }

    public String getNewWalkingFrameMakespan() {
        return newWalkingFrameMakespan;
    }

    public void setNewWalkingFrameMakespan(String newWalkingFrameMakespan) {
        this.newWalkingFrameMakespan = newWalkingFrameMakespan;
    }

    public String getNewFiberOpticChannelLength() {
        return newFiberOpticChannelLength;
    }

    public void setNewFiberOpticChannelLength(String newFiberOpticChannelLength) {
        this.newFiberOpticChannelLength = newFiberOpticChannelLength;
    }

    public String getChannelConstructionProgress() {
        return channelConstructionProgress;
    }

    public void setChannelConstructionProgress(String channelConstructionProgress) {
        this.channelConstructionProgress = channelConstructionProgress;
    }

    public String getChannelFrameMakespan() {
        return channelFrameMakespan;
    }

    public void setChannelFrameMakespan(String channelFrameMakespan) {
        this.channelFrameMakespan = channelFrameMakespan;
    }

    @Override
    public String toString() {
        return "FaEquipmentProjectProgress{" +
                "equipmentProjectProgressId='" + equipmentProjectProgressId + '\'' +
                ", operator='" + operator + '\'' +
                ", buildYear='" + buildYear + '\'' +
                ", buildingProject='" + buildingProject + '\'' +
                ", motorRoomName='" + motorRoomName + '\'' +
                ", motorRoomLongitude='" + motorRoomLongitude + '\'' +
                ", motorRoomLatitude='" + motorRoomLatitude + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", onSiteSupervision='" + onSiteSupervision + '\'' +
                ", projectLeader='" + projectLeader + '\'' +
                ", newEquipmentId='" + newEquipmentId + '\'' +
                ", dilatantVeneerId='" + dilatantVeneerId + '\'' +
                ", newCableId='" + newCableId + '\'' +
                ", newWalkingFrameId='" + newWalkingFrameId + '\'' +
                ", newFiberOpticChannelId='" + newFiberOpticChannelId + '\'' +
                ", newEquipmentNumber='" + newEquipmentNumber + '\'' +
                ", newEquipmentType='" + newEquipmentType + '\'' +
                ", newEquipmentName='" + newEquipmentName + '\'' +
                ", newEquipmentModel='" + newEquipmentModel + '\'' +
                ", newEquipmentArrival='" + newEquipmentArrival + '\'' +
                ", newEquipmentInstall='" + newEquipmentInstall + '\'' +
                ", newEquipmentPowerUp='" + newEquipmentPowerUp + '\'' +
                ", newEquipmentLinkDebugging='" + newEquipmentLinkDebugging + '\'' +
                ", singleMachineDebugging='" + singleMachineDebugging + '\'' +
                ", networkingDebugging='" + networkingDebugging + '\'' +
                ", cutAccessNetwork='" + cutAccessNetwork + '\'' +
                ", dilatantVeneerNumber='" + dilatantVeneerNumber + '\'' +
                ", dilatantVeneerName='" + dilatantVeneerName + '\'' +
                ", dilatantVeneerFunction='" + dilatantVeneerFunction + '\'' +
                ", veneerPlaceEquipment='" + veneerPlaceEquipment + '\'' +
                ", dilatantVeneerEsignQuantity='" + dilatantVeneerEsignQuantity + '\'' +
                ", dilatantVeneerInstall='" + dilatantVeneerInstall + '\'' +
                ", veneerCutAccessNetwork='" + veneerCutAccessNetwork + '\'' +
                ", newCableNumber='" + newCableNumber + '\'' +
                ", newCableType='" + newCableType + '\'' +
                ", newCableSpecificationModel='" + newCableSpecificationModel + '\'' +
                ", newCableLength='" + newCableLength + '\'' +
                ", newCableForm='" + newCableForm + '\'' +
                ", newCableTo='" + newCableTo + '\'' +
                ", cableConstructionProgress='" + cableConstructionProgress + '\'' +
                ", newCableMakespan='" + newCableMakespan + '\'' +
                ", newWalkingFrameLength='" + newWalkingFrameLength + '\'' +
                ", walkingConstructionProgress='" + walkingConstructionProgress + '\'' +
                ", newWalkingFrameMakespan='" + newWalkingFrameMakespan + '\'' +
                ", newFiberOpticChannelLength='" + newFiberOpticChannelLength + '\'' +
                ", channelConstructionProgress='" + channelConstructionProgress + '\'' +
                ", channelFrameMakespan='" + channelFrameMakespan + '\'' +
                '}';
    }
}
