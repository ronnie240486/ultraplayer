package p129o0;

import java.util.ArrayList;
import java.util.Collections;
import p048Q0.C0505d;

/* JADX INFO: renamed from: o0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2078r {

    /* JADX INFO: renamed from: h */
    public static final C0505d f9021h = new C0505d(13);

    /* JADX INFO: renamed from: i */
    public static final C0505d f9022i = new C0505d(14);

    /* JADX INFO: renamed from: a */
    public final int f9023a;

    /* JADX INFO: renamed from: e */
    public int f9027e;

    /* JADX INFO: renamed from: f */
    public int f9028f;

    /* JADX INFO: renamed from: g */
    public int f9029g;

    /* JADX INFO: renamed from: c */
    public final C2077q[] f9025c = new C2077q[5];

    /* JADX INFO: renamed from: b */
    public final ArrayList f9024b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public int f9026d = -1;

    public C2078r(int i3) {
        this.f9023a = i3;
    }

    /* JADX INFO: renamed from: a */
    public final void m4640a(int i3, float f) {
        C2077q c2077q;
        int i4 = this.f9026d;
        ArrayList arrayList = this.f9024b;
        if (i4 != 1) {
            Collections.sort(arrayList, f9021h);
            this.f9026d = 1;
        }
        int i5 = this.f9029g;
        C2077q[] c2077qArr = this.f9025c;
        if (i5 > 0) {
            int i6 = i5 - 1;
            this.f9029g = i6;
            c2077q = c2077qArr[i6];
        } else {
            c2077q = new C2077q();
        }
        int i7 = this.f9027e;
        this.f9027e = i7 + 1;
        c2077q.f9018a = i7;
        c2077q.f9019b = i3;
        c2077q.f9020c = f;
        arrayList.add(c2077q);
        this.f9028f += i3;
        while (true) {
            int i8 = this.f9028f;
            int i9 = this.f9023a;
            if (i8 <= i9) {
                return;
            }
            int i10 = i8 - i9;
            C2077q c2077q2 = (C2077q) arrayList.get(0);
            int i11 = c2077q2.f9019b;
            if (i11 <= i10) {
                this.f9028f -= i11;
                arrayList.remove(0);
                int i12 = this.f9029g;
                if (i12 < 5) {
                    this.f9029g = i12 + 1;
                    c2077qArr[i12] = c2077q2;
                }
            } else {
                c2077q2.f9019b = i11 - i10;
                this.f9028f -= i10;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m4641b() {
        int i3 = this.f9026d;
        ArrayList arrayList = this.f9024b;
        if (i3 != 0) {
            Collections.sort(arrayList, f9022i);
            this.f9026d = 0;
        }
        float f = 0.5f * this.f9028f;
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            C2077q c2077q = (C2077q) arrayList.get(i5);
            i4 += c2077q.f9019b;
            if (i4 >= f) {
                return c2077q.f9020c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C2077q) arrayList.get(arrayList.size() - 1)).f9020c;
    }
}
