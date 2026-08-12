package p056T0;

import android.text.TextUtils;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: T0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0595a {

    /* JADX INFO: renamed from: a */
    public int f2206a;

    /* JADX INFO: renamed from: b */
    public int f2207b;

    /* JADX INFO: renamed from: c */
    public int f2208c;

    /* JADX INFO: renamed from: d */
    public int f2209d;

    /* JADX INFO: renamed from: e */
    public int f2210e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    /* JADX INFO: renamed from: b */
    public static C0595a m1455b(String str) {
        AbstractC0646n.m1625c(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        for (int i7 = 0; i7 < strArrSplit.length; i7++) {
            String strM3288K = AbstractC1303m.m3288K(strArrSplit[i7].trim());
            strM3288K.getClass();
            switch (strM3288K) {
                case "end":
                    i4 = i7;
                    break;
                case "text":
                    i5 = i7;
                    break;
                case "start":
                    i3 = i7;
                    break;
                case "style":
                    i6 = i7;
                    break;
            }
        }
        if (i3 == -1 || i4 == -1 || i5 == -1) {
            return null;
        }
        int length = strArrSplit.length;
        C0595a c0595a = new C0595a();
        c0595a.f2206a = i3;
        c0595a.f2207b = i4;
        c0595a.f2208c = i6;
        c0595a.f2209d = i5;
        c0595a.f2210e = length;
        return c0595a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1456a() {
        int i3;
        int i4;
        int i5;
        int i6 = this.f2206a;
        int i7 = 2;
        if ((i6 & 7) != 0) {
            int i8 = this.f2209d;
            int i9 = this.f2207b;
            if (i8 > i9) {
                i5 = 1;
            } else {
                i5 = i8 == i9 ? 2 : 4;
            }
            if ((i5 & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 112) != 0) {
            int i10 = this.f2209d;
            int i11 = this.f2208c;
            if (i10 > i11) {
                i4 = 1;
            } else {
                i4 = i10 == i11 ? 2 : 4;
            }
            if (((i4 << 4) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 1792) != 0) {
            int i12 = this.f2210e;
            int i13 = this.f2207b;
            if (i12 > i13) {
                i3 = 1;
            } else {
                i3 = i12 == i13 ? 2 : 4;
            }
            if (((i3 << 8) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 28672) != 0) {
            int i14 = this.f2210e;
            int i15 = this.f2208c;
            if (i14 > i15) {
                i7 = 1;
            } else if (i14 != i15) {
                i7 = 4;
            }
            if ((i6 & (i7 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
