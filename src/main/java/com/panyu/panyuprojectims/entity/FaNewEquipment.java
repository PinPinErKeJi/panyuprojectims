package com.panyu.panyuprojectims.entity;
public class FaNewEquipment {
    private String newEquipmentId;
    private String newEquipmentNumber;
    private String newEquipmentType;
    private String newEquipmentName;
    private String newEquipmentModel;
    private String newEquipmentArrival;
    private String newEquipmentInstall;
    private String newEquipmentPowerUp;
    private String newEquipmentLinkDebugging;
    private String singleMachineDebugging;
    private String networkingDebugging;
    private String cutAccessNetwork;
    public FaNewEquipment() {
        super();
    }
    public FaNewEquipment(String newEquipmentId,String newEquipmentNumber,String newEquipmentType,String newEquipmentName,String newEquipmentModel,String newEquipmentArrival,String newEquipmentInstall,String newEquipmentPowerUp,String newEquipmentLinkDebugging,String singleMachineDebugging,String networkingDebugging,String cutAccessNetwork) {
        super();
        this.newEquipmentId = newEquipmentId;
        this.newEquipmentNumber = newEquipmentNumber;
        this.newEquipmentType = newEquipmentType;
        this.newEquipmentName = newEquipmentName;
        this.newEquipmentModel = newEquipmentModel;
        this.newEquipmentArrival = newEquipmentArrival;
        this.newEquipmentInstall = newEquipmentInstall;
        this.newEquipmentPowerUp = newEquipmentPowerUp;
        this.newEquipmentLinkDebugging = newEquipmentLinkDebugging;
        this.singleMachineDebugging = singleMachineDebugging;
        this.networkingDebugging = networkingDebugging;
        this.cutAccessNetwork = cutAccessNetwork;
    }
    public String getNewEquipmentId() {
        return this.newEquipmentId;
    }

    public void setNewEquipmentId(String newEquipmentId) {
        this.newEquipmentId = newEquipmentId;
    }

    public String getNewEquipmentNumber() {
        return this.newEquipmentNumber;
    }

    public void setNewEquipmentNumber(String newEquipmentNumber) {
        this.newEquipmentNumber = newEquipmentNumber;
    }

    public String getNewEquipmentType() {
        return this.newEquipmentType;
    }

    public void setNewEquipmentType(String newEquipmentType) {
        this.newEquipmentType = newEquipmentType;
    }

    public String getNewEquipmentName() {
        return this.newEquipmentName;
    }

    public void setNewEquipmentName(String newEquipmentName) {
        this.newEquipmentName = newEquipmentName;
    }

    public String getNewEquipmentModel() {
        return this.newEquipmentModel;
    }

    public void setNewEquipmentModel(String newEquipmentModel) {
        this.newEquipmentModel = newEquipmentModel;
    }

    public String getNewEquipmentArrival() {
        return this.newEquipmentArrival;
    }

    public void setNewEquipmentArrival(String newEquipmentArrival) {
        this.newEquipmentArrival = newEquipmentArrival;
    }

    public String getNewEquipmentInstall() {
        return this.newEquipmentInstall;
    }

    public void setNewEquipmentInstall(String newEquipmentInstall) {
        this.newEquipmentInstall = newEquipmentInstall;
    }

    public String getNewEquipmentPowerUp() {
        return this.newEquipmentPowerUp;
    }

    public void setNewEquipmentPowerUp(String newEquipmentPowerUp) {
        this.newEquipmentPowerUp = newEquipmentPowerUp;
    }

    public String getNewEquipmentLinkDebugging() {
        return this.newEquipmentLinkDebugging;
    }

    public void setNewEquipmentLinkDebugging(String newEquipmentLinkDebugging) {
        this.newEquipmentLinkDebugging = newEquipmentLinkDebugging;
    }

    public String getSingleMachineDebugging() {
        return this.singleMachineDebugging;
    }

    public void setSingleMachineDebugging(String singleMachineDebugging) {
        this.singleMachineDebugging = singleMachineDebugging;
    }

    public String getNetworkingDebugging() {
        return this.networkingDebugging;
    }

    public void setNetworkingDebugging(String networkingDebugging) {
        this.networkingDebugging = networkingDebugging;
    }

    public String getCutAccessNetwork() {
        return this.cutAccessNetwork;
    }

    public void setCutAccessNetwork(String cutAccessNetwork) {
        this.cutAccessNetwork = cutAccessNetwork;
    }

    @Override
    public String toString() {
        return "FaNewEquipment{" +
                "newEquipmentId='" + newEquipmentId + '\'' +
                ", newEquipmentNumber='" + newEquipmentNumber + '\'' +
                ", newEquipmentType='" + newEquipmentType + '\'' +
                ", newEquipmentName='" + newEquipmentName + '\'' +
                ", newEquipmentModel='" + newEquipmentModel + '\'' +
                ", newEquipmentArrival='" + newEquipmentArrival + '\'' +
                ", newEquipmentInstall='" + newEquipmentInstall + '\'' +
                ", newEquipmentPowerUp='" + newEquipmentPowerUp + '\'' +
                ", newEquipmentLinkDebugging='" + newEquipmentLinkDebugging + '\'' +
                ", singleMachineDebugging='" + singleMachineDebugging + '\'' +
                ", networkingDebugging='" + networkingDebugging + '\'' +
                ", cutAccessNetwork='" + cutAccessNetwork + '\'' +
                '}';
    }
}
