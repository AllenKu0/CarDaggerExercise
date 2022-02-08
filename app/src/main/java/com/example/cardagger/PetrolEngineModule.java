package com.example.cardagger;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
    Engine provideEngine(PetrolEngine engine){
        return engine;
    }
}
/**
 * 如果用實作，且需要提供實作的Class，用@Binds較為合理
 */
//@Module
//abstract public class PetrolEngineModule {
//
//    @Binds
//    abstract Engine provideEngine(PetrolEngine engine);
//}
