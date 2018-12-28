package com.panyu.panyuprojectims.entity;
public class FaNewWalkingFrame {
    private String newWalkingFrameId;
    private String newWalkingFrameLength;
    private String walkingConstructionProgress;
    private String newWalkingFrameMakespan;
    public FaNewWalkingFrame() {
        super();
    }
    public FaNewWalkingFrame(String newWalkingFrameId,String newWalkingFrameLength,String walkingConstructionProgress,String newWalkingFrameMakespan) {
        super();
        this.newWalkingFrameId = newWalkingFrameId;
        this.newWalkingFrameLength = newWalkingFrameLength;
        this.walkingConstructionProgress = walkingConstructionProgress;
        this.newWalkingFrameMakespan = newWalkingFrameMakespan;
    }
    public String getNewWalkingFrameId() {
        return this.newWalkingFrameId;
    }

    public void setNewWalkingFrameId(String newWalkingFrameId) {
        this.newWalkingFrameId = newWalkingFrameId;
    }

    public String getNewWalkingFrameLength() {
        return this.newWalkingFrameLength;
    }

    public void setNewWalkingFrameLength(String newWalkingFrameLength) {
        this.newWalkingFrameLength = newWalkingFrameLength;
    }

    public String getWalkingConstructionProgress() {
        return this.walkingConstructionProgress;
    }

    public void setWalkingConstructionProgress(String walkingConstructionProgress) {
        this.walkingConstructionProgress = walkingConstructionProgress;
    }

    public String getNewWalkingFrameMakespan() {
        return this.newWalkingFrameMakespan;
    }

    public void setNewWalkingFrameMakespan(String newWalkingFrameMakespan) {
        this.newWalkingFrameMakespan = newWalkingFrameMakespan;
    }

    @Override
    public String toString() {
        return "FaNewWalkingFrame{" +
                "newWalkingFrameId='" + newWalkingFrameId + '\'' +
                ", newWalkingFrameLength='" + newWalkingFrameLength + '\'' +
                ", walkingConstructionProgress='" + walkingConstructionProgress + '\'' +
                ", newWalkingFrameMakespan='" + newWalkingFrameMakespan + '\'' +
                '}';
    }
}
