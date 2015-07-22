package com.androidtdd.app.di;


import com.androidtdd.app.App;
import com.androidtdd.app.BaseActivity;
import com.androidtdd.app.utils.InjectedBaseActivityTest;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = TestModule.class)
public interface TestComponent extends AppComponent {
    void inject(App application);
    void inject(BaseActivity baseActivity);
    void inject(InjectedBaseActivityTest test);
}
