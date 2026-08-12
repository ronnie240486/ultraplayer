package p019G1;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import p000A.C0031d;
import p028J1.C0306l;
import p028J1.InterfaceC0308n;
import p037M1.InterfaceC0398k;

/* JADX INFO: renamed from: G1.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0244s extends BasePendingResult {

    /* JADX INFO: renamed from: F */
    public C0031d f635F;

    /* JADX INFO: renamed from: G */
    public final boolean f636G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C0233h f637H;

    public AbstractC0244s(C0233h c0233h, boolean z3) {
        this.f637H = c0233h;
        this.f636G = z3;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC0398k mo775E(Status status) {
        return new C0242q(status, 1);
    }

    /* JADX INFO: renamed from: M */
    public abstract void mo773M();

    /* JADX INFO: renamed from: N */
    public final InterfaceC0308n m776N() {
        if (this.f635F == null) {
            this.f635F = new C0031d(7, this);
        }
        return this.f635F;
    }

    /* JADX INFO: renamed from: O */
    public final void m777O() {
        if (!this.f636G) {
            Iterator it = this.f637H.f609h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = this.f637H.f610i.iterator();
            while (it2.hasNext()) {
                ((AbstractC0232g) it2.next()).getClass();
            }
        }
        try {
            synchronized (this.f637H.f602a) {
                mo773M();
            }
        } catch (C0306l unused) {
            m3082I(new C0242q(new Status(2100, null, null, null), 1));
        }
    }
}
