package com.example.cardagger;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine{
    private static final String TAG = "PetrolEngineModule";
    private int horsePower;
    private int engineCapacity;
    @Inject
    public PetrolEngine(@Named("horsePower") int horsePower,
                        @Named("engineCapacity")  int engineCapacity){
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }
    @Override
    public void start() {
        Log.d(TAG, "PetrolEngine started " +
                        "\nHorsePower" + horsePower +
                        "\nEngineCapacity" + engineCapacity);
    }
}
