package com.zuxoplayer.app;

import android.widget.TextView;
import p038N.AbstractC0402b;
import p055T.InterfaceC0553P;
import p083b1.InterfaceC1083L;

/* JADX INFO: renamed from: com.zuxoplayer.app.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1372l implements InterfaceC1083L {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ PlayerActivity f6090g;

    public C1372l(PlayerActivity playerActivity) {
        this.f6090g = playerActivity;
    }

    @Override // p083b1.InterfaceC1083L
    /* JADX INFO: renamed from: d */
    public final void mo2925d(long j3) {
        TextView textView = this.f6090g.f6062s0;
        if (textView != null) {
            textView.setText(PlayerActivity.m3451s(j3 / 1000));
        }
    }

    @Override // p083b1.InterfaceC1083L
    /* JADX INFO: renamed from: g */
    public final void mo2926g(long j3) {
        PlayerActivity playerActivity = this.f6090g;
        playerActivity.f6066w0 = true;
        playerActivity.f6046c0.removeCallbacks(playerActivity.f6067x0);
        TextView textView = playerActivity.f6062s0;
        if (textView != null) {
            textView.setText(PlayerActivity.m3451s(j3 / 1000));
        }
    }

    @Override // p083b1.InterfaceC1083L
    /* JADX INFO: renamed from: l */
    public final void mo2927l(long j3, boolean z3) {
        InterfaceC0553P interfaceC0553P;
        PlayerActivity playerActivity = this.f6090g;
        playerActivity.f6066w0 = false;
        if (!z3 && (interfaceC0553P = playerActivity.f6021D) != null) {
            ((AbstractC0402b) interfaceC0553P).m1093Y(5, j3);
        }
        playerActivity.m3455v(true);
    }
}
