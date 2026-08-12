package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.o2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1314o2 extends AbstractC1234U1 implements RandomAccess, InterfaceC1318p2 {

    /* JADX INFO: renamed from: h */
    public final List f5948h;

    static {
        new C1314o2();
    }

    public C1314o2(int i3) {
        ArrayList arrayList = new ArrayList(i3);
        super(true);
        this.f5948h = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i3, Object obj) {
        m3194e();
        this.f5948h.add(i3, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1234U1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        m3194e();
        if (collection instanceof InterfaceC1318p2) {
            collection = ((InterfaceC1318p2) collection).mo3181b();
        }
        boolean zAddAll = this.f5948h.addAll(i3, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1318p2
    /* JADX INFO: renamed from: b */
    public final List mo3181b() {
        return Collections.unmodifiableList(this.f5948h);
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1318p2
    /* JADX INFO: renamed from: c */
    public final InterfaceC1318p2 mo3182c() {
        return this.f5713g ? new C1216P2(this) : this;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1234U1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3194e();
        this.f5948h.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1318p2
    /* JADX INFO: renamed from: d */
    public final Object mo3183d(int i3) {
        return this.f5948h.get(i3);
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1302l2
    /* JADX INFO: renamed from: f */
    public final InterfaceC1302l2 mo3140f(int i3) {
        List list = this.f5948h;
        if (i3 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i3);
        arrayList.addAll(list);
        return new C1314o2(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String get(int i3) {
        String str;
        List list = this.f5948h;
        Object obj = list.get(i3);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C1250Y1)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, AbstractC1306m2.f5927a);
            C1196K2 c1196k2 = AbstractC1243W2.f5725a;
            int length = bArr.length;
            AbstractC1243W2.f5725a.getClass();
            if (C1196K2.m3177b(bArr, length)) {
                list.set(i3, str2);
            }
            return str2;
        }
        C1250Y1 c1250y1 = (C1250Y1) obj;
        Charset charset = AbstractC1306m2.f5927a;
        if (c1250y1.mo3215h() == 0) {
            str = "";
        } else {
            str = new String(c1250y1.f5745h, 0, c1250y1.mo3215h(), charset);
        }
        int iMo3215h = c1250y1.mo3215h();
        AbstractC1243W2.f5725a.getClass();
        if (C1196K2.m3177b(c1250y1.f5745h, iMo3215h)) {
            list.set(i3, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1234U1, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        m3194e();
        Object objRemove = this.f5948h.remove(i3);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C1250Y1)) {
            return new String((byte[]) objRemove, AbstractC1306m2.f5927a);
        }
        C1250Y1 c1250y1 = (C1250Y1) objRemove;
        Charset charset = AbstractC1306m2.f5927a;
        if (c1250y1.mo3215h() == 0) {
            return "";
        }
        return new String(c1250y1.f5745h, 0, c1250y1.mo3215h(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        m3194e();
        Object obj2 = this.f5948h.set(i3, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C1250Y1)) {
            return new String((byte[]) obj2, AbstractC1306m2.f5927a);
        }
        C1250Y1 c1250y1 = (C1250Y1) obj2;
        Charset charset = AbstractC1306m2.f5927a;
        if (c1250y1.mo3215h() == 0) {
            return "";
        }
        return new String(c1250y1.f5745h, 0, c1250y1.mo3215h(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5948h.size();
    }

    public C1314o2(ArrayList arrayList) {
        super(true);
        this.f5948h = arrayList;
    }

    public C1314o2() {
        super(false);
        this.f5948h = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1234U1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f5948h.size(), collection);
    }
}
