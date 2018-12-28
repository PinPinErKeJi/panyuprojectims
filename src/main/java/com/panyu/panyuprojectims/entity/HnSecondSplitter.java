package com.panyu.panyuprojectims.entity;
//二级分光器
public class HnSecondSplitter {
    private String secondSplitterId;
    private String secondSplittingRatio;
    private String secondOneToFour;
    private String secondOneToEight;
    private String secondOneToSixteen;
    private String oneToThirtyTwo;
    private String oneToSixtyFour;
    public HnSecondSplitter() {
        super();
    }
    public HnSecondSplitter(String secondSplitterId,String secondSplittingRatio,String secondOneToFour,String secondOneToEight,String secondOneToSixteen,String oneToThirtyTwo,String oneToSixtyFour) {
        super();
        this.secondSplitterId = secondSplitterId;
        this.secondSplittingRatio = secondSplittingRatio;
        this.secondOneToFour = secondOneToFour;
        this.secondOneToEight = secondOneToEight;
        this.secondOneToSixteen = secondOneToSixteen;
        this.oneToThirtyTwo = oneToThirtyTwo;
        this.oneToSixtyFour = oneToSixtyFour;
    }
    public String getSecondSplitterId() {
        return this.secondSplitterId;
    }

    public void setSecondSplitterId(String secondSplitterId) {
        this.secondSplitterId = secondSplitterId;
    }

    public String getSecondSplittingRatio() {
        return this.secondSplittingRatio;
    }

    public void setSecondSplittingRatio(String secondSplittingRatio) {
        this.secondSplittingRatio = secondSplittingRatio;
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
        return "HnSecondSplitter{" +
                "secondSplitterId='" + secondSplitterId + '\'' +
                ", secondSplittingRatio='" + secondSplittingRatio + '\'' +
                ", secondOneToFour='" + secondOneToFour + '\'' +
                ", secondOneToEight='" + secondOneToEight + '\'' +
                ", secondOneToSixteen='" + secondOneToSixteen + '\'' +
                ", oneToThirtyTwo='" + oneToThirtyTwo + '\'' +
                ", oneToSixtyFour='" + oneToSixtyFour + '\'' +
                '}';
    }
}
