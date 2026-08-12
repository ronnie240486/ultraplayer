package p093e1;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import p148t.AbstractC2262a;

/* JADX INFO: renamed from: e1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1518c {

    /* JADX INFO: renamed from: f */
    public static final C1516a f6847f = new C1516a(0);

    /* JADX INFO: renamed from: a */
    public final int[] f6848a;

    /* JADX INFO: renamed from: b */
    public final int[] f6849b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f6850c;

    /* JADX INFO: renamed from: d */
    public final C1519d[] f6851d;

    /* JADX INFO: renamed from: e */
    public final float[] f6852e = new float[3];

    public C1518c(int[] iArr, int i3, C1519d[] c1519dArr) {
        C1517b c1517b;
        int i4 = 1;
        this.f6851d = c1519dArr;
        int[] iArr2 = new int[32768];
        this.f6849b = iArr2;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            int iM3813b = m3813b(Color.blue(i6), 8, 5) | (m3813b(Color.red(i6), 8, 5) << 10) | (m3813b(Color.green(i6), 8, 5) << 5);
            iArr[i5] = iM3813b;
            iArr2[iM3813b] = iArr2[iM3813b] + 1;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                int iRgb = Color.rgb(m3813b((i8 >> 10) & 31, 5, 8), m3813b((i8 >> 5) & 31, 5, 8), m3813b(i8 & 31, 5, 8));
                ThreadLocal threadLocal = AbstractC2262a.f9696a;
                int iRed = Color.red(iRgb);
                int iGreen = Color.green(iRgb);
                int iBlue = Color.blue(iRgb);
                float[] fArr = this.f6852e;
                AbstractC2262a.m4853a(iRed, iGreen, iBlue, fArr);
                if (m3814c(fArr)) {
                    iArr2[i8] = 0;
                }
            }
            if (iArr2[i8] > 0) {
                i7++;
            }
        }
        int[] iArr3 = new int[i7];
        this.f6848a = iArr3;
        int i9 = 0;
        for (int i10 = 0; i10 < 32768; i10++) {
            if (iArr2[i10] > 0) {
                iArr3[i9] = i10;
                i9++;
            }
        }
        if (i7 <= i3) {
            this.f6850c = new ArrayList();
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = iArr3[i11];
                this.f6850c.add(new C1520e(Color.rgb(m3813b((i12 >> 10) & 31, 5, 8), m3813b((i12 >> 5) & 31, 5, 8), m3813b(i12 & 31, 5, 8)), iArr2[i12]));
            }
            return;
        }
        PriorityQueue<C1517b> priorityQueue = new PriorityQueue(i3, f6847f);
        priorityQueue.offer(new C1517b(this, 0, this.f6848a.length - 1));
        while (priorityQueue.size() < i3 && (c1517b = (C1517b) priorityQueue.poll()) != null) {
            int i13 = c1517b.f6838b;
            int iMin = c1517b.f6837a;
            if ((i13 + 1) - iMin <= i4) {
                break;
            }
            if ((i13 + 1) - iMin <= i4) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i14 = c1517b.f6841e - c1517b.f6840d;
            int i15 = c1517b.f6843g - c1517b.f6842f;
            int i16 = c1517b.f6845i - c1517b.f6844h;
            int i17 = (i14 < i15 || i14 < i16) ? (i15 < i14 || i15 < i16) ? -1 : -2 : -3;
            C1518c c1518c = c1517b.f6846j;
            int[] iArr4 = c1518c.f6848a;
            m3812a(i17, iMin, i13, iArr4);
            Arrays.sort(iArr4, iMin, c1517b.f6838b + i4);
            m3812a(i17, iMin, c1517b.f6838b, iArr4);
            int i18 = c1517b.f6839c / 2;
            int i19 = iMin;
            int i20 = 0;
            while (true) {
                int i21 = c1517b.f6838b;
                if (i19 > i21) {
                    break;
                }
                i20 += c1518c.f6849b[iArr4[i19]];
                if (i20 >= i18) {
                    iMin = Math.min(i21 - 1, i19);
                    break;
                }
                i19++;
            }
            C1517b c1517b2 = new C1517b(c1518c, iMin + 1, c1517b.f6838b);
            c1517b.f6838b = iMin;
            c1517b.m3810a();
            priorityQueue.offer(c1517b2);
            priorityQueue.offer(c1517b);
            i4 = 1;
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        for (C1517b c1517b3 : priorityQueue) {
            C1518c c1518c2 = c1517b3.f6846j;
            int[] iArr5 = c1518c2.f6848a;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            for (int i26 = c1517b3.f6837a; i26 <= c1517b3.f6838b; i26++) {
                int i27 = iArr5[i26];
                int i28 = c1518c2.f6849b[i27];
                i23 += i28;
                i22 = (((i27 >> 10) & 31) * i28) + i22;
                i24 = (((i27 >> 5) & 31) * i28) + i24;
                i25 += i28 * (i27 & 31);
            }
            float f = i23;
            C1520e c1520e = new C1520e(Color.rgb(m3813b(Math.round(i22 / f), 5, 8), m3813b(Math.round(i24 / f), 5, 8), m3813b(Math.round(i25 / f), 5, 8)), i23);
            if (!m3814c(c1520e.m3816b())) {
                arrayList.add(c1520e);
            }
        }
        this.f6850c = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static void m3812a(int i3, int i4, int i5, int[] iArr) {
        if (i3 == -2) {
            while (i4 <= i5) {
                int i6 = iArr[i4];
                iArr[i4] = (i6 & 31) | (((i6 >> 5) & 31) << 10) | (((i6 >> 10) & 31) << 5);
                i4++;
            }
            return;
        }
        if (i3 != -1) {
            return;
        }
        while (i4 <= i5) {
            int i7 = iArr[i4];
            iArr[i4] = ((i7 >> 10) & 31) | ((i7 & 31) << 10) | (((i7 >> 5) & 31) << 5);
            i4++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m3813b(int i3, int i4, int i5) {
        return (i5 > i4 ? i3 << (i5 - i4) : i3 >> (i4 - i5)) & ((1 << i5) - 1);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3814c(float[] fArr) {
        C1519d[] c1519dArr = this.f6851d;
        if (c1519dArr != null && c1519dArr.length > 0) {
            for (C1519d c1519d : c1519dArr) {
                c1519d.getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f3 = fArr[0];
                    if (f3 < 10.0f || f3 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
