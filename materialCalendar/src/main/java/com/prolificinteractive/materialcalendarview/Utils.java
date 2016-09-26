package com.prolificinteractive.materialcalendarview;

import android.util.TypedValue;
import android.view.View;

/**
 * Created by yangrenjie on 15/12/13.
 */
public class Utils {
    public static int px2dp(View view, int px) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, px, view.getResources().getDisplayMetrics());
    }
}
