package com.panyu.panyuprojectims.entity;

import java.util.List;

public class EquipmentInspectionProject {
    private String equipmentProjectId;
    private String equipmentProjectName;
    private String equipmentSubWorkId;
    private String equipmentCriterionName;
    private List<EquipmentPhotoResources> equipmentPhotoResourcesList;

    public EquipmentInspectionProject() {
        super();
    }

    public EquipmentInspectionProject(String equipmentProjectId, String equipmentProjectName, String equipmentSubWorkId, String equipmentCriterionName, List<EquipmentPhotoResources> equipmentPhotoResourcesList) {
        this.equipmentProjectId = equipmentProjectId;
        this.equipmentProjectName = equipmentProjectName;
        this.equipmentSubWorkId = equipmentSubWorkId;
        this.equipmentCriterionName = equipmentCriterionName;
        this.equipmentPhotoResourcesList = equipmentPhotoResourcesList;
    }

    public String getEquipmentProjectId() {
        return equipmentProjectId;
    }

    public void setEquipmentProjectId(String equipmentProjectId) {
        this.equipmentProjectId = equipmentProjectId;
    }

    public String getEquipmentProjectName() {
        return equipmentProjectName;
    }

    public void setEquipmentProjectName(String equipmentProjectName) {
        this.equipmentProjectName = equipmentProjectName;
    }

    public String getEquipmentSubWorkId() {
        return equipmentSubWorkId;
    }

    public void setEquipmentSubWorkId(String equipmentSubWorkId) {
        this.equipmentSubWorkId = equipmentSubWorkId;
    }

    public String getEquipmentCriterionName() {
        return equipmentCriterionName;
    }

    public void setEquipmentCriterionName(String equipmentCriterionName) {
        this.equipmentCriterionName = equipmentCriterionName;
    }

    public List<EquipmentPhotoResources> getEquipmentPhotoResourcesList() {
        return equipmentPhotoResourcesList;
    }

    public void setEquipmentPhotoResourcesList(List<EquipmentPhotoResources> equipmentPhotoResourcesList) {
        this.equipmentPhotoResourcesList = equipmentPhotoResourcesList;
    }

    @Override
    public String toString() {
        return "EquipmentInspectionProject{" +
                "equipmentProjectId='" + equipmentProjectId + '\'' +
                ", equipmentProjectName='" + equipmentProjectName + '\'' +
                ", equipmentSubWorkId='" + equipmentSubWorkId + '\'' +
                ", equipmentCriterionName='" + equipmentCriterionName + '\'' +
                ", equipmentPhotoResourcesList=" + equipmentPhotoResourcesList +
                '}';
    }
}
