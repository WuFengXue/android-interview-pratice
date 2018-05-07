package com.reinhard.interview.pratice.event;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

import com.reinhard.interview.pratice.R;

import hugo.weaving.DebugLog;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
    }

    @Override
    @DebugLog
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    @DebugLog
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
