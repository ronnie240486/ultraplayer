package com.google.android.gms.internal.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p016F1.C0187d;
import p028J1.C0296b;
import p046P1.AbstractC0491s;
import p067X.C0679k;
import p081b.C1058a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.X2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1247X2 {

    /* JADX INFO: renamed from: n */
    public static final C0296b f5727n = new C0296b("SessionFlowSummary", null);

    /* JADX INFO: renamed from: o */
    public static final String f5728o = "21.4.0";

    /* JADX INFO: renamed from: p */
    public static long f5729p = System.currentTimeMillis();

    /* JADX INFO: renamed from: a */
    public final C1058a f5730a;

    /* JADX INFO: renamed from: b */
    public final List f5731b;

    /* JADX INFO: renamed from: c */
    public final List f5732c;

    /* JADX INFO: renamed from: d */
    public final List f5733d;

    /* JADX INFO: renamed from: e */
    public final Map f5734e;

    /* JADX INFO: renamed from: f */
    public final C1209O f5735f;

    /* JADX INFO: renamed from: g */
    public final String f5736g;

    /* JADX INFO: renamed from: h */
    public final long f5737h;

    /* JADX INFO: renamed from: i */
    public final long f5738i;

    /* JADX INFO: renamed from: j */
    public C0187d f5739j;

    /* JADX INFO: renamed from: k */
    public String f5740k;

    /* JADX INFO: renamed from: l */
    public String f5741l;

    /* JADX INFO: renamed from: m */
    public String f5742m;

    public C1247X2(C1209O c1209o, String str) {
        C1196K2 c1196k2 = C1196K2.f5650a;
        C1058a c1058a = new C1058a(1);
        c1058a.f4809b = c1196k2;
        this.f5730a = c1058a;
        this.f5731b = Collections.synchronizedList(new ArrayList());
        this.f5732c = Collections.synchronizedList(new ArrayList());
        this.f5733d = Collections.synchronizedList(new ArrayList());
        this.f5734e = Collections.synchronizedMap(new HashMap());
        this.f5735f = c1209o;
        this.f5736g = str;
        this.f5737h = System.currentTimeMillis();
        long j3 = f5729p;
        f5729p = 1 + j3;
        this.f5738i = j3;
    }

    /* JADX INFO: renamed from: a */
    public final void m3216a(C0187d c0187d) {
        if (c0187d == null) {
            m3217b(2);
            return;
        }
        AbstractC0491s.m1210b();
        CastDevice castDevice = c0187d.f464k;
        if (castDevice == null) {
            m3217b(3);
            return;
        }
        this.f5739j = c0187d;
        String str = this.f5741l;
        String str2 = castDevice.f5430r;
        if (str == null) {
            this.f5741l = str2;
            this.f5742m = castDevice.f5423k;
            c0187d.m676b();
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            m3217b(5);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3217b(int i3) {
        Integer numValueOf = Integer.valueOf(i3 - 1);
        Map map = this.f5734e;
        C1259b c1259b = (C1259b) map.get(numValueOf);
        if (c1259b != null) {
            c1259b.f5795d.incrementAndGet();
            c1259b.f5793b = System.currentTimeMillis();
        } else {
            C1259b c1259b2 = new C1259b(new C0679k(i3));
            c1259b2.f5794c = this.f5737h;
            map.put(numValueOf, c1259b2);
        }
    }
}
