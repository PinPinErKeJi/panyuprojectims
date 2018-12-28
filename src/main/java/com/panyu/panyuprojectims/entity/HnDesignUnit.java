package com.panyu.panyuprojectims.entity;
public class HnDesignUnit {
    private String designUnitId;
    private String designCorporateName;
    private String designConstructionLinkman;
    public HnDesignUnit() {
        super();
    }
    public HnDesignUnit(String designUnitId,String designCorporateName,String designConstructionLinkman) {
        super();
        this.designUnitId = designUnitId;
        this.designCorporateName = designCorporateName;
        this.designConstructionLinkman = designConstructionLinkman;
    }
    public String getDesignUnitId() {
        return this.designUnitId;
    }

    public void setDesignUnitId(String designUnitId) {
        this.designUnitId = designUnitId;
    }

    public String getDesignCorporateName() {
        return this.designCorporateName;
    }

    public void setDesignCorporateName(String designCorporateName) {
        this.designCorporateName = designCorporateName;
    }

    public String getDesignConstructionLinkman() {
        return this.designConstructionLinkman;
    }

    public void setDesignConstructionLinkman(String designConstructionLinkman) {
        this.designConstructionLinkman = designConstructionLinkman;
    }

    @Override
    public String toString() {
        return "HnDesignUnit{" +
                "designUnitId='" + designUnitId + '\'' +
                ", designCorporateName='" + designCorporateName + '\'' +
                ", designConstructionLinkman='" + designConstructionLinkman + '\'' +
                '}';
    }
}
