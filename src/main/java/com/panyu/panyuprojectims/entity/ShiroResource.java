package com.panyu.panyuprojectims.entity;

import java.io.Serializable;
import java.util.List;
import java.util.TreeSet;


public class ShiroResource implements Serializable,Comparable<ShiroResource> {
    private String id;
    private String text;
    private List<ShiroResource> children;
    private String resourceUrl;
    private String resourceCode;
    private String parectResourceId;
    private String state="open";
    private boolean checked;
    public ShiroResource() {
        super();
    }

    public ShiroResource(String id, String text, List<ShiroResource> children, String resourceUrl, String resourceCode, String parectResourceId, String state, boolean checked) {
        this.id = id;
        this.text = text;
        this.children = children;
        this.resourceUrl = resourceUrl;
        this.resourceCode = resourceCode;
        this.parectResourceId = parectResourceId;
        this.state = state;
        this.checked = checked;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<ShiroResource> getChildren() {
        return children;
    }

    public void setChildren(List<ShiroResource> children) {
        this.children = children;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getParectResourceId() {
        return parectResourceId;
    }

    public void setParectResourceId(String parectResourceId) {
        this.parectResourceId = parectResourceId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "ShiroResource{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", children=" + children +
                ", resourceUrl='" + resourceUrl + '\'' +
                ", resourceCode='" + resourceCode + '\'' +
                ", parectResourceId='" + parectResourceId + '\'' +
                ", state='" + state + '\'' +
                ", checked=" + checked +
                '}';
    }

    @Override
    public int compareTo(ShiroResource o) {
        return 0;
    }
}
