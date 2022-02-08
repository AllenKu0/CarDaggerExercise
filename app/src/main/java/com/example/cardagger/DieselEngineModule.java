package com.example.cardagger;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }
}
