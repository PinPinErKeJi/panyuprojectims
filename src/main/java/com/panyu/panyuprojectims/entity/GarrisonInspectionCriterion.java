package com.panyu.panyuprojectims.entity;
public class GarrisonInspectionCriterion {
    private String garrisonCriterionId;
    private String garrisonCriterionName;
    private String garrisonQualified;
    private String garrisonProblem;
    private String garrisonPhoto;
    private String garrisonProjectId;




    public GarrisonInspectionCriterion() {
        super();
    }
    public GarrisonInspectionCriterion(String garrisonCriterionId,String garrisonCriterionName,String garrisonQualified,String garrisonProblem,String garrisonPhoto,String garrisonProjectId) {
        super();
        this.garrisonCriterionId = garrisonCriterionId;
        this.garrisonCriterionName = garrisonCriterionName;
        this.garrisonQualified = garrisonQualified;
        this.garrisonProblem = garrisonProblem;
        this.garrisonPhoto = garrisonPhoto;
        this.garrisonProjectId = garrisonProjectId;
    }
    public String getGarrisonCriterionId() {
        return this.garrisonCriterionId;
    }

    public void setGarrisonCriterionId(String garrisonCriterionId) {
        this.garrisonCriterionId = garrisonCriterionId;
    }

    public String getGarrisonCriterionName() {
        return this.garrisonCriterionName;
    }

    public void setGarrisonCriterionName(String garrisonCriterionName) {
        this.garrisonCriterionName = garrisonCriterionName;
    }

    public String getGarrisonQualified() {
        return this.garrisonQualified;
    }

    public void setGarrisonQualified(String garrisonQualified) {
        this.garrisonQualified = garrisonQualified;
    }

    public String getGarrisonProblem() {
        return this.garrisonProblem;
    }

    public void setGarrisonProblem(String garrisonProblem) {
        this.garrisonProblem = garrisonProblem;
    }

    public String getGarrisonPhoto() {
        return this.garrisonPhoto;
    }

    public void setGarrisonPhoto(String garrisonPhoto) {
        this.garrisonPhoto = garrisonPhoto;
    }

    public String getGarrisonProjectId() {
        return this.garrisonProjectId;
    }

    public void setGarrisonProjectId(String garrisonProjectId) {
        this.garrisonProjectId = garrisonProjectId;
    }

    @Override
    public String toString() {
        return "GarrisonInspectionCriterion{" +
                "garrisonCriterionId='" + garrisonCriterionId + '\'' +
                ", garrisonCriterionName='" + garrisonCriterionName + '\'' +
                ", garrisonQualified='" + garrisonQualified + '\'' +
                ", garrisonProblem='" + garrisonProblem + '\'' +
                ", garrisonPhoto='" + garrisonPhoto + '\'' +
                ", garrisonProjectId='" + garrisonProjectId + '\'' +
                '}';
    }
}
