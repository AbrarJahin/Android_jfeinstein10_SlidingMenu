package com.abrarjahin.jfeinstein10slidingmenu.activity;

import android.os.Bundle;

import com.abrarjahin.jfeinstein10slidingmenu.R;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingActivity;

public class ActivityMain extends SlidingActivity//AppCompatActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBehindContentView(R.layout.activity_menu);
        //Initial Setup Done

        //Now add some properties to the side slider
        getSlidingMenu().setBehindOffset(300);
    }
}
