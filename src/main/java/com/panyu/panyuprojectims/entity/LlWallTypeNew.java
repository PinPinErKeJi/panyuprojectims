package com.panyu.panyuprojectims.entity;
public class LlWallTypeNew {
    private String newWallTypeId;
    private String newWallDesignStart;
    private String newWallOnuSize;
    private String newWallInstallationNumber;
    public LlWallTypeNew() {
        super();
    }
    public LlWallTypeNew(String newWallTypeId,String newWallDesignStart,String newWallOnuSize,String newWallInstallationNumber) {
        super();
        this.newWallTypeId = newWallTypeId;
        this.newWallDesignStart = newWallDesignStart;
        this.newWallOnuSize = newWallOnuSize;
        this.newWallInstallationNumber = newWallInstallationNumber;
    }
    public String getNewWallTypeId() {
        return this.newWallTypeId;
    }

    public void setNewWallTypeId(String newWallTypeId) {
        this.newWallTypeId = newWallTypeId;
    }

    public String getNewWallDesignStart() {
        return this.newWallDesignStart;
    }

    public void setNewWallDesignStart(String newWallDesignStart) {
        this.newWallDesignStart = newWallDesignStart;
    }

    public String getNewWallOnuSize() {
        return this.newWallOnuSize;
    }

    public void setNewWallOnuSize(String newWallOnuSize) {
        this.newWallOnuSize = newWallOnuSize;
    }

    public String getNewWallInstallationNumber() {
        return this.newWallInstallationNumber;
    }

    public void setNewWallInstallationNumber(String newWallInstallationNumber) {
        this.newWallInstallationNumber = newWallInstallationNumber;
    }

    @Override
    public String toString() {
        return "LlWallTypeNew{" +
                "newWallTypeId='" + newWallTypeId + '\'' +
                ", newWallDesignStart='" + newWallDesignStart + '\'' +
                ", newWallOnuSize='" + newWallOnuSize + '\'' +
                ", newWallInstallationNumber='" + newWallInstallationNumber + '\'' +
                '}';
    }
}
