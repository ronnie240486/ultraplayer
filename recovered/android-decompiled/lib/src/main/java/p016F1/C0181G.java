package p016F1;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.C1211O1;
import com.google.android.gms.internal.cast.C1225S0;
import com.google.android.gms.internal.cast.C1247X2;
import com.google.android.gms.internal.cast.C1285h1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import p013E1.C0140o;
import p019G1.AbstractC0232g;
import p019G1.C0228c;
import p022H1.C0267k;
import p028J1.AbstractC0295a;
import p028J1.C0296b;

/* JADX INFO: renamed from: F1.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0181G extends AbstractC0232g {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f416g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f417h;

    public /* synthetic */ C0181G(int i3, Object obj) {
        this.f416g = i3;
        this.f417h = obj;
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: j */
    public void mo650j() {
        switch (this.f416g) {
            case 2:
                ((C0267k) this.f417h).m805b();
                break;
        }
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: k */
    public void mo651k() {
        switch (this.f416g) {
            case 2:
                ((C0267k) this.f417h).m805b();
                break;
        }
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: l */
    public void mo652l() {
        switch (this.f416g) {
            case 2:
                ((C0267k) this.f417h).m805b();
                break;
        }
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: m */
    public void mo653m() {
        switch (this.f416g) {
            case 2:
                ((C0267k) this.f417h).m805b();
                break;
        }
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: n */
    public void mo654n() {
        switch (this.f416g) {
            case 1:
                C0228c c0228c = (C0228c) this.f417h;
                long jM720e = c0228c.m720e();
                if (jM720e != c0228c.f536b) {
                    c0228c.f536b = jM720e;
                    c0228c.m718c();
                    if (c0228c.f536b != 0) {
                        c0228c.m719d();
                    }
                }
                break;
            case 2:
                ((C0267k) this.f417h).m805b();
                break;
        }
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: o */
    public void mo655o(String str, long j3, int i3, long j4, long j5) {
        switch (this.f416g) {
            case 0:
                C1211O1 c1211o1 = ((C0187d) this.f417h).f465l;
                if (c1211o1 != null) {
                    C1247X2 c1247x2M792r = c1211o1.f5677g.m792r();
                    C1225S0 c1225s0 = new C1225S0(str);
                    c1225s0.f5699b = j3;
                    c1225s0.f5700c = i3;
                    c1225s0.f5701d = j4;
                    c1225s0.f5702e = j5;
                    C1285h1 c1285h1 = new C1285h1(c1225s0);
                    c1285h1.f5910f = c1247x2M792r.f5737h;
                    c1247x2M792r.f5733d.add(c1285h1);
                }
                break;
        }
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: p */
    public void mo656p(int[] iArr) {
        switch (this.f416g) {
            case 1:
                ArrayList arrayListM827d = AbstractC0295a.m827d(iArr);
                C0228c c0228c = (C0228c) this.f417h;
                if (!c0228c.f538d.equals(arrayListM827d)) {
                    c0228c.m723h();
                    c0228c.f540f.evictAll();
                    c0228c.f541g.clear();
                    c0228c.f538d = arrayListM827d;
                    C0228c.m717b(c0228c);
                    c0228c.m722g();
                    c0228c.m721f();
                    break;
                }
                break;
        }
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: q */
    public void mo657q(int[] iArr, int i3) {
        int size;
        switch (this.f416g) {
            case 1:
                if (i3 == 0) {
                    size = ((C0228c) this.f417h).f538d.size();
                } else {
                    size = ((C0228c) this.f417h).f539e.get(i3, -1);
                    if (size == -1) {
                        ((C0228c) this.f417h).m719d();
                        return;
                    }
                }
                ((C0228c) this.f417h).m723h();
                ((C0228c) this.f417h).f538d.addAll(size, AbstractC0295a.m827d(iArr));
                C0228c.m717b((C0228c) this.f417h);
                C0228c c0228c = (C0228c) this.f417h;
                synchronized (c0228c.f547m) {
                    Iterator it = c0228c.f547m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((C0228c) this.f417h).m721f();
                return;
            default:
                return;
        }
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: r */
    public void mo658r(C0140o[] c0140oArr) {
        switch (this.f416g) {
            case 1:
                HashSet hashSet = new HashSet();
                C0228c c0228c = (C0228c) this.f417h;
                c0228c.f541g.clear();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int length = c0140oArr.length;
                    SparseIntArray sparseIntArray = c0228c.f539e;
                    if (i4 >= length) {
                        ArrayList arrayList = c0228c.f541g;
                        int size = arrayList.size();
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            int i5 = sparseIntArray.get(((Integer) obj).intValue(), -1);
                            if (i5 != -1) {
                                hashSet.add(Integer.valueOf(i5));
                            }
                        }
                        arrayList.clear();
                        ArrayList arrayList2 = new ArrayList(hashSet);
                        Collections.sort(arrayList2);
                        c0228c.m723h();
                        AbstractC0295a.m829f(arrayList2);
                        C0228c.m716a(c0228c);
                        c0228c.m721f();
                    } else {
                        C0140o c0140o = c0140oArr[i4];
                        int i6 = c0140o.f291h;
                        c0228c.f540f.put(Integer.valueOf(i6), c0140o);
                        int i7 = sparseIntArray.get(i6, -1);
                        if (i7 == -1) {
                            c0228c.m719d();
                        } else {
                            hashSet.add(Integer.valueOf(i7));
                            i4++;
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: s */
    public void mo659s(int[] iArr) {
        switch (this.f416g) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i3 : iArr) {
                    ((C0228c) this.f417h).f540f.remove(Integer.valueOf(i3));
                    int i4 = ((C0228c) this.f417h).f539e.get(i3, -1);
                    if (i4 == -1) {
                        ((C0228c) this.f417h).m719d();
                        return;
                    } else {
                        ((C0228c) this.f417h).f539e.delete(i3);
                        arrayList.add(Integer.valueOf(i4));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Collections.sort(arrayList);
                ((C0228c) this.f417h).m723h();
                ((C0228c) this.f417h).f538d.removeAll(AbstractC0295a.m827d(iArr));
                C0228c.m717b((C0228c) this.f417h);
                C0228c c0228c = (C0228c) this.f417h;
                AbstractC0295a.m829f(arrayList);
                synchronized (c0228c.f547m) {
                    Iterator it = c0228c.f547m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((C0228c) this.f417h).m721f();
                return;
            default:
                return;
        }
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: t */
    public void mo660t(ArrayList arrayList, ArrayList arrayList2, int i3) {
        switch (this.f416g) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i4 = 0;
                if (i3 == 0) {
                    ((C0228c) this.f417h).f538d.size();
                } else if (arrayList2.isEmpty()) {
                    C0296b c0296b = ((C0228c) this.f417h).f535a;
                    Log.w(c0296b.f788a, c0296b.m833d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((C0228c) this.f417h).f539e.get(i3, -1) == -1) {
                    C0228c c0228c = (C0228c) this.f417h;
                    c0228c.f539e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i4 < size) {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    int i5 = ((C0228c) this.f417h).f539e.get(((Integer) obj).intValue(), -1);
                    if (i5 == -1) {
                        ((C0228c) this.f417h).m719d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i5));
                }
                ((C0228c) this.f417h).m723h();
                C0228c c0228c2 = (C0228c) this.f417h;
                c0228c2.f538d = arrayList;
                C0228c.m717b(c0228c2);
                C0228c c0228c3 = (C0228c) this.f417h;
                synchronized (c0228c3.f547m) {
                    Iterator it = c0228c3.f547m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((C0228c) this.f417h).m721f();
                return;
            default:
                return;
        }
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: u */
    public void mo661u(int[] iArr) {
        switch (this.f416g) {
            case 1:
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                while (true) {
                    int length = iArr.length;
                    C0228c c0228c = (C0228c) this.f417h;
                    if (i3 >= length) {
                        Collections.sort(arrayList);
                        c0228c.m723h();
                        AbstractC0295a.m829f(arrayList);
                        C0228c.m716a(c0228c);
                        c0228c.m721f();
                    } else {
                        int i4 = iArr[i3];
                        c0228c.f540f.remove(Integer.valueOf(i4));
                        int i5 = c0228c.f539e.get(i4, -1);
                        if (i5 == -1) {
                            c0228c.m719d();
                        } else {
                            arrayList.add(Integer.valueOf(i5));
                            i3++;
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // p019G1.AbstractC0232g
    /* JADX INFO: renamed from: v */
    public void mo662v() {
        switch (this.f416g) {
            case 1:
                ((C0228c) this.f417h).m719d();
                break;
        }
    }
}
