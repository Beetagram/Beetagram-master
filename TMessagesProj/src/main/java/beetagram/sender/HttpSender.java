package ir.mono.monolyticsdk.sender;

import android.content.Context;
import android.net.Uri;
import io.fabric.sdk.android.services.network.HttpRequest;
import ir.mono.monolyticsdk.C1049e;
import ir.mono.monolyticsdk.MonolyticConstants;
import ir.mono.monolyticsdk.ReportField;
import ir.mono.monolyticsdk.activityLifecycle.monolyticsActivities.support.p021a.C0941d;
import ir.mono.monolyticsdk.activityLifecycle.monolyticsActivities.support.p021a.C0942e;
import ir.mono.monolyticsdk.p024e.C1046d;
import ir.mono.monolyticsdk.p025f.C1051b;
import ir.mono.monolyticsdk.p026g.C1071b;
import ir.mono.monolyticsdk.p032m.C1096b;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HttpSender implements ReportSender {
    private final C1071b config;
    @C0942e
    private final Uri mFormUri;
    private final Map<ReportField, String> mMapping;
    private final Method mMethod;
    @C0942e
    private String mPassword;
    private final Type mType;
    @C0942e
    private String mUsername;

    public enum Method {
        POST,
        PUT
    }

    public enum Type {
        FORM {
            @C0941d
            public String getContentType() {
                return HttpRequest.CONTENT_TYPE_FORM;
            }
        },
        JSON {
            @C0941d
            public String getContentType() {
                return "application/json";
            }
        };

        @C0941d
        public abstract String getContentType();
    }

    public HttpSender(@C0941d C1071b config, @C0941d Method method, @C0941d Type type, @C0942e Map<ReportField, String> mapping) {
        this(config, method, type, null, mapping);
    }

    public HttpSender(@C0941d C1071b config, @C0941d Method method, @C0941d Type type, @C0942e String formUri, @C0942e Map<ReportField, String> mapping) {
        this.config = config;
        this.mMethod = method;
        this.mFormUri = formUri == null ? null : Uri.parse(formUri);
        this.mMapping = mapping;
        this.mType = type;
        this.mUsername = null;
        this.mPassword = null;
    }

    public void setBasicAuth(@C0942e String username, @C0942e String password) {
        this.mUsername = username;
        this.mPassword = password;
    }

    public void send(@C0941d Context context, @C0941d C1051b report) throws ReportSenderException {
        try {
            URL url;
            String jSONObject;
            if (this.mFormUri == null) {
                url = new URL(this.config.m2009j());
            } else {
                url = new URL(this.mFormUri.toString());
            }
            if (C1049e.f1396a) {
                C1049e.f1398c.mo3934b(C1049e.f1397b, "Connect to " + url.toString());
            }
            String k = this.mUsername != null ? this.mUsername : isNull(this.config.m2010k()) ? null : this.config.m2010k();
            String l = this.mPassword != null ? this.mPassword : isNull(this.config.m2011l()) ? null : this.config.m2011l();
            C1096b c1096b = new C1096b(this.config);
            c1096b.m2099a(this.config.m2004e());
            c1096b.m2103b(this.config.m1983G());
            c1096b.m2101a(k);
            c1096b.m2104b(l);
            c1096b.m2102a(this.config.m2000a());
            switch (this.mType) {
                case JSON:
                    jSONObject = report.m1819a().toString();
                    break;
                default:
                    jSONObject = C1096b.m2098b(remap(report));
                    break;
            }
            switch (this.mMethod) {
                case POST:
                    break;
                case PUT:
                    url = new URL(url.toString() + '/' + report.m1818a(ReportField.REPORT_ID));
                    break;
                default:
                    throw new UnsupportedOperationException("Unknown method: " + this.mMethod.name());
            }
            c1096b.m2100a(context, url, this.mMethod, jSONObject, this.mType);
        } catch (Throwable e) {
            throw new ReportSenderException("Error while sending " + this.config.m1994R() + " report via Http " + this.mMethod.name(), e);
        } catch (Throwable e2) {
            throw new ReportSenderException("Error while sending " + this.config.m1994R() + " report via Http " + this.mMethod.name(), e2);
        }
    }

    @C0941d
    private Map<String, String> remap(@C0941d Map<ReportField, String> report) {
        Set b = this.config.m2001b();
        if (b.isEmpty()) {
            b = new C1046d(MonolyticConstants.DEFAULT_REPORT_FIELDS);
        }
        Map<String, String> hashMap = new HashMap(report.size());
        for (ReportField reportField : r0) {
            if (this.mMapping == null || this.mMapping.get(reportField) == null) {
                hashMap.put(reportField.toString(), report.get(reportField));
            } else {
                hashMap.put(this.mMapping.get(reportField), report.get(reportField));
            }
        }
        return hashMap;
    }

    private boolean isNull(@C0942e String aString) {
        return aString == null || MonolyticConstants.NULL_VALUE.equals(aString);
    }
}
