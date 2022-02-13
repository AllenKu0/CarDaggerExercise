package com.example.cardagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car1,car2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = DaggerActivityComponent.builder()
                    .horsePower(140)
                    .engineCapacity(1400)
                    .appComponent(((ExampleApp)getApplication()).getAppComponent())
                    .build();

        /**
         * 配合上面的Inject標籤，因為欄位的標籤不會自動呼叫，要有建構元才會。
         */
        component.inject(this);
        car1.drive();
        car2.drive();
    }
}