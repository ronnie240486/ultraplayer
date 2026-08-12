package p148t;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p066W1.AbstractC0664e;
import p124n.C2022i;
import p144s.C2212f;
import p144s.C2213g;
import p160x.C2348g;

/* JADX INFO: renamed from: t.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2270i extends AbstractC0664e {

    /* JADX INFO: renamed from: i */
    public static final Class f9712i;

    /* JADX INFO: renamed from: j */
    public static final Constructor f9713j;

    /* JADX INFO: renamed from: k */
    public static final Method f9714k;

    /* JADX INFO: renamed from: l */
    public static final Method f9715l;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi24Impl", e3.getClass().getName(), e3);
            method = null;
            cls = null;
            method2 = null;
        }
        f9713j = constructor;
        f9712i = cls;
        f9714k = method2;
        f9715l = method;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m4871f0(Object obj, ByteBuffer byteBuffer, int i3, int i4, boolean z3) {
        try {
            return ((Boolean) f9714k.invoke(obj, byteBuffer, Integer.valueOf(i3), null, Integer.valueOf(i4), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static Typeface m4872g0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f9712i, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f9715l.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069 A[LOOP:0: B:9:0x0015->B:36:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0068 A[SYNTHETIC] */
    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: l */
    public final Typeface mo1770l(Context context, C2212f c2212f, Resources resources, int i3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f9713j.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (C2213g c2213g : c2212f.f9514a) {
                int i4 = c2213g.f9520f;
                File fileM3325r = AbstractC1303m.m3325r(context);
                if (fileM3325r != null) {
                    try {
                        if (AbstractC1303m.m3314g(fileM3325r, resources, i4)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileM3325r);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileM3325r.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileM3325r.delete();
                        }
                        if (map == null) {
                            if (!m4871f0(objNewInstance, map, c2213g.f9519e, c2213g.f9516b, c2213g.f9517c)) {
                            }
                        }
                    } catch (Throwable th3) {
                        fileM3325r.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map == null) {
                    if (!m4871f0(objNewInstance, map, c2213g.f9519e, c2213g.f9516b, c2213g.f9517c)) {
                    }
                }
            }
            return m4872g0(objNewInstance);
        }
        return null;
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: m */
    public final Typeface mo1771m(Context context, C2348g[] c2348gArr, int i3) {
        Object objNewInstance;
        try {
            objNewInstance = f9713j.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            C2022i c2022i = new C2022i();
            for (C2348g c2348g : c2348gArr) {
                Uri uri = c2348g.f9860a;
                ByteBuffer byteBufferM3333z = (ByteBuffer) c2022i.getOrDefault(uri, null);
                if (byteBufferM3333z == null) {
                    byteBufferM3333z = AbstractC1303m.m3333z(context, uri);
                    c2022i.put(uri, byteBufferM3333z);
                }
                if (byteBufferM3333z != null) {
                    if (m4871f0(objNewInstance, byteBufferM3333z, c2348g.f9861b, c2348g.f9862c, c2348g.f9863d)) {
                    }
                }
            }
            Typeface typefaceM4872g0 = m4872g0(objNewInstance);
            if (typefaceM4872g0 != null) {
                return Typeface.create(typefaceM4872g0, i3);
            }
        }
        return null;
    }
}
