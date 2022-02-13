package com.example.cardagger;

import android.app.Application;

public class ExampleApp extends Application {
    private AppComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }
    public AppComponent getAppComponent(){
        return component;
    }
}
