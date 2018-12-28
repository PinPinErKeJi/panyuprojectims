package com.panyu.panyuprojectims.entity;
public class IcRruNumber {
    private String rruNumberId;
    private String designStart;
    private String dramInstalledDram;

    public IcRruNumber() {
        super();
    }
    public IcRruNumber(String rruNumberId,String designStart,String dramInstalledDram) {
        super();
        this.rruNumberId = rruNumberId;
        this.designStart = designStart;
        this.dramInstalledDram = dramInstalledDram;
    }
    public String getRruNumberId() {
        return this.rruNumberId;
    }

    public void setRruNumberId(String rruNumberId) {
        this.rruNumberId = rruNumberId;
    }

    public String getDesignStart() {
        return this.designStart;
    }

    public void setDesignStart(String designStart) {
        this.designStart = designStart;
    }

    public String getDramInstalledDram() {
        return this.dramInstalledDram;
    }

    public void setDramInstalledDram(String dramInstalledDram) {
        this.dramInstalledDram = dramInstalledDram;
    }

    @Override
    public String toString() {
        return "IcRruNumber{" +
                "rruNumberId='" + rruNumberId + '\'' +
                ", designStart='" + designStart + '\'' +
                ", dramInstalledDram='" + dramInstalledDram + '\'' +
                '}';
    }
}
