package com.warren.wkrcontacts;

//REMOVE import org.acra.ACRA;
//REMOVE import org.acra.annotation.*;


//REMOVE @ReportsCrashes(formKey = "dGVLMk5Eb3k1czI3a2hNN1M1bExacXc6MQ")
public class MyApplication extends android.app.Application {
	@Override
	  public void onCreate() {
	      super.onCreate();
	      // The following line triggers the initialization of ACRA
	      // REMOVE ACRA.init(this);
	  }
	
	
}
