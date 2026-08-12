package p113k;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import p000A.C0031d;
import p060U1.AbstractC0610a;
import p087d.AbstractC1376a;

/* JADX INFO: renamed from: k.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1897v {

    /* JADX INFO: renamed from: a */
    public final TextView f8283a;

    /* JADX INFO: renamed from: b */
    public final C0031d f8284b;

    public C1897v(TextView textView) {
        this.f8283a = textView;
        this.f8284b = new C0031d(textView);
    }

    /* JADX INFO: renamed from: a */
    public final void m4412a(AttributeSet attributeSet, int i3) {
        TypedArray typedArrayObtainStyledAttributes = this.f8283a.getContext().obtainStyledAttributes(attributeSet, AbstractC1376a.f6103i, i3, 0);
        try {
            boolean z3 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m4414c(z3);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4413b(boolean z3) {
        ((AbstractC0610a) this.f8284b.f38h).mo819H(z3);
    }

    /* JADX INFO: renamed from: c */
    public final void m4414c(boolean z3) {
        ((AbstractC0610a) this.f8284b.f38h).mo820I(z3);
    }
}
