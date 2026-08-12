package p145s0;

import com.google.android.gms.internal.cast.C1323r;
import java.util.Collections;
import p048Q0.C0508g;
import p055T.AbstractC0545H;
import p055T.C0544G;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: s0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2245r {

    /* JADX INFO: renamed from: a */
    public final int f9645a;

    /* JADX INFO: renamed from: b */
    public final int f9646b;

    /* JADX INFO: renamed from: c */
    public final int f9647c;

    /* JADX INFO: renamed from: d */
    public final int f9648d;

    /* JADX INFO: renamed from: e */
    public final int f9649e;

    /* JADX INFO: renamed from: f */
    public final int f9650f;

    /* JADX INFO: renamed from: g */
    public final int f9651g;

    /* JADX INFO: renamed from: h */
    public final int f9652h;

    /* JADX INFO: renamed from: i */
    public final int f9653i;

    /* JADX INFO: renamed from: j */
    public final long f9654j;

    /* JADX INFO: renamed from: k */
    public final C1323r f9655k;

    /* JADX INFO: renamed from: l */
    public final C0544G f9656l;

    public C2245r(byte[] bArr, int i3) {
        C0508g c0508g = new C0508g(bArr, bArr.length);
        c0508g.m1260q(i3 * 8);
        this.f9645a = c0508g.m1252i(16);
        this.f9646b = c0508g.m1252i(16);
        this.f9647c = c0508g.m1252i(24);
        this.f9648d = c0508g.m1252i(24);
        int iM1252i = c0508g.m1252i(20);
        this.f9649e = iM1252i;
        this.f9650f = m4839d(iM1252i);
        this.f9651g = c0508g.m1252i(3) + 1;
        int iM1252i2 = c0508g.m1252i(5) + 1;
        this.f9652h = iM1252i2;
        this.f9653i = m4838a(iM1252i2);
        this.f9654j = c0508g.m1254k(36);
        this.f9655k = null;
        this.f9656l = null;
    }

    /* JADX INFO: renamed from: a */
    public static int m4838a(int i3) {
        if (i3 == 8) {
            return 1;
        }
        if (i3 == 12) {
            return 2;
        }
        if (i3 == 16) {
            return 4;
        }
        if (i3 != 20) {
            return i3 != 24 ? -1 : 6;
        }
        return 5;
    }

    /* JADX INFO: renamed from: d */
    public static int m4839d(int i3) {
        switch (i3) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m4840b() {
        long j3 = this.f9654j;
        if (j3 == 0) {
            return -9223372036854775807L;
        }
        return (j3 * 1000000) / ((long) this.f9649e);
    }

    /* JADX INFO: renamed from: c */
    public final C0583o m4841c(byte[] bArr, C0544G c0544g) {
        bArr[4] = -128;
        int i3 = this.f9648d;
        if (i3 <= 0) {
            i3 = -1;
        }
        C0544G c0544g2 = this.f9656l;
        if (c0544g2 != null) {
            c0544g = c0544g2.m1352e(c0544g);
        }
        C0582n c0582n = new C0582n();
        c0582n.f2114m = AbstractC0545H.m1364l("audio/flac");
        c0582n.f2115n = i3;
        c0582n.f2092B = this.f9651g;
        c0582n.f2093C = this.f9649e;
        c0582n.f2094D = AbstractC0632A.m1605x(this.f9652h);
        c0582n.f2117p = Collections.singletonList(bArr);
        c0582n.f2112k = c0544g;
        return new C0583o(c0582n);
    }

    public C2245r(int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j3, C1323r c1323r, C0544G c0544g) {
        this.f9645a = i3;
        this.f9646b = i4;
        this.f9647c = i5;
        this.f9648d = i6;
        this.f9649e = i7;
        this.f9650f = m4839d(i7);
        this.f9651g = i8;
        this.f9652h = i9;
        this.f9653i = m4838a(i9);
        this.f9654j = j3;
        this.f9655k = c1323r;
        this.f9656l = c0544g;
    }
}
