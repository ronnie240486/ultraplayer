package com.zuxoplayer.app;

import com.google.android.gms.internal.cast.C1323r;
import p046P1.C0475c;
import p055T.AbstractC0545H;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p095f0.C1528a;
import p103h0.InterfaceC1602k;
import p103h0.InterfaceC1603l;

/* JADX INFO: renamed from: com.zuxoplayer.app.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1375o implements InterfaceC1602k {

    /* JADX INFO: renamed from: g */
    public final PlayerActivity f6094g;

    public /* synthetic */ C1375o(PlayerActivity playerActivity) {
        this.f6094g = playerActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r1.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen") != false) goto L11;
     */
    @Override // p103h0.InterfaceC1602k
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC1603l mo3389w(C0475c c0475c) {
        int i3 = AbstractC0632A.f2454a;
        if (i3 >= 23) {
            if (i3 < 31) {
                PlayerActivity playerActivity = this.f6094g;
                if (i3 >= 28) {
                }
            }
            int iM1359g = AbstractC0545H.m1359g(((C0583o) c0475c.f1570c).f2154n);
            AbstractC0646n.m1639q("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + AbstractC0632A.m1562C(iM1359g));
            return new C1323r(iM1359g).mo3389w(c0475c);
        }
        return new C1528a(6).mo3389w(c0475c);
    }
}
