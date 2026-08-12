package p064W;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.media.session.C0858A;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.gms.internal.cast.C1209O;
import com.google.android.gms.internal.cast.C1211O1;
import com.google.android.gms.internal.cast.C1252Z;
import com.google.android.gms.internal.cast.C1260b0;
import com.google.android.gms.internal.cast.C1335u;
import com.google.android.gms.internal.cast.C1342v2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000A.AbstractC0016Q;
import p014F.AbstractC0158g;
import p016F1.C0192i;
import p022H1.C0258b;
import p046P1.AbstractC0491s;
import p060U1.AbstractC0610a;
import p087d.AbstractC1376a;
import p097f2.InterfaceC1559c;
import p113k.AbstractC1877l0;
import p113k.C1830T0;
import p113k.C1891s;
import p129o0.C2066f;

/* JADX INFO: renamed from: W.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0650r implements InterfaceC1559c {

    /* JADX INFO: renamed from: k */
    public static C0650r f2512k;

    /* JADX INFO: renamed from: g */
    public int f2513g;

    /* JADX INFO: renamed from: h */
    public Object f2514h;

    /* JADX INFO: renamed from: i */
    public Object f2515i;

    /* JADX INFO: renamed from: j */
    public Object f2516j;

    public C0650r(ImageView imageView) {
        this.f2513g = 0;
        this.f2514h = imageView;
    }

    /* JADX INFO: renamed from: a */
    public static void m1651a(int i3, C0650r c0650r) {
        synchronized (c0650r.f2516j) {
            try {
                if (c0650r.f2513g == i3) {
                    return;
                }
                c0650r.f2513g = i3;
                for (WeakReference weakReference : (CopyOnWriteArrayList) c0650r.f2515i) {
                    C2066f c2066f = (C2066f) weakReference.get();
                    if (c2066f != null) {
                        c2066f.m4631a(i3);
                    } else {
                        ((CopyOnWriteArrayList) c0650r.f2515i).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C0650r m1652c(Context context) {
        try {
            if (f2512k == null) {
                f2512k = new C0650r(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2512k;
    }

    /* JADX INFO: renamed from: b */
    public void m1653b() {
        ImageView imageView = (ImageView) this.f2514h;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1877l0.m4396a(drawable);
        }
        if (drawable != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 <= 21 && i3 == 21) {
                if (((C1830T0) this.f2516j) == null) {
                    this.f2516j = new C1830T0();
                }
                C1830T0 c1830t0 = (C1830T0) this.f2516j;
                c1830t0.f8091a = null;
                c1830t0.f8094d = false;
                c1830t0.f8092b = null;
                c1830t0.f8093c = false;
                ColorStateList colorStateListM618a = AbstractC0158g.m618a(imageView);
                if (colorStateListM618a != null) {
                    c1830t0.f8094d = true;
                    c1830t0.f8091a = colorStateListM618a;
                }
                PorterDuff.Mode modeM619b = AbstractC0158g.m619b(imageView);
                if (modeM619b != null) {
                    c1830t0.f8093c = true;
                    c1830t0.f8092b = modeM619b;
                }
                if (c1830t0.f8094d || c1830t0.f8093c) {
                    C1891s.m4409d(drawable, c1830t0, imageView.getDrawableState());
                    return;
                }
            }
            C1830T0 c1830t1 = (C1830T0) this.f2515i;
            if (c1830t1 != null) {
                C1891s.m4409d(drawable, c1830t1, imageView.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int m1654d() {
        int i3;
        synchronized (this.f2516j) {
            i3 = this.f2513g;
        }
        return i3;
    }

    /* JADX INFO: renamed from: e */
    public int m1655e() {
        int i3 = this.f2513g;
        if (i3 != 2) {
            return i3 != 3 ? 0 : 512;
        }
        return 2048;
    }

    /* JADX INFO: renamed from: f */
    public void m1656f(AttributeSet attributeSet, int i3) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.f2514h;
        Context context = imageView.getContext();
        int[] iArr = AbstractC1376a.f6100f;
        C0858A c0858aM2148Q = C0858A.m2148Q(context, attributeSet, iArr, i3);
        AbstractC0016Q.m85g(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c0858aM2148Q.f3640i, i3);
        try {
            Drawable drawable3 = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) c0858aM2148Q.f3640i;
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = AbstractC0610a.m1512n(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                AbstractC1877l0.m4396a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList colorStateListM2156D = c0858aM2148Q.m2156D(2);
                int i4 = Build.VERSION.SDK_INT;
                AbstractC0158g.m620c(imageView, colorStateListM2156D);
                if (i4 == 21 && (drawable2 = imageView.getDrawable()) != null && AbstractC0158g.m618a(imageView) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode modeM4397b = AbstractC1877l0.m4397b(typedArray.getInt(3, -1), null);
                int i5 = Build.VERSION.SDK_INT;
                AbstractC0158g.m621d(imageView, modeM4397b);
                if (i5 == 21 && (drawable = imageView.getDrawable()) != null && AbstractC0158g.m618a(imageView) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } finally {
            c0858aM2148Q.m2170S();
        }
    }

    /* JADX INFO: renamed from: g */
    public Looper m1657g() {
        Looper looper;
        synchronized (this.f2516j) {
            try {
                if (((Looper) this.f2514h) == null) {
                    AbstractC0646n.m1630h(this.f2513g == 0 && ((HandlerThread) this.f2515i) == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f2515i = handlerThread;
                    handlerThread.start();
                    this.f2514h = ((HandlerThread) this.f2515i).getLooper();
                }
                this.f2513g++;
                looper = (Looper) this.f2514h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    /* JADX INFO: renamed from: h */
    public void m1658h() {
        HandlerThread handlerThread;
        synchronized (this.f2516j) {
            try {
                AbstractC0646n.m1630h(this.f2513g > 0);
                int i3 = this.f2513g - 1;
                this.f2513g = i3;
                if (i3 == 0 && (handlerThread = (HandlerThread) this.f2515i) != null) {
                    handlerThread.quit();
                    this.f2515i = null;
                    this.f2514h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0032  */
    @Override // p097f2.InterfaceC1559c
    /* JADX INFO: renamed from: j */
    public void mo649j(Object obj) {
        C0258b c0258b;
        Bundle bundle = (Bundle) obj;
        C1209O c1209o = (C1209O) this.f2514h;
        C0192i c0192i = c1209o.f5669a;
        AbstractC0491s.m1213e(c0192i);
        String str = (String) this.f2515i;
        int i3 = this.f2513g;
        C1335u c1335u = c1209o.f5670b;
        if (i3 == 3) {
            c0258b = new C0258b(c1209o, c1209o.f5671c, str);
            c0192i.m678a(new C1211O1(c0258b));
            if (c1335u != null) {
                C1252Z c1252z = new C1252Z(1, c0258b);
                C1335u.f5971i.m831b("register callback = %s", c1252z);
                AbstractC0491s.m1210b();
                c1335u.f5973b.add(c1252z);
            }
        } else if (i3 == 2) {
            i3 = 2;
            c0258b = new C0258b(c1209o, c1209o.f5671c, str);
            c0192i.m678a(new C1211O1(c0258b));
            if (c1335u != null) {
                C1252Z c1252z2 = new C1252Z(1, c0258b);
                C1335u.f5971i.m831b("register callback = %s", c1252z2);
                AbstractC0491s.m1210b();
                c1335u.f5973b.add(c1252z2);
            }
        }
        if (i3 == 1 || i3 == 2) {
            C1260b0 c1260b0 = new C1260b0((SharedPreferences) this.f2516j, c1209o, c1209o.f5671c, bundle, str);
            c0192i.m678a(new C1342v2(c1260b0));
            if (c1335u != null) {
                C1252Z c1252z3 = new C1252Z(0, c1260b0);
                C1335u.f5971i.m831b("register callback = %s", c1252z3);
                AbstractC0491s.m1210b();
                c1335u.f5973b.add(c1252z3);
            }
        }
    }

    public C0650r(Context context) {
        this.f2514h = new Handler(Looper.getMainLooper());
        this.f2515i = new CopyOnWriteArrayList();
        this.f2516j = new Object();
        this.f2513g = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C0649q(0, this), intentFilter);
    }

    public C0650r(int i3, String str, int i4, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f2514h = str;
        this.f2513g = i4;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f2515i = listUnmodifiableList;
        this.f2516j = bArr;
    }
}
