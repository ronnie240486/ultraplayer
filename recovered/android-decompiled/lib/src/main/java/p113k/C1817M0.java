package p113k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.zuxoplayer.app.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p046P1.C0475c;
import p118l1.C1990p;
import p122m1.AbstractC2003a;
import p124n.AbstractC2020g;
import p124n.C2021h;
import p124n.C2022i;
import p124n.C2023j;
import p140r.AbstractC2181a;
import p152u.AbstractC2279a;

/* JADX INFO: renamed from: k.M0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1817M0 {

    /* JADX INFO: renamed from: i */
    public static C1817M0 f8051i;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f8053a;

    /* JADX INFO: renamed from: b */
    public C2022i f8054b;

    /* JADX INFO: renamed from: c */
    public C2023j f8055c;

    /* JADX INFO: renamed from: d */
    public final WeakHashMap f8056d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e */
    public TypedValue f8057e;

    /* JADX INFO: renamed from: f */
    public boolean f8058f;

    /* JADX INFO: renamed from: g */
    public C0475c f8059g;

    /* JADX INFO: renamed from: h */
    public static final PorterDuff.Mode f8050h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j */
    public static final C1813K0 f8052j = new C1813K0(6);

    /* JADX INFO: renamed from: d */
    public static synchronized C1817M0 m4317d() {
        try {
            if (f8051i == null) {
                C1817M0 c1817m0 = new C1817M0();
                f8051i = c1817m0;
                m4319j(c1817m0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8051i;
    }

    /* JADX INFO: renamed from: h */
    public static synchronized PorterDuffColorFilter m4318h(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C1813K0 c1813k0 = f8052j;
        c1813k0.getClass();
        int i4 = (31 + i3) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c1813k0.m1020d(Integer.valueOf(mode.hashCode() + i4));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: j */
    public static void m4319j(C1817M0 c1817m0) {
        if (Build.VERSION.SDK_INT < 24) {
            c1817m0.m4320a("vector", new C1815L0(3));
            c1817m0.m4320a("animated-vector", new C1815L0(2));
            c1817m0.m4320a("animated-selector", new C1815L0(1));
            c1817m0.m4320a("drawable", new C1815L0(0));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4320a(String str, C1815L0 c1815l0) {
        if (this.f8054b == null) {
            this.f8054b = new C2022i();
        }
        this.f8054b.put(str, c1815l0);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4321b(Context context, long j3, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C2021h c2021h = (C2021h) this.f8056d.get(context);
                if (c2021h == null) {
                    c2021h = new C2021h();
                    this.f8056d.put(context, c2021h);
                }
                c2021h.m4583e(j3, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Drawable m4322c(Context context, int i3) {
        if (this.f8057e == null) {
            this.f8057e = new TypedValue();
        }
        TypedValue typedValue = this.f8057e;
        context.getResources().getValue(i3, typedValue, true);
        long j3 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableM4323e = m4323e(context, j3);
        if (drawableM4323e != null) {
            return drawableM4323e;
        }
        LayerDrawable layerDrawableM1189g = null;
        if (this.f8059g != null) {
            if (i3 == R.drawable.abc_cab_background_top_material) {
                layerDrawableM1189g = new LayerDrawable(new Drawable[]{m4324f(context, R.drawable.abc_cab_background_internal_bg), m4324f(context, 2131230737)});
            } else if (i3 == R.drawable.abc_ratingbar_material) {
                layerDrawableM1189g = C0475c.m1189g(this, context, R.dimen.abc_star_big);
            } else if (i3 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM1189g = C0475c.m1189g(this, context, R.dimen.abc_star_medium);
            } else if (i3 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM1189g = C0475c.m1189g(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM1189g != null) {
            layerDrawableM1189g.setChangingConfigurations(typedValue.changingConfigurations);
            m4321b(context, j3, layerDrawableM1189g);
        }
        return layerDrawableM1189g;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized Drawable m4323e(Context context, long j3) {
        C2021h c2021h = (C2021h) this.f8056d.get(context);
        if (c2021h == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c2021h.m4582d(j3, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iM4578b = AbstractC2020g.m4578b(c2021h.f8782h, c2021h.f8784j, j3);
            if (iM4578b >= 0) {
                Object[] objArr = c2021h.f8783i;
                Object obj = objArr[iM4578b];
                Object obj2 = C2021h.f8780k;
                if (obj != obj2) {
                    objArr[iM4578b] = obj2;
                    c2021h.f8781g = true;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized Drawable m4324f(Context context, int i3) {
        return m4325g(context, i3, false);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized Drawable m4325g(Context context, int i3, boolean z3) {
        Drawable drawableM4327k;
        try {
            if (!this.f8058f) {
                this.f8058f = true;
                Drawable drawableM4324f = m4324f(context, R.drawable.abc_vector_test);
                if (drawableM4324f == null || (!(drawableM4324f instanceof C1990p) && !"android.graphics.drawable.VectorDrawable".equals(drawableM4324f.getClass().getName()))) {
                    this.f8058f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM4327k = m4327k(context, i3);
            if (drawableM4327k == null) {
                drawableM4327k = m4322c(context, i3);
            }
            if (drawableM4327k == null) {
                drawableM4327k = AbstractC2181a.m4765b(context, i3);
            }
            if (drawableM4327k != null) {
                drawableM4327k = m4330n(context, i3, z3, drawableM4327k);
            }
            if (drawableM4327k != null) {
                AbstractC1877l0.m4396a(drawableM4327k);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM4327k;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized ColorStateList m4326i(Context context, int i3) {
        ColorStateList colorStateList;
        C2023j c2023j;
        WeakHashMap weakHashMap = this.f8053a;
        ColorStateList colorStateListM1195h = null;
        colorStateList = (weakHashMap == null || (c2023j = (C2023j) weakHashMap.get(context)) == null) ? null : (ColorStateList) c2023j.m4595c(i3, null);
        if (colorStateList == null) {
            C0475c c0475c = this.f8059g;
            if (c0475c != null) {
                colorStateListM1195h = c0475c.m1195h(context, i3);
            }
            if (colorStateListM1195h != null) {
                if (this.f8053a == null) {
                    this.f8053a = new WeakHashMap();
                }
                C2023j c2023j2 = (C2023j) this.f8053a.get(context);
                if (c2023j2 == null) {
                    c2023j2 = new C2023j();
                    this.f8053a.put(context, c2023j2);
                }
                c2023j2.m4593a(i3, colorStateListM1195h);
            }
            colorStateList = colorStateListM1195h;
        }
        return colorStateList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r11.f8054b.getOrDefault(r0, null) != null) goto L15;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m4327k(Context context, int i3) {
        int next;
        C2022i c2022i = this.f8054b;
        if (c2022i != null && !c2022i.isEmpty()) {
            C2023j c2023j = this.f8055c;
            if (c2023j != null) {
                String str = (String) c2023j.m4595c(i3, null);
                if (!"appcompat_skip_skip".equals(str)) {
                    if (str != null) {
                    }
                }
            } else {
                this.f8055c = new C2023j();
            }
            if (this.f8057e == null) {
                this.f8057e = new TypedValue();
            }
            TypedValue typedValue = this.f8057e;
            Resources resources = context.getResources();
            resources.getValue(i3, typedValue, true);
            long j3 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
            Drawable drawableM4323e = m4323e(context, j3);
            if (drawableM4323e != null) {
                return drawableM4323e;
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                try {
                    XmlResourceParser xml = resources.getXml(i3);
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    String name = xml.getName();
                    this.f8055c.m4593a(i3, name);
                    C1815L0 c1815l0 = (C1815L0) this.f8054b.getOrDefault(name, null);
                    if (c1815l0 != null) {
                        drawableM4323e = c1815l0.m4316a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                    }
                    if (drawableM4323e != null) {
                        drawableM4323e.setChangingConfigurations(typedValue.changingConfigurations);
                        m4321b(context, j3, drawableM4323e);
                    }
                } catch (Exception e3) {
                    Log.e("ResourceManagerInternal", "Exception while inflating drawable", e3);
                }
            }
            if (drawableM4323e == null) {
                this.f8055c.m4593a(i3, "appcompat_skip_skip");
            }
            return drawableM4323e;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m4328l(Context context) {
        C2021h c2021h = (C2021h) this.f8056d.get(context);
        if (c2021h != null) {
            int i3 = c2021h.f8784j;
            Object[] objArr = c2021h.f8783i;
            for (int i4 = 0; i4 < i3; i4++) {
                objArr[i4] = null;
            }
            c2021h.f8784j = 0;
            c2021h.f8781g = false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m4329m(C0475c c0475c) {
        this.f8059g = c0475c;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public final Drawable m4330n(Context context, int i3, boolean z3, Drawable drawable) {
        int i4;
        int iRound;
        boolean z4;
        Drawable drawableMutate;
        int iM4336c;
        ColorStateList colorStateListM4326i = m4326i(context, i3);
        PorterDuff.Mode mode = null;
        if (colorStateListM4326i != null) {
            Drawable drawableM4548u = AbstractC2003a.m4548u(drawable.mutate());
            AbstractC2279a.m4892h(drawableM4548u, colorStateListM4326i);
            if (this.f8059g != null && i3 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                AbstractC2279a.m4893i(drawableM4548u, mode);
            }
            return drawableM4548u;
        }
        if (this.f8059g != null) {
            if (i3 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM4336c2 = AbstractC1826R0.m4336c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C1891s.f8262b;
                C0475c.m1191j(drawableFindDrawableByLayerId, iM4336c2, mode2);
                C0475c.m1191j(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1826R0.m4336c(context, R.attr.colorControlNormal), mode2);
                C0475c.m1191j(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC1826R0.m4336c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i3 == R.drawable.abc_ratingbar_material || i3 == R.drawable.abc_ratingbar_indicator_material || i3 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM4335b = AbstractC1826R0.m4335b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C1891s.f8262b;
                C0475c.m1191j(drawableFindDrawableByLayerId2, iM4335b, mode3);
                C0475c.m1191j(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1826R0.m4336c(context, R.attr.colorControlActivated), mode3);
                C0475c.m1191j(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC1826R0.m4336c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C0475c c0475c = this.f8059g;
        boolean z5 = false;
        if (c0475c != null) {
            PorterDuff.Mode mode4 = C1891s.f8262b;
            if (C0475c.m1186c((int[]) c0475c.f1568a, i3)) {
                i4 = R.attr.colorControlNormal;
            } else if (C0475c.m1186c((int[]) c0475c.f1570c, i3)) {
                i4 = R.attr.colorControlActivated;
            } else {
                if (C0475c.m1186c((int[]) c0475c.f1571d, i3)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i3 == 2131230757) {
                        iRound = Math.round(40.8f);
                        i4 = android.R.attr.colorForeground;
                        z4 = true;
                    } else if (i3 != R.drawable.abc_dialog_material_background) {
                        i4 = 0;
                        iRound = -1;
                        z4 = false;
                    }
                    if (z4) {
                        drawableMutate = drawable.mutate();
                        iM4336c = AbstractC1826R0.m4336c(context, i4);
                        synchronized (C1891s.class) {
                            PorterDuffColorFilter porterDuffColorFilterM4318h = m4318h(iM4336c, mode4);
                        }
                        drawableMutate.setColorFilter(porterDuffColorFilterM4318h);
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z5 = true;
                    }
                }
                i4 = android.R.attr.colorBackground;
            }
            iRound = -1;
            z4 = true;
            if (z4) {
                drawableMutate = drawable.mutate();
                iM4336c = AbstractC1826R0.m4336c(context, i4);
                synchronized (C1891s.class) {
                    PorterDuffColorFilter porterDuffColorFilterM4318h2 = m4318h(iM4336c, mode4);
                    drawableMutate.setColorFilter(porterDuffColorFilterM4318h2);
                    if (iRound != -1) {
                        drawableMutate.setAlpha(iRound);
                    }
                    z5 = true;
                }
            }
        }
        if (z5 || !z3) {
            return drawable;
        }
        return null;
    }
}
