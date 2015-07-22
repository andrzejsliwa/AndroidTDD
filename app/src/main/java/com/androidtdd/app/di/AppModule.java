package com.androidtdd.app.di;

import android.content.Context;
import com.androidtdd.app.App;
import com.androidtdd.app.di.annotations.ForApplication;
import com.androidtdd.app.gateways.Api;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class AppModule {
    private final App mApp;

    public AppModule(App app) { this.mApp = app; }

    @Provides @Singleton @ForApplication
    Context provideApplicationContext() { return mApp; }

    @Provides @Singleton
    Api provideApi() { return new Api(); }
}
