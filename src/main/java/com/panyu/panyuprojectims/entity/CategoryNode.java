package com.panyu.panyuprojectims.entity;

import java.util.List;

public class CategoryNode {
    private String categoryId;
    private String categoryName;
    private String parentId;
    private List<CategoryNode> categoryNodeList;

    public CategoryNode() {
    }

    public CategoryNode(String categoryId, String categoryName, String parentId, List<CategoryNode> categoryNodeList) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.parentId = parentId;
        this.categoryNodeList = categoryNodeList;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<CategoryNode> getCategoryNodeList() {
        return categoryNodeList;
    }

    public void setCategoryNodeList(List<CategoryNode> categoryNodeList) {
        this.categoryNodeList = categoryNodeList;
    }

    @Override
    public String toString() {
        return "CategoryNode{" +
                "categoryId='" + categoryId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", parentId='" + parentId + '\'' +
                ", categoryNodeList=" + categoryNodeList +
                '}';
    }
}
