package com.androidtdd.app;

import com.androidtdd.app.utils.InjectedBaseActivityTest;
import static org.mockito.Mockito.when;

public class MainActivityTest extends InjectedBaseActivityTest {
    public MainActivityTest() { super(MainActivity.class); }

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testMocking() {
        when(mockApi.login()).thenReturn("mock");
        getActivity();
    }
}
