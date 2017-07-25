package com.v3mobi.first.cut.firebase.admin;
import java.io.FileInputStream;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseCredentials;

@SpringBootApplication
public class FirstcutFirebaseAdminSdkApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstcutFirebaseAdminSdkApplication.class, args);
	
		FirebaseOptions options = null;
		try {
			FileInputStream serviceAccount = new FileInputStream("src/main/resources/static/fir-admin-a0195-firebase-adminsdk-n9b15-20ff67e7e8.json");

			options = new FirebaseOptions.Builder()
			  .setCredential(FirebaseCredentials.fromCertificate(serviceAccount))
			  .setDatabaseUrl("https://fir-admin-a0195.firebaseio.com/")
			  .build();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FirebaseApp.initializeApp(options);

	}
}
