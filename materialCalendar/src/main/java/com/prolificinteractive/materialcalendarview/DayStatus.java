package com.prolificinteractive.materialcalendarview;

/**
 * Created by yangrenjie on 15/12/15.
 */
public class DayStatus {
    
    public static final int SIGN = 1;
    public static final int NO_SIGN = 0;
    
    public String date;
    public int status = 0; // 0:未签到 1:已签到

    public DayStatus(String date, int status) {
        this.date = date;
        this.status = status;
    }
}
