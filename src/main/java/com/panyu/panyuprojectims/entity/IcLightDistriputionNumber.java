package com.panyu.panyuprojectims.entity;
//光分布设备
public class IcLightDistriputionNumber {
    private String lightNumberId;
    private String easyMacro;
    private String bookrruNotIntegratedAntenna;
    private String bookrruIntegratedAntenna;
    private String hub;
    private String pruIntegratedAntenna;
    private String pruNotIntegratedAntenna;
    private String accessUnit;
    private String extensionUnit;
    private String remoteDeviceIndoor;
    private String remoteDeviceOutdoor;

    public IcLightDistriputionNumber() {
        super();
    }
    public IcLightDistriputionNumber(String lightNumberId,String easyMacro,String bookrruNotIntegratedAntenna,String bookrruIntegratedAntenna,String hub,String pruIntegratedAntenna,String pruNotIntegratedAntenna,String accessUnit,String extensionUnit,String remoteDeviceIndoor,String remoteDeviceOutdoor) {
        super();
        this.lightNumberId = lightNumberId;
        this.easyMacro = easyMacro;
        this.bookrruNotIntegratedAntenna = bookrruNotIntegratedAntenna;
        this.bookrruIntegratedAntenna = bookrruIntegratedAntenna;
        this.hub = hub;
        this.pruIntegratedAntenna = pruIntegratedAntenna;
        this.pruNotIntegratedAntenna = pruNotIntegratedAntenna;
        this.accessUnit = accessUnit;
        this.extensionUnit = extensionUnit;
        this.remoteDeviceIndoor = remoteDeviceIndoor;
        this.remoteDeviceOutdoor = remoteDeviceOutdoor;
    }
    public String getLightNumberId() {
        return this.lightNumberId;
    }

    public void setLightNumberId(String lightNumberId) {
        this.lightNumberId = lightNumberId;
    }

    public String getEasyMacro() {
        return this.easyMacro;
    }

    public void setEasyMacro(String easyMacro) {
        this.easyMacro = easyMacro;
    }

    public String getBookrruNotIntegratedAntenna() {
        return this.bookrruNotIntegratedAntenna;
    }

    public void setBookrruNotIntegratedAntenna(String bookrruNotIntegratedAntenna) {
        this.bookrruNotIntegratedAntenna = bookrruNotIntegratedAntenna;
    }

    public String getBookrruIntegratedAntenna() {
        return this.bookrruIntegratedAntenna;
    }

    public void setBookrruIntegratedAntenna(String bookrruIntegratedAntenna) {
        this.bookrruIntegratedAntenna = bookrruIntegratedAntenna;
    }

    public String getHub() {
        return this.hub;
    }

    public void setHub(String hub) {
        this.hub = hub;
    }

    public String getPruIntegratedAntenna() {
        return this.pruIntegratedAntenna;
    }

    public void setPruIntegratedAntenna(String pruIntegratedAntenna) {
        this.pruIntegratedAntenna = pruIntegratedAntenna;
    }

    public String getPruNotIntegratedAntenna() {
        return this.pruNotIntegratedAntenna;
    }

    public void setPruNotIntegratedAntenna(String pruNotIntegratedAntenna) {
        this.pruNotIntegratedAntenna = pruNotIntegratedAntenna;
    }

    public String getAccessUnit() {
        return this.accessUnit;
    }

    public void setAccessUnit(String accessUnit) {
        this.accessUnit = accessUnit;
    }

    public String getExtensionUnit() {
        return this.extensionUnit;
    }

    public void setExtensionUnit(String extensionUnit) {
        this.extensionUnit = extensionUnit;
    }

    public String getRemoteDeviceIndoor() {
        return this.remoteDeviceIndoor;
    }

    public void setRemoteDeviceIndoor(String remoteDeviceIndoor) {
        this.remoteDeviceIndoor = remoteDeviceIndoor;
    }

    public String getRemoteDeviceOutdoor() {
        return this.remoteDeviceOutdoor;
    }

    public void setRemoteDeviceOutdoor(String remoteDeviceOutdoor) {
        this.remoteDeviceOutdoor = remoteDeviceOutdoor;
    }

    @Override
    public String toString() {
        return "IcLightDistriputionNumber{" +
                "lightNumberId='" + lightNumberId + '\'' +
                ", easyMacro='" + easyMacro + '\'' +
                ", bookrruNotIntegratedAntenna='" + bookrruNotIntegratedAntenna + '\'' +
                ", bookrruIntegratedAntenna='" + bookrruIntegratedAntenna + '\'' +
                ", hub='" + hub + '\'' +
                ", pruIntegratedAntenna='" + pruIntegratedAntenna + '\'' +
                ", pruNotIntegratedAntenna='" + pruNotIntegratedAntenna + '\'' +
                ", accessUnit='" + accessUnit + '\'' +
                ", extensionUnit='" + extensionUnit + '\'' +
                ", remoteDeviceIndoor='" + remoteDeviceIndoor + '\'' +
                ", remoteDeviceOutdoor='" + remoteDeviceOutdoor + '\'' +
                '}';
    }
}
