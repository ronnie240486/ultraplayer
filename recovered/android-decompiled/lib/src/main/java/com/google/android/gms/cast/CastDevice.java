package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p013E1.C0147v;
import p028J1.AbstractC0295a;
import p028J1.C0320z;
import p049Q1.AbstractC0512a;

/* JADX INFO: loaded from: classes.dex */
public class CastDevice extends AbstractC0512a implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new C0147v(22);

    /* JADX INFO: renamed from: g */
    public final String f5419g;

    /* JADX INFO: renamed from: h */
    public final String f5420h;

    /* JADX INFO: renamed from: i */
    public final InetAddress f5421i;

    /* JADX INFO: renamed from: j */
    public final String f5422j;

    /* JADX INFO: renamed from: k */
    public final String f5423k;

    /* JADX INFO: renamed from: l */
    public final String f5424l;

    /* JADX INFO: renamed from: m */
    public final int f5425m;

    /* JADX INFO: renamed from: n */
    public final List f5426n;

    /* JADX INFO: renamed from: o */
    public final int f5427o;

    /* JADX INFO: renamed from: p */
    public final int f5428p;

    /* JADX INFO: renamed from: q */
    public final String f5429q;

    /* JADX INFO: renamed from: r */
    public final String f5430r;

    /* JADX INFO: renamed from: s */
    public final int f5431s;

    /* JADX INFO: renamed from: t */
    public final String f5432t;

    /* JADX INFO: renamed from: u */
    public final byte[] f5433u;

    /* JADX INFO: renamed from: v */
    public final String f5434v;

    /* JADX INFO: renamed from: w */
    public final boolean f5435w;

    /* JADX INFO: renamed from: x */
    public final C0320z f5436x;

    /* JADX INFO: renamed from: y */
    public final Integer f5437y;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i3, ArrayList arrayList, int i4, int i5, String str6, String str7, int i6, String str8, byte[] bArr, String str9, boolean z3, C0320z c0320z, Integer num) {
        this.f5419g = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.f5420h = str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f5421i = InetAddress.getByName(str2);
            } catch (UnknownHostException e3) {
                Log.i("CastDevice", "Unable to convert host address (" + this.f5420h + ") to ipaddress: " + e3.getMessage());
            }
        }
        this.f5422j = str3 == null ? "" : str3;
        this.f5423k = str4 == null ? "" : str4;
        this.f5424l = str5 == null ? "" : str5;
        this.f5425m = i3;
        this.f5426n = arrayList == null ? new ArrayList() : arrayList;
        this.f5427o = i4;
        this.f5428p = i5;
        this.f5429q = str6 == null ? "" : str6;
        this.f5430r = str7;
        this.f5431s = i6;
        this.f5432t = str8;
        this.f5433u = bArr;
        this.f5434v = str9;
        this.f5435w = z3;
        this.f5436x = c0320z;
        this.f5437y = num;
    }

    /* JADX INFO: renamed from: e */
    public static CastDevice m3070e(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public final boolean equals(Object obj) {
        int i3;
        int i4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.f5419g;
        if (str == null) {
            return castDevice.f5419g == null;
        }
        if (AbstractC0295a.m828e(str, castDevice.f5419g) && AbstractC0295a.m828e(this.f5421i, castDevice.f5421i) && AbstractC0295a.m828e(this.f5423k, castDevice.f5423k) && AbstractC0295a.m828e(this.f5422j, castDevice.f5422j)) {
            String str2 = this.f5424l;
            String str3 = castDevice.f5424l;
            if (AbstractC0295a.m828e(str2, str3) && (i3 = this.f5425m) == (i4 = castDevice.f5425m) && AbstractC0295a.m828e(this.f5426n, castDevice.f5426n) && this.f5427o == castDevice.f5427o && this.f5428p == castDevice.f5428p && AbstractC0295a.m828e(this.f5429q, castDevice.f5429q) && AbstractC0295a.m828e(Integer.valueOf(this.f5431s), Integer.valueOf(castDevice.f5431s)) && AbstractC0295a.m828e(this.f5432t, castDevice.f5432t) && AbstractC0295a.m828e(this.f5430r, castDevice.f5430r) && AbstractC0295a.m828e(str2, str3) && i3 == i4) {
                byte[] bArr = castDevice.f5433u;
                byte[] bArr2 = this.f5433u;
                if (((bArr2 == null && bArr == null) || Arrays.equals(bArr2, bArr)) && AbstractC0295a.m828e(this.f5434v, castDevice.f5434v) && this.f5435w == castDevice.f5435w && AbstractC0295a.m828e(m3072g(), castDevice.m3072g())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3071f(int i3) {
        return (this.f5427o & i3) == i3;
    }

    /* JADX INFO: renamed from: g */
    public final C0320z m3072g() {
        C0320z c0320z = this.f5436x;
        if (c0320z == null) {
            return (m3071f(32) || m3071f(64)) ? new C0320z(1, false, false) : c0320z;
        }
        return c0320z;
    }

    public final int hashCode() {
        String str = this.f5419g;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String str = this.f5422j;
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            if (length <= 2) {
                str = length == 2 ? "xx" : "x";
            } else {
                str = String.format(locale, "%c%d%c", Character.valueOf(str.charAt(0)), Integer.valueOf(length - 2), Character.valueOf(str.charAt(length - 1)));
            }
        }
        return "\"" + str + "\" (" + this.f5419g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3299V(parcel, 2, this.f5419g);
        AbstractC1303m.m3299V(parcel, 3, this.f5420h);
        AbstractC1303m.m3299V(parcel, 4, this.f5422j);
        AbstractC1303m.m3299V(parcel, 5, this.f5423k);
        AbstractC1303m.m3299V(parcel, 6, this.f5424l);
        AbstractC1303m.m3311d0(parcel, 7, 4);
        parcel.writeInt(this.f5425m);
        AbstractC1303m.m3302Y(parcel, 8, Collections.unmodifiableList(this.f5426n));
        AbstractC1303m.m3311d0(parcel, 9, 4);
        parcel.writeInt(this.f5427o);
        AbstractC1303m.m3311d0(parcel, 10, 4);
        parcel.writeInt(this.f5428p);
        AbstractC1303m.m3299V(parcel, 11, this.f5429q);
        AbstractC1303m.m3299V(parcel, 12, this.f5430r);
        AbstractC1303m.m3311d0(parcel, 13, 4);
        parcel.writeInt(this.f5431s);
        AbstractC1303m.m3299V(parcel, 14, this.f5432t);
        byte[] bArr = this.f5433u;
        if (bArr != null) {
            int iM3305a1 = AbstractC1303m.m3305a0(parcel, 15);
            parcel.writeByteArray(bArr);
            AbstractC1303m.m3309c0(parcel, iM3305a1);
        }
        AbstractC1303m.m3299V(parcel, 16, this.f5434v);
        AbstractC1303m.m3311d0(parcel, 17, 4);
        parcel.writeInt(this.f5435w ? 1 : 0);
        AbstractC1303m.m3298U(parcel, 18, m3072g(), i3);
        Integer num = this.f5437y;
        if (num != null) {
            AbstractC1303m.m3311d0(parcel, 19, 4);
            parcel.writeInt(num.intValue());
        }
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
