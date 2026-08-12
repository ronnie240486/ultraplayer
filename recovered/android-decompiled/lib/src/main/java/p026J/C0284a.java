package p026J;

import android.text.Editable;
import androidx.emoji2.text.C0930t;

/* JADX INFO: renamed from: J.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0284a extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f766a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile C0284a f767b;

    /* JADX INFO: renamed from: c */
    public static Class f768c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f768c;
        return cls != null ? new C0930t(cls, charSequence) : super.newEditable(charSequence);
    }
}
