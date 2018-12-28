package com.panyu.panyuprojectims.entity;
public class LlFloorModelOnuNew {
    private String newModelOnuId;
    private String newOnuDesignStart;
    private String newModelOnuSize;
    private String newOnuInstallationNumber;
    public LlFloorModelOnuNew() {
        super();
    }
    public LlFloorModelOnuNew(String newModelOnuId,String newOnuDesignStart,String newModelOnuSize,String newOnuInstallationNumber) {
        super();
        this.newModelOnuId = newModelOnuId;
        this.newOnuDesignStart = newOnuDesignStart;
        this.newModelOnuSize = newModelOnuSize;
        this.newOnuInstallationNumber = newOnuInstallationNumber;
    }
    public String getNewModelOnuId() {
        return this.newModelOnuId;
    }

    public void setNewModelOnuId(String newModelOnuId) {
        this.newModelOnuId = newModelOnuId;
    }

    public String getNewOnuDesignStart() {
        return this.newOnuDesignStart;
    }

    public void setNewOnuDesignStart(String newOnuDesignStart) {
        this.newOnuDesignStart = newOnuDesignStart;
    }

    public String getNewModelOnuSize() {
        return this.newModelOnuSize;
    }

    public void setNewModelOnuSize(String newModelOnuSize) {
        this.newModelOnuSize = newModelOnuSize;
    }

    public String getNewOnuInstallationNumber() {
        return this.newOnuInstallationNumber;
    }

    public void setNewOnuInstallationNumber(String newOnuInstallationNumber) {
        this.newOnuInstallationNumber = newOnuInstallationNumber;
    }

    @Override
    public String toString() {
        return "LlFloorModelOnuNew{" +
                "newModelOnuId='" + newModelOnuId + '\'' +
                ", newOnuDesignStart='" + newOnuDesignStart + '\'' +
                ", newModelOnuSize='" + newModelOnuSize + '\'' +
                ", newOnuInstallationNumber='" + newOnuInstallationNumber + '\'' +
                '}';
    }
}
