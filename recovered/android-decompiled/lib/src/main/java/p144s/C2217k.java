package p144s;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: s.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2217k {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f9525a;

    /* JADX INFO: renamed from: b */
    public final Configuration f9526b;

    /* JADX INFO: renamed from: c */
    public final int f9527c;

    public C2217k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f9525a = colorStateList;
        this.f9526b = configuration;
        this.f9527c = theme == null ? 0 : theme.hashCode();
    }
}
