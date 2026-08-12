package p045P0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import p000A.C0041i;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p064W.InterfaceC0636d;
import p064W.InterfaceC0642j;
import p082b0.C1060a;
import p082b0.C1069j;
import p105h2.AbstractC1676G;
import p114k0.C1907A;

/* JADX INFO: renamed from: P0.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0466l implements InterfaceC0636d, InterfaceC0642j {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1536g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f1537h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1538i;

    public /* synthetic */ C0466l(C0467m c0467m, long j3, int i3) {
        this.f1538i = c0467m;
        this.f1537h = j3;
        this.f1536g = i3;
    }

    @Override // p064W.InterfaceC0636d
    /* JADX INFO: renamed from: b */
    public void mo545b(Object obj) {
        C0455a c0455a = (C0455a) obj;
        C0467m c0467m = (C0467m) this.f1538i;
        AbstractC0646n.m1631i(c0467m.f1546h);
        AbstractC1676G abstractC1676G = c0455a.f1520a;
        long j3 = c0455a.f1522c;
        C0041i c0041i = new C0041i(6);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC1676G.size());
        int size = abstractC1676G.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = abstractC1676G.get(i3);
            i3++;
            arrayList.add((Bundle) c0041i.apply(obj2));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j3);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        C0651s c0651s = c0467m.f1541c;
        c0651s.getClass();
        c0651s.m1663E(bArrMarshall, bArrMarshall.length);
        c0467m.f1539a.mo1173b(bArrMarshall.length, c0651s);
        long j4 = this.f1537h;
        long j5 = c0455a.f1521b;
        if (j5 == -9223372036854775807L) {
            AbstractC0646n.m1630h(c0467m.f1546h.f2159s == Long.MAX_VALUE);
        } else {
            long j6 = c0467m.f1546h.f2159s;
            j4 = j6 == Long.MAX_VALUE ? j4 + j5 : j5 + j6;
        }
        c0467m.f1539a.mo1172a(j4, this.f1536g, bArrMarshall.length, 0, null);
    }

    @Override // p064W.InterfaceC0642j
    /* JADX INFO: renamed from: g */
    public void mo214g(Object obj) {
        C1069j c1069j = (C1069j) obj;
        c1069j.getClass();
        C1060a c1060a = (C1060a) this.f1538i;
        C1907A c1907a = c1060a.f4814d;
        if (c1907a != null) {
            String strM2843d = c1069j.f4853b.m2843d(c1060a.f4812b, c1907a);
            HashMap map = c1069j.f4859h;
            Long l3 = (Long) map.get(strM2843d);
            HashMap map2 = c1069j.f4858g;
            Long l4 = (Long) map2.get(strM2843d);
            map.put(strM2843d, Long.valueOf((l3 == null ? 0L : l3.longValue()) + this.f1537h));
            map2.put(strM2843d, Long.valueOf((l4 != null ? l4.longValue() : 0L) + ((long) this.f1536g)));
        }
    }

    public /* synthetic */ C0466l(C1060a c1060a, int i3, long j3, long j4) {
        this.f1538i = c1060a;
        this.f1536g = i3;
        this.f1537h = j3;
    }
}
