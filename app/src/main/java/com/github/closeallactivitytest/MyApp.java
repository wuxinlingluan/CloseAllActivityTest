package com.github.closeallactivitytest;

import android.app.Activity;
import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/5.
 */

public class MyApp extends Application {
    private List<Activity> activities = new ArrayList<>(); //创建集合
    /** 添加集合*/
    public void add(Activity activity) {
        activities.add(activity);
    }
    /**退出*/
    public void exit() {
        for (Activity activity : activities) {
            activity.finish();
        }
        activities.clear();
    }
}
