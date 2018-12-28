package com.panyu.panyuprojectims.entity;

public class PanyuDTO {

    private String moduleId;
    private String moduleNamedto;
    private String subNamedto;
    private String projectNamedto;
    private String inspectionContentdto;
    private String qualifieddto;
    private String problemDescriptiondto;
    private String photodto;
    private String projectIddto;
    public PanyuDTO() {
        super();
    }

    public PanyuDTO(String moduleId, String moduleNamedto, String subNamedto, String projectNamedto, String inspectionContentdto, String qualifieddto, String problemDescriptiondto, String photodto, String projectIddto) {
        this.moduleId = moduleId;
        this.moduleNamedto = moduleNamedto;
        this.subNamedto = subNamedto;
        this.projectNamedto = projectNamedto;
        this.inspectionContentdto = inspectionContentdto;
        this.qualifieddto = qualifieddto;
        this.problemDescriptiondto = problemDescriptiondto;
        this.photodto = photodto;
        this.projectIddto = projectIddto;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleNamedto() {
        return moduleNamedto;
    }

    public void setModuleNamedto(String moduleNamedto) {
        this.moduleNamedto = moduleNamedto;
    }

    public String getSubNamedto() {
        return subNamedto;
    }

    public void setSubNamedto(String subNamedto) {
        this.subNamedto = subNamedto;
    }

    public String getProjectNamedto() {
        return projectNamedto;
    }

    public void setProjectNamedto(String projectNamedto) {
        this.projectNamedto = projectNamedto;
    }

    public String getInspectionContentdto() {
        return inspectionContentdto;
    }

    public void setInspectionContentdto(String inspectionContentdto) {
        this.inspectionContentdto = inspectionContentdto;
    }

    public String getQualifieddto() {
        return qualifieddto;
    }

    public void setQualifieddto(String qualifieddto) {
        this.qualifieddto = qualifieddto;
    }

    public String getProblemDescriptiondto() {
        return problemDescriptiondto;
    }

    public void setProblemDescriptiondto(String problemDescriptiondto) {
        this.problemDescriptiondto = problemDescriptiondto;
    }

    public String getPhotodto() {
        return photodto;
    }

    public void setPhotodto(String photodto) {
        this.photodto = photodto;
    }

    public String getProjectIddto() {
        return projectIddto;
    }

    public void setProjectIddto(String projectIddto) {
        this.projectIddto = projectIddto;
    }

    @Override
    public String toString() {
        return "PanyuDTO{" +
                "moduleId='" + moduleId + '\'' +
                ", moduleNamedto='" + moduleNamedto + '\'' +
                ", subNamedto='" + subNamedto + '\'' +
                ", projectNamedto='" + projectNamedto + '\'' +
                ", inspectionContentdto='" + inspectionContentdto + '\'' +
                ", qualifieddto='" + qualifieddto + '\'' +
                ", problemDescriptiondto='" + problemDescriptiondto + '\'' +
                ", photodto='" + photodto + '\'' +
                ", projectIddto='" + projectIddto + '\'' +
                '}';
    }
}
