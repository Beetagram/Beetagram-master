package ir.mono.monolyticsdk.Models;

import ir.mono.monolyticsdk.Utils.gson.annotations.SerializedName;

public class LogApiResponse {
    @SerializedName("apicall")
    CallApiModel callApiModel;
    @SerializedName("config")
    CallConfigModel callConfigModel;

    public CallApiModel getCallApiModel() {
        return this.callApiModel;
    }

    public void setCallApiModel(CallApiModel callApiModel) {
        this.callApiModel = callApiModel;
    }

    public CallConfigModel getCallConfigModel() {
        return this.callConfigModel;
    }

    public void setCallConfigModel(CallConfigModel callConfigModel) {
        this.callConfigModel = callConfigModel;
    }
}
