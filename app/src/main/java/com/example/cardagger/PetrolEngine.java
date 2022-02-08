package com.example.cardagger;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine{
    private static final String TAG = "PetrolEngineModule";
    private int horsePower;
    private int engineCapicity;
    @Inject
    public PetrolEngine(int horsePower,int engineCapicity){
        this.horsePower = horsePower;
        this.engineCapicity = engineCapicity;

    }
    @Override
    public void start() {
        Log.d(TAG, "PetrolEngine starting ... ");
    }
}
