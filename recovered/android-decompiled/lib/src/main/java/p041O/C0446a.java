package p041O;

import androidx.lifecycle.AbstractC0984I;
import p124n.C2023j;

/* JADX INFO: renamed from: O.a */
/* JADX INFO: loaded from: classes.dex */
public class C0446a extends AbstractC0984I {

    /* JADX INFO: renamed from: c */
    public final C2023j f1507c = new C2023j();

    @Override // androidx.lifecycle.AbstractC0984I
    /* JADX INFO: renamed from: a */
    public final void mo1154a() {
        C2023j c2023j = this.f1507c;
        int i3 = c2023j.f8795i;
        if (i3 > 0) {
            c2023j.f8794h[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = c2023j.f8794h;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        c2023j.f8795i = 0;
    }
}
