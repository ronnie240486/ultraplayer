package p046P1;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC1152a;
import p034L1.C0346a;

/* JADX INFO: renamed from: P1.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0488p {

    /* JADX INFO: renamed from: a */
    public Boolean f1630a;

    /* JADX INFO: renamed from: b */
    public boolean f1631b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC1152a f1632c;

    /* JADX INFO: renamed from: d */
    public final int f1633d;

    /* JADX INFO: renamed from: e */
    public final Bundle f1634e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC1152a f1635f;

    public AbstractC0488p(AbstractC1152a abstractC1152a, int i3, Bundle bundle) {
        this.f1635f = abstractC1152a;
        Boolean bool = Boolean.TRUE;
        this.f1632c = abstractC1152a;
        this.f1630a = bool;
        this.f1631b = false;
        this.f1633d = i3;
        this.f1634e = bundle;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1204a(C0346a c0346a);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo1205b();

    /* JADX INFO: renamed from: c */
    public final void m1206c() {
        synchronized (this) {
            this.f1630a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1207d() {
        m1206c();
        synchronized (this.f1632c.f5525l) {
            this.f1632c.f5525l.remove(this);
        }
    }
}
