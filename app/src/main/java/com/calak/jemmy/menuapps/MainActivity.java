package com.calak.jemmy.menuapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.yalantis.guillotine.animation.GuillotineAnimation;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private static final long RIPLE_DURATION = 250;
    @BindView(R.id.Toolbar1)
    Toolbar toolbar;
    @BindView(R.id.rootLayout)
    FrameLayout rootLayout;
    @BindView(R.id.icMenu)
    View menuDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initUIDrawer();
    }

    private void initUIDrawer() {
        if(toolbar != null){
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(null);
        }

        View itemDrawer = LayoutInflater.from(this).inflate(R.layout.layout_menu_drawer, null);
        rootLayout.addView(itemDrawer);

        new GuillotineAnimation.GuillotineBuilder(itemDrawer, itemDrawer.findViewById(R.id.icMenu2), menuDrawer)
                .setStartDelay(RIPLE_DURATION)
                .setActionBarViewForAnimation(toolbar)
                .setClosedOnStart(true)
                .build();

    }
}
