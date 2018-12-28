package com.panyu.panyuprojectims.entity;
public class LlCableLengthDesigns {
    private String cableLengthDesignsId;
    private String suspendedId;
    private String messengerWireId;
    private String gystaId;
    private String buriedServiceLightguideId;
    private String wallCableId;
    private String bridgeCableId;
    private String gyfxtsId;
    public LlCableLengthDesigns() {
        super();
    }
    public LlCableLengthDesigns(String cableLengthDesignsId,String suspendedId,String messengerWireId,String gystaId,String buriedServiceLightguideId,String wallCableId,String bridgeCableId,String gyfxtsId) {
        super();
        this.cableLengthDesignsId = cableLengthDesignsId;
        this.suspendedId = suspendedId;
        this.messengerWireId = messengerWireId;
        this.gystaId = gystaId;
        this.buriedServiceLightguideId = buriedServiceLightguideId;
        this.wallCableId = wallCableId;
        this.bridgeCableId = bridgeCableId;
        this.gyfxtsId = gyfxtsId;
    }
    public String getCableLengthDesignsId() {
        return this.cableLengthDesignsId;
    }

    public void setCableLengthDesignsId(String cableLengthDesignsId) {
        this.cableLengthDesignsId = cableLengthDesignsId;
    }

    public String getSuspendedId() {
        return this.suspendedId;
    }

    public void setSuspendedId(String suspendedId) {
        this.suspendedId = suspendedId;
    }

    public String getMessengerWireId() {
        return this.messengerWireId;
    }

    public void setMessengerWireId(String messengerWireId) {
        this.messengerWireId = messengerWireId;
    }

    public String getGystaId() {
        return this.gystaId;
    }

    public void setGystaId(String gystaId) {
        this.gystaId = gystaId;
    }

    public String getBuriedServiceLightguideId() {
        return this.buriedServiceLightguideId;
    }

    public void setBuriedServiceLightguideId(String buriedServiceLightguideId) {
        this.buriedServiceLightguideId = buriedServiceLightguideId;
    }

    public String getWallCableId() {
        return this.wallCableId;
    }

    public void setWallCableId(String wallCableId) {
        this.wallCableId = wallCableId;
    }

    public String getBridgeCableId() {
        return this.bridgeCableId;
    }

    public void setBridgeCableId(String bridgeCableId) {
        this.bridgeCableId = bridgeCableId;
    }

    public String getGyfxtsId() {
        return this.gyfxtsId;
    }

    public void setGyfxtsId(String gyfxtsId) {
        this.gyfxtsId = gyfxtsId;
    }

    @Override
    public String toString() {
        return "LlCableLengthDesigns{" +
                "cableLengthDesignsId='" + cableLengthDesignsId + '\'' +
                ", suspendedId='" + suspendedId + '\'' +
                ", messengerWireId='" + messengerWireId + '\'' +
                ", gystaId='" + gystaId + '\'' +
                ", buriedServiceLightguideId='" + buriedServiceLightguideId + '\'' +
                ", wallCableId='" + wallCableId + '\'' +
                ", bridgeCableId='" + bridgeCableId + '\'' +
                ", gyfxtsId='" + gyfxtsId + '\'' +
                '}';
    }
}
