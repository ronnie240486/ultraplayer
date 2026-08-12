package p113k;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import p098g.C1568e;
import p102h.AbstractC1590a;
import p118l1.C1978d;
import p118l1.C1990p;

/* JADX INFO: renamed from: k.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1815L0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8047a;

    public /* synthetic */ C1815L0(int i3) {
        this.f8047a = i3;
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m4316a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f8047a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) C1815L0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    AbstractC1590a.m3918c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e3) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e3);
                    return null;
                }
            case 1:
                try {
                    return C1568e.m3897e(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e4) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e4);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    C1978d c1978d = new C1978d(context);
                    c1978d.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return c1978d;
                } catch (Exception e5) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e5);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    C1990p c1990p = new C1990p();
                    c1990p.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return c1990p;
                } catch (Exception e6) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e6);
                    return null;
                }
        }
    }
}
