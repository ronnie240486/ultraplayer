package p144s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p036M0.C0368e;
import p036M0.C0370g;
import p064W.RunnableC0647o;
import p148t.AbstractC2268g;

/* JADX INFO: renamed from: s.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2220n {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f9530a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f9531b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public static final Object f9532c = new Object();

    /* JADX INFO: renamed from: a */
    public static void m4801a(C2218l c2218l, int i3, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f9532c) {
            try {
                WeakHashMap weakHashMap = f9531b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(c2218l);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(c2218l, sparseArray);
                }
                sparseArray.append(i3, new C2217k(colorStateList, c2218l.f9528a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c5  */
    /* JADX INFO: renamed from: b */
    public static Typeface m4802b(Context context, int i3, TypedValue typedValue, int i4, C0368e c0368e, boolean z3) {
        Resources resources = context.getResources();
        resources.getValue(i3, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i3) + "\" (" + Integer.toHexString(i3) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM4867a = null;
        if (string.startsWith("res/")) {
            int i5 = typedValue.assetCookie;
            C0370g c0370g = AbstractC2268g.f9706b;
            Typeface typeface = (Typeface) c0370g.m1020d(AbstractC2268g.m4868b(resources, i3, string, i5, i4));
            if (typeface != null) {
                if (c0368e != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0647o(c0368e, 17, typeface));
                }
                typefaceM4867a = typeface;
            } else {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC2211e interfaceC2211eM4788g = AbstractC2208b.m4788g(resources.getXml(i3), resources);
                        if (interfaceC2211eM4788g == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (c0368e != null) {
                                c0368e.m1010b();
                            }
                        } else {
                            typefaceM4867a = AbstractC2268g.m4867a(context, interfaceC2211eM4788g, resources, i3, string, typedValue.assetCookie, i4, c0368e, z3);
                        }
                    } else {
                        int i6 = typedValue.assetCookie;
                        Typeface typefaceMo1773o = AbstractC2268g.f9705a.mo1773o(context, resources, i3, string, i4);
                        if (typefaceMo1773o != null) {
                            c0370g.m1021e(AbstractC2268g.m4868b(resources, i3, string, i6, i4), typefaceMo1773o);
                        }
                        if (c0368e != null) {
                            if (typefaceMo1773o != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC0647o(c0368e, 17, typefaceMo1773o));
                            } else {
                                c0368e.m1010b();
                            }
                        }
                        typefaceM4867a = typefaceMo1773o;
                    }
                } catch (IOException e3) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e3);
                    if (c0368e != null) {
                        c0368e.m1010b();
                    }
                } catch (XmlPullParserException e4) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e4);
                    if (c0368e != null) {
                        c0368e.m1010b();
                    }
                }
            }
        } else if (c0368e != null) {
            c0368e.m1010b();
        }
        if (typefaceM4867a != null || c0368e != null) {
            return typefaceM4867a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i3) + " could not be retrieved.");
    }
}
