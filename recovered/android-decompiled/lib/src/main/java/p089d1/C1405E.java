package p089d1;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.C0858A;
import android.support.v4.media.session.C0885u;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: d1.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1405E {

    /* JADX INFO: renamed from: c */
    public static C1433f f6239c;

    /* JADX INFO: renamed from: a */
    public final Context f6240a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f6241b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public C1405E(Context context) {
        this.f6240a = context;
    }

    /* JADX INFO: renamed from: b */
    public static void m3510b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    /* JADX INFO: renamed from: c */
    public static C1433f m3511c() {
        C1433f c1433f = f6239c;
        if (c1433f != null) {
            return c1433f;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    /* JADX INFO: renamed from: d */
    public static C1405E m3512d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        m3510b();
        if (f6239c == null) {
            f6239c = new C1433f(context.getApplicationContext());
        }
        ArrayList arrayList = f6239c.f6338i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                C1405E c1405e = new C1405E(context);
                arrayList.add(new WeakReference(c1405e));
                return c1405e;
            }
            C1405E c1405e2 = (C1405E) ((WeakReference) arrayList.get(size)).get();
            if (c1405e2 == null) {
                arrayList.remove(size);
            } else if (c1405e2.f6240a == context) {
                return c1405e2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static MediaSessionCompat$Token m3513e() {
        C1433f c1433f = f6239c;
        if (c1433f == null) {
            return null;
        }
        C0858A c0858a = c1433f.f6327C;
        if (c0858a != null) {
            C0858A c0858a2 = (C0858A) c0858a.f3639h;
            if (c0858a2 != null) {
                return ((C0885u) c0858a2.f3639h).f3704c;
            }
            return null;
        }
        C0858A c0858a3 = c1433f.f6328D;
        if (c0858a3 != null) {
            return ((C0885u) c0858a3.f3639h).f3704c;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static C1403C m3514f() {
        m3510b();
        return m3511c().m3577e();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m3515g() {
        Bundle bundle;
        if (f6239c == null) {
            return false;
        }
        C1406F c1406f = m3511c().f6350u;
        return c1406f == null || (bundle = c1406f.f6245d) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    /* JADX INFO: renamed from: i */
    public static void m3516i(int i3) {
        if (i3 < 0 || i3 > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        m3510b();
        C1433f c1433fM3511c = m3511c();
        C1403C c1403cM3575c = c1433fM3511c.m3575c();
        if (c1433fM3511c.m3577e() != c1403cM3575c) {
            c1433fM3511c.m3581i(c1403cM3575c, i3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3517a(C1451x c1451x, AbstractC1452y abstractC1452y, int i3) {
        C1453z c1453z;
        boolean z3;
        C1451x c1451x2;
        if (c1451x == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (abstractC1452y == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        m3510b();
        ArrayList arrayList = this.f6241b;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((C1453z) arrayList.get(i5)).f6420b == abstractC1452y) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 < 0) {
            c1453z = new C1453z(this, abstractC1452y);
            arrayList.add(c1453z);
        } else {
            c1453z = (C1453z) arrayList.get(i5);
        }
        boolean z4 = true;
        if (i3 != c1453z.f6422d) {
            c1453z.f6422d = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if ((i3 & 1) != 0) {
            z3 = true;
        }
        c1453z.f6423e = jElapsedRealtime;
        C1451x c1451x3 = c1453z.f6421c;
        c1451x3.m3640a();
        c1451x.m3640a();
        if (c1451x3.f6418b.containsAll(c1451x.f6418b)) {
            z4 = z3;
        } else {
            C1451x c1451x4 = c1453z.f6421c;
            if (c1451x4 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            c1451x4.m3640a();
            ArrayList<String> arrayList2 = !c1451x4.f6418b.isEmpty() ? new ArrayList<>(c1451x4.f6418b) : null;
            ArrayList arrayListM3641c = c1451x.m3641c();
            if (!arrayListM3641c.isEmpty()) {
                int size2 = arrayListM3641c.size();
                while (i4 < size2) {
                    Object obj = arrayListM3641c.get(i4);
                    i4++;
                    String str = (String) obj;
                    if (str == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    if (!arrayList2.contains(str)) {
                        arrayList2.add(str);
                    }
                }
            }
            if (arrayList2 == null) {
                c1451x2 = C1451x.f6416c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                c1451x2 = new C1451x(bundle, arrayList2);
            }
            c1453z.f6421c = c1451x2;
        }
        if (z4) {
            m3511c().m3583k();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m3518h(AbstractC1452y abstractC1452y) {
        if (abstractC1452y == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        m3510b();
        ArrayList arrayList = this.f6241b;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C1453z) arrayList.get(i3)).f6420b == abstractC1452y) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            arrayList.remove(i3);
            m3511c().m3583k();
        }
    }
}
