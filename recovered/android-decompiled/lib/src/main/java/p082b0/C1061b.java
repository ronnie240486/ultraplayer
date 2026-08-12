package p082b0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import p000A.C0058r;
import p003B.AbstractC0081c;
import p036M0.C0380q;
import p046P1.C0475c;
import p055T.AbstractC0547J;
import p055T.AbstractC0558V;
import p055T.AbstractC0571e;
import p055T.C0546I;
import p055T.C0559W;
import p055T.C0566b0;
import p055T.C0568c0;
import p055T.C0579k;
import p055T.C0581m;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.C0650r;
import p064W.InterfaceC0636d;
import p064W.InterfaceC0642j;
import p064W.InterfaceC0643k;
import p070Y.AbstractC0724u;
import p070Y.C0702B;
import p070Y.C0720q;
import p070Y.C0723t;
import p070Y.C0725v;
import p077a0.C0792C;
import p077a0.C0839o;
import p085c0.C1136l;
import p085c0.C1138n;
import p088d0.C1380d;
import p088d0.C1383g;
import p088d0.C1400x;
import p103h0.C1605n;
import p103h0.C1607p;
import p105h2.AbstractC1676G;
import p105h2.C1673D;
import p105h2.C1674E;
import p105h2.C1692X;
import p114k0.C1907A;
import p114k0.C1911E;
import p114k0.C1963w;
import p114k0.InterfaceC1913G;
import p125n0.C2033j;
import p125n0.C2036m;
import p125n0.C2039p;
import p125n0.InterfaceC2037n;
import p138q1.C2174j;
import p154u1.EnumC2299c;
import p162x1.C2360i;
import p166y1.C2377b;
import p166y1.C2382g;
import p166y1.C2383h;
import p166y1.InterfaceC2381f;
import p169z1.InterfaceC2390b;

/* JADX INFO: renamed from: b0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1061b implements InterfaceC0643k, InterfaceC0642j, InterfaceC0636d, InterfaceC2037n, InterfaceC2390b, InterfaceC2381f {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4821g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f4822h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f4823i;

    public /* synthetic */ C1061b(Object obj, int i3, Object obj2) {
        this.f4821g = i3;
        this.f4822h = obj;
        this.f4823i = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:230:0x0433  */
    /* JADX WARN: Code duplicated, block: B:244:0x045e  */
    /* JADX WARN: Code duplicated, block: B:247:0x0469  */
    /* JADX WARN: Code duplicated, block: B:249:0x046d  */
    /* JADX WARN: Code duplicated, block: B:250:0x046f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0478  */
    /* JADX WARN: Code duplicated, block: B:256:0x0483  */
    /* JADX WARN: Code duplicated, block: B:258:0x0487  */
    /* JADX WARN: Code duplicated, block: B:259:0x0489  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p064W.InterfaceC0643k
    /* JADX INFO: renamed from: a */
    public void mo1279a(Object obj, C0581m c0581m) {
        boolean z3;
        int i3;
        C0058r c0058r;
        C0058r c0058r2;
        int i4;
        int i5;
        C0380q c0380q;
        int i6;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        C0583o c0583o;
        C0583o c0583o2;
        int i9;
        C0583o c0583o3;
        int i10;
        C0579k c0579k;
        int i11;
        C1064e c1064e = (C1064e) this.f4822h;
        C0792C c0792c = (C0792C) this.f4823i;
        C1069j c1069j = (C1069j) obj;
        SparseArray sparseArray = c1064e.f4830k;
        SparseArray sparseArray2 = new SparseArray(c0581m.f2090a.size());
        for (int i12 = 0; i12 < c0581m.f2090a.size(); i12++) {
            int iM1445a = c0581m.m1445a(i12);
            C1060a c1060a = (C1060a) sparseArray.get(iM1445a);
            c1060a.getClass();
            sparseArray2.append(iM1445a, c1060a);
        }
        c1069j.getClass();
        if (c0581m.f2090a.size() == 0) {
            return;
        }
        for (int i13 = 0; i13 < c0581m.f2090a.size(); i13++) {
            int iM1445a2 = c0581m.m1445a(i13);
            C1060a c1060a2 = (C1060a) sparseArray2.get(iM1445a2);
            c1060a2.getClass();
            if (iM1445a2 == 0) {
                C1066g c1066g = c1069j.f4853b;
                synchronized (c1066g) {
                    try {
                        c1066g.f4847d.getClass();
                        AbstractC0558V abstractC0558V = c1066g.f4848e;
                        c1066g.f4848e = c1060a2.f4812b;
                        Iterator it = c1066g.f4846c.values().iterator();
                        while (it.hasNext()) {
                            C1065f c1065f = (C1065f) it.next();
                            if (!c1065f.m2839b(abstractC0558V, c1066g.f4848e) || c1065f.m2838a(c1060a2)) {
                                it.remove();
                                if (c1065f.f4839e) {
                                    if (c1065f.f4835a.equals(c1066g.f4849f)) {
                                        c1066g.m2840a(c1065f);
                                    }
                                    c1066g.f4847d.m2903d(c1060a2, c1065f.f4835a);
                                }
                            }
                        }
                        c1066g.m2844e(c1060a2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iM1445a2 == 11) {
                c1069j.f4853b.m2846g(c1060a2, c1069j.f4862k);
            } else {
                c1069j.f4853b.m2845f(c1060a2);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c0581m.f2090a.get(0)) {
            C1060a c1060a3 = (C1060a) sparseArray2.get(0);
            c1060a3.getClass();
            if (c1069j.f4861j != null) {
                c1069j.m2902c(c1060a3.f4812b, c1060a3.f4814d);
            }
        }
        if (c0581m.f2090a.get(2) && c1069j.f4861j != null) {
            C1674E c1674eListIterator = c0792c.mo1327z().f2055a.listIterator(0);
            loop3: while (true) {
                if (!c1674eListIterator.hasNext()) {
                    c0579k = null;
                    break;
                }
                C0566b0 c0566b0 = (C0566b0) c1674eListIterator.next();
                for (int i14 = 0; i14 < c0566b0.f2047a; i14++) {
                    if (c0566b0.f2051e[i14] && (c0579k = c0566b0.f2048b.f1995d[i14].f2158r) != null) {
                        break loop3;
                    }
                }
            }
            if (c0579k != null) {
                PlaybackMetrics.Builder builderM2859i = AbstractC1067h.m2859i(c1069j.f4861j);
                int i15 = 0;
                while (true) {
                    if (i15 >= c0579k.f2089j) {
                        i11 = 1;
                        break;
                    }
                    UUID uuid = c0579k.f2086g[i15].f2082h;
                    if (uuid.equals(AbstractC0571e.f2060d)) {
                        i11 = 3;
                        break;
                    } else if (uuid.equals(AbstractC0571e.f2061e)) {
                        i11 = 2;
                        break;
                    } else {
                        if (uuid.equals(AbstractC0571e.f2059c)) {
                            i11 = 6;
                            break;
                        }
                        i15++;
                    }
                }
                builderM2859i.setDrmType(i11);
            }
        }
        if (c0581m.f2090a.get(1011)) {
            c1069j.f4877z++;
        }
        AbstractC0547J abstractC0547J = c1069j.f4865n;
        int i16 = 5;
        if (abstractC0547J == null) {
            i5 = 1;
        } else {
            boolean z6 = c1069j.f4873v == 4;
            int i17 = abstractC0547J.f1946g;
            if (i17 == 1001) {
                c0058r = new C0058r(20, 0);
            } else {
                if (abstractC0547J instanceof C0839o) {
                    C0839o c0839o = (C0839o) abstractC0547J;
                    z3 = c0839o.f3565i == 1;
                    i3 = c0839o.f3569m;
                } else {
                    z3 = false;
                    i3 = 0;
                }
                Throwable cause = abstractC0547J.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    int i18 = 24;
                    if (z3 && (i3 == 0 || i3 == 1)) {
                        c0058r2 = new C0058r(35, 0);
                    } else if (z3 && i3 == 3) {
                        c0058r2 = new C0058r(15, 0);
                    } else if (z3 && i3 == 2) {
                        c0058r2 = new C0058r(23, 0);
                    } else if (cause instanceof C1607p) {
                        c0058r = new C0058r(13, AbstractC0632A.m1603v(((C1607p) cause).f7264j));
                    } else if (cause instanceof C1605n) {
                        c0058r = new C0058r(14, ((C1605n) cause).f7251g);
                    } else if (cause instanceof OutOfMemoryError) {
                        c0058r = new C0058r(14, 0);
                    } else if (cause instanceof C1136l) {
                        c0058r = new C0058r(17, ((C1136l) cause).f5261g);
                    } else if (cause instanceof C1138n) {
                        c0058r = new C0058r(18, ((C1138n) cause).f5263g);
                    } else if (cause instanceof MediaCodec.CryptoException) {
                        int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                        switch (AbstractC0632A.m1602u(errorCode)) {
                            case 6002:
                                break;
                            case 6003:
                                i18 = 28;
                                break;
                            case 6004:
                                i18 = 25;
                                break;
                            case 6005:
                                i18 = 26;
                                break;
                            default:
                                i18 = 27;
                                break;
                        }
                        c0058r = new C0058r(i18, errorCode);
                    } else {
                        c0058r = new C0058r(22, 0);
                    }
                    c0058r = c0058r2;
                } else if (cause instanceof C0725v) {
                    c0058r = new C0058r(5, ((C0725v) cause).f2773j);
                } else if ((cause instanceof AbstractC0724u) || (cause instanceof C0546I)) {
                    c0058r = new C0058r(z6 ? 10 : 11, 0);
                } else {
                    boolean z7 = cause instanceof C0723t;
                    if (z7 || (cause instanceof C0702B)) {
                        if (C0650r.m1652c(c1069j.f4852a).m1654d() == 1) {
                            c0058r = new C0058r(3, 0);
                        } else {
                            Throwable cause2 = cause.getCause();
                            if (cause2 instanceof UnknownHostException) {
                                c0058r = new C0058r(6, 0);
                            } else if (cause2 instanceof SocketTimeoutException) {
                                c0058r = new C0058r(7, 0);
                            } else {
                                c0058r = (z7 && ((C0723t) cause).f2772i == 1) ? new C0058r(4, 0) : new C0058r(8, 0);
                            }
                        }
                    } else if (i17 == 1002) {
                        c0058r = new C0058r(21, 0);
                    } else if (cause instanceof C1383g) {
                        Throwable cause3 = cause.getCause();
                        cause3.getClass();
                        if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                            int iM1603v = AbstractC0632A.m1603v(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                            switch (AbstractC0632A.m1602u(iM1603v)) {
                                case 6002:
                                    i4 = 24;
                                    break;
                                case 6003:
                                    i4 = 28;
                                    break;
                                case 6004:
                                    i4 = 25;
                                    break;
                                case 6005:
                                    i4 = 26;
                                    break;
                                default:
                                    i4 = 27;
                                    break;
                            }
                            c0058r = new C0058r(i4, iM1603v);
                        } else if (AbstractC0632A.f2454a >= 23 && AbstractC0081c.m411s(cause3)) {
                            c0058r = new C0058r(27, 0);
                        } else if (cause3 instanceof NotProvisionedException) {
                            c0058r = new C0058r(24, 0);
                        } else if (cause3 instanceof DeniedByServerException) {
                            c0058r = new C0058r(29, 0);
                        } else if (cause3 instanceof C1400x) {
                            c0058r = new C0058r(23, 0);
                        } else {
                            c0058r = cause3 instanceof C1380d ? new C0058r(28, 0) : new C0058r(30, 0);
                        }
                    } else if ((cause instanceof C0720q) && (cause.getCause() instanceof FileNotFoundException)) {
                        Throwable cause4 = cause.getCause();
                        cause4.getClass();
                        Throwable cause5 = cause4.getCause();
                        c0058r = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new C0058r(32, 0) : new C0058r(31, 0);
                    } else {
                        c0058r = new C0058r(9, 0);
                    }
                }
                c1069j.f4854c.reportPlaybackErrorEvent(AbstractC1067h.m2853c().setTimeSinceCreatedMillis(jElapsedRealtime - c1069j.f4855d).setErrorCode(c0058r.f82a).setSubErrorCode(c0058r.f83b).setException(abstractC0547J).build());
                i5 = 1;
                c1069j.f4851A = true;
                c1069j.f4865n = null;
            }
            c1069j.f4854c.reportPlaybackErrorEvent(AbstractC1067h.m2853c().setTimeSinceCreatedMillis(jElapsedRealtime - c1069j.f4855d).setErrorCode(c0058r.f82a).setSubErrorCode(c0058r.f83b).setException(abstractC0547J).build());
            i5 = 1;
            c1069j.f4851A = true;
            c1069j.f4865n = null;
        }
        if (c0581m.f2090a.get(2)) {
            C0568c0 c0568c0Mo1327z = c0792c.mo1327z();
            boolean zM1434a = c0568c0Mo1327z.m1434a(2);
            boolean zM1434a2 = c0568c0Mo1327z.m1434a(i5);
            boolean zM1434a3 = c0568c0Mo1327z.m1434a(3);
            if (zM1434a || zM1434a2 || zM1434a3) {
                if (zM1434a) {
                    i6 = 3;
                    c0583o = null;
                } else {
                    C0583o c0583o4 = c1069j.f4869r;
                    int i19 = AbstractC0632A.f2454a;
                    c0583o = null;
                    if (Objects.equals(c0583o4, null)) {
                        i6 = 3;
                    } else {
                        int i20 = c1069j.f4869r == null ? 1 : 0;
                        c1069j.f4869r = null;
                        i6 = 3;
                        i7 = 4;
                        c1069j.m2904e(1, jElapsedRealtime, null, i20);
                    }
                    if (!zM1434a2) {
                        c0583o3 = c1069j.f4870s;
                        int i21 = AbstractC0632A.f2454a;
                        if (!Objects.equals(c0583o3, c0583o)) {
                            if (c1069j.f4870s == null) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            c1069j.f4870s = c0583o;
                            c1069j.m2904e(0, jElapsedRealtime, c0583o, i10);
                        }
                    }
                    if (!zM1434a3) {
                        c0583o2 = c1069j.f4871t;
                        int i22 = AbstractC0632A.f2454a;
                        if (!Objects.equals(c0583o2, c0583o)) {
                            if (c1069j.f4871t == null) {
                                i9 = 1;
                            } else {
                                i9 = 0;
                            }
                            c1069j.f4871t = c0583o;
                            c1069j.m2904e(2, jElapsedRealtime, c0583o, i9);
                        }
                    }
                    c0380q = c0583o;
                }
                i7 = 4;
                if (!zM1434a2) {
                    c0583o3 = c1069j.f4870s;
                    int i23 = AbstractC0632A.f2454a;
                    if (!Objects.equals(c0583o3, c0583o)) {
                        if (c1069j.f4870s == null) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        c1069j.f4870s = c0583o;
                        c1069j.m2904e(0, jElapsedRealtime, c0583o, i10);
                    }
                }
                if (!zM1434a3) {
                    c0583o2 = c1069j.f4871t;
                    int i24 = AbstractC0632A.f2454a;
                    if (!Objects.equals(c0583o2, c0583o)) {
                        if (c1069j.f4871t == null) {
                            i9 = 1;
                        } else {
                            i9 = 0;
                        }
                        c1069j.f4871t = c0583o;
                        c1069j.m2904e(2, jElapsedRealtime, c0583o, i9);
                    }
                }
                c0380q = c0583o;
            } else {
                c0380q = 0;
                i6 = 3;
                i7 = 4;
            }
        } else {
            c0380q = 0;
            i6 = 3;
            i7 = 4;
        }
        if (c1069j.m2900a(c1069j.f4866o)) {
            C0380q c0380q2 = c1069j.f4866o;
            C0583o c0583o5 = (C0583o) c0380q2.f1292i;
            if (c0583o5.f2162v != -1) {
                int i25 = c0380q2.f1291h;
                C0583o c0583o6 = c1069j.f4869r;
                int i26 = AbstractC0632A.f2454a;
                if (!Objects.equals(c0583o6, c0583o5)) {
                    int i27 = (c1069j.f4869r == null && i25 == 0) ? 1 : i25;
                    c1069j.f4869r = c0583o5;
                    c1069j.m2904e(1, jElapsedRealtime, c0583o5, i27);
                }
                c1069j.f4866o = c0380q;
            }
        }
        if (c1069j.m2900a(c1069j.f4867p)) {
            C0380q c0380q3 = c1069j.f4867p;
            C0583o c0583o7 = (C0583o) c0380q3.f1292i;
            int i28 = c0380q3.f1291h;
            C0583o c0583o8 = c1069j.f4870s;
            int i29 = AbstractC0632A.f2454a;
            if (!Objects.equals(c0583o8, c0583o7)) {
                int i30 = (c1069j.f4870s == null && i28 == 0) ? 1 : i28;
                c1069j.f4870s = c0583o7;
                c1069j.m2904e(0, jElapsedRealtime, c0583o7, i30);
            }
            c1069j.f4867p = c0380q;
        }
        if (c1069j.m2900a(c1069j.f4868q)) {
            C0380q c0380q4 = c1069j.f4868q;
            C0583o c0583o9 = (C0583o) c0380q4.f1292i;
            int i31 = c0380q4.f1291h;
            C0583o c0583o10 = c1069j.f4871t;
            int i32 = AbstractC0632A.f2454a;
            if (!Objects.equals(c0583o10, c0583o9)) {
                int i33 = (c1069j.f4871t == null && i31 == 0) ? 1 : i31;
                c1069j.f4871t = c0583o9;
                c1069j.m2904e(2, jElapsedRealtime, c0583o9, i33);
            }
            c1069j.f4868q = c0380q;
        }
        switch (C0650r.m1652c(c1069j.f4852a).m1654d()) {
            case 0:
                i8 = 0;
                break;
            case 1:
                i8 = 9;
                break;
            case 2:
                i8 = 2;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                i8 = 4;
                break;
            case 4:
                i8 = 5;
                break;
            case 5:
                i8 = 6;
                break;
            case 6:
            case 8:
            default:
                i8 = 1;
                break;
            case 7:
                i8 = 3;
                break;
            case 9:
                i8 = 8;
                break;
            case 10:
                i8 = 7;
                break;
        }
        if (i8 != c1069j.f4864m) {
            c1069j.f4864m = i8;
            c1069j.f4854c.reportNetworkEvent(AbstractC1067h.m2852b().setNetworkType(i8).setTimeSinceCreatedMillis(jElapsedRealtime - c1069j.f4855d).build());
        }
        if (c0792c.mo1304g() != 2) {
            z4 = false;
            c1069j.f4872u = false;
        } else {
            z4 = false;
        }
        if (c0792c.mo1306h() == null) {
            c1069j.f4874w = z4;
        } else if (c0581m.f2090a.get(10)) {
            c1069j.f4874w = true;
        }
        int iMo1304g = c0792c.mo1304g();
        if (c1069j.f4872u) {
            z5 = true;
        } else if (c1069j.f4874w) {
            z5 = true;
            i16 = 13;
        } else if (iMo1304g == i7) {
            z5 = true;
            i16 = 11;
        } else {
            i16 = 12;
            if (iMo1304g == 2) {
                int i34 = c1069j.f4863l;
                if (i34 == 0 || i34 == 2 || i34 == 12) {
                    z5 = true;
                    i16 = 2;
                } else if (c0792c.mo1322t()) {
                    z5 = true;
                    i16 = c0792c.mo1321r() != 0 ? 10 : 6;
                } else {
                    z5 = true;
                    i16 = 7;
                }
            } else if (iMo1304g != i6) {
                z5 = true;
                if (iMo1304g != 1 || c1069j.f4863l == 0) {
                    i16 = c1069j.f4863l;
                }
            } else if (c0792c.mo1322t()) {
                z5 = true;
                i16 = c0792c.mo1321r() != 0 ? 9 : 3;
            } else {
                z5 = true;
                i16 = 4;
            }
        }
        if (c1069j.f4863l != i16) {
            c1069j.f4863l = i16;
            c1069j.f4851A = z5;
            c1069j.f4854c.reportPlaybackStateEvent(AbstractC1068i.m2883g().setState(c1069j.f4863l).setTimeSinceCreatedMillis(jElapsedRealtime - c1069j.f4855d).build());
        }
        if (c0581m.f2090a.get(1028)) {
            C1066g c1066g2 = c1069j.f4853b;
            C1060a c1060a4 = (C1060a) sparseArray2.get(1028);
            c1060a4.getClass();
            c1066g2.m2841b(c1060a4);
        }
    }

    @Override // p166y1.InterfaceC2381f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C2383h c2383h = (C2383h) this.f4822h;
        c2383h.getClass();
        ArrayList arrayList = new ArrayList();
        C2174j c2174j = (C2174j) this.f4823i;
        Long lM4967b = C2383h.m4967b(sQLiteDatabase, c2174j);
        if (lM4967b != null) {
            C2383h.m4969g(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lM4967b.toString()}, null, null, null, String.valueOf(c2383h.f9973j.f9958b)), new C1911E(c2383h, arrayList, c2174j, 3));
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            sb.append(((C2377b) arrayList.get(i3)).f9962a);
            if (i3 < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j3 = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j3));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j3), hashSet);
                }
                hashSet.add(new C2382g(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            C2377b c2377b = (C2377b) listIterator.next();
            if (map.containsKey(Long.valueOf(c2377b.f9962a))) {
                C0475c c0475cM4758c = c2377b.f9964c.m4758c();
                long j4 = c2377b.f9962a;
                for (C2382g c2382g : (Set) map.get(Long.valueOf(j4))) {
                    c0475cM4758c.m1192a(c2382g.f9967a, c2382g.f9968b);
                }
                listIterator.set(new C2377b(j4, c2377b.f9963b, c0475cM4758c.m1194d()));
            }
        }
        return arrayList;
    }

    @Override // p064W.InterfaceC0636d
    /* JADX INFO: renamed from: b */
    public void mo545b(Object obj) {
        C0380q c0380q = (C0380q) this.f4822h;
        ((InterfaceC1913G) obj).mo2045y(c0380q.f1291h, (C1907A) c0380q.f1292i, (C1963w) this.f4823i);
    }

    @Override // p169z1.InterfaceC2390b
    /* JADX INFO: renamed from: e */
    public Object mo548e() {
        switch (this.f4821g) {
            case 5:
                C2383h c2383h = (C2383h) ((C2360i) this.f4822h).f9908c;
                c2383h.getClass();
                Iterable iterable = (Iterable) this.f4823i;
                if (iterable.iterator().hasNext()) {
                    c2383h.m4970a().compileStatement("DELETE FROM events WHERE _id in " + C2383h.m4968f(iterable)).execute();
                    break;
                }
                break;
            default:
                C2360i c2360i = (C2360i) this.f4822h;
                c2360i.getClass();
                for (Map.Entry entry : ((HashMap) this.f4823i).entrySet()) {
                    ((C2383h) c2360i.f9914i).m4972d(((Integer) entry.getValue()).intValue(), EnumC2299c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    @Override // p125n0.InterfaceC2037n
    /* JADX INFO: renamed from: f */
    public C1692X mo549f(int i3, C0559W c0559w, int[] iArr) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C0559W c0559w2 = c0559w;
        switch (this.f4821g) {
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                int i10 = ((int[]) this.f4823i)[i3];
                C2033j c2033j = (C2033j) this.f4822h;
                int i11 = c2033j.f2029e;
                if (i11 == Integer.MAX_VALUE || (i6 = c2033j.f2030f) == Integer.MAX_VALUE) {
                    i4 = Integer.MAX_VALUE;
                } else {
                    int i12 = Integer.MAX_VALUE;
                    for (int i13 = 0; i13 < c0559w2.f1992a; i13++) {
                        C0583o c0583o = c0559w2.f1995d[i13];
                        int i14 = c0583o.f2161u;
                        if (i14 > 0 && (i7 = c0583o.f2162v) > 0) {
                            if (!c2033j.f2031g) {
                                i8 = i11;
                                i9 = i6;
                            } else if ((i14 > i7) != (i11 > i6)) {
                                i9 = i11;
                                i8 = i6;
                            } else {
                                i8 = i11;
                                i9 = i6;
                            }
                            int i15 = i14 * i9;
                            int i16 = i7 * i8;
                            Point point = i15 >= i16 ? new Point(i8, AbstractC0632A.m1587f(i16, i14)) : new Point(AbstractC0632A.m1587f(i15, i7), i9);
                            int i17 = c0583o.f2161u;
                            int i18 = i17 * i7;
                            if (i17 >= ((int) (point.x * 0.98f)) && i7 >= ((int) (point.y * 0.98f)) && i18 < i12) {
                                i12 = i18;
                            }
                        }
                    }
                    i4 = i12;
                }
                C1673D c1673dM4116m = AbstractC1676G.m4116m();
                int i19 = 0;
                while (i19 < c0559w2.f1992a) {
                    C0583o c0583o2 = c0559w2.f1995d[i19];
                    int i20 = c0583o2.f2161u;
                    int i21 = (i20 == -1 || (i5 = c0583o2.f2162v) == -1) ? -1 : i20 * i5;
                    c1673dM4116m.m4102a(new C2039p(i3, c0559w2, i19, c2033j, iArr[i19], i10, i4 == Integer.MAX_VALUE || (i21 != -1 && i21 <= i4)));
                    i19++;
                    c0559w2 = c0559w;
                }
                return c1673dM4116m.m4112f();
            default:
                C1673D c1673dM4116m2 = AbstractC1676G.m4116m();
                for (int i22 = 0; i22 < c0559w2.f1992a; i22++) {
                    c1673dM4116m2.m4102a(new C2036m(i3, c0559w2, i22, (C2033j) this.f4822h, iArr[i22], (String) this.f4823i));
                }
                return c1673dM4116m2.m4112f();
        }
    }

    @Override // p064W.InterfaceC0642j
    /* JADX INFO: renamed from: g */
    public void mo214g(Object obj) {
        C1069j c1069j = (C1069j) obj;
        c1069j.getClass();
        C1060a c1060a = (C1060a) this.f4822h;
        C1907A c1907a = c1060a.f4814d;
        if (c1907a == null) {
            return;
        }
        C1963w c1963w = (C1963w) this.f4823i;
        C0583o c0583o = c1963w.f8586c;
        c0583o.getClass();
        c1907a.getClass();
        C0380q c0380q = new C0380q(c0583o, c1963w.f8587d, c1069j.f4853b.m2843d(c1060a.f4812b, c1907a), 2);
        int i3 = c1963w.f8585b;
        if (i3 != 0) {
            if (i3 == 1) {
                c1069j.f4867p = c0380q;
                return;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                c1069j.f4868q = c0380q;
                return;
            }
        }
        c1069j.f4866o = c0380q;
    }
}
