package com.markchan.marilyn;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/**
 * Created by Mark Chan on 2017/3/12.
 */
public class ViewPagerScroller extends Scroller {

    /** 滑动速度,值越大滑动越慢，滑动太快会使3d效果不明显 */
    private int mScrollDuration = 800;
    private boolean mZero;

    public ViewPagerScroller(Context context) {
        super(context);
    }

    public ViewPagerScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    public ViewPagerScroller(Context context, Interpolator interpolator, boolean flywheel) {
        super(context, interpolator, flywheel);
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy, int duration) {
        super.startScroll(startX, startY, dx, dy, mZero ? 0 : mScrollDuration);
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy) {
        super.startScroll(startX, startY, dx, dy, mZero ? 0 : mScrollDuration);
    }

    public int getScrollDuration() {
        return mScrollDuration;
    }

    public void setScrollDuration(int scrollDuration) {
        mScrollDuration = scrollDuration;
    }

    public boolean isZero() {
        return mZero;
    }

    public void setZero(boolean zero) {
        mZero = zero;
    }
}