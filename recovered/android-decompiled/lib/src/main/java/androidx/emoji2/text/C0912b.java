package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p034L1.C0352g;

/* JADX INFO: renamed from: androidx.emoji2.text.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0912b extends C0352g {
    @Override // p034L1.C0352g
    /* JADX INFO: renamed from: C */
    public final Signature[] mo968C(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
