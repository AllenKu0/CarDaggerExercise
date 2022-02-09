package com.example.cardagger;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        CarComponent build();

        /**
         *  BindsInstance 它可以讓我們省去寫這類構造函數，通過它能夠為類的成員變量賦值。
         *  所以如果要改，要把Module的建構元刪掉
         */

        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);
    }
}
