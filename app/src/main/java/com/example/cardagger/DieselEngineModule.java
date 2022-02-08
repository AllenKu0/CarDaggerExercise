package com.example.cardagger;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

// 和PetrolEngineModule的Engine為同一個，所以在CarComponent只能引用其中一個
@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }
    @Provides
    int provideHorsePower(){
        return horsePower;
    }
    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }
}

/**
 * 如果Class用實作，且需要提供實作的實例，用@Binds較為合理
 */
//@Module
//abstract public class DieselEngineModule {
//
//    @Binds
//    abstract Engine bindEngine(DieselEngine engine);
//}