package p026J;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0919i;

/* JADX INFO: renamed from: J.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0293j implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public final TransformationMethod f785a;

    public C0293j(TransformationMethod transformationMethod) {
        this.f785a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f785a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C0919i.m2404a().m2405b() != 1) {
            return charSequence;
        }
        C0919i c0919iM2404a = C0919i.m2404a();
        c0919iM2404a.getClass();
        return c0919iM2404a.m2408e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z3, int i3, Rect rect) {
        TransformationMethod transformationMethod = this.f785a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z3, i3, rect);
        }
    }
}
