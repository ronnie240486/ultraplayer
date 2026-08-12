package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import p009D0.C0106b;
import p013E1.AbstractC0150y;
import p024I0.C0271a;
import p034L1.C0346a;
import p037M1.InterfaceC0398k;
import p046P1.AbstractC0491s;
import p049Q1.AbstractC0512a;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractC0512a implements InterfaceC0398k, ReflectedParcelable {

    /* JADX INFO: renamed from: g */
    public final int f5497g;

    /* JADX INFO: renamed from: h */
    public final String f5498h;

    /* JADX INFO: renamed from: i */
    public final PendingIntent f5499i;

    /* JADX INFO: renamed from: j */
    public final C0346a f5500j;

    /* JADX INFO: renamed from: k */
    public static final Status f5494k = new Status(0, null, null, null);

    /* JADX INFO: renamed from: l */
    public static final Status f5495l = new Status(15, null, null, null);

    /* JADX INFO: renamed from: m */
    public static final Status f5496m = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new C0271a(12);

    public Status(int i3, String str, PendingIntent pendingIntent, C0346a c0346a) {
        this.f5497g = i3;
        this.f5498h = str;
        this.f5499i = pendingIntent;
        this.f5500j = c0346a;
    }

    @Override // p037M1.InterfaceC0398k
    /* JADX INFO: renamed from: d */
    public final Status mo774d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5497g == status.f5497g && AbstractC0491s.m1216h(this.f5498h, status.f5498h) && AbstractC0491s.m1216h(this.f5499i, status.f5499i) && AbstractC0491s.m1216h(this.f5500j, status.f5500j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5497g), this.f5498h, this.f5499i, this.f5500j});
    }

    public final String toString() {
        C0106b c0106b = new C0106b(this);
        String strM607b = this.f5498h;
        if (strM607b == null) {
            strM607b = AbstractC0150y.m607b(this.f5497g);
        }
        c0106b.m525m(strM607b, "statusCode");
        c0106b.m525m(this.f5499i, "resolution");
        return c0106b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 1, 4);
        parcel.writeInt(this.f5497g);
        AbstractC1303m.m3299V(parcel, 2, this.f5498h);
        AbstractC1303m.m3298U(parcel, 3, this.f5499i, i3);
        AbstractC1303m.m3298U(parcel, 4, this.f5500j, i3);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
