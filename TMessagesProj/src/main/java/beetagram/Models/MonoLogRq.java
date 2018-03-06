package ir.mono.monolyticsdk.Models;

import android.content.Context;
import ir.mono.monolyticsdk.C1068f;
import ir.mono.monolyticsdk.Utils.C0774g;
import ir.mono.monolyticsdk.Utils.C0857i;
import ir.mono.monolyticsdk.Utils.gson.annotations.SerializedName;

public class MonoLogRq {
    @SerializedName("BuildVersionCode")
    private int appVersionCode;
    @SerializedName("BuildVersionName")
    private String appVersionName;
    @SerializedName("DeviceOsVersion")
    private int deviceAndroidVersion;
    @SerializedName("MonoAnalyticId")
    private String monoAnalyticId;
    @SerializedName("MonoAnalyticType")
    private String monoAnalyticType;
    @SerializedName("MonoTokenId")
    private long monoTokenId;
    @SerializedName("NetworkType")
    private int networkType;
    @SerializedName("PackageName")
    private String packageName;
    @SerializedName("Platform")
    private int platform;
    @SerializedName("SessionId")
    private String sessionId;
    @SerializedName("TimeStamp")
    private long time = System.currentTimeMillis();

    public long getTime() {
        return this.time;
    }

    public long getMonoTokenId() {
        return this.monoTokenId;
    }

    public void setMonoTokenId(long monoTokenId) {
        this.monoTokenId = monoTokenId;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getNetworkType() {
        return this.networkType;
    }

    public void setNetworkType(int networkType) {
        this.networkType = networkType;
    }

    public int getAppVersionCode() {
        return this.appVersionCode;
    }

    public void setAppVersionCode(int appVersionCode) {
        this.appVersionCode = appVersionCode;
    }

    public String getAppVersionName() {
        return this.appVersionName;
    }

    public void setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
    }

    public int getDeviceAndroidVersion() {
        return this.deviceAndroidVersion;
    }

    public void setDeviceAndroidVersion(int deviceAndroidVersion) {
        this.deviceAndroidVersion = deviceAndroidVersion;
    }

    public boolean setProperties(Context context) {
        if (context == null) {
            return false;
        }
        setMonoTokenId(C0774g.m1009b(context));
        if (getMonoTokenId() < 1) {
            return false;
        }
        setMonoAnalyticId(C0774g.m997a(context));
        setPackageName(context.getPackageName());
        setNetworkType(C0857i.m1159h(context));
        setAppVersionCode(C0857i.m1156e(context));
        setAppVersionName(C0857i.m1157f(context));
        setDeviceAndroidVersion(C0857i.m1151c());
        setPlatform(500);
        setSessionId(C1068f.m1866b(context));
        return true;
    }

    public String getMonoAnalyticId() {
        return this.monoAnalyticId;
    }

    public void setMonoAnalyticId(String monoAnalyticId) {
        this.monoAnalyticId = monoAnalyticId;
    }

    public String getMonoAnalyticType() {
        return this.monoAnalyticType;
    }

    public void setMonoAnalyticType(String monoAnalyticType) {
        this.monoAnalyticType = monoAnalyticType;
    }

    public int getPlatform() {
        return this.platform;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
