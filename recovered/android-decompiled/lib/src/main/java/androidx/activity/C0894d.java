package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.AbstractC0937C;
import androidx.fragment.app.C0965p;
import androidx.lifecycle.EnumC0999l;
import java.util.ArrayList;
import java.util.HashMap;
import p091e.AbstractActivityC1479j;
import p108i1.InterfaceC1750c;

/* JADX INFO: renamed from: androidx.activity.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0894d implements InterfaceC1750c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3727a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3728b;

    public /* synthetic */ C0894d(int i3, Object obj) {
        this.f3727a = i3;
        this.f3728b = obj;
    }

    @Override // p108i1.InterfaceC1750c
    /* JADX INFO: renamed from: a */
    public final Bundle mo2291a() {
        switch (this.f3727a) {
            case 0:
                AbstractActivityC1479j abstractActivityC1479j = (AbstractActivityC1479j) this.f3728b;
                Bundle bundle = new Bundle();
                C0896f c0896f = abstractActivityC1479j.f3752p;
                c0896f.getClass();
                HashMap map = c0896f.f3733c;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0896f.f3735e));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0896f.f3738h.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", c0896f.f3731a);
                return bundle;
            case 1:
                AbstractActivityC1479j abstractActivityC1479j2 = (AbstractActivityC1479j) this.f3728b;
                while (AbstractActivityC1479j.m3705k(((C0965p) abstractActivityC1479j2.f6611x.f38h).f4251x)) {
                }
                abstractActivityC1479j2.f6612y.m2568d(EnumC0999l.ON_STOP);
                return new Bundle();
            default:
                return ((AbstractC0937C) this.f3728b).m2448R();
        }
    }
}
