package com.panyu.panyuprojectims.entity;
public class EquipmentSpeciality {
    private String equipmentSpecialityId;
    private String equipmentSpecialityName;

    public EquipmentSpeciality() {
        super();
    }
    public EquipmentSpeciality(String equipmentSpecialityId,String equipmentSpecialityName) {
        super();
        this.equipmentSpecialityId = equipmentSpecialityId;
        this.equipmentSpecialityName = equipmentSpecialityName;
    }
    public String getEquipmentSpecialityId() {
        return this.equipmentSpecialityId;
    }

    public void setEquipmentSpecialityId(String equipmentSpecialityId) {
        this.equipmentSpecialityId = equipmentSpecialityId;
    }

    public String getEquipmentSpecialityName() {
        return this.equipmentSpecialityName;
    }

    public void setEquipmentSpecialityName(String equipmentSpecialityName) {
        this.equipmentSpecialityName = equipmentSpecialityName;
    }

    @Override
    public String toString() {
        return "EquipmentSpeciality{" +
                "equipmentSpecialityId='" + equipmentSpecialityId + '\'' +
                ", equipmentSpecialityName='" + equipmentSpecialityName + '\'' +
                '}';
    }
}
