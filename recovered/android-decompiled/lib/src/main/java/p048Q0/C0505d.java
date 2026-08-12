package p048Q0;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p055T.C0583o;
import p068X0.C0691d;
import p068X0.C0692e;
import p083b1.C1078G;
import p105h2.AbstractC1691W;
import p105h2.AbstractC1731y;
import p105h2.C1729w;
import p125n0.C2029f;
import p125n0.C2030g;
import p125n0.C2036m;
import p125n0.C2039p;
import p125n0.C2040q;
import p129o0.C2077q;

/* JADX INFO: renamed from: Q0.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0505d implements Comparator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1695g;

    public /* synthetic */ C0505d(int i3) {
        this.f1695g = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1695g) {
            case 0:
                return Integer.compare(((C0506e) obj2).f1698b, ((C0506e) obj).f1698b);
            case 1:
                return Integer.compare(((C0692e) obj).f2667a.f2670b, ((C0692e) obj2).f2667a.f2670b);
            case 2:
                return Long.compare(((C0691d) obj).f2664b, ((C0691d) obj2).f2664b);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                C1078G c1078g = (C1078G) obj;
                C1078G c1078g2 = (C1078G) obj2;
                int iCompare = Integer.compare(c1078g2.f4923b, c1078g.f4923b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = c1078g.f4924c.compareTo(c1078g2.f4924c);
                return iCompareTo != 0 ? iCompareTo : c1078g.f4925d.compareTo(c1078g2.f4925d);
            case 4:
                C1078G c1078g3 = (C1078G) obj;
                C1078G c1078g4 = (C1078G) obj2;
                int iCompare2 = Integer.compare(c1078g4.f4922a, c1078g3.f4922a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = c1078g4.f4924c.compareTo(c1078g3.f4924c);
                return iCompareTo2 != 0 ? iCompareTo2 : c1078g4.f4925d.compareTo(c1078g3.f4925d);
            case 5:
                return ((C0583o) obj2).f2150j - ((C0583o) obj).f2150j;
            case 6:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 7:
                return Integer.compare(((C2030g) ((List) obj).get(0)).f8845l, ((C2030g) ((List) obj2).get(0)).f8845l);
            case 8:
                return ((C2029f) Collections.max((List) obj)).compareTo((C2029f) Collections.max((List) obj2));
            case 9:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C1729w.m4181f(C2039p.m4607c((C2039p) Collections.max(list, new C0505d(11)), (C2039p) Collections.max(list2, new C0505d(11)))).mo4182a(list.size(), list2.size()).mo4183b((C2039p) Collections.max(list, new C0505d(12)), (C2039p) Collections.max(list2, new C0505d(12)), new C0505d(12)).mo4186e();
            case 10:
                return ((C2036m) ((List) obj).get(0)).compareTo((C2036m) ((List) obj2).get(0));
            case 11:
                return C2039p.m4607c((C2039p) obj, (C2039p) obj2);
            case 12:
                C2039p c2039p = (C2039p) obj;
                C2039p c2039p2 = (C2039p) obj2;
                AbstractC1691W abstractC1691WMo4136a = (c2039p.f8885k && c2039p.f8888n) ? C2040q.f8900j : C2040q.f8900j.mo4136a();
                C1729w c1729w = AbstractC1731y.f7720a;
                c2039p.f8886l.getClass();
                return c1729w.mo4183b(Integer.valueOf(c2039p.f8891q), Integer.valueOf(c2039p2.f8891q), abstractC1691WMo4136a).mo4183b(Integer.valueOf(c2039p.f8890p), Integer.valueOf(c2039p2.f8890p), abstractC1691WMo4136a).mo4186e();
            case 13:
                return ((C2077q) obj).f9018a - ((C2077q) obj2).f9018a;
            case 14:
                return Float.compare(((C2077q) obj).f9020c, ((C2077q) obj2).f9020c);
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b3 = bArr[i3];
                    byte b4 = bArr2[i3];
                    if (b3 != b4) {
                        return b3 - b4;
                    }
                }
                return 0;
        }
    }
}
