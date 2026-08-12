package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import p104h1.AbstractC1621E;
import p104h1.C1664u;

/* JADX INFO: renamed from: androidx.emoji2.text.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0916f {

    /* JADX INFO: renamed from: a */
    public int f4000a;

    /* JADX INFO: renamed from: b */
    public final Object f4001b;

    /* JADX INFO: renamed from: c */
    public final Object f4002c;

    public AbstractC0916f(AbstractC1621E abstractC1621E) {
        this.f4000a = Integer.MIN_VALUE;
        this.f4002c = new Rect();
        this.f4001b = abstractC1621E;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0916f m2389a(AbstractC1621E abstractC1621E, int i3) {
        if (i3 == 0) {
            return new C1664u(abstractC1621E, 0);
        }
        if (i3 == 1) {
            return new C1664u(abstractC1621E, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo2390b(View view);

    /* JADX INFO: renamed from: c */
    public abstract int mo2391c(View view);

    /* JADX INFO: renamed from: d */
    public abstract int mo2392d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo2393e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo2394f();

    /* JADX INFO: renamed from: g */
    public abstract int mo2395g();

    /* JADX INFO: renamed from: h */
    public abstract int mo2396h();

    /* JADX INFO: renamed from: i */
    public abstract int mo2397i();

    /* JADX INFO: renamed from: j */
    public abstract int mo2398j();

    /* JADX INFO: renamed from: k */
    public abstract int mo2399k();

    /* JADX INFO: renamed from: l */
    public abstract int mo2400l();

    /* JADX INFO: renamed from: m */
    public abstract int mo2401m(View view);

    /* JADX INFO: renamed from: n */
    public abstract int mo2402n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo2403o(int i3);

    public AbstractC0916f(InterfaceC0918h interfaceC0918h) {
        this.f4000a = 0;
        this.f4002c = new C0913c();
        this.f4001b = interfaceC0918h;
    }
}
