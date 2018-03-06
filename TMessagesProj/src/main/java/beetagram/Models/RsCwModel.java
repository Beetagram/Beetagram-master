package ir.mono.monolyticsdk.Models;

import ir.mono.monolyticsdk.Utils.gson.annotations.SerializedName;

public class RsCwModel {
    @SerializedName("i")
    private long id;
    @SerializedName("l")
    private long length;
    @SerializedName("t")
    private long monoToken;
    @SerializedName("n")
    private int netType;
    @SerializedName("r")
    private String response;
    @SerializedName("rs")
    private int responseStatus;
    @SerializedName("rt")
    private long responseTime;

    public String getResponse() {
        return this.response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public long getResponseTime() {
        return this.responseTime;
    }

    public void setResponseTime(long responseTime) {
        this.responseTime = responseTime;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNetType() {
        return this.netType;
    }

    public void setNetType(int netType) {
        this.netType = netType;
    }

    public long getMonoToken() {
        return this.monoToken;
    }

    public void setMonoToken(long monoToken) {
        this.monoToken = monoToken;
    }

    public long getLength() {
        return this.length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public int getResponseStatus() {
        return this.responseStatus;
    }

    public void setResponseStatus(int responseStatus) {
        this.responseStatus = responseStatus;
    }
}
