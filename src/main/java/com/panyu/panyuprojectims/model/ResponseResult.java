package com.panyu.panyuprojectims.model;

public class ResponseResult<T>{
	// 0 请求成功；1 请求失败
	private Integer code=0;
	// 请求接口后的描述信息
	private String msg;
	// T 是泛型，可以是一个对象，一个字符串，或者一个数组，或者一个集合
	private T data;
	//符合条件的总数据条数（分页的时候才用）
	private Integer totalCount;

	private boolean connect;

	private String email;

	public ResponseResult() {
	}

	public ResponseResult(Integer code, String msg, T data, Integer totalCount, boolean connect, String email) {
		this.code = code;
		this.msg = msg;
		this.data = data;
		this.totalCount = totalCount;
		this.connect = connect;
		this.email = email;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public boolean isConnect() {
		return connect;
	}

	public void setConnect(boolean connect) {
		this.connect = connect;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ResponseResult{" +
				"code=" + code +
				", msg='" + msg + '\'' +
				", data=" + data +
				", totalCount=" + totalCount +
				", connect=" + connect +
				", email='" + email + '\'' +
				'}';
	}
}