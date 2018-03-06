package ir.mono.monolyticsdk.Models;

import ir.mono.monolyticsdk.Utils.gson.annotations.SerializedName;

public class CallApiModel {
    public static final int TYPE_CRAWLER = 1;
    @SerializedName("addr")
    String address;
    @SerializedName("hash")
    String hash;
    @SerializedName("type")
    int type;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
