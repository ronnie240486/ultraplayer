package p137q0;

import p055T.C0570d0;
import p055T.InterfaceC0572e0;

/* JADX INFO: renamed from: q0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2151l {

    /* JADX INFO: renamed from: a */
    public final C2150k f9291a;

    public C2151l(C2150k c2150k) {
        this.f9291a = c2150k;
    }

    /* JADX INFO: renamed from: a */
    public final void m4742a() throws C0570d0 {
        try {
            ((C2151l) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(InterfaceC0572e0.class).newInstance(this.f9291a)).m4742a();
        } catch (Exception e3) {
            int i3 = C0570d0.f2056g;
            if (!(e3 instanceof C0570d0)) {
                throw new C0570d0(e3);
            }
        }
    }
}
