package p104h1;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p093e1.C1516a;
import p157w.AbstractC2317k;

/* JADX INFO: renamed from: h1.o */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1658o implements Runnable {

    /* JADX INFO: renamed from: k */
    public static final ThreadLocal f7549k = new ThreadLocal();

    /* JADX INFO: renamed from: l */
    public static final C1516a f7550l = new C1516a(1);

    /* JADX INFO: renamed from: g */
    public ArrayList f7551g;

    /* JADX INFO: renamed from: h */
    public long f7552h;

    /* JADX INFO: renamed from: i */
    public long f7553i;

    /* JADX INFO: renamed from: j */
    public ArrayList f7554j;

    /* JADX INFO: renamed from: c */
    public static AbstractC1635T m4087c(RecyclerView recyclerView, int i3, long j3) {
        int iM2163K = recyclerView.f4754l.m2163K();
        for (int i4 = 0; i4 < iM2163K; i4++) {
            AbstractC1635T abstractC1635TM2741F = RecyclerView.m2741F(recyclerView.f4754l.m2162J(i4));
            if (abstractC1635TM2741F.f7408c == i3 && !abstractC1635TM2741F.m4051e()) {
                return null;
            }
        }
        C1627K c1627k = recyclerView.f4748i;
        try {
            recyclerView.m2757L();
            AbstractC1635T abstractC1635TM4041k = c1627k.m4041k(i3, j3);
            if (abstractC1635TM4041k != null) {
                if (!abstractC1635TM4041k.m4050d() || abstractC1635TM4041k.m4051e()) {
                    c1627k.m4031a(abstractC1635TM4041k, false);
                } else {
                    c1627k.m4038h(abstractC1635TM4041k.f7406a);
                }
            }
            return abstractC1635TM4041k;
        } finally {
            recyclerView.m2758M(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4088a(RecyclerView recyclerView, int i3, int i4) {
        if (recyclerView.f4778x && this.f7552h == 0) {
            this.f7552h = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C1656m c1656m = recyclerView.f4749i0;
        c1656m.f7541b = i3;
        c1656m.f7542c = i4;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX INFO: renamed from: b */
    public final void m4089b(long j3) {
        C1657n c1657n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C1657n c1657n2;
        ArrayList arrayList = this.f7551g;
        int size = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i4);
            if (recyclerView3.getWindowVisibility() == 0) {
                C1656m c1656m = recyclerView3.f4749i0;
                c1656m.m4085c(recyclerView3, false);
                i3 += c1656m.f7543d;
            }
        }
        ArrayList arrayList2 = this.f7554j;
        arrayList2.ensureCapacity(i3);
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i6);
            if (recyclerView4.getWindowVisibility() == 0) {
                C1656m c1656m2 = recyclerView4.f4749i0;
                int iAbs = Math.abs(c1656m2.f7542c) + Math.abs(c1656m2.f7541b);
                for (int i7 = 0; i7 < c1656m2.f7543d * 2; i7 += 2) {
                    if (i5 >= arrayList2.size()) {
                        c1657n2 = new C1657n();
                        arrayList2.add(c1657n2);
                    } else {
                        c1657n2 = (C1657n) arrayList2.get(i5);
                    }
                    int[] iArr = (int[]) c1656m2.f7540a;
                    int i8 = iArr[i7 + 1];
                    c1657n2.f7544a = i8 <= iAbs;
                    c1657n2.f7545b = iAbs;
                    c1657n2.f7546c = i8;
                    c1657n2.f7547d = recyclerView4;
                    c1657n2.f7548e = iArr[i7];
                    i5++;
                }
            }
        }
        Collections.sort(arrayList2, f7550l);
        for (int i9 = 0; i9 < arrayList2.size() && (recyclerView = (c1657n = (C1657n) arrayList2.get(i9)).f7547d) != null; i9++) {
            AbstractC1635T abstractC1635TM4087c = m4087c(recyclerView, c1657n.f7548e, c1657n.f7544a ? Long.MAX_VALUE : j3);
            if (abstractC1635TM4087c != null && abstractC1635TM4087c.f7407b != null && abstractC1635TM4087c.m4050d() && !abstractC1635TM4087c.m4051e() && (recyclerView2 = (RecyclerView) abstractC1635TM4087c.f7407b.get()) != null) {
                if (recyclerView2.f4721G && recyclerView2.f4754l.m2163K() != 0) {
                    AbstractC1618B abstractC1618B = recyclerView2.f4730P;
                    if (abstractC1618B != null) {
                        abstractC1618B.mo3994e();
                    }
                    AbstractC1621E abstractC1621E = recyclerView2.f4768s;
                    C1627K c1627k = recyclerView2.f4748i;
                    if (abstractC1621E != null) {
                        abstractC1621E.m4012c0(c1627k);
                        recyclerView2.f4768s.m4013d0(c1627k);
                    }
                    c1627k.f7375a.clear();
                    c1627k.m4036f();
                }
                C1656m c1656m3 = recyclerView2.f4749i0;
                c1656m3.m4085c(recyclerView2, true);
                if (c1656m3.f7543d != 0) {
                    try {
                        int i10 = AbstractC2317k.f9837a;
                        Trace.beginSection("RV Nested Prefetch");
                        C1631O c1631o = recyclerView2.f4751j0;
                        AbstractC1667x abstractC1667x = recyclerView2.f4766r;
                        c1631o.f7387c = 1;
                        c1631o.f7388d = abstractC1667x.mo2591a();
                        c1631o.f7390f = false;
                        c1631o.f7391g = false;
                        c1631o.f7392h = false;
                        for (int i11 = 0; i11 < c1656m3.f7543d * 2; i11 += 2) {
                            m4087c(recyclerView2, ((int[]) c1656m3.f7540a)[i11], j3);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i12 = AbstractC2317k.f9837a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c1657n.f7544a = false;
            c1657n.f7545b = 0;
            c1657n.f7546c = 0;
            c1657n.f7547d = null;
            c1657n.f7548e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i3 = AbstractC2317k.f9837a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f7551g;
            if (arrayList.isEmpty()) {
                this.f7552h = 0L;
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i4);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f7552h = 0L;
            } else {
                m4089b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f7553i);
                this.f7552h = 0L;
            }
        } finally {
            this.f7552h = 0L;
            int i5 = AbstractC2317k.f9837a;
            Trace.endSection();
        }
    }
}
