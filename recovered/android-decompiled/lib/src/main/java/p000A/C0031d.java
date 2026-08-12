package p000A;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C0858A;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.C0965p;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.AbstractC1339v;
import com.zuxoplayer.app.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import p009D0.C0106b;
import p011E.C0114g;
import p013E1.C0125H;
import p013E1.C0140o;
import p019G1.AbstractC0232g;
import p019G1.AbstractC0244s;
import p019G1.C0233h;
import p019G1.C0242q;
import p026J.C0290g;
import p028J1.C0296b;
import p028J1.C0300f;
import p028J1.C0319y;
import p028J1.InterfaceC0308n;
import p030K0.C0332c;
import p030K0.C0333d;
import p030K0.C0334e;
import p030K0.C0335f;
import p034L1.C0352g;
import p039N0.C0414j;
import p040N1.C0427h;
import p040N1.InterfaceC0430k;
import p045P0.AbstractC0462h;
import p045P0.InterfaceC0458d;
import p046P1.C0471D;
import p046P1.C0482j;
import p051R1.C0522a;
import p051R1.C0524c;
import p055T.AbstractC0545H;
import p055T.C0546I;
import p055T.C0567c;
import p055T.C0573f;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p075Z1.AbstractC0781b;
import p083b1.InterfaceC1085N;
import p085c0.C1120B;
import p085c0.C1133i;
import p085c0.RunnableC1131g;
import p097f2.C1560d;
import p124n.C2018e;
import p145s0.C2225D;
import p145s0.C2237j;
import p145s0.C2244q;

/* JADX INFO: renamed from: A.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0031d implements InterfaceC0033e, InterfaceC0037g, InterfaceC0430k, InterfaceC0308n, InterfaceC0458d, InterfaceC1085N {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f37g;

    /* JADX INFO: renamed from: h */
    public Object f38h;

    public /* synthetic */ C0031d(int i3, Object obj) {
        this.f37g = i3;
        this.f38h = obj;
    }

    /* JADX INFO: renamed from: A */
    public void m151A(int i3, long j3, long j4) throws C0546I {
        C0333d c0333d = (C0333d) this.f38h;
        AbstractC0646n.m1631i(c0333d.f1039d0);
        if (i3 == 160) {
            c0333d.f1024S = false;
            c0333d.f1025T = 0L;
            return;
        }
        if (i3 != 174) {
            if (i3 == 187) {
                c0333d.f1012G = false;
                return;
            }
            if (i3 == 19899) {
                c0333d.f1060y = -1;
                c0333d.f1061z = -1L;
                return;
            }
            if (i3 == 20533) {
                c0333d.m914d(i3);
                c0333d.f1058w.f981h = true;
                return;
            }
            if (i3 == 21968) {
                c0333d.m914d(i3);
                c0333d.f1058w.f998y = true;
                return;
            }
            if (i3 == 408125543) {
                long j5 = c0333d.f1054s;
                if (j5 != -1 && j5 != j3) {
                    throw C0546I.m1365a(null, "Multiple Segment elements not supported");
                }
                c0333d.f1054s = j3;
                c0333d.f1053r = j4;
                return;
            }
            if (i3 == 475249515) {
                c0333d.f1010E = new C0334e(2, (byte) 0);
                c0333d.f1011F = new C0334e(2, (byte) 0);
                return;
            } else {
                if (i3 == 524531317 && !c0333d.f1059x) {
                    if (c0333d.f1038d && c0333d.f1007B != -1) {
                        c0333d.f1006A = true;
                        return;
                    } else {
                        c0333d.f1039d0.mo333b(new C2244q(c0333d.f1057v));
                        c0333d.f1059x = true;
                        return;
                    }
                }
                return;
            }
        }
        C0332c c0332c = new C0332c();
        c0332c.f986m = -1;
        c0332c.f987n = -1;
        c0332c.f988o = -1;
        c0332c.f989p = -1;
        c0332c.f990q = -1;
        c0332c.f991r = 0;
        c0332c.f992s = -1;
        c0332c.f993t = 0.0f;
        c0332c.f994u = 0.0f;
        c0332c.f995v = 0.0f;
        c0332c.f996w = null;
        c0332c.f997x = -1;
        c0332c.f998y = false;
        c0332c.f999z = -1;
        c0332c.f948A = -1;
        c0332c.f949B = -1;
        c0332c.f950C = 1000;
        c0332c.f951D = 200;
        c0332c.f952E = -1.0f;
        c0332c.f953F = -1.0f;
        c0332c.f954G = -1.0f;
        c0332c.f955H = -1.0f;
        c0332c.f956I = -1.0f;
        c0332c.f957J = -1.0f;
        c0332c.f958K = -1.0f;
        c0332c.f959L = -1.0f;
        c0332c.f960M = -1.0f;
        c0332c.f961N = -1.0f;
        c0332c.f963P = 1;
        c0332c.f964Q = -1;
        c0332c.f965R = 8000;
        c0332c.f966S = 0L;
        c0332c.f967T = 0L;
        c0332c.f970W = true;
        c0332c.f971X = "eng";
        c0333d.f1058w = c0332c;
    }

    /* JADX INFO: renamed from: B */
    public void m152B() {
        C0233h c0233h = (C0233h) this.f38h;
        Iterator it = c0233h.f609h.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        Iterator it2 = c0233h.f610i.iterator();
        while (it2.hasNext()) {
            ((AbstractC0232g) it2.next()).mo650j();
        }
    }

    @Override // p000A.InterfaceC0037g
    /* JADX INFO: renamed from: a */
    public int mo153a() {
        return ((ContentInfo) this.f38h).getFlags();
    }

    @Override // p028J1.InterfaceC0308n
    /* JADX INFO: renamed from: b */
    public void mo154b(String str, long j3, int i3, C0352g c0352g, long j4, long j5) {
        int i4;
        AbstractC0244s abstractC0244s = (AbstractC0244s) this.f38h;
        try {
            i4 = i3;
            try {
                abstractC0244s.m3082I(new C0242q(new Status(i4, null, null, null), 2));
            } catch (IllegalStateException e3) {
                e = e3;
                C0296b c0296b = C0233h.f601l;
                Log.e(c0296b.f788a, c0296b.m833d("Result already set when calling onRequestCompleted", new Object[0]), e);
            }
        } catch (IllegalStateException e4) {
            e = e4;
            i4 = i3;
        }
        Iterator it = abstractC0244s.f637H.f610i.iterator();
        while (it.hasNext()) {
            ((AbstractC0232g) it.next()).mo655o(str, j3, i4, j4, j5);
            i4 = i3;
        }
    }

    @Override // p000A.InterfaceC0037g
    /* JADX INFO: renamed from: c */
    public ClipData mo155c() {
        return ((ContentInfo) this.f38h).getClip();
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: d */
    public int mo156d(long j3) {
        return j3 < 0 ? 0 : -1;
    }

    @Override // p000A.InterfaceC0033e
    /* JADX INFO: renamed from: e */
    public C0039h mo157e() {
        return new C0039h(new C0031d(((ContentInfo.Builder) this.f38h).build()));
    }

    @Override // p000A.InterfaceC0037g
    /* JADX INFO: renamed from: f */
    public ContentInfo mo158f() {
        return (ContentInfo) this.f38h;
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: g */
    public List mo159g(long j3) {
        return j3 >= 0 ? (List) this.f38h : Collections.EMPTY_LIST;
    }

    @Override // p000A.InterfaceC0033e
    /* JADX INFO: renamed from: h */
    public void mo160h(Bundle bundle) {
        ((ContentInfo.Builder) this.f38h).setExtras(bundle);
    }

    @Override // p000A.InterfaceC0033e
    /* JADX INFO: renamed from: i */
    public void mo161i(Uri uri) {
        ((ContentInfo.Builder) this.f38h).setLinkUri(uri);
    }

    @Override // p000A.InterfaceC0037g
    /* JADX INFO: renamed from: j */
    public int mo162j() {
        return ((ContentInfo) this.f38h).getSource();
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: k */
    public long mo163k(int i3) {
        AbstractC0646n.m1625c(i3 == 0);
        return 0L;
    }

    @Override // p028J1.InterfaceC0308n
    /* JADX INFO: renamed from: l */
    public void mo164l(String str, long j3, long j4, long j5) {
        AbstractC0244s abstractC0244s = (AbstractC0244s) this.f38h;
        try {
            abstractC0244s.m3082I(new C0242q(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e3) {
            C0296b c0296b = C0233h.f601l;
            Log.e(c0296b.f788a, c0296b.m833d("Result already set when calling onRequestReplaced", new Object[0]), e3);
        }
        Iterator it = abstractC0244s.f637H.f610i.iterator();
        while (it.hasNext()) {
            ((AbstractC0232g) it.next()).mo655o(str, j3, 2103, j4, j5);
        }
    }

    @Override // p040N1.InterfaceC0430k
    /* JADX INFO: renamed from: m */
    public void mo165m(Object obj, Object obj2) {
        switch (this.f37g) {
            case 5:
                C0319y c0319y = (C0319y) obj;
                C0300f c0300f = (C0300f) c0319y.m3090r();
                C0125H c0125h = (C0125H) this.f38h;
                Parcel parcelM1894e0 = c0300f.m1894e0();
                AbstractC1339v.m3422d(parcelM1894e0, c0125h.f188j);
                c0300f.m1897v0(parcelM1894e0, 18);
                C0300f c0300f2 = (C0300f) c0319y.m3090r();
                c0300f2.m1897v0(c0300f2.m1894e0(), 17);
                ((C1560d) obj2).m3879b(null);
                return;
            default:
                C1560d c1560d = (C1560d) obj2;
                C0522a c0522a = (C0522a) ((C0524c) obj).m3090r();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(c0522a.f3190d);
                int i3 = AbstractC0781b.f3191a;
                C0482j c0482j = (C0482j) this.f38h;
                if (c0482j == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    c0482j.writeToParcel(parcelObtain, 0);
                }
                try {
                    c0522a.f3189c.transact(1, parcelObtain, null, 1);
                    parcelObtain.recycle();
                    c1560d.m3879b(null);
                    return;
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
        }
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: n */
    public int mo166n() {
        return 1;
    }

    @Override // p000A.InterfaceC0033e
    /* JADX INFO: renamed from: o */
    public void mo167o(int i3) {
        ((ContentInfo.Builder) this.f38h).setFlags(i3);
    }

    /* JADX INFO: renamed from: p */
    public void m168p(int i3, boolean z3) {
        C0471D c0471d = (C0471D) this.f38h;
        if (z3) {
            c0471d.m1184a(i3);
        } else {
            c0471d.getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0295  */
    /* JADX INFO: renamed from: q */
    public void m169q(int i3, int i4, C2237j c2237j) throws C0546I {
        char c;
        char c2;
        long j3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C0333d c0333d = (C0333d) this.f38h;
        SparseArray sparseArray = c0333d.f1036c;
        int i10 = 0;
        int i11 = 1;
        if (i3 != 161 && i3 != 163) {
            if (i3 == 165) {
                if (c0333d.f1014I != 2) {
                    return;
                }
                C0332c c0332c = (C0332c) sparseArray.get(c0333d.f1020O);
                if (c0333d.f1023R != 4 || !"V_VP9".equals(c0332c.f975b)) {
                    c2237j.mo335d(i4);
                    return;
                }
                C0651s c0651s = c0333d.f1051p;
                c0651s.m1662D(i4);
                c2237j.mo336f(c0651s.f2520a, 0, i4, false);
                return;
            }
            if (i3 == 16877) {
                c0333d.m914d(i3);
                C0332c c0332c2 = c0333d.f1058w;
                int i12 = c0332c2.f980g;
                if (i12 != 1685485123 && i12 != 1685480259) {
                    c2237j.mo335d(i4);
                    return;
                }
                byte[] bArr = new byte[i4];
                c0332c2.f962O = bArr;
                c2237j.mo336f(bArr, 0, i4, false);
                return;
            }
            if (i3 == 16981) {
                c0333d.m914d(i3);
                byte[] bArr2 = new byte[i4];
                c0333d.f1058w.f982i = bArr2;
                c2237j.mo336f(bArr2, 0, i4, false);
                return;
            }
            if (i3 == 18402) {
                byte[] bArr3 = new byte[i4];
                c2237j.mo336f(bArr3, 0, i4, false);
                c0333d.m914d(i3);
                c0333d.f1058w.f983j = new C2225D(1, 0, 0, bArr3);
                return;
            }
            if (i3 == 21419) {
                C0651s c0651s2 = c0333d.f1046k;
                Arrays.fill(c0651s2.f2520a, (byte) 0);
                c2237j.mo336f(c0651s2.f2520a, 4 - i4, i4, false);
                c0651s2.m1665G(0);
                c0333d.f1060y = (int) c0651s2.m1689w();
                return;
            }
            if (i3 == 25506) {
                c0333d.m914d(i3);
                byte[] bArr4 = new byte[i4];
                c0333d.f1058w.f984k = bArr4;
                c2237j.mo336f(bArr4, 0, i4, false);
                return;
            }
            if (i3 != 30322) {
                throw C0546I.m1365a(null, "Unexpected id: " + i3);
            }
            c0333d.m914d(i3);
            byte[] bArr5 = new byte[i4];
            c0333d.f1058w.f996w = bArr5;
            c2237j.mo336f(bArr5, 0, i4, false);
            return;
        }
        int i13 = c0333d.f1014I;
        C0651s c0651s3 = c0333d.f1044i;
        if (i13 == 0) {
            C0335f c0335f = c0333d.f1034b;
            c0333d.f1020O = (int) c0335f.m937c(c2237j, false, true, 8);
            c0333d.f1021P = c0335f.f1067c;
            c0333d.f1016K = -9223372036854775807L;
            c0333d.f1014I = 1;
            c0651s3.m1662D(0);
        }
        C0332c c0332c3 = (C0332c) sparseArray.get(c0333d.f1020O);
        if (c0332c3 == null) {
            c2237j.mo335d(i4 - c0333d.f1021P);
            c0333d.f1014I = 0;
            return;
        }
        c0332c3.f972Y.getClass();
        if (c0333d.f1014I == 1) {
            c0333d.m916k(c2237j, 3);
            int i14 = (c0651s3.f2520a[2] & 6) >> 1;
            byte b3 = 255;
            if (i14 == 0) {
                c0333d.f1018M = 1;
                int[] iArr = c0333d.f1019N;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                c0333d.f1019N = iArr;
                iArr[0] = (i4 - c0333d.f1021P) - 3;
            } else {
                c0333d.m916k(c2237j, 4);
                int i15 = (c0651s3.f2520a[3] & 255) + 1;
                c0333d.f1018M = i15;
                int[] iArr2 = c0333d.f1019N;
                if (iArr2 == null) {
                    iArr2 = new int[i15];
                } else if (iArr2.length < i15) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i15)];
                }
                c0333d.f1019N = iArr2;
                if (i14 == 2) {
                    int i16 = (i4 - c0333d.f1021P) - 4;
                    int i17 = c0333d.f1018M;
                    Arrays.fill(iArr2, 0, i17, i16 / i17);
                } else {
                    if (i14 == 1) {
                        int i18 = 4;
                        int i19 = 0;
                        int i20 = 0;
                        while (true) {
                            i6 = c0333d.f1018M - 1;
                            if (i19 >= i6) {
                                break;
                            }
                            c0333d.f1019N[i19] = 0;
                            while (true) {
                                i7 = i18 + 1;
                                c0333d.m916k(c2237j, i7);
                                int i21 = c0651s3.f2520a[i18] & 255;
                                int[] iArr3 = c0333d.f1019N;
                                i8 = iArr3[i19] + i21;
                                iArr3[i19] = i8;
                                if (i21 != 255) {
                                    break;
                                } else {
                                    i18 = i7;
                                }
                            }
                            i20 += i8;
                            i19++;
                            i18 = i7;
                        }
                        c0333d.f1019N[i6] = ((i4 - c0333d.f1021P) - i18) - i20;
                    } else {
                        if (i14 != 3) {
                            throw C0546I.m1365a(null, "Unexpected lacing value: " + i14);
                        }
                        int i22 = 4;
                        int i23 = 0;
                        int i24 = 0;
                        while (true) {
                            int i25 = c0333d.f1018M - i11;
                            if (i23 >= i25) {
                                c = 1;
                                c2 = 0;
                                c0333d.f1019N[i25] = ((i4 - c0333d.f1021P) - i22) - i24;
                                break;
                            }
                            c0333d.f1019N[i23] = i10;
                            int i26 = i22 + 1;
                            c0333d.m916k(c2237j, i26);
                            if (c0651s3.f2520a[i22] == 0) {
                                throw C0546I.m1365a(null, "No valid varint length mask found");
                            }
                            int i27 = 0;
                            while (true) {
                                if (i27 >= 8) {
                                    j3 = 0;
                                    i5 = i26;
                                    break;
                                }
                                int i28 = 1 << (7 - i27);
                                if ((c0651s3.f2520a[i22] & i28) != 0) {
                                    i5 = i26 + i27;
                                    c0333d.m916k(c2237j, i5);
                                    j3 = c0651s3.f2520a[i22] & b3 & (~i28);
                                    while (i26 < i5) {
                                        j3 = (j3 << 8) | ((long) (c0651s3.f2520a[i26] & b3));
                                        i26++;
                                        b3 = 255;
                                    }
                                    if (i23 <= 0) {
                                        break;
                                    }
                                    j3 -= (1 << ((i27 * 7) + 6)) - 1;
                                    break;
                                }
                                i27++;
                                b3 = 255;
                            }
                            if (j3 < -2147483648L || j3 > 2147483647L) {
                                throw C0546I.m1365a(null, "EBML lacing sample size out of range.");
                            }
                            int i29 = (int) j3;
                            int[] iArr4 = c0333d.f1019N;
                            if (i23 != 0) {
                                i29 += iArr4[i23 - 1];
                            }
                            iArr4[i23] = i29;
                            i24 += i29;
                            i23++;
                            i22 = i5;
                            b3 = 255;
                            i10 = 0;
                            i11 = 1;
                        }
                    }
                    byte[] bArr6 = c0651s3.f2520a;
                    c0333d.f1015J = c0333d.m918n((bArr6[c] & 255) | (bArr6[c2] << 8)) + c0333d.f1009D;
                    if (c0332c3.f977d != 2 || (i3 == 163 && (c0651s3.f2520a[2] & 128) == 128)) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    c0333d.f1022Q = i9;
                    c0333d.f1014I = 2;
                    c0333d.f1017L = 0;
                }
            }
            c = 1;
            c2 = 0;
            byte[] bArr7 = c0651s3.f2520a;
            c0333d.f1015J = c0333d.m918n((bArr7[c] & 255) | (bArr7[c2] << 8)) + c0333d.f1009D;
            if (c0332c3.f977d != 2) {
                i9 = 1;
            } else {
                i9 = 1;
            }
            c0333d.f1022Q = i9;
            c0333d.f1014I = 2;
            c0333d.f1017L = 0;
        }
        if (i3 == 163) {
            while (true) {
                int i30 = c0333d.f1017L;
                if (i30 >= c0333d.f1018M) {
                    c0333d.f1014I = 0;
                    return;
                } else {
                    c0333d.m915g(c0332c3, c0333d.f1015J + ((long) ((c0333d.f1017L * c0332c3.f978e) / 1000)), c0333d.f1022Q, c0333d.m919o(c2237j, c0332c3, c0333d.f1019N[i30], false), 0);
                    c0333d.f1017L++;
                }
            }
        } else {
            while (true) {
                int i31 = c0333d.f1017L;
                if (i31 >= c0333d.f1018M) {
                    return;
                }
                int[] iArr5 = c0333d.f1019N;
                iArr5[i31] = c0333d.m919o(c2237j, c0332c3, iArr5[i31], true);
                c0333d.f1017L++;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public C0140o m170r() {
        C0140o c0140o = (C0140o) this.f38h;
        if (c0140o.f290g == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(c0140o.f293j) && c0140o.f293j < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(c0140o.f294k)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(c0140o.f295l) || c0140o.f295l < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return c0140o;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX INFO: renamed from: s */
    public String m171s(C0583o c0583o) {
        String displayName;
        Locale locale;
        String str = c0583o.f2144d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            if (AbstractC0632A.f2454a >= 24) {
                Locale.Category unused = Locale.Category.DISPLAY;
                locale = Locale.getDefault(Locale.Category.DISPLAY);
            } else {
                locale = Locale.getDefault();
            }
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused2) {
                }
            }
        }
        String strM175w = m175w(displayName, m172t(c0583o));
        if (!TextUtils.isEmpty(strM175w)) {
            return strM175w;
        }
        String str2 = c0583o.f2142b;
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    /* JADX INFO: renamed from: t */
    public String m172t(C0583o c0583o) {
        int i3 = c0583o.f2146f & 2;
        Resources resources = (Resources) this.f38h;
        String string = i3 != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        int i4 = c0583o.f2146f;
        if ((i4 & 4) != 0) {
            string = m175w(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i4 & 8) != 0) {
            string = m175w(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i4 & 1088) != 0 ? m175w(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public String toString() {
        switch (this.f37g) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.f38h) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX INFO: renamed from: u */
    public String m173u(C0583o c0583o) {
        String strM171s;
        String string;
        String strM1355c;
        int iM1359g = AbstractC0545H.m1359g(c0583o.f2154n);
        int i3 = c0583o.f2130C;
        int i4 = c0583o.f2162v;
        int i5 = c0583o.f2161u;
        if (iM1359g == -1) {
            String str = null;
            String str2 = c0583o.f2151k;
            if (str2 == null) {
                strM1355c = null;
                break;
            }
            String[] strArrM1580U = AbstractC0632A.m1580U(str2);
            int length = strArrM1580U.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    strM1355c = null;
                    break;
                }
                strM1355c = AbstractC0545H.m1355c(strArrM1580U[i6]);
                if (strM1355c != null && AbstractC0545H.m1363k(strM1355c)) {
                    break;
                }
                i6++;
            }
            if (strM1355c == null) {
                if (str2 != null) {
                    for (String str3 : AbstractC0632A.m1580U(str2)) {
                        String strM1355c2 = AbstractC0545H.m1355c(str3);
                        if (strM1355c2 != null && AbstractC0545H.m1360h(strM1355c2)) {
                            str = strM1355c2;
                            break;
                        }
                    }
                }
                if (str != null) {
                    iM1359g = 1;
                } else if (i5 != -1 || i4 != -1) {
                    iM1359g = 2;
                } else if (i3 == -1 && c0583o.f2131D == -1) {
                    iM1359g = -1;
                } else {
                    iM1359g = 1;
                }
            } else {
                iM1359g = 2;
            }
        }
        Resources resources = (Resources) this.f38h;
        int i7 = c0583o.f2150j;
        if (iM1359g == 2) {
            strM171s = m175w(m172t(c0583o), (i5 == -1 || i4 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i5), Integer.valueOf(i4)), i7 != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i7 / 1000000.0f)) : "");
        } else if (iM1359g == 1) {
            String strM171s2 = m171s(c0583o);
            if (i3 == -1 || i3 < 1) {
                string = "";
            } else if (i3 == 1) {
                string = resources.getString(R.string.exo_track_mono);
            } else if (i3 == 2) {
                string = resources.getString(R.string.exo_track_stereo);
            } else if (i3 == 6 || i3 == 7) {
                string = resources.getString(R.string.exo_track_surround_5_point_1);
            } else {
                string = i3 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
            }
            strM171s = m175w(strM171s2, string, i7 != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i7 / 1000000.0f)) : "");
        } else {
            strM171s = m171s(c0583o);
        }
        if (strM171s.length() != 0) {
            return strM171s;
        }
        String str4 = c0583o.f2144d;
        return (str4 == null || str4.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str4);
    }

    /* JADX INFO: renamed from: v */
    public void m174v(int i3, long j3) throws C0546I {
        C0333d c0333d = (C0333d) this.f38h;
        c0333d.getClass();
        if (i3 == 20529) {
            if (j3 == 0) {
                return;
            }
            throw C0546I.m1365a(null, "ContentEncodingOrder " + j3 + " not supported");
        }
        if (i3 == 20530) {
            if (j3 == 1) {
                return;
            }
            throw C0546I.m1365a(null, "ContentEncodingScope " + j3 + " not supported");
        }
        switch (i3) {
            case 131:
                c0333d.m914d(i3);
                c0333d.f1058w.f977d = (int) j3;
                return;
            case 136:
                c0333d.m914d(i3);
                c0333d.f1058w.f970W = j3 == 1;
                return;
            case 155:
                c0333d.f1016K = c0333d.m918n(j3);
                return;
            case 159:
                c0333d.m914d(i3);
                c0333d.f1058w.f963P = (int) j3;
                return;
            case 176:
                c0333d.m914d(i3);
                c0333d.f1058w.f986m = (int) j3;
                return;
            case 179:
                c0333d.m913b(i3);
                c0333d.f1010E.m922b(c0333d.m918n(j3));
                return;
            case 186:
                c0333d.m914d(i3);
                c0333d.f1058w.f987n = (int) j3;
                return;
            case 215:
                c0333d.m914d(i3);
                c0333d.f1058w.f976c = (int) j3;
                return;
            case 231:
                c0333d.f1009D = c0333d.m918n(j3);
                return;
            case 238:
                c0333d.f1023R = (int) j3;
                return;
            case 241:
                if (c0333d.f1012G) {
                    return;
                }
                c0333d.m913b(i3);
                c0333d.f1011F.m922b(j3);
                c0333d.f1012G = true;
                return;
            case 251:
                c0333d.f1024S = true;
                return;
            case 16871:
                c0333d.m914d(i3);
                c0333d.f1058w.f980g = (int) j3;
                return;
            case 16980:
                if (j3 == 3) {
                    return;
                }
                throw C0546I.m1365a(null, "ContentCompAlgo " + j3 + " not supported");
            case 17029:
                if (j3 < 1 || j3 > 2) {
                    throw C0546I.m1365a(null, "DocTypeReadVersion " + j3 + " not supported");
                }
                return;
            case 17143:
                if (j3 == 1) {
                    return;
                }
                throw C0546I.m1365a(null, "EBMLReadVersion " + j3 + " not supported");
            case 18401:
                if (j3 == 5) {
                    return;
                }
                throw C0546I.m1365a(null, "ContentEncAlgo " + j3 + " not supported");
            case 18408:
                if (j3 == 1) {
                    return;
                }
                throw C0546I.m1365a(null, "AESSettingsCipherMode " + j3 + " not supported");
            case 21420:
                c0333d.f1061z = j3 + c0333d.f1054s;
                return;
            case 21432:
                int i4 = (int) j3;
                c0333d.m914d(i3);
                if (i4 == 0) {
                    c0333d.f1058w.f997x = 0;
                    return;
                }
                if (i4 == 1) {
                    c0333d.f1058w.f997x = 2;
                    return;
                } else if (i4 == 3) {
                    c0333d.f1058w.f997x = 1;
                    return;
                } else {
                    if (i4 != 15) {
                        return;
                    }
                    c0333d.f1058w.f997x = 3;
                    return;
                }
            case 21680:
                c0333d.m914d(i3);
                c0333d.f1058w.f989p = (int) j3;
                return;
            case 21682:
                c0333d.m914d(i3);
                c0333d.f1058w.f991r = (int) j3;
                return;
            case 21690:
                c0333d.m914d(i3);
                c0333d.f1058w.f990q = (int) j3;
                return;
            case 21930:
                c0333d.m914d(i3);
                c0333d.f1058w.f969V = j3 == 1;
                return;
            case 21938:
                c0333d.m914d(i3);
                C0332c c0332c = c0333d.f1058w;
                c0332c.f998y = true;
                c0332c.f988o = (int) j3;
                return;
            case 21998:
                c0333d.m914d(i3);
                c0333d.f1058w.f979f = (int) j3;
                return;
            case 22186:
                c0333d.m914d(i3);
                c0333d.f1058w.f966S = j3;
                return;
            case 22203:
                c0333d.m914d(i3);
                c0333d.f1058w.f967T = j3;
                return;
            case 25188:
                c0333d.m914d(i3);
                c0333d.f1058w.f964Q = (int) j3;
                return;
            case 30114:
                c0333d.f1025T = j3;
                return;
            case 30321:
                c0333d.m914d(i3);
                int i5 = (int) j3;
                if (i5 == 0) {
                    c0333d.f1058w.f992s = 0;
                    return;
                }
                if (i5 == 1) {
                    c0333d.f1058w.f992s = 1;
                    return;
                } else if (i5 == 2) {
                    c0333d.f1058w.f992s = 2;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    c0333d.f1058w.f992s = 3;
                    return;
                }
            case 2352003:
                c0333d.m914d(i3);
                c0333d.f1058w.f978e = (int) j3;
                return;
            case 2807729:
                c0333d.f1055t = j3;
                return;
            default:
                switch (i3) {
                    case 21945:
                        c0333d.m914d(i3);
                        int i6 = (int) j3;
                        if (i6 == 1) {
                            c0333d.f1058w.f949B = 2;
                            return;
                        } else {
                            if (i6 != 2) {
                                return;
                            }
                            c0333d.f1058w.f949B = 1;
                            return;
                        }
                    case 21946:
                        c0333d.m914d(i3);
                        int iM1440g = C0573f.m1440g((int) j3);
                        if (iM1440g != -1) {
                            c0333d.f1058w.f948A = iM1440g;
                            return;
                        }
                        return;
                    case 21947:
                        c0333d.m914d(i3);
                        c0333d.f1058w.f998y = true;
                        int iM1439f = C0573f.m1439f((int) j3);
                        if (iM1439f != -1) {
                            c0333d.f1058w.f999z = iM1439f;
                            return;
                        }
                        return;
                    case 21948:
                        c0333d.m914d(i3);
                        c0333d.f1058w.f950C = (int) j3;
                        return;
                    case 21949:
                        c0333d.m914d(i3);
                        c0333d.f1058w.f951D = (int) j3;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX INFO: renamed from: w */
    public String m175w(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.f38h).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: x */
    public void m176x() {
        ((C0965p) this.f38h).f4251x.m2442L();
    }

    /* JADX INFO: renamed from: y */
    public void m177y(Exception exc) {
        AbstractC0646n.m1636n("MediaCodecAudioRenderer", "Audio sink error", exc);
        C1133i c1133i = ((C1120B) this.f38h).f5180J0;
        Handler handler = c1133i.f5252b;
        if (handler != null) {
            handler.post(new RunnableC1131g(c1133i, exc, 4));
        }
    }

    /* JADX INFO: renamed from: z */
    public void m178z(String str, String str2) {
        C2018e c2018e = MediaMetadataCompat.f3627j;
        if (c2018e.containsKey(str) && ((Integer) c2018e.getOrDefault(str, null)).intValue() != 1) {
            throw new IllegalArgumentException(AbstractC0462h.m1166f("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f38h).putCharSequence(str, str2);
    }

    public C0031d(C0414j c0414j, C0427h c0427h) {
        this.f37g = 15;
        this.f38h = c0414j;
    }

    public C0031d(MediaInfo mediaInfo) {
        this.f37g = 4;
        C0140o c0140o = new C0140o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f38h = c0140o;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public C0031d(JSONObject jSONObject) {
        this.f37g = 4;
        this.f38h = new C0140o(jSONObject);
    }

    public C0031d(Resources resources) {
        this.f37g = 25;
        resources.getClass();
        this.f38h = resources;
    }

    public C0031d(C0567c c0567c) {
        this.f37g = 19;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        c0567c.getClass();
        AudioAttributes.Builder usage = builder.setContentType(0).setFlags(0).setUsage(1);
        int i3 = AbstractC0632A.f2454a;
        if (i3 >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (i3 >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.f38h = usage.build();
    }

    public C0031d(TextView textView) {
        this.f37g = 10;
        this.f38h = new C0290g(textView);
    }

    public C0031d(EditText editText) {
        this.f37g = 9;
        this.f38h = new C0106b(editText);
    }

    public C0031d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f37g = 3;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f38h = new C0114g(uri, clipDescription, uri2);
        } else {
            this.f38h = new C0858A(uri, clipDescription, uri2, 2);
        }
    }

    public C0031d(ContentInfo contentInfo) {
        this.f37g = 1;
        contentInfo.getClass();
        this.f38h = AbstractC0029c.m137m(contentInfo);
    }

    public C0031d(int i3) {
        this.f37g = i3;
        switch (i3) {
            case 21:
                this.f38h = new Bundle();
                break;
            case 26:
                break;
            default:
                this.f38h = new C0471D();
                break;
        }
    }

    public C0031d(ClipData clipData, int i3) {
        this.f37g = 0;
        this.f38h = AbstractC0029c.m135k(clipData, i3);
    }

    public C0031d(MediaMetadataCompat mediaMetadataCompat) {
        this.f37g = 21;
        Bundle bundle = new Bundle(mediaMetadataCompat.f3631g);
        this.f38h = bundle;
        C0858A.m2152x(bundle);
    }
}
