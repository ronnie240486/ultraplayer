package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.C0965p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import p081b.InterfaceC1059b;
import p091e.AbstractActivityC1479j;
import p108i1.C1751d;

/* JADX INFO: renamed from: androidx.activity.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0895e implements InterfaceC1059b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3729a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractActivityC1479j f3730b;

    public /* synthetic */ C0895e(AbstractActivityC1479j abstractActivityC1479j, int i3) {
        this.f3729a = i3;
        this.f3730b = abstractActivityC1479j;
    }

    @Override // p081b.InterfaceC1059b
    /* JADX INFO: renamed from: a */
    public final void mo2292a() {
        switch (this.f3729a) {
            case 0:
                AbstractActivityC1479j abstractActivityC1479j = this.f3730b;
                Bundle bundleM4206c = ((C1751d) abstractActivityC1479j.f3747k.f3429c).m4206c("android:support:activity-result");
                if (bundleM4206c != null) {
                    C0896f c0896f = abstractActivityC1479j.f3752p;
                    c0896f.getClass();
                    ArrayList<Integer> integerArrayList = bundleM4206c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleM4206c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        c0896f.f3735e = bundleM4206c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        c0896f.f3731a = (Random) bundleM4206c.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                        Bundle bundle = bundleM4206c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = c0896f.f3738h;
                        bundle2.putAll(bundle);
                        for (int i3 = 0; i3 < stringArrayList.size(); i3++) {
                            String str = stringArrayList.get(i3);
                            HashMap map = c0896f.f3733c;
                            boolean zContainsKey = map.containsKey(str);
                            HashMap map2 = c0896f.f3732b;
                            if (zContainsKey) {
                                Integer num = (Integer) map.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    map2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i3);
                            num2.intValue();
                            String str2 = stringArrayList.get(i3);
                            map2.put(num2, str2);
                            map.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
            default:
                C0965p c0965p = (C0965p) this.f3730b.f6611x.f38h;
                c0965p.f4251x.m2458b(c0965p, c0965p, null);
                break;
        }
    }
}
