package com.example.cardagger;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }
}

/**
 * 如果用實作，且需要提供實作的Class，用@Binds較為合理
 */
//@Module
//abstract public class DieselEngineModule {
//
//    @Binds
//    abstract Engine provideEngine(DieselEngine engine);
//}