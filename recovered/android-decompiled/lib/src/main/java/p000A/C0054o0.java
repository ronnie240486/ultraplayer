package p000A;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p148t.C2264c;

/* JADX INFO: renamed from: A.o0 */
/* JADX INFO: loaded from: classes.dex */
public class C0054o0 {

    /* JADX INFO: renamed from: b */
    public static final C0056p0 f78b;

    /* JADX INFO: renamed from: a */
    public final C0056p0 f79a;

    static {
        AbstractC0040h0 c0036f0;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            c0036f0 = new C0038g0();
        } else {
            c0036f0 = i3 >= 29 ? new C0036f0() : new C0032d0();
        }
        f78b = c0036f0.mo180b().f81a.mo256a().f81a.mo224b().f81a.mo225c();
    }

    public C0054o0(C0056p0 c0056p0) {
        this.f79a = c0056p0;
    }

    /* JADX INFO: renamed from: a */
    public C0056p0 mo256a() {
        return this.f79a;
    }

    /* JADX INFO: renamed from: b */
    public C0056p0 mo224b() {
        return this.f79a;
    }

    /* JADX INFO: renamed from: c */
    public C0056p0 mo225c() {
        return this.f79a;
    }

    /* JADX INFO: renamed from: e */
    public C0047l mo257e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0054o0)) {
            return false;
        }
        C0054o0 c0054o0 = (C0054o0) obj;
        return mo220j() == c0054o0.mo220j() && mo227i() == c0054o0.mo227i() && Objects.equals(mo218g(), c0054o0.mo218g()) && Objects.equals(mo226f(), c0054o0.mo226f()) && Objects.equals(mo257e(), c0054o0.mo257e());
    }

    /* JADX INFO: renamed from: f */
    public C2264c mo226f() {
        return C2264c.f9697e;
    }

    /* JADX INFO: renamed from: g */
    public C2264c mo218g() {
        return C2264c.f9697e;
    }

    /* JADX INFO: renamed from: h */
    public C0056p0 mo219h(int i3, int i4, int i5, int i6) {
        return f78b;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo220j()), Boolean.valueOf(mo227i()), mo218g(), mo226f(), mo257e());
    }

    /* JADX INFO: renamed from: i */
    public boolean mo227i() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo220j() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void mo217d(View view) {
    }

    /* JADX INFO: renamed from: k */
    public void mo221k(C2264c[] c2264cArr) {
    }

    /* JADX INFO: renamed from: l */
    public void mo222l(C0056p0 c0056p0) {
    }

    /* JADX INFO: renamed from: m */
    public void mo228m(C2264c c2264c) {
    }
}
