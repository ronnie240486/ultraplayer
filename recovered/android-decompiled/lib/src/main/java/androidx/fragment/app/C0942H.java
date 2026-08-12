package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p076a.C0787c;

/* JADX INFO: renamed from: androidx.fragment.app.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0942H implements Parcelable {
    public static final Parcelable.Creator<C0942H> CREATOR = new C0787c(10);

    /* JADX INFO: renamed from: g */
    public final String f4105g;

    /* JADX INFO: renamed from: h */
    public final String f4106h;

    /* JADX INFO: renamed from: i */
    public final boolean f4107i;

    /* JADX INFO: renamed from: j */
    public final int f4108j;

    /* JADX INFO: renamed from: k */
    public final int f4109k;

    /* JADX INFO: renamed from: l */
    public final String f4110l;

    /* JADX INFO: renamed from: m */
    public final boolean f4111m;

    /* JADX INFO: renamed from: n */
    public final boolean f4112n;

    /* JADX INFO: renamed from: o */
    public final boolean f4113o;

    /* JADX INFO: renamed from: p */
    public final Bundle f4114p;

    /* JADX INFO: renamed from: q */
    public final boolean f4115q;

    /* JADX INFO: renamed from: r */
    public final int f4116r;

    /* JADX INFO: renamed from: s */
    public Bundle f4117s;

    public C0942H(AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n) {
        this.f4105g = abstractComponentCallbacksC0963n.getClass().getName();
        this.f4106h = abstractComponentCallbacksC0963n.f4230k;
        this.f4107i = abstractComponentCallbacksC0963n.f4238s;
        this.f4108j = abstractComponentCallbacksC0963n.f4205B;
        this.f4109k = abstractComponentCallbacksC0963n.f4206C;
        this.f4110l = abstractComponentCallbacksC0963n.f4207D;
        this.f4111m = abstractComponentCallbacksC0963n.f4210G;
        this.f4112n = abstractComponentCallbacksC0963n.f4237r;
        this.f4113o = abstractComponentCallbacksC0963n.f4209F;
        this.f4114p = abstractComponentCallbacksC0963n.f4231l;
        this.f4115q = abstractComponentCallbacksC0963n.f4208E;
        this.f4116r = abstractComponentCallbacksC0963n.f4220Q.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f4105g);
        sb.append(" (");
        sb.append(this.f4106h);
        sb.append(")}:");
        if (this.f4107i) {
            sb.append(" fromLayout");
        }
        int i3 = this.f4109k;
        if (i3 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i3));
        }
        String str = this.f4110l;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f4111m) {
            sb.append(" retainInstance");
        }
        if (this.f4112n) {
            sb.append(" removing");
        }
        if (this.f4113o) {
            sb.append(" detached");
        }
        if (this.f4115q) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f4105g);
        parcel.writeString(this.f4106h);
        parcel.writeInt(this.f4107i ? 1 : 0);
        parcel.writeInt(this.f4108j);
        parcel.writeInt(this.f4109k);
        parcel.writeString(this.f4110l);
        parcel.writeInt(this.f4111m ? 1 : 0);
        parcel.writeInt(this.f4112n ? 1 : 0);
        parcel.writeInt(this.f4113o ? 1 : 0);
        parcel.writeBundle(this.f4114p);
        parcel.writeInt(this.f4115q ? 1 : 0);
        parcel.writeBundle(this.f4117s);
        parcel.writeInt(this.f4116r);
    }

    public C0942H(Parcel parcel) {
        this.f4105g = parcel.readString();
        this.f4106h = parcel.readString();
        this.f4107i = parcel.readInt() != 0;
        this.f4108j = parcel.readInt();
        this.f4109k = parcel.readInt();
        this.f4110l = parcel.readString();
        this.f4111m = parcel.readInt() != 0;
        this.f4112n = parcel.readInt() != 0;
        this.f4113o = parcel.readInt() != 0;
        this.f4114p = parcel.readBundle();
        this.f4115q = parcel.readInt() != 0;
        this.f4117s = parcel.readBundle();
        this.f4116r = parcel.readInt();
    }
}
