package p048Q0;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import p061V.C0614b;

/* JADX INFO: renamed from: Q0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0503b {

    /* JADX INFO: renamed from: a */
    public final ArrayList f1661a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1662b;

    /* JADX INFO: renamed from: c */
    public final StringBuilder f1663c;

    /* JADX INFO: renamed from: d */
    public int f1664d;

    /* JADX INFO: renamed from: e */
    public int f1665e;

    /* JADX INFO: renamed from: f */
    public int f1666f;

    /* JADX INFO: renamed from: g */
    public int f1667g;

    /* JADX INFO: renamed from: h */
    public int f1668h;

    public C0503b(int i3, int i4) {
        ArrayList arrayList = new ArrayList();
        this.f1661a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f1662b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f1663c = sb;
        this.f1667g = i3;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f1664d = 15;
        this.f1665e = 0;
        this.f1666f = 0;
        this.f1668h = i4;
    }

    /* JADX INFO: renamed from: a */
    public final void m1224a(char c) {
        StringBuilder sb = this.f1663c;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1225b() {
        StringBuilder sb = this.f1663c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f1661a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0502a c0502a = (C0502a) arrayList.get(size);
                int i3 = c0502a.f1660c;
                if (i3 != length) {
                    return;
                }
                c0502a.f1660c = i3 - 1;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0614b m1226c(int i3) {
        int i4;
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f1662b;
            if (i5 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i5));
            spannableStringBuilder.append('\n');
            i5++;
        }
        spannableStringBuilder.append((CharSequence) m1227d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i6 = this.f1665e + this.f1666f;
        int length = (32 - i6) - spannableStringBuilder.length();
        int i7 = i6 - length;
        if (i3 != Integer.MIN_VALUE) {
            i4 = i3;
        } else if (this.f1667g != 2 || (Math.abs(i7) >= 3 && length >= 0)) {
            i4 = (this.f1667g != 2 || i7 <= 0) ? 0 : 2;
        } else {
            i4 = 1;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                i6 = 32 - length;
            }
            f = ((i6 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i8 = this.f1664d;
        if (i8 > 7) {
            i8 -= 17;
        } else if (this.f1667g == 1) {
            i8 -= this.f1668h - 1;
        }
        return new C0614b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i8, 1, Integer.MIN_VALUE, f, i4, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public final SpannableString m1227d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f1663c);
        int length = spannableStringBuilder.length();
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f1661a;
            if (i3 >= arrayList.size()) {
                break;
            }
            C0502a c0502a = (C0502a) arrayList.get(i3);
            boolean z4 = c0502a.f1659b;
            int i9 = c0502a.f1658a;
            if (i9 != 8) {
                boolean z5 = i9 == 7;
                if (i9 != 7) {
                    i8 = C0504c.f1670B[i9];
                }
                z3 = z5;
            }
            int i10 = c0502a.f1660c;
            i3++;
            if (i10 != (i3 < arrayList.size() ? ((C0502a) arrayList.get(i3)).f1660c : length)) {
                if (i4 != -1 && !z4) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i10, 33);
                    i4 = -1;
                } else if (i4 == -1 && z4) {
                    i4 = i10;
                }
                if (i5 != -1 && !z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i5, i10, 33);
                    i5 = -1;
                } else if (i5 == -1 && z3) {
                    i5 = i10;
                }
                if (i8 != i7) {
                    if (i7 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i7), i6, i10, 33);
                    }
                    i7 = i8;
                    i6 = i10;
                }
            }
        }
        if (i4 != -1 && i4 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
        }
        if (i5 != -1 && i5 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i5, length, 33);
        }
        if (i6 != length && i7 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i7), i6, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1228e() {
        return this.f1661a.isEmpty() && this.f1662b.isEmpty() && this.f1663c.length() == 0;
    }
}
