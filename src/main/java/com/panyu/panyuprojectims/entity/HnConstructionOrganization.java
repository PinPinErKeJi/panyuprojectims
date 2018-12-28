package com.panyu.panyuprojectims.entity;
public class HnConstructionOrganization {
    private String constructionOrganizationId;
    private String constructionCorporateName;
    private String constructionLinkman;
    public HnConstructionOrganization() {
        super();
    }
    public HnConstructionOrganization(String constructionOrganizationId,String constructionCorporateName,String constructionLinkman) {
        super();
        this.constructionOrganizationId = constructionOrganizationId;
        this.constructionCorporateName = constructionCorporateName;
        this.constructionLinkman = constructionLinkman;
    }
    public String getConstructionOrganizationId() {
        return this.constructionOrganizationId;
    }

    public void setConstructionOrganizationId(String constructionOrganizationId) {
        this.constructionOrganizationId = constructionOrganizationId;
    }

    public String getConstructionCorporateName() {
        return this.constructionCorporateName;
    }

    public void setConstructionCorporateName(String constructionCorporateName) {
        this.constructionCorporateName = constructionCorporateName;
    }

    public String getConstructionLinkman() {
        return this.constructionLinkman;
    }

    public void setConstructionLinkman(String constructionLinkman) {
        this.constructionLinkman = constructionLinkman;
    }

    @Override
    public String toString() {
        return "HnConstructionOrganization{" +
                "constructionOrganizationId='" + constructionOrganizationId + '\'' +
                ", constructionCorporateName='" + constructionCorporateName + '\'' +
                ", constructionLinkman='" + constructionLinkman + '\'' +
                '}';
    }
}
