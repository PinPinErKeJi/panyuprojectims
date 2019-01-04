package com.panyu.panyuprojectims.entity;
public class ShiroResource {
    private String resourceId;
    private String resourceName;
    private String resourceUrl;
    private String resourceCode;
    private String parectResourceId;
    public ShiroResource() {
        super();
    }
    public ShiroResource(String resourceId,String resourceName,String resourceUrl,String resourceCode,String parectResourceId) {
        super();
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceUrl = resourceUrl;
        this.resourceCode = resourceCode;
        this.parectResourceId = parectResourceId;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return this.resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getResourceCode() {
        return this.resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getParectResourceId() {
        return this.parectResourceId;
    }

    public void setParectResourceId(String parectResourceId) {
        this.parectResourceId = parectResourceId;
    }

    @Override
    public String toString() {
        return "ShiroResource{" +
                "resourceId='" + resourceId + '\'' +
                ", resourceName='" + resourceName + '\'' +
                ", resourceUrl='" + resourceUrl + '\'' +
                ", resourceCode='" + resourceCode + '\'' +
                ", parectResourceId='" + parectResourceId + '\'' +
                '}';
    }
}
