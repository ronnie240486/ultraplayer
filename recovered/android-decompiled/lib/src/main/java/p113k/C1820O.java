package p113k;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p076a.C0787c;

/* JADX INFO: renamed from: k.O */
/* JADX INFO: loaded from: classes.dex */
public final class C1820O extends View.BaseSavedState {
    public static final Parcelable.Creator<C1820O> CREATOR = new C0787c(19);

    /* JADX INFO: renamed from: g */
    public boolean f8065g;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeByte(this.f8065g ? (byte) 1 : (byte) 0);
    }
}
