package p000A;

import android.view.View;
import p104h1.AbstractC1635T;

/* JADX INFO: renamed from: A.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0058r {

    /* JADX INFO: renamed from: a */
    public int f82a;

    /* JADX INFO: renamed from: b */
    public int f83b;

    public /* synthetic */ C0058r(int i3, int i4) {
        this.f82a = i3;
        this.f83b = i4;
    }

    /* JADX INFO: renamed from: a */
    public int m319a() {
        int i3 = this.f83b;
        if (i3 == 2) {
            return 10;
        }
        if (i3 == 5) {
            return 11;
        }
        if (i3 == 29) {
            return 12;
        }
        if (i3 == 42) {
            return 16;
        }
        if (i3 != 22) {
            return i3 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    /* JADX INFO: renamed from: b */
    public void m320b(AbstractC1635T abstractC1635T) {
        View view = abstractC1635T.f7406a;
        this.f82a = view.getLeft();
        this.f83b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
