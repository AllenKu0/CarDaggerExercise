package com.example.cardagger;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine{
    private static final String TAG = "DieselEngineModule";
    private int horsePower ;

    @Inject
    public DieselEngine(int horsePower){
        this.horsePower = horsePower;

    }
    @Override
    public void start() {
        Log.d(TAG, "DieselEngine started ，HoursePower"+horsePower);
    }
}
