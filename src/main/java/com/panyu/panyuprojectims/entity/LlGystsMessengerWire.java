package com.panyu.panyuprojectims.entity;
public class LlGystsMessengerWire {
    private String messengerWireId;
    private String messengerDesignLength;
    private String messengerLaidLength;
    public LlGystsMessengerWire() {
        super();
    }
    public LlGystsMessengerWire(String messengerWireId,String messengerDesignLength,String messengerLaidLength) {
        super();
        this.messengerWireId = messengerWireId;
        this.messengerDesignLength = messengerDesignLength;
        this.messengerLaidLength = messengerLaidLength;
    }
    public String getMessengerWireId() {
        return this.messengerWireId;
    }

    public void setMessengerWireId(String messengerWireId) {
        this.messengerWireId = messengerWireId;
    }

    public String getMessengerDesignLength() {
        return this.messengerDesignLength;
    }

    public void setMessengerDesignLength(String messengerDesignLength) {
        this.messengerDesignLength = messengerDesignLength;
    }

    public String getMessengerLaidLength() {
        return this.messengerLaidLength;
    }

    public void setMessengerLaidLength(String messengerLaidLength) {
        this.messengerLaidLength = messengerLaidLength;
    }

    @Override
    public String toString() {
        return "LlGystsMessengerWire{" +
                "messengerWireId='" + messengerWireId + '\'' +
                ", messengerDesignLength='" + messengerDesignLength + '\'' +
                ", messengerLaidLength='" + messengerLaidLength + '\'' +
                '}';
    }
}
