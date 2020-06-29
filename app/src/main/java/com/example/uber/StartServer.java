package com.example.uber;

import com.parse.Parse;
import android.app.Application;

public class StartServer extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Ddgigvq7Pa8nH7qKaKnl3QGf3BqbSnS1xHU3P9c1")
                .clientKey("gFqksG6k2fwho0x5NMGMrqQFDqCllt2yWGhEmWen")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}