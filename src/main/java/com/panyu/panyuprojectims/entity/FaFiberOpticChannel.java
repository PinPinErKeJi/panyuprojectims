package com.panyu.panyuprojectims.entity;
public class FaFiberOpticChannel {
    private String fiberOpticChannelId;
    private String fiberOpticNumber;
    private String fiberOpticDesignLength;
    private String fiberOpticSupplier;
    private String fiberOpticContacts;
    public FaFiberOpticChannel() {
        super();
    }
    public FaFiberOpticChannel(String fiberOpticChannelId,String fiberOpticNumber,String fiberOpticDesignLength,String fiberOpticSupplier,String fiberOpticContacts) {
        super();
        this.fiberOpticChannelId = fiberOpticChannelId;
        this.fiberOpticNumber = fiberOpticNumber;
        this.fiberOpticDesignLength = fiberOpticDesignLength;
        this.fiberOpticSupplier = fiberOpticSupplier;
        this.fiberOpticContacts = fiberOpticContacts;
    }
    public String getFiberOpticChannelId() {
        return this.fiberOpticChannelId;
    }

    public void setFiberOpticChannelId(String fiberOpticChannelId) {
        this.fiberOpticChannelId = fiberOpticChannelId;
    }

    public String getFiberOpticNumber() {
        return this.fiberOpticNumber;
    }

    public void setFiberOpticNumber(String fiberOpticNumber) {
        this.fiberOpticNumber = fiberOpticNumber;
    }

    public String getFiberOpticDesignLength() {
        return this.fiberOpticDesignLength;
    }

    public void setFiberOpticDesignLength(String fiberOpticDesignLength) {
        this.fiberOpticDesignLength = fiberOpticDesignLength;
    }

    public String getFiberOpticSupplier() {
        return this.fiberOpticSupplier;
    }

    public void setFiberOpticSupplier(String fiberOpticSupplier) {
        this.fiberOpticSupplier = fiberOpticSupplier;
    }

    public String getFiberOpticContacts() {
        return this.fiberOpticContacts;
    }

    public void setFiberOpticContacts(String fiberOpticContacts) {
        this.fiberOpticContacts = fiberOpticContacts;
    }

    @Override
    public String toString() {
        return "FaFiberOpticChannel{" +
                "fiberOpticChannelId='" + fiberOpticChannelId + '\'' +
                ", fiberOpticNumber='" + fiberOpticNumber + '\'' +
                ", fiberOpticDesignLength='" + fiberOpticDesignLength + '\'' +
                ", fiberOpticSupplier='" + fiberOpticSupplier + '\'' +
                ", fiberOpticContacts='" + fiberOpticContacts + '\'' +
                '}';
    }
}
