package com.reinhard.interview.pratice.event;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import hugo.weaving.DebugLog;

/**
 * Desc.
 *
 * @author 李剑波
 * @date 17/5/18
 */
@DebugLog
public class MyView extends View implements View.OnTouchListener,
        View.OnClickListener, View.OnLongClickListener {
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnTouchListener(this);
        setOnClickListener(this);
        setOnLongClickListener(this);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }
}
