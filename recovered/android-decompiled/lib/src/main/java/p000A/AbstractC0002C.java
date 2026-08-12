package p000A;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import p034L1.C0352g;

/* JADX INFO: renamed from: A.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0002C {

    /* JADX INFO: renamed from: a */
    public int f2a;

    /* JADX INFO: renamed from: b */
    public int f3b;

    /* JADX INFO: renamed from: c */
    public int f4c;

    /* JADX INFO: renamed from: d */
    public Object f5d;

    public AbstractC0002C() {
        if (C0352g.f1139e == null) {
            C0352g.f1139e = new C0352g(3);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m3a(int i3) {
        if (i3 < this.f4c) {
            return ((ByteBuffer) this.f5d).getShort(this.f3b + i3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo0b(View view);

    /* JADX INFO: renamed from: c */
    public abstract void mo1c(View view, Object obj);

    /* JADX INFO: renamed from: d */
    public void m4d(View view, Object obj) {
        Object tag;
        C0027b c0027b;
        if (Build.VERSION.SDK_INT >= this.f3b) {
            mo1c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f3b) {
            tag = mo0b(view);
        } else {
            tag = view.getTag(this.f2a);
            if (!((Class) this.f5d).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo2e(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM81c = AbstractC0016Q.m81c(view);
            if (accessibilityDelegateM81c == null) {
                c0027b = null;
            } else {
                c0027b = accessibilityDelegateM81c instanceof C0025a ? ((C0025a) accessibilityDelegateM81c).f28a : new C0027b(accessibilityDelegateM81c);
            }
            if (c0027b == null) {
                c0027b = new C0027b();
            }
            AbstractC0016Q.m86h(view, c0027b);
            view.setTag(this.f2a, obj);
            AbstractC0016Q.m83e(view, this.f4c);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2e(Object obj, Object obj2);
}
