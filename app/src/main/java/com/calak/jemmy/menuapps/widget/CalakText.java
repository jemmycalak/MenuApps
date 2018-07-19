package com.calak.jemmy.menuapps.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.calak.jemmy.menuapps.app.App;

public class CalakText extends TextView {
    public CalakText(Context context) {
        this(context, null);
    }

    public CalakText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CalakText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(App.canaroExtraBold);
    }

}
