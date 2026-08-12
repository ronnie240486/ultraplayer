package p018G0;

import p055T.C0541D;
import p055T.C0583o;
import p055T.InterfaceC0543F;

/* JADX INFO: renamed from: G0.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0219i implements InterfaceC0543F {

    /* JADX INFO: renamed from: g */
    public final String f509g;

    public AbstractC0219i(String str) {
        this.f509g = str;
    }

    @Override // p055T.InterfaceC0543F
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte[] mo497a() {
        return null;
    }

    @Override // p055T.InterfaceC0543F
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0583o mo498b() {
        return null;
    }

    @Override // p055T.InterfaceC0543F
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void mo499c(C0541D c0541d) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f509g;
    }
}
