package com.panyu.panyuprojectims.entity;

import java.util.List;

public class SubWork {
    private String subId;
    private String subName;
    private String moduleId;
    private boolean status;

    private List<InspectionProject> inspectionProjectList;

    public SubWork() {
    }

    public SubWork(String subId, String subName, String moduleId, boolean status, List<InspectionProject> inspectionProjectList) {
        this.subId = subId;
        this.subName = subName;
        this.moduleId = moduleId;
        this.status = status;
        this.inspectionProjectList = inspectionProjectList;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<InspectionProject> getInspectionProjectList() {
        return inspectionProjectList;
    }

    public void setInspectionProjectList(List<InspectionProject> inspectionProjectList) {
        this.inspectionProjectList = inspectionProjectList;
    }

    @Override
    public String toString() {
        return "SubWork{" +
                "subId='" + subId + '\'' +
                ", subName='" + subName + '\'' +
                ", moduleId='" + moduleId + '\'' +
                ", status=" + status +
                ", inspectionProjectList=" + inspectionProjectList +
                '}';
    }
}