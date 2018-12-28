package com.panyu.panyuprojectims.entity;
public class CircuitModule {
    private String circuitModuleId;
    private String circuitModuleName;



    public CircuitModule() {
        super();
    }
    public CircuitModule(String circuitModuleId,String circuitModuleName) {
        super();
        this.circuitModuleId = circuitModuleId;
        this.circuitModuleName = circuitModuleName;
    }
    public String getCircuitModuleId() {
        return this.circuitModuleId;
    }

    public void setCircuitModuleId(String circuitModuleId) {
        this.circuitModuleId = circuitModuleId;
    }

    public String getCircuitModuleName() {
        return this.circuitModuleName;
    }

    public void setCircuitModuleName(String circuitModuleName) {
        this.circuitModuleName = circuitModuleName;
    }

    @Override
    public String toString() {
        return "CircuitModule{" +
                "circuitModuleId='" + circuitModuleId + '\'' +
                ", circuitModuleName='" + circuitModuleName + '\'' +
                '}';
    }
}
