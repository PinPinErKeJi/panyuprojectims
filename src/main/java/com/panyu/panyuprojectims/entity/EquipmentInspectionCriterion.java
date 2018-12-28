package com.panyu.panyuprojectims.entity;
public class EquipmentInspectionCriterion {
    private String equipmentCriterionId;
    private String equipmentCriterionName;
    private String equipmentQualified;
    private String equipmentProblem;
    private String equipmentPhoto;
    private String equipmentProjectId;

    public EquipmentInspectionCriterion() {
        super();
    }

    public EquipmentInspectionCriterion(String equipmentCriterionId,String equipmentCriterionName,String equipmentQualified,String equipmentProblem,String equipmentPhoto,String equipmentProjectId) {
        super();
        this.equipmentCriterionId = equipmentCriterionId;
        this.equipmentCriterionName = equipmentCriterionName;
        this.equipmentQualified = equipmentQualified;
        this.equipmentProblem = equipmentProblem;
        this.equipmentPhoto = equipmentPhoto;
        this.equipmentProjectId = equipmentProjectId;
    }
    public String getEquipmentCriterionId() {
        return this.equipmentCriterionId;
    }

    public void setEquipmentCriterionId(String equipmentCriterionId) {
        this.equipmentCriterionId = equipmentCriterionId;
    }

    public String getEquipmentCriterionName() {
        return this.equipmentCriterionName;
    }

    public void setEquipmentCriterionName(String equipmentCriterionName) {
        this.equipmentCriterionName = equipmentCriterionName;
    }

    public String getEquipmentQualified() {
        return this.equipmentQualified;
    }

    public void setEquipmentQualified(String equipmentQualified) {
        this.equipmentQualified = equipmentQualified;
    }

    public String getEquipmentProblem() {
        return this.equipmentProblem;
    }

    public void setEquipmentProblem(String equipmentProblem) {
        this.equipmentProblem = equipmentProblem;
    }

    public String getEquipmentPhoto() {
        return this.equipmentPhoto;
    }

    public void setEquipmentPhoto(String equipmentPhoto) {
        this.equipmentPhoto = equipmentPhoto;
    }

    public String getEquipmentProjectId() {
        return this.equipmentProjectId;
    }

    public void setEquipmentProjectId(String equipmentProjectId) {
        this.equipmentProjectId = equipmentProjectId;
    }

    @Override
    public String toString() {
        return "EquipmentInspectionCriterion{" +
                "equipmentCriterionId='" + equipmentCriterionId + '\'' +
                ", equipmentCriterionName='" + equipmentCriterionName + '\'' +
                ", equipmentQualified='" + equipmentQualified + '\'' +
                ", equipmentProblem='" + equipmentProblem + '\'' +
                ", equipmentPhoto='" + equipmentPhoto + '\'' +
                ", equipmentProjectId='" + equipmentProjectId + '\'' +
                '}';
    }
}
