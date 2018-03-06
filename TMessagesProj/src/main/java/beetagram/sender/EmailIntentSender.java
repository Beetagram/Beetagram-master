package ir.mono.monolyticsdk.sender;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ir.mono.monolyticsdk.MonolyticConstants;
import ir.mono.monolyticsdk.ReportField;
import ir.mono.monolyticsdk.activityLifecycle.monolyticsActivities.support.p021a.C0941d;
import ir.mono.monolyticsdk.p024e.C1046d;
import ir.mono.monolyticsdk.p025f.C1051b;
import ir.mono.monolyticsdk.p026g.C1071b;
import java.util.Set;

public class EmailIntentSender implements ReportSender {
    private final C1071b config;

    public EmailIntentSender(@C0941d C1071b config) {
        this.config = config;
    }

    public void send(@C0941d Context context, @C0941d C1051b errorContent) throws ReportSenderException {
        String str = context.getPackageName() + " Crash Report";
        String buildBody = buildBody(errorContent);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.fromParts("mailto", this.config.m2014o(), null));
        intent.addFlags(268435456);
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", buildBody);
        context.startActivity(intent);
    }

    private String buildBody(@C0941d C1051b errorContent) {
        Set b = this.config.m2001b();
        if (b.isEmpty()) {
            b = new C1046d(MonolyticConstants.DEFAULT_MAIL_REPORT_FIELDS);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (ReportField reportField : r0) {
            stringBuilder.append(reportField.toString()).append('=');
            stringBuilder.append((String) errorContent.get(reportField));
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}
