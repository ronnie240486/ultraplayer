package p014F;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: F.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0157f {
    /* JADX INFO: renamed from: a */
    public static EdgeEffect m615a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX INFO: renamed from: b */
    public static float m616b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m617c(EdgeEffect edgeEffect, float f, float f3) {
        try {
            return edgeEffect.onPullDistance(f, f3);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f3);
            return 0.0f;
        }
    }
}
