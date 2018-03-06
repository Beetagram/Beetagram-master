package ir.mono.monolyticsdk.Models;

import ir.mono.monolyticsdk.Utils.gson.annotations.SerializedName;

public class CallConfigModel {
    @SerializedName("addr")
    String address;
    @SerializedName("hash")
    String hash;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
