package com.panyu.panyuprojectims.entity;
public class IcBbuNumbers {
    private String bbuNumbersId;
    private String installation;
    private String centralization;
    private String wallHangingWall;
    public IcBbuNumbers() {
        super();
    }
    public IcBbuNumbers(String bbuNumbersId,String installation,String centralization,String wallHangingWall) {
        super();
        this.bbuNumbersId = bbuNumbersId;
        this.installation = installation;
        this.centralization = centralization;
        this.wallHangingWall = wallHangingWall;
    }
    public String getBbuNumbersId() {
        return this.bbuNumbersId;
    }

    public void setBbuNumbersId(String bbuNumbersId) {
        this.bbuNumbersId = bbuNumbersId;
    }

    public String getInstallation() {
        return this.installation;
    }

    public void setInstallation(String installation) {
        this.installation = installation;
    }

    public String getCentralization() {
        return this.centralization;
    }

    public void setCentralization(String centralization) {
        this.centralization = centralization;
    }

    public String getWallHangingWall() {
        return this.wallHangingWall;
    }

    public void setWallHangingWall(String wallHangingWall) {
        this.wallHangingWall = wallHangingWall;
    }

    @Override
    public String toString() {
        return "IcBbuNumbers{" +
                "bbuNumbersId='" + bbuNumbersId + '\'' +
                ", installation='" + installation + '\'' +
                ", centralization='" + centralization + '\'' +
                ", wallHangingWall='" + wallHangingWall + '\'' +
                '}';
    }
}
