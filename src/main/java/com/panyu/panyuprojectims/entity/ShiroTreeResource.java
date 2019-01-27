package com.panyu.panyuprojectims.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 菜单资源实体类
 */
public class ShiroTreeResource implements Serializable{
    private String id;
    private String text;
    private List<ShiroTreeResource> children;
    private String resurl;
    private String rescode;
    private Integer parentId;
    private String state="open";
    private boolean checked;

    public ShiroTreeResource() {
        super();
    }

    public ShiroTreeResource(String id, String text, List<ShiroTreeResource> children, String resurl, String rescode, Integer parentId, String state, boolean checked) {
        this.id = id;
        this.text = text;
        this.children = children;
        this.resurl = resurl;
        this.rescode = rescode;
        this.parentId = parentId;
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

    public List<ShiroTreeResource> getChildren() {
        return children;
    }

    public void setChildren(List<ShiroTreeResource> children) {
        this.children = children;
    }

    public String getResurl() {
        return resurl;
    }

    public void setResurl(String resurl) {
        this.resurl = resurl;
    }

    public String getRescode() {
        return rescode;
    }

    public void setRescode(String rescode) {
        this.rescode = rescode;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
        return "ShiroTreeResource{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", children=" + children +
                ", resurl='" + resurl + '\'' +
                ", rescode='" + rescode + '\'' +
                ", parentId=" + parentId +
                ", state='" + state + '\'' +
                ", checked=" + checked +
                '}';
    }
}
