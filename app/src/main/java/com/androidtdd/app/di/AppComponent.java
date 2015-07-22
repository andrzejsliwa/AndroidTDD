package com.androidtdd.app.di;

import com.androidtdd.app.App;
import com.androidtdd.app.BaseActivity;
import dagger.Component;

import javax.inject.Singleton;

@Singleton @Component(modules = AppModule.class)
public interface AppComponent {
    void inject(App application);
    void inject(BaseActivity baseActivity);
}
