package p011E;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p000A.C0031d;

/* JADX INFO: renamed from: E.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0112e extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0111d f149a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0112e(InputConnection inputConnection, C0111d c0111d) {
        super(inputConnection, false);
        this.f149a = c0111d;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        C0031d c0031d = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c0031d = new C0031d(3, new C0114g(inputContentInfo));
        }
        if (this.f149a.m551i(c0031d, i3, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i3, bundle);
    }
}
