package p053S0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.emoji2.text.C0928r;
import androidx.emoji2.text.C0931u;
import androidx.fragment.app.AbstractC0937C;
import androidx.fragment.app.AbstractComponentCallbacksC0963n;
import androidx.fragment.app.C0940F;
import androidx.fragment.app.C0943I;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.zip.Inflater;
import p023I.C0269a;
import p023I.C0270b;
import p045P0.AbstractC0462h;
import p045P0.C0455a;
import p045P0.C0464j;
import p045P0.InterfaceC0458d;
import p045P0.InterfaceC0465k;
import p061V.C0614b;
import p064W.AbstractC0632A;
import p064W.C0651s;
import p064W.InterfaceC0636d;
import p067X.C0677i;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p106i.AbstractC1733a;
import p106i.C1737e;
import p110j.MenuC1756B;
import p110j.MenuC1772m;
import p110j.MenuItemC1779t;
import p124n.C2022i;
import p138q1.C2173i;
import p139q2.InterfaceC2180a;
import p150t1.InterfaceC2276b;
import p156v.InterfaceMenuItemC2306a;
import p162x1.C2354c;
import p162x1.C2361j;
import p166y1.InterfaceC2379d;
import p169z1.InterfaceC2391c;

/* JADX INFO: renamed from: S0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0536b implements InterfaceC0465k, InterfaceC2276b {

    /* JADX INFO: renamed from: g */
    public Object f1867g;

    /* JADX INFO: renamed from: h */
    public Object f1868h;

    /* JADX INFO: renamed from: i */
    public Object f1869i;

    /* JADX INFO: renamed from: j */
    public Object f1870j;

    public C0536b(int i3) {
        switch (i3) {
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                this.f1867g = new ArrayList();
                this.f1868h = new HashMap();
                this.f1869i = new HashMap();
                break;
            default:
                this.f1867g = new C0651s();
                this.f1868h = new C0651s();
                this.f1869i = new C0535a();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1334a(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        if (((ArrayList) this.f1867g).contains(abstractComponentCallbacksC0963n)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0963n);
        }
        synchronized (((ArrayList) this.f1867g)) {
            ((ArrayList) this.f1867g).add(abstractComponentCallbacksC0963n);
        }
        abstractComponentCallbacksC0963n.f4236q = true;
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo514b() {
    }

    /* JADX INFO: renamed from: c */
    public AbstractComponentCallbacksC0963n m1335c(String str) {
        C0943I c0943i = (C0943I) ((HashMap) this.f1868h).get(str);
        if (c0943i != null) {
            return c0943i.f4120c;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public AbstractComponentCallbacksC0963n m1336d(String str) {
        for (C0943I c0943i : ((HashMap) this.f1868h).values()) {
            if (c0943i != null) {
                AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963nM1336d = c0943i.f4120c;
                if (!str.equals(abstractComponentCallbacksC0963nM1336d.f4230k)) {
                    abstractComponentCallbacksC0963nM1336d = abstractComponentCallbacksC0963nM1336d.f4245z.f4066c.m1336d(str);
                }
                if (abstractComponentCallbacksC0963nM1336d != null) {
                    return abstractComponentCallbacksC0963nM1336d;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public C1737e m1337e(AbstractC1733a abstractC1733a) {
        ArrayList arrayList = (ArrayList) this.f1869i;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1737e c1737e = (C1737e) arrayList.get(i3);
            if (c1737e != null && c1737e.f7739b == abstractC1733a) {
                return c1737e;
            }
        }
        C1737e c1737e2 = new C1737e((Context) this.f1868h, abstractC1733a);
        arrayList.add(c1737e2);
        return c1737e2;
    }

    /* JADX INFO: renamed from: f */
    public ArrayList m1338f() {
        ArrayList arrayList = new ArrayList();
        for (C0943I c0943i : ((HashMap) this.f1868h).values()) {
            if (c0943i != null) {
                arrayList.add(c0943i);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public ArrayList m1339g() {
        ArrayList arrayList = new ArrayList();
        for (C0943I c0943i : ((HashMap) this.f1868h).values()) {
            if (c0943i != null) {
                arrayList.add(c0943i.f4120c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @Override // p139q2.InterfaceC2180a
    public Object get() {
        return new C2361j((Executor) ((InterfaceC2180a) this.f1867g).get(), (InterfaceC2379d) ((InterfaceC2180a) this.f1868h).get(), (C2354c) ((C2173i) this.f1869i).get(), (InterfaceC2391c) ((InterfaceC2180a) this.f1870j).get());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: h */
    public void mo520h(byte[] bArr, int i3, int i4, C0464j c0464j, InterfaceC0636d interfaceC0636d) {
        C0651s c0651s;
        ArrayList arrayList;
        C0614b c0614b;
        int i5;
        int iM1687u;
        int i6;
        int i7;
        int iM1690x;
        C0651s c0651s2 = (C0651s) this.f1867g;
        c0651s2.m1663E(bArr, i3 + i4);
        c0651s2.m1665G(i3);
        if (c0651s2.m1667a() > 0 && (c0651s2.f2520a[c0651s2.f2521b] & 255) == 120) {
            if (((Inflater) this.f1870j) == null) {
                this.f1870j = new Inflater();
            }
            Inflater inflater = (Inflater) this.f1870j;
            C0651s c0651s3 = (C0651s) this.f1868h;
            if (AbstractC0632A.m1565F(c0651s2, c0651s3, inflater)) {
                c0651s2.m1663E(c0651s3.f2520a, c0651s3.f2522c);
            }
        }
        C0535a c0535a = (C0535a) this.f1869i;
        c0535a.f1861d = 0;
        c0535a.f1862e = 0;
        c0535a.f1863f = 0;
        c0535a.f1864g = 0;
        c0535a.f1865h = 0;
        c0535a.f1866i = 0;
        C0651s c0651s4 = c0535a.f1858a;
        c0651s4.m1662D(0);
        c0535a.f1860c = false;
        ArrayList arrayList2 = new ArrayList();
        while (c0651s2.m1667a() >= 3) {
            int i8 = c0651s2.f2522c;
            int iM1687u2 = c0651s2.m1687u();
            int iM1659A = c0651s2.m1659A();
            int i9 = c0651s2.f2521b + iM1659A;
            if (i9 > i8) {
                c0651s2.m1665G(i8);
                arrayList = arrayList2;
                c0614b = null;
            } else {
                int[] iArr = c0535a.f1859b;
                if (iM1687u2 != 128) {
                    switch (iM1687u2) {
                        case 20:
                            if (iM1659A % 5 == 2) {
                                c0651s2.m1666H(2);
                                Arrays.fill(iArr, 0);
                                int i10 = iM1659A / 5;
                                int i11 = 0;
                                while (i11 < i10) {
                                    int iM1687u3 = c0651s2.m1687u();
                                    int[] iArr2 = iArr;
                                    double dM1687u = c0651s2.m1687u();
                                    double dM1687u2 = c0651s2.m1687u() - 128;
                                    double dM1687u3 = c0651s2.m1687u() - 128;
                                    iArr2[iM1687u3] = AbstractC0632A.m1590i((int) ((dM1687u3 * 1.772d) + dM1687u), 0, 255) | (c0651s2.m1687u() << 24) | (AbstractC0632A.m1590i((int) ((1.402d * dM1687u2) + dM1687u), 0, 255) << 16) | (AbstractC0632A.m1590i((int) ((dM1687u - (0.34414d * dM1687u3)) - (dM1687u2 * 0.71414d)), 0, 255) << 8);
                                    i11++;
                                    iArr = iArr2;
                                    arrayList2 = arrayList2;
                                    c0651s2 = c0651s2;
                                }
                                c0651s = c0651s2;
                                arrayList = arrayList2;
                                c0535a.f1860c = true;
                            } else {
                                c0651s = c0651s2;
                                arrayList = arrayList2;
                            }
                            break;
                        case 21:
                            if (iM1659A >= 4) {
                                c0651s2.m1666H(3);
                                int i12 = iM1659A - 4;
                                if (!((128 & c0651s2.m1687u()) != 0)) {
                                    i6 = c0651s4.f2521b;
                                    i7 = c0651s4.f2522c;
                                    if (i6 < i7 && i12 > 0) {
                                        int iMin = Math.min(i12, i7 - i6);
                                        c0651s2.m1671e(c0651s4.f2520a, i6, iMin);
                                        c0651s4.m1665G(i6 + iMin);
                                    }
                                } else if (i12 >= 7 && (iM1690x = c0651s2.m1690x()) >= 4) {
                                    c0535a.f1865h = c0651s2.m1659A();
                                    c0535a.f1866i = c0651s2.m1659A();
                                    c0651s4.m1662D(iM1690x - 4);
                                    i12 = iM1659A - 11;
                                    i6 = c0651s4.f2521b;
                                    i7 = c0651s4.f2522c;
                                    if (i6 < i7) {
                                        int iMin2 = Math.min(i12, i7 - i6);
                                        c0651s2.m1671e(c0651s4.f2520a, i6, iMin2);
                                        c0651s4.m1665G(i6 + iMin2);
                                    }
                                }
                            }
                            c0651s = c0651s2;
                            arrayList = arrayList2;
                            break;
                        case 22:
                            if (iM1659A >= 19) {
                                c0535a.f1861d = c0651s2.m1659A();
                                c0535a.f1862e = c0651s2.m1659A();
                                c0651s2.m1666H(11);
                                c0535a.f1863f = c0651s2.m1659A();
                                c0535a.f1864g = c0651s2.m1659A();
                            }
                            c0651s = c0651s2;
                            arrayList = arrayList2;
                            break;
                        default:
                            c0651s = c0651s2;
                            arrayList = arrayList2;
                            break;
                    }
                    c0614b = null;
                } else {
                    c0651s = c0651s2;
                    arrayList = arrayList2;
                    if (c0535a.f1861d == 0 || c0535a.f1862e == 0 || c0535a.f1865h == 0 || c0535a.f1866i == 0 || (i5 = c0651s4.f2522c) == 0 || c0651s4.f2521b != i5 || !c0535a.f1860c) {
                        c0614b = null;
                    } else {
                        c0651s4.m1665G(0);
                        int i13 = c0535a.f1865h * c0535a.f1866i;
                        int[] iArr3 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iM1687u4 = c0651s4.m1687u();
                            if (iM1687u4 != 0) {
                                iM1687u = i14 + 1;
                                iArr3[i14] = iArr[iM1687u4];
                            } else {
                                int iM1687u5 = c0651s4.m1687u();
                                if (iM1687u5 != 0) {
                                    iM1687u = ((iM1687u5 & 64) == 0 ? iM1687u5 & 63 : ((iM1687u5 & 63) << 8) | c0651s4.m1687u()) + i14;
                                    Arrays.fill(iArr3, i14, iM1687u, (iM1687u5 & 128) == 0 ? iArr[0] : iArr[c0651s4.m1687u()]);
                                }
                            }
                            i14 = iM1687u;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr3, c0535a.f1865h, c0535a.f1866i, Bitmap.Config.ARGB_8888);
                        float f = c0535a.f1863f;
                        float f3 = c0535a.f1861d;
                        float f4 = f / f3;
                        float f5 = c0535a.f1864g;
                        float f6 = c0535a.f1862e;
                        c0614b = new C0614b(null, null, null, bitmapCreateBitmap, f5 / f6, 0, 0, f4, 0, Integer.MIN_VALUE, -3.4028235E38f, c0535a.f1865h / f3, c0535a.f1866i / f6, false, -16777216, Integer.MIN_VALUE, 0.0f);
                    }
                    c0535a.f1861d = 0;
                    c0535a.f1862e = 0;
                    c0535a.f1863f = 0;
                    c0535a.f1864g = 0;
                    c0535a.f1865h = 0;
                    c0535a.f1866i = 0;
                    c0651s4.m1662D(0);
                    c0535a.f1860c = false;
                }
                c0651s2 = c0651s;
                c0651s2.m1665G(i9);
            }
            ArrayList arrayList3 = arrayList;
            if (c0614b != null) {
                arrayList3.add(c0614b);
            }
            arrayList2 = arrayList3;
        }
        interfaceC0636d.mo545b(new C0455a(arrayList2, -9223372036854775807L, -9223372036854775807L));
    }

    /* JADX INFO: renamed from: i */
    public List m1340i() {
        ArrayList arrayList;
        if (((ArrayList) this.f1867g).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f1867g)) {
            arrayList = new ArrayList((ArrayList) this.f1867g);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public void m1341j(C0943I c0943i) {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = c0943i.f4120c;
        String str = abstractComponentCallbacksC0963n.f4230k;
        HashMap map = (HashMap) this.f1868h;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0963n.f4230k, c0943i);
        if (AbstractC0937C.m2430F(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0963n);
        }
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: k */
    public /* synthetic */ InterfaceC0458d mo523k(byte[] bArr, int i3, int i4) {
        return AbstractC0462h.m1161a(this, bArr, i4);
    }

    /* JADX INFO: renamed from: l */
    public void m1342l(C0943I c0943i) {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = c0943i.f4120c;
        if (abstractComponentCallbacksC0963n.f4210G) {
            ((C0940F) this.f1870j).m2485d(abstractComponentCallbacksC0963n);
        }
        if (((C0943I) ((HashMap) this.f1868h).put(abstractComponentCallbacksC0963n.f4230k, null)) != null && AbstractC0937C.m2430F(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0963n);
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m1343m(AbstractC1733a abstractC1733a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f1867g).onActionItemClicked(m1337e(abstractC1733a), new MenuItemC1779t((Context) this.f1868h, (InterfaceMenuItemC2306a) menuItem));
    }

    /* JADX INFO: renamed from: n */
    public boolean m1344n(AbstractC1733a abstractC1733a, MenuC1772m menuC1772m) {
        C1737e c1737eM1337e = m1337e(abstractC1733a);
        C2022i c2022i = (C2022i) this.f1870j;
        Menu menuC1756B = (Menu) c2022i.getOrDefault(menuC1772m, null);
        if (menuC1756B == null) {
            menuC1756B = new MenuC1756B((Context) this.f1868h, menuC1772m);
            c2022i.put(menuC1772m, menuC1756B);
        }
        return ((ActionMode.Callback) this.f1867g).onCreateActionMode(c1737eM1337e, menuC1756B);
    }

    public C0536b(Typeface typeface, C0270b c0270b) {
        int i3;
        int i4;
        int i5;
        int i6;
        this.f1870j = typeface;
        this.f1867g = c0270b;
        this.f1869i = new C0928r(1024);
        int iM3a = c0270b.m3a(6);
        if (iM3a != 0) {
            int i7 = iM3a + c0270b.f2a;
            i3 = ((ByteBuffer) c0270b.f5d).getInt(((ByteBuffer) c0270b.f5d).getInt(i7) + i7);
        } else {
            i3 = 0;
        }
        this.f1868h = new char[i3 * 2];
        int iM3a2 = c0270b.m3a(6);
        if (iM3a2 != 0) {
            int i8 = iM3a2 + c0270b.f2a;
            i4 = ((ByteBuffer) c0270b.f5d).getInt(((ByteBuffer) c0270b.f5d).getInt(i8) + i8);
        } else {
            i4 = 0;
        }
        for (int i9 = 0; i9 < i4; i9++) {
            C0931u c0931u = new C0931u(this, i9);
            C0269a c0269aM2427b = c0931u.m2427b();
            int iM3a3 = c0269aM2427b.m3a(4);
            Character.toChars(iM3a3 != 0 ? ((ByteBuffer) c0269aM2427b.f5d).getInt(iM3a3 + c0269aM2427b.f2a) : 0, (char[]) this.f1868h, i9 * 2);
            C0269a c0269aM2427b2 = c0931u.m2427b();
            int iM3a4 = c0269aM2427b2.m3a(16);
            if (iM3a4 != 0) {
                int i10 = iM3a4 + c0269aM2427b2.f2a;
                i5 = ((ByteBuffer) c0269aM2427b2.f5d).getInt(((ByteBuffer) c0269aM2427b2.f5d).getInt(i10) + i10);
            } else {
                i5 = 0;
            }
            if (i5 > 0) {
                C0269a c0269aM2427b3 = c0931u.m2427b();
                int iM3a5 = c0269aM2427b3.m3a(16);
                if (iM3a5 != 0) {
                    int i11 = iM3a5 + c0269aM2427b3.f2a;
                    i6 = ((ByteBuffer) c0269aM2427b3.f5d).getInt(((ByteBuffer) c0269aM2427b3.f5d).getInt(i11) + i11);
                } else {
                    i6 = 0;
                }
                ((C0928r) this.f1869i).m2420a(c0931u, 0, i6 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public C0536b(C1692X c1692x, C0677i c0677i, C0677i c0677i2, C0677i c0677i3) {
        Object objM4117n;
        if (c1692x != null) {
            objM4117n = AbstractC1676G.m4117n(c1692x);
        } else {
            C1674E c1674e = AbstractC1676G.f7601h;
            objM4117n = C1692X.f7629k;
        }
        this.f1867g = objM4117n;
        this.f1868h = c0677i;
        this.f1869i = c0677i2;
        this.f1870j = c0677i3;
    }
}
