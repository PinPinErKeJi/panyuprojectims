package com.panyu.panyuprojectims.entity;
public class LlFloorModelOnuWorn {
    private String wornModelOnuId;
    private String wornOnuDesignStart;
    private String wornModelOnuSize;
    private String wornOnuInstallationNumber;
    public LlFloorModelOnuWorn() {
        super();
    }
    public LlFloorModelOnuWorn(String wornModelOnuId,String wornOnuDesignStart,String wornModelOnuSize,String wornOnuInstallationNumber) {
        super();
        this.wornModelOnuId = wornModelOnuId;
        this.wornOnuDesignStart = wornOnuDesignStart;
        this.wornModelOnuSize = wornModelOnuSize;
        this.wornOnuInstallationNumber = wornOnuInstallationNumber;
    }
    public String getWornModelOnuId() {
        return this.wornModelOnuId;
    }

    public void setWornModelOnuId(String wornModelOnuId) {
        this.wornModelOnuId = wornModelOnuId;
    }

    public String getWornOnuDesignStart() {
        return this.wornOnuDesignStart;
    }

    public void setWornOnuDesignStart(String wornOnuDesignStart) {
        this.wornOnuDesignStart = wornOnuDesignStart;
    }

    public String getWornModelOnuSize() {
        return this.wornModelOnuSize;
    }

    public void setWornModelOnuSize(String wornModelOnuSize) {
        this.wornModelOnuSize = wornModelOnuSize;
    }

    public String getWornOnuInstallationNumber() {
        return this.wornOnuInstallationNumber;
    }

    public void setWornOnuInstallationNumber(String wornOnuInstallationNumber) {
        this.wornOnuInstallationNumber = wornOnuInstallationNumber;
    }

    @Override
    public String toString() {
        return "LlFloorModelOnuWorn{" +
                "wornModelOnuId='" + wornModelOnuId + '\'' +
                ", wornOnuDesignStart='" + wornOnuDesignStart + '\'' +
                ", wornModelOnuSize='" + wornModelOnuSize + '\'' +
                ", wornOnuInstallationNumber='" + wornOnuInstallationNumber + '\'' +
                '}';
    }
}
