package p148t;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p066W1.AbstractC0664e;
import p144s.C2212f;
import p144s.C2213g;
import p160x.C2348g;

/* JADX INFO: renamed from: t.h */
/* JADX INFO: loaded from: classes.dex */
public class C2269h extends AbstractC0664e {

    /* JADX INFO: renamed from: i */
    public static Class f9707i = null;

    /* JADX INFO: renamed from: j */
    public static Constructor f9708j = null;

    /* JADX INFO: renamed from: k */
    public static Method f9709k = null;

    /* JADX INFO: renamed from: l */
    public static Method f9710l = null;

    /* JADX INFO: renamed from: m */
    public static boolean f9711m = false;

    /* JADX INFO: renamed from: f0 */
    public static boolean m4869f0(Object obj, String str, int i3, boolean z3) throws NoSuchMethodException {
        m4870g0();
        try {
            try {
                return ((Boolean) f9709k.invoke(obj, str, Integer.valueOf(i3), Boolean.valueOf(z3))).booleanValue();
            } catch (InvocationTargetException e3) {
                e = e3;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m4870g0() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f9711m) {
            return;
        }
        f9711m = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi21Impl", e3.getClass().getName(), e3);
            method = null;
            cls = null;
            method2 = null;
        }
        f9708j = constructor;
        f9707i = cls;
        f9709k = method2;
        f9710l = method;
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: l */
    public Typeface mo1770l(Context context, C2212f c2212f, Resources resources, int i3) throws NoSuchMethodException {
        m4870g0();
        try {
            Object objNewInstance = f9708j.newInstance(null);
            for (C2213g c2213g : c2212f.f9514a) {
                File fileM3325r = AbstractC1303m.m3325r(context);
                if (fileM3325r == null) {
                    return null;
                }
                try {
                    if (!AbstractC1303m.m3314g(fileM3325r, resources, c2213g.f9520f)) {
                        return null;
                    }
                    if (!m4869f0(objNewInstance, fileM3325r.getPath(), c2213g.f9516b, c2213g.f9517c)) {
                        return null;
                    }
                    fileM3325r.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM3325r.delete();
                }
            }
            m4870g0();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f9707i, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f9710l.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: m */
    public Typeface mo1771m(Context context, C2348g[] c2348gArr, int i3) {
        File file;
        if (c2348gArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mo1774y(c2348gArr, i3).f9860a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceMo1772n = mo1772n(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceMo1772n;
                    } catch (Throwable th3) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
