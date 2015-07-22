package com.androidtdd.app;

import android.app.Application;
import com.androidtdd.app.di.AppComponent;
import com.androidtdd.app.di.AppModule;
import com.androidtdd.app.di.DaggerAppComponent;
import com.androidtdd.app.gateways.Api;

import javax.inject.Inject;

public class App extends Application {
    public static String TAG = "com.androidtdd.app";

    @Inject Api mApi;

    private AppComponent mComponent;
    public AppComponent getComponent() { return this.mComponent; }
    public void setComponent(AppComponent component) { this.mComponent = component; }

    public void onCreate() {
        super.onCreate();

        mComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        mComponent.inject(this);
    }
}
