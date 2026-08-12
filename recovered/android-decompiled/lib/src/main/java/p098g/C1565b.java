package p098g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import p122m1.AbstractC2003a;
import p124n.C2021h;
import p124n.C2023j;
import p152u.AbstractC2279a;

/* JADX INFO: renamed from: g.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1565b extends Drawable.ConstantState {

    /* JADX INFO: renamed from: A */
    public boolean f7078A;

    /* JADX INFO: renamed from: B */
    public ColorFilter f7079B;

    /* JADX INFO: renamed from: C */
    public boolean f7080C;

    /* JADX INFO: renamed from: D */
    public ColorStateList f7081D;

    /* JADX INFO: renamed from: E */
    public PorterDuff.Mode f7082E;

    /* JADX INFO: renamed from: F */
    public boolean f7083F;

    /* JADX INFO: renamed from: G */
    public boolean f7084G;

    /* JADX INFO: renamed from: H */
    public int[][] f7085H;

    /* JADX INFO: renamed from: I */
    public C2021h f7086I;

    /* JADX INFO: renamed from: J */
    public C2023j f7087J;

    /* JADX INFO: renamed from: a */
    public final C1568e f7088a;

    /* JADX INFO: renamed from: b */
    public Resources f7089b;

    /* JADX INFO: renamed from: c */
    public int f7090c;

    /* JADX INFO: renamed from: d */
    public int f7091d;

    /* JADX INFO: renamed from: e */
    public int f7092e;

    /* JADX INFO: renamed from: f */
    public SparseArray f7093f;

    /* JADX INFO: renamed from: g */
    public Drawable[] f7094g;

    /* JADX INFO: renamed from: h */
    public int f7095h;

    /* JADX INFO: renamed from: i */
    public boolean f7096i;

    /* JADX INFO: renamed from: j */
    public boolean f7097j;

    /* JADX INFO: renamed from: k */
    public Rect f7098k;

    /* JADX INFO: renamed from: l */
    public boolean f7099l;

    /* JADX INFO: renamed from: m */
    public boolean f7100m;

    /* JADX INFO: renamed from: n */
    public int f7101n;

    /* JADX INFO: renamed from: o */
    public int f7102o;

    /* JADX INFO: renamed from: p */
    public int f7103p;

    /* JADX INFO: renamed from: q */
    public int f7104q;

    /* JADX INFO: renamed from: r */
    public boolean f7105r;

    /* JADX INFO: renamed from: s */
    public int f7106s;

    /* JADX INFO: renamed from: t */
    public boolean f7107t;

    /* JADX INFO: renamed from: u */
    public boolean f7108u;

    /* JADX INFO: renamed from: v */
    public boolean f7109v;

    /* JADX INFO: renamed from: w */
    public boolean f7110w;

    /* JADX INFO: renamed from: x */
    public int f7111x;

    /* JADX INFO: renamed from: y */
    public int f7112y;

    /* JADX INFO: renamed from: z */
    public int f7113z;

    public C1565b(C1565b c1565b, C1568e c1568e, Resources resources) {
        this.f7096i = false;
        this.f7099l = false;
        this.f7110w = true;
        this.f7112y = 0;
        this.f7113z = 0;
        this.f7088a = c1568e;
        this.f7089b = resources != null ? resources : c1565b != null ? c1565b.f7089b : null;
        int i3 = c1565b != null ? c1565b.f7090c : 0;
        int i4 = AbstractC1570g.f7128s;
        i3 = resources != null ? resources.getDisplayMetrics().densityDpi : i3;
        i3 = i3 == 0 ? 160 : i3;
        this.f7090c = i3;
        if (c1565b != null) {
            this.f7091d = c1565b.f7091d;
            this.f7092e = c1565b.f7092e;
            this.f7108u = true;
            this.f7109v = true;
            this.f7096i = c1565b.f7096i;
            this.f7099l = c1565b.f7099l;
            this.f7110w = c1565b.f7110w;
            this.f7111x = c1565b.f7111x;
            this.f7112y = c1565b.f7112y;
            this.f7113z = c1565b.f7113z;
            this.f7078A = c1565b.f7078A;
            this.f7079B = c1565b.f7079B;
            this.f7080C = c1565b.f7080C;
            this.f7081D = c1565b.f7081D;
            this.f7082E = c1565b.f7082E;
            this.f7083F = c1565b.f7083F;
            this.f7084G = c1565b.f7084G;
            if (c1565b.f7090c == i3) {
                if (c1565b.f7097j) {
                    this.f7098k = c1565b.f7098k != null ? new Rect(c1565b.f7098k) : null;
                    this.f7097j = true;
                }
                if (c1565b.f7100m) {
                    this.f7101n = c1565b.f7101n;
                    this.f7102o = c1565b.f7102o;
                    this.f7103p = c1565b.f7103p;
                    this.f7104q = c1565b.f7104q;
                    this.f7100m = true;
                }
            }
            if (c1565b.f7105r) {
                this.f7106s = c1565b.f7106s;
                this.f7105r = true;
            }
            if (c1565b.f7107t) {
                this.f7107t = true;
            }
            Drawable[] drawableArr = c1565b.f7094g;
            this.f7094g = new Drawable[drawableArr.length];
            this.f7095h = c1565b.f7095h;
            SparseArray sparseArray = c1565b.f7093f;
            if (sparseArray != null) {
                this.f7093f = sparseArray.clone();
            } else {
                this.f7093f = new SparseArray(this.f7095h);
            }
            int i5 = this.f7095h;
            for (int i6 = 0; i6 < i5; i6++) {
                Drawable drawable = drawableArr[i6];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f7093f.put(i6, constantState);
                    } else {
                        this.f7094g[i6] = drawableArr[i6];
                    }
                }
            }
        } else {
            this.f7094g = new Drawable[10];
            this.f7095h = 0;
        }
        if (c1565b != null) {
            this.f7085H = c1565b.f7085H;
        } else {
            this.f7085H = new int[this.f7094g.length][];
        }
        if (c1565b != null) {
            this.f7086I = c1565b.f7086I;
            this.f7087J = c1565b.f7087J;
        } else {
            this.f7086I = new C2021h();
            this.f7087J = new C2023j();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m3892a(Drawable drawable) {
        int i3 = this.f7095h;
        if (i3 >= this.f7094g.length) {
            int i4 = i3 + 10;
            Drawable[] drawableArr = new Drawable[i4];
            Drawable[] drawableArr2 = this.f7094g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i3);
            }
            this.f7094g = drawableArr;
            int[][] iArr = new int[i4][];
            System.arraycopy(this.f7085H, 0, iArr, 0, i3);
            this.f7085H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f7088a);
        this.f7094g[i3] = drawable;
        this.f7095h++;
        this.f7092e = drawable.getChangingConfigurations() | this.f7092e;
        this.f7105r = false;
        this.f7107t = false;
        this.f7098k = null;
        this.f7097j = false;
        this.f7100m = false;
        this.f7108u = false;
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public final void m3893b() {
        this.f7100m = true;
        m3894c();
        int i3 = this.f7095h;
        Drawable[] drawableArr = this.f7094g;
        this.f7102o = -1;
        this.f7101n = -1;
        this.f7104q = 0;
        this.f7103p = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f7101n) {
                this.f7101n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f7102o) {
                this.f7102o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f7103p) {
                this.f7103p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f7104q) {
                this.f7104q = minimumHeight;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3894c() {
        SparseArray sparseArray = this.f7093f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.f7093f.keyAt(i3);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7093f.valueAt(i3);
                Drawable[] drawableArr = this.f7094g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f7089b);
                if (Build.VERSION.SDK_INT >= 23) {
                    AbstractC2003a.m4545r(drawableNewDrawable, this.f7111x);
                }
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f7088a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f7093f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i3 = this.f7095h;
        Drawable[] drawableArr = this.f7094g;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7093f.get(i4);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (AbstractC2279a.m4886b(drawable)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m3895d(int i3) {
        int iIndexOfKey;
        Drawable drawable = this.f7094g[i3];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f7093f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i3)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f7093f.valueAt(iIndexOfKey)).newDrawable(this.f7089b);
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC2003a.m4545r(drawableNewDrawable, this.f7111x);
        }
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f7088a);
        this.f7094g[i3] = drawableMutate;
        this.f7093f.removeAt(iIndexOfKey);
        if (this.f7093f.size() == 0) {
            this.f7093f = null;
        }
        return drawableMutate;
    }

    /* JADX INFO: renamed from: e */
    public final int m3896e(int[] iArr) {
        int[][] iArr2 = this.f7085H;
        int i3 = this.f7095h;
        for (int i4 = 0; i4 < i3; i4++) {
            if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f7091d | this.f7092e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1568e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C1568e(this, resources);
    }
}
