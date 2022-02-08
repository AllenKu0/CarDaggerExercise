package com.example.cardagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build() ;
        /**
         * 配合上面的Inject標籤，因為欄位的標籤不會自動呼叫，要有建構元才會。
         */
        component.inject(this);
        car.drive();
    }
}