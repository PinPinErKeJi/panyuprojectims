package com.panyu.panyuprojectims.entity;
//室内覆盖bbu
public class IcBbuNumber {

    private String bbuNumberId;
    private String centralization;
    private String wallHangingWall;

    public IcBbuNumber() {
        super();
    }

    public IcBbuNumber(String bbuNumberId, String centralization, String wallHangingWall) {
        this.bbuNumberId = bbuNumberId;
        this.centralization = centralization;
        this.wallHangingWall = wallHangingWall;
    }

    public String getBbuNumberId() {
        return bbuNumberId;
    }

    public void setBbuNumberId(String bbuNumberId) {
        this.bbuNumberId = bbuNumberId;
    }

    public String getCentralization() {
        return centralization;
    }

    public void setCentralization(String centralization) {
        this.centralization = centralization;
    }

    public String getWallHangingWall() {
        return wallHangingWall;
    }

    public void setWallHangingWall(String wallHangingWall) {
        this.wallHangingWall = wallHangingWall;
    }

    @Override
    public String toString() {
        return "IcBbuNumber{" +
                "bbuNumberId='" + bbuNumberId + '\'' +
                ", centralization='" + centralization + '\'' +
                ", wallHangingWall='" + wallHangingWall + '\'' +
                '}';
    }
}
