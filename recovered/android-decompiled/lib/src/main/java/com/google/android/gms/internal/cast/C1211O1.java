package com.google.android.gms.internal.cast;

import android.text.TextUtils;
import p016F1.AbstractC0191h;
import p016F1.C0187d;
import p016F1.InterfaceC0193j;
import p022H1.C0258b;
import p036M0.C0380q;
import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.O1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1211O1 implements InterfaceC0193j {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0258b f5677g;

    public /* synthetic */ C1211O1(C0258b c0258b) {
        this.f5677g = c0258b;
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: a */
    public void mo681a(AbstractC0191h abstractC0191h, int i3) {
        C0380q c0380q = new C0380q(6, 3);
        c0380q.f1292i = Integer.valueOf(i3);
        C1251Y2 c1251y2 = new C1251Y2(c0380q);
        C0258b c0258b = this.f5677g;
        C0258b.m779q(c0258b, c1251y2);
        C1247X2 c1247x2 = (C1247X2) c0258b.f666k;
        AbstractC0491s.m1213e(c1247x2);
        c1247x2.m3216a((C0187d) abstractC0191h);
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: b */
    public void mo682b(AbstractC0191h abstractC0191h, int i3) {
        C0380q c0380q = new C0380q(5, 3);
        c0380q.f1292i = Integer.valueOf(i3);
        C1251Y2 c1251y2 = new C1251Y2(c0380q);
        C0258b c0258b = this.f5677g;
        C0258b.m779q(c0258b, c1251y2);
        c0258b.m793s();
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: c */
    public void mo683c(AbstractC0191h abstractC0191h, int i3) {
        C0380q c0380q = new C0380q(8, 3);
        c0380q.f1292i = Integer.valueOf(i3);
        C1251Y2 c1251y2 = new C1251Y2(c0380q);
        C0258b c0258b = this.f5677g;
        C0258b.m779q(c0258b, c1251y2);
        c0258b.m793s();
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: d */
    public void mo684d(AbstractC0191h abstractC0191h, String str) {
        C1251Y2 c1251y2 = new C1251Y2(new C0380q(7, 3));
        C0258b c0258b = this.f5677g;
        C0258b.m779q(c0258b, c1251y2);
        C1247X2 c1247x2 = (C1247X2) c0258b.f666k;
        AbstractC0491s.m1213e(c1247x2);
        c1247x2.m3216a((C0187d) abstractC0191h);
        C1247X2 c1247x3 = (C1247X2) c0258b.f666k;
        AbstractC0491s.m1213e(c1247x3);
        String str2 = c1247x3.f5740k;
        if (str2 == null) {
            c1247x3.f5740k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            c1247x3.m3217b(4);
        }
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: e */
    public void mo685e(AbstractC0191h abstractC0191h, String str) {
        C1251Y2 c1251y2 = new C1251Y2(new C0380q(4, 3));
        C0258b c0258b = this.f5677g;
        C0258b.m779q(c0258b, c1251y2);
        C1247X2 c1247x2 = (C1247X2) c0258b.f666k;
        AbstractC0491s.m1213e(c1247x2);
        c1247x2.m3216a((C0187d) abstractC0191h);
        C1247X2 c1247x3 = (C1247X2) c0258b.f666k;
        AbstractC0491s.m1213e(c1247x3);
        String str2 = c1247x3.f5740k;
        if (str2 == null) {
            c1247x3.f5740k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            c1247x3.m3217b(4);
        }
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ void mo686f(AbstractC0191h abstractC0191h, boolean z3) {
        C1251Y2 c1251y2 = new C1251Y2(new C0380q(4, 3));
        C0258b c0258b = this.f5677g;
        C0258b.m779q(c0258b, c1251y2);
        C1247X2 c1247x2 = (C1247X2) c0258b.f666k;
        AbstractC0491s.m1213e(c1247x2);
        c1247x2.m3216a((C0187d) abstractC0191h);
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: g */
    public void mo687g(AbstractC0191h abstractC0191h, int i3) {
        C0380q c0380q = new C0380q(9, 3);
        c0380q.f1292i = Integer.valueOf(i3);
        C0258b c0258b = this.f5677g;
        c0380q.f1293j = Boolean.valueOf(((BinderC1263c) c0258b.f664i).f5810e == 2);
        C0258b.m779q(c0258b, new C1251Y2(c0380q));
        c0258b.m793s();
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: h */
    public void mo688h(AbstractC0191h abstractC0191h) {
        C0187d c0187d = (C0187d) abstractC0191h;
        C0380q c0380q = new C0380q(2, 3);
        C0258b c0258b = this.f5677g;
        c0380q.f1293j = Boolean.valueOf(((BinderC1263c) c0258b.f664i).f5810e == 2);
        C0258b.m779q(c0258b, new C1251Y2(c0380q));
        C1247X2 c1247x2 = (C1247X2) c0258b.f666k;
        AbstractC0491s.m1213e(c1247x2);
        c1247x2.m3216a(c0187d);
        c0187d.f465l = (C1211O1) c0258b.f667l;
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ void mo689i(AbstractC0191h abstractC0191h) {
    }
}
