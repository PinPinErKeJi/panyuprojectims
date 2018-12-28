package com.panyu.panyuprojectims.entity;

import java.util.List;

public class Module {

    private String moduleId;
    private String moduleName;
    private boolean status;

    private List<Module> modules;

    public Module() {
    }

    public Module(String moduleId, String moduleName, boolean status, List<Module> modules) {
        this.moduleId = moduleId;
        this.moduleName = moduleName;
        this.status = status;
        this.modules = modules;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    @Override
    public String toString() {
        return "Module{" +
                "moduleId='" + moduleId + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", status=" + status +
                ", modules=" + modules +
                '}';
    }
}