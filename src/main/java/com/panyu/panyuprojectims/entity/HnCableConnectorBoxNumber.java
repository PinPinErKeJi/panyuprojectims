package com.panyu.panyuprojectims.entity;
public class HnCableConnectorBoxNumber {
    private String cableConnectorBoxId;
    private String cableFloorType;
    private String cableWallMounted;
    public HnCableConnectorBoxNumber() {
        super();
    }
    public HnCableConnectorBoxNumber(String cableConnectorBoxId,String cableFloorType,String cableWallMounted) {
        super();
        this.cableConnectorBoxId = cableConnectorBoxId;
        this.cableFloorType = cableFloorType;
        this.cableWallMounted = cableWallMounted;
    }
    public String getCableConnectorBoxId() {
        return this.cableConnectorBoxId;
    }

    public void setCableConnectorBoxId(String cableConnectorBoxId) {
        this.cableConnectorBoxId = cableConnectorBoxId;
    }

    public String getCableFloorType() {
        return this.cableFloorType;
    }

    public void setCableFloorType(String cableFloorType) {
        this.cableFloorType = cableFloorType;
    }

    public String getCableWallMounted() {
        return this.cableWallMounted;
    }

    public void setCableWallMounted(String cableWallMounted) {
        this.cableWallMounted = cableWallMounted;
    }

    @Override
    public String toString() {
        return "HnCableConnectorBoxNumber{" +
                "cableConnectorBoxId='" + cableConnectorBoxId + '\'' +
                ", cableFloorType='" + cableFloorType + '\'' +
                ", cableWallMounted='" + cableWallMounted + '\'' +
                '}';
    }
}
