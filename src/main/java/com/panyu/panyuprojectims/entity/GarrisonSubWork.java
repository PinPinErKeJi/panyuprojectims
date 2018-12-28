package com.panyu.panyuprojectims.entity;

import java.util.List;

public class GarrisonSubWork {
    private String garrisonSubWorkId;
    private String garrisonSubWorkName;
    private String garrisonId;



    private List<GarrisonInspectionProject> garrisonInspectionProjectList;
    public GarrisonSubWork() {
        super();
    }

    public GarrisonSubWork(String garrisonSubWorkId, String garrisonSubWorkName, String garrisonId, List<GarrisonInspectionProject> garrisonInspectionProjectList) {
        this.garrisonSubWorkId = garrisonSubWorkId;
        this.garrisonSubWorkName = garrisonSubWorkName;
        this.garrisonId = garrisonId;
        this.garrisonInspectionProjectList = garrisonInspectionProjectList;
    }

    public String getGarrisonSubWorkId() {
        return garrisonSubWorkId;
    }

    public void setGarrisonSubWorkId(String garrisonSubWorkId) {
        this.garrisonSubWorkId = garrisonSubWorkId;
    }

    public String getGarrisonSubWorkName() {
        return garrisonSubWorkName;
    }

    public void setGarrisonSubWorkName(String garrisonSubWorkName) {
        this.garrisonSubWorkName = garrisonSubWorkName;
    }

    public String getGarrisonId() {
        return garrisonId;
    }

    public void setGarrisonId(String garrisonId) {
        this.garrisonId = garrisonId;
    }

    public List<GarrisonInspectionProject> getGarrisonInspectionProjectList() {
        return garrisonInspectionProjectList;
    }

    public void setGarrisonInspectionProjectList(List<GarrisonInspectionProject> garrisonInspectionProjectList) {
        this.garrisonInspectionProjectList = garrisonInspectionProjectList;
    }

    @Override
    public String toString() {
        return "GarrisonSubWork{" +
                "garrisonSubWorkId='" + garrisonSubWorkId + '\'' +
                ", garrisonSubWorkName='" + garrisonSubWorkName + '\'' +
                ", garrisonId='" + garrisonId + '\'' +
                ", garrisonInspectionProjectList=" + garrisonInspectionProjectList +
                '}';
    }
}
