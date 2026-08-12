package androidx.mediarouter.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaRouter2;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.AbstractC0937C;
import androidx.fragment.app.C0950a;
import androidx.fragment.app.C0965p;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.PlayerActivity;
import java.util.Iterator;
import p000A.AbstractC0016Q;
import p060U1.AbstractC0610a;
import p086c1.AbstractC1151a;
import p089d1.C1403C;
import p089d1.C1405E;
import p089d1.C1406F;
import p089d1.C1451x;
import p091e.AbstractActivityC1479j;
import p091e.AbstractDialogC1460E;
import p122m1.AbstractC2003a;
import p152u.AbstractC2279a;

/* JADX INFO: renamed from: androidx.mediarouter.app.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1033b extends View {

    /* JADX INFO: renamed from: v */
    public static final SparseArray f4527v = new SparseArray(2);

    /* JADX INFO: renamed from: w */
    public static final int[] f4528w = {R.attr.state_checked};

    /* JADX INFO: renamed from: x */
    public static final int[] f4529x = {R.attr.state_checkable};

    /* JADX INFO: renamed from: g */
    public final C1405E f4530g;

    /* JADX INFO: renamed from: h */
    public final C1020G f4531h;

    /* JADX INFO: renamed from: i */
    public C1451x f4532i;

    /* JADX INFO: renamed from: j */
    public C1053v f4533j;

    /* JADX INFO: renamed from: k */
    public boolean f4534k;

    /* JADX INFO: renamed from: l */
    public boolean f4535l;

    /* JADX INFO: renamed from: m */
    public AsyncTaskC1032a f4536m;

    /* JADX INFO: renamed from: n */
    public Drawable f4537n;

    /* JADX INFO: renamed from: o */
    public int f4538o;

    /* JADX INFO: renamed from: p */
    public int f4539p;

    /* JADX INFO: renamed from: q */
    public int f4540q;

    /* JADX INFO: renamed from: r */
    public final ColorStateList f4541r;

    /* JADX INFO: renamed from: s */
    public final int f4542s;

    /* JADX INFO: renamed from: t */
    public final int f4543t;

    /* JADX INFO: renamed from: u */
    public boolean f4544u;

    public C1033b(PlayerActivity playerActivity) {
        Drawable.ConstantState constantState;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(playerActivity, AbstractC1303m.m3324q(playerActivity));
        int iM3328u = AbstractC1303m.m3328u(contextThemeWrapper, com.zuxoplayer.app.R.attr.mediaRouteTheme);
        super(iM3328u != 0 ? new ContextThemeWrapper(contextThemeWrapper, iM3328u) : contextThemeWrapper, null, com.zuxoplayer.app.R.attr.mediaRouteButtonStyle);
        this.f4532i = C1451x.f6416c;
        this.f4533j = C1053v.f4672a;
        Context context = getContext();
        int[] iArr = AbstractC1151a.f5403a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, com.zuxoplayer.app.R.attr.mediaRouteButtonStyle, 0);
        AbstractC0016Q.m85g(this, context, iArr, null, typedArrayObtainStyledAttributes, com.zuxoplayer.app.R.attr.mediaRouteButtonStyle);
        if (isInEditMode()) {
            this.f4530g = null;
            this.f4531h = null;
            this.f4537n = AbstractC0610a.m1512n(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
            return;
        }
        this.f4530g = C1405E.m3512d(context);
        this.f4531h = new C1020G(this, 1);
        C1403C c1403cM3514f = C1405E.m3514f();
        int i3 = !c1403cM3514f.m3494d() ? c1403cM3514f.f6224i : 0;
        this.f4540q = i3;
        this.f4539p = i3;
        this.f4541r = typedArrayObtainStyledAttributes.getColorStateList(4);
        this.f4542s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f4543t = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f4538o = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        typedArrayObtainStyledAttributes.recycle();
        int i4 = this.f4538o;
        SparseArray sparseArray = f4527v;
        if (i4 != 0 && (constantState = (Drawable.ConstantState) sparseArray.get(i4)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.f4537n == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) sparseArray.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    AsyncTaskC1032a asyncTaskC1032a = new AsyncTaskC1032a(this, resourceId, getContext());
                    this.f4536m = asyncTaskC1032a;
                    asyncTaskC1032a.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                m2631a();
            }
        }
        m2634d();
        setClickable(true);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private AbstractC0937C getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof AbstractActivityC1479j) {
            return ((C0965p) ((AbstractActivityC1479j) activity).f6611x.f38h).f4251x;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m2631a() {
        if (this.f4538o > 0) {
            AsyncTaskC1032a asyncTaskC1032a = this.f4536m;
            if (asyncTaskC1032a != null) {
                asyncTaskC1032a.cancel(false);
            }
            AsyncTaskC1032a asyncTaskC1032a2 = new AsyncTaskC1032a(this, this.f4538o, getContext());
            this.f4536m = asyncTaskC1032a2;
            this.f4538o = 0;
            asyncTaskC1032a2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2632b() {
        this.f4530g.getClass();
        C1403C c1403cM3514f = C1405E.m3514f();
        int i3 = !c1403cM3514f.m3494d() ? c1403cM3514f.f6224i : 0;
        if (this.f4540q != i3) {
            this.f4540q = i3;
            m2634d();
            refreshDrawableState();
        }
        if (i3 == 1) {
            m2631a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2633c() {
        AbstractC0937C fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        this.f4530g.getClass();
        if (C1405E.m3514f().m3494d()) {
            if (fragmentManager.m2435A("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            this.f4533j.getClass();
            C1038g c1038g = new C1038g();
            C1451x c1451x = this.f4532i;
            if (c1451x == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            c1038g.m2639D();
            if (!c1038g.f4576n0.equals(c1451x)) {
                c1038g.f4576n0 = c1451x;
                Bundle bundle = c1038g.f4231l;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("selector", c1451x.f6417a);
                c1038g.m2531B(bundle);
                AbstractDialogC1460E abstractDialogC1460E = c1038g.f4575m0;
                if (abstractDialogC1460E != null) {
                    if (c1038g.f4574l0) {
                        ((DialogC1015B) abstractDialogC1460E).m2597i(c1451x);
                    } else {
                        ((DialogC1037f) abstractDialogC1460E).m2637j(c1451x);
                    }
                }
            }
            C0950a c0950a = new C0950a(fragmentManager);
            c0950a.m2511e(0, c1038g, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
            c0950a.m2510d(true);
            return true;
        }
        if (fragmentManager.m2435A("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
            Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
            return false;
        }
        this.f4533j.getClass();
        C1052u c1052u = new C1052u();
        C1451x c1451x2 = this.f4532i;
        if (c1451x2 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (c1052u.f4671n0 == null) {
            Bundle bundle2 = c1052u.f4231l;
            if (bundle2 != null) {
                c1052u.f4671n0 = C1451x.m3639b(bundle2.getBundle("selector"));
            }
            if (c1052u.f4671n0 == null) {
                c1052u.f4671n0 = C1451x.f6416c;
            }
        }
        if (!c1052u.f4671n0.equals(c1451x2)) {
            c1052u.f4671n0 = c1451x2;
            Bundle bundle3 = c1052u.f4231l;
            if (bundle3 == null) {
                bundle3 = new Bundle();
            }
            bundle3.putBundle("selector", c1451x2.f6417a);
            c1052u.m2531B(bundle3);
            AbstractDialogC1460E abstractDialogC1460E2 = c1052u.f4670m0;
            if (abstractDialogC1460E2 != null && c1052u.f4669l0) {
                ((DialogC1028O) abstractDialogC1460E2).m2623k(c1451x2);
            }
        }
        C0950a c0950a2 = new C0950a(fragmentManager);
        c0950a2.m2511e(0, c1052u, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
        c0950a2.m2510d(true);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m2634d() {
        int i3;
        int i4 = this.f4540q;
        if (i4 != 1) {
            i3 = i4 != 2 ? com.zuxoplayer.app.R.string.mr_cast_button_disconnected : com.zuxoplayer.app.R.string.mr_cast_button_connected;
        } else {
            i3 = com.zuxoplayer.app.R.string.mr_cast_button_connecting;
        }
        String string = getContext().getString(i3);
        setContentDescription(string);
        if (!this.f4544u || TextUtils.isEmpty(string)) {
            string = null;
        }
        AbstractC0610a.m1496J(this, string);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f4537n != null) {
            this.f4537n.setState(getDrawableState());
            if (this.f4537n.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.f4537n.getCurrent();
                int i3 = this.f4540q;
                if (i3 == 1 || this.f4539p != i3) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i3 == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.f4539p = this.f4540q;
    }

    public C1053v getDialogFactory() {
        return this.f4533j;
    }

    public C1451x getRouteSelector() {
        return this.f4532i;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4537n;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.f4534k = true;
        if (!this.f4532i.m3642d()) {
            this.f4530g.m3517a(this.f4532i, this.f4531h, 0);
        }
        m2632b();
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        if (this.f4530g != null && !this.f4535l) {
            int i4 = this.f4540q;
            if (i4 == 1) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, f4529x);
                return iArrOnCreateDrawableState;
            }
            if (i4 == 2) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, f4528w);
                return iArrOnCreateDrawableState;
            }
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f4534k = false;
            if (!this.f4532i.m3642d()) {
                this.f4530g.m3518h(this.f4531h);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4537n != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.f4537n.getIntrinsicWidth();
            int intrinsicHeight = this.f4537n.getIntrinsicHeight();
            int i3 = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i4 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.f4537n.setBounds(i3, i4, intrinsicWidth + i3, intrinsicHeight + i4);
            this.f4537n.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int paddingRight;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        Drawable drawable = this.f4537n;
        int paddingBottom = 0;
        if (drawable != null) {
            paddingRight = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            paddingRight = 0;
        }
        int iMax = Math.max(this.f4542s, paddingRight);
        Drawable drawable2 = this.f4537n;
        if (drawable2 != null) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int iMax2 = Math.max(this.f4543t, paddingBottom);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, iMax);
        } else if (mode != 1073741824) {
            size = iMax;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, iMax2);
        } else if (mode2 != 1073741824) {
            size2 = iMax2;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b  */
    @Override // android.view.View
    public final boolean performClick() {
        boolean zM2633c;
        boolean zM4547t;
        ApplicationInfo applicationInfo;
        boolean z3;
        ApplicationInfo applicationInfo2;
        boolean z4;
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        m2631a();
        if (this.f4534k) {
            this.f4530g.getClass();
            C1405E.m3510b();
            C1406F c1406f = C1405E.m3511c().f6350u;
            if (c1406f == null || !c1406f.f6243b) {
                zM2633c = m2633c();
            } else {
                if (C1405E.f6239c == null ? false : C1405E.m3511c().m3578f()) {
                    Context context = getContext();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 34) {
                        if (i3 >= 30) {
                            MediaRouter2 mediaRouter2M2629a = AbstractC1030Q.m2629a(context);
                            if (i3 >= 34) {
                                zM4547t = AbstractC1031S.m2630a(mediaRouter2M2629a);
                            } else {
                                zM4547t = false;
                            }
                        } else {
                            zM4547t = false;
                        }
                    } else if (i3 >= 31) {
                        Intent intentPutExtra = new Intent().setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG").setPackage("com.android.systemui").putExtra("package_name", context.getPackageName());
                        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(intentPutExtra, 0).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ActivityInfo activityInfo = it.next().activityInfo;
                                if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                                    context.sendBroadcast(intentPutExtra);
                                }
                            } else if (!AbstractC2003a.m4547t(context)) {
                                zM4547t = false;
                            }
                            zM4547t = true;
                        }
                    } else if (i3 == 30) {
                        zM4547t = AbstractC2003a.m4547t(context);
                    } else {
                        zM4547t = false;
                    }
                    if (!zM4547t) {
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            Intent intentPutExtra2 = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra("EXTRA_CONNECTION_ONLY", true).putExtra("android.bluetooth.devicepicker.extra.FILTER_TYPE", 1);
                            Iterator<ResolveInfo> it2 = context.getPackageManager().queryIntentActivities(intentPutExtra2, 0).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z3 = false;
                                    break;
                                }
                                ActivityInfo activityInfo2 = it2.next().activityInfo;
                                if (activityInfo2 != null && (applicationInfo2 = activityInfo2.applicationInfo) != null && (applicationInfo2.flags & 129) != 0) {
                                    context.startActivity(intentPutExtra2);
                                    z3 = true;
                                    break;
                                }
                            }
                            z4 = z3;
                        }
                    }
                    if (z4) {
                        zM2633c = true;
                    } else {
                        zM2633c = m2633c();
                    }
                } else {
                    zM2633c = m2633c();
                }
            }
        } else {
            zM2633c = false;
        }
        return zM2633c || zPerformClick;
    }

    @Deprecated
    public void setAlwaysVisible(boolean z3) {
    }

    public void setCheatSheetEnabled(boolean z3) {
        if (z3 != this.f4544u) {
            this.f4544u = z3;
            m2634d();
        }
    }

    public void setDialogFactory(C1053v c1053v) {
        if (c1053v == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.f4533j = c1053v;
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.f4538o = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        AsyncTaskC1032a asyncTaskC1032a = this.f4536m;
        if (asyncTaskC1032a != null) {
            asyncTaskC1032a.cancel(false);
        }
        Drawable drawable2 = this.f4537n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4537n);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.f4541r;
            if (colorStateList != null) {
                drawable = AbstractC2003a.m4548u(drawable.mutate());
                AbstractC2279a.m4892h(drawable, colorStateList);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.f4537n = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(C1451x c1451x) {
        if (c1451x == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f4532i.equals(c1451x)) {
            return;
        }
        if (this.f4534k) {
            boolean zM3642d = this.f4532i.m3642d();
            C1020G c1020g = this.f4531h;
            C1405E c1405e = this.f4530g;
            if (!zM3642d) {
                c1405e.m3518h(c1020g);
            }
            if (!c1451x.m3642d()) {
                c1405e.m3517a(c1451x, c1020g, 0);
            }
        }
        this.f4532i = c1451x;
        m2632b();
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        Drawable drawable = this.f4537n;
        if (drawable != null) {
            drawable.setVisible(i3 == 0, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4537n;
    }
}
