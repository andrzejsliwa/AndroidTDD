package com.androidtdd.app;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(App.TAG, mApi.login());
    }
}
