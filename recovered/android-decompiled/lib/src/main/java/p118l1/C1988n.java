package p118l1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1988n extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f8675a;

    /* JADX INFO: renamed from: b */
    public C1987m f8676b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f8677c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f8678d;

    /* JADX INFO: renamed from: e */
    public boolean f8679e;

    /* JADX INFO: renamed from: f */
    public Bitmap f8680f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f8681g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f8682h;

    /* JADX INFO: renamed from: i */
    public int f8683i;

    /* JADX INFO: renamed from: j */
    public boolean f8684j;

    /* JADX INFO: renamed from: k */
    public boolean f8685k;

    /* JADX INFO: renamed from: l */
    public Paint f8686l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f8675a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1990p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C1990p(this);
    }
}
