package ir.mono.monolyticsdk.sender;

import android.content.Context;
import android.content.Intent;
import ir.mono.monolyticsdk.C1049e;
import ir.mono.monolyticsdk.SenderService;
import ir.mono.monolyticsdk.activityLifecycle.monolyticsActivities.support.p021a.C0941d;
import ir.mono.monolyticsdk.p026g.C1071b;
import java.util.ArrayList;

public class SenderServiceStarter {
    private final C1071b config;
    private final Context context;

    public SenderServiceStarter(@C0941d Context context, @C0941d C1071b config) {
        this.context = context;
        this.config = config;
    }

    public void startService(boolean onlySendSilentReports, boolean approveReportsFirst) {
        if (C1049e.f1396a) {
            C1049e.f1398c.mo3934b(C1049e.f1397b, "About to start SenderService");
        }
        Intent intent = new Intent(this.context, SenderService.class);
        intent.putExtra(SenderService.f284a, onlySendSilentReports);
        intent.putExtra(SenderService.f285b, approveReportsFirst);
        intent.putExtra(SenderService.f286c, new ArrayList(this.config.m1995S()));
        intent.putExtra(SenderService.f287d, this.config);
        try {
            this.context.startService(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
