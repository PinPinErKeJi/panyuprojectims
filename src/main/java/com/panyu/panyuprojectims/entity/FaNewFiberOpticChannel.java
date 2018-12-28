package com.panyu.panyuprojectims.entity;
public class FaNewFiberOpticChannel {
    private String newFiberOpticChannelId;
    private String newFiberOpticChannelLength;
    private String channelConstructionProgress;
    private String channelFrameMakespan;
    public FaNewFiberOpticChannel() {
        super();
    }
    public FaNewFiberOpticChannel(String newFiberOpticChannelId,String newFiberOpticChannelLength,String channelConstructionProgress,String channelFrameMakespan) {
        super();
        this.newFiberOpticChannelId = newFiberOpticChannelId;
        this.newFiberOpticChannelLength = newFiberOpticChannelLength;
        this.channelConstructionProgress = channelConstructionProgress;
        this.channelFrameMakespan = channelFrameMakespan;
    }
    public String getNewFiberOpticChannelId() {
        return this.newFiberOpticChannelId;
    }

    public void setNewFiberOpticChannelId(String newFiberOpticChannelId) {
        this.newFiberOpticChannelId = newFiberOpticChannelId;
    }

    public String getNewFiberOpticChannelLength() {
        return this.newFiberOpticChannelLength;
    }

    public void setNewFiberOpticChannelLength(String newFiberOpticChannelLength) {
        this.newFiberOpticChannelLength = newFiberOpticChannelLength;
    }

    public String getChannelConstructionProgress() {
        return this.channelConstructionProgress;
    }

    public void setChannelConstructionProgress(String channelConstructionProgress) {
        this.channelConstructionProgress = channelConstructionProgress;
    }

    public String getChannelFrameMakespan() {
        return this.channelFrameMakespan;
    }

    public void setChannelFrameMakespan(String channelFrameMakespan) {
        this.channelFrameMakespan = channelFrameMakespan;
    }

    @Override
    public String toString() {
        return "FaNewFiberOpticChannel{" +
                "newFiberOpticChannelId='" + newFiberOpticChannelId + '\'' +
                ", newFiberOpticChannelLength='" + newFiberOpticChannelLength + '\'' +
                ", channelConstructionProgress='" + channelConstructionProgress + '\'' +
                ", channelFrameMakespan='" + channelFrameMakespan + '\'' +
                '}';
    }
}
