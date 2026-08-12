package com.zuxoplayer.app;

import android.content.Context;
import com.google.android.gms.internal.cast.C1271e;
import java.util.ArrayList;
import java.util.List;
import p013E1.C0134i;
import p016F1.C0186c;
import p016F1.InterfaceC0189f;
import p019G1.C0226a;

/* JADX INFO: loaded from: classes.dex */
public final class CastOptionsProvider implements InterfaceC0189f {
    @Override // p016F1.InterfaceC0189f
    public List<C1271e> getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override // p016F1.InterfaceC0189f
    public C0186c getCastOptions(Context context) {
        ArrayList arrayList = new ArrayList();
        C0134i c0134i = new C0134i();
        ArrayList arrayList2 = new ArrayList();
        C0226a c0226a = C0186c.f438y;
        if (c0226a != null) {
            return new C0186c("CC1AD845", arrayList, false, c0134i, true, c0226a, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, C0186c.f436w, C0186c.f437x);
        }
        throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }
}
