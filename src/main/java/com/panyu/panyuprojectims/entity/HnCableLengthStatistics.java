package com.panyu.panyuprojectims.entity;
//光缆长度统计
public class HnCableLengthStatistics {
    private String cableLengthStatisticsId;
    private String coreNumber;
    private String cableLength;
    public HnCableLengthStatistics() {
        super();
    }
    public HnCableLengthStatistics(String cableLengthStatisticsId,String coreNumber,String cableLength) {
        super();
        this.cableLengthStatisticsId = cableLengthStatisticsId;
        this.coreNumber = coreNumber;
        this.cableLength = cableLength;
    }
    public String getCableLengthStatisticsId() {
        return this.cableLengthStatisticsId;
    }

    public void setCableLengthStatisticsId(String cableLengthStatisticsId) {
        this.cableLengthStatisticsId = cableLengthStatisticsId;
    }

    public String getCoreNumber() {
        return this.coreNumber;
    }

    public void setCoreNumber(String coreNumber) {
        this.coreNumber = coreNumber;
    }

    public String getCableLength() {
        return this.cableLength;
    }

    public void setCableLength(String cableLength) {
        this.cableLength = cableLength;
    }

    @Override
    public String toString() {
        return "HnCableLengthStatistics{" +
                "cableLengthStatisticsId='" + cableLengthStatisticsId + '\'' +
                ", coreNumber='" + coreNumber + '\'' +
                ", cableLength='" + cableLength + '\'' +
                '}';
    }
}
