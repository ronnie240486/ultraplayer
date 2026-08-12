package p046P1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.support.v4.media.session.C0858A;
import android.view.Surface;
import com.zuxoplayer.app.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p036M0.C0380q;
import p055T.AbstractC0558V;
import p055T.C0556T;
import p055T.C0583o;
import p060U1.AbstractC0610a;
import p064W.AbstractC0632A;
import p077a0.C0792C;
import p090d2.C1454a;
import p103h0.C1606o;
import p105h2.AbstractC1676G;
import p105h2.C1700c0;
import p113k.AbstractC1826R0;
import p113k.C1817M0;
import p113k.C1891s;
import p114k0.C1907A;
import p122m1.AbstractC2003a;
import p138q1.C2172h;
import p138q1.C2176l;
import p148t.AbstractC2262a;

/* JADX INFO: renamed from: P1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0475c {

    /* JADX INFO: renamed from: a */
    public Object f1568a;

    /* JADX INFO: renamed from: b */
    public Object f1569b;

    /* JADX INFO: renamed from: c */
    public Object f1570c;

    /* JADX INFO: renamed from: d */
    public Object f1571d;

    /* JADX INFO: renamed from: e */
    public Object f1572e;

    /* JADX INFO: renamed from: f */
    public Object f1573f;

    public C0475c(Set set, String str, String str2) {
        C1454a c1454a = C1454a.f6424b;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f1568a = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f1570c = str;
        this.f1571d = str2;
        this.f1572e = c1454a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f1569b = Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1186c(int[] iArr, int i3) {
        for (int i4 : iArr) {
            if (i4 == i3) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static ColorStateList m1187e(Context context, int i3) {
        int iM4336c = AbstractC1826R0.m4336c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{AbstractC1826R0.f8084b, AbstractC1826R0.f8086d, AbstractC1826R0.f8085c, AbstractC1826R0.f8088f}, new int[]{AbstractC1826R0.m4335b(context, R.attr.colorButtonNormal), AbstractC2262a.m4858f(iM4336c, i3), AbstractC2262a.m4858f(iM4336c, i3), i3});
    }

    /* JADX INFO: renamed from: f */
    public static C1907A m1188f(C0792C c0792c, AbstractC1676G abstractC1676G, C1907A c1907a, C0556T c0556t) {
        AbstractC0558V abstractC0558VMo1324w = c0792c.mo1324w();
        int iMo1084F = c0792c.mo1084F();
        Object objMo1331l = abstractC0558VMo1324w.m1415p() ? null : abstractC0558VMo1324w.mo1331l(iMo1084F);
        int iM1397b = (c0792c.mo1310j() || abstractC0558VMo1324w.m1415p()) ? -1 : abstractC0558VMo1324w.mo1329f(iMo1084F, c0556t, false).m1397b(AbstractC0632A.m1571L(c0792c.mo1291M()) - c0556t.f1970e);
        for (int i3 = 0; i3 < abstractC1676G.size(); i3++) {
            C1907A c1907a2 = (C1907A) abstractC1676G.get(i3);
            if (m1190i(c1907a2, objMo1331l, c0792c.mo1310j(), c0792c.m1913g0(), c0792c.m1914h0(), iM1397b)) {
                return c1907a2;
            }
        }
        if (abstractC1676G.isEmpty() && c1907a != null && m1190i(c1907a, objMo1331l, c0792c.mo1310j(), c0792c.m1913g0(), c0792c.m1914h0(), iM1397b)) {
            return c1907a;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static LayerDrawable m1189g(C1817M0 c1817m0, Context context, int i3) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i3);
        Drawable drawableM4324f = c1817m0.m4324f(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM4324f2 = c1817m0.m4324f(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM4324f instanceof BitmapDrawable) && drawableM4324f.getIntrinsicWidth() == dimensionPixelSize && drawableM4324f.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM4324f;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM4324f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM4324f.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM4324f2 instanceof BitmapDrawable) && drawableM4324f2.getIntrinsicWidth() == dimensionPixelSize && drawableM4324f2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM4324f2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM4324f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM4324f2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1190i(C1907A c1907a, Object obj, boolean z3, int i3, int i4, int i5) {
        if (!c1907a.f8311a.equals(obj)) {
            return false;
        }
        int i6 = c1907a.f8312b;
        if (z3 && i6 == i3 && c1907a.f8313c == i4) {
            return true;
        }
        return !z3 && i6 == -1 && c1907a.f8315e == i5;
    }

    /* JADX INFO: renamed from: j */
    public static void m1191j(Drawable drawable, int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM4318h;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C1891s.f8262b;
        }
        PorterDuff.Mode mode2 = C1891s.f8262b;
        synchronized (C1891s.class) {
            porterDuffColorFilterM4318h = C1817M0.m4318h(i3, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterM4318h);
    }

    /* JADX INFO: renamed from: a */
    public void m1192a(String str, String str2) {
        HashMap map = (HashMap) this.f1572e;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public void m1193b(C0380q c0380q, C1907A c1907a, AbstractC0558V abstractC0558V) {
        if (c1907a == null) {
            return;
        }
        if (abstractC0558V.mo1328b(c1907a.f8311a) != -1) {
            c0380q.m1051n(c1907a, abstractC0558V);
            return;
        }
        AbstractC0558V abstractC0558V2 = (AbstractC0558V) ((C1700c0) this.f1570c).get(c1907a);
        if (abstractC0558V2 != null) {
            c0380q.m1051n(c1907a, abstractC0558V2);
        }
    }

    /* JADX INFO: renamed from: d */
    public C2172h m1194d() {
        String strConcat = ((String) this.f1570c) == null ? " transportName" : "";
        if (((C2176l) this.f1568a) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.f1569b) == null) {
            strConcat = strConcat + " eventMillis";
        }
        if (((Long) this.f1571d) == null) {
            strConcat = strConcat + " uptimeMillis";
        }
        if (((HashMap) this.f1572e) == null) {
            strConcat = strConcat + " autoMetadata";
        }
        if (strConcat.isEmpty()) {
            return new C2172h((String) this.f1570c, (Integer) this.f1573f, (C2176l) this.f1568a, ((Long) this.f1569b).longValue(), ((Long) this.f1571d).longValue(), (HashMap) this.f1572e);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    /* JADX INFO: renamed from: h */
    public ColorStateList m1195h(Context context, int i3) {
        if (i3 == R.drawable.abc_edit_text_material) {
            return AbstractC0610a.m1510l(context, R.color.abc_tint_edittext);
        }
        if (i3 == 2131230786) {
            return AbstractC0610a.m1510l(context, R.color.abc_tint_switch_track);
        }
        if (i3 != R.drawable.abc_switch_thumb_material) {
            if (i3 == R.drawable.abc_btn_default_mtrl_shape) {
                return m1187e(context, AbstractC1826R0.m4336c(context, R.attr.colorButtonNormal));
            }
            if (i3 == R.drawable.abc_btn_borderless_material) {
                return m1187e(context, 0);
            }
            if (i3 == R.drawable.abc_btn_colored_material) {
                return m1187e(context, AbstractC1826R0.m4336c(context, R.attr.colorAccent));
            }
            if (i3 == 2131230781 || i3 == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC0610a.m1510l(context, R.color.abc_tint_spinner);
            }
            if (m1186c((int[]) this.f1569b, i3)) {
                return AbstractC1826R0.m4337d(context, R.attr.colorControlNormal);
            }
            if (m1186c((int[]) this.f1572e, i3)) {
                return AbstractC0610a.m1510l(context, R.color.abc_tint_default);
            }
            if (m1186c((int[]) this.f1573f, i3)) {
                return AbstractC0610a.m1510l(context, R.color.abc_tint_btn_checkable);
            }
            if (i3 == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC0610a.m1510l(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM4337d = AbstractC1826R0.m4337d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM4337d == null || !colorStateListM4337d.isStateful()) {
            iArr[0] = AbstractC1826R0.f8084b;
            iArr2[0] = AbstractC1826R0.m4335b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC1826R0.f8087e;
            iArr2[1] = AbstractC1826R0.m4336c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1826R0.f8088f;
            iArr2[2] = AbstractC1826R0.m4336c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC1826R0.f8084b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM4337d.getColorForState(iArr3, 0);
            iArr[1] = AbstractC1826R0.f8087e;
            iArr2[1] = AbstractC1826R0.m4336c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1826R0.f8088f;
            iArr2[2] = colorStateListM4337d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: k */
    public void m1196k(AbstractC0558V abstractC0558V) {
        C0380q c0380q = new C0380q(4, 5);
        if (((AbstractC1676G) this.f1569b).isEmpty()) {
            m1193b(c0380q, (C1907A) this.f1572e, abstractC0558V);
            if (!AbstractC2003a.m4538k((C1907A) this.f1573f, (C1907A) this.f1572e)) {
                m1193b(c0380q, (C1907A) this.f1573f, abstractC0558V);
            }
            if (!AbstractC2003a.m4538k((C1907A) this.f1571d, (C1907A) this.f1572e) && !AbstractC2003a.m4538k((C1907A) this.f1571d, (C1907A) this.f1573f)) {
                m1193b(c0380q, (C1907A) this.f1571d, abstractC0558V);
            }
        } else {
            for (int i3 = 0; i3 < ((AbstractC1676G) this.f1569b).size(); i3++) {
                m1193b(c0380q, (C1907A) ((AbstractC1676G) this.f1569b).get(i3), abstractC0558V);
            }
            if (!((AbstractC1676G) this.f1569b).contains((C1907A) this.f1571d)) {
                m1193b(c0380q, (C1907A) this.f1571d, abstractC0558V);
            }
        }
        this.f1570c = c0380q.m1042a();
    }

    public C0475c(C1606o c1606o, MediaFormat mediaFormat, C0583o c0583o, Surface surface, MediaCrypto mediaCrypto, C0858A c0858a) {
        this.f1568a = c1606o;
        this.f1569b = mediaFormat;
        this.f1570c = c0583o;
        this.f1571d = surface;
        this.f1572e = mediaCrypto;
        this.f1573f = c0858a;
    }
}
