package com.panyu.panyuprojectims.entity;
public class LlWallTypeWorn {
    private String wornWallTypeId;
    private String wornWallDesignStart;
    private String wornWallOnuSize;
    private String wornWallInstallationNumber;
    public LlWallTypeWorn() {
        super();
    }
    public LlWallTypeWorn(String wornWallTypeId,String wornWallDesignStart,String wornWallOnuSize,String wornWallInstallationNumber) {
        super();
        this.wornWallTypeId = wornWallTypeId;
        this.wornWallDesignStart = wornWallDesignStart;
        this.wornWallOnuSize = wornWallOnuSize;
        this.wornWallInstallationNumber = wornWallInstallationNumber;
    }
    public String getWornWallTypeId() {
        return this.wornWallTypeId;
    }

    public void setWornWallTypeId(String wornWallTypeId) {
        this.wornWallTypeId = wornWallTypeId;
    }

    public String getWornWallDesignStart() {
        return this.wornWallDesignStart;
    }

    public void setWornWallDesignStart(String wornWallDesignStart) {
        this.wornWallDesignStart = wornWallDesignStart;
    }

    public String getWornWallOnuSize() {
        return this.wornWallOnuSize;
    }

    public void setWornWallOnuSize(String wornWallOnuSize) {
        this.wornWallOnuSize = wornWallOnuSize;
    }

    public String getWornWallInstallationNumber() {
        return this.wornWallInstallationNumber;
    }

    public void setWornWallInstallationNumber(String wornWallInstallationNumber) {
        this.wornWallInstallationNumber = wornWallInstallationNumber;
    }

    @Override
    public String toString() {
        return "LlWallTypeWorn{" +
                "wornWallTypeId='" + wornWallTypeId + '\'' +
                ", wornWallDesignStart='" + wornWallDesignStart + '\'' +
                ", wornWallOnuSize='" + wornWallOnuSize + '\'' +
                ", wornWallInstallationNumber='" + wornWallInstallationNumber + '\'' +
                '}';
    }
}
