package com.androidtdd.app.utils;

import android.test.ActivityInstrumentationTestCase2;
import com.androidtdd.app.App;
import com.androidtdd.app.BaseActivity;
import com.androidtdd.app.di.DaggerAppComponent;
import com.androidtdd.app.di.DaggerTestComponent;
import com.androidtdd.app.di.TestComponent;
import com.androidtdd.app.di.TestModule;
import com.androidtdd.app.gateways.Api;

import javax.inject.Inject;

public class InjectedBaseActivityTest extends ActivityInstrumentationTestCase2<BaseActivity> {
    @Inject
    protected Api mockApi;

    public InjectedBaseActivityTest(Class activityClass) {
        super(activityClass);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.setProperty(
                "dexmaker.dexcache",
                getInstrumentation().getTargetContext().getCacheDir().getPath());

        App app = (App) getInstrumentation().getTargetContext().getApplicationContext();
        TestComponent component = DaggerTestComponent.builder()
                        .testModule(new TestModule(app))
                        .build();
        app.setComponent(component);
        component.inject(this);
    }
}
