package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.DialogC0901k;
import androidx.lifecycle.AbstractC0981F;
import androidx.lifecycle.AbstractC1010w;
import androidx.lifecycle.C1011x;
import com.zuxoplayer.app.R;
import p000A.C0031d;
import p014F.RunnableC0153b;
import p019G1.AbstractC0230e;
import p045P0.AbstractC0462h;
import p091e.AbstractActivityC1479j;

/* JADX INFO: renamed from: androidx.fragment.app.j */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0959j extends AbstractComponentCallbacksC0963n implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: X */
    public final DialogInterfaceOnCancelListenerC0956g f4178X;

    /* JADX INFO: renamed from: Y */
    public final DialogInterfaceOnDismissListenerC0957h f4179Y;

    /* JADX INFO: renamed from: Z */
    public int f4180Z;

    /* JADX INFO: renamed from: a0 */
    public int f4181a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f4182b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f4183c0;

    /* JADX INFO: renamed from: d0 */
    public int f4184d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f4185e0;

    /* JADX INFO: renamed from: f0 */
    public final C0031d f4186f0;

    /* JADX INFO: renamed from: g0 */
    public Dialog f4187g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f4188h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f4189i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f4190j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f4191k0;

    public DialogInterfaceOnCancelListenerC0959j() {
        new RunnableC0153b(8, this);
        this.f4178X = new DialogInterfaceOnCancelListenerC0956g(this);
        this.f4179Y = new DialogInterfaceOnDismissListenerC0957h(0, this);
        this.f4180Z = 0;
        this.f4181a0 = 0;
        this.f4182b0 = true;
        this.f4183c0 = true;
        this.f4184d0 = -1;
        this.f4186f0 = new C0031d(22, this);
        this.f4191k0 = false;
    }

    /* JADX INFO: renamed from: C */
    public Dialog mo997C() {
        if (AbstractC0937C.m2430F(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0901k(m2542z(), this.f4181a0);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0963n
    /* JADX INFO: renamed from: c */
    public final AbstractC0230e mo2518c() {
        return new C0958i(this, new C0961l(this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0963n
    /* JADX INFO: renamed from: o */
    public final void mo2519o() {
        this.f4212I = true;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f4188h0) {
            return;
        }
        if (AbstractC0937C.m2430F(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f4189i0) {
            return;
        }
        this.f4189i0 = true;
        this.f4190j0 = false;
        Dialog dialog = this.f4187g0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f4187g0.dismiss();
        }
        this.f4188h0 = true;
        if (this.f4184d0 >= 0) {
            AbstractC0937C abstractC0937CM2536j = m2536j();
            int i3 = this.f4184d0;
            if (i3 < 0) {
                throw new IllegalArgumentException(AbstractC0462h.m1165e(i3, "Bad id: "));
            }
            abstractC0937CM2536j.m2478v(new C0936B(abstractC0937CM2536j, i3), true);
            this.f4184d0 = -1;
            return;
        }
        C0950a c0950a = new C0950a(m2536j());
        c0950a.f4148o = true;
        AbstractC0937C abstractC0937C = this.f4243x;
        if (abstractC0937C == null || abstractC0937C == c0950a.f4149p) {
            c0950a.m2508b(new C0944J(3, this));
            c0950a.m2510d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0963n
    /* JADX INFO: renamed from: q */
    public final void mo2520q(AbstractActivityC1479j abstractActivityC1479j) {
        super.mo2520q(abstractActivityC1479j);
        this.f4222S.m2580d(this.f4186f0);
        if (this.f4190j0) {
            return;
        }
        this.f4189i0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0963n
    /* JADX INFO: renamed from: r */
    public final void mo2521r(Bundle bundle) {
        Parcelable parcelable;
        this.f4212I = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f4245z.m2447Q(parcelable);
            C0938D c0938d = this.f4245z;
            c0938d.f4055E = false;
            c0938d.f4056F = false;
            c0938d.f4062L.f4103h = false;
            c0938d.m2476t(1);
        }
        C0938D c0938d2 = this.f4245z;
        if (c0938d2.f4082s < 1) {
            c0938d2.f4055E = false;
            c0938d2.f4056F = false;
            c0938d2.f4062L.f4103h = false;
            c0938d2.m2476t(1);
        }
        new Handler();
        this.f4183c0 = this.f4206C == 0;
        if (bundle != null) {
            this.f4180Z = bundle.getInt("android:style", 0);
            this.f4181a0 = bundle.getInt("android:theme", 0);
            this.f4182b0 = bundle.getBoolean("android:cancelable", true);
            this.f4183c0 = bundle.getBoolean("android:showsDialog", this.f4183c0);
            this.f4184d0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0963n
    /* JADX INFO: renamed from: s */
    public final void mo2522s() {
        this.f4212I = true;
        Dialog dialog = this.f4187g0;
        if (dialog != null) {
            this.f4188h0 = true;
            dialog.setOnDismissListener(null);
            this.f4187g0.dismiss();
            if (!this.f4189i0) {
                onDismiss(this.f4187g0);
            }
            this.f4187g0 = null;
            this.f4191k0 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0963n
    /* JADX INFO: renamed from: t */
    public final void mo2523t() {
        this.f4212I = true;
        if (!this.f4190j0 && !this.f4189i0) {
            this.f4189i0 = true;
        }
        C0031d c0031d = this.f4186f0;
        C1011x c1011x = this.f4222S;
        c1011x.getClass();
        C1011x.m2577a("removeObserver");
        AbstractC1010w abstractC1010w = (AbstractC1010w) c1011x.f4338b.mo4523g(c0031d);
        if (abstractC1010w == null) {
            return;
        }
        abstractC1010w.mo2558d();
        abstractC1010w.m2576c(false);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0963n
    /* JADX INFO: renamed from: u */
    public final LayoutInflater mo2524u(Bundle bundle) {
        LayoutInflater layoutInflaterMo2524u = super.mo2524u(bundle);
        boolean z3 = this.f4183c0;
        if (z3 && !this.f4185e0) {
            if (z3 && !this.f4191k0) {
                try {
                    this.f4185e0 = true;
                    Dialog dialogMo997C = mo997C();
                    this.f4187g0 = dialogMo997C;
                    if (this.f4183c0) {
                        int i3 = this.f4180Z;
                        if (i3 == 1 || i3 == 2) {
                            dialogMo997C.requestWindowFeature(1);
                        } else if (i3 == 3) {
                            Window window = dialogMo997C.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogMo997C.requestWindowFeature(1);
                        }
                        Context contextM2534h = m2534h();
                        if (AbstractC0948N.m2506a(contextM2534h)) {
                            this.f4187g0.setOwnerActivity((Activity) contextM2534h);
                        }
                        this.f4187g0.setCancelable(this.f4182b0);
                        this.f4187g0.setOnCancelListener(this.f4178X);
                        this.f4187g0.setOnDismissListener(this.f4179Y);
                        this.f4191k0 = true;
                    } else {
                        this.f4187g0 = null;
                    }
                    this.f4185e0 = false;
                } catch (Throwable th) {
                    this.f4185e0 = false;
                    throw th;
                }
            }
            if (AbstractC0937C.m2430F(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f4187g0;
            if (dialog != null) {
                return layoutInflaterMo2524u.cloneInContext(dialog.getContext());
            }
        } else if (AbstractC0937C.m2430F(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f4183c0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterMo2524u;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterMo2524u;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0963n
    /* JADX INFO: renamed from: v */
    public final void mo2525v(Bundle bundle) {
        Dialog dialog = this.f4187g0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i3 = this.f4180Z;
        if (i3 != 0) {
            bundle.putInt("android:style", i3);
        }
        int i4 = this.f4181a0;
        if (i4 != 0) {
            bundle.putInt("android:theme", i4);
        }
        boolean z3 = this.f4182b0;
        if (!z3) {
            bundle.putBoolean("android:cancelable", z3);
        }
        boolean z4 = this.f4183c0;
        if (!z4) {
            bundle.putBoolean("android:showsDialog", z4);
        }
        int i5 = this.f4184d0;
        if (i5 != -1) {
            bundle.putInt("android:backStackId", i5);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0963n
    /* JADX INFO: renamed from: w */
    public final void mo2526w() {
        this.f4212I = true;
        Dialog dialog = this.f4187g0;
        if (dialog != null) {
            this.f4188h0 = false;
            dialog.show();
            View decorView = this.f4187g0.getWindow().getDecorView();
            AbstractC0981F.m2555b(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            AbstractC0230e.m743w(decorView, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0963n
    /* JADX INFO: renamed from: x */
    public void mo2527x() {
        this.f4212I = true;
        Dialog dialog = this.f4187g0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0963n
    /* JADX INFO: renamed from: y */
    public final void mo2528y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo2528y(layoutInflater, viewGroup, bundle);
        if (this.f4187g0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4187g0.onRestoreInstanceState(bundle2);
    }
}
