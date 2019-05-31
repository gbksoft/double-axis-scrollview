package com.gbksoft.library;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;

public class DoubleSideScrollView extends ScrollView {

    private HorizontalScrollView innerScrollView;

    public DoubleSideScrollView(Context context) {
        super(context);
        init();
    }

    public DoubleSideScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DoubleSideScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        innerScrollView = new HorizontalScrollView(getContext());
        super.addView(innerScrollView,
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    }

    @Override
    public void addView(View child) {
        if (child != innerScrollView) {
            innerScrollView.addView(child);
        } else {
            super.addView(child);
        }
    }

    @Override
    public void addView(View child, ViewGroup.LayoutParams params) {
        if (child != innerScrollView) {
            innerScrollView.addView(child, params);
        } else {
            super.addView(child, params);
        }
    }

    @Override
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (child != innerScrollView) {
            innerScrollView.addView(child, index, params);
        } else {
            super.addView(child, index, params);
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            child.onTouchEvent(ev);
        }
        return super.onTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }
}
