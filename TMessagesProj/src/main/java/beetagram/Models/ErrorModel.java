package ir.mono.monolyticsdk.Models;

import ir.mono.monolyticsdk.Utils.gson.annotations.SerializedName;

public class ErrorModel {
    @SerializedName("ErrorCode")
    private int errorCode;
    @SerializedName("Message")
    private String message;

    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
