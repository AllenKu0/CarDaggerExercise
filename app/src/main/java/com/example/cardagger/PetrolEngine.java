package com.example.cardagger;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine{
    private static final String TAG = "PetrolEngineModule";

    @Inject
    public PetrolEngine(){

    }
    @Override
    public void start() {
        Log.d(TAG, "PetrolEngine starting ... ");
    }
}
