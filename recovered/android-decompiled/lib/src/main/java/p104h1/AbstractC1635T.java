package p104h1;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p000A.AbstractC0016Q;

/* JADX INFO: renamed from: h1.T */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1635T {

    /* JADX INFO: renamed from: s */
    public static final List f7405s = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a */
    public final View f7406a;

    /* JADX INFO: renamed from: b */
    public WeakReference f7407b;

    /* JADX INFO: renamed from: i */
    public int f7414i;

    /* JADX INFO: renamed from: q */
    public RecyclerView f7422q;

    /* JADX INFO: renamed from: r */
    public AbstractC1667x f7423r;

    /* JADX INFO: renamed from: c */
    public int f7408c = -1;

    /* JADX INFO: renamed from: d */
    public int f7409d = -1;

    /* JADX INFO: renamed from: e */
    public int f7410e = -1;

    /* JADX INFO: renamed from: f */
    public int f7411f = -1;

    /* JADX INFO: renamed from: g */
    public AbstractC1635T f7412g = null;

    /* JADX INFO: renamed from: h */
    public AbstractC1635T f7413h = null;

    /* JADX INFO: renamed from: j */
    public final ArrayList f7415j = null;

    /* JADX INFO: renamed from: k */
    public final List f7416k = null;

    /* JADX INFO: renamed from: l */
    public int f7417l = 0;

    /* JADX INFO: renamed from: m */
    public C1627K f7418m = null;

    /* JADX INFO: renamed from: n */
    public boolean f7419n = false;

    /* JADX INFO: renamed from: o */
    public int f7420o = 0;

    /* JADX INFO: renamed from: p */
    public int f7421p = -1;

    public AbstractC1635T(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f7406a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m4047a(int i3) {
        this.f7414i = i3 | this.f7414i;
    }

    /* JADX INFO: renamed from: b */
    public final int m4048b() {
        int i3 = this.f7411f;
        return i3 == -1 ? this.f7408c : i3;
    }

    /* JADX INFO: renamed from: c */
    public final List m4049c() {
        ArrayList arrayList;
        return ((this.f7414i & 1024) != 0 || (arrayList = this.f7415j) == null || arrayList.size() == 0) ? f7405s : this.f7416k;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4050d() {
        return (this.f7414i & 1) != 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4051e() {
        return (this.f7414i & 4) != 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4052f() {
        if ((this.f7414i & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        return !this.f7406a.hasTransientState();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4053g() {
        return (this.f7414i & 8) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4054h() {
        return this.f7418m != null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4055i() {
        return (this.f7414i & 256) != 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4056j() {
        return (this.f7414i & 2) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m4057k(int i3, boolean z3) {
        if (this.f7409d == -1) {
            this.f7409d = this.f7408c;
        }
        if (this.f7411f == -1) {
            this.f7411f = this.f7408c;
        }
        if (z3) {
            this.f7411f += i3;
        }
        this.f7408c += i3;
        View view = this.f7406a;
        if (view.getLayoutParams() != null) {
            ((C1622F) view.getLayoutParams()).f7366c = true;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4058l() {
        this.f7414i = 0;
        this.f7408c = -1;
        this.f7409d = -1;
        this.f7411f = -1;
        this.f7417l = 0;
        this.f7412g = null;
        this.f7413h = null;
        ArrayList arrayList = this.f7415j;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f7414i &= -1025;
        this.f7420o = 0;
        this.f7421p = -1;
        RecyclerView.m2746g(this);
    }

    /* JADX INFO: renamed from: m */
    public final void m4059m(boolean z3) {
        int i3 = this.f7417l;
        int i4 = z3 ? i3 - 1 : i3 + 1;
        this.f7417l = i4;
        if (i4 < 0) {
            this.f7417l = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z3 && i4 == 1) {
            this.f7414i |= 16;
        } else if (z3 && i4 == 0) {
            this.f7414i &= -17;
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m4060n() {
        return (this.f7414i & 128) != 0;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m4061o() {
        return (this.f7414i & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f7408c + " id=-1, oldPos=" + this.f7409d + ", pLpos:" + this.f7411f);
        if (m4054h()) {
            sb.append(" scrap ");
            sb.append(this.f7419n ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m4051e()) {
            sb.append(" invalid");
        }
        if (!m4050d()) {
            sb.append(" unbound");
        }
        if ((this.f7414i & 2) != 0) {
            sb.append(" update");
        }
        if (m4053g()) {
            sb.append(" removed");
        }
        if (m4060n()) {
            sb.append(" ignored");
        }
        if (m4055i()) {
            sb.append(" tmpDetached");
        }
        if (!m4052f()) {
            sb.append(" not recyclable(" + this.f7417l + ")");
        }
        if ((this.f7414i & 512) != 0 || m4051e()) {
            sb.append(" undefined adapter position");
        }
        if (this.f7406a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
