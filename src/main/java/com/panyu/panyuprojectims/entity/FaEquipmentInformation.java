package com.panyu.panyuprojectims.entity;
public class FaEquipmentInformation {
    private String equipmentInformationId;//设备基本工程信息ID
    private String operator;//运营商
    private String buildYear;//建设年份
    private String buildingProject;//建设项目
    private String motorRoomName;//机房名称
    private String motorRoomLongitude;//机房经度
    private String motorRoomLatitude;//机房纬度
    private String province;//省份
    private String city;//城市
    private String county;//县区
    private String onSiteSupervision;//现场监理
    private String projectLeader;//项目负责人

    private String equipmentId;//设备,机柜,电源柜,配线架ID
    private String boardCardDilatationId;//板卡扩容ID
    private String powerNetworkLineId;//电源线,网线,2M线ID
    private String pigtailSkipFiberId;//尾纤,跳纤ID
    private String walkingFrameId;//走线架ID
    private String fiberOpticChannelId;//光纤槽道ID

    //设备,机柜,电源柜,配线架表字段
    private String equipmentNumber;//设备编号
    private String equipmentType;//设备,机柜,电源柜,配线架类型
    private String equipmentName;//设备,机柜,电源柜,配线架名称
    private String equipmentModel;//设备,机柜,电源柜,配线架型号
    private String equipmentDesignQuantity;//设计数量
    private String equipmentSize;//尺寸
    private String equipmentSupplier;//供货厂家
    private String equipmentContacts;//联系人


    //板卡扩容表
    private String boardCardNumber;//板卡编号
    private String boardCardName;//板卡名称
    private String veneerFunction;//单板功能
    private String placeEquipment;//所在设备
    private String boardCardDesignQuantity;//设计数量
    private String boardCardSupplier;//供货厂家
    private String boardCardContacts;//联系人


    //电源线,网线,2M线表
    private String powerNumber;//电源编号
    private String cableType;//线缆类型
    private String specificationModel;//规格型号
    private String numberOfBranches;//条数
    private String singleLength;//单条长度（m）
    private String totalLength;//总长度（m）
    private String froms;//来自哪
    private String to1;//到哪去
    private String powerSupplier;//供货厂家
    private String powerContacts;//联系人


    //尾纤,跳纤表
    private String pigtailNumber;//尾纤编号
    private String fiberCableType;//线缆类型
    private String fiberSpecificationModel;//规格型号
    private String fiberNumberOfBranches;//条数
    private String fiberSingleLength;//单条长度
    private String forms;//来自哪
    private String to2;//到哪去
    private String fiberSupplier;//供货厂家
    private String fiberContacts;//联系人


    //走线架表
    private String walkingNumber;//走线架编号
    private String walkingDesignLength;//设计长度（m）
    private String walkingFrameSupplier;//供货厂家
    private String walkingFrameContacts;//联系人


    //光纤槽道表
    private String fiberOpticNumber;//光纤槽道编号
    private String fiberOpticDesignLength;//设计长度
    private String fiberOpticSupplier;//供货厂家
    private String fiberOpticContacts;//联系人

    public FaEquipmentInformation() {
        super();
    }

    public FaEquipmentInformation(String equipmentInformationId, String operator, String buildYear, String buildingProject, String motorRoomName, String motorRoomLongitude, String motorRoomLatitude, String province, String city, String county, String onSiteSupervision, String projectLeader, String equipmentId, String boardCardDilatationId, String powerNetworkLineId, String pigtailSkipFiberId, String walkingFrameId, String fiberOpticChannelId, String equipmentNumber, String equipmentType, String equipmentName, String equipmentModel, String equipmentDesignQuantity, String equipmentSize, String equipmentSupplier, String equipmentContacts, String boardCardNumber, String boardCardName, String veneerFunction, String placeEquipment, String boardCardDesignQuantity, String boardCardSupplier, String boardCardContacts, String powerNumber, String cableType, String specificationModel, String numberOfBranches, String singleLength, String totalLength, String froms, String to1, String powerSupplier, String powerContacts, String pigtailNumber, String fiberCableType, String fiberSpecificationModel, String fiberNumberOfBranches, String fiberSingleLength, String forms, String to2, String fiberSupplier, String fiberContacts, String walkingNumber, String walkingDesignLength, String walkingFrameSupplier, String walkingFrameContacts, String fiberOpticNumber, String fiberOpticDesignLength, String fiberOpticSupplier, String fiberOpticContacts) {
        this.equipmentInformationId = equipmentInformationId;
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
        this.equipmentId = equipmentId;
        this.boardCardDilatationId = boardCardDilatationId;
        this.powerNetworkLineId = powerNetworkLineId;
        this.pigtailSkipFiberId = pigtailSkipFiberId;
        this.walkingFrameId = walkingFrameId;
        this.fiberOpticChannelId = fiberOpticChannelId;
        this.equipmentNumber = equipmentNumber;
        this.equipmentType = equipmentType;
        this.equipmentName = equipmentName;
        this.equipmentModel = equipmentModel;
        this.equipmentDesignQuantity = equipmentDesignQuantity;
        this.equipmentSize = equipmentSize;
        this.equipmentSupplier = equipmentSupplier;
        this.equipmentContacts = equipmentContacts;
        this.boardCardNumber = boardCardNumber;
        this.boardCardName = boardCardName;
        this.veneerFunction = veneerFunction;
        this.placeEquipment = placeEquipment;
        this.boardCardDesignQuantity = boardCardDesignQuantity;
        this.boardCardSupplier = boardCardSupplier;
        this.boardCardContacts = boardCardContacts;
        this.powerNumber = powerNumber;
        this.cableType = cableType;
        this.specificationModel = specificationModel;
        this.numberOfBranches = numberOfBranches;
        this.singleLength = singleLength;
        this.totalLength = totalLength;
        this.froms = froms;
        this.to1 = to1;
        this.powerSupplier = powerSupplier;
        this.powerContacts = powerContacts;
        this.pigtailNumber = pigtailNumber;
        this.fiberCableType = fiberCableType;
        this.fiberSpecificationModel = fiberSpecificationModel;
        this.fiberNumberOfBranches = fiberNumberOfBranches;
        this.fiberSingleLength = fiberSingleLength;
        this.forms = forms;
        this.to2 = to2;
        this.fiberSupplier = fiberSupplier;
        this.fiberContacts = fiberContacts;
        this.walkingNumber = walkingNumber;
        this.walkingDesignLength = walkingDesignLength;
        this.walkingFrameSupplier = walkingFrameSupplier;
        this.walkingFrameContacts = walkingFrameContacts;
        this.fiberOpticNumber = fiberOpticNumber;
        this.fiberOpticDesignLength = fiberOpticDesignLength;
        this.fiberOpticSupplier = fiberOpticSupplier;
        this.fiberOpticContacts = fiberOpticContacts;
    }

    public String getEquipmentInformationId() {
        return equipmentInformationId;
    }

    public void setEquipmentInformationId(String equipmentInformationId) {
        this.equipmentInformationId = equipmentInformationId;
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

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getBoardCardDilatationId() {
        return boardCardDilatationId;
    }

    public void setBoardCardDilatationId(String boardCardDilatationId) {
        this.boardCardDilatationId = boardCardDilatationId;
    }

    public String getPowerNetworkLineId() {
        return powerNetworkLineId;
    }

    public void setPowerNetworkLineId(String powerNetworkLineId) {
        this.powerNetworkLineId = powerNetworkLineId;
    }

    public String getPigtailSkipFiberId() {
        return pigtailSkipFiberId;
    }

    public void setPigtailSkipFiberId(String pigtailSkipFiberId) {
        this.pigtailSkipFiberId = pigtailSkipFiberId;
    }

    public String getWalkingFrameId() {
        return walkingFrameId;
    }

    public void setWalkingFrameId(String walkingFrameId) {
        this.walkingFrameId = walkingFrameId;
    }

    public String getFiberOpticChannelId() {
        return fiberOpticChannelId;
    }

    public void setFiberOpticChannelId(String fiberOpticChannelId) {
        this.fiberOpticChannelId = fiberOpticChannelId;
    }

    public String getEquipmentNumber() {
        return equipmentNumber;
    }

    public void setEquipmentNumber(String equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentModel() {
        return equipmentModel;
    }

    public void setEquipmentModel(String equipmentModel) {
        this.equipmentModel = equipmentModel;
    }

    public String getEquipmentDesignQuantity() {
        return equipmentDesignQuantity;
    }

    public void setEquipmentDesignQuantity(String equipmentDesignQuantity) {
        this.equipmentDesignQuantity = equipmentDesignQuantity;
    }

    public String getEquipmentSize() {
        return equipmentSize;
    }

    public void setEquipmentSize(String equipmentSize) {
        this.equipmentSize = equipmentSize;
    }

    public String getEquipmentSupplier() {
        return equipmentSupplier;
    }

    public void setEquipmentSupplier(String equipmentSupplier) {
        this.equipmentSupplier = equipmentSupplier;
    }

    public String getEquipmentContacts() {
        return equipmentContacts;
    }

    public void setEquipmentContacts(String equipmentContacts) {
        this.equipmentContacts = equipmentContacts;
    }

    public String getBoardCardNumber() {
        return boardCardNumber;
    }

    public void setBoardCardNumber(String boardCardNumber) {
        this.boardCardNumber = boardCardNumber;
    }

    public String getBoardCardName() {
        return boardCardName;
    }

    public void setBoardCardName(String boardCardName) {
        this.boardCardName = boardCardName;
    }

    public String getVeneerFunction() {
        return veneerFunction;
    }

    public void setVeneerFunction(String veneerFunction) {
        this.veneerFunction = veneerFunction;
    }

    public String getPlaceEquipment() {
        return placeEquipment;
    }

    public void setPlaceEquipment(String placeEquipment) {
        this.placeEquipment = placeEquipment;
    }

    public String getBoardCardDesignQuantity() {
        return boardCardDesignQuantity;
    }

    public void setBoardCardDesignQuantity(String boardCardDesignQuantity) {
        this.boardCardDesignQuantity = boardCardDesignQuantity;
    }

    public String getBoardCardSupplier() {
        return boardCardSupplier;
    }

    public void setBoardCardSupplier(String boardCardSupplier) {
        this.boardCardSupplier = boardCardSupplier;
    }

    public String getBoardCardContacts() {
        return boardCardContacts;
    }

    public void setBoardCardContacts(String boardCardContacts) {
        this.boardCardContacts = boardCardContacts;
    }

    public String getPowerNumber() {
        return powerNumber;
    }

    public void setPowerNumber(String powerNumber) {
        this.powerNumber = powerNumber;
    }

    public String getCableType() {
        return cableType;
    }

    public void setCableType(String cableType) {
        this.cableType = cableType;
    }

    public String getSpecificationModel() {
        return specificationModel;
    }

    public void setSpecificationModel(String specificationModel) {
        this.specificationModel = specificationModel;
    }

    public String getNumberOfBranches() {
        return numberOfBranches;
    }

    public void setNumberOfBranches(String numberOfBranches) {
        this.numberOfBranches = numberOfBranches;
    }

    public String getSingleLength() {
        return singleLength;
    }

    public void setSingleLength(String singleLength) {
        this.singleLength = singleLength;
    }

    public String getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(String totalLength) {
        this.totalLength = totalLength;
    }

    public String getFroms() {
        return froms;
    }

    public void setFroms(String froms) {
        this.froms = froms;
    }

    public String getTo1() {
        return to1;
    }

    public void setTo1(String to1) {
        this.to1 = to1;
    }

    public String getPowerSupplier() {
        return powerSupplier;
    }

    public void setPowerSupplier(String powerSupplier) {
        this.powerSupplier = powerSupplier;
    }

    public String getPowerContacts() {
        return powerContacts;
    }

    public void setPowerContacts(String powerContacts) {
        this.powerContacts = powerContacts;
    }

    public String getPigtailNumber() {
        return pigtailNumber;
    }

    public void setPigtailNumber(String pigtailNumber) {
        this.pigtailNumber = pigtailNumber;
    }

    public String getFiberCableType() {
        return fiberCableType;
    }

    public void setFiberCableType(String fiberCableType) {
        this.fiberCableType = fiberCableType;
    }

    public String getFiberSpecificationModel() {
        return fiberSpecificationModel;
    }

    public void setFiberSpecificationModel(String fiberSpecificationModel) {
        this.fiberSpecificationModel = fiberSpecificationModel;
    }

    public String getFiberNumberOfBranches() {
        return fiberNumberOfBranches;
    }

    public void setFiberNumberOfBranches(String fiberNumberOfBranches) {
        this.fiberNumberOfBranches = fiberNumberOfBranches;
    }

    public String getFiberSingleLength() {
        return fiberSingleLength;
    }

    public void setFiberSingleLength(String fiberSingleLength) {
        this.fiberSingleLength = fiberSingleLength;
    }

    public String getForms() {
        return forms;
    }

    public void setForms(String forms) {
        this.forms = forms;
    }

    public String getTo2() {
        return to2;
    }

    public void setTo2(String to2) {
        this.to2 = to2;
    }

    public String getFiberSupplier() {
        return fiberSupplier;
    }

    public void setFiberSupplier(String fiberSupplier) {
        this.fiberSupplier = fiberSupplier;
    }

    public String getFiberContacts() {
        return fiberContacts;
    }

    public void setFiberContacts(String fiberContacts) {
        this.fiberContacts = fiberContacts;
    }

    public String getWalkingNumber() {
        return walkingNumber;
    }

    public void setWalkingNumber(String walkingNumber) {
        this.walkingNumber = walkingNumber;
    }

    public String getWalkingDesignLength() {
        return walkingDesignLength;
    }

    public void setWalkingDesignLength(String walkingDesignLength) {
        this.walkingDesignLength = walkingDesignLength;
    }

    public String getWalkingFrameSupplier() {
        return walkingFrameSupplier;
    }

    public void setWalkingFrameSupplier(String walkingFrameSupplier) {
        this.walkingFrameSupplier = walkingFrameSupplier;
    }

    public String getWalkingFrameContacts() {
        return walkingFrameContacts;
    }

    public void setWalkingFrameContacts(String walkingFrameContacts) {
        this.walkingFrameContacts = walkingFrameContacts;
    }

    public String getFiberOpticNumber() {
        return fiberOpticNumber;
    }

    public void setFiberOpticNumber(String fiberOpticNumber) {
        this.fiberOpticNumber = fiberOpticNumber;
    }

    public String getFiberOpticDesignLength() {
        return fiberOpticDesignLength;
    }

    public void setFiberOpticDesignLength(String fiberOpticDesignLength) {
        this.fiberOpticDesignLength = fiberOpticDesignLength;
    }

    public String getFiberOpticSupplier() {
        return fiberOpticSupplier;
    }

    public void setFiberOpticSupplier(String fiberOpticSupplier) {
        this.fiberOpticSupplier = fiberOpticSupplier;
    }

    public String getFiberOpticContacts() {
        return fiberOpticContacts;
    }

    public void setFiberOpticContacts(String fiberOpticContacts) {
        this.fiberOpticContacts = fiberOpticContacts;
    }

    @Override
    public String toString() {
        return "FaEquipmentInformation{" +
                "equipmentInformationId='" + equipmentInformationId + '\'' +
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
                ", equipmentId='" + equipmentId + '\'' +
                ", boardCardDilatationId='" + boardCardDilatationId + '\'' +
                ", powerNetworkLineId='" + powerNetworkLineId + '\'' +
                ", pigtailSkipFiberId='" + pigtailSkipFiberId + '\'' +
                ", walkingFrameId='" + walkingFrameId + '\'' +
                ", fiberOpticChannelId='" + fiberOpticChannelId + '\'' +
                ", equipmentNumber='" + equipmentNumber + '\'' +
                ", equipmentType='" + equipmentType + '\'' +
                ", equipmentName='" + equipmentName + '\'' +
                ", equipmentModel='" + equipmentModel + '\'' +
                ", equipmentDesignQuantity='" + equipmentDesignQuantity + '\'' +
                ", equipmentSize='" + equipmentSize + '\'' +
                ", equipmentSupplier='" + equipmentSupplier + '\'' +
                ", equipmentContacts='" + equipmentContacts + '\'' +
                ", boardCardNumber='" + boardCardNumber + '\'' +
                ", boardCardName='" + boardCardName + '\'' +
                ", veneerFunction='" + veneerFunction + '\'' +
                ", placeEquipment='" + placeEquipment + '\'' +
                ", boardCardDesignQuantity='" + boardCardDesignQuantity + '\'' +
                ", boardCardSupplier='" + boardCardSupplier + '\'' +
                ", boardCardContacts='" + boardCardContacts + '\'' +
                ", powerNumber='" + powerNumber + '\'' +
                ", cableType='" + cableType + '\'' +
                ", specificationModel='" + specificationModel + '\'' +
                ", numberOfBranches='" + numberOfBranches + '\'' +
                ", singleLength='" + singleLength + '\'' +
                ", totalLength='" + totalLength + '\'' +
                ", froms='" + froms + '\'' +
                ", to1='" + to1 + '\'' +
                ", powerSupplier='" + powerSupplier + '\'' +
                ", powerContacts='" + powerContacts + '\'' +
                ", pigtailNumber='" + pigtailNumber + '\'' +
                ", fiberCableType='" + fiberCableType + '\'' +
                ", fiberSpecificationModel='" + fiberSpecificationModel + '\'' +
                ", fiberNumberOfBranches='" + fiberNumberOfBranches + '\'' +
                ", fiberSingleLength='" + fiberSingleLength + '\'' +
                ", forms='" + forms + '\'' +
                ", to2='" + to2 + '\'' +
                ", fiberSupplier='" + fiberSupplier + '\'' +
                ", fiberContacts='" + fiberContacts + '\'' +
                ", walkingNumber='" + walkingNumber + '\'' +
                ", walkingDesignLength='" + walkingDesignLength + '\'' +
                ", walkingFrameSupplier='" + walkingFrameSupplier + '\'' +
                ", walkingFrameContacts='" + walkingFrameContacts + '\'' +
                ", fiberOpticNumber='" + fiberOpticNumber + '\'' +
                ", fiberOpticDesignLength='" + fiberOpticDesignLength + '\'' +
                ", fiberOpticSupplier='" + fiberOpticSupplier + '\'' +
                ", fiberOpticContacts='" + fiberOpticContacts + '\'' +
                '}';
    }
}
