package p000A;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p148t.C2264c;

/* JADX INFO: renamed from: A.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0032d0 extends AbstractC0040h0 {

    /* JADX INFO: renamed from: c */
    public static Field f39c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f40d = false;

    /* JADX INFO: renamed from: e */
    public static Constructor f41e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f42f = false;

    /* JADX INFO: renamed from: a */
    public WindowInsets f43a;

    /* JADX INFO: renamed from: b */
    public C2264c f44b;

    public C0032d0() {
        this.f43a = m179e();
    }

    /* JADX INFO: renamed from: e */
    private static WindowInsets m179e() {
        if (!f40d) {
            try {
                f39c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
            }
            f40d = true;
        }
        Field field = f39c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e4);
            }
        }
        if (!f42f) {
            try {
                f41e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e5);
            }
            f42f = true;
        }
        Constructor constructor = f41e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e6);
            }
        }
        return null;
    }

    @Override // p000A.AbstractC0040h0
    /* JADX INFO: renamed from: b */
    public C0056p0 mo180b() {
        m213a();
        C0056p0 c0056p0M316c = C0056p0.m316c(this.f43a, null);
        C0054o0 c0054o0 = c0056p0M316c.f81a;
        c0054o0.mo221k(null);
        c0054o0.mo228m(this.f44b);
        return c0056p0M316c;
    }

    @Override // p000A.AbstractC0040h0
    /* JADX INFO: renamed from: c */
    public void mo181c(C2264c c2264c) {
        this.f44b = c2264c;
    }

    @Override // p000A.AbstractC0040h0
    /* JADX INFO: renamed from: d */
    public void mo182d(C2264c c2264c) {
        WindowInsets windowInsets = this.f43a;
        if (windowInsets != null) {
            this.f43a = windowInsets.replaceSystemWindowInsets(c2264c.f9698a, c2264c.f9699b, c2264c.f9700c, c2264c.f9701d);
        }
    }

    public C0032d0(C0056p0 c0056p0) {
        super(c0056p0);
        this.f43a = c0056p0.m317b();
    }
}
