package p000A;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: A.k0 */
/* JADX INFO: loaded from: classes.dex */
public class C0046k0 extends C0044j0 {
    public C0046k0(C0056p0 c0056p0, WindowInsets windowInsets) {
        super(c0056p0, windowInsets);
    }

    @Override // p000A.C0054o0
    /* JADX INFO: renamed from: a */
    public C0056p0 mo256a() {
        return C0056p0.m316c(this.f59c.consumeDisplayCutout(), null);
    }

    @Override // p000A.C0054o0
    /* JADX INFO: renamed from: e */
    public C0047l mo257e() {
        DisplayCutout displayCutout = this.f59c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0047l(displayCutout);
    }

    @Override // p000A.AbstractC0042i0, p000A.C0054o0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0046k0)) {
            return false;
        }
        C0046k0 c0046k0 = (C0046k0) obj;
        return Objects.equals(this.f59c, c0046k0.f59c) && Objects.equals(this.f61e, c0046k0.f61e);
    }

    @Override // p000A.C0054o0
    public int hashCode() {
        return this.f59c.hashCode();
    }
}
