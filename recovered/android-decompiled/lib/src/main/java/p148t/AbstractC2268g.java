package p148t;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.cast.C1323r;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p013E1.RunnableC0121D;
import p013E1.RunnableC0123F;
import p014F.RunnableC0153b;
import p022H1.C0258b;
import p036M0.C0368e;
import p036M0.C0370g;
import p064W.RunnableC0647o;
import p066W1.AbstractC0664e;
import p089d1.C1447t;
import p124n.C2022i;
import p144s.C2212f;
import p144s.C2214h;
import p144s.InterfaceC2211e;
import p160x.AbstractC2347f;
import p160x.C2345d;
import p160x.C2346e;
import p160x.CallableC2344c;

/* JADX INFO: renamed from: t.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2268g {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0664e f9705a;

    /* JADX INFO: renamed from: b */
    public static final C0370g f9706b;

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            f9705a = new C2273l();
        } else if (i3 >= 28) {
            f9705a = new C2272k();
        } else if (i3 >= 26) {
            f9705a = new C2271j();
        } else if (i3 < 24) {
            f9705a = new C2269h();
        } else {
            Method method = C2270i.f9714k;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f9705a = new C2270i();
            } else {
                f9705a = new C2269h();
            }
        }
        f9706b = new C0370g(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX INFO: renamed from: a */
    public static Typeface m4867a(Context context, InterfaceC2211e interfaceC2211e, Resources resources, int i3, String str, int i4, int i5, C0368e c0368e, boolean z3) {
        Typeface typefaceMo1770l;
        Typeface typefaceCreate;
        int i6 = 14;
        int i7 = 1;
        int i8 = 0;
        int i9 = 17;
        if (interfaceC2211e instanceof C2214h) {
            C2214h c2214h = (C2214h) interfaceC2211e;
            String str2 = c2214h.f9524d;
            typefaceMo1770l = null;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (c0368e != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0647o(c0368e, i9, typefaceCreate));
                }
                return typefaceCreate;
            }
            boolean z4 = !z3 ? c0368e != null : c2214h.f9523c != 0;
            int i10 = z3 ? c2214h.f9522b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C1447t c1447t = new C1447t(22);
            c1447t.f6406h = c0368e;
            C0258b c0258b = c2214h.f9521a;
            C1323r c1323r = new C1323r(c1447t, i9, handler);
            if (z4) {
                C0370g c0370g = AbstractC2347f.f9856a;
                String str3 = ((String) c0258b.f667l) + "-" + i5;
                Typeface typeface = (Typeface) AbstractC2347f.f9856a.m1020d(str3);
                if (typeface != null) {
                    handler.post(new RunnableC0121D(c1447t, i6, typeface));
                    typefaceMo1770l = typeface;
                } else if (i10 == -1) {
                    C2346e c2346eM4946a = AbstractC2347f.m4946a(str3, context, c0258b, i5);
                    c1323r.m3362J(c2346eM4946a);
                    typefaceMo1770l = c2346eM4946a.f9854a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    C2346e c2346e = (C2346e) AbstractC2347f.f9857b.submit(new CallableC2344c(str3, context, c0258b, i5, 0)).get(i10, TimeUnit.MILLISECONDS);
                                    c1323r.m3362J(c2346e);
                                    typefaceMo1770l = c2346e.f9854a;
                                } catch (TimeoutException unused) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e3) {
                                throw e3;
                            }
                        } catch (ExecutionException e4) {
                            throw new RuntimeException(e4);
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) c1323r.f5962i).post(new RunnableC0153b((C1447t) c1323r.f5961h, -3));
                    }
                }
            } else {
                C0370g c0370g2 = AbstractC2347f.f9856a;
                String str4 = ((String) c0258b.f667l) + "-" + i5;
                Typeface typeface2 = (Typeface) AbstractC2347f.f9856a.m1020d(str4);
                if (typeface2 != null) {
                    handler.post(new RunnableC0121D(c1447t, i6, typeface2));
                    typefaceMo1770l = typeface2;
                } else {
                    C2345d c2345d = new C2345d(i8, c1323r);
                    synchronized (AbstractC2347f.f9858c) {
                        try {
                            C2022i c2022i = AbstractC2347f.f9859d;
                            ArrayList arrayList = (ArrayList) c2022i.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(c2345d);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(c2345d);
                                c2022i.put(str4, arrayList2);
                                CallableC2344c callableC2344c = new CallableC2344c(str4, context, c0258b, i5, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC2347f.f9857b;
                                C2345d c2345d2 = new C2345d(i7, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                RunnableC0123F runnableC0123F = new RunnableC0123F();
                                runnableC0123F.f179j = callableC2344c;
                                runnableC0123F.f177h = c2345d2;
                                runnableC0123F.f178i = handler2;
                                threadPoolExecutor.execute(runnableC0123F);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } else {
            typefaceMo1770l = f9705a.mo1770l(context, (C2212f) interfaceC2211e, resources, i5);
            if (c0368e != null) {
                if (typefaceMo1770l != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0647o(c0368e, i9, typefaceMo1770l));
                } else {
                    c0368e.m1010b();
                }
            }
        }
        if (typefaceMo1770l != null) {
            f9706b.m1021e(m4868b(resources, i3, str, i4, i5), typefaceMo1770l);
        }
        return typefaceMo1770l;
    }

    /* JADX INFO: renamed from: b */
    public static String m4868b(Resources resources, int i3, String str, int i4, int i5) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i4 + '-' + i3 + '-' + i5;
    }
}
