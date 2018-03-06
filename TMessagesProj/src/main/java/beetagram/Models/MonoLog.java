package ir.mono.monolyticsdk.Models;

import ir.mono.monolyticsdk.Utils.ormlite.field.DatabaseField;
import ir.mono.monolyticsdk.Utils.ormlite.table.DatabaseTable;
import ir.mono.monolyticsdk.p000a.C0646a;

@DatabaseTable(tableName = "MonoLog")
public class MonoLog extends C0646a {
    public static final String CLM_ID = "CLM_ID";
    public static final String CLM_JSON = "CLM_JSON";
    public static final String CLM_LAST_SEND_TO_SERVER = "CLM_LAST_SEND_TO_SERVER";
    public static final String CLM_PRIORITY = "CLM_PRIORITY";
    public static final String CLM_RETRY = "CLM_RETRY";
    public static final String CLM_STATUS = "CLM_STATUS";
    public static final String CLM_TIME = "CLM_TIME";
    public static final String CLM_TYPE = "CLM_TYPE";
    public static final int PRIORITY_HIGH = 3;
    public static final int PRIORITY_LOW = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int STATUS_HAVE_TO_SEND_FROM_DB = 2;
    public static final int STATUS_IS_SENDING = 3;
    public static final int STATUS_READY_FOR_SEND = 1;
    @DatabaseField(columnName = "CLM_ID", generatedId = true)
    private int id;
    @DatabaseField(columnName = "CLM_JSON")
    private String json;
    @DatabaseField(columnName = "CLM_LAST_SEND_TO_SERVER")
    private long lastSendToServer;
    @DatabaseField(columnName = "CLM_PRIORITY")
    private int priority = 2;
    @DatabaseField(columnName = "CLM_RETRY")
    private int retryCount;
    @DatabaseField(columnName = "CLM_STATUS")
    private int status;
    @DatabaseField(columnName = "CLM_TIME")
    private long time = System.currentTimeMillis();

    public long getTime() {
        return this.time;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getJson() {
        return this.json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public long getLastSendToServer() {
        return this.lastSendToServer;
    }

    public void setLastSendToServer(long lastSendToServer) {
        this.lastSendToServer = lastSendToServer;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
