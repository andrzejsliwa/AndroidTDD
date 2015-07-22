package com.androidtdd.app;

import android.app.Activity;
import android.os.Bundle;
import com.androidtdd.app.gateways.Api;

import javax.inject.Inject;

public abstract class BaseActivity extends Activity {
    @Inject Api mApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((App) getApplication()).getComponent().inject(this);
    }
}
