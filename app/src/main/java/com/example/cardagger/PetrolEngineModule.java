package com.example.cardagger;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

// 和DieselEngineModule的Engine為同一個，所以在CarComponent只能引用其中一個
//@Module
//public class PetrolEngineModule {
//
//    @Provides
//    Engine provideEngine(PetrolEngine engine){
//        return engine;
//    }
//}
/**
 * 如果用實作，且需要提供實作的Class，用@Binds較為合理
 */
@Module
abstract public class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
