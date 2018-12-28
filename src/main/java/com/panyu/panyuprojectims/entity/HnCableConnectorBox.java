package com.panyu.panyuprojectims.entity;
//光缆交接箱
public class HnCableConnectorBox {
    private String cableConnectorBoxId;
    private String cableConnectorBoxType;
    private String cableFloorType;
    private String cableWallMounted;
    public HnCableConnectorBox() {
        super();
    }
    public HnCableConnectorBox(String cableConnectorBoxId,String cableConnectorBoxType,String cableFloorType,String cableWallMounted) {
        super();
        this.cableConnectorBoxId = cableConnectorBoxId;
        this.cableConnectorBoxType = cableConnectorBoxType;
        this.cableFloorType = cableFloorType;
        this.cableWallMounted = cableWallMounted;
    }
    public String getCableConnectorBoxId() {
        return this.cableConnectorBoxId;
    }

    public void setCableConnectorBoxId(String cableConnectorBoxId) {
        this.cableConnectorBoxId = cableConnectorBoxId;
    }

    public String getCableConnectorBoxType() {
        return this.cableConnectorBoxType;
    }

    public void setCableConnectorBoxType(String cableConnectorBoxType) {
        this.cableConnectorBoxType = cableConnectorBoxType;
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
        return "HnCableConnectorBox{" +
                "cableConnectorBoxId='" + cableConnectorBoxId + '\'' +
                ", cableConnectorBoxType='" + cableConnectorBoxType + '\'' +
                ", cableFloorType='" + cableFloorType + '\'' +
                ", cableWallMounted='" + cableWallMounted + '\'' +
                '}';
    }
}
