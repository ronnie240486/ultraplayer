package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import p019G1.AbstractC0230e;
import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.Y1 */
/* JADX INFO: loaded from: classes.dex */
public class C1250Y1 implements Iterable, Serializable {

    /* JADX INFO: renamed from: i */
    public static final C1250Y1 f5743i = new C1250Y1(AbstractC1306m2.f5928b);

    /* JADX INFO: renamed from: g */
    public int f5744g = 0;

    /* JADX INFO: renamed from: h */
    public final byte[] f5745h;

    static {
        int i3 = AbstractC1238V1.f5721a;
    }

    public C1250Y1(byte[] bArr) {
        bArr.getClass();
        this.f5745h = bArr;
    }

    /* JADX INFO: renamed from: i */
    public static void m3218i(int i3) {
        if (((i3 - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(AbstractC0462h.m1165e(i3, "End index: 47 >= "));
        }
    }

    /* JADX INFO: renamed from: e */
    public byte mo3213e(int i3) {
        return this.f5745h[i3];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C1250Y1) && mo3215h() == ((C1250Y1) obj).mo3215h()) {
            if (mo3215h() == 0) {
                return true;
            }
            if (!(obj instanceof C1250Y1)) {
                return obj.equals(this);
            }
            C1250Y1 c1250y1 = (C1250Y1) obj;
            int i3 = this.f5744g;
            int i4 = c1250y1.f5744g;
            if (i3 == 0 || i4 == 0 || i3 == i4) {
                int iMo3215h = mo3215h();
                if (iMo3215h > c1250y1.mo3215h()) {
                    throw new IllegalArgumentException("Length too large: " + iMo3215h + mo3215h());
                }
                if (iMo3215h > c1250y1.mo3215h()) {
                    throw new IllegalArgumentException("Ran off end of other: 0, " + iMo3215h + ", " + c1250y1.mo3215h());
                }
                int i5 = 0;
                int i6 = 0;
                while (i5 < iMo3215h) {
                    if (this.f5745h[i5] == c1250y1.f5745h[i6]) {
                        i5++;
                        i6++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public byte mo3214g(int i3) {
        return this.f5745h[i3];
    }

    /* JADX INFO: renamed from: h */
    public int mo3215h() {
        return this.f5745h.length;
    }

    public final int hashCode() {
        int i3 = this.f5744g;
        if (i3 != 0) {
            return i3;
        }
        int iMo3215h = mo3215h();
        Charset charset = AbstractC1306m2.f5927a;
        int i4 = iMo3215h;
        for (int i5 = 0; i5 < iMo3215h; i5++) {
            i4 = (i4 * 31) + this.f5745h[i5];
        }
        int i6 = i4 != 0 ? i4 : 1;
        this.f5744g = i6;
        return i6;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C1242W1(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo3215h = mo3215h();
        if (mo3215h() <= 50) {
            strConcat = AbstractC0230e.m725B(this);
        } else {
            m3218i(mo3215h());
            strConcat = AbstractC0230e.m725B(new C1246X1(this.f5745h)).concat("...");
        }
        return "<ByteString@" + hexString + " size=" + iMo3215h + " contents=\"" + strConcat + "\">";
    }
}
