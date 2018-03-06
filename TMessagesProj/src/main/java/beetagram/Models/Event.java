package ir.mono.monolyticsdk.Models;

import ir.mono.monolyticsdk.Utils.C0857i;
import ir.mono.monolyticsdk.Utils.gson.annotations.SerializedName;

public class Event extends MonoLogRq {
    @SerializedName("Action")
    private String action;
    @SerializedName("Category")
    private String category;
    @SerializedName("Label")
    private String label;
    @SerializedName("Value")
    private int value;

    private Event() {
    }

    public static Event getInstance(String category, String action, String label, int value) {
        Event event = new Event();
        event.setCategory(category);
        event.setAction(action);
        event.setLabel(label);
        event.setValue(value);
        return event;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = C0857i.m1152c(category);
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = C0857i.m1152c(action);
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
