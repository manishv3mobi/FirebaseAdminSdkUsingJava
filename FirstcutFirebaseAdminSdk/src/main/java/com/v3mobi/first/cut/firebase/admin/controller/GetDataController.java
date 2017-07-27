package com.v3mobi.first.cut.firebase.admin.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserRecord;
import com.google.firebase.tasks.Task;
import com.v3mobi.first.cut.firebase.admin.model.GetData;
import com.v3mobi.first.cut.firebase.admin.model.GetError;
import com.v3mobi.first.cut.firebase.admin.model.GetFireBaseDetail;

@RestController
public class GetDataController {
	GetData getD=null;
	private boolean success=false;
   // private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/getData")
    public GetData getData(@RequestParam(value="uid")String uid) {
    
    	Task<UserRecord> task = FirebaseAuth.getInstance().getUser(uid)
    		    .addOnSuccessListener(userRecord -> {
    		      // See the UserRecord reference doc for the contents of userRecord.
    		      System.out.println("Successfully fetched user data: " + userRecord.getUid());
    		      success=true;
    		      GetFireBaseDetail fireBaseDetail=new GetFireBaseDetail(userRecord.getDisplayName(),userRecord.getEmail(),userRecord.getPhotoUrl(),userRecord.getUid(),userRecord.isDisabled(),userRecord.isEmailVerified());
    		      getD=new GetData(fireBaseDetail,success);
    		      
    		    })
    		    .addOnFailureListener(e -> {
    		      System.err.println("Error fetching user data: " + e.getMessage());
    		      success=false;
    		      GetError error = new GetError("Error fetching user data: " + e.getMessage(),"302");
    		      getD=new GetData(error, success);
    		    });

    	
        return getD;
    }
}
