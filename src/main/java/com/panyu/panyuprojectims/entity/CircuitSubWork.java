package com.panyu.panyuprojectims.entity;
public class CircuitSubWork {
    private String circuitSubWorkId;
    private String circuitSubWorkName;
    private String circuitModuleId;
    public CircuitSubWork() {
        super();
    }
    public CircuitSubWork(String circuitSubWorkId,String circuitSubWorkName,String circuitModuleId) {
        super();
        this.circuitSubWorkId = circuitSubWorkId;
        this.circuitSubWorkName = circuitSubWorkName;
        this.circuitModuleId = circuitModuleId;
    }
    public String getCircuitSubWorkId() {
        return this.circuitSubWorkId;
    }

    public void setCircuitSubWorkId(String circuitSubWorkId) {
        this.circuitSubWorkId = circuitSubWorkId;
    }

    public String getCircuitSubWorkName() {
        return this.circuitSubWorkName;
    }

    public void setCircuitSubWorkName(String circuitSubWorkName) {
        this.circuitSubWorkName = circuitSubWorkName;
    }

    public String getCircuitModuleId() {
        return this.circuitModuleId;
    }

    public void setCircuitModuleId(String circuitModuleId) {
        this.circuitModuleId = circuitModuleId;
    }

    @Override
    public String toString() {
        return "CircuitSubWork{" +
                "circuitSubWorkId='" + circuitSubWorkId + '\'' +
                ", circuitSubWorkName='" + circuitSubWorkName + '\'' +
                ", circuitModuleId='" + circuitModuleId + '\'' +
                '}';
    }
}
