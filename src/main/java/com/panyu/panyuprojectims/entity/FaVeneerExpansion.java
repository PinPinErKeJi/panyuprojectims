package com.panyu.panyuprojectims.entity;
public class FaVeneerExpansion {
    private String statisticsVeneerExpansionId;
    private String veneerExpansionNumber;
    private String veneerExpansionName;
    private String veneerDesignQuantity;
    private String veneerArrivalNumber;
    private String veneerArrivalTime;
    private String veneerVerifyingPhotos;
    public FaVeneerExpansion() {
        super();
    }
    public FaVeneerExpansion(String statisticsVeneerExpansionId,String veneerExpansionNumber,String veneerExpansionName,String veneerDesignQuantity,String veneerArrivalNumber,String veneerArrivalTime,String veneerVerifyingPhotos) {
        super();
        this.statisticsVeneerExpansionId = statisticsVeneerExpansionId;
        this.veneerExpansionNumber = veneerExpansionNumber;
        this.veneerExpansionName = veneerExpansionName;
        this.veneerDesignQuantity = veneerDesignQuantity;
        this.veneerArrivalNumber = veneerArrivalNumber;
        this.veneerArrivalTime = veneerArrivalTime;
        this.veneerVerifyingPhotos = veneerVerifyingPhotos;
    }
    public String getStatisticsVeneerExpansionId() {
        return this.statisticsVeneerExpansionId;
    }

    public void setStatisticsVeneerExpansionId(String statisticsVeneerExpansionId) {
        this.statisticsVeneerExpansionId = statisticsVeneerExpansionId;
    }

    public String getVeneerExpansionNumber() {
        return this.veneerExpansionNumber;
    }

    public void setVeneerExpansionNumber(String veneerExpansionNumber) {
        this.veneerExpansionNumber = veneerExpansionNumber;
    }

    public String getVeneerExpansionName() {
        return this.veneerExpansionName;
    }

    public void setVeneerExpansionName(String veneerExpansionName) {
        this.veneerExpansionName = veneerExpansionName;
    }

    public String getVeneerDesignQuantity() {
        return this.veneerDesignQuantity;
    }

    public void setVeneerDesignQuantity(String veneerDesignQuantity) {
        this.veneerDesignQuantity = veneerDesignQuantity;
    }

    public String getVeneerArrivalNumber() {
        return this.veneerArrivalNumber;
    }

    public void setVeneerArrivalNumber(String veneerArrivalNumber) {
        this.veneerArrivalNumber = veneerArrivalNumber;
    }

    public String getVeneerArrivalTime() {
        return this.veneerArrivalTime;
    }

    public void setVeneerArrivalTime(String veneerArrivalTime) {
        this.veneerArrivalTime = veneerArrivalTime;
    }

    public String getVeneerVerifyingPhotos() {
        return this.veneerVerifyingPhotos;
    }

    public void setVeneerVerifyingPhotos(String veneerVerifyingPhotos) {
        this.veneerVerifyingPhotos = veneerVerifyingPhotos;
    }

    @Override
    public String toString() {
        return "FaVeneerExpansion{" +
                "statisticsVeneerExpansionId='" + statisticsVeneerExpansionId + '\'' +
                ", veneerExpansionNumber='" + veneerExpansionNumber + '\'' +
                ", veneerExpansionName='" + veneerExpansionName + '\'' +
                ", veneerDesignQuantity='" + veneerDesignQuantity + '\'' +
                ", veneerArrivalNumber='" + veneerArrivalNumber + '\'' +
                ", veneerArrivalTime='" + veneerArrivalTime + '\'' +
                ", veneerVerifyingPhotos='" + veneerVerifyingPhotos + '\'' +
                '}';
    }
}
