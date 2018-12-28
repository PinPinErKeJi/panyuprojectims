package com.panyu.panyuprojectims.entity;
public class CircuitPhotoResources {
    private String circuitPhotoId;
    private String circuitPhotoName;
    private String photoUploadPeople;
    private String qualified;
    private String problemDescription;
    private String circuitModuleId;
    private String circuitSubWorkId;
    private String circuitProjectId;
    private String circuitInformationId;



    public CircuitPhotoResources() {
        super();
    }
    public CircuitPhotoResources(String circuitPhotoId,String circuitPhotoName,String photoUploadPeople,String qualified,String problemDescription,String circuitModuleId,String circuitSubWorkId,String circuitProjectId,String circuitInformationId) {
        super();
        this.circuitPhotoId = circuitPhotoId;
        this.circuitPhotoName = circuitPhotoName;
        this.photoUploadPeople = photoUploadPeople;
        this.qualified = qualified;
        this.problemDescription = problemDescription;
        this.circuitModuleId = circuitModuleId;
        this.circuitSubWorkId = circuitSubWorkId;
        this.circuitProjectId = circuitProjectId;
        this.circuitInformationId = circuitInformationId;
    }
    public String getCircuitPhotoId() {
        return this.circuitPhotoId;
    }

    public void setCircuitPhotoId(String circuitPhotoId) {
        this.circuitPhotoId = circuitPhotoId;
    }

    public String getCircuitPhotoName() {
        return this.circuitPhotoName;
    }

    public void setCircuitPhotoName(String circuitPhotoName) {
        this.circuitPhotoName = circuitPhotoName;
    }

    public String getPhotoUploadPeople() {
        return this.photoUploadPeople;
    }

    public void setPhotoUploadPeople(String photoUploadPeople) {
        this.photoUploadPeople = photoUploadPeople;
    }

    public String getQualified() {
        return this.qualified;
    }

    public void setQualified(String qualified) {
        this.qualified = qualified;
    }

    public String getProblemDescription() {
        return this.problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getCircuitModuleId() {
        return this.circuitModuleId;
    }

    public void setCircuitModuleId(String circuitModuleId) {
        this.circuitModuleId = circuitModuleId;
    }

    public String getCircuitSubWorkId() {
        return this.circuitSubWorkId;
    }

    public void setCircuitSubWorkId(String circuitSubWorkId) {
        this.circuitSubWorkId = circuitSubWorkId;
    }

    public String getCircuitProjectId() {
        return this.circuitProjectId;
    }

    public void setCircuitProjectId(String circuitProjectId) {
        this.circuitProjectId = circuitProjectId;
    }

    public String getCircuitInformationId() {
        return this.circuitInformationId;
    }

    public void setCircuitInformationId(String circuitInformationId) {
        this.circuitInformationId = circuitInformationId;
    }

    @Override
    public String toString() {
        return "CircuitPhotoResources{" +
                "circuitPhotoId='" + circuitPhotoId + '\'' +
                ", circuitPhotoName='" + circuitPhotoName + '\'' +
                ", photoUploadPeople='" + photoUploadPeople + '\'' +
                ", qualified='" + qualified + '\'' +
                ", problemDescription='" + problemDescription + '\'' +
                ", circuitModuleId='" + circuitModuleId + '\'' +
                ", circuitSubWorkId='" + circuitSubWorkId + '\'' +
                ", circuitProjectId='" + circuitProjectId + '\'' +
                ", circuitInformationId='" + circuitInformationId + '\'' +
                '}';
    }
}
