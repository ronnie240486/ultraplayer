package p118l1;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import p124n.C2018e;

/* JADX INFO: renamed from: l1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1976b extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public C1990p f8623a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f8624b;

    /* JADX INFO: renamed from: c */
    public ArrayList f8625c;

    /* JADX INFO: renamed from: d */
    public C2018e f8626d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
