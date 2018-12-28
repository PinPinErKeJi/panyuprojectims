package com.panyu.panyuprojectims.entity;

import java.util.List;

public class CircuitInspectionProject {
    private String circuitProjectId;
    private String circuitProjectName;
    private String circuitSubWorkId;
    private String circuitCriterionName;
    private List<CircuitPhotoResources> circuitPhotoResourcesList;


    public CircuitInspectionProject() {
        super();
    }

    public CircuitInspectionProject(String circuitProjectId, String circuitProjectName, String circuitSubWorkId, String circuitCriterionName, List<CircuitPhotoResources> circuitPhotoResourcesList) {
        this.circuitProjectId = circuitProjectId;
        this.circuitProjectName = circuitProjectName;
        this.circuitSubWorkId = circuitSubWorkId;
        this.circuitCriterionName = circuitCriterionName;
        this.circuitPhotoResourcesList = circuitPhotoResourcesList;
    }

    public String getCircuitProjectId() {
        return circuitProjectId;
    }

    public void setCircuitProjectId(String circuitProjectId) {
        this.circuitProjectId = circuitProjectId;
    }

    public String getCircuitProjectName() {
        return circuitProjectName;
    }

    public void setCircuitProjectName(String circuitProjectName) {
        this.circuitProjectName = circuitProjectName;
    }

    public String getCircuitSubWorkId() {
        return circuitSubWorkId;
    }

    public void setCircuitSubWorkId(String circuitSubWorkId) {
        this.circuitSubWorkId = circuitSubWorkId;
    }

    public String getCircuitCriterionName() {
        return circuitCriterionName;
    }

    public void setCircuitCriterionName(String circuitCriterionName) {
        this.circuitCriterionName = circuitCriterionName;
    }

    public List<CircuitPhotoResources> getCircuitPhotoResourcesList() {
        return circuitPhotoResourcesList;
    }

    public void setCircuitPhotoResourcesList(List<CircuitPhotoResources> circuitPhotoResourcesList) {
        this.circuitPhotoResourcesList = circuitPhotoResourcesList;
    }

    @Override
    public String toString() {
        return "CircuitInspectionProject{" +
                "circuitProjectId='" + circuitProjectId + '\'' +
                ", circuitProjectName='" + circuitProjectName + '\'' +
                ", circuitSubWorkId='" + circuitSubWorkId + '\'' +
                ", circuitCriterionName='" + circuitCriterionName + '\'' +
                ", circuitPhotoResourcesList=" + circuitPhotoResourcesList +
                '}';
    }
}
