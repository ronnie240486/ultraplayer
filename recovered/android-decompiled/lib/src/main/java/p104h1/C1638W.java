package p104h1;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: renamed from: h1.W */
/* JADX INFO: loaded from: classes.dex */
public final class C1638W {

    /* JADX INFO: renamed from: a */
    public int f7428a;

    /* JADX INFO: renamed from: b */
    public int f7429b;

    /* JADX INFO: renamed from: c */
    public boolean f7430c;

    /* JADX INFO: renamed from: d */
    public boolean f7431d;

    /* JADX INFO: renamed from: e */
    public boolean f7432e;

    /* JADX INFO: renamed from: f */
    public int[] f7433f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f7434g;

    public C1638W(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f7434g = staggeredGridLayoutManager;
        m4062a();
    }

    /* JADX INFO: renamed from: a */
    public final void m4062a() {
        this.f7428a = -1;
        this.f7429b = Integer.MIN_VALUE;
        this.f7430c = false;
        this.f7431d = false;
        this.f7432e = false;
        int[] iArr = this.f7433f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
