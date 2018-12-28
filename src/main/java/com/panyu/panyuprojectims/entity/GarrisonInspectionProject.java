package com.panyu.panyuprojectims.entity;

import java.util.List;

public class GarrisonInspectionProject {
    private String garrisonProjectId;
    private String garrisonProjectName;
    private String garrisonSubWorkId;
    private String garrisonCriterionName;
    private List<GarrisonPhotoResources> garrisonPhotoResourcesList;



    public GarrisonInspectionProject() {
        super();
    }
    public GarrisonInspectionProject(String garrisonProjectId, String garrisonProjectName, String garrisonSubWorkId, String garrisonCriterionName, List<GarrisonPhotoResources> garrisonPhotoResourcesList) {
        this.garrisonProjectId = garrisonProjectId;
        this.garrisonProjectName = garrisonProjectName;
        this.garrisonSubWorkId = garrisonSubWorkId;
        this.garrisonCriterionName = garrisonCriterionName;
        this.garrisonPhotoResourcesList = garrisonPhotoResourcesList;
    }

    public String getGarrisonProjectId() {
        return garrisonProjectId;
    }

    public void setGarrisonProjectId(String garrisonProjectId) {
        this.garrisonProjectId = garrisonProjectId;
    }

    public String getGarrisonProjectName() {
        return garrisonProjectName;
    }

    public void setGarrisonProjectName(String garrisonProjectName) {
        this.garrisonProjectName = garrisonProjectName;
    }

    public String getGarrisonSubWorkId() {
        return garrisonSubWorkId;
    }

    public void setGarrisonSubWorkId(String garrisonSubWorkId) {
        this.garrisonSubWorkId = garrisonSubWorkId;
    }

    public String getGarrisonCriterionName() {
        return garrisonCriterionName;
    }

    public void setGarrisonCriterionName(String garrisonCriterionName) {
        this.garrisonCriterionName = garrisonCriterionName;
    }

    public List<GarrisonPhotoResources> getGarrisonPhotoResourcesList() {
        return garrisonPhotoResourcesList;
    }

    public void setGarrisonPhotoResourcesList(List<GarrisonPhotoResources> garrisonPhotoResourcesList) {
        this.garrisonPhotoResourcesList = garrisonPhotoResourcesList;
    }

    @Override
    public String toString() {
        return "GarrisonInspectionProject{" +
                "garrisonProjectId='" + garrisonProjectId + '\'' +
                ", garrisonProjectName='" + garrisonProjectName + '\'' +
                ", garrisonSubWorkId='" + garrisonSubWorkId + '\'' +
                ", garrisonCriterionName='" + garrisonCriterionName + '\'' +
                ", garrisonPhotoResourcesList=" + garrisonPhotoResourcesList +
                '}';
    }
}
