package p026J;

import android.widget.EditText;
import androidx.emoji2.text.AbstractC0917g;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: J.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0291h extends AbstractC0917g {

    /* JADX INFO: renamed from: a */
    public final WeakReference f781a;

    public C0291h(EditText editText) {
        this.f781a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.AbstractC0917g
    /* JADX INFO: renamed from: a */
    public final void mo818a() {
        C0292i.m823a((EditText) this.f781a.get(), 1);
    }
}
