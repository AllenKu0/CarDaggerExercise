package com.example.cardagger;

import android.util.Log;

public class Tires {
    //當成第三方套件，音為不知道內容所以不能下Inject
    private static final String TAG = "Car";
    public void inflate(){
        Log.e(TAG, " Tires inflated " + this);
    }
}
