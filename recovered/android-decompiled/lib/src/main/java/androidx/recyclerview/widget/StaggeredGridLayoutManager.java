package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.AbstractC0916f;
import com.google.android.gms.internal.cast.C1323r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import p000A.AbstractC0016Q;
import p014F.RunnableC0153b;
import p104h1.AbstractC1621E;
import p104h1.C1620D;
import p104h1.C1622F;
import p104h1.C1627K;
import p104h1.C1631O;
import p104h1.C1638W;
import p104h1.C1639X;
import p104h1.C1640Y;
import p104h1.C1641Z;
import p104h1.C1643a0;
import p104h1.C1656m;
import p104h1.C1660q;
import p122m1.AbstractC2003a;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC1621E {

    /* JADX INFO: renamed from: A */
    public final C1323r f4784A;

    /* JADX INFO: renamed from: B */
    public final int f4785B;

    /* JADX INFO: renamed from: C */
    public boolean f4786C;

    /* JADX INFO: renamed from: D */
    public boolean f4787D;

    /* JADX INFO: renamed from: E */
    public C1641Z f4788E;

    /* JADX INFO: renamed from: F */
    public final Rect f4789F;

    /* JADX INFO: renamed from: G */
    public final C1638W f4790G;

    /* JADX INFO: renamed from: H */
    public final boolean f4791H;

    /* JADX INFO: renamed from: I */
    public int[] f4792I;

    /* JADX INFO: renamed from: J */
    public final RunnableC0153b f4793J;

    /* JADX INFO: renamed from: o */
    public final int f4794o;

    /* JADX INFO: renamed from: p */
    public final C1643a0[] f4795p;

    /* JADX INFO: renamed from: q */
    public final AbstractC0916f f4796q;

    /* JADX INFO: renamed from: r */
    public final AbstractC0916f f4797r;

    /* JADX INFO: renamed from: s */
    public final int f4798s;

    /* JADX INFO: renamed from: t */
    public int f4799t;

    /* JADX INFO: renamed from: u */
    public final C1660q f4800u;

    /* JADX INFO: renamed from: v */
    public boolean f4801v;

    /* JADX INFO: renamed from: x */
    public final BitSet f4803x;

    /* JADX INFO: renamed from: w */
    public boolean f4802w = false;

    /* JADX INFO: renamed from: y */
    public int f4804y = -1;

    /* JADX INFO: renamed from: z */
    public int f4805z = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f4794o = -1;
        this.f4801v = false;
        C1323r c1323r = new C1323r(7, (byte) 0);
        this.f4784A = c1323r;
        this.f4785B = 2;
        this.f4789F = new Rect();
        this.f4790G = new C1638W(this);
        this.f4791H = true;
        this.f4793J = new RunnableC0153b(16, this);
        C1620D c1620dM4001D = AbstractC1621E.m4001D(context, attributeSet, i3, i4);
        int i5 = c1620dM4001D.f7346a;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo2725b(null);
        if (i5 != this.f4798s) {
            this.f4798s = i5;
            AbstractC0916f abstractC0916f = this.f4796q;
            this.f4796q = this.f4797r;
            this.f4797r = abstractC0916f;
            m4017h0();
        }
        int i6 = c1620dM4001D.f7347b;
        mo2725b(null);
        if (i6 != this.f4794o) {
            c1323r.m3387u();
            m4017h0();
            this.f4794o = i6;
            this.f4803x = new BitSet(this.f4794o);
            this.f4795p = new C1643a0[this.f4794o];
            for (int i7 = 0; i7 < this.f4794o; i7++) {
                this.f4795p[i7] = new C1643a0(this, i7);
            }
            m4017h0();
        }
        boolean z3 = c1620dM4001D.f7348c;
        mo2725b(null);
        C1641Z c1641z = this.f4788E;
        if (c1641z != null && c1641z.f7447n != z3) {
            c1641z.f7447n = z3;
        }
        this.f4801v = z3;
        m4017h0();
        C1660q c1660q = new C1660q();
        c1660q.f7557a = true;
        c1660q.f7562f = 0;
        c1660q.f7563g = 0;
        this.f4800u = c1660q;
        this.f4796q = AbstractC0916f.m2389a(this, this.f4798s);
        this.f4797r = AbstractC0916f.m2389a(this, 1 - this.f4798s);
    }

    /* JADX INFO: renamed from: V0 */
    public static int m2794V0(int i3, int i4, int i5) {
        int mode;
        return (!(i4 == 0 && i5 == 0) && ((mode = View.MeasureSpec.getMode(i3)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - i4) - i5), mode) : i3;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m2795A0(C1627K c1627k, C1631O c1631o, boolean z3) {
        int iMo2395g;
        int iM2799E0 = m2799E0(Integer.MIN_VALUE);
        if (iM2799E0 != Integer.MIN_VALUE && (iMo2395g = this.f4796q.mo2395g() - iM2799E0) > 0) {
            int i3 = iMo2395g - (-m2815R0(-iMo2395g, c1627k, c1631o));
            if (!z3 || i3 <= 0) {
                return;
            }
            this.f4796q.mo2403o(i3);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m2796B0(C1627K c1627k, C1631O c1631o, boolean z3) {
        int iMo2399k;
        int iM2800F0 = m2800F0(Integer.MAX_VALUE);
        if (iM2800F0 != Integer.MAX_VALUE && (iMo2399k = iM2800F0 - this.f4796q.mo2399k()) > 0) {
            int iM2815R0 = iMo2399k - m2815R0(iMo2399k, c1627k, c1631o);
            if (!z3 || iM2815R0 <= 0) {
                return;
            }
            this.f4796q.mo2403o(-iM2815R0);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final int m2797C0() {
        if (m4026u() == 0) {
            return 0;
        }
        return AbstractC1621E.m4000C(m4025t(0));
    }

    /* JADX INFO: renamed from: D0 */
    public final int m2798D0() {
        int iM4026u = m4026u();
        if (iM4026u == 0) {
            return 0;
        }
        return AbstractC1621E.m4000C(m4025t(iM4026u - 1));
    }

    /* JADX INFO: renamed from: E0 */
    public final int m2799E0(int i3) {
        int iM4068f = this.f4795p[0].m4068f(i3);
        for (int i4 = 1; i4 < this.f4794o; i4++) {
            int iM4068f2 = this.f4795p[i4].m4068f(i3);
            if (iM4068f2 > iM4068f) {
                iM4068f = iM4068f2;
            }
        }
        return iM4068f;
    }

    /* JADX INFO: renamed from: F0 */
    public final int m2800F0(int i3) {
        int iM4070h = this.f4795p[0].m4070h(i3);
        for (int i4 = 1; i4 < this.f4794o; i4++) {
            int iM4070h2 = this.f4795p[i4].m4070h(i3);
            if (iM4070h2 < iM4070h) {
                iM4070h = iM4070h2;
            }
        }
        return iM4070h;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: G */
    public final boolean mo2708G() {
        return this.f4785B != 0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0039  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050 A[LOOP:0: B:25:0x003f->B:29:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[EDGE_INSN: B:30:0x0053->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077 A[LOOP:1: B:34:0x0066->B:38:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:63:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0054 A[EDGE_INSN: B:64:0x0054->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x007b A[EDGE_INSN: B:66:0x007b->B:40:0x007b BREAK  A[LOOP:1: B:34:0x0066->B:38:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: G0 */
    public final void m2801G0(int i3, int i4, int i5) {
        int i6;
        int i7;
        C1323r c1323r;
        int[] iArr;
        int iM2798D0;
        ArrayList arrayList;
        C1640Y c1640y;
        int size;
        int i8;
        int i9;
        int size2;
        int iM2798D1 = this.f4802w ? m2798D0() : m2797C0();
        if (i5 == 8) {
            if (i3 < i4) {
                i6 = i4 + 1;
            } else {
                i6 = i3 + 1;
                i7 = i4;
            }
            c1323r = this.f4784A;
            iArr = (int[]) c1323r.f5961h;
            if (iArr != null && i7 < iArr.length) {
                arrayList = (ArrayList) c1323r.f5962i;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                c1640y = null;
                                break;
                            }
                            c1640y = (C1640Y) ((ArrayList) c1323r.f5962i).get(size2);
                            if (c1640y.f7436g == i7) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        c1640y = null;
                        break;
                    }
                    if (c1640y != null) {
                        ((ArrayList) c1323r.f5962i).remove(c1640y);
                    }
                    size = ((ArrayList) c1323r.f5962i).size();
                    i8 = 0;
                    while (true) {
                        if (i8 < size) {
                            i8 = -1;
                            break;
                        } else if (((C1640Y) ((ArrayList) c1323r.f5962i).get(i8)).f7436g >= i7) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    if (i8 != -1) {
                        C1640Y c1640y2 = (C1640Y) ((ArrayList) c1323r.f5962i).get(i8);
                        ((ArrayList) c1323r.f5962i).remove(i8);
                        i9 = c1640y2.f7436g;
                    } else {
                        i9 = -1;
                    }
                } else {
                    i9 = -1;
                }
                if (i9 == -1) {
                    int[] iArr2 = (int[]) c1323r.f5961h;
                    Arrays.fill(iArr2, i7, iArr2.length, -1);
                    int length = ((int[]) c1323r.f5961h).length;
                } else {
                    Arrays.fill((int[]) c1323r.f5961h, i7, Math.min(i9 + 1, ((int[]) c1323r.f5961h).length), -1);
                }
            }
            if (i5 != 1) {
                c1323r.m3357E(i3, i4);
            } else if (i5 != 2) {
                c1323r.m3358F(i3, i4);
            } else if (i5 == 8) {
                c1323r.m3358F(i3, 1);
                c1323r.m3357E(i4, 1);
            }
            if (i6 <= iM2798D1) {
                return;
            }
            if (this.f4802w) {
                iM2798D0 = m2797C0();
            } else {
                iM2798D0 = m2798D0();
            }
            if (i7 <= iM2798D0) {
                m4017h0();
            }
        }
        i6 = i3 + i4;
        i7 = i3;
        c1323r = this.f4784A;
        iArr = (int[]) c1323r.f5961h;
        if (iArr != null) {
            arrayList = (ArrayList) c1323r.f5962i;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            c1640y = null;
                            break;
                        }
                        c1640y = (C1640Y) ((ArrayList) c1323r.f5962i).get(size2);
                        if (c1640y.f7436g == i7) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    c1640y = null;
                    break;
                }
                if (c1640y != null) {
                    ((ArrayList) c1323r.f5962i).remove(c1640y);
                }
                size = ((ArrayList) c1323r.f5962i).size();
                i8 = 0;
                while (true) {
                    if (i8 < size) {
                        i8 = -1;
                        break;
                    } else {
                        if (((C1640Y) ((ArrayList) c1323r.f5962i).get(i8)).f7436g >= i7) {
                            break;
                            break;
                        }
                        i8++;
                    }
                }
                if (i8 != -1) {
                    C1640Y c1640y3 = (C1640Y) ((ArrayList) c1323r.f5962i).get(i8);
                    ((ArrayList) c1323r.f5962i).remove(i8);
                    i9 = c1640y3.f7436g;
                } else {
                    i9 = -1;
                }
            } else {
                i9 = -1;
            }
            if (i9 == -1) {
                int[] iArr3 = (int[]) c1323r.f5961h;
                Arrays.fill(iArr3, i7, iArr3.length, -1);
                int length2 = ((int[]) c1323r.f5961h).length;
            } else {
                Arrays.fill((int[]) c1323r.f5961h, i7, Math.min(i9 + 1, ((int[]) c1323r.f5961h).length), -1);
            }
        }
        if (i5 != 1) {
            c1323r.m3357E(i3, i4);
        } else if (i5 != 2) {
            c1323r.m3358F(i3, i4);
        } else if (i5 == 8) {
            c1323r.m3358F(i3, 1);
            c1323r.m3357E(i4, 1);
        }
        if (i6 <= iM2798D1) {
            return;
        }
        if (this.f4802w) {
            iM2798D0 = m2797C0();
        } else {
            iM2798D0 = m2798D0();
        }
        if (i7 <= iM2798D0) {
            m4017h0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    /* JADX INFO: renamed from: H0 */
    public final View m2802H0() {
        boolean z3;
        boolean z4;
        int iM4026u = m4026u();
        int i3 = iM4026u - 1;
        BitSet bitSet = new BitSet(this.f4794o);
        bitSet.set(0, this.f4794o, true);
        byte b3 = (this.f4798s == 1 && m2803I0()) ? (byte) 1 : (byte) -1;
        if (this.f4802w) {
            iM4026u = -1;
        } else {
            i3 = 0;
        }
        int i4 = i3 < iM4026u ? 1 : -1;
        while (i3 != iM4026u) {
            View viewM4025t = m4025t(i3);
            C1639X c1639x = (C1639X) viewM4025t.getLayoutParams();
            if (bitSet.get(c1639x.f7435e.f7457e)) {
                C1643a0 c1643a0 = c1639x.f7435e;
                if (this.f4802w) {
                    int i5 = c1643a0.f7455c;
                    if (i5 == Integer.MIN_VALUE) {
                        c1643a0.m4063a();
                        i5 = c1643a0.f7455c;
                    }
                    if (i5 < this.f4796q.mo2395g()) {
                        ArrayList arrayList = c1643a0.f7453a;
                        ((C1639X) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return viewM4025t;
                    }
                } else {
                    int i6 = c1643a0.f7454b;
                    if (i6 == Integer.MIN_VALUE) {
                        View view = (View) c1643a0.f7453a.get(0);
                        C1639X c1639x2 = (C1639X) view.getLayoutParams();
                        c1643a0.f7454b = c1643a0.f7458f.f4796q.mo2393e(view);
                        c1639x2.getClass();
                        i6 = c1643a0.f7454b;
                    }
                    if (i6 > this.f4796q.mo2399k()) {
                        ((C1639X) ((View) c1643a0.f7453a.get(0)).getLayoutParams()).getClass();
                        return viewM4025t;
                    }
                }
                bitSet.clear(c1639x.f7435e.f7457e);
            }
            i3 += i4;
            if (i3 != iM4026u) {
                View viewM4025t2 = m4025t(i3);
                if (this.f4802w) {
                    int iMo2390b = this.f4796q.mo2390b(viewM4025t);
                    int iMo2390b2 = this.f4796q.mo2390b(viewM4025t2);
                    if (iMo2390b >= iMo2390b2) {
                        if (iMo2390b == iMo2390b2) {
                            if (c1639x.f7435e.f7457e - ((C1639X) viewM4025t2.getLayoutParams()).f7435e.f7457e < 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (b3 < 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z3 != z4) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewM4025t;
                }
                int iMo2393e = this.f4796q.mo2393e(viewM4025t);
                int iMo2393e2 = this.f4796q.mo2393e(viewM4025t2);
                if (iMo2393e <= iMo2393e2) {
                    if (iMo2393e == iMo2393e2) {
                        if (c1639x.f7435e.f7457e - ((C1639X) viewM4025t2.getLayoutParams()).f7435e.f7457e < 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (b3 < 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z3 != z4) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewM4025t;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m2803I0() {
        RecyclerView recyclerView = this.f7351b;
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        return recyclerView.getLayoutDirection() == 1;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: J */
    public final void mo2804J(int i3) {
        super.mo2804J(i3);
        for (int i4 = 0; i4 < this.f4794o; i4++) {
            C1643a0 c1643a0 = this.f4795p[i4];
            int i5 = c1643a0.f7454b;
            if (i5 != Integer.MIN_VALUE) {
                c1643a0.f7454b = i5 + i3;
            }
            int i6 = c1643a0.f7455c;
            if (i6 != Integer.MIN_VALUE) {
                c1643a0.f7455c = i6 + i3;
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m2805J0(View view, int i3, int i4) {
        RecyclerView recyclerView = this.f7351b;
        Rect rect = this.f4789F;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m2752G(view));
        }
        C1639X c1639x = (C1639X) view.getLayoutParams();
        int iM2794V0 = m2794V0(i3, ((ViewGroup.MarginLayoutParams) c1639x).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c1639x).rightMargin + rect.right);
        int iM2794V1 = m2794V0(i4, ((ViewGroup.MarginLayoutParams) c1639x).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c1639x).bottomMargin + rect.bottom);
        if (m4023p0(view, iM2794V0, iM2794V1, c1639x)) {
            view.measure(iM2794V0, iM2794V1);
        }
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: K */
    public final void mo2806K(int i3) {
        super.mo2806K(i3);
        for (int i4 = 0; i4 < this.f4794o; i4++) {
            C1643a0 c1643a0 = this.f4795p[i4];
            int i5 = c1643a0.f7454b;
            if (i5 != Integer.MIN_VALUE) {
                c1643a0.f7454b = i5 + i3;
            }
            int i6 = c1643a0.f7455c;
            if (i6 != Integer.MIN_VALUE) {
                c1643a0.f7455c = i6 + i3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0209  */
    /* JADX WARN: Code duplicated, block: B:255:0x041c  */
    /* JADX WARN: Code duplicated, block: B:266:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x01fc A[SYNTHETIC] */
    /* JADX INFO: renamed from: K0 */
    public final void m2807K0(C1627K c1627k, C1631O c1631o, boolean z3) {
        boolean z4;
        C1641Z c1641z;
        int iM4026u;
        int i3;
        int iM4000C;
        int iM4000C2;
        int iM4026u2;
        int i4;
        boolean z5;
        C1641Z c1641z2 = this.f4788E;
        C1638W c1638w = this.f4790G;
        if (!(c1641z2 == null && this.f4804y == -1) && c1631o.m4045b() == 0) {
            m4012c0(c1627k);
            c1638w.m4062a();
            return;
        }
        boolean z6 = (c1638w.f7432e && this.f4804y == -1 && this.f4788E == null) ? false : true;
        C1323r c1323r = this.f4784A;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c1638w.f7434g;
        if (z6) {
            c1638w.m4062a();
            C1641Z c1641z3 = this.f4788E;
            if (c1641z3 != null) {
                int i5 = c1641z3.f7442i;
                if (i5 > 0) {
                    if (i5 == this.f4794o) {
                        for (int i6 = 0; i6 < this.f4794o; i6++) {
                            this.f4795p[i6].m4064b();
                            C1641Z c1641z4 = this.f4788E;
                            int iMo2395g = c1641z4.f7443j[i6];
                            if (iMo2395g != Integer.MIN_VALUE) {
                                iMo2395g += c1641z4.f7448o ? this.f4796q.mo2395g() : this.f4796q.mo2399k();
                            }
                            C1643a0 c1643a0 = this.f4795p[i6];
                            c1643a0.f7454b = iMo2395g;
                            c1643a0.f7455c = iMo2395g;
                        }
                    } else {
                        c1641z3.f7443j = null;
                        c1641z3.f7442i = 0;
                        c1641z3.f7444k = 0;
                        c1641z3.f7445l = null;
                        c1641z3.f7446m = null;
                        c1641z3.f7440g = c1641z3.f7441h;
                    }
                }
                C1641Z c1641z5 = this.f4788E;
                this.f4787D = c1641z5.f7449p;
                boolean z7 = c1641z5.f7447n;
                mo2725b(null);
                C1641Z c1641z6 = this.f4788E;
                if (c1641z6 != null && c1641z6.f7447n != z7) {
                    c1641z6.f7447n = z7;
                }
                this.f4801v = z7;
                m4017h0();
                m2814Q0();
                C1641Z c1641z7 = this.f4788E;
                int i7 = c1641z7.f7440g;
                if (i7 != -1) {
                    this.f4804y = i7;
                    c1638w.f7430c = c1641z7.f7448o;
                } else {
                    c1638w.f7430c = this.f4802w;
                }
                if (c1641z7.f7444k > 1) {
                    c1323r.f5961h = c1641z7.f7445l;
                    c1323r.f5962i = c1641z7.f7446m;
                }
            } else {
                m2814Q0();
                c1638w.f7430c = this.f4802w;
            }
            if (c1631o.f7390f || (i4 = this.f4804y) == -1) {
                if (this.f4786C) {
                    int iM4045b = c1631o.m4045b();
                    iM4026u2 = m4026u() - 1;
                    while (true) {
                        if (iM4026u2 < 0) {
                            iM4000C2 = 0;
                            break;
                        }
                        iM4000C2 = AbstractC1621E.m4000C(m4025t(iM4026u2));
                        if (iM4000C2 < 0 && iM4000C2 < iM4045b) {
                            break;
                        } else {
                            iM4026u2--;
                        }
                    }
                } else {
                    int iM4045b2 = c1631o.m4045b();
                    iM4026u = m4026u();
                    i3 = 0;
                    while (true) {
                        if (i3 >= iM4026u) {
                            iM4000C2 = 0;
                            break;
                        }
                        iM4000C = AbstractC1621E.m4000C(m4025t(i3));
                        if (iM4000C < 0 && iM4000C < iM4045b2) {
                            iM4000C2 = iM4000C;
                            break;
                        }
                        i3++;
                    }
                }
                c1638w.f7428a = iM4000C2;
                c1638w.f7429b = Integer.MIN_VALUE;
            } else if (i4 < 0 || i4 >= c1631o.m4045b()) {
                this.f4804y = -1;
                this.f4805z = Integer.MIN_VALUE;
                if (this.f4786C) {
                    int iM4045b3 = c1631o.m4045b();
                    iM4026u2 = m4026u() - 1;
                    while (true) {
                        if (iM4026u2 < 0) {
                            iM4000C2 = 0;
                            break;
                        } else {
                            iM4000C2 = AbstractC1621E.m4000C(m4025t(iM4026u2));
                            if (iM4000C2 < 0) {
                            }
                            iM4026u2--;
                        }
                    }
                } else {
                    int iM4045b4 = c1631o.m4045b();
                    iM4026u = m4026u();
                    i3 = 0;
                    while (true) {
                        if (i3 >= iM4026u) {
                            iM4000C2 = 0;
                            break;
                        } else {
                            iM4000C = AbstractC1621E.m4000C(m4025t(i3));
                            if (iM4000C < 0) {
                            }
                            i3++;
                        }
                    }
                }
                c1638w.f7428a = iM4000C2;
                c1638w.f7429b = Integer.MIN_VALUE;
            } else {
                C1641Z c1641z8 = this.f4788E;
                if (c1641z8 == null || c1641z8.f7440g == -1 || c1641z8.f7442i < 1) {
                    View viewMo2732p = mo2732p(this.f4804y);
                    if (viewMo2732p != null) {
                        c1638w.f7428a = this.f4802w ? m2798D0() : m2797C0();
                        if (this.f4805z != Integer.MIN_VALUE) {
                            if (c1638w.f7430c) {
                                c1638w.f7429b = (this.f4796q.mo2395g() - this.f4805z) - this.f4796q.mo2390b(viewMo2732p);
                            } else {
                                c1638w.f7429b = (this.f4796q.mo2399k() + this.f4805z) - this.f4796q.mo2393e(viewMo2732p);
                            }
                        } else if (this.f4796q.mo2391c(viewMo2732p) > this.f4796q.mo2400l()) {
                            c1638w.f7429b = c1638w.f7430c ? this.f4796q.mo2395g() : this.f4796q.mo2399k();
                        } else {
                            int iMo2393e = this.f4796q.mo2393e(viewMo2732p) - this.f4796q.mo2399k();
                            if (iMo2393e < 0) {
                                c1638w.f7429b = -iMo2393e;
                            } else {
                                int iMo2395g2 = this.f4796q.mo2395g() - this.f4796q.mo2390b(viewMo2732p);
                                if (iMo2395g2 < 0) {
                                    c1638w.f7429b = iMo2395g2;
                                } else {
                                    c1638w.f7429b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i8 = this.f4804y;
                        c1638w.f7428a = i8;
                        int i9 = this.f4805z;
                        if (i9 == Integer.MIN_VALUE) {
                            if (m4026u() != 0) {
                                if ((i8 < m2797C0()) != this.f4802w) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                            } else if (this.f4802w) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            c1638w.f7430c = z5;
                            c1638w.f7429b = z5 ? staggeredGridLayoutManager.f4796q.mo2395g() : staggeredGridLayoutManager.f4796q.mo2399k();
                        } else if (c1638w.f7430c) {
                            c1638w.f7429b = staggeredGridLayoutManager.f4796q.mo2395g() - i9;
                        } else {
                            c1638w.f7429b = staggeredGridLayoutManager.f4796q.mo2399k() + i9;
                        }
                        c1638w.f7431d = true;
                    }
                } else {
                    c1638w.f7429b = Integer.MIN_VALUE;
                    c1638w.f7428a = this.f4804y;
                }
            }
            c1638w.f7432e = true;
        }
        if (this.f4788E == null && this.f4804y == -1 && (c1638w.f7430c != this.f4786C || m2803I0() != this.f4787D)) {
            c1323r.m3387u();
            c1638w.f7431d = true;
        }
        if (m4026u() > 0 && ((c1641z = this.f4788E) == null || c1641z.f7442i < 1)) {
            if (c1638w.f7431d) {
                for (int i10 = 0; i10 < this.f4794o; i10++) {
                    this.f4795p[i10].m4064b();
                    int i11 = c1638w.f7429b;
                    if (i11 != Integer.MIN_VALUE) {
                        C1643a0 c1643a1 = this.f4795p[i10];
                        c1643a1.f7454b = i11;
                        c1643a1.f7455c = i11;
                    }
                }
            } else if (z6 || c1638w.f7433f == null) {
                for (int i12 = 0; i12 < this.f4794o; i12++) {
                    C1643a0 c1643a2 = this.f4795p[i12];
                    boolean z8 = this.f4802w;
                    int i13 = c1638w.f7429b;
                    int iM4068f = z8 ? c1643a2.m4068f(Integer.MIN_VALUE) : c1643a2.m4070h(Integer.MIN_VALUE);
                    c1643a2.m4064b();
                    if (iM4068f != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = c1643a2.f7458f;
                        if ((!z8 || iM4068f >= staggeredGridLayoutManager2.f4796q.mo2395g()) && (z8 || iM4068f <= staggeredGridLayoutManager2.f4796q.mo2399k())) {
                            if (i13 != Integer.MIN_VALUE) {
                                iM4068f += i13;
                            }
                            c1643a2.f7455c = iM4068f;
                            c1643a2.f7454b = iM4068f;
                        }
                    }
                }
                C1643a0[] c1643a0Arr = this.f4795p;
                int length = c1643a0Arr.length;
                int[] iArr = c1638w.f7433f;
                if (iArr == null || iArr.length < length) {
                    c1638w.f7433f = new int[staggeredGridLayoutManager.f4795p.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    c1638w.f7433f[i14] = c1643a0Arr[i14].m4070h(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < this.f4794o; i15++) {
                    C1643a0 c1643a3 = this.f4795p[i15];
                    c1643a3.m4064b();
                    int i16 = c1638w.f7433f[i15];
                    c1643a3.f7454b = i16;
                    c1643a3.f7455c = i16;
                }
            }
        }
        m4021o(c1627k);
        C1660q c1660q = this.f4800u;
        c1660q.f7557a = false;
        int iMo2400l = this.f4797r.mo2400l();
        this.f4799t = iMo2400l / this.f4794o;
        View.MeasureSpec.makeMeasureSpec(iMo2400l, this.f4797r.mo2397i());
        m2817T0(c1638w.f7428a);
        if (c1638w.f7430c) {
            m2816S0(-1);
            m2824x0(c1627k, c1660q, c1631o);
            m2816S0(1);
            c1660q.f7559c = c1638w.f7428a + c1660q.f7560d;
            m2824x0(c1627k, c1660q, c1631o);
        } else {
            m2816S0(1);
            m2824x0(c1627k, c1660q, c1631o);
            m2816S0(-1);
            c1660q.f7559c = c1638w.f7428a + c1660q.f7560d;
            m2824x0(c1627k, c1660q, c1631o);
        }
        if (this.f4797r.mo2397i() != 1073741824) {
            int iM4026u3 = m4026u();
            float fMax = 0.0f;
            for (int i17 = 0; i17 < iM4026u3; i17++) {
                View viewM4025t = m4025t(i17);
                float fMo2391c = this.f4797r.mo2391c(viewM4025t);
                if (fMo2391c >= fMax) {
                    ((C1639X) viewM4025t.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fMo2391c);
                }
            }
            int i18 = this.f4799t;
            int iRound = Math.round(fMax * this.f4794o);
            if (this.f4797r.mo2397i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f4797r.mo2400l());
            }
            this.f4799t = iRound / this.f4794o;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f4797r.mo2397i());
            if (this.f4799t != i18) {
                for (int i19 = 0; i19 < iM4026u3; i19++) {
                    View viewM4025t2 = m4025t(i19);
                    C1639X c1639x = (C1639X) viewM4025t2.getLayoutParams();
                    c1639x.getClass();
                    if (m2803I0() && this.f4798s == 1) {
                        int i20 = -((this.f4794o - 1) - c1639x.f7435e.f7457e);
                        viewM4025t2.offsetLeftAndRight((this.f4799t * i20) - (i20 * i18));
                    } else {
                        int i21 = c1639x.f7435e.f7457e;
                        int i22 = this.f4799t * i21;
                        int i23 = i21 * i18;
                        if (this.f4798s == 1) {
                            viewM4025t2.offsetLeftAndRight(i22 - i23);
                        } else {
                            viewM4025t2.offsetTopAndBottom(i22 - i23);
                        }
                    }
                }
            }
        }
        if (m4026u() > 0) {
            if (this.f4802w) {
                m2795A0(c1627k, c1631o, true);
                m2796B0(c1627k, c1631o, false);
            } else {
                m2796B0(c1627k, c1631o, true);
                m2795A0(c1627k, c1631o, false);
            }
        }
        if (z3 && !c1631o.f7390f && this.f4785B != 0 && m4026u() > 0 && m2802H0() != null) {
            RecyclerView recyclerView = this.f7351b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f4793J);
            }
            z4 = m2820t0();
        }
        if (c1631o.f7390f) {
            c1638w.m4062a();
        }
        this.f4786C = c1638w.f7430c;
        this.f4787D = m2803I0();
        if (z4) {
            c1638w.m4062a();
            m2807K0(c1627k, c1631o, false);
        }
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: L */
    public final void mo2808L() {
        this.f4784A.m3387u();
        for (int i3 = 0; i3 < this.f4794o; i3++) {
            this.f4795p[i3].m4064b();
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m2809L0(int i3) {
        if (this.f4798s == 0) {
            return (i3 == -1) != this.f4802w;
        }
        return ((i3 == -1) == this.f4802w) == m2803I0();
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: M */
    public final void mo2713M(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7351b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f4793J);
        }
        for (int i3 = 0; i3 < this.f4794o; i3++) {
            this.f4795p[i3].m4064b();
        }
        recyclerView.requestLayout();
    }

    /* JADX INFO: renamed from: M0 */
    public final void m2810M0(int i3) {
        int iM2797C0;
        int i4;
        if (i3 > 0) {
            iM2797C0 = m2798D0();
            i4 = 1;
        } else {
            iM2797C0 = m2797C0();
            i4 = -1;
        }
        C1660q c1660q = this.f4800u;
        c1660q.f7557a = true;
        m2817T0(iM2797C0);
        m2816S0(i4);
        c1660q.f7559c = iM2797C0 + c1660q.f7560d;
        c1660q.f7558b = Math.abs(i3);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0049  */
    /* JADX WARN: Code duplicated, block: B:37:0x0054  */
    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: N */
    public final View mo2670N(View view, int i3, C1627K c1627k, C1631O c1631o) {
        View viewM2792y;
        int i4;
        if (m4026u() != 0) {
            RecyclerView recyclerView = this.f7351b;
            if (recyclerView == null || (viewM2792y = recyclerView.m2792y(view)) == null || ((ArrayList) this.f7350a.f3641j).contains(viewM2792y)) {
                viewM2792y = null;
            }
            if (viewM2792y != null) {
                m2814Q0();
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 17) {
                            if (i3 != 33) {
                                if (i3 == 66 ? this.f4798s == 0 : !(i3 != 130 || this.f4798s != 1)) {
                                    i4 = 1;
                                }
                            } else if (this.f4798s == 1) {
                                i4 = -1;
                            }
                            i4 = Integer.MIN_VALUE;
                        } else if (this.f4798s == 0) {
                            i4 = -1;
                        } else {
                            i4 = Integer.MIN_VALUE;
                        }
                    } else if (this.f4798s != 1 && m2803I0()) {
                        i4 = -1;
                    } else {
                        i4 = 1;
                    }
                } else if (this.f4798s != 1 && m2803I0()) {
                    i4 = 1;
                } else {
                    i4 = -1;
                }
                if (i4 != Integer.MIN_VALUE) {
                    C1639X c1639x = (C1639X) viewM2792y.getLayoutParams();
                    c1639x.getClass();
                    C1643a0 c1643a0 = c1639x.f7435e;
                    int iM2798D0 = i4 == 1 ? m2798D0() : m2797C0();
                    m2817T0(iM2798D0);
                    m2816S0(i4);
                    C1660q c1660q = this.f4800u;
                    c1660q.f7559c = c1660q.f7560d + iM2798D0;
                    c1660q.f7558b = (int) (this.f4796q.mo2400l() * 0.33333334f);
                    c1660q.f7564h = true;
                    c1660q.f7557a = false;
                    m2824x0(c1627k, c1660q, c1631o);
                    this.f4786C = this.f4802w;
                    View viewM4069g = c1643a0.m4069g(iM2798D0, i4);
                    if (viewM4069g != null && viewM4069g != viewM2792y) {
                        return viewM4069g;
                    }
                    if (m2809L0(i4)) {
                        for (int i5 = this.f4794o - 1; i5 >= 0; i5--) {
                            View viewM4069g2 = this.f4795p[i5].m4069g(iM2798D0, i4);
                            if (viewM4069g2 != null && viewM4069g2 != viewM2792y) {
                                return viewM4069g2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < this.f4794o; i6++) {
                            View viewM4069g3 = this.f4795p[i6].m4069g(iM2798D0, i4);
                            if (viewM4069g3 != null && viewM4069g3 != viewM2792y) {
                                return viewM4069g3;
                            }
                        }
                    }
                    boolean z3 = (this.f4801v ^ true) == (i4 == -1);
                    View viewMo2732p = mo2732p(z3 ? c1643a0.m4065c() : c1643a0.m4066d());
                    if (viewMo2732p != null && viewMo2732p != viewM2792y) {
                        return viewMo2732p;
                    }
                    if (m2809L0(i4)) {
                        for (int i7 = this.f4794o - 1; i7 >= 0; i7--) {
                            if (i7 != c1643a0.f7457e) {
                                View viewMo2732p2 = mo2732p(z3 ? this.f4795p[i7].m4065c() : this.f4795p[i7].m4066d());
                                if (viewMo2732p2 != null && viewMo2732p2 != viewM2792y) {
                                    return viewMo2732p2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < this.f4794o; i8++) {
                            View viewMo2732p3 = mo2732p(z3 ? this.f4795p[i8].m4065c() : this.f4795p[i8].m4066d());
                            if (viewMo2732p3 != null && viewMo2732p3 != viewM2792y) {
                                return viewMo2732p3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m2811N0(C1627K c1627k, C1660q c1660q) {
        int iMin;
        if (!c1660q.f7557a || c1660q.f7565i) {
            return;
        }
        if (c1660q.f7558b == 0) {
            if (c1660q.f7561e == -1) {
                m2812O0(c1627k, c1660q.f7563g);
                return;
            } else {
                m2813P0(c1627k, c1660q.f7562f);
                return;
            }
        }
        int i3 = 1;
        if (c1660q.f7561e == -1) {
            int i4 = c1660q.f7562f;
            int iM4070h = this.f4795p[0].m4070h(i4);
            while (i3 < this.f4794o) {
                int iM4070h2 = this.f4795p[i3].m4070h(i4);
                if (iM4070h2 > iM4070h) {
                    iM4070h = iM4070h2;
                }
                i3++;
            }
            int i5 = i4 - iM4070h;
            m2812O0(c1627k, i5 < 0 ? c1660q.f7563g : c1660q.f7563g - Math.min(i5, c1660q.f7558b));
            return;
        }
        int i6 = c1660q.f7563g;
        int iM4068f = this.f4795p[0].m4068f(i6);
        while (i3 < this.f4794o) {
            int iM4068f2 = this.f4795p[i3].m4068f(i6);
            if (iM4068f2 < iM4068f) {
                iM4068f = iM4068f2;
            }
            i3++;
        }
        int i7 = iM4068f - c1660q.f7563g;
        if (i7 < 0) {
            iMin = c1660q.f7562f;
        } else {
            iMin = Math.min(i7, c1660q.f7558b) + c1660q.f7562f;
        }
        m2813P0(c1627k, iMin);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: O */
    public final void mo2716O(AccessibilityEvent accessibilityEvent) {
        super.mo2716O(accessibilityEvent);
        if (m4026u() > 0) {
            View viewM2826z0 = m2826z0(false);
            View viewM2825y0 = m2825y0(false);
            if (viewM2826z0 == null || viewM2825y0 == null) {
                return;
            }
            int iM4000C = AbstractC1621E.m4000C(viewM2826z0);
            int iM4000C2 = AbstractC1621E.m4000C(viewM2825y0);
            if (iM4000C < iM4000C2) {
                accessibilityEvent.setFromIndex(iM4000C);
                accessibilityEvent.setToIndex(iM4000C2);
            } else {
                accessibilityEvent.setFromIndex(iM4000C2);
                accessibilityEvent.setToIndex(iM4000C);
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m2812O0(C1627K c1627k, int i3) {
        for (int iM4026u = m4026u() - 1; iM4026u >= 0; iM4026u--) {
            View viewM4025t = m4025t(iM4026u);
            if (this.f4796q.mo2393e(viewM4025t) < i3 || this.f4796q.mo2402n(viewM4025t) < i3) {
                return;
            }
            C1639X c1639x = (C1639X) viewM4025t.getLayoutParams();
            c1639x.getClass();
            if (c1639x.f7435e.f7453a.size() == 1) {
                return;
            }
            C1643a0 c1643a0 = c1639x.f7435e;
            ArrayList arrayList = c1643a0.f7453a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C1639X c1639x2 = (C1639X) view.getLayoutParams();
            c1639x2.f7435e = null;
            if (c1639x2.f7364a.m4053g() || c1639x2.f7364a.m4056j()) {
                c1643a0.f7456d -= c1643a0.f7458f.f4796q.mo2391c(view);
            }
            if (size == 1) {
                c1643a0.f7454b = Integer.MIN_VALUE;
            }
            c1643a0.f7455c = Integer.MIN_VALUE;
            m4014e0(viewM4025t, c1627k);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m2813P0(C1627K c1627k, int i3) {
        while (m4026u() > 0) {
            View viewM4025t = m4025t(0);
            if (this.f4796q.mo2390b(viewM4025t) > i3 || this.f4796q.mo2401m(viewM4025t) > i3) {
                return;
            }
            C1639X c1639x = (C1639X) viewM4025t.getLayoutParams();
            c1639x.getClass();
            if (c1639x.f7435e.f7453a.size() == 1) {
                return;
            }
            C1643a0 c1643a0 = c1639x.f7435e;
            ArrayList arrayList = c1643a0.f7453a;
            View view = (View) arrayList.remove(0);
            C1639X c1639x2 = (C1639X) view.getLayoutParams();
            c1639x2.f7435e = null;
            if (arrayList.size() == 0) {
                c1643a0.f7455c = Integer.MIN_VALUE;
            }
            if (c1639x2.f7364a.m4053g() || c1639x2.f7364a.m4056j()) {
                c1643a0.f7456d -= c1643a0.f7458f.f4796q.mo2391c(view);
            }
            c1643a0.f7454b = Integer.MIN_VALUE;
            m4014e0(viewM4025t, c1627k);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m2814Q0() {
        if (this.f4798s == 1 || !m2803I0()) {
            this.f4802w = this.f4801v;
        } else {
            this.f4802w = !this.f4801v;
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final int m2815R0(int i3, C1627K c1627k, C1631O c1631o) {
        if (m4026u() == 0 || i3 == 0) {
            return 0;
        }
        m2810M0(i3);
        C1660q c1660q = this.f4800u;
        int iM2824x0 = m2824x0(c1627k, c1660q, c1631o);
        if (c1660q.f7558b >= iM2824x0) {
            i3 = i3 < 0 ? -iM2824x0 : iM2824x0;
        }
        this.f4796q.mo2403o(-i3);
        this.f4786C = this.f4802w;
        c1660q.f7558b = 0;
        m2811N0(c1627k, c1660q);
        return i3;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: S */
    public final void mo2674S(int i3, int i4) {
        m2801G0(i3, i4, 1);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m2816S0(int i3) {
        C1660q c1660q = this.f4800u;
        c1660q.f7561e = i3;
        c1660q.f7560d = this.f4802w != (i3 == -1) ? -1 : 1;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: T */
    public final void mo2675T() {
        this.f4784A.m3387u();
        m4017h0();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m2817T0(int i3) {
        C1660q c1660q = this.f4800u;
        boolean z3 = false;
        c1660q.f7558b = 0;
        c1660q.f7559c = i3;
        RecyclerView recyclerView = this.f7351b;
        if (recyclerView == null || !recyclerView.f4758n) {
            c1660q.f7563g = this.f4796q.mo2394f();
            c1660q.f7562f = 0;
        } else {
            c1660q.f7562f = this.f4796q.mo2399k();
            c1660q.f7563g = this.f4796q.mo2395g();
        }
        c1660q.f7564h = false;
        c1660q.f7557a = true;
        if (this.f4796q.mo2397i() == 0 && this.f4796q.mo2394f() == 0) {
            z3 = true;
        }
        c1660q.f7565i = z3;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: U */
    public final void mo2676U(int i3, int i4) {
        m2801G0(i3, i4, 8);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m2818U0(C1643a0 c1643a0, int i3, int i4) {
        int i5 = c1643a0.f7456d;
        int i6 = c1643a0.f7457e;
        if (i3 != -1) {
            int i7 = c1643a0.f7455c;
            if (i7 == Integer.MIN_VALUE) {
                c1643a0.m4063a();
                i7 = c1643a0.f7455c;
            }
            if (i7 - i5 >= i4) {
                this.f4803x.set(i6, false);
                return;
            }
            return;
        }
        int i8 = c1643a0.f7454b;
        if (i8 == Integer.MIN_VALUE) {
            View view = (View) c1643a0.f7453a.get(0);
            C1639X c1639x = (C1639X) view.getLayoutParams();
            c1643a0.f7454b = c1643a0.f7458f.f4796q.mo2393e(view);
            c1639x.getClass();
            i8 = c1643a0.f7454b;
        }
        if (i8 + i5 <= i4) {
            this.f4803x.set(i6, false);
        }
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: V */
    public final void mo2677V(int i3, int i4) {
        m2801G0(i3, i4, 2);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: W */
    public final void mo2679W(int i3, int i4) {
        m2801G0(i3, i4, 4);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: X */
    public final void mo2681X(C1627K c1627k, C1631O c1631o) {
        m2807K0(c1627k, c1631o, true);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: Y */
    public final void mo2683Y(C1631O c1631o) {
        this.f4804y = -1;
        this.f4805z = Integer.MIN_VALUE;
        this.f4788E = null;
        this.f4790G.m4062a();
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: Z */
    public final void mo2723Z(Parcelable parcelable) {
        if (parcelable instanceof C1641Z) {
            C1641Z c1641z = (C1641Z) parcelable;
            this.f4788E = c1641z;
            if (this.f4804y != -1) {
                c1641z.f7440g = -1;
                c1641z.f7441h = -1;
                c1641z.f7443j = null;
                c1641z.f7442i = 0;
                c1641z.f7444k = 0;
                c1641z.f7445l = null;
                c1641z.f7446m = null;
            }
            m4017h0();
        }
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: a0 */
    public final Parcelable mo2724a0() {
        int iM4070h;
        int iMo2399k;
        int[] iArr;
        C1641Z c1641z = this.f4788E;
        if (c1641z != null) {
            C1641Z c1641z2 = new C1641Z();
            c1641z2.f7442i = c1641z.f7442i;
            c1641z2.f7440g = c1641z.f7440g;
            c1641z2.f7441h = c1641z.f7441h;
            c1641z2.f7443j = c1641z.f7443j;
            c1641z2.f7444k = c1641z.f7444k;
            c1641z2.f7445l = c1641z.f7445l;
            c1641z2.f7447n = c1641z.f7447n;
            c1641z2.f7448o = c1641z.f7448o;
            c1641z2.f7449p = c1641z.f7449p;
            c1641z2.f7446m = c1641z.f7446m;
            return c1641z2;
        }
        C1641Z c1641z3 = new C1641Z();
        c1641z3.f7447n = this.f4801v;
        c1641z3.f7448o = this.f4786C;
        c1641z3.f7449p = this.f4787D;
        C1323r c1323r = this.f4784A;
        if (c1323r == null || (iArr = (int[]) c1323r.f5961h) == null) {
            c1641z3.f7444k = 0;
        } else {
            c1641z3.f7445l = iArr;
            c1641z3.f7444k = iArr.length;
            c1641z3.f7446m = (ArrayList) c1323r.f5962i;
        }
        if (m4026u() <= 0) {
            c1641z3.f7440g = -1;
            c1641z3.f7441h = -1;
            c1641z3.f7442i = 0;
            return c1641z3;
        }
        c1641z3.f7440g = this.f4786C ? m2798D0() : m2797C0();
        View viewM2825y0 = this.f4802w ? m2825y0(true) : m2826z0(true);
        c1641z3.f7441h = viewM2825y0 != null ? AbstractC1621E.m4000C(viewM2825y0) : -1;
        int i3 = this.f4794o;
        c1641z3.f7442i = i3;
        c1641z3.f7443j = new int[i3];
        for (int i4 = 0; i4 < this.f4794o; i4++) {
            if (this.f4786C) {
                iM4070h = this.f4795p[i4].m4068f(Integer.MIN_VALUE);
                if (iM4070h != Integer.MIN_VALUE) {
                    iMo2399k = this.f4796q.mo2395g();
                    iM4070h -= iMo2399k;
                }
            } else {
                iM4070h = this.f4795p[i4].m4070h(Integer.MIN_VALUE);
                if (iM4070h != Integer.MIN_VALUE) {
                    iMo2399k = this.f4796q.mo2399k();
                    iM4070h -= iMo2399k;
                }
            }
            c1641z3.f7443j[i4] = iM4070h;
        }
        return c1641z3;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: b */
    public final void mo2725b(String str) {
        RecyclerView recyclerView;
        if (this.f4788E != null || (recyclerView = this.f7351b) == null) {
            return;
        }
        recyclerView.m2775f(str);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: b0 */
    public final void mo2819b0(int i3) {
        if (i3 == 0) {
            m2820t0();
        }
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: c */
    public final boolean mo2726c() {
        return this.f4798s == 0;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: d */
    public final boolean mo2727d() {
        return this.f4798s == 1;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: e */
    public final boolean mo2689e(C1622F c1622f) {
        return c1622f instanceof C1639X;
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: g */
    public final void mo2728g(int i3, int i4, C1631O c1631o, C1656m c1656m) {
        C1660q c1660q;
        int iM4068f;
        int iM4070h;
        if (this.f4798s != 0) {
            i3 = i4;
        }
        if (m4026u() == 0 || i3 == 0) {
            return;
        }
        m2810M0(i3);
        int[] iArr = this.f4792I;
        if (iArr == null || iArr.length < this.f4794o) {
            this.f4792I = new int[this.f4794o];
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = this.f4794o;
            c1660q = this.f4800u;
            if (i5 >= i7) {
                break;
            }
            if (c1660q.f7560d == -1) {
                iM4068f = c1660q.f7562f;
                iM4070h = this.f4795p[i5].m4070h(iM4068f);
            } else {
                iM4068f = this.f4795p[i5].m4068f(c1660q.f7563g);
                iM4070h = c1660q.f7563g;
            }
            int i8 = iM4068f - iM4070h;
            if (i8 >= 0) {
                this.f4792I[i6] = i8;
                i6++;
            }
            i5++;
        }
        Arrays.sort(this.f4792I, 0, i6);
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = c1660q.f7559c;
            if (i10 < 0 || i10 >= c1631o.m4045b()) {
                return;
            }
            c1656m.m4084b(c1660q.f7559c, this.f4792I[i9]);
            c1660q.f7559c += c1660q.f7560d;
        }
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: i */
    public final int mo2730i(C1631O c1631o) {
        return m2821u0(c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: i0 */
    public final int mo2690i0(int i3, C1627K c1627k, C1631O c1631o) {
        return m2815R0(i3, c1627k, c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: j */
    public final int mo2691j(C1631O c1631o) {
        return m2822v0(c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: j0 */
    public final int mo2692j0(int i3, C1627K c1627k, C1631O c1631o) {
        return m2815R0(i3, c1627k, c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: k */
    public final int mo2693k(C1631O c1631o) {
        return m2823w0(c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: l */
    public final int mo2731l(C1631O c1631o) {
        return m2821u0(c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: m */
    public final int mo2694m(C1631O c1631o) {
        return m2822v0(c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: m0 */
    public final void mo2695m0(Rect rect, int i3, int i4) {
        int iM4004f;
        int iM4004f2;
        int i5 = this.f4794o;
        int iM4007A = m4007A() + m4028z();
        int iM4027y = m4027y() + m4008B();
        if (this.f4798s == 1) {
            int iHeight = rect.height() + iM4027y;
            RecyclerView recyclerView = this.f7351b;
            WeakHashMap weakHashMap = AbstractC0016Q.f14a;
            iM4004f2 = AbstractC1621E.m4004f(i4, iHeight, recyclerView.getMinimumHeight());
            iM4004f = AbstractC1621E.m4004f(i3, (this.f4799t * i5) + iM4007A, this.f7351b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM4007A;
            RecyclerView recyclerView2 = this.f7351b;
            WeakHashMap weakHashMap2 = AbstractC0016Q.f14a;
            iM4004f = AbstractC1621E.m4004f(i3, iWidth, recyclerView2.getMinimumWidth());
            iM4004f2 = AbstractC1621E.m4004f(i4, (this.f4799t * i5) + iM4027y, this.f7351b.getMinimumHeight());
        }
        this.f7351b.setMeasuredDimension(iM4004f, iM4004f2);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: n */
    public final int mo2696n(C1631O c1631o) {
        return m2823w0(c1631o);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: q */
    public final C1622F mo2697q() {
        return this.f4798s == 0 ? new C1639X(-2, -1) : new C1639X(-1, -2);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: r */
    public final C1622F mo2698r(Context context, AttributeSet attributeSet) {
        return new C1639X(context, attributeSet);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: s */
    public final C1622F mo2699s(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1639X((ViewGroup.MarginLayoutParams) layoutParams) : new C1639X(layoutParams);
    }

    @Override // p104h1.AbstractC1621E
    /* JADX INFO: renamed from: s0 */
    public final boolean mo2700s0() {
        return this.f4788E == null;
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m2820t0() {
        int iM2797C0;
        if (m4026u() != 0 && this.f4785B != 0 && this.f7355f) {
            if (this.f4802w) {
                iM2797C0 = m2798D0();
                m2797C0();
            } else {
                iM2797C0 = m2797C0();
                m2798D0();
            }
            C1323r c1323r = this.f4784A;
            if (iM2797C0 == 0 && m2802H0() != null) {
                c1323r.m3387u();
                this.f7354e = true;
                m4017h0();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u0 */
    public final int m2821u0(C1631O c1631o) {
        if (m4026u() == 0) {
            return 0;
        }
        AbstractC0916f abstractC0916f = this.f4796q;
        boolean z3 = !this.f4791H;
        return AbstractC2003a.m4534e(c1631o, abstractC0916f, m2826z0(z3), m2825y0(z3), this, this.f4791H);
    }

    /* JADX INFO: renamed from: v0 */
    public final int m2822v0(C1631O c1631o) {
        if (m4026u() == 0) {
            return 0;
        }
        AbstractC0916f abstractC0916f = this.f4796q;
        boolean z3 = !this.f4791H;
        return AbstractC2003a.m4535f(c1631o, abstractC0916f, m2826z0(z3), m2825y0(z3), this, this.f4791H, this.f4802w);
    }

    /* JADX INFO: renamed from: w0 */
    public final int m2823w0(C1631O c1631o) {
        if (m4026u() == 0) {
            return 0;
        }
        AbstractC0916f abstractC0916f = this.f4796q;
        boolean z3 = !this.f4791H;
        return AbstractC2003a.m4536g(c1631o, abstractC0916f, m2826z0(z3), m2825y0(z3), this, this.f4791H);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX INFO: renamed from: x0 */
    public final int m2824x0(C1627K c1627k, C1660q c1660q, C1631O c1631o) {
        C1643a0 c1643a0;
        ?? r6;
        int i3;
        int iM4070h;
        int iMo2391c;
        int iMo2399k;
        int iMo2391c2;
        int i4;
        int i5;
        int i6;
        int i7 = 1;
        this.f4803x.set(0, this.f4794o, true);
        C1660q c1660q2 = this.f4800u;
        int i8 = c1660q2.f7565i ? c1660q.f7561e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c1660q.f7561e == 1 ? c1660q.f7563g + c1660q.f7558b : c1660q.f7562f - c1660q.f7558b;
        int i9 = c1660q.f7561e;
        for (int i10 = 0; i10 < this.f4794o; i10++) {
            if (!this.f4795p[i10].f7453a.isEmpty()) {
                m2818U0(this.f4795p[i10], i9, i8);
            }
        }
        int iMo2395g = this.f4802w ? this.f4796q.mo2395g() : this.f4796q.mo2399k();
        boolean z3 = false;
        while (true) {
            int i11 = c1660q.f7559c;
            if (!(i11 >= 0 && i11 < c1631o.m4045b()) || (!c1660q2.f7565i && this.f4803x.isEmpty())) {
                break;
            }
            View view = c1627k.m4041k(c1660q.f7559c, Long.MAX_VALUE).f7406a;
            c1660q.f7559c += c1660q.f7560d;
            C1639X c1639x = (C1639X) view.getLayoutParams();
            int iM4048b = c1639x.f7364a.m4048b();
            C1323r c1323r = this.f4784A;
            int[] iArr = (int[]) c1323r.f5961h;
            int i12 = (iArr == null || iM4048b >= iArr.length) ? -1 : iArr[iM4048b];
            if (i12 == -1) {
                if (m2809L0(c1660q.f7561e)) {
                    i5 = this.f4794o - i7;
                    i4 = -1;
                    i6 = -1;
                } else {
                    i4 = this.f4794o;
                    i5 = 0;
                    i6 = 1;
                }
                C1643a0 c1643a1 = null;
                if (c1660q.f7561e == i7) {
                    int iMo2399k2 = this.f4796q.mo2399k();
                    int i13 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        C1643a0 c1643a2 = this.f4795p[i5];
                        int iM4068f = c1643a2.m4068f(iMo2399k2);
                        if (iM4068f < i13) {
                            i13 = iM4068f;
                            c1643a1 = c1643a2;
                        }
                        i5 += i6;
                    }
                } else {
                    int iMo2395g2 = this.f4796q.mo2395g();
                    int i14 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        C1643a0 c1643a3 = this.f4795p[i5];
                        int iM4070h2 = c1643a3.m4070h(iMo2395g2);
                        if (iM4070h2 > i14) {
                            c1643a1 = c1643a3;
                            i14 = iM4070h2;
                        }
                        i5 += i6;
                    }
                }
                c1643a0 = c1643a1;
                c1323r.m3390x(iM4048b);
                ((int[]) c1323r.f5961h)[iM4048b] = c1643a0.f7457e;
            } else {
                c1643a0 = this.f4795p[i12];
            }
            c1639x.f7435e = c1643a0;
            if (c1660q.f7561e == 1) {
                r6 = 0;
                m4011a(view, -1, false);
            } else {
                r6 = 0;
                m4011a(view, 0, false);
            }
            if (this.f4798s == 1) {
                i3 = 1;
                m2805J0(view, AbstractC1621E.m4005v(r6, this.f4799t, this.f7360k, r6, ((ViewGroup.MarginLayoutParams) c1639x).width), AbstractC1621E.m4005v(true, this.f7363n, this.f7361l, m4027y() + m4008B(), ((ViewGroup.MarginLayoutParams) c1639x).height));
            } else {
                i3 = 1;
                m2805J0(view, AbstractC1621E.m4005v(true, this.f7362m, this.f7360k, m4007A() + m4028z(), ((ViewGroup.MarginLayoutParams) c1639x).width), AbstractC1621E.m4005v(false, this.f4799t, this.f7361l, 0, ((ViewGroup.MarginLayoutParams) c1639x).height));
            }
            if (c1660q.f7561e == i3) {
                iMo2391c = c1643a0.m4068f(iMo2395g);
                iM4070h = this.f4796q.mo2391c(view) + iMo2391c;
            } else {
                iM4070h = c1643a0.m4070h(iMo2395g);
                iMo2391c = iM4070h - this.f4796q.mo2391c(view);
            }
            if (c1660q.f7561e == 1) {
                C1643a0 c1643a4 = c1639x.f7435e;
                c1643a4.getClass();
                C1639X c1639x2 = (C1639X) view.getLayoutParams();
                c1639x2.f7435e = c1643a4;
                ArrayList arrayList = c1643a4.f7453a;
                arrayList.add(view);
                c1643a4.f7455c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c1643a4.f7454b = Integer.MIN_VALUE;
                }
                if (c1639x2.f7364a.m4053g() || c1639x2.f7364a.m4056j()) {
                    c1643a4.f7456d = c1643a4.f7458f.f4796q.mo2391c(view) + c1643a4.f7456d;
                }
            } else {
                C1643a0 c1643a5 = c1639x.f7435e;
                c1643a5.getClass();
                C1639X c1639x3 = (C1639X) view.getLayoutParams();
                c1639x3.f7435e = c1643a5;
                ArrayList arrayList2 = c1643a5.f7453a;
                arrayList2.add(0, view);
                c1643a5.f7454b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c1643a5.f7455c = Integer.MIN_VALUE;
                }
                if (c1639x3.f7364a.m4053g() || c1639x3.f7364a.m4056j()) {
                    c1643a5.f7456d = c1643a5.f7458f.f4796q.mo2391c(view) + c1643a5.f7456d;
                }
            }
            if (m2803I0() && this.f4798s == 1) {
                iMo2391c2 = this.f4797r.mo2395g() - (((this.f4794o - 1) - c1643a0.f7457e) * this.f4799t);
                iMo2399k = iMo2391c2 - this.f4797r.mo2391c(view);
            } else {
                iMo2399k = this.f4797r.mo2399k() + (c1643a0.f7457e * this.f4799t);
                iMo2391c2 = this.f4797r.mo2391c(view) + iMo2399k;
            }
            if (this.f4798s == 1) {
                AbstractC1621E.m4003I(view, iMo2399k, iMo2391c, iMo2391c2, iM4070h);
            } else {
                AbstractC1621E.m4003I(view, iMo2391c, iMo2399k, iM4070h, iMo2391c2);
            }
            m2818U0(c1643a0, c1660q2.f7561e, i8);
            m2811N0(c1627k, c1660q2);
            if (c1660q2.f7564h && view.hasFocusable()) {
                this.f4803x.set(c1643a0.f7457e, false);
            }
            i7 = 1;
            z3 = true;
        }
        if (!z3) {
            m2811N0(c1627k, c1660q2);
        }
        int iMo2399k3 = c1660q2.f7561e == -1 ? this.f4796q.mo2399k() - m2800F0(this.f4796q.mo2399k()) : m2799E0(this.f4796q.mo2395g()) - this.f4796q.mo2395g();
        if (iMo2399k3 > 0) {
            return Math.min(c1660q.f7558b, iMo2399k3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: y0 */
    public final View m2825y0(boolean z3) {
        int iMo2399k = this.f4796q.mo2399k();
        int iMo2395g = this.f4796q.mo2395g();
        View view = null;
        for (int iM4026u = m4026u() - 1; iM4026u >= 0; iM4026u--) {
            View viewM4025t = m4025t(iM4026u);
            int iMo2393e = this.f4796q.mo2393e(viewM4025t);
            int iMo2390b = this.f4796q.mo2390b(viewM4025t);
            if (iMo2390b > iMo2399k && iMo2393e < iMo2395g) {
                if (iMo2390b <= iMo2395g || !z3) {
                    return viewM4025t;
                }
                if (view == null) {
                    view = viewM4025t;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: z0 */
    public final View m2826z0(boolean z3) {
        int iMo2399k = this.f4796q.mo2399k();
        int iMo2395g = this.f4796q.mo2395g();
        int iM4026u = m4026u();
        View view = null;
        for (int i3 = 0; i3 < iM4026u; i3++) {
            View viewM4025t = m4025t(i3);
            int iMo2393e = this.f4796q.mo2393e(viewM4025t);
            if (this.f4796q.mo2390b(viewM4025t) > iMo2399k && iMo2393e < iMo2395g) {
                if (iMo2393e >= iMo2399k || !z3) {
                    return viewM4025t;
                }
                if (view == null) {
                    view = viewM4025t;
                }
            }
        }
        return view;
    }
}
