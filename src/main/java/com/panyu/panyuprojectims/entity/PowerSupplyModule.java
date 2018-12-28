package com.panyu.panyuprojectims.entity;
public class PowerSupplyModule {
    private String powerModuleId;
    private String powerModuleName;


    public PowerSupplyModule() {
        super();
    }
    public PowerSupplyModule(String powerModuleId,String powerModuleName) {
        super();
        this.powerModuleId = powerModuleId;
        this.powerModuleName = powerModuleName;
    }
    public String getPowerModuleId() {
        return this.powerModuleId;
    }

    public void setPowerModuleId(String powerModuleId) {
        this.powerModuleId = powerModuleId;
    }

    public String getPowerModuleName() {
        return this.powerModuleName;
    }

    public void setPowerModuleName(String powerModuleName) {
        this.powerModuleName = powerModuleName;
    }

    @Override
    public String toString() {
        return "PowerSupplyModule{" +
                "powerModuleId='" + powerModuleId + '\'' +
                ", powerModuleName='" + powerModuleName + '\'' +
                '}';
    }
}
