package com.reinhard.interview.pratice.event;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import hugo.weaving.DebugLog;

/**
 * Desc.
 *
 * @author 李剑波
 * @date 17/5/18
 */
@DebugLog
public class MyViewGroup extends LinearLayout implements View.OnTouchListener {
    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnTouchListener(this);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
//        return true;
//        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return super.onInterceptTouchEvent(ev);
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
