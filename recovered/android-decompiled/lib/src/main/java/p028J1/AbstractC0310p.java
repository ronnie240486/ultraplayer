package p028J1;

import android.support.v4.media.session.C0858A;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import p001A0.C0069c;
import p013E1.C0118A;
import p013E1.C0125H;
import p040N1.C0431l;
import p097f2.AbstractC1561e;
import p097f2.C1562f;
import p097f2.C1563g;

/* JADX INFO: renamed from: J1.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0310p {

    /* JADX INFO: renamed from: a */
    public final C0296b f832a;

    /* JADX INFO: renamed from: b */
    public final String f833b;

    /* JADX INFO: renamed from: c */
    public C0858A f834c;

    /* JADX INFO: renamed from: d */
    public final List f835d;

    public AbstractC0310p(String str) {
        AbstractC0295a.m826c(str);
        this.f833b = str;
        this.f832a = new C0296b("MediaControlChannel", null);
        this.f835d = Collections.synchronizedList(new ArrayList());
    }

    /* JADX INFO: renamed from: a */
    public final void m855a(C0309o c0309o) {
        this.f835d.add(c0309o);
    }

    /* JADX INFO: renamed from: b */
    public final long m856b() {
        C0858A c0858a = this.f834c;
        if (c0858a != null) {
            return ((AtomicLong) c0858a.f3640i).getAndIncrement();
        }
        C0296b c0296b = this.f832a;
        Log.e(c0296b.f788a, c0296b.m833d("Attempt to generate requestId without a sink", new Object[0]));
        return 0L;
    }

    /* JADX INFO: renamed from: c */
    public final void m857c(long j3, String str) {
        C0858A c0858a = this.f834c;
        if (c0858a == null) {
            C0296b c0296b = this.f832a;
            Log.e(c0296b.f788a, c0296b.m833d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        C0125H c0125h = (C0125H) c0858a.f3639h;
        if (c0125h == null) {
            throw new IllegalStateException("Device is not connected");
        }
        String str2 = this.f833b;
        AbstractC0295a.m826c(str2);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str.length() > 524288) {
            C0296b c0296b2 = C0125H.f181F;
            Log.w(c0296b2.f788a, c0296b2.m833d("Message send failed. Message exceeds maximum size", new Object[0]));
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
        C0431l c0431lM1132b = C0431l.m1132b();
        c0431lM1132b.f1464d = new C0118A(c0125h, str2, str, 1);
        c0431lM1132b.f1463c = 8405;
        C1563g c1563gM1079c = c0125h.m1079c(1, c0431lM1132b.m1133a());
        C0069c c0069c = new C0069c(c0858a, j3);
        c1563gM1079c.getClass();
        c1563gM1079c.f7072b.m2058e(new C1562f(AbstractC1561e.f7066a, c0069c));
        c1563gM1079c.m3891h();
    }
}
