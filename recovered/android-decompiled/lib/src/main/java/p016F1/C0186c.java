package p016F1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import java.util.Collections;
import p007C0.C0101a;
import p013E1.C0134i;
import p019G1.AbstractC0230e;
import p019G1.C0226a;
import p019G1.C0231f;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: F1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0186c extends AbstractC0512a {
    public static final Parcelable.Creator<C0186c> CREATOR;

    /* JADX INFO: renamed from: w */
    public static final C0179E f436w = new C0179E(false);

    /* JADX INFO: renamed from: x */
    public static final C0180F f437x = new C0180F(0);

    /* JADX INFO: renamed from: y */
    public static final C0226a f438y;

    /* JADX INFO: renamed from: g */
    public final String f439g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f440h;

    /* JADX INFO: renamed from: i */
    public final boolean f441i;

    /* JADX INFO: renamed from: j */
    public final C0134i f442j;

    /* JADX INFO: renamed from: k */
    public final boolean f443k;

    /* JADX INFO: renamed from: l */
    public final C0226a f444l;

    /* JADX INFO: renamed from: m */
    public final boolean f445m;

    /* JADX INFO: renamed from: n */
    public final double f446n;

    /* JADX INFO: renamed from: o */
    public final boolean f447o;

    /* JADX INFO: renamed from: p */
    public final boolean f448p;

    /* JADX INFO: renamed from: q */
    public final boolean f449q;

    /* JADX INFO: renamed from: r */
    public final ArrayList f450r;

    /* JADX INFO: renamed from: s */
    public final boolean f451s;

    /* JADX INFO: renamed from: t */
    public final boolean f452t;

    /* JADX INFO: renamed from: u */
    public final C0179E f453u;

    /* JADX INFO: renamed from: v */
    public C0180F f454v;

    static {
        new C0231f(C0231f.f565O, C0231f.f566P, 10000L, null, AbstractC0230e.m724A("smallIconDrawableResId"), AbstractC0230e.m724A("stopLiveStreamDrawableResId"), AbstractC0230e.m724A("pauseDrawableResId"), AbstractC0230e.m724A("playDrawableResId"), AbstractC0230e.m724A("skipNextDrawableResId"), AbstractC0230e.m724A("skipPrevDrawableResId"), AbstractC0230e.m724A("forwardDrawableResId"), AbstractC0230e.m724A("forward10DrawableResId"), AbstractC0230e.m724A("forward30DrawableResId"), AbstractC0230e.m724A("rewindDrawableResId"), AbstractC0230e.m724A("rewind10DrawableResId"), AbstractC0230e.m724A("rewind30DrawableResId"), AbstractC0230e.m724A("disconnectDrawableResId"), AbstractC0230e.m724A("notificationImageSizeDimenResId"), AbstractC0230e.m724A("castingToDeviceStringResId"), AbstractC0230e.m724A("stopLiveStreamStringResId"), AbstractC0230e.m724A("pauseStringResId"), AbstractC0230e.m724A("playStringResId"), AbstractC0230e.m724A("skipNextStringResId"), AbstractC0230e.m724A("skipPrevStringResId"), AbstractC0230e.m724A("forwardStringResId"), AbstractC0230e.m724A("forward10StringResId"), AbstractC0230e.m724A("forward30StringResId"), AbstractC0230e.m724A("rewindStringResId"), AbstractC0230e.m724A("rewind10StringResId"), AbstractC0230e.m724A("rewind30StringResId"), AbstractC0230e.m724A("disconnectStringResId"), null, false, false);
        f438y = new C0226a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new C0101a(10);
    }

    public C0186c(String str, ArrayList arrayList, boolean z3, C0134i c0134i, boolean z4, C0226a c0226a, boolean z5, double d3, boolean z6, boolean z7, boolean z8, ArrayList arrayList2, boolean z9, boolean z10, C0179E c0179e, C0180F c0180f) {
        this.f439g = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.f440h = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f441i = z3;
        this.f442j = c0134i == null ? new C0134i() : c0134i;
        this.f443k = z4;
        this.f444l = c0226a;
        this.f445m = z5;
        this.f446n = d3;
        this.f447o = z6;
        this.f448p = z7;
        this.f449q = z8;
        this.f450r = arrayList2;
        this.f451s = z9;
        this.f452t = z10;
        this.f453u = c0179e;
        this.f454v = c0180f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3299V(parcel, 2, this.f439g);
        AbstractC1303m.m3300W(parcel, 3, Collections.unmodifiableList(this.f440h));
        AbstractC1303m.m3311d0(parcel, 4, 4);
        parcel.writeInt(this.f441i ? 1 : 0);
        AbstractC1303m.m3298U(parcel, 5, this.f442j, i3);
        AbstractC1303m.m3311d0(parcel, 6, 4);
        parcel.writeInt(this.f443k ? 1 : 0);
        AbstractC1303m.m3298U(parcel, 7, this.f444l, i3);
        AbstractC1303m.m3311d0(parcel, 8, 4);
        parcel.writeInt(this.f445m ? 1 : 0);
        AbstractC1303m.m3311d0(parcel, 9, 8);
        parcel.writeDouble(this.f446n);
        AbstractC1303m.m3311d0(parcel, 10, 4);
        parcel.writeInt(this.f447o ? 1 : 0);
        AbstractC1303m.m3311d0(parcel, 11, 4);
        parcel.writeInt(this.f448p ? 1 : 0);
        AbstractC1303m.m3311d0(parcel, 12, 4);
        parcel.writeInt(this.f449q ? 1 : 0);
        AbstractC1303m.m3300W(parcel, 13, Collections.unmodifiableList(this.f450r));
        AbstractC1303m.m3311d0(parcel, 14, 4);
        parcel.writeInt(this.f451s ? 1 : 0);
        AbstractC1303m.m3311d0(parcel, 15, 4);
        parcel.writeInt(0);
        AbstractC1303m.m3311d0(parcel, 16, 4);
        parcel.writeInt(this.f452t ? 1 : 0);
        AbstractC1303m.m3298U(parcel, 17, this.f453u, i3);
        AbstractC1303m.m3298U(parcel, 18, this.f454v, i3);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
