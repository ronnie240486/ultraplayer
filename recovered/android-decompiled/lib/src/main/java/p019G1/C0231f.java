package p019G1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.AbstractC1181H;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.google.android.gms.internal.cast.C1173F;
import com.google.android.gms.internal.cast.C1197L;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p007C0.C0101a;
import p045P0.AbstractC0462h;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: G1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0231f extends AbstractC0512a {
    public static final Parcelable.Creator<C0231f> CREATOR;

    /* JADX INFO: renamed from: O */
    public static final C1197L f565O;

    /* JADX INFO: renamed from: P */
    public static final int[] f566P;

    /* JADX INFO: renamed from: A */
    public final int f567A;

    /* JADX INFO: renamed from: B */
    public final int f568B;

    /* JADX INFO: renamed from: C */
    public final int f569C;

    /* JADX INFO: renamed from: D */
    public final int f570D;

    /* JADX INFO: renamed from: E */
    public final int f571E;

    /* JADX INFO: renamed from: F */
    public final int f572F;

    /* JADX INFO: renamed from: G */
    public final int f573G;

    /* JADX INFO: renamed from: H */
    public final int f574H;

    /* JADX INFO: renamed from: I */
    public final int f575I;

    /* JADX INFO: renamed from: J */
    public final int f576J;

    /* JADX INFO: renamed from: K */
    public final int f577K;

    /* JADX INFO: renamed from: L */
    public final C0247v f578L;

    /* JADX INFO: renamed from: M */
    public final boolean f579M;

    /* JADX INFO: renamed from: N */
    public final boolean f580N;

    /* JADX INFO: renamed from: g */
    public final ArrayList f581g;

    /* JADX INFO: renamed from: h */
    public final int[] f582h;

    /* JADX INFO: renamed from: i */
    public final long f583i;

    /* JADX INFO: renamed from: j */
    public final String f584j;

    /* JADX INFO: renamed from: k */
    public final int f585k;

    /* JADX INFO: renamed from: l */
    public final int f586l;

    /* JADX INFO: renamed from: m */
    public final int f587m;

    /* JADX INFO: renamed from: n */
    public final int f588n;

    /* JADX INFO: renamed from: o */
    public final int f589o;

    /* JADX INFO: renamed from: p */
    public final int f590p;

    /* JADX INFO: renamed from: q */
    public final int f591q;

    /* JADX INFO: renamed from: r */
    public final int f592r;

    /* JADX INFO: renamed from: s */
    public final int f593s;

    /* JADX INFO: renamed from: t */
    public final int f594t;

    /* JADX INFO: renamed from: u */
    public final int f595u;

    /* JADX INFO: renamed from: v */
    public final int f596v;

    /* JADX INFO: renamed from: w */
    public final int f597w;

    /* JADX INFO: renamed from: x */
    public final int f598x;

    /* JADX INFO: renamed from: y */
    public final int f599y;

    /* JADX INFO: renamed from: z */
    public final int f600z;

    static {
        C1173F c1173f = AbstractC1181H.f5634h;
        Object[] objArr = {MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING};
        for (int i3 = 0; i3 < 2; i3++) {
            if (objArr[i3] == null) {
                throw new NullPointerException(AbstractC0462h.m1165e(i3, "at index "));
            }
        }
        f565O = AbstractC1181H.m3142k(2, objArr);
        f566P = new int[]{0, 1};
        CREATOR = new C0101a(23);
    }

    public C0231f(List list, int[] iArr, long j3, String str, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, IBinder iBinder, boolean z3, boolean z4) {
        C0247v c0247v;
        this.f581g = new ArrayList(list);
        this.f582h = Arrays.copyOf(iArr, iArr.length);
        this.f583i = j3;
        this.f584j = str;
        this.f585k = i3;
        this.f586l = i4;
        this.f587m = i5;
        this.f588n = i6;
        this.f589o = i7;
        this.f590p = i8;
        this.f591q = i9;
        this.f592r = i10;
        this.f593s = i11;
        this.f594t = i12;
        this.f595u = i13;
        this.f596v = i14;
        this.f597w = i15;
        this.f598x = i16;
        this.f599y = i17;
        this.f600z = i18;
        this.f567A = i19;
        this.f568B = i20;
        this.f569C = i21;
        this.f570D = i22;
        this.f571E = i23;
        this.f572F = i24;
        this.f573G = i25;
        this.f574H = i26;
        this.f575I = i27;
        this.f576J = i28;
        this.f577K = i29;
        this.f579M = z3;
        this.f580N = z4;
        if (iBinder == null) {
            c0247v = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            c0247v = iInterfaceQueryLocalInterface instanceof C0247v ? (C0247v) iInterfaceQueryLocalInterface : new C0247v(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 2);
        }
        this.f578L = c0247v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3300W(parcel, 2, this.f581g);
        int[] iArr = this.f582h;
        AbstractC1303m.m3296S(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        AbstractC1303m.m3311d0(parcel, 4, 8);
        parcel.writeLong(this.f583i);
        AbstractC1303m.m3299V(parcel, 5, this.f584j);
        AbstractC1303m.m3311d0(parcel, 6, 4);
        parcel.writeInt(this.f585k);
        AbstractC1303m.m3311d0(parcel, 7, 4);
        parcel.writeInt(this.f586l);
        AbstractC1303m.m3311d0(parcel, 8, 4);
        parcel.writeInt(this.f587m);
        AbstractC1303m.m3311d0(parcel, 9, 4);
        parcel.writeInt(this.f588n);
        AbstractC1303m.m3311d0(parcel, 10, 4);
        parcel.writeInt(this.f589o);
        AbstractC1303m.m3311d0(parcel, 11, 4);
        parcel.writeInt(this.f590p);
        AbstractC1303m.m3311d0(parcel, 12, 4);
        parcel.writeInt(this.f591q);
        AbstractC1303m.m3311d0(parcel, 13, 4);
        parcel.writeInt(this.f592r);
        AbstractC1303m.m3311d0(parcel, 14, 4);
        parcel.writeInt(this.f593s);
        AbstractC1303m.m3311d0(parcel, 15, 4);
        parcel.writeInt(this.f594t);
        AbstractC1303m.m3311d0(parcel, 16, 4);
        parcel.writeInt(this.f595u);
        AbstractC1303m.m3311d0(parcel, 17, 4);
        parcel.writeInt(this.f596v);
        AbstractC1303m.m3311d0(parcel, 18, 4);
        parcel.writeInt(this.f597w);
        AbstractC1303m.m3311d0(parcel, 19, 4);
        parcel.writeInt(this.f598x);
        AbstractC1303m.m3311d0(parcel, 20, 4);
        parcel.writeInt(this.f599y);
        AbstractC1303m.m3311d0(parcel, 21, 4);
        parcel.writeInt(this.f600z);
        AbstractC1303m.m3311d0(parcel, 22, 4);
        parcel.writeInt(this.f567A);
        AbstractC1303m.m3311d0(parcel, 23, 4);
        parcel.writeInt(this.f568B);
        AbstractC1303m.m3311d0(parcel, 24, 4);
        parcel.writeInt(this.f569C);
        AbstractC1303m.m3311d0(parcel, 25, 4);
        parcel.writeInt(this.f570D);
        AbstractC1303m.m3311d0(parcel, 26, 4);
        parcel.writeInt(this.f571E);
        AbstractC1303m.m3311d0(parcel, 27, 4);
        parcel.writeInt(this.f572F);
        AbstractC1303m.m3311d0(parcel, 28, 4);
        parcel.writeInt(this.f573G);
        AbstractC1303m.m3311d0(parcel, 29, 4);
        parcel.writeInt(this.f574H);
        AbstractC1303m.m3311d0(parcel, 30, 4);
        parcel.writeInt(this.f575I);
        AbstractC1303m.m3311d0(parcel, 31, 4);
        parcel.writeInt(this.f576J);
        AbstractC1303m.m3311d0(parcel, 32, 4);
        parcel.writeInt(this.f577K);
        C0247v c0247v = this.f578L;
        AbstractC1303m.m3295R(parcel, 33, c0247v == null ? null : c0247v.f3189c);
        AbstractC1303m.m3311d0(parcel, 34, 4);
        parcel.writeInt(this.f579M ? 1 : 0);
        AbstractC1303m.m3311d0(parcel, 35, 4);
        parcel.writeInt(this.f580N ? 1 : 0);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
