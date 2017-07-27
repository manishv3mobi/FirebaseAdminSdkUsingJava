package com.v3mobi.first.cut.firebase.admin.model;

public class GetFireBaseDetail {
	 	private final String displayName;
	    private final String email;
	    private final String photoUrl;
	    private final String uid;
	    private final boolean disabled;
	    private final boolean emailVerified;
		public GetFireBaseDetail(String displayName, String email, String photoUrl, String uid, boolean disabled,
				boolean emailVerified) {
			super();
			this.displayName = displayName;
			this.email = email;
			this.photoUrl = photoUrl;
			this.uid = uid;
			this.disabled = disabled;
			this.emailVerified = emailVerified;
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
