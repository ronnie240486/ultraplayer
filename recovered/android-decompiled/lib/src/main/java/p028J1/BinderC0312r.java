package p028J1;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.cast.AbstractC1339v;
import p079a2.AbstractBinderC0852a;
import p097f2.C1560d;

/* JADX INFO: renamed from: J1.r */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0312r extends AbstractBinderC0852a implements InterfaceC0299e {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f838c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1560d f839d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0312r(int i3, C1560d c1560d) {
        super(1, "com.google.android.gms.cast.internal.IBundleCallback");
        this.f838c = i3;
        this.f839d = c1560d;
    }

    @Override // p028J1.InterfaceC0299e
    /* JADX INFO: renamed from: U */
    public final void mo834U(Bundle bundle) {
        switch (this.f838c) {
            case 0:
                this.f839d.m3879b(bundle);
                break;
            case 1:
                this.f839d.m3879b(bundle);
                break;
            default:
                this.f839d.m3879b(bundle);
                break;
        }
    }

    @Override // p079a2.AbstractBinderC0852a
    /* JADX INFO: renamed from: u0 */
    public final boolean mo648u0(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC1339v.m3419a(parcel, Bundle.CREATOR);
        AbstractC1339v.m3420b(parcel);
        mo834U(bundle);
        return true;
    }
}
