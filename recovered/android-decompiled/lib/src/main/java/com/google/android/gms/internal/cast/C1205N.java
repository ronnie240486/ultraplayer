package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.N */
/* JADX INFO: loaded from: classes.dex */
public final class C1205N extends AbstractC1189J {

    /* JADX INFO: renamed from: j */
    public final transient C1224S f5661j;

    /* JADX INFO: renamed from: k */
    public final transient Object[] f5662k;

    /* JADX INFO: renamed from: l */
    public final transient int f5663l;

    public C1205N(C1224S c1224s, Object[] objArr, int i3) {
        this.f5661j = c1224s;
        this.f5662k = objArr;
        this.f5663l = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f5661j.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1169E
    /* JADX INFO: renamed from: e */
    public final int mo3126e(Object[] objArr) {
        AbstractC1181H abstractC1181HM3179l = this.f5643h;
        if (abstractC1181HM3179l == null) {
            abstractC1181HM3179l = m3179l();
            this.f5643h = abstractC1181HM3179l;
        }
        return abstractC1181HM3179l.mo3126e(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC1181H abstractC1181HM3179l = this.f5643h;
        if (abstractC1181HM3179l == null) {
            abstractC1181HM3179l = m3179l();
            this.f5643h = abstractC1181HM3179l;
        }
        return abstractC1181HM3179l.listIterator(0);
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC1181H m3179l() {
        return new C1201M(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5663l;
    }
}
