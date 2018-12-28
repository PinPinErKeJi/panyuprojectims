package com.panyu.panyuprojectims.entity;
//室内覆盖设计单位
public class IcDesignUnit {
    private String icDesignUnitId;
    private String designCorporateName;
    private String designPersonInCharge;

    public IcDesignUnit() {
        super();
    }
    public IcDesignUnit(String icDesignUnitId,String designCorporateName,String designPersonInCharge) {
        super();
        this.icDesignUnitId = icDesignUnitId;
        this.designCorporateName = designCorporateName;
        this.designPersonInCharge = designPersonInCharge;
    }
    public String getIcDesignUnitId() {
        return this.icDesignUnitId;
    }

    public void setIcDesignUnitId(String icDesignUnitId) {
        this.icDesignUnitId = icDesignUnitId;
    }

    public String getDesignCorporateName() {
        return this.designCorporateName;
    }

    public void setDesignCorporateName(String designCorporateName) {
        this.designCorporateName = designCorporateName;
    }

    public String getDesignPersonInCharge() {
        return this.designPersonInCharge;
    }

    public void setDesignPersonInCharge(String designPersonInCharge) {
        this.designPersonInCharge = designPersonInCharge;
    }

}
