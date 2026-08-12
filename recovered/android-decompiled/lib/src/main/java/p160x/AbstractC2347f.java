package p160x;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p022H1.C0258b;
import p030K0.C0334e;
import p036M0.C0370g;
import p124n.C2022i;
import p148t.AbstractC2268g;

/* JADX INFO: renamed from: x.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2347f {

    /* JADX INFO: renamed from: a */
    public static final C0370g f9856a = new C0370g(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f9857b;

    /* JADX INFO: renamed from: c */
    public static final Object f9858c;

    /* JADX INFO: renamed from: d */
    public static final C2022i f9859d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2350i());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f9857b = threadPoolExecutor;
        f9858c = new Object();
        f9859d = new C2022i();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[EDGE_INSN: B:10:0x0020->B:24:0x003d BREAK  A[LOOP:0: B:17:0x002d->B:23:0x003a]] */
    /* JADX INFO: renamed from: a */
    public static C2346e m4946a(String str, Context context, C0258b c0258b, int i3) {
        C0370g c0370g = f9856a;
        Typeface typeface = (Typeface) c0370g.m1020d(str);
        if (typeface != null) {
            return new C2346e(typeface);
        }
        try {
            C0334e c0334eM4945a = AbstractC2343b.m4945a(context, c0258b);
            int i4 = 1;
            C2348g[] c2348gArr = (C2348g[]) c0334eM4945a.f1063h;
            int i5 = c0334eM4945a.f1062g;
            if (i5 != 0) {
                if (i5 != 1) {
                    i4 = -3;
                    break;
                }
                i4 = -2;
            } else if (c2348gArr != null && c2348gArr.length != 0) {
                i4 = 0;
                for (C2348g c2348g : c2348gArr) {
                    int i6 = c2348g.f9864e;
                    if (i6 != 0) {
                        if (i6 >= 0) {
                            i4 = i6;
                            break;
                        }
                        i4 = -3;
                        break;
                    }
                }
            }
            if (i4 != 0) {
                return new C2346e(i4);
            }
            Typeface typefaceMo1771m = AbstractC2268g.f9705a.mo1771m(context, c2348gArr, i3);
            if (typefaceMo1771m == null) {
                return new C2346e(-3);
            }
            c0370g.m1021e(str, typefaceMo1771m);
            return new C2346e(typefaceMo1771m);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C2346e(-1);
        }
    }
}
