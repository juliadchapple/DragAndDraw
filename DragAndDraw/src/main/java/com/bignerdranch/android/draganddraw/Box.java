package com.bignerdranch.android.draganddraw;

import android.graphics.PointF;

/**
 * Created by jchapple on 5/16/14.
 */
public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin) {
        mOrigin = mCurrent = origin;
    }

    public PointF getOrigin() {
        return mOrigin;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }

    public PointF getCurrent() {

        return mCurrent;
    }
}
