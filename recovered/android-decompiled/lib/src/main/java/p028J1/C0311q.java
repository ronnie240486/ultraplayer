package p028J1;

import android.os.Parcel;
import com.google.android.gms.internal.cast.AbstractC1339v;
import p040N1.InterfaceC0430k;
import p097f2.C1560d;

/* JADX INFO: renamed from: J1.q */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0311q implements InterfaceC0430k {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f836g;

    /* JADX INFO: renamed from: h */
    public final String[] f837h;

    public /* synthetic */ C0311q(C0313s c0313s, String[] strArr, int i3) {
        this.f836g = i3;
        this.f837h = strArr;
    }

    @Override // p040N1.InterfaceC0430k
    /* JADX INFO: renamed from: m */
    public void mo165m(Object obj, Object obj2) {
        C0314t c0314t = (C0314t) obj;
        C1560d c1560d = (C1560d) obj2;
        switch (this.f836g) {
            case 0:
                BinderC0312r binderC0312r = new BinderC0312r(1, c1560d);
                C0303i c0303i = (C0303i) c0314t.m3090r();
                Parcel parcelM1894e0 = c0303i.m1894e0();
                AbstractC1339v.m3422d(parcelM1894e0, binderC0312r);
                parcelM1894e0.writeStringArray(this.f837h);
                c0303i.m1897v0(parcelM1894e0, 6);
                break;
            case 1:
                BinderC0312r binderC0312r2 = new BinderC0312r(0, c1560d);
                C0303i c0303i2 = (C0303i) c0314t.m3090r();
                Parcel parcelM1894e1 = c0303i2.m1894e0();
                AbstractC1339v.m3422d(parcelM1894e1, binderC0312r2);
                parcelM1894e1.writeStringArray(this.f837h);
                c0303i2.m1897v0(parcelM1894e1, 5);
                break;
            default:
                BinderC0312r binderC0312r3 = new BinderC0312r(2, c1560d);
                C0303i c0303i3 = (C0303i) c0314t.m3090r();
                Parcel parcelM1894e2 = c0303i3.m1894e0();
                AbstractC1339v.m3422d(parcelM1894e2, binderC0312r3);
                parcelM1894e2.writeStringArray(this.f837h);
                c0303i3.m1897v0(parcelM1894e2, 7);
                break;
        }
    }

    public C0311q(String[] strArr) {
        this.f836g = 3;
        this.f837h = strArr;
    }
}
