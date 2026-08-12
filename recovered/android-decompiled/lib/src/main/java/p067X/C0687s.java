package p067X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.C0858A;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import p000A.AbstractC0005F;
import p000A.AbstractC0016Q;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p087d.AbstractC1376a;
import p113k.AbstractC1877l0;
import p113k.C1830T0;
import p113k.C1891s;
import p114k0.C1945g0;

/* JADX INFO: renamed from: X.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0687s {

    /* JADX INFO: renamed from: a */
    public int f2635a;

    /* JADX INFO: renamed from: b */
    public final Object f2636b;

    /* JADX INFO: renamed from: c */
    public final Object f2637c;

    /* JADX INFO: renamed from: d */
    public Object f2638d;

    /* JADX INFO: renamed from: e */
    public Object f2639e;

    /* JADX INFO: renamed from: f */
    public Object f2640f;

    public C0687s(View view) {
        this.f2635a = -1;
        this.f2636b = view;
        this.f2637c = C1891s.m4407a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r8 < r0.f2634h) goto L32;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1799a(long j3, C0651s c0651s) {
        int i3 = this.f2635a;
        if (i3 != 0) {
            PriorityQueue priorityQueue = (PriorityQueue) this.f2639e;
            if (i3 != -1 && priorityQueue.size() >= this.f2635a) {
                C0685q c0685q = (C0685q) priorityQueue.peek();
                int i4 = AbstractC0632A.f2454a;
            }
            ArrayDeque arrayDeque = (ArrayDeque) this.f2637c;
            C0651s c0651s2 = arrayDeque.isEmpty() ? new C0651s() : (C0651s) arrayDeque.pop();
            c0651s2.m1662D(c0651s.m1667a());
            System.arraycopy(c0651s.f2520a, c0651s.f2521b, c0651s2.f2520a, 0, c0651s2.m1667a());
            C0685q c0685q2 = (C0685q) this.f2640f;
            if (c0685q2 != null && j3 == c0685q2.f2634h) {
                c0685q2.f2633g.add(c0651s2);
                return;
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.f2638d;
            C0685q c0685q3 = arrayDeque2.isEmpty() ? new C0685q() : (C0685q) arrayDeque2.pop();
            c0685q3.getClass();
            AbstractC0646n.m1625c(j3 != -9223372036854775807L);
            ArrayList arrayList = c0685q3.f2633g;
            AbstractC0646n.m1630h(arrayList.isEmpty());
            c0685q3.f2634h = j3;
            arrayList.add(c0651s2);
            priorityQueue.add(c0685q3);
            this.f2640f = c0685q3;
            int i5 = this.f2635a;
            if (i5 != -1) {
                m1801c(i5);
                return;
            }
            return;
        }
        ((InterfaceC0686r) this.f2636b).mo546c(j3, c0651s);
    }

    /* JADX INFO: renamed from: b */
    public void m1800b() {
        View view = (View) this.f2636b;
        Drawable background = view.getBackground();
        if (background != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 <= 21 ? i3 == 21 : ((C1830T0) this.f2638d) != null) {
                if (((C1830T0) this.f2640f) == null) {
                    this.f2640f = new C1830T0();
                }
                C1830T0 c1830t0 = (C1830T0) this.f2640f;
                c1830t0.f8091a = null;
                c1830t0.f8094d = false;
                c1830t0.f8092b = null;
                c1830t0.f8093c = false;
                WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                ColorStateList colorStateListM14g = AbstractC0005F.m14g(view);
                if (colorStateListM14g != null) {
                    c1830t0.f8094d = true;
                    c1830t0.f8091a = colorStateListM14g;
                }
                PorterDuff.Mode modeM15h = AbstractC0005F.m15h(view);
                if (modeM15h != null) {
                    c1830t0.f8093c = true;
                    c1830t0.f8092b = modeM15h;
                }
                if (c1830t0.f8094d || c1830t0.f8093c) {
                    C1891s.m4409d(background, c1830t0, view.getDrawableState());
                    return;
                }
            }
            C1830T0 c1830t1 = (C1830T0) this.f2639e;
            if (c1830t1 != null) {
                C1891s.m4409d(background, c1830t1, view.getDrawableState());
                return;
            }
            C1830T0 c1830t2 = (C1830T0) this.f2638d;
            if (c1830t2 != null) {
                C1891s.m4409d(background, c1830t2, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1801c(int i3) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.f2639e;
            if (priorityQueue.size() <= i3) {
                return;
            }
            C0685q c0685q = (C0685q) priorityQueue.poll();
            int i4 = AbstractC0632A.f2454a;
            int i5 = 0;
            while (true) {
                int size = c0685q.f2633g.size();
                arrayList = c0685q.f2633g;
                if (i5 >= size) {
                    break;
                }
                ((InterfaceC0686r) this.f2636b).mo546c(c0685q.f2634h, (C0651s) arrayList.get(i5));
                ((ArrayDeque) this.f2637c).push((C0651s) arrayList.get(i5));
                i5++;
            }
            arrayList.clear();
            C0685q c0685q2 = (C0685q) this.f2640f;
            if (c0685q2 != null && c0685q2.f2634h == c0685q.f2634h) {
                this.f2640f = null;
            }
            ((ArrayDeque) this.f2638d).push(c0685q);
        }
    }

    /* JADX INFO: renamed from: d */
    public ColorStateList m1802d() {
        C1830T0 c1830t0 = (C1830T0) this.f2639e;
        if (c1830t0 != null) {
            return c1830t0.f8091a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public PorterDuff.Mode m1803e() {
        C1830T0 c1830t0 = (C1830T0) this.f2639e;
        if (c1830t0 != null) {
            return c1830t0.f8092b;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void m1804f(AttributeSet attributeSet, int i3) {
        ColorStateList colorStateListM4326i;
        View view = (View) this.f2636b;
        Context context = view.getContext();
        int[] iArr = AbstractC1376a.f6119y;
        C0858A c0858aM2148Q = C0858A.m2148Q(context, attributeSet, iArr, i3);
        TypedArray typedArray = (TypedArray) c0858aM2148Q.f3640i;
        View view2 = (View) this.f2636b;
        AbstractC0016Q.m85g(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c0858aM2148Q.f3640i, i3);
        try {
            if (typedArray.hasValue(0)) {
                this.f2635a = typedArray.getResourceId(0, -1);
                C1891s c1891s = (C1891s) this.f2637c;
                Context context2 = view.getContext();
                int i4 = this.f2635a;
                synchronized (c1891s) {
                    colorStateListM4326i = c1891s.f8264a.m4326i(context2, i4);
                }
                if (colorStateListM4326i != null) {
                    m1807i(colorStateListM4326i);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList colorStateListM2156D = c0858aM2148Q.m2156D(1);
                int i5 = Build.VERSION.SDK_INT;
                AbstractC0005F.m24q(view, colorStateListM2156D);
                if (i5 == 21) {
                    Drawable background = view.getBackground();
                    boolean z3 = (AbstractC0005F.m14g(view) == null && AbstractC0005F.m15h(view) == null) ? false : true;
                    if (background != null && z3) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        view.setBackground(background);
                    }
                }
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode modeM4397b = AbstractC1877l0.m4397b(typedArray.getInt(2, -1), null);
                int i6 = Build.VERSION.SDK_INT;
                AbstractC0005F.m25r(view, modeM4397b);
                if (i6 == 21) {
                    Drawable background2 = view.getBackground();
                    boolean z4 = (AbstractC0005F.m14g(view) == null && AbstractC0005F.m15h(view) == null) ? false : true;
                    if (background2 != null && z4) {
                        if (background2.isStateful()) {
                            background2.setState(view.getDrawableState());
                        }
                        view.setBackground(background2);
                    }
                }
            }
            c0858aM2148Q.m2170S();
        } catch (Throwable th) {
            c0858aM2148Q.m2170S();
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m1805g() {
        this.f2635a = -1;
        m1807i(null);
        m1800b();
    }

    /* JADX INFO: renamed from: h */
    public void m1806h(int i3) {
        ColorStateList colorStateListM4326i;
        this.f2635a = i3;
        C1891s c1891s = (C1891s) this.f2637c;
        if (c1891s != null) {
            Context context = ((View) this.f2636b).getContext();
            synchronized (c1891s) {
                colorStateListM4326i = c1891s.f8264a.m4326i(context, i3);
            }
        } else {
            colorStateListM4326i = null;
        }
        m1807i(colorStateListM4326i);
        m1800b();
    }

    /* JADX INFO: renamed from: i */
    public void m1807i(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C1830T0) this.f2638d) == null) {
                this.f2638d = new C1830T0();
            }
            C1830T0 c1830t0 = (C1830T0) this.f2638d;
            c1830t0.f8091a = colorStateList;
            c1830t0.f8094d = true;
        } else {
            this.f2638d = null;
        }
        m1800b();
    }

    /* JADX INFO: renamed from: j */
    public void m1808j(ColorStateList colorStateList) {
        if (((C1830T0) this.f2639e) == null) {
            this.f2639e = new C1830T0();
        }
        C1830T0 c1830t0 = (C1830T0) this.f2639e;
        c1830t0.f8091a = colorStateList;
        c1830t0.f8094d = true;
        m1800b();
    }

    /* JADX INFO: renamed from: k */
    public void m1809k(PorterDuff.Mode mode) {
        if (((C1830T0) this.f2639e) == null) {
            this.f2639e = new C1830T0();
        }
        C1830T0 c1830t0 = (C1830T0) this.f2639e;
        c1830t0.f8092b = mode;
        c1830t0.f8093c = true;
        m1800b();
    }

    public C0687s(InterfaceC0686r interfaceC0686r) {
        this.f2636b = interfaceC0686r;
        this.f2637c = new ArrayDeque();
        this.f2638d = new ArrayDeque();
        this.f2639e = new PriorityQueue();
        this.f2635a = -1;
    }

    public C0687s(int[] iArr, C1945g0[] c1945g0Arr, int[] iArr2, int[][][] iArr3, C1945g0 c1945g0) {
        this.f2636b = iArr;
        this.f2637c = c1945g0Arr;
        this.f2639e = iArr3;
        this.f2638d = iArr2;
        this.f2640f = c1945g0;
        this.f2635a = iArr.length;
    }
}
