package com.panyu.panyuprojectims.entity;
public class FaBoardcardDilatation {
    private String boardCardDilatationId;
    private String boardCardNumber;
    private String boardCardName;
    private String veneerFunction;
    private String placeEquipment;
    private String boardCardDesignQuantity;
    private String boardCardSupplier;
    private String boardCardContacts;

    public FaBoardcardDilatation() {
        super();
    }
    public FaBoardcardDilatation(String boardCardDilatationId,String boardCardNumber,String boardCardName,String veneerFunction,String placeEquipment,String boardCardDesignQuantity,String boardCardSupplier,String boardCardContacts) {
        super();
        this.boardCardDilatationId = boardCardDilatationId;
        this.boardCardNumber = boardCardNumber;
        this.boardCardName = boardCardName;
        this.veneerFunction = veneerFunction;
        this.placeEquipment = placeEquipment;
        this.boardCardDesignQuantity = boardCardDesignQuantity;
        this.boardCardSupplier = boardCardSupplier;
        this.boardCardContacts = boardCardContacts;
    }
    public String getBoardCardDilatationId() {
        return this.boardCardDilatationId;
    }

    public void setBoardCardDilatationId(String boardCardDilatationId) {
        this.boardCardDilatationId = boardCardDilatationId;
    }

    public String getBoardCardNumber() {
        return this.boardCardNumber;
    }

    public void setBoardCardNumber(String boardCardNumber) {
        this.boardCardNumber = boardCardNumber;
    }

    public String getBoardCardName() {
        return this.boardCardName;
    }

    public void setBoardCardName(String boardCardName) {
        this.boardCardName = boardCardName;
    }

    public String getVeneerFunction() {
        return this.veneerFunction;
    }

    public void setVeneerFunction(String veneerFunction) {
        this.veneerFunction = veneerFunction;
    }

    public String getPlaceEquipment() {
        return this.placeEquipment;
    }

    public void setPlaceEquipment(String placeEquipment) {
        this.placeEquipment = placeEquipment;
    }

    public String getBoardCardDesignQuantity() {
        return this.boardCardDesignQuantity;
    }

    public void setBoardCardDesignQuantity(String boardCardDesignQuantity) {
        this.boardCardDesignQuantity = boardCardDesignQuantity;
    }

    public String getBoardCardSupplier() {
        return this.boardCardSupplier;
    }

    public void setBoardCardSupplier(String boardCardSupplier) {
        this.boardCardSupplier = boardCardSupplier;
    }

    public String getBoardCardContacts() {
        return this.boardCardContacts;
    }

    public void setBoardCardContacts(String boardCardContacts) {
        this.boardCardContacts = boardCardContacts;
    }

    @Override
    public String toString() {
        return "FaBoardcardDilatation{" +
                "boardCardDilatationId='" + boardCardDilatationId + '\'' +
                ", boardCardNumber='" + boardCardNumber + '\'' +
                ", boardCardName='" + boardCardName + '\'' +
                ", veneerFunction='" + veneerFunction + '\'' +
                ", placeEquipment='" + placeEquipment + '\'' +
                ", boardCardDesignQuantity='" + boardCardDesignQuantity + '\'' +
                ", boardCardSupplier='" + boardCardSupplier + '\'' +
                ", boardCardContacts='" + boardCardContacts + '\'' +
                '}';
    }
}
