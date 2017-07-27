package com.v3mobi.first.cut.firebase.admin.model;

public class GetData {   
    private GetError error;
    private boolean success;
    private GetFireBaseDetail fireBaseDetail;
    public GetFireBaseDetail getFireBaseDetail() {
		return fireBaseDetail;
	}
	public GetError getError() {
		return error;
	}
	public boolean isSuccess() {
		return success;
	}
	public GetData(GetFireBaseDetail fireBaseDetail,boolean success) {
		super();
		this.fireBaseDetail=fireBaseDetail;
		this.success=success;
	}
    public GetData(GetError error,boolean success) {
		super();
		this.error=error;
		this.success=success;
	}
}
