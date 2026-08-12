package p026J;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.C0919i;
import p060U1.AbstractC0610a;

/* JADX INFO: renamed from: J.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0290g extends AbstractC0610a {

    /* JADX INFO: renamed from: n */
    public final C0289f f780n;

    public C0290g(TextView textView) {
        this.f780n = new C0289f(textView);
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: H */
    public final void mo819H(boolean z3) {
        if (C0919i.f4004k != null) {
            this.f780n.mo819H(z3);
        }
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: I */
    public final void mo820I(boolean z3) {
        boolean z4 = C0919i.f4004k != null;
        C0289f c0289f = this.f780n;
        if (z4) {
            c0289f.mo820I(z3);
        } else {
            c0289f.f779p = z3;
        }
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: o */
    public final InputFilter[] mo822o(InputFilter[] inputFilterArr) {
        return !(C0919i.f4004k != null) ? inputFilterArr : this.f780n.mo822o(inputFilterArr);
    }
}
