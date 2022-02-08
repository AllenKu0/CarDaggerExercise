package com.example.cardagger;

import dagger.Module;
import dagger.Provides;

/**
 * 如果此Module沒有被需要建造實例，且其中的function都是static，則宣告成abstract
 */
@Module
public abstract class WheelsModule {
    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims,Tires tires){
        return new Wheels(rims,tires);
    }
}
