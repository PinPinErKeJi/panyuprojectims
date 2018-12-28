package com.panyu.panyuprojectims.entity;
public class EquipmentPhotoResources {
    private String equipmentPhotoId;
    private String equipmentPhotoName;
    private String photoUploadPeople;
    private String qualified;
    private String problemDescription;
    private String equipmentSpecialityId;
    private String equipmentSubWorkId;
    private String equipmentProjectId;
    private String equipmentInformationId;

    public EquipmentPhotoResources() {
        super();
    }

    public EquipmentPhotoResources(String equipmentPhotoId, String equipmentPhotoName, String photoUploadPeople, String qualified, String problemDescription, String equipmentSpecialityId, String equipmentSubWorkId, String equipmentProjectId, String equipmentInformationId) {
        this.equipmentPhotoId = equipmentPhotoId;
        this.equipmentPhotoName = equipmentPhotoName;
        this.photoUploadPeople = photoUploadPeople;
        this.qualified = qualified;
        this.problemDescription = problemDescription;
        this.equipmentSpecialityId = equipmentSpecialityId;
        this.equipmentSubWorkId = equipmentSubWorkId;
        this.equipmentProjectId = equipmentProjectId;
        this.equipmentInformationId = equipmentInformationId;
    }

    public String getEquipmentPhotoId() {
        return equipmentPhotoId;
    }

    public void setEquipmentPhotoId(String equipmentPhotoId) {
        this.equipmentPhotoId = equipmentPhotoId;
    }

    public String getEquipmentPhotoName() {
        return equipmentPhotoName;
    }

    public void setEquipmentPhotoName(String equipmentPhotoName) {
        this.equipmentPhotoName = equipmentPhotoName;
    }

    public String getPhotoUploadPeople() {
        return photoUploadPeople;
    }

    public void setPhotoUploadPeople(String photoUploadPeople) {
        this.photoUploadPeople = photoUploadPeople;
    }

    public String getQualified() {
        return qualified;
    }

    public void setQualified(String qualified) {
        this.qualified = qualified;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getEquipmentSpecialityId() {
        return equipmentSpecialityId;
    }

    public void setEquipmentSpecialityId(String equipmentSpecialityId) {
        this.equipmentSpecialityId = equipmentSpecialityId;
    }

    public String getEquipmentSubWorkId() {
        return equipmentSubWorkId;
    }

    public void setEquipmentSubWorkId(String equipmentSubWorkId) {
        this.equipmentSubWorkId = equipmentSubWorkId;
    }

    public String getEquipmentProjectId() {
        return equipmentProjectId;
    }

    public void setEquipmentProjectId(String equipmentProjectId) {
        this.equipmentProjectId = equipmentProjectId;
    }

    public String getEquipmentInformationId() {
        return equipmentInformationId;
    }

    public void setEquipmentInformationId(String equipmentInformationId) {
        this.equipmentInformationId = equipmentInformationId;
    }

    @Override
    public String toString() {
        return "EquipmentPhotoResources{" +
                "equipmentPhotoId='" + equipmentPhotoId + '\'' +
                ", equipmentPhotoName='" + equipmentPhotoName + '\'' +
                ", photoUploadPeople='" + photoUploadPeople + '\'' +
                ", qualified='" + qualified + '\'' +
                ", problemDescription='" + problemDescription + '\'' +
                ", equipmentSpecialityId='" + equipmentSpecialityId + '\'' +
                ", equipmentSubWorkId='" + equipmentSubWorkId + '\'' +
                ", equipmentProjectId='" + equipmentProjectId + '\'' +
                ", equipmentInformationId='" + equipmentInformationId + '\'' +
                '}';
    }
}
