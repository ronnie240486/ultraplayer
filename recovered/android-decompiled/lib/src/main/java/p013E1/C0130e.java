package p013E1;

import android.os.Bundle;
import android.support.v4.media.session.C0858A;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;
import p016F1.C0183I;
import p037M1.InterfaceC0389b;
import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: E1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0130e implements InterfaceC0389b {

    /* JADX INFO: renamed from: b */
    public final CastDevice f240b;

    /* JADX INFO: renamed from: c */
    public final C0183I f241c;

    /* JADX INFO: renamed from: d */
    public final Bundle f242d;

    /* JADX INFO: renamed from: e */
    public final String f243e = UUID.randomUUID().toString();

    public /* synthetic */ C0130e(C0858A c0858a) {
        this.f240b = (CastDevice) c0858a.f3639h;
        this.f241c = (C0183I) c0858a.f3640i;
        this.f242d = (Bundle) c0858a.f3641j;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0064 A[RETURN] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0130e)) {
            return false;
        }
        C0130e c0130e = (C0130e) obj;
        if (AbstractC0491s.m1216h(this.f240b, c0130e.f240b)) {
            Bundle bundle = this.f242d;
            Bundle bundle2 = c0130e.f242d;
            if (bundle == null || bundle2 == null) {
                if (bundle == bundle2) {
                    if (AbstractC0491s.m1216h(this.f243e, c0130e.f243e)) {
                        return true;
                    }
                }
            } else if (bundle.size() == bundle2.size()) {
                Set<String> setKeySet = bundle.keySet();
                if (setKeySet.containsAll(bundle2.keySet())) {
                    for (String str : setKeySet) {
                        if (!AbstractC0491s.m1216h(bundle.get(str), bundle2.get(str))) {
                        }
                    }
                    if (AbstractC0491s.m1216h(this.f243e, c0130e.f243e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f240b, this.f242d, 0, this.f243e});
    }
}
