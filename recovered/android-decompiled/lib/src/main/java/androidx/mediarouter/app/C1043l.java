package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: androidx.mediarouter.app.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1043l extends Animation {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4582g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4583h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f4584i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ View f4585j;

    public /* synthetic */ C1043l(int i3, int i4, View view, int i5) {
        this.f4582g = i5;
        this.f4583h = i3;
        this.f4584i = i4;
        this.f4585j = view;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        View view = this.f4585j;
        int i3 = this.f4584i;
        int i4 = this.f4583h;
        switch (this.f4582g) {
            case 0:
                DialogC1051t.m2652p(view, i4 - ((int) ((i4 - i3) * f)));
                break;
            default:
                int i5 = i3 + ((int) ((i4 - i3) * f));
                int i6 = DialogC1028O.f4470Z;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i5;
                view.setLayoutParams(layoutParams);
                break;
        }
    }
}
