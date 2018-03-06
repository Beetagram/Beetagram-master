package ir.mono.monolyticsdk.Models;

import ir.mono.monolyticsdk.Utils.C0772e.C0771a;

public class RegisterRq {
    private String deviceName;
    private int platformId = 500;
    private C0771a properties;
    private int sdkVersion = 4;
    private int serviceId = 155;

    public int getPlatformId() {
        return this.platformId;
    }

    public int getServiceId() {
        return this.serviceId;
    }

    public int getSdkVersion() {
        return this.sdkVersion;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public C0771a getProp() {
        return this.properties;
    }

    public void setProp(C0771a prop) {
        this.properties = prop;
    }
}
