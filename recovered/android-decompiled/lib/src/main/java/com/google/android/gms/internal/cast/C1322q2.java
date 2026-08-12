package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.q2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1322q2 extends AbstractC1330s2 {

    /* JADX INFO: renamed from: c */
    public static final Class f5959c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.google.android.gms.internal.cast.AbstractC1330s2
    /* JADX INFO: renamed from: a */
    public final void mo3351a(long j3, Object obj) {
        Object objUnmodifiableList;
        List list = (List) AbstractC1235U2.m3201g(j3, obj);
        if (list instanceof InterfaceC1318p2) {
            objUnmodifiableList = ((InterfaceC1318p2) list).mo3182c();
        } else {
            if (f5959c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC1172E2) && (list instanceof InterfaceC1302l2)) {
                AbstractC1234U1 abstractC1234U1 = (AbstractC1234U1) ((InterfaceC1302l2) list);
                boolean z3 = abstractC1234U1.f5713g;
                if (z3 && z3) {
                    abstractC1234U1.f5713g = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC1235U2.m3205k(j3, obj, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1330s2
    /* JADX INFO: renamed from: b */
    public final void mo3352b(long j3, Object obj, Object obj2) {
        List list;
        List list2;
        List listMo3140f;
        List list3 = (List) AbstractC1235U2.m3201g(j3, obj2);
        int size = list3.size();
        List list4 = (List) AbstractC1235U2.m3201g(j3, obj);
        if (list4.isEmpty()) {
            if (list4 instanceof InterfaceC1318p2) {
                listMo3140f = new C1314o2(size);
            } else {
                listMo3140f = ((list4 instanceof InterfaceC1172E2) && (list4 instanceof InterfaceC1302l2)) ? ((InterfaceC1302l2) list4).mo3140f(size) : new ArrayList(size);
            }
            AbstractC1235U2.m3205k(j3, obj, listMo3140f);
            list2 = listMo3140f;
        } else {
            if (f5959c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                AbstractC1235U2.m3205k(j3, obj, arrayList);
                list = arrayList;
            } else if (list4 instanceof C1216P2) {
                C1314o2 c1314o2 = new C1314o2(list4.size() + size);
                c1314o2.addAll(c1314o2.f5948h.size(), (C1216P2) list4);
                AbstractC1235U2.m3205k(j3, obj, c1314o2);
                list = c1314o2;
            } else if ((list4 instanceof InterfaceC1172E2) && (list4 instanceof InterfaceC1302l2)) {
                InterfaceC1302l2 interfaceC1302l2 = (InterfaceC1302l2) list4;
                if (!((AbstractC1234U1) interfaceC1302l2).f5713g) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    InterfaceC1302l2 interfaceC1302l2Mo3140f = interfaceC1302l2.mo3140f(list4.size() + size);
                    AbstractC1235U2.m3205k(j3, obj, interfaceC1302l2Mo3140f);
                    list2 = interfaceC1302l2Mo3140f;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        AbstractC1235U2.m3205k(j3, obj, list3);
    }
}
