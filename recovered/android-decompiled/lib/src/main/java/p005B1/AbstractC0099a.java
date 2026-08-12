package p005B1;

import android.util.SparseArray;
import java.util.HashMap;
import p045P0.AbstractC0462h;
import p126n1.EnumC2048c;

/* JADX INFO: renamed from: B1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0099a {

    /* JADX INFO: renamed from: a */
    public static final SparseArray f125a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public static final HashMap f126b;

    static {
        HashMap map = new HashMap();
        f126b = map;
        map.put(EnumC2048c.f8921g, 0);
        map.put(EnumC2048c.f8922h, 1);
        map.put(EnumC2048c.f8923i, 2);
        for (EnumC2048c enumC2048c : map.keySet()) {
            f125a.append(((Integer) f126b.get(enumC2048c)).intValue(), enumC2048c);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m495a(EnumC2048c enumC2048c) {
        Integer num = (Integer) f126b.get(enumC2048c);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC2048c);
    }

    /* JADX INFO: renamed from: b */
    public static EnumC2048c m496b(int i3) {
        EnumC2048c enumC2048c = (EnumC2048c) f125a.get(i3);
        if (enumC2048c != null) {
            return enumC2048c;
        }
        throw new IllegalArgumentException(AbstractC0462h.m1165e(i3, "Unknown Priority for value "));
    }
}
