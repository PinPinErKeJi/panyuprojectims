package com.panyu.panyuprojectims.entity;

import java.util.List;
import java.util.Map;

public class TreeNode {
	private String id;
	private String text;
	private String state="open";
	private boolean checked;
	private Map attributes;
	private List<TreeNode> children;
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
	public Map getAttributes() {
		return attributes;
	}
	public void setAttributes(Map attributes) {
		this.attributes = attributes;
	}
	public List<TreeNode> getChildren() {
		return children;
	}
	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}
	public TreeNode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TreeNode(String id, String text, String state, boolean checked,
			Map attributes, List<TreeNode> children) {
		super();
		this.id = id;
		this.text = text;
		this.state = state;
		this.checked = checked;
		this.attributes = attributes;
		this.children = children;
	}
	public TreeNode(String id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
	public TreeNode(String id, String text, List<TreeNode> children) {
		super();
		this.id = id;
		this.text = text;
		this.children = children;
	}

	@Override
	public String toString() {
		return "TreeNode{" +
				"id='" + id + '\'' +
				", text='" + text + '\'' +
				", state='" + state + '\'' +
				", checked=" + checked +
				", attributes=" + attributes +
				", children=" + children +
				'}';
	}
}
