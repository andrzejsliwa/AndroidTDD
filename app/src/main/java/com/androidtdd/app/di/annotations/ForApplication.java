package com.androidtdd.app.di.annotations;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Qualifier @Retention(RetentionPolicy.RUNTIME)
public @interface ForApplication {
}
