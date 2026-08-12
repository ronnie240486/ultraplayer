package p022H1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.cast.BinderC1263c;
import com.google.android.gms.internal.cast.C1154A0;
import com.google.android.gms.internal.cast.C1158B0;
import com.google.android.gms.internal.cast.C1162C0;
import com.google.android.gms.internal.cast.C1190J0;
import com.google.android.gms.internal.cast.C1194K0;
import com.google.android.gms.internal.cast.C1209O;
import com.google.android.gms.internal.cast.C1211O1;
import com.google.android.gms.internal.cast.C1247X2;
import com.google.android.gms.internal.cast.C1251Y2;
import com.google.android.gms.internal.cast.C1255a;
import com.google.android.gms.internal.cast.C1259b;
import com.google.android.gms.internal.cast.C1285h1;
import com.google.android.gms.internal.cast.C1296k0;
import com.google.android.gms.internal.cast.C1300l0;
import com.google.android.gms.internal.cast.C1324r0;
import com.google.android.gms.internal.cast.C1328s0;
import com.google.android.gms.internal.cast.C1332t0;
import com.google.android.gms.internal.cast.C1336u0;
import com.google.android.gms.internal.cast.C1340v0;
import com.google.android.gms.internal.cast.C1344w0;
import com.google.android.gms.internal.cast.C1348x0;
import com.google.android.gms.internal.cast.C1352y0;
import com.google.android.gms.internal.cast.C1356z0;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import p016F1.C0187d;
import p019G1.C0227b;
import p028J1.C0296b;
import p030K0.C0334e;
import p045P0.InterfaceC0458d;
import p046P1.AbstractC0491s;
import p061V.C0613a;
import p061V.C0614b;
import p062V0.C0622a;
import p062V0.C0624c;
import p062V0.C0627f;
import p064W.AbstractC0632A;
import p089d1.C1447t;
import p104h1.C1642a;
import p104h1.C1666w;
import p138q1.C2173i;
import p139q2.InterfaceC2180a;
import p142r1.C2201f;
import p150t1.InterfaceC2276b;
import p158w1.C2318a;
import p162x1.C2354c;
import p166y1.InterfaceC2379d;
import p169z1.InterfaceC2391c;

/* JADX INFO: renamed from: H1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0258b implements InterfaceC0458d, InterfaceC2276b {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f662g;

    /* JADX INFO: renamed from: h */
    public final Object f663h;

    /* JADX INFO: renamed from: i */
    public final Object f664i;

    /* JADX INFO: renamed from: j */
    public Object f665j;

    /* JADX INFO: renamed from: k */
    public Object f666k;

    /* JADX INFO: renamed from: l */
    public Object f667l;

    public C0258b(C1209O c1209o, BinderC1263c binderC1263c, String str) {
        this.f662g = 2;
        this.f663h = c1209o;
        this.f664i = binderC1263c;
        this.f665j = str;
        this.f667l = new C1211O1(this);
    }

    /* JADX INFO: renamed from: q */
    public static void m779q(C0258b c0258b, C1251Y2 c1251y2) {
        int i3 = c1251y2.f5750e;
        if (i3 == 2 && ((C1247X2) c0258b.f666k) != null) {
            c0258b.m793s();
        }
        if (i3 == 2) {
            c0258b.f666k = new C1247X2((C1209O) c0258b.f663h, (String) c0258b.f665j);
        } else {
            c0258b.f666k = c0258b.m792r();
        }
        C1247X2 c1247x2 = (C1247X2) c0258b.f666k;
        AbstractC0491s.m1213e(c1247x2);
        c1251y2.f5749d = c1247x2.f5737h;
        c1247x2.f5731b.add(c1251y2);
    }

    /* JADX INFO: renamed from: a */
    public boolean m780a(int i3) {
        ArrayList arrayList = (ArrayList) this.f665j;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1642a c1642a = (C1642a) arrayList.get(i4);
            int i5 = c1642a.f7450a;
            if (i5 != 8) {
                if (i5 == 1) {
                    int i6 = c1642a.f7451b;
                    int i7 = c1642a.f7452c + i6;
                    while (i6 < i7) {
                        if (m784f(i6, i4 + 1) == i3) {
                            return true;
                        }
                        i6++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m784f(c1642a.f7452c, i4 + 1) == i3) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m781b() {
        ArrayList arrayList = (ArrayList) this.f665j;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C1666w) this.f666k).m4092a((C1642a) arrayList.get(i3));
        }
        m788l(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f664i;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C1642a c1642a = (C1642a) arrayList2.get(i4);
            int i5 = c1642a.f7450a;
            C1666w c1666w = (C1666w) this.f666k;
            if (i5 == 1) {
                c1666w.m4092a(c1642a);
                c1666w.m4095d(c1642a.f7451b, c1642a.f7452c);
            } else if (i5 == 2) {
                c1666w.m4092a(c1642a);
                int i6 = c1642a.f7451b;
                int i7 = c1642a.f7452c;
                RecyclerView recyclerView = c1666w.f7586a;
                recyclerView.m2756K(i6, i7, true);
                recyclerView.f4757m0 = true;
                recyclerView.f4751j0.f7386b += i7;
            } else if (i5 == 4) {
                c1666w.m4092a(c1642a);
                c1666w.m4094c(c1642a.f7451b, c1642a.f7452c);
            } else if (i5 == 8) {
                c1666w.m4092a(c1642a);
                c1666w.m4096e(c1642a.f7451b, c1642a.f7452c);
            }
        }
        m788l(arrayList2);
    }

    /* JADX INFO: renamed from: c */
    public void m782c(C1642a c1642a) {
        int i3;
        C0334e c0334e;
        int i4 = c1642a.f7450a;
        if (i4 == 1 || i4 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM789m = m789m(c1642a.f7451b, i4);
        int i5 = c1642a.f7451b;
        int i6 = c1642a.f7450a;
        if (i6 == 2) {
            i3 = 0;
        } else {
            if (i6 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c1642a);
            }
            i3 = 1;
        }
        int i7 = 1;
        int i8 = 1;
        while (true) {
            int i9 = c1642a.f7452c;
            c0334e = (C0334e) this.f663h;
            if (i7 >= i9) {
                break;
            }
            int iM789m2 = m789m((i3 * i7) + c1642a.f7451b, c1642a.f7450a);
            int i10 = c1642a.f7450a;
            if (i10 == 2 ? iM789m2 != iM789m : !(i10 == 4 && iM789m2 == iM789m + 1)) {
                C1642a c1642aM786i = m786i(i10, iM789m, i8);
                m783e(c1642aM786i, i5);
                c0334e.m932l(c1642aM786i);
                if (c1642a.f7450a == 4) {
                    i5 += i8;
                }
                iM789m = iM789m2;
                i8 = 1;
            } else {
                i8++;
            }
            i7++;
        }
        c0334e.m932l(c1642a);
        if (i8 > 0) {
            C1642a c1642aM786i2 = m786i(c1642a.f7450a, iM789m, i8);
            m783e(c1642aM786i2, i5);
            c0334e.m932l(c1642aM786i2);
        }
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: d */
    public int mo156d(long j3) {
        long[] jArr = (long[]) this.f664i;
        int iM1582a = AbstractC0632A.m1582a(jArr, j3, false);
        if (iM1582a < jArr.length) {
            return iM1582a;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public void m783e(C1642a c1642a, int i3) {
        C1666w c1666w = (C1666w) this.f666k;
        c1666w.m4092a(c1642a);
        int i4 = c1642a.f7450a;
        if (i4 != 2) {
            if (i4 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c1666w.m4094c(i3, c1642a.f7452c);
        } else {
            int i5 = c1642a.f7452c;
            RecyclerView recyclerView = c1666w.f7586a;
            recyclerView.m2756K(i3, i5, true);
            recyclerView.f4757m0 = true;
            recyclerView.f4751j0.f7386b += i5;
        }
    }

    /* JADX INFO: renamed from: f */
    public int m784f(int i3, int i4) {
        ArrayList arrayList = (ArrayList) this.f665j;
        int size = arrayList.size();
        while (i4 < size) {
            C1642a c1642a = (C1642a) arrayList.get(i4);
            int i5 = c1642a.f7450a;
            if (i5 == 8) {
                int i6 = c1642a.f7451b;
                if (i6 == i3) {
                    i3 = c1642a.f7452c;
                } else {
                    if (i6 < i3) {
                        i3--;
                    }
                    if (c1642a.f7452c <= i3) {
                        i3++;
                    }
                }
            } else {
                int i7 = c1642a.f7451b;
                if (i7 > i3) {
                    continue;
                } else if (i5 == 2) {
                    int i8 = c1642a.f7452c;
                    if (i3 < i7 + i8) {
                        return -1;
                    }
                    i3 -= i8;
                } else if (i5 == 1) {
                    i3 += c1642a.f7452c;
                }
            }
            i4++;
        }
        return i3;
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: g */
    public List mo159g(long j3) {
        C0624c c0624c = (C0624c) this.f663h;
        ArrayList arrayList = new ArrayList();
        c0624c.m1544g(j3, c0624c.f2406h, arrayList);
        TreeMap treeMap = new TreeMap();
        c0624c.m1546i(j3, false, c0624c.f2406h, treeMap);
        HashMap map = (HashMap) this.f666k;
        c0624c.m1545h(j3, (Map) this.f665j, map, c0624c.f2406h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Pair pair = (Pair) obj;
            String str = (String) ((HashMap) this.f667l).get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C0627f c0627f = (C0627f) map.get(pair.first);
                c0627f.getClass();
                arrayList2.add(new C0614b(null, null, null, bitmapDecodeByteArray, c0627f.f2426c, 0, c0627f.f2428e, c0627f.f2425b, 0, Integer.MIN_VALUE, -3.4028235E38f, c0627f.f2429f, c0627f.f2430g, false, -16777216, c0627f.f2433j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C0627f c0627f2 = (C0627f) map.get(entry.getKey());
            c0627f2.getClass();
            C0613a c0613a = (C0613a) entry.getValue();
            CharSequence charSequence = c0613a.f2319a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C0622a c0622a : (C0622a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C0622a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c0622a), spannableStringBuilder.getSpanEnd(c0622a), (CharSequence) "");
            }
            for (int i4 = 0; i4 < spannableStringBuilder.length(); i4++) {
                if (spannableStringBuilder.charAt(i4) == ' ') {
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (i6 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i6) == ' ') {
                        i6++;
                    }
                    int i7 = i6 - i5;
                    if (i7 > 0) {
                        spannableStringBuilder.delete(i4, i7 + i4);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == ' ') {
                        spannableStringBuilder.delete(i9, i8 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length() - 1; i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    if (spannableStringBuilder.charAt(i11) == '\n') {
                        spannableStringBuilder.delete(i10, i11);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c0613a.f2323e = c0627f2.f2426c;
            c0613a.f2324f = c0627f2.f2427d;
            c0613a.f2325g = c0627f2.f2428e;
            c0613a.f2326h = c0627f2.f2425b;
            c0613a.f2330l = c0627f2.f2429f;
            c0613a.f2329k = c0627f2.f2432i;
            c0613a.f2328j = c0627f2.f2431h;
            c0613a.f2334p = c0627f2.f2433j;
            arrayList2.add(c0613a.m1535a());
        }
        return arrayList2;
    }

    @Override // p139q2.InterfaceC2180a
    public Object get() {
        return new C2318a((Executor) ((InterfaceC2180a) this.f663h).get(), (C2201f) ((InterfaceC2180a) this.f664i).get(), (C2354c) ((C2173i) this.f665j).get(), (InterfaceC2379d) ((InterfaceC2180a) this.f666k).get(), (InterfaceC2391c) ((InterfaceC2180a) this.f667l).get());
    }

    /* JADX INFO: renamed from: h */
    public boolean m785h() {
        return ((ArrayList) this.f664i).size() > 0;
    }

    /* JADX INFO: renamed from: i */
    public C1642a m786i(int i3, int i4, int i5) {
        C1642a c1642a = (C1642a) ((C0334e) this.f663h).m921a();
        if (c1642a != null) {
            c1642a.f7450a = i3;
            c1642a.f7451b = i4;
            c1642a.f7452c = i5;
            return c1642a;
        }
        C1642a c1642a2 = new C1642a();
        c1642a2.f7450a = i3;
        c1642a2.f7451b = i4;
        c1642a2.f7452c = i5;
        return c1642a2;
    }

    /* JADX INFO: renamed from: j */
    public void m787j(C1642a c1642a) {
        ((ArrayList) this.f665j).add(c1642a);
        int i3 = c1642a.f7450a;
        C1666w c1666w = (C1666w) this.f666k;
        if (i3 == 1) {
            c1666w.m4095d(c1642a.f7451b, c1642a.f7452c);
            return;
        }
        if (i3 == 2) {
            int i4 = c1642a.f7451b;
            int i5 = c1642a.f7452c;
            RecyclerView recyclerView = c1666w.f7586a;
            recyclerView.m2756K(i4, i5, false);
            recyclerView.f4757m0 = true;
            return;
        }
        if (i3 == 4) {
            c1666w.m4094c(c1642a.f7451b, c1642a.f7452c);
        } else if (i3 == 8) {
            c1666w.m4096e(c1642a.f7451b, c1642a.f7452c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c1642a);
        }
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: k */
    public long mo163k(int i3) {
        return ((long[]) this.f664i)[i3];
    }

    /* JADX INFO: renamed from: l */
    public void m788l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1642a c1642a = (C1642a) arrayList.get(i3);
            c1642a.getClass();
            ((C0334e) this.f663h).m932l(c1642a);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: m */
    public int m789m(int i3, int i4) {
        int i5;
        int i6;
        ArrayList arrayList = (ArrayList) this.f665j;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1642a c1642a = (C1642a) arrayList.get(size);
            int i7 = c1642a.f7450a;
            if (i7 == 8) {
                int i8 = c1642a.f7451b;
                int i9 = c1642a.f7452c;
                if (i8 < i9) {
                    i6 = i8;
                    i5 = i9;
                } else {
                    i5 = i8;
                    i6 = i9;
                }
                if (i3 < i6 || i3 > i5) {
                    if (i3 < i8) {
                        if (i4 == 1) {
                            c1642a.f7451b = i8 + 1;
                            c1642a.f7452c = i9 + 1;
                        } else if (i4 == 2) {
                            c1642a.f7451b = i8 - 1;
                            c1642a.f7452c = i9 - 1;
                        }
                    }
                } else if (i6 == i8) {
                    if (i4 == 1) {
                        c1642a.f7452c = i9 + 1;
                    } else if (i4 == 2) {
                        c1642a.f7452c = i9 - 1;
                    }
                    i3++;
                } else {
                    if (i4 == 1) {
                        c1642a.f7451b = i8 + 1;
                    } else if (i4 == 2) {
                        c1642a.f7451b = i8 - 1;
                    }
                    i3--;
                }
            } else {
                int i10 = c1642a.f7451b;
                if (i10 <= i3) {
                    if (i7 == 1) {
                        i3 -= c1642a.f7452c;
                    } else if (i7 == 2) {
                        i3 += c1642a.f7452c;
                    }
                } else if (i4 == 1) {
                    c1642a.f7451b = i10 + 1;
                } else if (i4 == 2) {
                    c1642a.f7451b = i10 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C1642a c1642a2 = (C1642a) arrayList.get(size2);
            int i11 = c1642a2.f7450a;
            C0334e c0334e = (C0334e) this.f663h;
            if (i11 == 8) {
                int i12 = c1642a2.f7452c;
                if (i12 == c1642a2.f7451b || i12 < 0) {
                    arrayList.remove(size2);
                    c0334e.m932l(c1642a2);
                }
            } else if (c1642a2.f7452c <= 0) {
                arrayList.remove(size2);
                c0334e.m932l(c1642a2);
            }
        }
        return i3;
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: n */
    public int mo166n() {
        return ((long[]) this.f664i).length;
    }

    /* JADX INFO: renamed from: o */
    public void m790o(Uri uri) {
        int i3;
        if (uri == null) {
            m791p();
            return;
        }
        if (uri.equals((Uri) this.f665j)) {
            return;
        }
        m791p();
        this.f665j = uri;
        C0227b c0227b = (C0227b) this.f664i;
        int i4 = c0227b.f533h;
        Context context = (Context) this.f663h;
        if (i4 == 0 || (i3 = c0227b.f534i) == 0) {
            this.f666k = new AsyncTaskC0259c(context, 0, 0, this);
        } else {
            this.f666k = new AsyncTaskC0259c(context, i4, i3, this);
        }
        AsyncTaskC0259c asyncTaskC0259c = (AsyncTaskC0259c) this.f666k;
        AbstractC0491s.m1213e(asyncTaskC0259c);
        Uri uri2 = (Uri) this.f665j;
        AbstractC0491s.m1213e(uri2);
        asyncTaskC0259c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    /* JADX INFO: renamed from: p */
    public void m791p() {
        AsyncTaskC0259c asyncTaskC0259c = (AsyncTaskC0259c) this.f666k;
        if (asyncTaskC0259c != null) {
            asyncTaskC0259c.cancel(true);
            this.f666k = null;
        }
        this.f665j = null;
    }

    /* JADX INFO: renamed from: r */
    public C1247X2 m792r() {
        if (((C1247X2) this.f666k) == null) {
            C1247X2 c1247x2 = new C1247X2((C1209O) this.f663h, (String) this.f665j);
            this.f666k = c1247x2;
            c1247x2.m3217b(1);
        }
        return (C1247X2) this.f666k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:126:0x0307  */
    /* JADX INFO: renamed from: s */
    public void m793s() {
        long jLongValue;
        C1324r0 c1324r0;
        int i3;
        C1247X2 c1247x2 = (C1247X2) this.f666k;
        if (c1247x2 != null) {
            C0187d c0187d = c1247x2.f5739j;
            if (c0187d != null) {
                c0187d.f465l = null;
                c1247x2.f5739j = null;
            }
            C1324r0 c1324r0M3395m = C1328s0.m3395m();
            c1324r0M3395m.m3256c();
            C1328s0.m3402t((C1328s0) c1324r0M3395m.f5902h, c1247x2.f5738i);
            String str = c1247x2.f5741l;
            if (str != null) {
                c1324r0M3395m.m3256c();
                C1328s0.m3407y((C1328s0) c1324r0M3395m.f5902h, str);
            }
            String str2 = c1247x2.f5742m;
            if (str2 != null) {
                c1324r0M3395m.m3256c();
                C1328s0.m3403u((C1328s0) c1324r0M3395m.f5902h, str2);
            }
            C1296k0 c1296k0M3276l = C1300l0.m3276l();
            String str3 = C1247X2.f5728o;
            c1296k0M3276l.m3256c();
            C1300l0.m3278n((C1300l0) c1296k0M3276l.f5902h, str3);
            c1296k0M3276l.m3256c();
            C1300l0.m3277m((C1300l0) c1296k0M3276l.f5902h, c1247x2.f5736g);
            C1300l0 c1300l0 = (C1300l0) c1296k0M3276l.m3254a();
            c1324r0M3395m.m3256c();
            C1328s0.m3400r((C1328s0) c1324r0M3395m.f5902h, c1300l0);
            C1348x0 c1348x0M3431l = C1352y0.m3431l();
            Object objMo2827a = c1247x2.f5730a.mo2827a();
            if (objMo2827a != null) {
                C1190J0 c1190j0M3175l = C1194K0.m3175l();
                c1190j0M3175l.m3256c();
                C1194K0.m3176m((C1194K0) c1190j0M3175l.f5902h, (String) objMo2827a);
                C1194K0 c1194k0 = (C1194K0) c1190j0M3175l.m3254a();
                c1348x0M3431l.m3256c();
                C1352y0.m3432m((C1352y0) c1348x0M3431l.f5902h, c1194k0);
            }
            String str4 = c1247x2.f5740k;
            if (str4 != null) {
                try {
                    String strReplace = str4.replace("-", "");
                    jLongValue = new BigInteger(strReplace.substring(0, Math.min(16, strReplace.length())), 16).longValue();
                } catch (NumberFormatException e3) {
                    Object[] objArr = {str4};
                    C0296b c0296b = C1247X2.f5727n;
                    Log.w(c0296b.f788a, c0296b.m833d("receiverSessionId %s is not valid for hash", objArr), e3);
                    jLongValue = 0;
                }
                c1348x0M3431l.m3256c();
                C1352y0.m3433n((C1352y0) c1348x0M3431l.f5902h, jLongValue);
            }
            List<C1251Y2> list = c1247x2.f5731b;
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (C1251Y2 c1251y2 : list) {
                    c1251y2.getClass();
                    C1340v0 c1340v0M3425l = C1344w0.m3425l();
                    c1340v0M3425l.m3256c();
                    C1344w0.m3429p((C1344w0) c1340v0M3425l.f5902h, c1251y2.f5750e);
                    int i4 = (int) (c1251y2.f5747b - c1251y2.f5749d);
                    c1340v0M3425l.m3256c();
                    C1344w0.m3426m((C1344w0) c1340v0M3425l.f5902h, i4);
                    Integer num = c1251y2.f5746a;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        c1340v0M3425l.m3256c();
                        C1344w0.m3427n((C1344w0) c1340v0M3425l.f5902h, iIntValue);
                    }
                    Boolean bool = c1251y2.f5748c;
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        c1340v0M3425l.m3256c();
                        C1344w0.m3428o((C1344w0) c1340v0M3425l.f5902h, zBooleanValue);
                    }
                    arrayList.add((C1344w0) c1340v0M3425l.m3254a());
                }
                c1348x0M3431l.m3256c();
                C1352y0.m3434o((C1352y0) c1348x0M3431l.f5902h, arrayList);
            }
            List<C1255a> list2 = c1247x2.f5732c;
            if (list2.isEmpty()) {
                c1324r0 = c1324r0M3395m;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (C1255a c1255a : list2) {
                    c1255a.getClass();
                    C1158B0 c1158b0M3120l = C1162C0.m3120l();
                    C1324r0 c1324r1 = c1324r0M3395m;
                    int i5 = (int) (c1255a.f5760b - c1255a.f5761c);
                    c1158b0M3120l.m3256c();
                    C1162C0.m3121m((C1162C0) c1158b0M3120l.f5902h, i5);
                    int i6 = c1255a.f5759a;
                    if (i6 == 1) {
                        i3 = 2;
                    } else if (i6 != 2) {
                        i3 = i6 != 3 ? 1 : 4;
                    } else {
                        i3 = 3;
                    }
                    c1158b0M3120l.m3256c();
                    C1162C0.m3122n((C1162C0) c1158b0M3120l.f5902h, i3);
                    arrayList2.add((C1162C0) c1158b0M3120l.m3254a());
                    c1324r0M3395m = c1324r1;
                }
                c1324r0 = c1324r0M3395m;
                c1348x0M3431l.m3256c();
                C1352y0.m3436q((C1352y0) c1348x0M3431l.f5902h, arrayList2);
            }
            List<C1285h1> list3 = c1247x2.f5733d;
            if (!list3.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (C1285h1 c1285h1 : list3) {
                    c1285h1.getClass();
                    C1332t0 c1332t0M3413l = C1336u0.m3413l();
                    int i7 = 11;
                    switch (c1285h1.f5905a) {
                        case "load":
                            i7 = 2;
                            break;
                        case "play":
                            i7 = 3;
                            break;
                        case "pause":
                            i7 = 4;
                            break;
                        case "stop":
                            i7 = 5;
                            break;
                        case "seek":
                            i7 = 6;
                            break;
                        case "volume":
                            i7 = 7;
                            break;
                        case "mute":
                            i7 = 8;
                            break;
                        case "volume-mute":
                            i7 = 9;
                            break;
                        case "status":
                            i7 = 10;
                            break;
                        case "activeTracks":
                            break;
                        case "trackStyle":
                            i7 = 12;
                            break;
                        case "queueInsert":
                            i7 = 13;
                            break;
                        case "queueUpdate":
                            i7 = 14;
                            break;
                        case "queueRemove":
                            i7 = 15;
                            break;
                        case "queueReorder":
                            i7 = 16;
                            break;
                        case "queueFetchItemIds":
                            i7 = 17;
                            break;
                        case "queueFetchItemRange":
                            i7 = 18;
                            break;
                        case "queueFetchItems":
                            i7 = 19;
                            break;
                        case "setPlaybackRate":
                            i7 = 20;
                            break;
                        case "skipAd":
                            i7 = 21;
                            break;
                        case "launch":
                            i7 = 22;
                            break;
                        case "setPlaybackDevices":
                            i7 = 23;
                            break;
                        default:
                            i7 = 1;
                            break;
                    }
                    c1332t0M3413l.m3256c();
                    C1336u0.m3418q((C1336u0) c1332t0M3413l.f5902h, i7);
                    int i8 = (int) c1285h1.f5906b;
                    c1332t0M3413l.m3256c();
                    C1336u0.m3414m((C1336u0) c1332t0M3413l.f5902h, i8);
                    c1332t0M3413l.m3256c();
                    C1336u0.m3415n((C1336u0) c1332t0M3413l.f5902h, c1285h1.f5907c);
                    int i9 = (int) (c1285h1.f5908d - c1285h1.f5910f);
                    c1332t0M3413l.m3256c();
                    C1336u0.m3416o((C1336u0) c1332t0M3413l.f5902h, i9);
                    int i10 = (int) (c1285h1.f5909e - c1285h1.f5910f);
                    c1332t0M3413l.m3256c();
                    C1336u0.m3417p((C1336u0) c1332t0M3413l.f5902h, i10);
                    arrayList3.add((C1336u0) c1332t0M3413l.m3254a());
                }
                c1348x0M3431l.m3256c();
                C1352y0.m3435p((C1352y0) c1348x0M3431l.f5902h, arrayList3);
            }
            Map map = c1247x2.f5734e;
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (C1259b c1259b : map.values()) {
                    c1259b.getClass();
                    C1356z0 c1356z0M3091l = C1154A0.m3091l();
                    c1356z0M3091l.m3256c();
                    C1154A0.m3095p((C1154A0) c1356z0M3091l.f5902h, c1259b.f5796e);
                    int i11 = c1259b.f5795d.get();
                    c1356z0M3091l.m3256c();
                    C1154A0.m3092m((C1154A0) c1356z0M3091l.f5902h, i11);
                    int i12 = (int) (c1259b.f5792a - c1259b.f5794c);
                    c1356z0M3091l.m3256c();
                    C1154A0.m3093n((C1154A0) c1356z0M3091l.f5902h, i12);
                    int i13 = (int) (c1259b.f5793b - c1259b.f5794c);
                    c1356z0M3091l.m3256c();
                    C1154A0.m3094o((C1154A0) c1356z0M3091l.f5902h, i13);
                    arrayList4.add((C1154A0) c1356z0M3091l.m3254a());
                }
                c1348x0M3431l.m3256c();
                C1352y0.m3437r((C1352y0) c1348x0M3431l.f5902h, arrayList4);
            }
            C1352y0 c1352y0 = (C1352y0) c1348x0M3431l.m3254a();
            c1324r0.m3256c();
            C1324r0 c1324r2 = c1324r0;
            C1328s0.m3399q((C1328s0) c1324r2.f5902h, c1352y0);
            c1247x2.f5735f.m3180a((C1328s0) c1324r2.m3254a(), 233);
            this.f666k = null;
        }
    }

    public String toString() {
        switch (this.f662g) {
            case 5:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f663h) + ", mProviderPackage: " + ((String) this.f664i) + ", mQuery: " + ((String) this.f665j) + ", mCertificates:");
                int i3 = 0;
                while (true) {
                    List list = (List) this.f666k;
                    if (i3 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i3);
                    for (int i4 = 0; i4 < list2.size(); i4++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i4), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i3++;
                }
                break;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0258b(Context context) {
        this(context, new C0227b(-1, 0, 0));
        this.f662g = 0;
    }

    public C0258b(Context context, C0227b c0227b) {
        this.f662g = 0;
        this.f663h = context;
        this.f664i = c0227b;
        m791p();
    }

    public C0258b(InterfaceC2180a interfaceC2180a, InterfaceC2180a interfaceC2180a2, C2173i c2173i, InterfaceC2180a interfaceC2180a3, InterfaceC2180a interfaceC2180a4) {
        this.f662g = 4;
        this.f663h = interfaceC2180a;
        this.f664i = interfaceC2180a2;
        this.f665j = c2173i;
        this.f666k = interfaceC2180a3;
        this.f667l = interfaceC2180a4;
    }

    public C0258b(C0624c c0624c, HashMap map, HashMap map2, HashMap map3) {
        this.f662g = 1;
        this.f663h = c0624c;
        this.f666k = map2;
        this.f667l = map3;
        this.f665j = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i3 = 0;
        c0624c.m1542d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i3] = ((Long) it.next()).longValue();
            i3++;
        }
        this.f664i = jArr;
    }

    public C0258b(String str, String str2, String str3, List list) {
        this.f662g = 5;
        str.getClass();
        this.f663h = str;
        str2.getClass();
        this.f664i = str2;
        this.f665j = str3;
        list.getClass();
        this.f666k = list;
        this.f667l = str + "-" + str2 + "-" + str3;
    }

    public C0258b(C1666w c1666w) {
        this.f662g = 3;
        this.f663h = new C0334e(30, 7);
        this.f664i = new ArrayList();
        this.f665j = new ArrayList();
        this.f666k = c1666w;
        this.f667l = new C1447t(11, this);
    }
}
