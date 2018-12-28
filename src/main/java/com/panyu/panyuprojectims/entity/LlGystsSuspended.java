package com.panyu.panyuprojectims.entity;
public class LlGystsSuspended {
    private String suspendedId;
    private String suspendedDesignLength;
    private String suspendedLaidLength;
    public LlGystsSuspended() {
        super();
    }
    public LlGystsSuspended(String suspendedId,String suspendedDesignLength,String suspendedLaidLength) {
        super();
        this.suspendedId = suspendedId;
        this.suspendedDesignLength = suspendedDesignLength;
        this.suspendedLaidLength = suspendedLaidLength;
    }
    public String getSuspendedId() {
        return this.suspendedId;
    }

    public void setSuspendedId(String suspendedId) {
        this.suspendedId = suspendedId;
    }

    public String getSuspendedDesignLength() {
        return this.suspendedDesignLength;
    }

    public void setSuspendedDesignLength(String suspendedDesignLength) {
        this.suspendedDesignLength = suspendedDesignLength;
    }

    public String getSuspendedLaidLength() {
        return this.suspendedLaidLength;
    }

    public void setSuspendedLaidLength(String suspendedLaidLength) {
        this.suspendedLaidLength = suspendedLaidLength;
    }

    @Override
    public String toString() {
        return "LlGystsSuspended{" +
                "suspendedId='" + suspendedId + '\'' +
                ", suspendedDesignLength='" + suspendedDesignLength + '\'' +
                ", suspendedLaidLength='" + suspendedLaidLength + '\'' +
                '}';
    }
}
