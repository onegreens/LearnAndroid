package com.example.activitylifecycletest.util;

import android.app.Activity;


import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {

    private static List<Activity> list = new ArrayList<>();

    public static void addActivity(Activity activity) {
        list.add(activity);
    }

    public static void removeActivity(Activity activity) {
        list.remove(activity);
    }

    public static void finshAll() {
        for (Activity activity : list) {
            if (!activity.isFinishing()) activity.finish();
        }
        list.clear();
    }
}
