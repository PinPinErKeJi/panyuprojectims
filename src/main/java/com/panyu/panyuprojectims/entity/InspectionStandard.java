package com.panyu.panyuprojectims.entity;
public class InspectionStandard {
    private String standardId;
    private String inspectionContent;
    private String qualified;
    private String problemDescription;
    private String photo;
    private String projectId;
    private boolean status;

    public InspectionStandard() {
    }

    public InspectionStandard(String standardId, String inspectionContent, String qualified, String problemDescription, String photo, String projectId, boolean status) {
        this.standardId = standardId;
        this.inspectionContent = inspectionContent;
        this.qualified = qualified;
        this.problemDescription = problemDescription;
        this.photo = photo;
        this.projectId = projectId;
        this.status = status;
    }

    public String getStandardId() {
        return standardId;
    }

    public void setStandardId(String standardId) {
        this.standardId = standardId;
    }

    public String getInspectionContent() {
        return inspectionContent;
    }

    public void setInspectionContent(String inspectionContent) {
        this.inspectionContent = inspectionContent;
    }

    public String getQualified() {
        return qualified;
    }

    public void setQualified(String qualified) {
        this.qualified = qualified;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "InspectionStandard{" +
                "standardId='" + standardId + '\'' +
                ", inspectionContent='" + inspectionContent + '\'' +
                ", qualified='" + qualified + '\'' +
                ", problemDescription='" + problemDescription + '\'' +
                ", photo='" + photo + '\'' +
                ", projectId='" + projectId + '\'' +
                ", status=" + status +
                '}';
    }
}
