package p104h1;

import android.os.Trace;
import android.support.v4.media.session.C0858A;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p000A.AbstractC0016Q;
import p000A.C0025a;
import p000A.C0027b;
import p000A.C0058r;
import p001A0.C0069c;
import p122m1.AbstractC2003a;
import p157w.AbstractC2317k;

/* JADX INFO: renamed from: h1.K */
/* JADX INFO: loaded from: classes.dex */
public final class C1627K {

    /* JADX INFO: renamed from: a */
    public final ArrayList f7375a;

    /* JADX INFO: renamed from: b */
    public ArrayList f7376b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f7377c;

    /* JADX INFO: renamed from: d */
    public final List f7378d;

    /* JADX INFO: renamed from: e */
    public int f7379e;

    /* JADX INFO: renamed from: f */
    public int f7380f;

    /* JADX INFO: renamed from: g */
    public C1626J f7381g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ RecyclerView f7382h;

    public C1627K(RecyclerView recyclerView) {
        this.f7382h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f7375a = arrayList;
        this.f7376b = null;
        this.f7377c = new ArrayList();
        this.f7378d = Collections.unmodifiableList(arrayList);
        this.f7379e = 2;
        this.f7380f = 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m4031a(AbstractC1635T abstractC1635T, boolean z3) {
        RecyclerView.m2746g(abstractC1635T);
        RecyclerView recyclerView = this.f7382h;
        C1637V c1637v = recyclerView.f4765q0;
        View view = abstractC1635T.f7406a;
        if (c1637v != null) {
            C1636U c1636u = c1637v.f7427e;
            AbstractC0016Q.m86h(view, c1636u != null ? (C0027b) c1636u.f7425e.remove(view) : null);
        }
        if (z3) {
            ArrayList arrayList = recyclerView.f4770t;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            AbstractC1667x abstractC1667x = recyclerView.f4766r;
            if (abstractC1667x != null) {
                abstractC1667x.mo2613e(abstractC1635T);
            }
            if (recyclerView.f4751j0 != null) {
                recyclerView.f4756m.m3366N(abstractC1635T);
            }
        }
        abstractC1635T.f7423r = null;
        abstractC1635T.f7422q = null;
        C1626J c1626jM4033c = m4033c();
        c1626jM4033c.getClass();
        int i3 = abstractC1635T.f7410e;
        ArrayList arrayList2 = c1626jM4033c.m4030a(i3).f7368a;
        if (((C1625I) c1626jM4033c.f7372a.get(i3)).f7369b <= arrayList2.size()) {
            AbstractC2003a.m4532c(view);
        } else {
            abstractC1635T.m4058l();
            arrayList2.add(abstractC1635T);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m4032b(int i3) {
        RecyclerView recyclerView = this.f7382h;
        if (i3 >= 0 && i3 < recyclerView.f4751j0.m4045b()) {
            return !recyclerView.f4751j0.f7390f ? i3 : recyclerView.f4752k.m784f(i3, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i3 + ". State item count is " + recyclerView.f4751j0.m4045b() + recyclerView.m2790w());
    }

    /* JADX INFO: renamed from: c */
    public final C1626J m4033c() {
        if (this.f7381g == null) {
            C1626J c1626j = new C1626J();
            c1626j.f7372a = new SparseArray();
            c1626j.f7373b = 0;
            c1626j.f7374c = Collections.newSetFromMap(new IdentityHashMap());
            this.f7381g = c1626j;
            m4034d();
        }
        return this.f7381g;
    }

    /* JADX INFO: renamed from: d */
    public final void m4034d() {
        RecyclerView recyclerView;
        AbstractC1667x abstractC1667x;
        C1626J c1626j = this.f7381g;
        if (c1626j == null || (abstractC1667x = (recyclerView = this.f7382h).f4766r) == null || !recyclerView.f4778x) {
            return;
        }
        c1626j.f7374c.add(abstractC1667x);
    }

    /* JADX INFO: renamed from: e */
    public final void m4035e(AbstractC1667x abstractC1667x, boolean z3) {
        C1626J c1626j = this.f7381g;
        if (c1626j == null) {
            return;
        }
        Set set = c1626j.f7374c;
        set.remove(abstractC1667x);
        if (set.size() != 0 || z3) {
            return;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = c1626j.f7372a;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((C1625I) sparseArray.get(sparseArray.keyAt(i3))).f7368a;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                AbstractC2003a.m4532c(((AbstractC1635T) arrayList.get(i4)).f7406a);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4036f() {
        ArrayList arrayList = this.f7377c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m4037g(size);
        }
        arrayList.clear();
        if (RecyclerView.f4709F0) {
            C1656m c1656m = this.f7382h.f4749i0;
            int[] iArr = (int[]) c1656m.f7540a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c1656m.f7543d = 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4037g(int i3) {
        ArrayList arrayList = this.f7377c;
        m4031a((AbstractC1635T) arrayList.get(i3), true);
        arrayList.remove(i3);
    }

    /* JADX INFO: renamed from: h */
    public final void m4038h(View view) {
        AbstractC1635T abstractC1635TM2741F = RecyclerView.m2741F(view);
        boolean zM4055i = abstractC1635TM2741F.m4055i();
        RecyclerView recyclerView = this.f7382h;
        if (zM4055i) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC1635TM2741F.m4054h()) {
            abstractC1635TM2741F.f7418m.m4042l(abstractC1635TM2741F);
        } else if (abstractC1635TM2741F.m4061o()) {
            abstractC1635TM2741F.f7414i &= -33;
        }
        m4039i(abstractC1635TM2741F);
        if (recyclerView.f4730P == null || abstractC1635TM2741F.m4052f()) {
            return;
        }
        recyclerView.f4730P.mo3993d(abstractC1635TM2741F);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b A[LOOP:2: B:44:0x008e->B:48:0x009b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x009e A[EDGE_INSN: B:74:0x009e->B:49:0x009e BREAK  A[LOOP:1: B:40:0x0077->B:47:0x0098], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x009e A[EDGE_INSN: B:75:0x009e->B:49:0x009e BREAK  A[LOOP:1: B:40:0x0077->B:47:0x0098, LOOP_LABEL: LOOP:1: B:40:0x0077->B:47:0x0098], SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public final void m4039i(AbstractC1635T abstractC1635T) {
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        C1656m c1656m;
        int i5;
        int i6;
        boolean zM4054h = abstractC1635T.m4054h();
        RecyclerView recyclerView = this.f7382h;
        boolean z5 = false;
        boolean z6 = true;
        View view = abstractC1635T.f7406a;
        if (zM4054h || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC1635T.m4054h());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.m2790w());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC1635T.m4055i()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC1635T + recyclerView.m2790w());
        }
        if (abstractC1635T.m4060n()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.m2790w());
        }
        if ((abstractC1635T.f7414i & 16) == 0) {
            WeakHashMap weakHashMap = AbstractC0016Q.f14a;
            if (view.hasTransientState()) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        if (abstractC1635T.m4052f()) {
            if (this.f7380f <= 0 || (abstractC1635T.f7414i & 526) != 0) {
                z4 = false;
            } else {
                ArrayList arrayList = this.f7377c;
                int size = arrayList.size();
                if (size >= this.f7380f && size > 0) {
                    m4037g(0);
                    size--;
                }
                if (RecyclerView.f4709F0 && size > 0) {
                    C1656m c1656m2 = recyclerView.f4749i0;
                    int i7 = abstractC1635T.f7408c;
                    if (((int[]) c1656m2.f7540a) != null) {
                        int i8 = c1656m2.f7543d * 2;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= i8) {
                                i3 = size - 1;
                                loop1: while (i3 >= 0) {
                                    i4 = ((AbstractC1635T) arrayList.get(i3)).f7408c;
                                    c1656m = recyclerView.f4749i0;
                                    if (((int[]) c1656m.f7540a) != null) {
                                        break;
                                    }
                                    i5 = c1656m.f7543d * 2;
                                    i6 = 0;
                                    while (true) {
                                        if (i6 < i5) {
                                            break loop1;
                                        } else if (((int[]) c1656m.f7540a)[i6] == i4) {
                                            break;
                                        } else {
                                            i6 += 2;
                                        }
                                    }
                                    i3--;
                                }
                                size = i3 + 1;
                            } else if (((int[]) c1656m2.f7540a)[i9] != i7) {
                                i9 += 2;
                            }
                        }
                    } else {
                        i3 = size - 1;
                        loop1: while (i3 >= 0) {
                            i4 = ((AbstractC1635T) arrayList.get(i3)).f7408c;
                            c1656m = recyclerView.f4749i0;
                            if (((int[]) c1656m.f7540a) != null) {
                                break;
                                break;
                            }
                            i5 = c1656m.f7543d * 2;
                            i6 = 0;
                            while (true) {
                                if (i6 < i5) {
                                    break loop1;
                                    break loop1;
                                } else if (((int[]) c1656m.f7540a)[i6] == i4) {
                                    break;
                                } else {
                                    i6 += 2;
                                }
                            }
                            i3--;
                        }
                        size = i3 + 1;
                    }
                }
                arrayList.add(size, abstractC1635T);
                z4 = true;
            }
            if (z4) {
                z5 = z4;
                z6 = false;
            } else {
                m4031a(abstractC1635T, true);
                z5 = z4;
            }
        } else {
            z6 = false;
        }
        recyclerView.f4756m.m3366N(abstractC1635T);
        if (z5 || z6 || !z3) {
            return;
        }
        AbstractC2003a.m4532c(view);
        abstractC1635T.f7423r = null;
        abstractC1635T.f7422q = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m4040j(View view) {
        AbstractC1618B abstractC1618B;
        AbstractC1635T abstractC1635TM2741F = RecyclerView.m2741F(view);
        boolean z3 = (abstractC1635TM2741F.f7414i & 12) != 0;
        RecyclerView recyclerView = this.f7382h;
        if (!z3 && abstractC1635TM2741F.m4056j() && (abstractC1618B = recyclerView.f4730P) != null) {
            C1651h c1651h = (C1651h) abstractC1618B;
            if (abstractC1635TM2741F.m4049c().isEmpty() && c1651h.f7494g && !abstractC1635TM2741F.m4051e()) {
                if (this.f7376b == null) {
                    this.f7376b = new ArrayList();
                }
                abstractC1635TM2741F.f7418m = this;
                abstractC1635TM2741F.f7419n = true;
                this.f7376b.add(abstractC1635TM2741F);
                return;
            }
        }
        if (!abstractC1635TM2741F.m4051e() || abstractC1635TM2741F.m4053g()) {
            abstractC1635TM2741F.f7418m = this;
            abstractC1635TM2741F.f7419n = false;
            this.f7375a.add(abstractC1635TM2741F);
        } else {
            recyclerView.f4766r.getClass();
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.m2790w());
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:116:0x0204  */
    /* JADX WARN: Code duplicated, block: B:118:0x020e  */
    /* JADX WARN: Code duplicated, block: B:120:0x021b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0229  */
    /* JADX WARN: Code duplicated, block: B:124:0x0231  */
    /* JADX WARN: Code duplicated, block: B:126:0x0238  */
    /* JADX WARN: Code duplicated, block: B:131:0x0252  */
    /* JADX WARN: Code duplicated, block: B:134:0x025d A[LOOP:4: B:125:0x0236->B:134:0x025d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x0260 A[EDGE_INSN: B:135:0x0260->B:136:0x0263 BREAK  A[LOOP:4: B:125:0x0236->B:134:0x025d]] */
    /* JADX WARN: Code duplicated, block: B:137:0x0265  */
    /* JADX WARN: Code duplicated, block: B:138:0x026b  */
    /* JADX WARN: Code duplicated, block: B:140:0x026f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0277  */
    /* JADX WARN: Code duplicated, block: B:148:0x028b  */
    /* JADX WARN: Code duplicated, block: B:150:0x028e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:156:0x02a7 A[Catch: all -> 0x02db, TRY_LEAVE, TryCatch #0 {all -> 0x02db, blocks: (B:152:0x0294, B:154:0x02a1, B:156:0x02a7, B:169:0x02dd, B:170:0x02e4), top: B:278:0x0294 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:169:0x02dd A[Catch: all -> 0x02db, TRY_ENTER, TryCatch #0 {all -> 0x02db, blocks: (B:152:0x0294, B:154:0x02a1, B:156:0x02a7, B:169:0x02dd, B:170:0x02e4), top: B:278:0x0294 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:176:0x031d  */
    /* JADX WARN: Code duplicated, block: B:182:0x032f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0331  */
    /* JADX WARN: Code duplicated, block: B:185:0x0334  */
    /* JADX WARN: Code duplicated, block: B:187:0x033c  */
    /* JADX WARN: Code duplicated, block: B:193:0x0361  */
    /* JADX WARN: Code duplicated, block: B:195:0x0367  */
    /* JADX WARN: Code duplicated, block: B:197:0x036d  */
    /* JADX WARN: Code duplicated, block: B:198:0x036f  */
    /* JADX WARN: Code duplicated, block: B:200:0x0372  */
    /* JADX WARN: Code duplicated, block: B:204:0x037c  */
    /* JADX WARN: Code duplicated, block: B:206:0x0390  */
    /* JADX WARN: Code duplicated, block: B:208:0x039c  */
    /* JADX WARN: Code duplicated, block: B:212:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:213:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:215:0x03af  */
    /* JADX WARN: Code duplicated, block: B:218:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:220:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:223:0x03de  */
    /* JADX WARN: Code duplicated, block: B:228:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:231:0x0408  */
    /* JADX WARN: Code duplicated, block: B:234:0x0410  */
    /* JADX WARN: Code duplicated, block: B:236:0x0413  */
    /* JADX WARN: Code duplicated, block: B:238:0x041b  */
    /* JADX WARN: Code duplicated, block: B:242:0x0423  */
    /* JADX WARN: Code duplicated, block: B:244:0x0427  */
    /* JADX WARN: Code duplicated, block: B:245:0x0429  */
    /* JADX WARN: Code duplicated, block: B:247:0x042c  */
    /* JADX WARN: Code duplicated, block: B:250:0x0436  */
    /* JADX WARN: Code duplicated, block: B:252:0x043a  */
    /* JADX WARN: Code duplicated, block: B:253:0x043f  */
    /* JADX WARN: Code duplicated, block: B:255:0x0446 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:260:0x0454  */
    /* JADX WARN: Code duplicated, block: B:264:0x045d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0467  */
    /* JADX WARN: Code duplicated, block: B:267:0x046d  */
    /* JADX WARN: Code duplicated, block: B:268:0x0477  */
    /* JADX WARN: Code duplicated, block: B:271:0x047d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:273:0x0480  */
    /* JADX WARN: Code duplicated, block: B:285:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:291:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f6 A[EDGE_INSN: B:66:0x00f6->B:87:0x017d BREAK  A[LOOP:1: B:29:0x0057->B:41:0x0081]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0106  */
    /* JADX WARN: Code duplicated, block: B:69:0x0121  */
    /* JADX WARN: Code duplicated, block: B:71:0x0135  */
    /* JADX WARN: Code duplicated, block: B:73:0x0149  */
    /* JADX WARN: Code duplicated, block: B:75:0x0152  */
    /* JADX WARN: Code duplicated, block: B:88:0x017f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0185  */
    /* JADX WARN: Code duplicated, block: B:91:0x0188  */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x0106, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0121, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x0135, please report this as an issue */
    /* JADX INFO: renamed from: k */
    public final AbstractC1635T m4041k(int i3, long j3) {
        AbstractC1635T abstractC1635TMo2594d;
        boolean z3;
        long j4;
        long j5;
        long j6;
        boolean z4;
        View view;
        int iM784f;
        int i4;
        boolean z5;
        long nanoTime;
        long j7;
        AccessibilityManager accessibilityManager;
        boolean z6;
        boolean z7;
        C1637V c1637v;
        C1636U c1636u;
        boolean z8;
        View.AccessibilityDelegate accessibilityDelegateM81c;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        long j8;
        boolean z9;
        ViewGroup.LayoutParams layoutParams2;
        C1622F c1622f;
        int i5;
        boolean z10;
        int iM784f2;
        int iMo2592b;
        long nanoTime2;
        View view2;
        long nanoTime3;
        long j9;
        RecyclerView recyclerViewM2740B;
        long j10;
        boolean z11;
        C1625I c1625i;
        ArrayList arrayList2;
        int size;
        View view3;
        boolean z12;
        ArrayList arrayList3;
        int size2;
        int i6;
        ArrayList arrayList4;
        int size3;
        int i7;
        View view4;
        ArrayList arrayList5;
        int size4;
        int i8;
        AbstractC1635T abstractC1635T;
        AbstractC1635T abstractC1635TM2741F;
        C0858A c0858a;
        int iIndexOfChild;
        C0069c c0069c;
        C0858A c0858a2;
        int iIndexOfChild2;
        C0069c c0069c2;
        int iM348t;
        AbstractC1635T abstractC1635TM2741F2;
        int i9;
        boolean z13;
        AbstractC1635T abstractC1635T2;
        int size5;
        RecyclerView recyclerView = this.f7382h;
        C1631O c1631o = recyclerView.f4751j0;
        if (i3 < 0 || i3 >= c1631o.m4045b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i3 + "(" + i3 + "). Item count:" + c1631o.m4045b() + recyclerView.m2790w());
        }
        C0027b c0027b = null;
        if (c1631o.f7390f) {
            ArrayList arrayList6 = this.f7376b;
            if (arrayList6 != null && (size5 = arrayList6.size()) != 0) {
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        recyclerView.f4766r.getClass();
                        abstractC1635TMo2594d = null;
                        break;
                    }
                    abstractC1635TMo2594d = (AbstractC1635T) this.f7376b.get(i10);
                    if (!abstractC1635TMo2594d.m4061o() && abstractC1635TMo2594d.m4048b() == i3) {
                        abstractC1635TMo2594d.m4047a(32);
                        break;
                    }
                    i10++;
                }
            } else {
                abstractC1635TMo2594d = null;
                break;
            }
            z3 = abstractC1635TMo2594d != null;
            if (abstractC1635TMo2594d == null) {
                arrayList3 = this.f7375a;
                size2 = arrayList3.size();
                i6 = 0;
                while (true) {
                    if (i6 < size2) {
                        arrayList4 = (ArrayList) recyclerView.f4754l.f3641j;
                        size3 = arrayList4.size();
                        i7 = 0;
                        while (true) {
                            if (i7 < size3) {
                                view4 = null;
                                break;
                            }
                            view4 = (View) arrayList4.get(i7);
                            abstractC1635TM2741F2 = RecyclerView.m2741F(view4);
                            if (abstractC1635TM2741F2.m4048b() != i3 && !abstractC1635TM2741F2.m4051e() && !abstractC1635TM2741F2.m4053g()) {
                                break;
                            }
                            i7++;
                        }
                        if (view4 != null) {
                            arrayList5 = this.f7377c;
                            size4 = arrayList5.size();
                            i8 = 0;
                            while (true) {
                                if (i8 < size4) {
                                    abstractC1635TMo2594d = null;
                                    break;
                                }
                                abstractC1635T = (AbstractC1635T) arrayList5.get(i8);
                                if (abstractC1635T.m4051e() && abstractC1635T.m4048b() == i3) {
                                    View view5 = abstractC1635T.f7406a;
                                    if (view5.getParent() == null || view5.getParent() == abstractC1635T.f7422q) {
                                        arrayList5.remove(i8);
                                        abstractC1635TMo2594d = abstractC1635T;
                                        break;
                                    }
                                }
                                i8++;
                            }
                        } else {
                            abstractC1635TM2741F = RecyclerView.m2741F(view4);
                            c0858a = recyclerView.f4754l;
                            iIndexOfChild = ((C1666w) c0858a.f3639h).f7586a.indexOfChild(view4);
                            if (iIndexOfChild >= 0) {
                                throw new IllegalArgumentException("view is not a child, cannot hide " + view4);
                            }
                            c0069c = (C0069c) c0858a.f3640i;
                            if (c0069c.m350v(iIndexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view4);
                            }
                            c0069c.m347s(iIndexOfChild);
                            c0858a.m2175X(view4);
                            c0858a2 = recyclerView.f4754l;
                            iIndexOfChild2 = ((C1666w) c0858a2.f3639h).f7586a.indexOfChild(view4);
                            if (iIndexOfChild2 == -1) {
                                iM348t = -1;
                            } else {
                                c0069c2 = (C0069c) c0858a2.f3640i;
                                if (c0069c2.m350v(iIndexOfChild2)) {
                                    iM348t = -1;
                                } else {
                                    iM348t = iIndexOfChild2 - c0069c2.m348t(iIndexOfChild2);
                                }
                            }
                            if (iM348t != -1) {
                                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC1635TM2741F + recyclerView.m2790w());
                            }
                            recyclerView.f4754l.m2181v(iM348t);
                            m4040j(view4);
                            abstractC1635TM2741F.m4047a(8224);
                            abstractC1635TMo2594d = abstractC1635TM2741F;
                            break;
                        }
                    } else {
                        abstractC1635T2 = (AbstractC1635T) arrayList3.get(i6);
                        if (abstractC1635T2.m4061o() && abstractC1635T2.m4048b() == i3 && !abstractC1635T2.m4051e() && (c1631o.f7390f || !abstractC1635T2.m4053g())) {
                            abstractC1635T2.m4047a(32);
                            abstractC1635TMo2594d = abstractC1635T2;
                            break;
                        }
                        i6++;
                    }
                }
                if (abstractC1635TMo2594d != null) {
                    if (!abstractC1635TMo2594d.m4053g()) {
                        z13 = c1631o.f7390f;
                    } else {
                        i9 = abstractC1635TMo2594d.f7408c;
                        if (i9 >= 0 || i9 >= recyclerView.f4766r.mo2591a()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC1635TMo2594d + recyclerView.m2790w());
                        }
                        if (c1631o.f7390f || recyclerView.f4766r.mo2592b(abstractC1635TMo2594d.f7408c) == abstractC1635TMo2594d.f7410e) {
                            recyclerView.f4766r.getClass();
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    if (z13) {
                        z3 = true;
                    } else {
                        abstractC1635TMo2594d.m4047a(4);
                        if (abstractC1635TMo2594d.m4054h()) {
                            recyclerView.removeDetachedView(abstractC1635TMo2594d.f7406a, false);
                            abstractC1635TMo2594d.f7418m.m4042l(abstractC1635TMo2594d);
                        } else if (abstractC1635TMo2594d.m4061o()) {
                            abstractC1635TMo2594d.f7414i &= -33;
                        }
                        m4039i(abstractC1635TMo2594d);
                        abstractC1635TMo2594d = null;
                    }
                }
            }
            if (abstractC1635TMo2594d == null) {
                iM784f2 = recyclerView.f4752k.m784f(i3, 0);
                if (iM784f2 >= 0) {
                    j5 = 3;
                    if (iM784f2 < recyclerView.f4766r.mo2591a()) {
                        iMo2592b = recyclerView.f4766r.mo2592b(iM784f2);
                        recyclerView.f4766r.getClass();
                        if (abstractC1635TMo2594d == null) {
                            c1625i = (C1625I) m4033c().f7372a.get(iMo2592b);
                            if (c1625i != null) {
                                j6 = 4;
                                abstractC1635TMo2594d = null;
                                break;
                            }
                            arrayList2 = c1625i.f7368a;
                            if (arrayList2.isEmpty()) {
                                size = arrayList2.size() - 1;
                                while (true) {
                                    if (size >= 0) {
                                        j6 = 4;
                                        abstractC1635TMo2594d = null;
                                        break;
                                    }
                                    AbstractC1635T abstractC1635T3 = (AbstractC1635T) arrayList2.get(size);
                                    j6 = 4;
                                    view3 = abstractC1635T3.f7406a;
                                    if (view3.getParent() != null || view3.getParent() == abstractC1635T3.f7422q) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    if (!z12) {
                                        abstractC1635TMo2594d = (AbstractC1635T) arrayList2.remove(size);
                                        break;
                                    }
                                    size--;
                                }
                            } else {
                                j6 = 4;
                                abstractC1635TMo2594d = null;
                                break;
                            }
                            if (abstractC1635TMo2594d != null) {
                                abstractC1635TMo2594d.m4058l();
                                int[] iArr = RecyclerView.f4706C0;
                            }
                        } else {
                            j6 = 4;
                        }
                        if (abstractC1635TMo2594d == null) {
                            nanoTime2 = recyclerView.getNanoTime();
                            if (j3 != Long.MAX_VALUE) {
                                j10 = this.f7381g.m4030a(iMo2592b).f7370c;
                                if (j10 != 0 || j10 + nanoTime2 < j3) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!z11) {
                                    return null;
                                }
                            }
                            AbstractC1667x abstractC1667x = recyclerView.f4766r;
                            abstractC1667x.getClass();
                            try {
                                int i11 = AbstractC2317k.f9837a;
                                Trace.beginSection("RV CreateView");
                                abstractC1635TMo2594d = abstractC1667x.mo2594d(recyclerView, iMo2592b);
                                view2 = abstractC1635TMo2594d.f7406a;
                                if (view2.getParent() == null) {
                                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                }
                                abstractC1635TMo2594d.f7410e = iMo2592b;
                                Trace.endSection();
                                if (RecyclerView.f4709F0 && (recyclerViewM2740B = RecyclerView.m2740B(view2)) != null) {
                                    abstractC1635TMo2594d.f7407b = new WeakReference(recyclerViewM2740B);
                                }
                                j4 = 0;
                                nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                                C1625I c1625iM4030a = this.f7381g.m4030a(iMo2592b);
                                j9 = c1625iM4030a.f7370c;
                                if (j9 != 0) {
                                    nanoTime3 = (nanoTime3 / j6) + ((j9 / j6) * 3);
                                }
                                c1625iM4030a.f7370c = nanoTime3;
                            } catch (Throwable th) {
                                int i12 = AbstractC2317k.f9837a;
                                Trace.endSection();
                                throw th;
                            }
                        } else {
                            j4 = 0;
                        }
                    }
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i3 + "(offset:" + iM784f2 + ").state:" + c1631o.m4045b() + recyclerView.m2790w());
            }
            j4 = 0;
            j5 = 3;
            j6 = 4;
            if (z3 && !c1631o.f7390f) {
                i5 = abstractC1635TMo2594d.f7414i;
                if ((i5 & 8192) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    abstractC1635TMo2594d.f7414i = i5 & (-8193);
                    if (c1631o.f7393i) {
                        AbstractC1618B.m3990b(abstractC1635TMo2594d);
                        AbstractC1618B abstractC1618B = recyclerView.f4730P;
                        abstractC1635TMo2594d.m4049c();
                        abstractC1618B.getClass();
                        C0058r c0058r = new C0058r();
                        c0058r.m320b(abstractC1635TMo2594d);
                        recyclerView.m2762Q(abstractC1635TMo2594d, c0058r);
                    }
                }
            }
            z4 = c1631o.f7390f;
            view = abstractC1635TMo2594d.f7406a;
            if (z4 || !abstractC1635TMo2594d.m4050d()) {
                if (abstractC1635TMo2594d.m4050d()) {
                    if ((abstractC1635TMo2594d.f7414i & 2) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9 || abstractC1635TMo2594d.m4051e()) {
                        iM784f = recyclerView.f4752k.m784f(i3, 0);
                        abstractC1635TMo2594d.f7423r = null;
                        abstractC1635TMo2594d.f7422q = recyclerView;
                        i4 = abstractC1635TMo2594d.f7410e;
                        long nanoTime4 = recyclerView.getNanoTime();
                        if (j3 != Long.MAX_VALUE) {
                            j8 = this.f7381g.m4030a(i4).f7371d;
                            if (j8 != j4) {
                            }
                        }
                        AbstractC1667x abstractC1667x2 = recyclerView.f4766r;
                        abstractC1667x2.getClass();
                        if (abstractC1635TMo2594d.f7423r == null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            abstractC1635TMo2594d.f7408c = iM784f;
                            abstractC1635TMo2594d.f7414i = (abstractC1635TMo2594d.f7414i & (-520)) | 1;
                            int i13 = AbstractC2317k.f9837a;
                            Trace.beginSection("RV OnBindView");
                        }
                        abstractC1635TMo2594d.f7423r = abstractC1667x2;
                        abstractC1635TMo2594d.m4049c();
                        abstractC1667x2.mo2593c(abstractC1635TMo2594d, iM784f);
                        if (z5) {
                            arrayList = abstractC1635TMo2594d.f7415j;
                            if (arrayList != null) {
                                arrayList.clear();
                            }
                            abstractC1635TMo2594d.f7414i &= -1025;
                            layoutParams = view.getLayoutParams();
                            if (layoutParams instanceof C1622F) {
                                ((C1622F) layoutParams).f7366c = true;
                            }
                            int i14 = AbstractC2317k.f9837a;
                            Trace.endSection();
                        }
                        nanoTime = recyclerView.getNanoTime() - nanoTime4;
                        C1625I c1625iM4030a2 = this.f7381g.m4030a(abstractC1635TMo2594d.f7410e);
                        j7 = c1625iM4030a2.f7371d;
                        if (j7 != j4) {
                            nanoTime = (nanoTime / j6) + ((j7 / j6) * j5);
                        }
                        c1625iM4030a2.f7371d = nanoTime;
                        accessibilityManager = recyclerView.f4720F;
                        if (accessibilityManager == null) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                            WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            c1637v = recyclerView.f4765q0;
                            if (c1637v != null) {
                                c1636u = c1637v.f7427e;
                                if (c1636u != null) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z8) {
                                    c1636u.getClass();
                                    accessibilityDelegateM81c = AbstractC0016Q.m81c(view);
                                    if (accessibilityDelegateM81c != null) {
                                        if (accessibilityDelegateM81c instanceof C0025a) {
                                            c0027b = ((C0025a) accessibilityDelegateM81c).f28a;
                                        } else {
                                            c0027b = new C0027b(accessibilityDelegateM81c);
                                        }
                                    }
                                    if (c0027b != null) {
                                        c1636u.f7425e.put(view, c0027b);
                                    }
                                }
                                AbstractC0016Q.m86h(view, c1636u);
                            }
                        }
                        if (c1631o.f7390f) {
                            abstractC1635TMo2594d.f7411f = i3;
                        }
                        z7 = true;
                    }
                } else {
                    iM784f = recyclerView.f4752k.m784f(i3, 0);
                    abstractC1635TMo2594d.f7423r = null;
                    abstractC1635TMo2594d.f7422q = recyclerView;
                    i4 = abstractC1635TMo2594d.f7410e;
                    long nanoTime5 = recyclerView.getNanoTime();
                    if (j3 != Long.MAX_VALUE) {
                        j8 = this.f7381g.m4030a(i4).f7371d;
                        if (j8 != j4 || j8 + nanoTime5 < j3) {
                        }
                    }
                    AbstractC1667x abstractC1667x3 = recyclerView.f4766r;
                    abstractC1667x3.getClass();
                    if (abstractC1635TMo2594d.f7423r == null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        abstractC1635TMo2594d.f7408c = iM784f;
                        abstractC1635TMo2594d.f7414i = (abstractC1635TMo2594d.f7414i & (-520)) | 1;
                        int i15 = AbstractC2317k.f9837a;
                        Trace.beginSection("RV OnBindView");
                    }
                    abstractC1635TMo2594d.f7423r = abstractC1667x3;
                    abstractC1635TMo2594d.m4049c();
                    abstractC1667x3.mo2593c(abstractC1635TMo2594d, iM784f);
                    if (z5) {
                        arrayList = abstractC1635TMo2594d.f7415j;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        abstractC1635TMo2594d.f7414i &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof C1622F) {
                            ((C1622F) layoutParams).f7366c = true;
                        }
                        int i16 = AbstractC2317k.f9837a;
                        Trace.endSection();
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime5;
                    C1625I c1625iM4030a3 = this.f7381g.m4030a(abstractC1635TMo2594d.f7410e);
                    j7 = c1625iM4030a3.f7371d;
                    if (j7 != j4) {
                        nanoTime = (nanoTime / j6) + ((j7 / j6) * j5);
                    }
                    c1625iM4030a3.f7371d = nanoTime;
                    accessibilityManager = recyclerView.f4720F;
                    if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        WeakHashMap weakHashMap2 = AbstractC0016Q.f14a;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        c1637v = recyclerView.f4765q0;
                        if (c1637v != null) {
                            c1636u = c1637v.f7427e;
                            if (c1636u != null) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                c1636u.getClass();
                                accessibilityDelegateM81c = AbstractC0016Q.m81c(view);
                                if (accessibilityDelegateM81c != null) {
                                    if (accessibilityDelegateM81c instanceof C0025a) {
                                        c0027b = ((C0025a) accessibilityDelegateM81c).f28a;
                                    } else {
                                        c0027b = new C0027b(accessibilityDelegateM81c);
                                    }
                                }
                                if (c0027b != null && c0027b != c1636u) {
                                    c1636u.f7425e.put(view, c0027b);
                                }
                            }
                            AbstractC0016Q.m86h(view, c1636u);
                        }
                    }
                    if (c1631o.f7390f) {
                        abstractC1635TMo2594d.f7411f = i3;
                    }
                    z7 = true;
                }
                layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    c1622f = (C1622F) recyclerView.generateDefaultLayoutParams();
                    view.setLayoutParams(c1622f);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    c1622f = (C1622F) layoutParams2;
                } else {
                    c1622f = (C1622F) recyclerView.generateLayoutParams(layoutParams2);
                    view.setLayoutParams(c1622f);
                }
                c1622f.f7364a = abstractC1635TMo2594d;
                c1622f.f7367d = !z3 && z7;
                return abstractC1635TMo2594d;
            }
            abstractC1635TMo2594d.f7411f = i3;
            z7 = false;
            layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                c1622f = (C1622F) recyclerView.generateDefaultLayoutParams();
                view.setLayoutParams(c1622f);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                c1622f = (C1622F) recyclerView.generateLayoutParams(layoutParams2);
                view.setLayoutParams(c1622f);
            } else {
                c1622f = (C1622F) layoutParams2;
            }
            c1622f.f7364a = abstractC1635TMo2594d;
            c1622f.f7367d = !z3 && z7;
            return abstractC1635TMo2594d;
        }
        abstractC1635TMo2594d = null;
        if (abstractC1635TMo2594d == null) {
            arrayList3 = this.f7375a;
            size2 = arrayList3.size();
            i6 = 0;
            while (true) {
                if (i6 < size2) {
                    arrayList4 = (ArrayList) recyclerView.f4754l.f3641j;
                    size3 = arrayList4.size();
                    i7 = 0;
                    while (true) {
                        if (i7 < size3) {
                            view4 = null;
                            break;
                        }
                        view4 = (View) arrayList4.get(i7);
                        abstractC1635TM2741F2 = RecyclerView.m2741F(view4);
                        if (abstractC1635TM2741F2.m4048b() != i3) {
                        }
                        i7++;
                    }
                    if (view4 != null) {
                        arrayList5 = this.f7377c;
                        size4 = arrayList5.size();
                        i8 = 0;
                        while (true) {
                            if (i8 < size4) {
                                abstractC1635TMo2594d = null;
                                break;
                            }
                            abstractC1635T = (AbstractC1635T) arrayList5.get(i8);
                            if (abstractC1635T.m4051e()) {
                            }
                            i8++;
                        }
                    } else {
                        abstractC1635TM2741F = RecyclerView.m2741F(view4);
                        c0858a = recyclerView.f4754l;
                        iIndexOfChild = ((C1666w) c0858a.f3639h).f7586a.indexOfChild(view4);
                        if (iIndexOfChild >= 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view4);
                        }
                        c0069c = (C0069c) c0858a.f3640i;
                        if (c0069c.m350v(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view4);
                        }
                        c0069c.m347s(iIndexOfChild);
                        c0858a.m2175X(view4);
                        c0858a2 = recyclerView.f4754l;
                        iIndexOfChild2 = ((C1666w) c0858a2.f3639h).f7586a.indexOfChild(view4);
                        if (iIndexOfChild2 == -1) {
                            iM348t = -1;
                        } else {
                            c0069c2 = (C0069c) c0858a2.f3640i;
                            if (c0069c2.m350v(iIndexOfChild2)) {
                                iM348t = -1;
                            } else {
                                iM348t = iIndexOfChild2 - c0069c2.m348t(iIndexOfChild2);
                            }
                        }
                        if (iM348t != -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC1635TM2741F + recyclerView.m2790w());
                        }
                        recyclerView.f4754l.m2181v(iM348t);
                        m4040j(view4);
                        abstractC1635TM2741F.m4047a(8224);
                        abstractC1635TMo2594d = abstractC1635TM2741F;
                        break;
                    }
                } else {
                    abstractC1635T2 = (AbstractC1635T) arrayList3.get(i6);
                    if (abstractC1635T2.m4061o()) {
                    }
                    i6++;
                }
            }
            if (abstractC1635TMo2594d != null) {
                if (!abstractC1635TMo2594d.m4053g()) {
                    i9 = abstractC1635TMo2594d.f7408c;
                    if (i9 >= 0) {
                    }
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC1635TMo2594d + recyclerView.m2790w());
                }
                z13 = c1631o.f7390f;
                if (z13) {
                    abstractC1635TMo2594d.m4047a(4);
                    if (abstractC1635TMo2594d.m4054h()) {
                        recyclerView.removeDetachedView(abstractC1635TMo2594d.f7406a, false);
                        abstractC1635TMo2594d.f7418m.m4042l(abstractC1635TMo2594d);
                    } else if (abstractC1635TMo2594d.m4061o()) {
                        abstractC1635TMo2594d.f7414i &= -33;
                    }
                    m4039i(abstractC1635TMo2594d);
                    abstractC1635TMo2594d = null;
                } else {
                    z3 = true;
                }
            }
        }
        if (abstractC1635TMo2594d == null) {
            iM784f2 = recyclerView.f4752k.m784f(i3, 0);
            if (iM784f2 >= 0) {
                j5 = 3;
                if (iM784f2 < recyclerView.f4766r.mo2591a()) {
                    iMo2592b = recyclerView.f4766r.mo2592b(iM784f2);
                    recyclerView.f4766r.getClass();
                    if (abstractC1635TMo2594d == null) {
                        c1625i = (C1625I) m4033c().f7372a.get(iMo2592b);
                        if (c1625i != null) {
                            j6 = 4;
                            abstractC1635TMo2594d = null;
                            break;
                        }
                        arrayList2 = c1625i.f7368a;
                        if (arrayList2.isEmpty()) {
                            j6 = 4;
                            abstractC1635TMo2594d = null;
                            break;
                        }
                        size = arrayList2.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                j6 = 4;
                                abstractC1635TMo2594d = null;
                                break;
                            }
                            AbstractC1635T abstractC1635T4 = (AbstractC1635T) arrayList2.get(size);
                            j6 = 4;
                            view3 = abstractC1635T4.f7406a;
                            if (view3.getParent() != null) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                abstractC1635TMo2594d = (AbstractC1635T) arrayList2.remove(size);
                                break;
                            }
                            size--;
                        }
                        if (abstractC1635TMo2594d != null) {
                            abstractC1635TMo2594d.m4058l();
                            int[] iArr2 = RecyclerView.f4706C0;
                        }
                    } else {
                        j6 = 4;
                    }
                    if (abstractC1635TMo2594d == null) {
                        nanoTime2 = recyclerView.getNanoTime();
                        if (j3 != Long.MAX_VALUE) {
                            j10 = this.f7381g.m4030a(iMo2592b).f7370c;
                            if (j10 != 0) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            if (!z11) {
                                return null;
                            }
                        }
                        AbstractC1667x abstractC1667x4 = recyclerView.f4766r;
                        abstractC1667x4.getClass();
                        int i17 = AbstractC2317k.f9837a;
                        Trace.beginSection("RV CreateView");
                        abstractC1635TMo2594d = abstractC1667x4.mo2594d(recyclerView, iMo2592b);
                        view2 = abstractC1635TMo2594d.f7406a;
                        if (view2.getParent() == null) {
                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                        }
                        abstractC1635TMo2594d.f7410e = iMo2592b;
                        Trace.endSection();
                        if (RecyclerView.f4709F0) {
                            abstractC1635TMo2594d.f7407b = new WeakReference(recyclerViewM2740B);
                        }
                        j4 = 0;
                        nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                        C1625I c1625iM4030a4 = this.f7381g.m4030a(iMo2592b);
                        j9 = c1625iM4030a4.f7370c;
                        if (j9 != 0) {
                            nanoTime3 = (nanoTime3 / j6) + ((j9 / j6) * 3);
                        }
                        c1625iM4030a4.f7370c = nanoTime3;
                    } else {
                        j4 = 0;
                    }
                }
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i3 + "(offset:" + iM784f2 + ").state:" + c1631o.m4045b() + recyclerView.m2790w());
        }
        j4 = 0;
        j5 = 3;
        j6 = 4;
        if (z3) {
            i5 = abstractC1635TMo2594d.f7414i;
            if ((i5 & 8192) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                abstractC1635TMo2594d.f7414i = i5 & (-8193);
                if (c1631o.f7393i) {
                    AbstractC1618B.m3990b(abstractC1635TMo2594d);
                    AbstractC1618B abstractC1618B2 = recyclerView.f4730P;
                    abstractC1635TMo2594d.m4049c();
                    abstractC1618B2.getClass();
                    C0058r c0058r2 = new C0058r();
                    c0058r2.m320b(abstractC1635TMo2594d);
                    recyclerView.m2762Q(abstractC1635TMo2594d, c0058r2);
                }
            }
        }
        z4 = c1631o.f7390f;
        view = abstractC1635TMo2594d.f7406a;
        if (z4) {
            if (abstractC1635TMo2594d.m4050d()) {
                iM784f = recyclerView.f4752k.m784f(i3, 0);
                abstractC1635TMo2594d.f7423r = null;
                abstractC1635TMo2594d.f7422q = recyclerView;
                i4 = abstractC1635TMo2594d.f7410e;
                long nanoTime6 = recyclerView.getNanoTime();
                if (j3 != Long.MAX_VALUE) {
                    j8 = this.f7381g.m4030a(i4).f7371d;
                    if (j8 != j4) {
                    }
                }
                AbstractC1667x abstractC1667x5 = recyclerView.f4766r;
                abstractC1667x5.getClass();
                if (abstractC1635TMo2594d.f7423r == null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    abstractC1635TMo2594d.f7408c = iM784f;
                    abstractC1635TMo2594d.f7414i = (abstractC1635TMo2594d.f7414i & (-520)) | 1;
                    int i18 = AbstractC2317k.f9837a;
                    Trace.beginSection("RV OnBindView");
                }
                abstractC1635TMo2594d.f7423r = abstractC1667x5;
                abstractC1635TMo2594d.m4049c();
                abstractC1667x5.mo2593c(abstractC1635TMo2594d, iM784f);
                if (z5) {
                    arrayList = abstractC1635TMo2594d.f7415j;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    abstractC1635TMo2594d.f7414i &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof C1622F) {
                        ((C1622F) layoutParams).f7366c = true;
                    }
                    int i19 = AbstractC2317k.f9837a;
                    Trace.endSection();
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime6;
                C1625I c1625iM4030a5 = this.f7381g.m4030a(abstractC1635TMo2594d.f7410e);
                j7 = c1625iM4030a5.f7371d;
                if (j7 != j4) {
                    nanoTime = (nanoTime / j6) + ((j7 / j6) * j5);
                }
                c1625iM4030a5.f7371d = nanoTime;
                accessibilityManager = recyclerView.f4720F;
                if (accessibilityManager == null) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (z6) {
                    WeakHashMap weakHashMap3 = AbstractC0016Q.f14a;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    c1637v = recyclerView.f4765q0;
                    if (c1637v != null) {
                        c1636u = c1637v.f7427e;
                        if (c1636u != null) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            c1636u.getClass();
                            accessibilityDelegateM81c = AbstractC0016Q.m81c(view);
                            if (accessibilityDelegateM81c != null) {
                                if (accessibilityDelegateM81c instanceof C0025a) {
                                    c0027b = ((C0025a) accessibilityDelegateM81c).f28a;
                                } else {
                                    c0027b = new C0027b(accessibilityDelegateM81c);
                                }
                            }
                            if (c0027b != null) {
                                c1636u.f7425e.put(view, c0027b);
                            }
                        }
                        AbstractC0016Q.m86h(view, c1636u);
                    }
                }
                if (c1631o.f7390f) {
                    abstractC1635TMo2594d.f7411f = i3;
                }
                z7 = true;
            } else {
                if ((abstractC1635TMo2594d.f7414i & 2) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    iM784f = recyclerView.f4752k.m784f(i3, 0);
                    abstractC1635TMo2594d.f7423r = null;
                    abstractC1635TMo2594d.f7422q = recyclerView;
                    i4 = abstractC1635TMo2594d.f7410e;
                    long nanoTime7 = recyclerView.getNanoTime();
                    if (j3 != Long.MAX_VALUE) {
                        j8 = this.f7381g.m4030a(i4).f7371d;
                        if (j8 != j4) {
                        }
                    }
                    AbstractC1667x abstractC1667x6 = recyclerView.f4766r;
                    abstractC1667x6.getClass();
                    if (abstractC1635TMo2594d.f7423r == null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        abstractC1635TMo2594d.f7408c = iM784f;
                        abstractC1635TMo2594d.f7414i = (abstractC1635TMo2594d.f7414i & (-520)) | 1;
                        int i110 = AbstractC2317k.f9837a;
                        Trace.beginSection("RV OnBindView");
                    }
                    abstractC1635TMo2594d.f7423r = abstractC1667x6;
                    abstractC1635TMo2594d.m4049c();
                    abstractC1667x6.mo2593c(abstractC1635TMo2594d, iM784f);
                    if (z5) {
                        arrayList = abstractC1635TMo2594d.f7415j;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        abstractC1635TMo2594d.f7414i &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof C1622F) {
                            ((C1622F) layoutParams).f7366c = true;
                        }
                        int i111 = AbstractC2317k.f9837a;
                        Trace.endSection();
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime7;
                    C1625I c1625iM4030a6 = this.f7381g.m4030a(abstractC1635TMo2594d.f7410e);
                    j7 = c1625iM4030a6.f7371d;
                    if (j7 != j4) {
                        nanoTime = (nanoTime / j6) + ((j7 / j6) * j5);
                    }
                    c1625iM4030a6.f7371d = nanoTime;
                    accessibilityManager = recyclerView.f4720F;
                    if (accessibilityManager == null) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        WeakHashMap weakHashMap4 = AbstractC0016Q.f14a;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        c1637v = recyclerView.f4765q0;
                        if (c1637v != null) {
                            c1636u = c1637v.f7427e;
                            if (c1636u != null) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                c1636u.getClass();
                                accessibilityDelegateM81c = AbstractC0016Q.m81c(view);
                                if (accessibilityDelegateM81c != null) {
                                    if (accessibilityDelegateM81c instanceof C0025a) {
                                        c0027b = ((C0025a) accessibilityDelegateM81c).f28a;
                                    } else {
                                        c0027b = new C0027b(accessibilityDelegateM81c);
                                    }
                                }
                                if (c0027b != null) {
                                    c1636u.f7425e.put(view, c0027b);
                                }
                            }
                            AbstractC0016Q.m86h(view, c1636u);
                        }
                    }
                    if (c1631o.f7390f) {
                        abstractC1635TMo2594d.f7411f = i3;
                    }
                    z7 = true;
                } else {
                    iM784f = recyclerView.f4752k.m784f(i3, 0);
                    abstractC1635TMo2594d.f7423r = null;
                    abstractC1635TMo2594d.f7422q = recyclerView;
                    i4 = abstractC1635TMo2594d.f7410e;
                    long nanoTime8 = recyclerView.getNanoTime();
                    if (j3 != Long.MAX_VALUE) {
                        j8 = this.f7381g.m4030a(i4).f7371d;
                        if (j8 != j4) {
                        }
                    }
                    AbstractC1667x abstractC1667x7 = recyclerView.f4766r;
                    abstractC1667x7.getClass();
                    if (abstractC1635TMo2594d.f7423r == null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        abstractC1635TMo2594d.f7408c = iM784f;
                        abstractC1635TMo2594d.f7414i = (abstractC1635TMo2594d.f7414i & (-520)) | 1;
                        int i112 = AbstractC2317k.f9837a;
                        Trace.beginSection("RV OnBindView");
                    }
                    abstractC1635TMo2594d.f7423r = abstractC1667x7;
                    abstractC1635TMo2594d.m4049c();
                    abstractC1667x7.mo2593c(abstractC1635TMo2594d, iM784f);
                    if (z5) {
                        arrayList = abstractC1635TMo2594d.f7415j;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        abstractC1635TMo2594d.f7414i &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof C1622F) {
                            ((C1622F) layoutParams).f7366c = true;
                        }
                        int i113 = AbstractC2317k.f9837a;
                        Trace.endSection();
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime8;
                    C1625I c1625iM4030a7 = this.f7381g.m4030a(abstractC1635TMo2594d.f7410e);
                    j7 = c1625iM4030a7.f7371d;
                    if (j7 != j4) {
                        nanoTime = (nanoTime / j6) + ((j7 / j6) * j5);
                    }
                    c1625iM4030a7.f7371d = nanoTime;
                    accessibilityManager = recyclerView.f4720F;
                    if (accessibilityManager == null) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        WeakHashMap weakHashMap5 = AbstractC0016Q.f14a;
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                        c1637v = recyclerView.f4765q0;
                        if (c1637v != null) {
                            c1636u = c1637v.f7427e;
                            if (c1636u != null) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                c1636u.getClass();
                                accessibilityDelegateM81c = AbstractC0016Q.m81c(view);
                                if (accessibilityDelegateM81c != null) {
                                    if (accessibilityDelegateM81c instanceof C0025a) {
                                        c0027b = ((C0025a) accessibilityDelegateM81c).f28a;
                                    } else {
                                        c0027b = new C0027b(accessibilityDelegateM81c);
                                    }
                                }
                                if (c0027b != null) {
                                    c1636u.f7425e.put(view, c0027b);
                                }
                            }
                            AbstractC0016Q.m86h(view, c1636u);
                        }
                    }
                    if (c1631o.f7390f) {
                        abstractC1635TMo2594d.f7411f = i3;
                    }
                    z7 = true;
                }
            }
        } else if (abstractC1635TMo2594d.m4050d()) {
            iM784f = recyclerView.f4752k.m784f(i3, 0);
            abstractC1635TMo2594d.f7423r = null;
            abstractC1635TMo2594d.f7422q = recyclerView;
            i4 = abstractC1635TMo2594d.f7410e;
            long nanoTime9 = recyclerView.getNanoTime();
            if (j3 != Long.MAX_VALUE) {
                j8 = this.f7381g.m4030a(i4).f7371d;
                if (j8 != j4) {
                }
            }
            AbstractC1667x abstractC1667x8 = recyclerView.f4766r;
            abstractC1667x8.getClass();
            if (abstractC1635TMo2594d.f7423r == null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                abstractC1635TMo2594d.f7408c = iM784f;
                abstractC1635TMo2594d.f7414i = (abstractC1635TMo2594d.f7414i & (-520)) | 1;
                int i114 = AbstractC2317k.f9837a;
                Trace.beginSection("RV OnBindView");
            }
            abstractC1635TMo2594d.f7423r = abstractC1667x8;
            abstractC1635TMo2594d.m4049c();
            abstractC1667x8.mo2593c(abstractC1635TMo2594d, iM784f);
            if (z5) {
                arrayList = abstractC1635TMo2594d.f7415j;
                if (arrayList != null) {
                    arrayList.clear();
                }
                abstractC1635TMo2594d.f7414i &= -1025;
                layoutParams = view.getLayoutParams();
                if (layoutParams instanceof C1622F) {
                    ((C1622F) layoutParams).f7366c = true;
                }
                int i115 = AbstractC2317k.f9837a;
                Trace.endSection();
            }
            nanoTime = recyclerView.getNanoTime() - nanoTime9;
            C1625I c1625iM4030a8 = this.f7381g.m4030a(abstractC1635TMo2594d.f7410e);
            j7 = c1625iM4030a8.f7371d;
            if (j7 != j4) {
                nanoTime = (nanoTime / j6) + ((j7 / j6) * j5);
            }
            c1625iM4030a8.f7371d = nanoTime;
            accessibilityManager = recyclerView.f4720F;
            if (accessibilityManager == null) {
                z6 = false;
            } else {
                z6 = false;
            }
            if (z6) {
                WeakHashMap weakHashMap6 = AbstractC0016Q.f14a;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                c1637v = recyclerView.f4765q0;
                if (c1637v != null) {
                    c1636u = c1637v.f7427e;
                    if (c1636u != null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        c1636u.getClass();
                        accessibilityDelegateM81c = AbstractC0016Q.m81c(view);
                        if (accessibilityDelegateM81c != null) {
                            if (accessibilityDelegateM81c instanceof C0025a) {
                                c0027b = ((C0025a) accessibilityDelegateM81c).f28a;
                            } else {
                                c0027b = new C0027b(accessibilityDelegateM81c);
                            }
                        }
                        if (c0027b != null) {
                            c1636u.f7425e.put(view, c0027b);
                        }
                    }
                    AbstractC0016Q.m86h(view, c1636u);
                }
            }
            if (c1631o.f7390f) {
                abstractC1635TMo2594d.f7411f = i3;
            }
            z7 = true;
        } else {
            if ((abstractC1635TMo2594d.f7414i & 2) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                iM784f = recyclerView.f4752k.m784f(i3, 0);
                abstractC1635TMo2594d.f7423r = null;
                abstractC1635TMo2594d.f7422q = recyclerView;
                i4 = abstractC1635TMo2594d.f7410e;
                long nanoTime10 = recyclerView.getNanoTime();
                if (j3 != Long.MAX_VALUE) {
                    j8 = this.f7381g.m4030a(i4).f7371d;
                    if (j8 != j4) {
                    }
                }
                AbstractC1667x abstractC1667x9 = recyclerView.f4766r;
                abstractC1667x9.getClass();
                if (abstractC1635TMo2594d.f7423r == null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    abstractC1635TMo2594d.f7408c = iM784f;
                    abstractC1635TMo2594d.f7414i = (abstractC1635TMo2594d.f7414i & (-520)) | 1;
                    int i116 = AbstractC2317k.f9837a;
                    Trace.beginSection("RV OnBindView");
                }
                abstractC1635TMo2594d.f7423r = abstractC1667x9;
                abstractC1635TMo2594d.m4049c();
                abstractC1667x9.mo2593c(abstractC1635TMo2594d, iM784f);
                if (z5) {
                    arrayList = abstractC1635TMo2594d.f7415j;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    abstractC1635TMo2594d.f7414i &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof C1622F) {
                        ((C1622F) layoutParams).f7366c = true;
                    }
                    int i117 = AbstractC2317k.f9837a;
                    Trace.endSection();
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime10;
                C1625I c1625iM4030a9 = this.f7381g.m4030a(abstractC1635TMo2594d.f7410e);
                j7 = c1625iM4030a9.f7371d;
                if (j7 != j4) {
                    nanoTime = (nanoTime / j6) + ((j7 / j6) * j5);
                }
                c1625iM4030a9.f7371d = nanoTime;
                accessibilityManager = recyclerView.f4720F;
                if (accessibilityManager == null) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (z6) {
                    WeakHashMap weakHashMap7 = AbstractC0016Q.f14a;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    c1637v = recyclerView.f4765q0;
                    if (c1637v != null) {
                        c1636u = c1637v.f7427e;
                        if (c1636u != null) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            c1636u.getClass();
                            accessibilityDelegateM81c = AbstractC0016Q.m81c(view);
                            if (accessibilityDelegateM81c != null) {
                                if (accessibilityDelegateM81c instanceof C0025a) {
                                    c0027b = ((C0025a) accessibilityDelegateM81c).f28a;
                                } else {
                                    c0027b = new C0027b(accessibilityDelegateM81c);
                                }
                            }
                            if (c0027b != null) {
                                c1636u.f7425e.put(view, c0027b);
                            }
                        }
                        AbstractC0016Q.m86h(view, c1636u);
                    }
                }
                if (c1631o.f7390f) {
                    abstractC1635TMo2594d.f7411f = i3;
                }
                z7 = true;
            } else {
                iM784f = recyclerView.f4752k.m784f(i3, 0);
                abstractC1635TMo2594d.f7423r = null;
                abstractC1635TMo2594d.f7422q = recyclerView;
                i4 = abstractC1635TMo2594d.f7410e;
                long nanoTime11 = recyclerView.getNanoTime();
                if (j3 != Long.MAX_VALUE) {
                    j8 = this.f7381g.m4030a(i4).f7371d;
                    if (j8 != j4) {
                    }
                }
                AbstractC1667x abstractC1667x10 = recyclerView.f4766r;
                abstractC1667x10.getClass();
                if (abstractC1635TMo2594d.f7423r == null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    abstractC1635TMo2594d.f7408c = iM784f;
                    abstractC1635TMo2594d.f7414i = (abstractC1635TMo2594d.f7414i & (-520)) | 1;
                    int i118 = AbstractC2317k.f9837a;
                    Trace.beginSection("RV OnBindView");
                }
                abstractC1635TMo2594d.f7423r = abstractC1667x10;
                abstractC1635TMo2594d.m4049c();
                abstractC1667x10.mo2593c(abstractC1635TMo2594d, iM784f);
                if (z5) {
                    arrayList = abstractC1635TMo2594d.f7415j;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    abstractC1635TMo2594d.f7414i &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof C1622F) {
                        ((C1622F) layoutParams).f7366c = true;
                    }
                    int i119 = AbstractC2317k.f9837a;
                    Trace.endSection();
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime11;
                C1625I c1625iM4030a10 = this.f7381g.m4030a(abstractC1635TMo2594d.f7410e);
                j7 = c1625iM4030a10.f7371d;
                if (j7 != j4) {
                    nanoTime = (nanoTime / j6) + ((j7 / j6) * j5);
                }
                c1625iM4030a10.f7371d = nanoTime;
                accessibilityManager = recyclerView.f4720F;
                if (accessibilityManager == null) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (z6) {
                    WeakHashMap weakHashMap8 = AbstractC0016Q.f14a;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    c1637v = recyclerView.f4765q0;
                    if (c1637v != null) {
                        c1636u = c1637v.f7427e;
                        if (c1636u != null) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            c1636u.getClass();
                            accessibilityDelegateM81c = AbstractC0016Q.m81c(view);
                            if (accessibilityDelegateM81c != null) {
                                if (accessibilityDelegateM81c instanceof C0025a) {
                                    c0027b = ((C0025a) accessibilityDelegateM81c).f28a;
                                } else {
                                    c0027b = new C0027b(accessibilityDelegateM81c);
                                }
                            }
                            if (c0027b != null) {
                                c1636u.f7425e.put(view, c0027b);
                            }
                        }
                        AbstractC0016Q.m86h(view, c1636u);
                    }
                }
                if (c1631o.f7390f) {
                    abstractC1635TMo2594d.f7411f = i3;
                }
                z7 = true;
            }
        }
        layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            c1622f = (C1622F) recyclerView.generateDefaultLayoutParams();
            view.setLayoutParams(c1622f);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            c1622f = (C1622F) recyclerView.generateLayoutParams(layoutParams2);
            view.setLayoutParams(c1622f);
        } else {
            c1622f = (C1622F) layoutParams2;
        }
        c1622f.f7364a = abstractC1635TMo2594d;
        c1622f.f7367d = !z3 && z7;
        return abstractC1635TMo2594d;
    }

    /* JADX INFO: renamed from: l */
    public final void m4042l(AbstractC1635T abstractC1635T) {
        if (abstractC1635T.f7419n) {
            this.f7376b.remove(abstractC1635T);
        } else {
            this.f7375a.remove(abstractC1635T);
        }
        abstractC1635T.f7418m = null;
        abstractC1635T.f7419n = false;
        abstractC1635T.f7414i &= -33;
    }

    /* JADX INFO: renamed from: m */
    public final void m4043m() {
        AbstractC1621E abstractC1621E = this.f7382h.f4768s;
        this.f7380f = this.f7379e + (abstractC1621E != null ? abstractC1621E.f7358i : 0);
        ArrayList arrayList = this.f7377c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f7380f; size--) {
            m4037g(size);
        }
    }
}
