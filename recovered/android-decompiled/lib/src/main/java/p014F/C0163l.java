package p014F;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p007C0.C0101a;

/* JADX INFO: renamed from: F.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0163l extends View.BaseSavedState {
    public static final Parcelable.Creator<C0163l> CREATOR = new C0101a(5);

    /* JADX INFO: renamed from: g */
    public int f389g;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f389g + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f389g);
    }
}
