package com.panyu.panyuprojectims.entity;
public class PhotoResources {
    private String photoResourcesId;
    private String photoName;
    private String photoUploadPeople;
    private String qualified;
    private String problemDescription;
    private String moduleId;
    private String subId;
    private String parentId;
    private String projectProgressId;

    public PhotoResources() {
        super();
    }

    public PhotoResources(String photoResourcesId, String photoName, String photoUploadPeople, String qualified, String problemDescription, String moduleId, String subId, String parentId, String projectProgressId) {
        this.photoResourcesId = photoResourcesId;
        this.photoName = photoName;
        this.photoUploadPeople = photoUploadPeople;
        this.qualified = qualified;
        this.problemDescription = problemDescription;
        this.moduleId = moduleId;
        this.subId = subId;
        this.parentId = parentId;
        this.projectProgressId = projectProgressId;
    }

    public String getPhotoResourcesId() {
        return photoResourcesId;
    }

    public void setPhotoResourcesId(String photoResourcesId) {
        this.photoResourcesId = photoResourcesId;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public String getPhotoUploadPeople() {
        return photoUploadPeople;
    }

    public void setPhotoUploadPeople(String photoUploadPeople) {
        this.photoUploadPeople = photoUploadPeople;
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

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getProjectProgressId() {
        return projectProgressId;
    }

    public void setProjectProgressId(String projectProgressId) {
        this.projectProgressId = projectProgressId;
    }

    @Override
    public String toString() {
        return "PhotoResources{" +
                "photoResourcesId='" + photoResourcesId + '\'' +
                ", photoName='" + photoName + '\'' +
                ", photoUploadPeople='" + photoUploadPeople + '\'' +
                ", qualified='" + qualified + '\'' +
                ", problemDescription='" + problemDescription + '\'' +
                ", moduleId='" + moduleId + '\'' +
                ", subId='" + subId + '\'' +
                ", parentId='" + parentId + '\'' +
                ", projectProgressId='" + projectProgressId + '\'' +
                '}';
    }
}
