package p101g2;

import androidx.fragment.app.AbstractC0948N;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p019G1.AbstractC0230e;
import p036M0.C0380q;
import p089d1.C1447t;

/* JADX INFO: renamed from: g2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1586g implements Iterator {

    /* JADX INFO: renamed from: h */
    public String f7189h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f7190i;

    /* JADX INFO: renamed from: j */
    public final C1582c f7191j;

    /* JADX INFO: renamed from: l */
    public int f7193l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C1447t f7194m;

    /* JADX INFO: renamed from: g */
    public int f7188g = 2;

    /* JADX INFO: renamed from: k */
    public int f7192k = 0;

    public C1586g(C1447t c1447t, C0380q c0380q, CharSequence charSequence) {
        this.f7194m = c1447t;
        this.f7191j = (C1582c) c0380q.f1292i;
        this.f7193l = c0380q.f1291h;
        this.f7190i = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int i3 = this.f7188g;
        if (i3 == 4) {
            throw new IllegalStateException();
        }
        int iM2507b = AbstractC0948N.m2507b(i3);
        if (iM2507b == 0) {
            return true;
        }
        if (iM2507b == 2) {
            return false;
        }
        this.f7188g = 4;
        int i4 = this.f7192k;
        while (true) {
            int length = this.f7192k;
            if (length == -1) {
                this.f7188g = 3;
                string = null;
                break;
            }
            C1581b c1581b = (C1581b) this.f7194m.f6406h;
            CharSequence charSequence = this.f7190i;
            int length2 = charSequence.length();
            AbstractC0230e.m731i(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (c1581b.mo3915a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.f7192k = -1;
            } else {
                this.f7192k = length + 1;
            }
            int i5 = this.f7192k;
            if (i5 != i4) {
                C1582c c1582c = this.f7191j;
                if (i4 < length) {
                    charSequence.charAt(i4);
                    c1582c.getClass();
                }
                if (length > i4) {
                    charSequence.charAt(length - 1);
                    c1582c.getClass();
                }
                int i6 = this.f7193l;
                if (i6 == 1) {
                    length = charSequence.length();
                    this.f7192k = -1;
                    if (length > i4) {
                        charSequence.charAt(length - 1);
                        c1582c.getClass();
                    }
                } else {
                    this.f7193l = i6 - 1;
                }
                string = charSequence.subSequence(i4, length).toString();
                break;
            }
            int i7 = i5 + 1;
            this.f7192k = i7;
            if (i7 > charSequence.length()) {
                this.f7192k = -1;
            }
        }
        this.f7189h = string;
        if (this.f7188g == 3) {
            return false;
        }
        this.f7188g = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7188g = 2;
        String str = this.f7189h;
        this.f7189h = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
