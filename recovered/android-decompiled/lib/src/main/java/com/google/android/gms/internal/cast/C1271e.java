package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p009D0.C0106b;
import p013E1.AbstractC0150y;
import p016F1.BinderC0176B;
import p016F1.C0186c;
import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1271e {

    /* JADX INFO: renamed from: a */
    public final Context f5836a;

    /* JADX INFO: renamed from: b */
    public final String f5837b;

    /* JADX INFO: renamed from: c */
    public final BinderC0176B f5838c;

    /* JADX INFO: renamed from: d */
    public final C0186c f5839d;

    /* JADX INFO: renamed from: e */
    public final BinderC1319q f5840e;

    public C1271e(Context context, C0186c c0186c, BinderC1319q binderC1319q) {
        String strM502K;
        boolean zIsEmpty = Collections.unmodifiableList(c0186c.f440h).isEmpty();
        String str = c0186c.f439g;
        if (zIsEmpty) {
            strM502K = AbstractC0150y.m606a(str);
        } else {
            List listUnmodifiableList = Collections.unmodifiableList(c0186c.f440h);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (listUnmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            strM502K = C0106b.m502K(new C0106b(str, 1, listUnmodifiableList));
        }
        this.f5838c = new BinderC0176B(this);
        this.f5836a = context.getApplicationContext();
        AbstractC0491s.m1211c(strM502K);
        this.f5837b = strM502K;
        this.f5839d = c0186c;
        this.f5840e = binderC1319q;
    }
}
