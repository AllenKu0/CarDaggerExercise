package com.example.cardagger;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class,modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        ActivityComponent build();

        /**
         *  BindsInstance 它可以讓我們省去寫這類構造函數，通過它能夠為類的成員變量賦值。
         *  所以如果要改，要把Module的建構元刪掉
         */

        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);

        Builder appComponent(AppComponent appComponent);
    }
}
