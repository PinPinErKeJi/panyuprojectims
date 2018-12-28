package com.panyu.panyuprojectims.entity;
public class SkyBranch {
    private String skyBranchId;
    private String constructionMode;
    private String basicType;
    private String foundationConstructionName;
    private String basicUnitContacts;
    private String skyBranchTypeName;
    private String skyBranchSupplierName;
    private String skyBranchSupplierContacts;
    private String skyBranchUnitName;
    private String skyConstructionUnitContacts;
    private String skyBranchHeight;
    public SkyBranch() {
        super();
    }
    public SkyBranch(String skyBranchId,String constructionMode,String basicType,String foundationConstructionName,String basicUnitContacts,String skyBranchTypeName,String skyBranchSupplierName,String skyBranchSupplierContacts,String skyBranchUnitName,String skyConstructionUnitContacts,String skyBranchHeight) {
        super();
        this.skyBranchId = skyBranchId;
        this.constructionMode = constructionMode;
        this.basicType = basicType;
        this.foundationConstructionName = foundationConstructionName;
        this.basicUnitContacts = basicUnitContacts;
        this.skyBranchTypeName = skyBranchTypeName;
        this.skyBranchSupplierName = skyBranchSupplierName;
        this.skyBranchSupplierContacts = skyBranchSupplierContacts;
        this.skyBranchUnitName = skyBranchUnitName;
        this.skyConstructionUnitContacts = skyConstructionUnitContacts;
        this.skyBranchHeight = skyBranchHeight;
    }

    public String getSkyBranchId() {
        return skyBranchId;
    }

    public void setSkyBranchId(String skyBranchId) {
        this.skyBranchId = skyBranchId;
    }

    public String getConstructionMode() {
        return constructionMode;
    }

    public void setConstructionMode(String constructionMode) {
        this.constructionMode = constructionMode;
    }

    public String getBasicType() {
        return basicType;
    }

    public void setBasicType(String basicType) {
        this.basicType = basicType;
    }

    public String getFoundationConstructionName() {
        return foundationConstructionName;
    }

    public void setFoundationConstructionName(String foundationConstructionName) {
        this.foundationConstructionName = foundationConstructionName;
    }

    public String getBasicUnitContacts() {
        return basicUnitContacts;
    }

    public void setBasicUnitContacts(String basicUnitContacts) {
        this.basicUnitContacts = basicUnitContacts;
    }

    public String getSkyBranchTypeName() {
        return skyBranchTypeName;
    }

    public void setSkyBranchTypeName(String skyBranchTypeName) {
        this.skyBranchTypeName = skyBranchTypeName;
    }

    public String getSkyBranchSupplierName() {
        return skyBranchSupplierName;
    }

    public void setSkyBranchSupplierName(String skyBranchSupplierName) {
        this.skyBranchSupplierName = skyBranchSupplierName;
    }

    public String getSkyBranchSupplierContacts() {
        return skyBranchSupplierContacts;
    }

    public void setSkyBranchSupplierContacts(String skyBranchSupplierContacts) {
        this.skyBranchSupplierContacts = skyBranchSupplierContacts;
    }

    public String getSkyBranchUnitName() {
        return skyBranchUnitName;
    }

    public void setSkyBranchUnitName(String skyBranchUnitName) {
        this.skyBranchUnitName = skyBranchUnitName;
    }

    public String getSkyConstructionUnitContacts() {
        return skyConstructionUnitContacts;
    }

    public void setSkyConstructionUnitContacts(String skyConstructionUnitContacts) {
        this.skyConstructionUnitContacts = skyConstructionUnitContacts;
    }

    public String getSkyBranchHeight() {
        return skyBranchHeight;
    }

    public void setSkyBranchHeight(String skyBranchHeight) {
        this.skyBranchHeight = skyBranchHeight;
    }

    @Override
    public String toString() {
        return "SkyBranch{" +
                "skyBranchId='" + skyBranchId + '\'' +
                ", constructionMode='" + constructionMode + '\'' +
                ", basicType='" + basicType + '\'' +
                ", foundationConstructionName='" + foundationConstructionName + '\'' +
                ", basicUnitContacts='" + basicUnitContacts + '\'' +
                ", skyBranchTypeName='" + skyBranchTypeName + '\'' +
                ", skyBranchSupplierName='" + skyBranchSupplierName + '\'' +
                ", skyBranchSupplierContacts='" + skyBranchSupplierContacts + '\'' +
                ", skyBranchUnitName='" + skyBranchUnitName + '\'' +
                ", skyConstructionUnitContacts='" + skyConstructionUnitContacts + '\'' +
                ", skyBranchHeight='" + skyBranchHeight + '\'' +
                '}';
    }
}
