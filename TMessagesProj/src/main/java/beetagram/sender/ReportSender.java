package ir.mono.monolyticsdk.sender;

import android.content.Context;
import ir.mono.monolyticsdk.activityLifecycle.monolyticsActivities.support.p021a.C0941d;
import ir.mono.monolyticsdk.p025f.C1051b;

public interface ReportSender {
    void send(@C0941d Context context, @C0941d C1051b c1051b) throws ReportSenderException;
}
