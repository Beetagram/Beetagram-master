package ir.mono.monolyticsdk.Models;

import android.app.Activity;
import android.text.TextUtils;
import ir.mono.monolyticsdk.Utils.C0857i;
import ir.mono.monolyticsdk.Utils.gson.annotations.SerializedName;

public class ActivityLog extends MonoLogRq {
    public static final int TYPE_APPLICATION_START = 5060;
    public static final int TYPE_APPLICATION_STOP = 5061;
    public static final int TYPE_CREATE = 5064;
    public static final int TYPE_DESTROY = 5067;
    public static final int TYPE_PAUSE = 5066;
    public static final int TYPE_RESUME = 5065;
    public static final int TYPE_SHAKE = 5068;
    public static final int TYPE_START = 5062;
    public static final int TYPE_STOP = 5063;
    @SerializedName("Type")
    private int activityType;
    @SerializedName("Name")
    private String name;

    private ActivityLog() {
    }

    public static ActivityLog getInstance(Activity activity, int type) {
        if (activity == null || activity.getComponentName() == null || TextUtils.isEmpty(activity.getComponentName().getClassName())) {
            return null;
        }
        return getInstance(activity.getComponentName().getClassName(), type);
    }

    public static ActivityLog getInstance(String name, int type) {
        ActivityLog activityLog = new ActivityLog();
        activityLog.setName(name);
        activityLog.setActivityType(type);
        return activityLog;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = C0857i.m1152c(name);
    }

    public int getActivityType() {
        return this.activityType;
    }

    public void setActivityType(int activityType) {
        this.activityType = activityType;
    }
}
