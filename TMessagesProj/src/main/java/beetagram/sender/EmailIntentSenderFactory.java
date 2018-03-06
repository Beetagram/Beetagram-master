package ir.mono.monolyticsdk.sender;

import android.content.Context;
import ir.mono.monolyticsdk.activityLifecycle.monolyticsActivities.support.p021a.C0941d;
import ir.mono.monolyticsdk.p026g.C1071b;

public final class EmailIntentSenderFactory implements ReportSenderFactory {
    @C0941d
    public ReportSender create(@C0941d Context context, @C0941d C1071b config) {
        return new EmailIntentSender(config);
    }
}
