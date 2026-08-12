package p108i1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0858A;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.reflect.Field;
import p000A.AbstractC0016Q;
import p014F.AbstractC0154c;
import p014F.AbstractC0155d;
import p019G1.AbstractC0230e;
import p060U1.AbstractC0610a;
import p087d.AbstractC1376a;
import p113k.AbstractC1877l0;
import p113k.C1889r;
import p120m.C1995c;
import p120m.C1998f;
import p122m1.AbstractC2003a;
import p152u.AbstractC2279a;

/* JADX INFO: renamed from: i1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1751d {

    /* JADX INFO: renamed from: a */
    public boolean f7802a;

    /* JADX INFO: renamed from: b */
    public boolean f7803b;

    /* JADX INFO: renamed from: c */
    public boolean f7804c;

    /* JADX INFO: renamed from: d */
    public final Object f7805d;

    /* JADX INFO: renamed from: e */
    public Parcelable f7806e;

    /* JADX INFO: renamed from: f */
    public Object f7807f;

    public /* synthetic */ C1751d(TextView textView) {
        this.f7806e = null;
        this.f7807f = null;
        this.f7802a = false;
        this.f7803b = false;
        this.f7805d = textView;
    }

    /* JADX INFO: renamed from: a */
    public void m4204a() {
        Drawable drawableM613a;
        int i3 = Build.VERSION.SDK_INT;
        CompoundButton compoundButton = (CompoundButton) this.f7805d;
        if (i3 >= 23) {
            drawableM613a = AbstractC0155d.m613a(compoundButton);
        } else {
            if (!AbstractC0230e.f556l) {
                try {
                    Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    AbstractC0230e.f555k = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e3);
                }
                AbstractC0230e.f556l = true;
            }
            Field field = AbstractC0230e.f555k;
            if (field != null) {
                try {
                    drawableM613a = (Drawable) field.get(compoundButton);
                } catch (IllegalAccessException e4) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e4);
                    AbstractC0230e.f555k = null;
                    drawableM613a = null;
                }
            } else {
                drawableM613a = null;
            }
        }
        if (drawableM613a != null) {
            if (this.f7802a || this.f7803b) {
                Drawable drawableMutate = AbstractC2003a.m4548u(drawableM613a).mutate();
                if (this.f7802a) {
                    AbstractC2279a.m4892h(drawableMutate, (ColorStateList) this.f7806e);
                }
                if (this.f7803b) {
                    AbstractC2279a.m4893i(drawableMutate, (PorterDuff.Mode) this.f7807f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4205b() {
        C1889r c1889r = (C1889r) this.f7805d;
        Drawable checkMarkDrawable = c1889r.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f7802a || this.f7803b) {
                Drawable drawableMutate = AbstractC2003a.m4548u(checkMarkDrawable).mutate();
                if (this.f7802a) {
                    AbstractC2279a.m4892h(drawableMutate, (ColorStateList) this.f7806e);
                }
                if (this.f7803b) {
                    AbstractC2279a.m4893i(drawableMutate, (PorterDuff.Mode) this.f7807f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c1889r.getDrawableState());
                }
                c1889r.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public Bundle m4206c(String str) {
        if (!this.f7803b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f7806e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f7806e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f7806e;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f7806e = null;
        return bundle2;
    }

    /* JADX INFO: renamed from: d */
    public void m4207d(AttributeSet attributeSet, int i3) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f7805d;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC1376a.f6107m;
        C0858A c0858aM2148Q = C0858A.m2148Q(context, attributeSet, iArr, i3);
        TypedArray typedArray = (TypedArray) c0858aM2148Q.f3640i;
        AbstractC0016Q.m85g(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c0858aM2148Q.f3640i, i3);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC0610a.m1512n(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AbstractC0610a.m1512n(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC0610a.m1512n(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0154c.m611c(compoundButton, c0858aM2148Q.m2156D(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC0154c.m612d(compoundButton, AbstractC1877l0.m4397b(typedArray.getInt(3, -1), null));
            }
        } finally {
            c0858aM2148Q.m2170S();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m4208e(String str, InterfaceC1750c interfaceC1750c) {
        Object obj;
        C1998f c1998f = (C1998f) this.f7805d;
        C1995c c1995cMo4522e = c1998f.mo4522e(str);
        if (c1995cMo4522e != null) {
            obj = c1995cMo4522e.f8704h;
        } else {
            C1995c c1995c = new C1995c(str, interfaceC1750c);
            c1998f.f8713j++;
            C1995c c1995c2 = c1998f.f8711h;
            if (c1995c2 == null) {
                c1998f.f8710g = c1995c;
                c1998f.f8711h = c1995c;
            } else {
                c1995c2.f8705i = c1995c;
                c1995c.f8706j = c1995c2;
                c1998f.f8711h = c1995c;
            }
            obj = null;
        }
        if (((InterfaceC1750c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public C1751d() {
        this.f7805d = new C1998f();
        this.f7804c = true;
    }
}
