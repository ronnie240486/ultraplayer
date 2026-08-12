package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Interpolator;
import p009D0.C0106b;

/* JADX INFO: renamed from: androidx.mediarouter.app.P */
/* JADX INFO: loaded from: classes.dex */
public final class C1029P {

    /* JADX INFO: renamed from: a */
    public final BitmapDrawable f4512a;

    /* JADX INFO: renamed from: c */
    public final Rect f4514c;

    /* JADX INFO: renamed from: d */
    public Interpolator f4515d;

    /* JADX INFO: renamed from: e */
    public long f4516e;

    /* JADX INFO: renamed from: f */
    public final Rect f4517f;

    /* JADX INFO: renamed from: g */
    public int f4518g;

    /* JADX INFO: renamed from: i */
    public long f4520i;

    /* JADX INFO: renamed from: j */
    public boolean f4521j;

    /* JADX INFO: renamed from: k */
    public boolean f4522k;

    /* JADX INFO: renamed from: l */
    public C0106b f4523l;

    /* JADX INFO: renamed from: b */
    public float f4513b = 1.0f;

    /* JADX INFO: renamed from: h */
    public float f4519h = 1.0f;

    public C1029P(BitmapDrawable bitmapDrawable, Rect rect) {
        this.f4512a = bitmapDrawable;
        this.f4517f = rect;
        Rect rect2 = new Rect(rect);
        this.f4514c = rect2;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.f4513b * 255.0f));
            bitmapDrawable.setBounds(rect2);
        }
    }
}
