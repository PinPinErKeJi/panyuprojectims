package com.panyu.panyuprojectims.entity;

import java.util.List;

public class EquipmentSubWork {
    private String equipmentSubWorkId;
    private String equipmentSubWorkName;
    private String equipmentSpecialityId;

    private List<EquipmentInspectionProject> equipmentInspectionProjectList;

    public EquipmentSubWork() {
        super();
    }

    public EquipmentSubWork(String equipmentSubWorkId, String equipmentSubWorkName, String equipmentSpecialityId, List<EquipmentInspectionProject> equipmentInspectionProjectList) {
        this.equipmentSubWorkId = equipmentSubWorkId;
        this.equipmentSubWorkName = equipmentSubWorkName;
        this.equipmentSpecialityId = equipmentSpecialityId;
        this.equipmentInspectionProjectList = equipmentInspectionProjectList;
    }

    public String getEquipmentSubWorkId() {
        return equipmentSubWorkId;
    }

    public void setEquipmentSubWorkId(String equipmentSubWorkId) {
        this.equipmentSubWorkId = equipmentSubWorkId;
    }

    public String getEquipmentSubWorkName() {
        return equipmentSubWorkName;
    }

    public void setEquipmentSubWorkName(String equipmentSubWorkName) {
        this.equipmentSubWorkName = equipmentSubWorkName;
    }

    public String getEquipmentSpecialityId() {
        return equipmentSpecialityId;
    }

    public void setEquipmentSpecialityId(String equipmentSpecialityId) {
        this.equipmentSpecialityId = equipmentSpecialityId;
    }

    public List<EquipmentInspectionProject> getEquipmentInspectionProjectList() {
        return equipmentInspectionProjectList;
    }

    public void setEquipmentInspectionProjectList(List<EquipmentInspectionProject> equipmentInspectionProjectList) {
        this.equipmentInspectionProjectList = equipmentInspectionProjectList;
    }

    @Override
    public String toString() {
        return "EquipmentSubWork{" +
                "equipmentSubWorkId='" + equipmentSubWorkId + '\'' +
                ", equipmentSubWorkName='" + equipmentSubWorkName + '\'' +
                ", equipmentSpecialityId='" + equipmentSpecialityId + '\'' +
                ", equipmentInspectionProjectList=" + equipmentInspectionProjectList +
                '}';
    }
}
