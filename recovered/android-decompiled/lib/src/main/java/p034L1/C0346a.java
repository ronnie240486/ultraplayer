package p034L1;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import p009D0.C0106b;
import p024I0.C0271a;
import p046P1.AbstractC0491s;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: L1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0346a extends AbstractC0512a {

    /* JADX INFO: renamed from: g */
    public final int f1121g;

    /* JADX INFO: renamed from: h */
    public final int f1122h;

    /* JADX INFO: renamed from: i */
    public final PendingIntent f1123i;

    /* JADX INFO: renamed from: j */
    public final String f1124j;

    /* JADX INFO: renamed from: k */
    public static final C0346a f1120k = new C0346a(0);
    public static final Parcelable.Creator<C0346a> CREATOR = new C0271a(9);

    public C0346a(int i3, int i4, PendingIntent pendingIntent, String str) {
        this.f1121g = i3;
        this.f1122h = i4;
        this.f1123i = pendingIntent;
        this.f1124j = str;
    }

    /* JADX INFO: renamed from: e */
    public static String m950e(int i3) {
        if (i3 == 99) {
            return "UNFINISHED";
        }
        if (i3 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i3) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i3) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i3 + ")";
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0346a)) {
            return false;
        }
        C0346a c0346a = (C0346a) obj;
        return this.f1122h == c0346a.f1122h && AbstractC0491s.m1216h(this.f1123i, c0346a.f1123i) && AbstractC0491s.m1216h(this.f1124j, c0346a.f1124j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1122h), this.f1123i, this.f1124j});
    }

    public final String toString() {
        C0106b c0106b = new C0106b(this);
        c0106b.m525m(m950e(this.f1122h), "statusCode");
        c0106b.m525m(this.f1123i, "resolution");
        c0106b.m525m(this.f1124j, "message");
        return c0106b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 1, 4);
        parcel.writeInt(this.f1121g);
        AbstractC1303m.m3311d0(parcel, 2, 4);
        parcel.writeInt(this.f1122h);
        AbstractC1303m.m3298U(parcel, 3, this.f1123i, i3);
        AbstractC1303m.m3299V(parcel, 4, this.f1124j);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }

    public C0346a(int i3) {
        this(1, i3, null, null);
    }

    public C0346a(int i3, PendingIntent pendingIntent) {
        this(1, i3, pendingIntent, null);
    }
}
