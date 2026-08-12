package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p076a.C0787c;

/* JADX INFO: renamed from: androidx.activity.result.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0908a implements Parcelable {
    public static final Parcelable.Creator<C0908a> CREATOR = new C0787c(5);

    /* JADX INFO: renamed from: g */
    public final int f3776g;

    /* JADX INFO: renamed from: h */
    public final Intent f3777h;

    public C0908a(int i3, Intent intent) {
        this.f3776g = i3;
        this.f3777h = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i3 = this.f3776g;
        if (i3 != -1) {
            strValueOf = i3 != 0 ? String.valueOf(i3) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.f3777h);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f3776g);
        Intent intent = this.f3777h;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i3);
        }
    }

    public C0908a(Parcel parcel) {
        this.f3776g = parcel.readInt();
        this.f3777h = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
