package com.panyu.panyuprojectims.entity;
//皮线光缆
public class HnGjyxfchLength {
    private String statisticalLengthId;
    private String numberOfBranches;
    private String totalLength;
    private String averageLength;
    public HnGjyxfchLength() {
        super();
    }
    public HnGjyxfchLength(String statisticalLengthId,String numberOfBranches,String totalLength,String averageLength) {
        super();
        this.statisticalLengthId = statisticalLengthId;
        this.numberOfBranches = numberOfBranches;
        this.totalLength = totalLength;
        this.averageLength = averageLength;
    }
    public String getStatisticalLengthId() {
        return this.statisticalLengthId;
    }

    public void setStatisticalLengthId(String statisticalLengthId) {
        this.statisticalLengthId = statisticalLengthId;
    }

    public String getNumberOfBranches() {
        return this.numberOfBranches;
    }

    public void setNumberOfBranches(String numberOfBranches) {
        this.numberOfBranches = numberOfBranches;
    }

    public String getTotalLength() {
        return this.totalLength;
    }

    public void setTotalLength(String totalLength) {
        this.totalLength = totalLength;
    }

    public String getAverageLength() {
        return this.averageLength;
    }

    public void setAverageLength(String averageLength) {
        this.averageLength = averageLength;
    }

    @Override
    public String toString() {
        return "HnGjyxfchLength{" +
                "statisticalLengthId='" + statisticalLengthId + '\'' +
                ", numberOfBranches='" + numberOfBranches + '\'' +
                ", totalLength='" + totalLength + '\'' +
                ", averageLength='" + averageLength + '\'' +
                '}';
    }
}
