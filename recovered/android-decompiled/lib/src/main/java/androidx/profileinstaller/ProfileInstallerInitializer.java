package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import p064W.RunnableC0647o;
import p095f0.C1528a;
import p096f1.AbstractC1551f;
import p111j1.InterfaceC1787b;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC1787b {
    @Override // p111j1.InterfaceC1787b
    /* JADX INFO: renamed from: a */
    public final List mo2384a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p111j1.InterfaceC1787b
    /* JADX INFO: renamed from: b */
    public final Object mo2385b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C1528a(3);
        }
        AbstractC1551f.m3870a(new RunnableC0647o(this, 11, context.getApplicationContext()));
        return new C1528a(3);
    }
}
