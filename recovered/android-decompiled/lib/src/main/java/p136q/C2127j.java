package p136q;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.C0858A;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import p038N.AbstractC0402b;

/* JADX INFO: renamed from: q.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2127j {

    /* JADX INFO: renamed from: a */
    public final Context f9184a;

    /* JADX INFO: renamed from: e */
    public CharSequence f9188e;

    /* JADX INFO: renamed from: f */
    public CharSequence f9189f;

    /* JADX INFO: renamed from: g */
    public PendingIntent f9190g;

    /* JADX INFO: renamed from: h */
    public IconCompat f9191h;

    /* JADX INFO: renamed from: i */
    public int f9192i;

    /* JADX INFO: renamed from: k */
    public AbstractC0402b f9194k;

    /* JADX INFO: renamed from: m */
    public Bundle f9196m;

    /* JADX INFO: renamed from: o */
    public String f9198o;

    /* JADX INFO: renamed from: p */
    public final boolean f9199p;

    /* JADX INFO: renamed from: q */
    public final Notification f9200q;

    /* JADX INFO: renamed from: r */
    public final ArrayList f9201r;

    /* JADX INFO: renamed from: b */
    public final ArrayList f9185b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f9186c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f9187d = new ArrayList();

    /* JADX INFO: renamed from: j */
    public boolean f9193j = true;

    /* JADX INFO: renamed from: l */
    public boolean f9195l = false;

    /* JADX INFO: renamed from: n */
    public int f9197n = 0;

    public C2127j(Context context, String str) {
        Notification notification = new Notification();
        this.f9200q = notification;
        this.f9184a = context;
        this.f9198o = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f9192i = 0;
        this.f9201r = new ArrayList();
        this.f9199p = true;
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m4668b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX INFO: renamed from: a */
    public final Notification m4669a() {
        Notification notificationBuild;
        Bundle bundle;
        String strMo1085Q;
        C0858A c0858a = new C0858A(this);
        C2127j c2127j = (C2127j) c0858a.f3640i;
        AbstractC0402b abstractC0402b = c2127j.f9194k;
        if (abstractC0402b != null) {
            abstractC0402b.mo1095a(c0858a);
        }
        int i3 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) c0858a.f3639h;
        if (i3 < 26 && i3 < 24) {
            builder.setExtras((Bundle) c0858a.f3641j);
            notificationBuild = builder.build();
        } else {
            notificationBuild = builder.build();
        }
        if (abstractC0402b != null) {
            c2127j.f9194k.getClass();
        }
        if (abstractC0402b != null && (bundle = notificationBuild.extras) != null && (strMo1085Q = abstractC0402b.mo1085Q()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strMo1085Q);
        }
        return notificationBuild;
    }

    /* JADX INFO: renamed from: c */
    public final void m4670c(AbstractC0402b abstractC0402b) {
        if (this.f9194k != abstractC0402b) {
            this.f9194k = abstractC0402b;
            if (((C2127j) abstractC0402b.f1360a) != this) {
                abstractC0402b.f1360a = this;
                m4670c(abstractC0402b);
            }
        }
    }
}
