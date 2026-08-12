package p105h2;

import androidx.fragment.app.AbstractC0948N;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: h2.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1670A {

    /* JADX INFO: renamed from: a */
    public Object[] f7589a;

    /* JADX INFO: renamed from: b */
    public int f7590b;

    /* JADX INFO: renamed from: c */
    public boolean f7591c;

    public AbstractC1670A(int i3) {
        AbstractC1723q.m4153b(i3, "initialCapacity");
        this.f7589a = new Object[i3];
        this.f7590b = 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m4101e(int i3, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i4 <= i3) {
            return i3;
        }
        int iHighestOneBit = i3 + (i3 >> 1) + 1;
        if (iHighestOneBit < i4) {
            iHighestOneBit = Integer.highestOneBit(i4 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: a */
    public final void m4102a(Object obj) {
        obj.getClass();
        m4105d(1);
        Object[] objArr = this.f7589a;
        int i3 = this.f7590b;
        this.f7590b = i3 + 1;
        objArr[i3] = obj;
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC1670A mo4103b(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m4104c(List list) {
        if (AbstractC0948N.m2506a(list)) {
            m4105d(list.size());
            if (list instanceof AbstractC1671B) {
                this.f7590b = ((AbstractC1671B) list).mo4107g(this.f7590b, this.f7589a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo4103b(it.next());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4105d(int i3) {
        Object[] objArr = this.f7589a;
        int iM4101e = m4101e(objArr.length, this.f7590b + i3);
        if (iM4101e > objArr.length || this.f7591c) {
            this.f7589a = Arrays.copyOf(this.f7589a, iM4101e);
            this.f7591c = false;
        }
    }
}
