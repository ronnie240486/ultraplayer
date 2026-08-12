package p077a0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.activity.RunnableC0892b;
import p055T.C0548K;
import p064W.AbstractC0632A;
import p064W.C0653u;

/* JADX INFO: renamed from: a0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0834j0 implements InterfaceC0801L {

    /* JADX INFO: renamed from: g */
    public long f3541g;

    /* JADX INFO: renamed from: h */
    public long f3542h;

    /* JADX INFO: renamed from: i */
    public boolean f3543i;

    /* JADX INFO: renamed from: j */
    public final Object f3544j;

    /* JADX INFO: renamed from: k */
    public Object f3545k;

    public C0834j0(RunnableC0892b runnableC0892b) {
        this.f3544j = new Handler(Looper.getMainLooper());
        this.f3545k = runnableC0892b;
    }

    @Override // p077a0.InterfaceC0801L
    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean mo2000a() {
        return false;
    }

    @Override // p077a0.InterfaceC0801L
    /* JADX INFO: renamed from: b */
    public long mo2001b() {
        long j3 = this.f3541g;
        if (!this.f3543i) {
            return j3;
        }
        ((C0653u) this.f3544j).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f3542h;
        C0548K c0548k = (C0548K) this.f3545k;
        return c0548k.f1949a == 1.0f ? AbstractC0632A.m1571L(jElapsedRealtime) + j3 : (jElapsedRealtime * ((long) c0548k.f1951c)) + j3;
    }

    /* JADX INFO: renamed from: c */
    public void m2104c(long j3) {
        this.f3541g = j3;
        if (this.f3543i) {
            ((C0653u) this.f3544j).getClass();
            this.f3542h = SystemClock.elapsedRealtime();
        }
    }

    @Override // p077a0.InterfaceC0801L
    /* JADX INFO: renamed from: d */
    public void mo2002d(C0548K c0548k) {
        if (this.f3543i) {
            m2104c(mo2001b());
        }
        this.f3545k = c0548k;
    }

    /* JADX INFO: renamed from: e */
    public void m2105e() {
        if (this.f3543i) {
            return;
        }
        ((C0653u) this.f3544j).getClass();
        this.f3542h = SystemClock.elapsedRealtime();
        this.f3543i = true;
    }

    @Override // p077a0.InterfaceC0801L
    /* JADX INFO: renamed from: f */
    public C0548K mo2003f() {
        return (C0548K) this.f3545k;
    }

    public C0834j0(C0653u c0653u) {
        this.f3544j = c0653u;
        this.f3545k = C0548K.f1948d;
    }
}
