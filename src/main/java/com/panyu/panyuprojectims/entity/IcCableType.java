package com.panyu.panyuprojectims.entity;
public class IcCableType {
    private String cableTypeId;
    private String cableType;
    private String networkLine;
    private String photoelectricCompositeCable;
    private String sevenEighthsFeeder;
    private String aHalfFeeder;

    public IcCableType() {
        super();
    }
    public IcCableType(String cableTypeId,String cableType,String networkLine,String photoelectricCompositeCable,String sevenEighthsFeeder,String aHalfFeeder) {
        super();
        this.cableTypeId = cableTypeId;
        this.cableType = cableType;
        this.networkLine = networkLine;
        this.photoelectricCompositeCable = photoelectricCompositeCable;
        this.sevenEighthsFeeder = sevenEighthsFeeder;
        this.aHalfFeeder = aHalfFeeder;
    }
    public String getCableTypeId() {
        return this.cableTypeId;
    }

    public void setCableTypeId(String cableTypeId) {
        this.cableTypeId = cableTypeId;
    }

    public String getCableType() {
        return this.cableType;
    }

    public void setCableType(String cableType) {
        this.cableType = cableType;
    }

    public String getNetworkLine() {
        return this.networkLine;
    }

    public void setNetworkLine(String networkLine) {
        this.networkLine = networkLine;
    }

    public String getPhotoelectricCompositeCable() {
        return this.photoelectricCompositeCable;
    }

    public void setPhotoelectricCompositeCable(String photoelectricCompositeCable) {
        this.photoelectricCompositeCable = photoelectricCompositeCable;
    }

    public String getSevenEighthsFeeder() {
        return this.sevenEighthsFeeder;
    }

    public void setSevenEighthsFeeder(String sevenEighthsFeeder) {
        this.sevenEighthsFeeder = sevenEighthsFeeder;
    }

    public String getAHalfFeeder() {
        return this.aHalfFeeder;
    }

    public void setAHalfFeeder(String aHalfFeeder) {
        this.aHalfFeeder = aHalfFeeder;
    }

    @Override
    public String toString() {
        return "IcCableType{" +
                "cableTypeId='" + cableTypeId + '\'' +
                ", cableType='" + cableType + '\'' +
                ", networkLine='" + networkLine + '\'' +
                ", photoelectricCompositeCable='" + photoelectricCompositeCable + '\'' +
                ", sevenEighthsFeeder='" + sevenEighthsFeeder + '\'' +
                ", aHalfFeeder='" + aHalfFeeder + '\'' +
                '}';
    }
}
