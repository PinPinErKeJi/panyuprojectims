package com.panyu.panyuprojectims.entity;
public class FaArrivalPigtail {
    private String arrivalPigtailId;
    private String arrivalPigtailNumber;
    private String pigtailCableType;
    private String pigtailSpecificationModel;
    private String pigtailDesignBars;
    private String designSingleLength;
    private String pigtailArrivalsNumber;
    private String arrivalSingleLength;
    private String pigtailArrivalTime;
    private String pigtailVerifyingPhotos;
    public FaArrivalPigtail() {
        super();
    }
    public FaArrivalPigtail(String arrivalPigtailId,String arrivalPigtailNumber,String pigtailCableType,String pigtailSpecificationModel,String pigtailDesignBars,String designSingleLength,String pigtailArrivalsNumber,String arrivalSingleLength,String pigtailArrivalTime,String pigtailVerifyingPhotos) {
        super();
        this.arrivalPigtailId = arrivalPigtailId;
        this.arrivalPigtailNumber = arrivalPigtailNumber;
        this.pigtailCableType = pigtailCableType;
        this.pigtailSpecificationModel = pigtailSpecificationModel;
        this.pigtailDesignBars = pigtailDesignBars;
        this.designSingleLength = designSingleLength;
        this.pigtailArrivalsNumber = pigtailArrivalsNumber;
        this.arrivalSingleLength = arrivalSingleLength;
        this.pigtailArrivalTime = pigtailArrivalTime;
        this.pigtailVerifyingPhotos = pigtailVerifyingPhotos;
    }
    public String getArrivalPigtailId() {
        return this.arrivalPigtailId;
    }

    public void setArrivalPigtailId(String arrivalPigtailId) {
        this.arrivalPigtailId = arrivalPigtailId;
    }

    public String getArrivalPigtailNumber() {
        return this.arrivalPigtailNumber;
    }

    public void setArrivalPigtailNumber(String arrivalPigtailNumber) {
        this.arrivalPigtailNumber = arrivalPigtailNumber;
    }

    public String getPigtailCableType() {
        return this.pigtailCableType;
    }

    public void setPigtailCableType(String pigtailCableType) {
        this.pigtailCableType = pigtailCableType;
    }

    public String getPigtailSpecificationModel() {
        return this.pigtailSpecificationModel;
    }

    public void setPigtailSpecificationModel(String pigtailSpecificationModel) {
        this.pigtailSpecificationModel = pigtailSpecificationModel;
    }

    public String getPigtailDesignBars() {
        return this.pigtailDesignBars;
    }

    public void setPigtailDesignBars(String pigtailDesignBars) {
        this.pigtailDesignBars = pigtailDesignBars;
    }

    public String getDesignSingleLength() {
        return this.designSingleLength;
    }

    public void setDesignSingleLength(String designSingleLength) {
        this.designSingleLength = designSingleLength;
    }

    public String getPigtailArrivalsNumber() {
        return this.pigtailArrivalsNumber;
    }

    public void setPigtailArrivalsNumber(String pigtailArrivalsNumber) {
        this.pigtailArrivalsNumber = pigtailArrivalsNumber;
    }

    public String getArrivalSingleLength() {
        return this.arrivalSingleLength;
    }

    public void setArrivalSingleLength(String arrivalSingleLength) {
        this.arrivalSingleLength = arrivalSingleLength;
    }

    public String getPigtailArrivalTime() {
        return this.pigtailArrivalTime;
    }

    public void setPigtailArrivalTime(String pigtailArrivalTime) {
        this.pigtailArrivalTime = pigtailArrivalTime;
    }

    public String getPigtailVerifyingPhotos() {
        return this.pigtailVerifyingPhotos;
    }

    public void setPigtailVerifyingPhotos(String pigtailVerifyingPhotos) {
        this.pigtailVerifyingPhotos = pigtailVerifyingPhotos;
    }

    @Override
    public String toString() {
        return "FaArrivalPigtail{" +
                "arrivalPigtailId='" + arrivalPigtailId + '\'' +
                ", arrivalPigtailNumber='" + arrivalPigtailNumber + '\'' +
                ", pigtailCableType='" + pigtailCableType + '\'' +
                ", pigtailSpecificationModel='" + pigtailSpecificationModel + '\'' +
                ", pigtailDesignBars='" + pigtailDesignBars + '\'' +
                ", designSingleLength='" + designSingleLength + '\'' +
                ", pigtailArrivalsNumber='" + pigtailArrivalsNumber + '\'' +
                ", arrivalSingleLength='" + arrivalSingleLength + '\'' +
                ", pigtailArrivalTime='" + pigtailArrivalTime + '\'' +
                ", pigtailVerifyingPhotos='" + pigtailVerifyingPhotos + '\'' +
                '}';
    }
}
