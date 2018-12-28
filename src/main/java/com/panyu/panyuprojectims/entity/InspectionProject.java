package com.panyu.panyuprojectims.entity;

import java.util.List;

public class InspectionProject {
    private String projectId;
    private String projectName;
    private String subId;
    private boolean status;
    private String inspectionContent;
    private List<PhotoResources> photoResourcesList;

    public InspectionProject() {
    }

    public InspectionProject(String projectId, String projectName, String subId, boolean status, String inspectionContent, List<PhotoResources> photoResourcesList) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.subId = subId;
        this.status = status;
        this.inspectionContent = inspectionContent;
        this.photoResourcesList = photoResourcesList;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getInspectionContent() {
        return inspectionContent;
    }

    public void setInspectionContent(String inspectionContent) {
        this.inspectionContent = inspectionContent;
    }

    public List<PhotoResources> getPhotoResourcesList() {
        return photoResourcesList;
    }

    public void setPhotoResourcesList(List<PhotoResources> photoResourcesList) {
        this.photoResourcesList = photoResourcesList;
    }

    @Override
    public String toString() {
        return "InspectionProject{" +
                "projectId='" + projectId + '\'' +
                ", projectName='" + projectName + '\'' +
                ", subId='" + subId + '\'' +
                ", status=" + status +
                ", inspectionContent='" + inspectionContent + '\'' +
                ", photoResourcesList=" + photoResourcesList +
                '}';
    }
}