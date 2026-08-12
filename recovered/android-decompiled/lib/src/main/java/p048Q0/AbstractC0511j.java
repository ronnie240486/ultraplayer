package p048Q0;

import java.util.ArrayDeque;
import p000A.C0031d;
import p011E.C0111d;
import p045P0.C0457c;
import p045P0.C0461g;
import p045P0.InterfaceC0459e;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: Q0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0511j implements InterfaceC0459e {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f1746a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f1747b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f1748c;

    /* JADX INFO: renamed from: d */
    public C0510i f1749d;

    /* JADX INFO: renamed from: e */
    public long f1750e;

    /* JADX INFO: renamed from: f */
    public long f1751f;

    /* JADX INFO: renamed from: g */
    public long f1752g;

    public AbstractC0511j() {
        for (int i3 = 0; i3 < 10; i3++) {
            this.f1746a.add(new C0510i(1));
        }
        this.f1747b = new ArrayDeque();
        for (int i4 = 0; i4 < 2; i4++) {
            ArrayDeque arrayDeque = this.f1747b;
            C0111d c0111d = new C0111d(2, this);
            C0457c c0457c = new C0457c();
            c0457c.f1530n = c0111d;
            arrayDeque.add(c0457c);
        }
        this.f1748c = new ArrayDeque();
        this.f1752g = -9223372036854775807L;
    }

    @Override // p045P0.InterfaceC0459e
    /* JADX INFO: renamed from: b */
    public final void mo1160b(long j3) {
        this.f1750e = j3;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // p073Z.InterfaceC0768c
    /* JADX INFO: renamed from: c */
    public final void mo1268c(C0461g c0461g) {
        AbstractC0646n.m1625c(c0461g == this.f1749d);
        C0510i c0510i = (C0510i) c0461g;
        long j3 = c0510i.f3146m;
        if (j3 != Long.MIN_VALUE) {
            long j4 = this.f1752g;
            if (j4 == -9223372036854775807L || j3 >= j4) {
                long j5 = this.f1751f;
                this.f1751f = 1 + j5;
                c0510i.f1745q = j5;
                this.f1748c.add(c0510i);
            } else {
                c0510i.mo1883e();
                this.f1746a.add(c0510i);
            }
        } else {
            long j6 = this.f1751f;
            this.f1751f = 1 + j6;
            c0510i.f1745q = j6;
            this.f1748c.add(c0510i);
        }
        this.f1749d = null;
    }

    @Override // p073Z.InterfaceC0768c
    /* JADX INFO: renamed from: e */
    public final Object mo1269e() {
        AbstractC0646n.m1630h(this.f1749d == null);
        ArrayDeque arrayDeque = this.f1746a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C0510i c0510i = (C0510i) arrayDeque.pollFirst();
        this.f1749d = c0510i;
        return c0510i;
    }

    @Override // p073Z.InterfaceC0768c
    /* JADX INFO: renamed from: f */
    public final void mo1270f(long j3) {
        this.f1752g = j3;
    }

    @Override // p073Z.InterfaceC0768c
    public void flush() {
        ArrayDeque arrayDeque;
        this.f1751f = 0L;
        this.f1750e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f1748c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f1746a;
            if (zIsEmpty) {
                break;
            }
            C0510i c0510i = (C0510i) arrayDeque2.poll();
            int i3 = AbstractC0632A.f2454a;
            c0510i.mo1883e();
            arrayDeque.add(c0510i);
        }
        C0510i c0510i2 = this.f1749d;
        if (c0510i2 != null) {
            c0510i2.mo1883e();
            arrayDeque.add(c0510i2);
            this.f1749d = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract C0031d mo1231g();

    /* JADX INFO: renamed from: h */
    public abstract void mo1232h(C0510i c0510i);

    @Override // p073Z.InterfaceC0768c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0457c mo1230d() {
        ArrayDeque arrayDeque = this.f1747b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f1748c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            C0510i c0510i = (C0510i) arrayDeque2.peek();
            int i3 = AbstractC0632A.f2454a;
            if (c0510i.f3146m > this.f1750e) {
                return null;
            }
            C0510i c0510i2 = (C0510i) arrayDeque2.poll();
            boolean zM1787c = c0510i2.m1787c(4);
            ArrayDeque arrayDeque3 = this.f1746a;
            if (zM1787c) {
                C0457c c0457c = (C0457c) arrayDeque.pollFirst();
                c0457c.m1786a(4);
                c0510i2.mo1883e();
                arrayDeque3.add(c0510i2);
                return c0457c;
            }
            mo1232h(c0510i2);
            if (mo1234j()) {
                C0031d c0031dMo1231g = mo1231g();
                C0457c c0457c2 = (C0457c) arrayDeque.pollFirst();
                long j3 = c0510i2.f3146m;
                c0457c2.f3149i = j3;
                c0457c2.f1527k = c0031dMo1231g;
                c0457c2.f1528l = j3;
                c0510i2.mo1883e();
                arrayDeque3.add(c0510i2);
                return c0457c2;
            }
            c0510i2.mo1883e();
            arrayDeque3.add(c0510i2);
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo1234j();

    @Override // p073Z.InterfaceC0768c
    /* JADX INFO: renamed from: a */
    public void mo1229a() {
    }
}
