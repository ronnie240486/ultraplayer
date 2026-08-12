package p148t;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p144s.C2212f;
import p144s.C2213g;
import p160x.C2348g;

/* JADX INFO: renamed from: t.j */
/* JADX INFO: loaded from: classes.dex */
public class C2271j extends C2269h {

    /* JADX INFO: renamed from: n */
    public final Class f9716n;

    /* JADX INFO: renamed from: o */
    public final Constructor f9717o;

    /* JADX INFO: renamed from: p */
    public final Method f9718p;

    /* JADX INFO: renamed from: q */
    public final Method f9719q;

    /* JADX INFO: renamed from: r */
    public final Method f9720r;

    /* JADX INFO: renamed from: s */
    public final Method f9721s;

    /* JADX INFO: renamed from: t */
    public final Method f9722t;

    public C2271j() throws NoSuchMethodException {
        Method methodMo4879n0;
        Constructor<?> constructor;
        Method methodM4873m0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM4873m0 = m4873m0(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo4879n0 = mo4879n0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e3.getClass().getName()), e3);
            methodMo4879n0 = null;
            constructor = null;
            methodM4873m0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f9716n = cls;
        this.f9717o = constructor;
        this.f9718p = methodM4873m0;
        this.f9719q = method;
        this.f9720r = method2;
        this.f9721s = method3;
        this.f9722t = methodMo4879n0;
    }

    /* JADX INFO: renamed from: m0 */
    public static Method m4873m0(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m4874h0(Object obj) {
        try {
            this.f9721s.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m4875i0(Context context, Object obj, String str, int i3, int i4, int i5, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f9718p.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public Typeface mo4876j0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f9716n, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f9722t.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m4877k0(Object obj) {
        try {
            return ((Boolean) this.f9720r.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // p148t.C2269h, p066W1.AbstractC0664e
    /* JADX INFO: renamed from: l */
    public final Typeface mo1770l(Context context, C2212f c2212f, Resources resources, int i3) {
        Method method = this.f9718p;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo1770l(context, c2212f, resources, i3);
        }
        Object objM4878l0 = m4878l0();
        if (objM4878l0 != null) {
            C2213g[] c2213gArr = c2212f.f9514a;
            int length = c2213gArr.length;
            int i4 = 0;
            while (i4 < length) {
                C2213g c2213g = c2213gArr[i4];
                String str = c2213g.f9515a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c2213g.f9518d);
                Context context2 = context;
                if (!m4875i0(context2, objM4878l0, str, c2213g.f9519e, c2213g.f9516b, c2213g.f9517c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    m4874h0(objM4878l0);
                    return null;
                }
                i4++;
                context = context2;
            }
            if (m4877k0(objM4878l0)) {
                return mo4876j0(objM4878l0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public final Object m4878l0() {
        try {
            return this.f9717o.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p148t.C2269h, p066W1.AbstractC0664e
    /* JADX INFO: renamed from: m */
    public final Typeface mo1771m(Context context, C2348g[] c2348gArr, int i3) {
        Typeface typefaceMo4876j0;
        boolean zBooleanValue;
        if (c2348gArr.length >= 1) {
            Method method = this.f9718p;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap map = new HashMap();
                for (C2348g c2348g : c2348gArr) {
                    if (c2348g.f9864e == 0) {
                        Uri uri = c2348g.f9860a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, AbstractC1303m.m3333z(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objM4878l0 = m4878l0();
                if (objM4878l0 != null) {
                    boolean z3 = false;
                    for (C2348g c2348g2 : c2348gArr) {
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c2348g2.f9860a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.f9719q.invoke(objM4878l0, byteBuffer, Integer.valueOf(c2348g2.f9861b), null, Integer.valueOf(c2348g2.f9862c), Integer.valueOf(c2348g2.f9863d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                m4874h0(objM4878l0);
                                return null;
                            }
                            z3 = true;
                        }
                    }
                    if (!z3) {
                        m4874h0(objM4878l0);
                        return null;
                    }
                    if (m4877k0(objM4878l0) && (typefaceMo4876j0 = mo4876j0(objM4878l0)) != null) {
                        return Typeface.create(typefaceMo4876j0, i3);
                    }
                }
            } else {
                C2348g c2348gMo1774y = mo1774y(c2348gArr, i3);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c2348gMo1774y.f9860a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c2348gMo1774y.f9862c).setItalic(c2348gMo1774y.f9863d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    public Method mo4879n0(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: o */
    public final Typeface mo1773o(Context context, Resources resources, int i3, String str, int i4) {
        Method method = this.f9718p;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo1773o(context, resources, i3, str, i4);
        }
        Object objM4878l0 = m4878l0();
        if (objM4878l0 != null) {
            if (!m4875i0(context, objM4878l0, str, 0, -1, -1, null)) {
                m4874h0(objM4878l0);
                return null;
            }
            if (m4877k0(objM4878l0)) {
                return mo4876j0(objM4878l0);
            }
        }
        return null;
    }
}
