package com.v3mobi.first.cut.firebase.admin;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserRecord;
import com.google.firebase.tasks.Task;

@RestController
public class GetDataController {
	GetData getD=null;
   // private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/getData")
    public GetData getData(@RequestParam(value="uid")String uid) {
    
    	Task<UserRecord> task = FirebaseAuth.getInstance().getUser(uid)
    		    .addOnSuccessListener(userRecord -> {
    		      // See the UserRecord reference doc for the contents of userRecord.
    		      System.out.println("Successfully fetched user data: " + userRecord.getUid());
    		    
    		      getD=new GetData(counter.incrementAndGet(),userRecord.getDisplayName(),userRecord.getEmail(),userRecord.getPhotoUrl(),userRecord.getUid(),userRecord.isDisabled(),userRecord.isEmailVerified());
    		     
    		    })
    		    .addOnFailureListener(e -> {
    		      System.err.println("Error fetching user data: " + e.getMessage());
    		    });

    	
        return getD;
    }
}
