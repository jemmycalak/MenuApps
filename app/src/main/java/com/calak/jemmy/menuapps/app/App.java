package com.calak.jemmy.menuapps.app;

import android.app.Application;
import android.graphics.Typeface;

public class App extends Application {
    private static final String CANARO_EXTRA_BOLD_PATH="font/canaro_extra_bold.otf";
    public static Typeface canaroExtraBold;

    @Override
    public void onCreate() {
        super.onCreate();
        initStyleText();
    }

    private void initStyleText() {
        canaroExtraBold = Typeface.createFromAsset(getAssets(), CANARO_EXTRA_BOLD_PATH);
    }
}
