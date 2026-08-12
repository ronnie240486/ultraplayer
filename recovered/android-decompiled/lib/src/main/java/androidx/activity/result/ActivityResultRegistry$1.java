package androidx.activity.result;

import androidx.lifecycle.EnumC0999l;
import androidx.lifecycle.InterfaceC1003p;
import androidx.lifecycle.InterfaceC1005r;

/* JADX INFO: loaded from: classes.dex */
class ActivityResultRegistry$1 implements InterfaceC1003p {
    @Override // androidx.lifecycle.InterfaceC1003p
    /* JADX INFO: renamed from: b */
    public final void mo2288b(InterfaceC1005r interfaceC1005r, EnumC0999l enumC0999l) {
        if (EnumC0999l.ON_START.equals(enumC0999l) || EnumC0999l.ON_STOP.equals(enumC0999l) || EnumC0999l.ON_DESTROY.equals(enumC0999l)) {
            throw null;
        }
    }
}
