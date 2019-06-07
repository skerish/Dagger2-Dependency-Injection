package com.example.dagger2;

import dagger.Component;

@Component
public interface carInjector {

   // Car getCar();

    void inject(MainActivity mainActivity);

}
