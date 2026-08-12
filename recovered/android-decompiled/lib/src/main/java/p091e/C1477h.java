package p091e;

import android.os.Bundle;
import com.zuxoplayer.app.PlayerActivity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p108i1.C1751d;
import p108i1.InterfaceC1750c;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: e.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1477h implements InterfaceC1750c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6605a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f6606b;

    public C1477h(C1751d c1751d) {
        AbstractC2364c.m4954e(c1751d, "registry");
        this.f6606b = new LinkedHashSet();
        c1751d.m4208e("androidx.savedstate.Restarter", this);
    }

    @Override // p108i1.InterfaceC1750c
    /* JADX INFO: renamed from: a */
    public final Bundle mo2291a() {
        switch (this.f6605a) {
            case 0:
                Bundle bundle = new Bundle();
                ((PlayerActivity) this.f6606b).m3706i().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f6606b));
                return bundle2;
        }
    }

    public C1477h(PlayerActivity playerActivity) {
        this.f6606b = playerActivity;
    }
}
