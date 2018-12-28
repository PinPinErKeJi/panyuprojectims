package com.panyu.panyuprojectims.entity;
public class CircuitInspectionCriterion {
    private String circuitCriterionId;
    private String circuitCriterionName;
    private String circuitQualified;
    private String circuitProblem;
    private String circuitPhoto;
    private String circuitProjectId;




    public CircuitInspectionCriterion() {
        super();
    }
    public CircuitInspectionCriterion(String circuitCriterionId,String circuitCriterionName,String circuitQualified,String circuitProblem,String circuitPhoto,String circuitProjectId) {
        super();
        this.circuitCriterionId = circuitCriterionId;
        this.circuitCriterionName = circuitCriterionName;
        this.circuitQualified = circuitQualified;
        this.circuitProblem = circuitProblem;
        this.circuitPhoto = circuitPhoto;
        this.circuitProjectId = circuitProjectId;
    }
    public String getCircuitCriterionId() {
        return this.circuitCriterionId;
    }

    public void setCircuitCriterionId(String circuitCriterionId) {
        this.circuitCriterionId = circuitCriterionId;
    }

    public String getCircuitCriterionName() {
        return this.circuitCriterionName;
    }

    public void setCircuitCriterionName(String circuitCriterionName) {
        this.circuitCriterionName = circuitCriterionName;
    }

    public String getCircuitQualified() {
        return this.circuitQualified;
    }

    public void setCircuitQualified(String circuitQualified) {
        this.circuitQualified = circuitQualified;
    }

    public String getCircuitProblem() {
        return this.circuitProblem;
    }

    public void setCircuitProblem(String circuitProblem) {
        this.circuitProblem = circuitProblem;
    }

    public String getCircuitPhoto() {
        return this.circuitPhoto;
    }

    public void setCircuitPhoto(String circuitPhoto) {
        this.circuitPhoto = circuitPhoto;
    }

    public String getCircuitProjectId() {
        return this.circuitProjectId;
    }

    public void setCircuitProjectId(String circuitProjectId) {
        this.circuitProjectId = circuitProjectId;
    }

    @Override
    public String toString() {
        return "CircuitInspectionCriterion{" +
                "circuitCriterionId='" + circuitCriterionId + '\'' +
                ", circuitCriterionName='" + circuitCriterionName + '\'' +
                ", circuitQualified='" + circuitQualified + '\'' +
                ", circuitProblem='" + circuitProblem + '\'' +
                ", circuitPhoto='" + circuitPhoto + '\'' +
                ", circuitProjectId='" + circuitProjectId + '\'' +
                '}';
    }
}
