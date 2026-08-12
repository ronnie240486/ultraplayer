package p048Q0;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import p061V.C0614b;

/* JADX INFO: renamed from: Q0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0506e {

    /* JADX INFO: renamed from: c */
    public static final C0505d f1696c = new C0505d(0);

    /* JADX INFO: renamed from: a */
    public final C0614b f1697a;

    /* JADX INFO: renamed from: b */
    public final int f1698b;

    public C0506e(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i3, float f3, int i4, boolean z3, int i5, int i6) {
        boolean z4;
        int i7;
        if (z3) {
            i7 = i5;
            z4 = true;
        } else {
            z4 = false;
            i7 = -16777216;
        }
        this.f1697a = new C0614b(spannableStringBuilder, alignment, null, null, f, 0, i3, f3, i4, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z4, i7, Integer.MIN_VALUE, 0.0f);
        this.f1698b = i6;
    }
}
