package p106i;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import p000A.C0026a0;
import p060U1.AbstractC0610a;

/* JADX INFO: renamed from: i.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1742j {

    /* JADX INFO: renamed from: c */
    public Interpolator f7786c;

    /* JADX INFO: renamed from: d */
    public AbstractC0610a f7787d;

    /* JADX INFO: renamed from: e */
    public boolean f7788e;

    /* JADX INFO: renamed from: b */
    public long f7785b = -1;

    /* JADX INFO: renamed from: f */
    public final C1741i f7789f = new C1741i(this);

    /* JADX INFO: renamed from: a */
    public final ArrayList f7784a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m4193a() {
        if (this.f7788e) {
            ArrayList arrayList = this.f7784a;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((C0026a0) obj).m105b();
            }
            this.f7788e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4194b() {
        View view;
        if (this.f7788e) {
            return;
        }
        ArrayList arrayList = this.f7784a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            C0026a0 c0026a0 = (C0026a0) obj;
            long j3 = this.f7785b;
            if (j3 >= 0) {
                c0026a0.m106c(j3);
            }
            Interpolator interpolator = this.f7786c;
            if (interpolator != null && (view = (View) c0026a0.f29a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f7787d != null) {
                c0026a0.m107d(this.f7789f);
            }
            View view2 = (View) c0026a0.f29a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f7788e = true;
    }
}
