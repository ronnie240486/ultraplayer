package p128o;

import com.google.android.gms.internal.cast.C1353y1;
import java.io.Serializable;

/* JADX INFO: renamed from: o.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2057h {

    /* JADX INFO: renamed from: a */
    public Serializable f8948a;

    /* JADX INFO: renamed from: b */
    public C2059j f8949b;

    /* JADX INFO: renamed from: c */
    public C2060k f8950c;

    /* JADX INFO: renamed from: d */
    public boolean f8951d;

    /* JADX INFO: renamed from: a */
    public final void m4627a() {
        this.f8951d = true;
        C2059j c2059j = this.f8949b;
        if (c2059j != null) {
            C2058i c2058i = c2059j.f8954h;
            c2058i.getClass();
            if (AbstractC2056g.f8943l.mo1768f(c2058i, null, AbstractC2056g.f8944m)) {
                AbstractC2056g.m4620b(c2058i);
                this.f8948a = null;
                this.f8949b = null;
                this.f8950c = null;
            }
        }
    }

    public final void finalize() {
        C2060k c2060k;
        C2059j c2059j = this.f8949b;
        if (c2059j != null) {
            C2058i c2058i = c2059j.f8954h;
            if (!c2058i.isDone()) {
                C1353y1 c1353y1 = new C1353y1(2, "The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f8948a);
                c2058i.getClass();
                if (AbstractC2056g.f8943l.mo1768f(c2058i, null, new C2051b(c1353y1))) {
                    AbstractC2056g.m4620b(c2058i);
                }
            }
        }
        if (this.f8951d || (c2060k = this.f8950c) == null) {
            return;
        }
        c2060k.m4628h(null);
    }
}
