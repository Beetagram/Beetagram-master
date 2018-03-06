package ir.mono.monolyticsdk.Models;

import ir.mono.monolyticsdk.Utils.gson.annotations.SerializedName;

public class Config {
    @SerializedName("h")
    private String hash;
    @SerializedName("lmd")
    private String logMainDomain;
    @SerializedName("lma")
    private String[] logMirrorAddress;
    @SerializedName("mmd")
    private String monoMainDomain;
    @SerializedName("mma")
    private String[] monoMirrorAddress;
    @SerializedName("st")
    private int sessionTimeout;
    @SerializedName("t")
    private int timeout;

    public String getMonoMainDomain() {
        return this.monoMainDomain;
    }

    public void setMonoMainDomain(String monoMainDomain) {
        this.monoMainDomain = monoMainDomain;
    }

    public String[] getMonoMirrorAddress() {
        return this.monoMirrorAddress;
    }

    public void setMonoMirrorAddress(String[] monoMirrorAddress) {
        this.monoMirrorAddress = monoMirrorAddress;
    }

    public String getLogMainDomain() {
        return this.logMainDomain;
    }

    public void setLogMainDomain(String logMainDomain) {
        this.logMainDomain = logMainDomain;
    }

    public String[] getLogMirrorAddress() {
        return this.logMirrorAddress;
    }

    public void setLogMirrorAddress(String[] logMirrorAddress) {
        this.logMirrorAddress = logMirrorAddress;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getSessionTimeout() {
        return this.sessionTimeout;
    }

    public void setSessionTimeout(int sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }
}
