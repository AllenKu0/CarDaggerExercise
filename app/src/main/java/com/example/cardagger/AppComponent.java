package com.example.cardagger;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    Driver getDriver();
}
