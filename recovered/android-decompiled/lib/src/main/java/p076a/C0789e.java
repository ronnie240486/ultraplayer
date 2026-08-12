package p076a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: a.e */
/* JADX INFO: loaded from: classes.dex */
public class C0789e implements Parcelable {
    public static final Parcelable.Creator<C0789e> CREATOR = new C0787c(0);

    /* JADX INFO: renamed from: g */
    public InterfaceC0786b f3200g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        synchronized (this) {
            try {
                if (this.f3200g == null) {
                    this.f3200g = new BinderC0788d(this);
                }
                parcel.writeStrongBinder(this.f3200g.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo1900d(int i3, Bundle bundle) {
    }
}
