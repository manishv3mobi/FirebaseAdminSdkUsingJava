package com.v3mobi.first.cut.firebase.admin;

public class GetData {

    private final long id;
    private final String displayName;
    private final String email;
    private final String photoUrl;
    private final String uid;
    private final boolean disabled;
    private final boolean emailVerified;   

    public GetData(long id, String displayName, String email, String photoUrl, String uid, boolean disabled,
			boolean emailVerified) {
		super();
		this.id = id;
		this.displayName = displayName;
		this.email = email;
		this.photoUrl = photoUrl;
		this.uid = uid;
		this.disabled = disabled;
		this.emailVerified = emailVerified;
	}
	public long getId() {
		return id;
	}


	public String getDisplayName() {
		return displayName;
	}


	public String getEmail() {
		return email;
	}


	public String getPhotoUrl() {
		return photoUrl;
	}


	public String getUid() {
		return uid;
	}


	public boolean isDisabled() {
		return disabled;
	}


	public boolean isEmailVerified() {
		return emailVerified;
	}


}
