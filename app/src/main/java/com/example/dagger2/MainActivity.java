package com.example.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carInjector injector = DaggercarInjector.create();
      //  car = injector.getCar();

        injector.inject(this);

        car.drive();

    }
}
