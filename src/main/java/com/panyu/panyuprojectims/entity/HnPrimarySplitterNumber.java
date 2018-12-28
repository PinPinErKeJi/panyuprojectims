package com.panyu.panyuprojectims.entity;
public class HnPrimarySplitterNumber {
    private String primarySplitterNumberId;
    private String primaryOneToFour;
    private String primaryOneToEight;
    private String primaryOneToSixteen;
    public HnPrimarySplitterNumber() {
        super();
    }
    public HnPrimarySplitterNumber(String primarySplitterNumberId,String primaryOneToFour,String primaryOneToEight,String primaryOneToSixteen) {
        super();
        this.primarySplitterNumberId = primarySplitterNumberId;
        this.primaryOneToFour = primaryOneToFour;
        this.primaryOneToEight = primaryOneToEight;
        this.primaryOneToSixteen = primaryOneToSixteen;
    }
    public String getPrimarySplitterNumberId() {
        return this.primarySplitterNumberId;
    }

    public void setPrimarySplitterNumberId(String primarySplitterNumberId) {
        this.primarySplitterNumberId = primarySplitterNumberId;
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
        return "HnPrimarySplitterNumber{" +
                "primarySplitterNumberId='" + primarySplitterNumberId + '\'' +
                ", primaryOneToFour='" + primaryOneToFour + '\'' +
                ", primaryOneToEight='" + primaryOneToEight + '\'' +
                ", primaryOneToSixteen='" + primaryOneToSixteen + '\'' +
                '}';
    }
}
