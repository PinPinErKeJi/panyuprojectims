package com.panyu.panyuprojectims.entity;
public class LlWallCable {
    private String wallCableId;
    private String wallDesignLength;
    private String wallLaidLength;
    public LlWallCable() {
        super();
    }
    public LlWallCable(String wallCableId,String wallDesignLength,String wallLaidLength) {
        super();
        this.wallCableId = wallCableId;
        this.wallDesignLength = wallDesignLength;
        this.wallLaidLength = wallLaidLength;
    }
    public String getWallCableId() {
        return this.wallCableId;
    }

    public void setWallCableId(String wallCableId) {
        this.wallCableId = wallCableId;
    }

    public String getWallDesignLength() {
        return this.wallDesignLength;
    }

    public void setWallDesignLength(String wallDesignLength) {
        this.wallDesignLength = wallDesignLength;
    }

    public String getWallLaidLength() {
        return this.wallLaidLength;
    }

    public void setWallLaidLength(String wallLaidLength) {
        this.wallLaidLength = wallLaidLength;
    }

    @Override
    public String toString() {
        return "LlWallCable{" +
                "wallCableId='" + wallCableId + '\'' +
                ", wallDesignLength='" + wallDesignLength + '\'' +
                ", wallLaidLength='" + wallLaidLength + '\'' +
                '}';
    }
}
