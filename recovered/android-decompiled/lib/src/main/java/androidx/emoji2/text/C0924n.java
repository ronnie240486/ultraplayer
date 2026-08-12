package androidx.emoji2.text;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import p064W.C0651s;

/* JADX INFO: renamed from: androidx.emoji2.text.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0924n implements InterfaceC0923m {

    /* JADX INFO: renamed from: g */
    public final String f4016g;

    public /* synthetic */ C0924n(String str, boolean z3) {
        this.f4016g = str;
    }

    /* JADX INFO: renamed from: b */
    public static C0924n m2411b(C0651s c0651s) {
        String str;
        c0651s.m1666H(2);
        int iM1687u = c0651s.m1687u();
        int i3 = iM1687u >> 1;
        int iM1687u2 = ((c0651s.m1687u() >> 3) & 31) | ((iM1687u & 1) << 5);
        if (i3 == 4 || i3 == 5 || i3 == 7) {
            str = "dvhe";
        } else if (i3 == 8) {
            str = "hev1";
        } else {
            if (i3 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i3);
        sb.append(iM1687u2 >= 10 ? "." : ".0");
        sb.append(iM1687u2);
        return new C0924n(sb.toString(), false);
    }

    /* JADX INFO: renamed from: a */
    public void m2412a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f4016g);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // androidx.emoji2.text.InterfaceC0923m
    /* JADX INFO: renamed from: d */
    public Object mo516d() {
        return this;
    }

    @Override // androidx.emoji2.text.InterfaceC0923m
    /* JADX INFO: renamed from: g */
    public boolean mo519g(CharSequence charSequence, int i3, int i4, C0931u c0931u) {
        if (!TextUtils.equals(charSequence.subSequence(i3, i4), this.f4016g)) {
            return true;
        }
        c0931u.f4041c = (c0931u.f4041c & 3) | 4;
        return false;
    }

    public C0924n(String str) {
        str.getClass();
        this.f4016g = str;
    }
}
