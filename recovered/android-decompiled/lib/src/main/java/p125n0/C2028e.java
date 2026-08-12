package p125n0;

import android.media.Spatializer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p101g2.InterfaceC1584e;

/* JADX INFO: renamed from: n0.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2028e implements InterfaceC1584e {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2040q f8823g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    @Override // p101g2.InterfaceC1584e
    public final boolean apply(Object obj) {
        int i3;
        boolean z3;
        C2035l c2035l;
        C2035l c2035l2;
        boolean z4 = false;
        byte b3 = 2;
        C2040q c2040q = this.f8823g;
        C0583o c0583o = (C0583o) obj;
        synchronized (c2040q.f8901c) {
            try {
                if (!c2040q.f8905g.f8864x || c2040q.f8904f || (i3 = c0583o.f2130C) == -1 || i3 <= 2) {
                    z4 = true;
                } else {
                    String str = c0583o.f2154n;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (!str.equals("audio/eac3-joc")) {
                                    b3 = -1;
                                } else {
                                    b3 = 0;
                                }
                                break;
                            case 187078296:
                                if (!str.equals("audio/ac3")) {
                                    b3 = -1;
                                } else {
                                    b3 = 1;
                                }
                                break;
                            case 187078297:
                                if (!str.equals("audio/ac4")) {
                                    b3 = -1;
                                }
                                break;
                            case 1504578661:
                                if (!str.equals("audio/eac3")) {
                                    b3 = -1;
                                } else {
                                    b3 = 3;
                                }
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            case 0:
                            case 1:
                            case 2:
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                z3 = true;
                                break;
                            default:
                                z3 = false;
                                break;
                        }
                    } else {
                        z3 = false;
                    }
                    if (z3 && (AbstractC0632A.f2454a < 32 || (c2035l2 = c2040q.f8906h) == null || !c2035l2.f8868a)) {
                        z4 = true;
                    } else if (AbstractC0632A.f2454a >= 32 && (c2035l = c2040q.f8906h) != null && c2035l.f8868a && ((Spatializer) c2035l.f8869b).isAvailable() && ((Spatializer) c2040q.f8906h.f8869b).isEnabled() && c2040q.f8906h.m4605a(c2040q.f8907i, c0583o)) {
                        z4 = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }
}
