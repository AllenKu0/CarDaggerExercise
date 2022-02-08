package com.example.cardagger;

import android.nfc.Tag;
import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
//    @Inject Engine engine;   //建構元就不用Engine
    private Engine engine;
    private Wheels wheels;

    /**
     * Inject 負責創建需要的實例
     * @param engine
     * @param wheels
     * Inject的順序為，建構元、欄位、函數
     */
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        Log.d(TAG, "driving....");
    }
}
