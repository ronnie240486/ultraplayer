package com.google.android.gms.internal.cast;

import java.util.Iterator;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.T */
/* JADX INFO: loaded from: classes.dex */
public final class C1228T extends AbstractC1189J {

    /* JADX INFO: renamed from: o */
    public static final Object[] f5704o;

    /* JADX INFO: renamed from: p */
    public static final C1228T f5705p;

    /* JADX INFO: renamed from: j */
    public final transient Object[] f5706j;

    /* JADX INFO: renamed from: k */
    public final transient int f5707k;

    /* JADX INFO: renamed from: l */
    public final transient Object[] f5708l;

    /* JADX INFO: renamed from: m */
    public final transient int f5709m;

    /* JADX INFO: renamed from: n */
    public final transient int f5710n;

    static {
        Object[] objArr = new Object[0];
        f5704o = objArr;
        f5705p = new C1228T(0, 0, 0, objArr, objArr);
    }

    public C1228T(int i3, int i4, int i5, Object[] objArr, Object[] objArr2) {
        this.f5706j = objArr;
        this.f5707k = i3;
        this.f5708l = objArr2;
        this.f5709m = i4;
        this.f5710n = i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f5708l;
            if (objArr.length != 0) {
                int iM4549v = AbstractC2003a.m4549v(obj.hashCode());
                while (true) {
                    int i3 = iM4549v & this.f5709m;
                    Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM4549v = i3 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1169E
    /* JADX INFO: renamed from: e */
    public final int mo3126e(Object[] objArr) {
        Object[] objArr2 = this.f5706j;
        int i3 = this.f5710n;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1169E
    /* JADX INFO: renamed from: g */
    public final int mo3127g() {
        return this.f5710n;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1169E
    /* JADX INFO: renamed from: h */
    public final int mo3128h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1189J, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5707k;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1169E
    /* JADX INFO: renamed from: i */
    public final Object[] mo3129i() {
        return this.f5706j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC1181H abstractC1181HM3142k = this.f5643h;
        if (abstractC1181HM3142k == null) {
            abstractC1181HM3142k = AbstractC1181H.m3142k(this.f5710n, this.f5706j);
            this.f5643h = abstractC1181HM3142k;
        }
        return abstractC1181HM3142k.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5710n;
    }
}
