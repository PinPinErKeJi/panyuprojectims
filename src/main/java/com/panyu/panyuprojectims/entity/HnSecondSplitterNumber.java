package com.panyu.panyuprojectims.entity;
public class HnSecondSplitterNumber {
    private String secondSplitterNumberId;
    private String secondOneToFour;
    private String secondOneToEight;
    private String secondOneToSixteen;
    private String oneToThirtyTwo;
    private String oneToSixtyFour;
    public HnSecondSplitterNumber() {
        super();
    }
    public HnSecondSplitterNumber(String secondSplitterNumberId,String secondOneToFour,String secondOneToEight,String secondOneToSixteen,String oneToThirtyTwo,String oneToSixtyFour) {
        super();
        this.secondSplitterNumberId = secondSplitterNumberId;
        this.secondOneToFour = secondOneToFour;
        this.secondOneToEight = secondOneToEight;
        this.secondOneToSixteen = secondOneToSixteen;
        this.oneToThirtyTwo = oneToThirtyTwo;
        this.oneToSixtyFour = oneToSixtyFour;
    }
    public String getSecondSplitterNumberId() {
        return this.secondSplitterNumberId;
    }

    public void setSecondSplitterNumberId(String secondSplitterNumberId) {
        this.secondSplitterNumberId = secondSplitterNumberId;
    }

    public String getSecondOneToFour() {
        return this.secondOneToFour;
    }

    public void setSecondOneToFour(String secondOneToFour) {
        this.secondOneToFour = secondOneToFour;
    }

    public String getSecondOneToEight() {
        return this.secondOneToEight;
    }

    public void setSecondOneToEight(String secondOneToEight) {
        this.secondOneToEight = secondOneToEight;
    }

    public String getSecondOneToSixteen() {
        return this.secondOneToSixteen;
    }

    public void setSecondOneToSixteen(String secondOneToSixteen) {
        this.secondOneToSixteen = secondOneToSixteen;
    }

    public String getOneToThirtyTwo() {
        return this.oneToThirtyTwo;
    }

    public void setOneToThirtyTwo(String oneToThirtyTwo) {
        this.oneToThirtyTwo = oneToThirtyTwo;
    }

    public String getOneToSixtyFour() {
        return this.oneToSixtyFour;
    }

    public void setOneToSixtyFour(String oneToSixtyFour) {
        this.oneToSixtyFour = oneToSixtyFour;
    }

    @Override
    public String toString() {
        return "HnSecondSplitterNumber{" +
                "secondSplitterNumberId='" + secondSplitterNumberId + '\'' +
                ", secondOneToFour='" + secondOneToFour + '\'' +
                ", secondOneToEight='" + secondOneToEight + '\'' +
                ", secondOneToSixteen='" + secondOneToSixteen + '\'' +
                ", oneToThirtyTwo='" + oneToThirtyTwo + '\'' +
                ", oneToSixtyFour='" + oneToSixtyFour + '\'' +
                '}';
    }
}
