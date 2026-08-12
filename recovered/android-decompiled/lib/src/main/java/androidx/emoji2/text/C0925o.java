package androidx.emoji2.text;

import android.graphics.Bitmap;
import android.media.VolumeProvider;
import android.os.Build;
import android.support.v4.media.session.C0858A;
import android.util.SparseBooleanArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p023I.C0269a;
import p044P.C0452d;
import p044P.C0453e;
import p093e1.C1518c;
import p093e1.C1519d;
import p093e1.C1520e;
import p093e1.C1521f;
import p093e1.C1522g;

/* JADX INFO: renamed from: androidx.emoji2.text.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0925o {

    /* JADX INFO: renamed from: a */
    public int f4017a;

    /* JADX INFO: renamed from: b */
    public int f4018b;

    /* JADX INFO: renamed from: c */
    public int f4019c;

    /* JADX INFO: renamed from: d */
    public final Object f4020d;

    /* JADX INFO: renamed from: e */
    public Object f4021e;

    /* JADX INFO: renamed from: f */
    public Object f4022f;

    public C0925o(C0858A c0858a, int i3, int i4, int i5, String str) {
        this.f4022f = c0858a;
        this.f4017a = i3;
        this.f4018b = i4;
        this.f4019c = i5;
        this.f4020d = str;
    }

    /* JADX INFO: renamed from: a */
    public C1521f m2413a() {
        int iMax;
        int i3;
        Bitmap bitmap = (Bitmap) this.f4020d;
        if (bitmap == null) {
            throw new AssertionError();
        }
        int i4 = this.f4018b;
        double dSqrt = -1.0d;
        if (i4 > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > i4) {
                dSqrt = Math.sqrt(((double) i4) / ((double) height));
            }
        } else {
            int i5 = this.f4019c;
            if (i5 > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i5) {
                dSqrt = ((double) i5) / ((double) iMax);
            }
        }
        Bitmap bitmapCreateScaledBitmap = dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        int width = bitmapCreateScaledBitmap.getWidth();
        int height2 = bitmapCreateScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        bitmapCreateScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        int i6 = this.f4017a;
        ArrayList arrayList = (ArrayList) this.f4022f;
        C1518c c1518c = new C1518c(iArr, i6, arrayList.isEmpty() ? null : (C1519d[]) arrayList.toArray(new C1519d[arrayList.size()]));
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        ArrayList arrayList2 = c1518c.f6850c;
        ArrayList arrayList3 = (ArrayList) this.f4021e;
        C1521f c1521f = new C1521f(arrayList2, arrayList3);
        int size = arrayList3.size();
        int i7 = 0;
        while (true) {
            SparseBooleanArray sparseBooleanArray = c1521f.f6865c;
            if (i7 >= size) {
                sparseBooleanArray.clear();
                return c1521f;
            }
            C1522g c1522g = (C1522g) arrayList3.get(i7);
            float[] fArr = c1522g.f6875c;
            float f = 0.0f;
            for (float f3 : fArr) {
                if (f3 > 0.0f) {
                    f += f3;
                }
            }
            if (f != 0.0f) {
                int length = fArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    float f4 = fArr[i8];
                    if (f4 > 0.0f) {
                        fArr[i8] = f4 / f;
                    }
                }
            }
            ArrayList arrayList4 = c1521f.f6863a;
            int size2 = arrayList4.size();
            int i9 = 0;
            C1520e c1520e = null;
            float f5 = 0.0f;
            while (i9 < size2) {
                C1520e c1520e2 = (C1520e) arrayList4.get(i9);
                float[] fArrM3816b = c1520e2.m3816b();
                float f6 = fArrM3816b[1];
                float[] fArr2 = c1522g.f6873a;
                if (f6 < fArr2[0] || f6 > fArr2[2]) {
                    i3 = size;
                } else {
                    float f7 = fArrM3816b[2];
                    float[] fArr3 = c1522g.f6874b;
                    if (f7 < fArr3[0] || f7 > fArr3[2] || sparseBooleanArray.get(c1520e2.f6856d)) {
                        i3 = size;
                    } else {
                        float[] fArrM3816b2 = c1520e2.m3816b();
                        C1520e c1520e3 = c1521f.f6866d;
                        int i10 = c1520e3 != null ? c1520e3.f6857e : 1;
                        i3 = size;
                        float[] fArr4 = c1522g.f6875c;
                        float f8 = fArr4[0];
                        float fAbs = f8 > 0.0f ? (1.0f - Math.abs(fArrM3816b2[1] - fArr2[1])) * f8 : 0.0f;
                        float f9 = fArr4[1];
                        float fAbs2 = f9 > 0.0f ? (1.0f - Math.abs(fArrM3816b2[2] - fArr3[1])) * f9 : 0.0f;
                        float f10 = fArr4[2];
                        float f11 = fAbs + fAbs2 + (f10 > 0.0f ? (c1520e2.f6857e / i10) * f10 : 0.0f);
                        if (c1520e == null || f11 > f5) {
                            c1520e = c1520e2;
                            f5 = f11;
                        }
                    }
                }
                i9++;
                size = i3;
            }
            int i11 = size;
            if (c1520e != null) {
                sparseBooleanArray.append(c1520e.f6856d, true);
            }
            c1521f.f6864b.put(c1522g, c1520e);
            i7++;
            size = i11;
        }
    }

    /* JADX INFO: renamed from: b */
    public VolumeProvider m2414b() {
        C0925o c0925o;
        if (((VolumeProvider) this.f4021e) != null) {
            c0925o = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            c0925o = this;
            c0925o.f4021e = new C0452d(c0925o, this.f4017a, this.f4018b, this.f4019c, (String) this.f4020d);
        } else {
            c0925o = this;
            c0925o.f4021e = new C0453e(this, c0925o.f4017a, c0925o.f4018b, c0925o.f4019c);
        }
        return (VolumeProvider) c0925o.f4021e;
    }

    /* JADX INFO: renamed from: c */
    public void m2415c() {
        this.f4017a = 1;
        this.f4021e = (C0928r) this.f4020d;
        this.f4019c = 0;
    }

    /* JADX INFO: renamed from: d */
    public boolean m2416d() {
        C0269a c0269aM2427b = ((C0928r) this.f4021e).f4033b.m2427b();
        int iM3a = c0269aM2427b.m3a(6);
        return !(iM3a == 0 || ((ByteBuffer) c0269aM2427b.f5d).get(iM3a + c0269aM2427b.f2a) == 0) || this.f4018b == 65039;
    }

    public C0925o(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.f4021e = arrayList;
        this.f4017a = 16;
        this.f4018b = 12544;
        this.f4019c = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f4022f = arrayList2;
        if (!bitmap.isRecycled()) {
            arrayList2.add(C1521f.f6862e);
            this.f4020d = bitmap;
            arrayList.add(C1522g.f6867d);
            arrayList.add(C1522g.f6868e);
            arrayList.add(C1522g.f6869f);
            arrayList.add(C1522g.f6870g);
            arrayList.add(C1522g.f6871h);
            arrayList.add(C1522g.f6872i);
            return;
        }
        throw new IllegalArgumentException("Bitmap is not valid");
    }

    public C0925o(C0928r c0928r) {
        this.f4017a = 1;
        this.f4020d = c0928r;
        this.f4021e = c0928r;
    }
}
