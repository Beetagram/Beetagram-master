package ir.mono.monolyticsdk.sender;

import android.content.Context;
import ir.mono.monolyticsdk.C1049e;
import ir.mono.monolyticsdk.activityLifecycle.monolyticsActivities.support.p021a.C0941d;
import ir.mono.monolyticsdk.p026g.C1071b;
import ir.mono.monolyticsdk.p032m.C1102f;

public final class DefaultReportSenderFactory implements ReportSenderFactory {
    @C0941d
    public ReportSender create(@C0941d Context context, @C0941d C1071b config) {
        C1102f c1102f = new C1102f(context);
        if (!"".equals(config.m2014o())) {
            C1049e.f1398c.mo3938d(C1049e.f1397b, context.getPackageName() + " reports will be sent by email (if accepted by user).");
            return new EmailIntentSenderFactory().create(context, config);
        } else if (!c1102f.m2119a("android.permission.INTERNET")) {
            C1049e.f1398c.mo3940e(C1049e.f1397b, context.getPackageName() + " should be granted permission " + "android.permission.INTERNET" + " if you want your crash reports to be sent. If you don't want to add this permission to your application you can also enable sending reports by email. If this is your will then provide your email address in @MonolyticConfig(mailTo=\"your.account@domain.com\"");
            return new C1108a();
        } else if (config.m2009j() == null || "".equals(config.m2009j())) {
            return new C1108a();
        } else {
            if (C1049e.f1396a) {
                C1049e.f1398c.mo3934b(C1049e.f1397b, context.getPackageName() + " reports will be sent by Http.");
            }
            return new HttpSenderFactory().create(context, config);
        }
    }
}
