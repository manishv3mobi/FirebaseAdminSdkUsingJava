package com.v3mobi.first.cut.firebase.admin.model;

public class GetError {
	private final String errorMsg;
	private final String errorCode;
	
	public GetError(String errorMsg, String errorCode) {
		super();
		this.errorMsg = errorMsg;
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public String getErrorCode() {
		return errorCode;
	}
	
}
