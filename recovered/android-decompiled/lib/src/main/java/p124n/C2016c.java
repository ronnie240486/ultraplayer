package p124n;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: n.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2016c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: g */
    public int f8761g;

    /* JADX INFO: renamed from: h */
    public int f8762h = -1;

    /* JADX INFO: renamed from: i */
    public boolean f8763i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2018e f8764j;

    public C2016c(C2018e c2018e) {
        this.f8764j = c2018e;
        this.f8761g = c2018e.f8791i - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f8763i) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i3 = this.f8762h;
        C2018e c2018e = this.f8764j;
        Object objM4590g = c2018e.m4590g(i3);
        if (key != objM4590g && (key == null || !key.equals(objM4590g))) {
            return false;
        }
        Object value = entry.getValue();
        Object objM4592i = c2018e.m4592i(this.f8762h);
        if (value != objM4592i) {
            return value != null && value.equals(objM4592i);
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f8763i) {
            return this.f8764j.m4590g(this.f8762h);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f8763i) {
            return this.f8764j.m4592i(this.f8762h);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8762h < this.f8761g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f8763i) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i3 = this.f8762h;
        C2018e c2018e = this.f8764j;
        Object objM4590g = c2018e.m4590g(i3);
        Object objM4592i = c2018e.m4592i(this.f8762h);
        return (objM4590g == null ? 0 : objM4590g.hashCode()) ^ (objM4592i != null ? objM4592i.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8762h++;
        this.f8763i = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8763i) {
            throw new IllegalStateException();
        }
        this.f8764j.m4591h(this.f8762h);
        this.f8762h--;
        this.f8761g--;
        this.f8763i = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f8763i) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        C2018e c2018e = this.f8764j;
        int i3 = (this.f8762h << 1) + 1;
        Object[] objArr = c2018e.f8790h;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
