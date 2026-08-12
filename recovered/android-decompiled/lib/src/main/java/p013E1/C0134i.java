package p013E1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import p028J1.AbstractC0295a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: E1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0134i extends AbstractC0512a {
    public static final Parcelable.Creator<C0134i> CREATOR = new C0147v(5);

    /* JADX INFO: renamed from: g */
    public final boolean f247g;

    /* JADX INFO: renamed from: h */
    public final String f248h;

    /* JADX INFO: renamed from: i */
    public final boolean f249i;

    /* JADX INFO: renamed from: j */
    public final C0133h f250j;

    public C0134i(boolean z3, String str, boolean z4, C0133h c0133h) {
        this.f247g = z3;
        this.f248h = str;
        this.f249i = z4;
        this.f250j = c0133h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0134i)) {
            return false;
        }
        C0134i c0134i = (C0134i) obj;
        return this.f247g == c0134i.f247g && AbstractC0295a.m828e(this.f248h, c0134i.f248h) && this.f249i == c0134i.f249i && AbstractC0295a.m828e(this.f250j, c0134i.f250j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f247g), this.f248h, Boolean.valueOf(this.f249i), this.f250j});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f247g + ", language=" + this.f248h + ", androidReceiverCompatible: " + this.f249i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 2, 4);
        parcel.writeInt(this.f247g ? 1 : 0);
        AbstractC1303m.m3299V(parcel, 3, this.f248h);
        AbstractC1303m.m3311d0(parcel, 4, 4);
        parcel.writeInt(this.f249i ? 1 : 0);
        AbstractC1303m.m3298U(parcel, 5, this.f250j, i3);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }

    public C0134i() {
        Locale locale = Locale.getDefault();
        Pattern pattern = AbstractC0295a.f786a;
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        this(false, sb.toString(), false, null);
    }
}
