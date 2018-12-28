package com.panyu.panyuprojectims.entity;
//线缆长度
public class IcCableLength {
    private String cableLengthId;
    private String networkLine;
    private String photoelectricCompositeCable;
    private String sevenEighthsFeeder;
    private String ahalfFeeder;



    public IcCableLength() {
        super();
    }

    public IcCableLength(String cableLengthId, String networkLine, String photoelectricCompositeCable, String sevenEighthsFeeder, String ahalfFeeder) {
        this.cableLengthId = cableLengthId;
        this.networkLine = networkLine;
        this.photoelectricCompositeCable = photoelectricCompositeCable;
        this.sevenEighthsFeeder = sevenEighthsFeeder;
        this.ahalfFeeder = ahalfFeeder;
    }

    public String getCableLengthId() {
        return cableLengthId;
    }

    public void setCableLengthId(String cableLengthId) {
        this.cableLengthId = cableLengthId;
    }

    public String getNetworkLine() {
        return networkLine;
    }

    public void setNetworkLine(String networkLine) {
        this.networkLine = networkLine;
    }

    public String getPhotoelectricCompositeCable() {
        return photoelectricCompositeCable;
    }

    public void setPhotoelectricCompositeCable(String photoelectricCompositeCable) {
        this.photoelectricCompositeCable = photoelectricCompositeCable;
    }

    public String getSevenEighthsFeeder() {
        return sevenEighthsFeeder;
    }

    public void setSevenEighthsFeeder(String sevenEighthsFeeder) {
        this.sevenEighthsFeeder = sevenEighthsFeeder;
    }

    public String getAhalfFeeder() {
        return ahalfFeeder;
    }

    public void setAhalfFeeder(String ahalfFeeder) {
        this.ahalfFeeder = ahalfFeeder;
    }

    @Override
    public String toString() {
        return "IcCableLength{" +
                "cableLengthId='" + cableLengthId + '\'' +
                ", networkLine='" + networkLine + '\'' +
                ", photoelectricCompositeCable='" + photoelectricCompositeCable + '\'' +
                ", sevenEighthsFeeder='" + sevenEighthsFeeder + '\'' +
                ", ahalfFeeder='" + ahalfFeeder + '\'' +
                '}';
    }
}
