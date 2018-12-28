package com.panyu.panyuprojectims.entity;
public class LlDesignInstitute {
    private String designInstituteId;
    private String companyName;
    private String designPersonnel;
    public LlDesignInstitute() {
        super();
    }
    public LlDesignInstitute(String designInstituteId,String companyName,String designPersonnel) {
        super();
        this.designInstituteId = designInstituteId;
        this.companyName = companyName;
        this.designPersonnel = designPersonnel;
    }
    public String getDesignInstituteId() {
        return this.designInstituteId;
    }

    public void setDesignInstituteId(String designInstituteId) {
        this.designInstituteId = designInstituteId;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDesignPersonnel() {
        return this.designPersonnel;
    }

    public void setDesignPersonnel(String designPersonnel) {
        this.designPersonnel = designPersonnel;
    }

    @Override
    public String toString() {
        return "LlDesignInstitute{" +
                "designInstituteId='" + designInstituteId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", designPersonnel='" + designPersonnel + '\'' +
                '}';
    }
}
