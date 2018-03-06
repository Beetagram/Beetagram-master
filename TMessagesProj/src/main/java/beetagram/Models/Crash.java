package ir.mono.monolyticsdk.Models;

import ir.mono.monolyticsdk.Utils.C0857i;
import ir.mono.monolyticsdk.Utils.gson.annotations.SerializedName;

public class Crash extends MonoLogRq {
    @SerializedName("AvailableMemory")
    private long availableMemory;
    @SerializedName("BatterySaverMode")
    private boolean batterySaverMode;
    @SerializedName("ErrorLine")
    private int errorLine;
    @SerializedName("FileName")
    private String fileName;
    @SerializedName("Manufacturer")
    private String manufacturer;
    @SerializedName("Method")
    private String method;
    @SerializedName("StackTrace")
    private String stackTrace;

    private Crash() {
    }

    public static Crash getInstance(String stackTrace, long memory, int errorLine, String fileName, String method, boolean batterySaverMode, String manufacturer) {
        Crash crash = new Crash();
        crash.setStackTrace(stackTrace);
        crash.setAvailableMemory(memory);
        crash.setErrorLine(errorLine);
        crash.setFileName(fileName);
        crash.setMethod(method);
        crash.setBatterySaverMode(batterySaverMode);
        crash.setManufacturer(manufacturer);
        return crash;
    }

    public String getStackTrace() {
        return this.stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = C0857i.m1152c(stackTrace);
    }

    public long getAvailableMemory() {
        return this.availableMemory;
    }

    public void setAvailableMemory(long availableMemory) {
        this.availableMemory = availableMemory;
    }

    public int getErrorLine() {
        return this.errorLine;
    }

    public void setErrorLine(int errorLine) {
        this.errorLine = errorLine;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = C0857i.m1152c(fileName);
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = C0857i.m1152c(method);
    }

    public boolean isBatterySaverMode() {
        return this.batterySaverMode;
    }

    public void setBatterySaverMode(boolean batterySaverMode) {
        this.batterySaverMode = batterySaverMode;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
