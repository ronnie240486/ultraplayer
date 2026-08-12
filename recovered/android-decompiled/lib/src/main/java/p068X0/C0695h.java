package p068X0;

import android.text.Layout;
import p045P0.AbstractC0462h;
import p061V.C0613a;

/* JADX INFO: renamed from: X0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0695h {

    /* JADX INFO: renamed from: c */
    public CharSequence f2677c;

    /* JADX INFO: renamed from: a */
    public long f2675a = 0;

    /* JADX INFO: renamed from: b */
    public long f2676b = 0;

    /* JADX INFO: renamed from: d */
    public int f2678d = 2;

    /* JADX INFO: renamed from: e */
    public float f2679e = -3.4028235E38f;

    /* JADX INFO: renamed from: f */
    public int f2680f = 1;

    /* JADX INFO: renamed from: g */
    public int f2681g = 0;

    /* JADX INFO: renamed from: h */
    public float f2682h = -3.4028235E38f;

    /* JADX INFO: renamed from: i */
    public int f2683i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j */
    public float f2684j = 1.0f;

    /* JADX INFO: renamed from: k */
    public int f2685k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX INFO: renamed from: a */
    public final C0613a m1815a() {
        Layout.Alignment alignment;
        float f = this.f2682h;
        float f3 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i3 = this.f2678d;
            if (i3 != 4) {
                f = i3 != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i4 = this.f2683i;
        if (i4 == Integer.MIN_VALUE) {
            int i5 = this.f2678d;
            if (i5 == 1) {
                i4 = 0;
            } else if (i5 == 3) {
                i4 = 2;
            } else if (i5 == 4) {
                i4 = 0;
            } else if (i5 != 5) {
                i4 = 1;
            } else {
                i4 = 2;
            }
        }
        C0613a c0613a = new C0613a();
        int i6 = this.f2678d;
        if (i6 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i6 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i6 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i6 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i6 != 5) {
            AbstractC0462h.m1170j("Unknown textAlignment: ", "WebvttCueParser", i6);
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        c0613a.f2321c = alignment;
        float f4 = this.f2679e;
        int i7 = this.f2680f;
        if (f4 != -3.4028235E38f && i7 == 0 && (f4 < 0.0f || f4 > 1.0f)) {
            f3 = 1.0f;
        } else if (f4 != -3.4028235E38f) {
            f3 = f4;
        } else if (i7 == 0) {
            f3 = 1.0f;
        }
        c0613a.f2323e = f3;
        c0613a.f2324f = i7;
        c0613a.f2325g = this.f2681g;
        c0613a.f2326h = f;
        c0613a.f2327i = i4;
        float f5 = this.f2684j;
        if (i4 == 0) {
            f = 1.0f - f;
        } else if (i4 == 1) {
            f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
        } else if (i4 != 2) {
            throw new IllegalStateException(String.valueOf(i4));
        }
        c0613a.f2330l = Math.min(f5, f);
        c0613a.f2334p = this.f2685k;
        CharSequence charSequence = this.f2677c;
        if (charSequence != null) {
            c0613a.f2319a = charSequence;
        }
        return c0613a;
    }
}
