package com.panyu.panyuprojectims.entity;
//一级分光器
public class HnPrimarySplitter {
    private String primarySplitterId;
    private String primarySplittingRatio;
    private String primaryOneToFour;
    private String primaryOneToEight;
    private String primaryOneToSixteen;
    public HnPrimarySplitter() {
        super();
    }
    public HnPrimarySplitter(String primarySplitterId,String primarySplittingRatio,String primaryOneToFour,String primaryOneToEight,String primaryOneToSixteen) {
        super();
        this.primarySplitterId = primarySplitterId;
        this.primarySplittingRatio = primarySplittingRatio;
        this.primaryOneToFour = primaryOneToFour;
        this.primaryOneToEight = primaryOneToEight;
        this.primaryOneToSixteen = primaryOneToSixteen;
    }
    public String getPrimarySplitterId() {
        return this.primarySplitterId;
    }

    public void setPrimarySplitterId(String primarySplitterId) {
        this.primarySplitterId = primarySplitterId;
    }

    public String getPrimarySplittingRatio() {
        return this.primarySplittingRatio;
    }

    public void setPrimarySplittingRatio(String primarySplittingRatio) {
        this.primarySplittingRatio = primarySplittingRatio;
    }

    public String getPrimaryOneToFour() {
        return this.primaryOneToFour;
    }

    public void setPrimaryOneToFour(String primaryOneToFour) {
        this.primaryOneToFour = primaryOneToFour;
    }

    public String getPrimaryOneToEight() {
        return this.primaryOneToEight;
    }

    public void setPrimaryOneToEight(String primaryOneToEight) {
        this.primaryOneToEight = primaryOneToEight;
    }

    public String getPrimaryOneToSixteen() {
        return this.primaryOneToSixteen;
    }

    public void setPrimaryOneToSixteen(String primaryOneToSixteen) {
        this.primaryOneToSixteen = primaryOneToSixteen;
    }

    @Override
    public String toString() {
        return "HnPrimarySplitter{" +
                "primarySplitterId='" + primarySplitterId + '\'' +
                ", primarySplittingRatio='" + primarySplittingRatio + '\'' +
                ", primaryOneToFour='" + primaryOneToFour + '\'' +
                ", primaryOneToEight='" + primaryOneToEight + '\'' +
                ", primaryOneToSixteen='" + primaryOneToSixteen + '\'' +
                '}';
    }
}
