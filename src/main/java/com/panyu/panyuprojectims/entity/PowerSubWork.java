package com.panyu.panyuprojectims.entity;
public class PowerSubWork {
    private String powerSubWorkId;
    private String powerSubWorkName;
    private String powerModuleId;


    public PowerSubWork() {
        super();
    }
    public PowerSubWork(String powerSubWorkId,String powerSubWorkName,String powerModuleId) {
        super();
        this.powerSubWorkId = powerSubWorkId;
        this.powerSubWorkName = powerSubWorkName;
        this.powerModuleId = powerModuleId;
    }
    public String getPowerSubWorkId() {
        return this.powerSubWorkId;
    }

    public void setPowerSubWorkId(String powerSubWorkId) {
        this.powerSubWorkId = powerSubWorkId;
    }

    public String getPowerSubWorkName() {
        return this.powerSubWorkName;
    }

    public void setPowerSubWorkName(String powerSubWorkName) {
        this.powerSubWorkName = powerSubWorkName;
    }

    public String getPowerModuleId() {
        return this.powerModuleId;
    }

    public void setPowerModuleId(String powerModuleId) {
        this.powerModuleId = powerModuleId;
    }

    @Override
    public String toString() {
        return "PowerSubWork{" +
                "powerSubWorkId='" + powerSubWorkId + '\'' +
                ", powerSubWorkName='" + powerSubWorkName + '\'' +
                ", powerModuleId='" + powerModuleId + '\'' +
                '}';
    }
}
