package com.panyu.panyuprojectims.entity;
public class FaWalkingFrame {
    private String walkingFrameId;
    private String walkingNumber;
    private String walkingDesignLength;
    private String walkingFrameSupplier;
    private String walkingFrameContacts;

    public FaWalkingFrame() {
        super();
    }
    public FaWalkingFrame(String walkingFrameId,String walkingNumber,String walkingDesignLength,String walkingFrameSupplier,String walkingFrameContacts) {
        super();
        this.walkingFrameId = walkingFrameId;
        this.walkingNumber = walkingNumber;
        this.walkingDesignLength = walkingDesignLength;
        this.walkingFrameSupplier = walkingFrameSupplier;
        this.walkingFrameContacts = walkingFrameContacts;
    }
    public String getWalkingFrameId() {
        return this.walkingFrameId;
    }

    public void setWalkingFrameId(String walkingFrameId) {
        this.walkingFrameId = walkingFrameId;
    }

    public String getWalkingNumber() {
        return this.walkingNumber;
    }

    public void setWalkingNumber(String walkingNumber) {
        this.walkingNumber = walkingNumber;
    }

    public String getWalkingDesignLength() {
        return this.walkingDesignLength;
    }

    public void setWalkingDesignLength(String walkingDesignLength) {
        this.walkingDesignLength = walkingDesignLength;
    }

    public String getWalkingFrameSupplier() {
        return this.walkingFrameSupplier;
    }

    public void setWalkingFrameSupplier(String walkingFrameSupplier) {
        this.walkingFrameSupplier = walkingFrameSupplier;
    }

    public String getWalkingFrameContacts() {
        return this.walkingFrameContacts;
    }

    public void setWalkingFrameContacts(String walkingFrameContacts) {
        this.walkingFrameContacts = walkingFrameContacts;
    }

    @Override
    public String toString() {
        return "FaWalkingFrame{" +
                "walkingFrameId='" + walkingFrameId + '\'' +
                ", walkingNumber='" + walkingNumber + '\'' +
                ", walkingDesignLength='" + walkingDesignLength + '\'' +
                ", walkingFrameSupplier='" + walkingFrameSupplier + '\'' +
                ", walkingFrameContacts='" + walkingFrameContacts + '\'' +
                '}';
    }
}
