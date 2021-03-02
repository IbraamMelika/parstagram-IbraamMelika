package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("tJK85prEQdkTZJdOBxVuFN2fNPxJxhNKOSM6uCTX")
                .clientKey("BRxXyEixlBrXmyIHyqVFXFYKyL670LDT49zIZHTC")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
