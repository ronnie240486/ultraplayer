package p142r1;

import android.content.Context;
import p034L1.C0352g;

/* JADX INFO: renamed from: r1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2197b extends AbstractC2198c {

    /* JADX INFO: renamed from: a */
    public final Context f9479a;

    /* JADX INFO: renamed from: b */
    public final C0352g f9480b;

    /* JADX INFO: renamed from: c */
    public final C0352g f9481c;

    /* JADX INFO: renamed from: d */
    public final String f9482d;

    public C2197b(Context context, C0352g c0352g, C0352g c0352g2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f9479a = context;
        if (c0352g == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f9480b = c0352g;
        if (c0352g2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f9481c = c0352g2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f9482d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2198c) {
            AbstractC2198c abstractC2198c = (AbstractC2198c) obj;
            if (this.f9479a.equals(((C2197b) abstractC2198c).f9479a)) {
                C2197b c2197b = (C2197b) abstractC2198c;
                if (this.f9480b.equals(c2197b.f9480b) && this.f9481c.equals(c2197b.f9481c) && this.f9482d.equals(c2197b.f9482d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f9479a.hashCode() ^ 1000003) * 1000003) ^ this.f9480b.hashCode()) * 1000003) ^ this.f9481c.hashCode()) * 1000003) ^ this.f9482d.hashCode();
    }

    public final String toString() {
        return "CreationContext{applicationContext=" + this.f9479a + ", wallClock=" + this.f9480b + ", monotonicClock=" + this.f9481c + ", backendName=" + this.f9482d + "}";
    }
}
