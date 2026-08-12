package p091e;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.DialogC0901k;
import androidx.lifecycle.AbstractC0981F;
import com.zuxoplayer.app.R;
import p000A.InterfaceC0049m;
import p019G1.AbstractC0230e;
import p106i.C1742j;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: e.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogC1460E extends DialogC0901k implements InterfaceC1480k {

    /* JADX INFO: renamed from: j */
    public LayoutInflaterFactory2C1458C f6498j;

    /* JADX INFO: renamed from: k */
    public final C1459D f6499k;

    /* JADX WARN: Type inference failed for: r2v2, types: [e.D] */
    public AbstractDialogC1460E(ContextThemeWrapper contextThemeWrapper, int i3) {
        int i4;
        if (i3 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i4 = typedValue.resourceId;
        } else {
            i4 = i3;
        }
        super(contextThemeWrapper, i4);
        this.f6499k = new InterfaceC0049m() { // from class: e.D
            @Override // p000A.InterfaceC0049m
            /* JADX INFO: renamed from: c */
            public final boolean mo258c(KeyEvent keyEvent) {
                return this.f6497g.m3676g(keyEvent);
            }
        };
        AbstractC1486q abstractC1486qM3674d = m3674d();
        if (i3 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i3 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C1458C) abstractC1486qM3674d).f6472a0 = i3;
        abstractC1486qM3674d.mo3656d();
    }

    @Override // androidx.activity.DialogC0901k, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = (LayoutInflaterFactory2C1458C) m3674d();
        layoutInflaterFactory2C1458C.m3670v();
        ((ViewGroup) layoutInflaterFactory2C1458C.f6453H.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C1458C.f6489s.m3729a(layoutInflaterFactory2C1458C.f6488r.getCallback());
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC1486q m3674d() {
        if (this.f6498j == null) {
            ExecutorC1484o executorC1484o = AbstractC1486q.f6620g;
            this.f6498j = new LayoutInflaterFactory2C1458C(getContext(), getWindow(), this, this);
        }
        return this.f6498j;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m3674d().mo3657e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0230e.m737o(this.f6499k, getWindow().getDecorView(), this, keyEvent);
    }

    /* JADX INFO: renamed from: f */
    public final void m3675f() {
        AbstractC0981F.m2555b(getWindow().getDecorView(), this);
        AbstractC0230e.m743w(getWindow().getDecorView(), this);
        AbstractC2003a.m4544q(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i3) {
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = (LayoutInflaterFactory2C1458C) m3674d();
        layoutInflaterFactory2C1458C.m3670v();
        return layoutInflaterFactory2C1458C.f6488r.findViewById(i3);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3676g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = (LayoutInflaterFactory2C1458C) m3674d();
        if (layoutInflaterFactory2C1458C.f6491u != null) {
            layoutInflaterFactory2C1458C.m3646A();
            layoutInflaterFactory2C1458C.f6491u.getClass();
            layoutInflaterFactory2C1458C.m3647B(0);
        }
    }

    @Override // androidx.activity.DialogC0901k, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m3674d().mo3655a();
        super.onCreate(bundle);
        m3674d().mo3656d();
    }

    @Override // androidx.activity.DialogC0901k, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = (LayoutInflaterFactory2C1458C) m3674d();
        layoutInflaterFactory2C1458C.m3646A();
        C1469N c1469n = layoutInflaterFactory2C1458C.f6491u;
        if (c1469n != null) {
            c1469n.f6529B = false;
            C1742j c1742j = c1469n.f6528A;
            if (c1742j != null) {
                c1742j.m4193a();
            }
        }
    }

    @Override // androidx.activity.DialogC0901k, android.app.Dialog
    public final void setContentView(int i3) {
        m3675f();
        m3674d().mo3659i(i3);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m3674d().mo3662l(charSequence);
    }

    @Override // androidx.activity.DialogC0901k, android.app.Dialog
    public final void setContentView(View view) {
        m3675f();
        m3674d().mo3660j(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i3) {
        super.setTitle(i3);
        m3674d().mo3662l(getContext().getString(i3));
    }

    @Override // androidx.activity.DialogC0901k, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m3675f();
        m3674d().mo3661k(view, layoutParams);
    }
}
