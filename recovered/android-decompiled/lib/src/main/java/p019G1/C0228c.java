package p019G1;

import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p013E1.C0142q;
import p016F1.C0181G;
import p028J1.C0296b;
import p046P1.AbstractC0491s;
import p075Z1.HandlerC0784e;

/* JADX INFO: renamed from: G1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0228c {

    /* JADX INFO: renamed from: b */
    public long f536b;

    /* JADX INFO: renamed from: c */
    public final C0233h f537c;

    /* JADX INFO: renamed from: d */
    public ArrayList f538d;

    /* JADX INFO: renamed from: e */
    public final SparseIntArray f539e;

    /* JADX INFO: renamed from: f */
    public final C0249x f540f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f541g;

    /* JADX INFO: renamed from: h */
    public final ArrayDeque f542h;

    /* JADX INFO: renamed from: i */
    public final HandlerC0784e f543i;

    /* JADX INFO: renamed from: j */
    public final C0245t f544j;

    /* JADX INFO: renamed from: k */
    public BasePendingResult f545k;

    /* JADX INFO: renamed from: l */
    public BasePendingResult f546l;

    /* JADX INFO: renamed from: m */
    public final Set f547m = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: a */
    public final C0296b f535a = new C0296b("MediaQueue", null);

    public C0228c(C0233h c0233h) {
        this.f537c = c0233h;
        Math.max(20, 1);
        this.f538d = new ArrayList();
        this.f539e = new SparseIntArray();
        this.f541g = new ArrayList();
        this.f542h = new ArrayDeque(20);
        this.f543i = new HandlerC0784e(Looper.getMainLooper(), 3);
        int i3 = 1;
        this.f544j = new C0245t(i3, this);
        c0233h.m765o(new C0181G(i3, this));
        this.f540f = new C0249x(this);
        this.f536b = m720e();
        m719d();
    }

    /* JADX INFO: renamed from: a */
    public static void m716a(C0228c c0228c) {
        synchronized (c0228c.f547m) {
            try {
                Iterator it = c0228c.f547m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m717b(C0228c c0228c) {
        c0228c.f539e.clear();
        for (int i3 = 0; i3 < c0228c.f538d.size(); i3++) {
            c0228c.f539e.put(((Integer) c0228c.f538d.get(i3)).intValue(), i3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m718c() {
        m723h();
        this.f538d.clear();
        this.f539e.clear();
        this.f540f.evictAll();
        this.f541g.clear();
        this.f543i.removeCallbacks(this.f544j);
        this.f542h.clear();
        BasePendingResult basePendingResult = this.f546l;
        if (basePendingResult != null) {
            basePendingResult.m3078D();
            this.f546l = null;
        }
        BasePendingResult basePendingResult2 = this.f545k;
        if (basePendingResult2 != null) {
            basePendingResult2.m3078D();
            this.f545k = null;
        }
        m722g();
        m721f();
    }

    /* JADX INFO: renamed from: d */
    public final void m719d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResultM749r;
        AbstractC0491s.m1210b();
        if (this.f536b != 0 && (basePendingResult = this.f546l) == null) {
            if (basePendingResult != null) {
                basePendingResult.m3078D();
                this.f546l = null;
            }
            BasePendingResult basePendingResult2 = this.f545k;
            if (basePendingResult2 != null) {
                basePendingResult2.m3078D();
                this.f545k = null;
            }
            C0233h c0233h = this.f537c;
            c0233h.getClass();
            AbstractC0491s.m1210b();
            if (c0233h.m772w()) {
                C0234i c0234i = new C0234i(c0233h);
                C0233h.m750x(c0234i);
                basePendingResultM749r = c0234i;
            } else {
                basePendingResultM749r = C0233h.m749r();
            }
            this.f546l = basePendingResultM749r;
            basePendingResultM749r.m3083J(new C0248w(this, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final long m720e() {
        C0142q c0142qM754d = this.f537c.m754d();
        if (c0142qM754d == null) {
            return 0L;
        }
        MediaInfo mediaInfo = c0142qM754d.f304g;
        int i3 = mediaInfo == null ? -1 : mediaInfo.f5445h;
        int i4 = c0142qM754d.f308k;
        int i5 = c0142qM754d.f309l;
        int i6 = c0142qM754d.f315r;
        if (i4 == 1) {
            if (i5 == 1) {
                if (i6 == 0) {
                    return 0L;
                }
            } else if (i5 != 2) {
                if (i5 != 3) {
                    return 0L;
                }
                if (i6 == 0) {
                    return 0L;
                }
            } else if (i3 != 2) {
                return 0L;
            }
        }
        return c0142qM754d.f305h;
    }

    /* JADX INFO: renamed from: f */
    public final void m721f() {
        synchronized (this.f547m) {
            try {
                Iterator it = this.f547m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m722g() {
        synchronized (this.f547m) {
            try {
                Iterator it = this.f547m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m723h() {
        synchronized (this.f547m) {
            try {
                Iterator it = this.f547m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
