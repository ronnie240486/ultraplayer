package p114k0;

import com.google.android.gms.internal.cast.C1258a2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p055T.AbstractC0558V;
import p055T.C0539B;
import p055T.C0542E;
import p055T.C0587s;
import p055T.C0589u;
import p055T.C0591w;
import p055T.C0592x;
import p055T.C0594z;
import p064W.AbstractC0632A;
import p070Y.InterfaceC0701A;
import p095f0.C1528a;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p105h2.C1674E;
import p105h2.C1687S;
import p105h2.C1688T;
import p105h2.C1692X;
import p105h2.C1727u;
import p129o0.C2065e;

/* JADX INFO: renamed from: k0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C1917K extends AbstractC1951k {

    /* JADX INFO: renamed from: s */
    public static final C0539B f8344s;

    /* JADX INFO: renamed from: k */
    public final AbstractC1932a[] f8345k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f8346l;

    /* JADX INFO: renamed from: m */
    public final AbstractC0558V[] f8347m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f8348n;

    /* JADX INFO: renamed from: o */
    public final C1528a f8349o;

    /* JADX INFO: renamed from: p */
    public int f8350p;

    /* JADX INFO: renamed from: q */
    public long[][] f8351q;

    /* JADX INFO: renamed from: r */
    public C1258a2 f8352r;

    static {
        C0587s c0587s = new C0587s();
        C1674E c1674e = AbstractC1676G.f7601h;
        C1692X c1692x = C1692X.f7629k;
        List list = Collections.EMPTY_LIST;
        C1692X c1692x2 = C1692X.f7629k;
        C0591w c0591w = new C0591w();
        f8344s = new C0539B("MergingMediaSource", new C0589u(c0587s), null, new C0592x(c0591w), C0542E.f1910D, C0594z.f2205a);
    }

    public C1917K(AbstractC1932a... abstractC1932aArr) {
        C1528a c1528a = new C1528a(8);
        this.f8345k = abstractC1932aArr;
        this.f8349o = c1528a;
        this.f8348n = new ArrayList(Arrays.asList(abstractC1932aArr));
        this.f8350p = -1;
        this.f8346l = new ArrayList(abstractC1932aArr.length);
        for (int i3 = 0; i3 < abstractC1932aArr.length; i3++) {
            this.f8346l.add(new ArrayList());
        }
        this.f8347m = new AbstractC0558V[abstractC1932aArr.length];
        this.f8351q = new long[0][];
        new HashMap();
        AbstractC1723q.m4153b(8, "expectedKeys");
        AbstractC1723q.m4153b(2, "expectedValuesPerKey");
        new C1688T(C1727u.m4170a(8)).f7625l = new C1687S();
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: a */
    public final InterfaceC1965y mo3776a(C1907A c1907a, C2065e c2065e, long j3) {
        AbstractC1932a[] abstractC1932aArr = this.f8345k;
        int length = abstractC1932aArr.length;
        InterfaceC1965y[] interfaceC1965yArr = new InterfaceC1965y[length];
        AbstractC0558V[] abstractC0558VArr = this.f8347m;
        int iMo1328b = abstractC0558VArr[0].mo1328b(c1907a.f8311a);
        for (int i3 = 0; i3 < length; i3++) {
            C1907A c1907aM4421a = c1907a.m4421a(abstractC0558VArr[i3].mo1331l(iMo1328b));
            interfaceC1965yArr[i3] = abstractC1932aArr[i3].mo3776a(c1907aM4421a, c2065e, j3 - this.f8351q[iMo1328b][i3]);
            ((List) this.f8346l.get(i3)).add(new C1916J(c1907aM4421a, interfaceC1965yArr[i3]));
        }
        return new C1915I(this.f8349o, this.f8351q[iMo1328b], interfaceC1965yArr);
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: g */
    public final C0539B mo3777g() {
        AbstractC1932a[] abstractC1932aArr = this.f8345k;
        return abstractC1932aArr.length > 0 ? abstractC1932aArr[0].mo3777g() : f8344s;
    }

    @Override // p114k0.AbstractC1951k, p114k0.AbstractC1932a
    /* JADX INFO: renamed from: i */
    public final void mo3778i() throws C1258a2 {
        C1258a2 c1258a2 = this.f8352r;
        if (c1258a2 != null) {
            throw c1258a2;
        }
        super.mo3778i();
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: k */
    public final void mo3779k(InterfaceC0701A interfaceC0701A) {
        this.f8541j = interfaceC0701A;
        this.f8540i = AbstractC0632A.m1594m(null);
        int i3 = 0;
        while (true) {
            AbstractC1932a[] abstractC1932aArr = this.f8345k;
            if (i3 >= abstractC1932aArr.length) {
                return;
            }
            m4507w(Integer.valueOf(i3), abstractC1932aArr[i3]);
            i3++;
        }
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: m */
    public final void mo3780m(InterfaceC1965y interfaceC1965y) {
        C1915I c1915i = (C1915I) interfaceC1965y;
        int i3 = 0;
        while (true) {
            AbstractC1932a[] abstractC1932aArr = this.f8345k;
            if (i3 >= abstractC1932aArr.length) {
                return;
            }
            List list = (List) this.f8346l.get(i3);
            for (int i4 = 0; i4 < list.size(); i4++) {
                if (((C1916J) list.get(i4)).f8343b.equals(interfaceC1965y)) {
                    list.remove(i4);
                    break;
                }
            }
            AbstractC1932a abstractC1932a = abstractC1932aArr[i3];
            InterfaceC1965y interfaceC1965y2 = c1915i.f8333g[i3];
            if (interfaceC1965y2 instanceof C1943f0) {
                interfaceC1965y2 = ((C1943f0) interfaceC1965y2).f8514g;
            }
            abstractC1932a.mo3780m(interfaceC1965y2);
            i3++;
        }
    }

    @Override // p114k0.AbstractC1951k, p114k0.AbstractC1932a
    /* JADX INFO: renamed from: o */
    public final void mo3781o() {
        super.mo3781o();
        Arrays.fill(this.f8347m, (Object) null);
        this.f8350p = -1;
        this.f8352r = null;
        ArrayList arrayList = this.f8348n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f8345k);
    }

    @Override // p114k0.AbstractC1932a
    /* JADX INFO: renamed from: r */
    public final void mo3782r(C0539B c0539b) {
        this.f8345k[0].mo3782r(c0539b);
    }

    @Override // p114k0.AbstractC1951k
    /* JADX INFO: renamed from: s */
    public final C1907A mo4439s(Object obj, C1907A c1907a) {
        ArrayList arrayList = this.f8346l;
        List list = (List) arrayList.get(((Integer) obj).intValue());
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (((C1916J) list.get(i3)).f8342a.equals(c1907a)) {
                return ((C1916J) ((List) arrayList.get(0)).get(i3)).f8342a;
            }
        }
        return null;
    }

    @Override // p114k0.AbstractC1951k
    /* JADX INFO: renamed from: v */
    public final void mo4440v(Object obj, AbstractC1932a abstractC1932a, AbstractC0558V abstractC0558V) {
        Integer num = (Integer) obj;
        if (this.f8352r != null) {
            return;
        }
        if (this.f8350p == -1) {
            this.f8350p = abstractC0558V.mo1330h();
        } else if (abstractC0558V.mo1330h() != this.f8350p) {
            this.f8352r = new C1258a2();
            return;
        }
        int length = this.f8351q.length;
        AbstractC0558V[] abstractC0558VArr = this.f8347m;
        if (length == 0) {
            this.f8351q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f8350p, abstractC0558VArr.length);
        }
        ArrayList arrayList = this.f8348n;
        arrayList.remove(abstractC1932a);
        abstractC0558VArr[num.intValue()] = abstractC0558V;
        if (arrayList.isEmpty()) {
            m4491l(abstractC0558VArr[0]);
        }
    }
}
