package com.reinhard.interview.pratice.measure;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import hugo.weaving.DebugLog;

/**
 * Desc.
 *
 * @author 李剑波
 * @date 2018/5/2
 */
public class MeasureView extends View {
    public MeasureView(Context context) {
        super(context);
    }

    public MeasureView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MeasureView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    @DebugLog
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    @DebugLog
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    @DebugLog
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
