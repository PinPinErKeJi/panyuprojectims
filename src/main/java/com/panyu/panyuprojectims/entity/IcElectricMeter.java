package com.panyu.panyuprojectims.entity;
public class IcElectricMeter {
    private String electricMeterId;
    private String electricDesignStart;
    private String electricInstalledDram;

    public IcElectricMeter() {
        super();
    }
    public IcElectricMeter(String electricMeterId,String electricDesignStart,String electricInstalledDram) {
        super();
        this.electricMeterId = electricMeterId;
        this.electricDesignStart = electricDesignStart;
        this.electricInstalledDram = electricInstalledDram;
    }
    public String getElectricMeterId() {
        return this.electricMeterId;
    }

    public void setElectricMeterId(String electricMeterId) {
        this.electricMeterId = electricMeterId;
    }

    public String getElectricDesignStart() {
        return this.electricDesignStart;
    }

    public void setElectricDesignStart(String electricDesignStart) {
        this.electricDesignStart = electricDesignStart;
    }

    public String getElectricInstalledDram() {
        return this.electricInstalledDram;
    }

    public void setElectricInstalledDram(String electricInstalledDram) {
        this.electricInstalledDram = electricInstalledDram;
    }

    @Override
    public String toString() {
        return "IcElectricMeter{" +
                "electricMeterId='" + electricMeterId + '\'' +
                ", electricDesignStart='" + electricDesignStart + '\'' +
                ", electricInstalledDram='" + electricInstalledDram + '\'' +
                '}';
    }
}
