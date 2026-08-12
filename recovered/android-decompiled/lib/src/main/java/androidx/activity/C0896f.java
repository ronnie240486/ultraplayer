package androidx.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.C0908a;
import androidx.activity.result.C0909b;
import androidx.fragment.app.C0969t;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import p009D0.C0106b;
import p091e.AbstractActivityC1479j;

/* JADX INFO: renamed from: androidx.activity.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0896f {

    /* JADX INFO: renamed from: a */
    public Random f3731a = new Random();

    /* JADX INFO: renamed from: b */
    public final HashMap f3732b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f3733c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f3734d = new HashMap();

    /* JADX INFO: renamed from: e */
    public ArrayList f3735e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final transient HashMap f3736f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final HashMap f3737g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final Bundle f3738h = new Bundle();

    public C0896f(AbstractActivityC1479j abstractActivityC1479j) {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2293a(int i3, int i4, Intent intent) {
        String str = (String) this.f3732b.get(Integer.valueOf(i3));
        if (str == null) {
            return false;
        }
        C0909b c0909b = (C0909b) this.f3736f.get(str);
        if (c0909b != null) {
            C0969t c0969t = c0909b.f3778a;
            if (this.f3735e.contains(str)) {
                c0969t.m2545a(c0909b.f3779b.mo2549A(i4, intent));
                this.f3735e.remove(str);
                return true;
            }
        }
        this.f3737g.remove(str);
        this.f3738h.putParcelable(str, new C0908a(i4, intent));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final C0106b m2294b(String str, AbstractC1303m abstractC1303m, C0969t c0969t) {
        int i3;
        HashMap map;
        HashMap map2 = this.f3733c;
        if (((Integer) map2.get(str)) == null) {
            int iNextInt = this.f3731a.nextInt(2147418112);
            while (true) {
                i3 = iNextInt + 65536;
                map = this.f3732b;
                if (!map.containsKey(Integer.valueOf(i3))) {
                    break;
                }
                iNextInt = this.f3731a.nextInt(2147418112);
            }
            map.put(Integer.valueOf(i3), str);
            map2.put(str, Integer.valueOf(i3));
        }
        this.f3736f.put(str, new C0909b(c0969t, abstractC1303m));
        HashMap map3 = this.f3737g;
        if (map3.containsKey(str)) {
            Object obj = map3.get(str);
            map3.remove(str);
            c0969t.m2545a(obj);
        }
        Bundle bundle = this.f3738h;
        C0908a c0908a = (C0908a) bundle.getParcelable(str);
        if (c0908a != null) {
            bundle.remove(str);
            c0969t.m2545a(abstractC1303m.mo2549A(c0908a.f3776g, c0908a.f3777h));
        }
        return new C0106b(this, str, abstractC1303m, 24);
    }
}
