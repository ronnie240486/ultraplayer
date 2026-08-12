package p036M0;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import androidx.activity.RunnableC0892b;
import com.google.android.gms.internal.cast.RunnableC1315p;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p064W.AbstractC0646n;
import p113k.AbstractC1835W;
import p113k.C1837X;

/* JADX INFO: renamed from: M0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0368e {

    /* JADX INFO: renamed from: a */
    public int f1178a;

    /* JADX INFO: renamed from: b */
    public int f1179b;

    /* JADX INFO: renamed from: c */
    public Object f1180c;

    /* JADX INFO: renamed from: d */
    public Object f1181d;

    public C0368e() {
        this.f1180c = new long[10];
        this.f1181d = new Object[10];
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1009a(long j3, Object obj) {
        int i3 = this.f1179b;
        if (i3 > 0) {
            if (j3 <= ((long[]) this.f1180c)[((this.f1178a + i3) - 1) % ((Object[]) this.f1181d).length]) {
                m1011c();
            }
        }
        m1012d();
        int i4 = this.f1178a;
        int i5 = this.f1179b;
        Object[] objArr = (Object[]) this.f1181d;
        int length = (i4 + i5) % objArr.length;
        ((long[]) this.f1180c)[length] = j3;
        objArr[length] = obj;
        this.f1179b = i5 + 1;
    }

    /* JADX INFO: renamed from: b */
    public void m1010b() {
        new Handler(Looper.getMainLooper()).post(new RunnableC0892b(21, this));
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m1011c() {
        this.f1178a = 0;
        this.f1179b = 0;
        Arrays.fill((Object[]) this.f1181d, (Object) null);
    }

    /* JADX INFO: renamed from: d */
    public void m1012d() {
        int length = ((Object[]) this.f1181d).length;
        if (this.f1179b < length) {
            return;
        }
        int i3 = length * 2;
        long[] jArr = new long[i3];
        Object[] objArr = new Object[i3];
        int i4 = this.f1178a;
        int i5 = length - i4;
        System.arraycopy((long[]) this.f1180c, i4, jArr, 0, i5);
        System.arraycopy((Object[]) this.f1181d, this.f1178a, objArr, 0, i5);
        int i6 = this.f1178a;
        if (i6 > 0) {
            System.arraycopy((long[]) this.f1180c, 0, jArr, i5, i6);
            System.arraycopy((Object[]) this.f1181d, 0, objArr, i5, this.f1178a);
        }
        this.f1180c = jArr;
        this.f1181d = objArr;
        this.f1178a = 0;
    }

    /* JADX INFO: renamed from: e */
    public void m1013e(Typeface typeface) {
        int i3;
        if (Build.VERSION.SDK_INT >= 28 && (i3 = this.f1178a) != -1) {
            typeface = AbstractC1835W.m4347a(typeface, i3, (this.f1179b & 2) != 0);
        }
        C1837X c1837x = (C1837X) this.f1181d;
        if (c1837x.f8110m) {
            c1837x.f8109l = typeface;
            TextView textView = (TextView) ((WeakReference) this.f1180c).get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC1315p(textView, typeface, c1837x.f8107j, 2));
                } else {
                    textView.setTypeface(typeface, c1837x.f8107j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public Object m1014f(long j3, boolean z3) {
        Object objM1017i = null;
        long j4 = Long.MAX_VALUE;
        while (this.f1179b > 0) {
            long j5 = j3 - ((long[]) this.f1180c)[this.f1178a];
            if (j5 < 0 && (z3 || (-j5) >= j4)) {
                break;
            }
            objM1017i = m1017i();
            j4 = j5;
        }
        return objM1017i;
    }

    /* JADX INFO: renamed from: g */
    public synchronized Object m1015g() {
        return this.f1179b == 0 ? null : m1017i();
    }

    /* JADX INFO: renamed from: h */
    public synchronized Object m1016h(long j3) {
        return m1014f(j3, true);
    }

    /* JADX INFO: renamed from: i */
    public Object m1017i() {
        AbstractC0646n.m1630h(this.f1179b > 0);
        Object[] objArr = (Object[]) this.f1181d;
        int i3 = this.f1178a;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f1178a = (i3 + 1) % objArr.length;
        this.f1179b--;
        return obj;
    }

    /* JADX INFO: renamed from: j */
    public synchronized int m1018j() {
        return this.f1179b;
    }

    public C0368e(int i3, float[] fArr, float[] fArr2, int i4) {
        this.f1178a = i3;
        AbstractC0646n.m1625c(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f1180c = fArr;
        this.f1181d = fArr2;
        this.f1179b = i4;
    }

    public C0368e(C0368e c0368e) {
        float[] fArr = (float[]) c0368e.f1180c;
        this.f1178a = fArr.length / 3;
        this.f1180c = AbstractC0646n.m1633k(fArr);
        this.f1181d = AbstractC0646n.m1633k((float[]) c0368e.f1181d);
        int i3 = c0368e.f1179b;
        if (i3 == 1) {
            this.f1179b = 5;
        } else if (i3 != 2) {
            this.f1179b = 4;
        } else {
            this.f1179b = 6;
        }
    }
}
