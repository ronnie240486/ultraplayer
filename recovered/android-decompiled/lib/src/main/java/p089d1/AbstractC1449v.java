package p089d1;

import android.content.ComponentName;
import android.content.Context;
import android.support.v4.media.session.HandlerC0881q;
import java.util.Objects;
import p046P1.C0471D;

/* JADX INFO: renamed from: d1.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1449v {

    /* JADX INFO: renamed from: a */
    public final Context f6407a;

    /* JADX INFO: renamed from: b */
    public final C1447t f6408b;

    /* JADX INFO: renamed from: c */
    public final HandlerC0881q f6409c = new HandlerC0881q(7, this);

    /* JADX INFO: renamed from: d */
    public C1428b f6410d;

    /* JADX INFO: renamed from: e */
    public C1443p f6411e;

    /* JADX INFO: renamed from: f */
    public boolean f6412f;

    /* JADX INFO: renamed from: g */
    public C0471D f6413g;

    /* JADX INFO: renamed from: h */
    public boolean f6414h;

    public AbstractC1449v(Context context, C1447t c1447t) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.f6407a = context;
        if (c1447t != null) {
            this.f6408b = c1447t;
        } else {
            this.f6408b = new C1447t(0, new ComponentName(context, getClass()));
        }
    }

    /* JADX INFO: renamed from: c */
    public AbstractC1446s mo3560c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC1448u mo3526d(String str);

    /* JADX INFO: renamed from: e */
    public AbstractC1448u mo3561e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return mo3526d(str);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo3527f(C1443p c1443p);

    /* JADX INFO: renamed from: g */
    public final void m3630g(C0471D c0471d) {
        C1405E.m3510b();
        if (this.f6413g != c0471d) {
            this.f6413g = c0471d;
            if (this.f6414h) {
                return;
            }
            this.f6414h = true;
            this.f6409c.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m3631h(C1443p c1443p) {
        C1405E.m3510b();
        if (Objects.equals(this.f6411e, c1443p)) {
            return;
        }
        this.f6411e = c1443p;
        if (this.f6412f) {
            return;
        }
        this.f6412f = true;
        this.f6409c.sendEmptyMessage(2);
    }
}
