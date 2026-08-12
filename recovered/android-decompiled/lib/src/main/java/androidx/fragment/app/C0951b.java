package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p076a.C0787c;

/* JADX INFO: renamed from: androidx.fragment.app.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0951b implements Parcelable {
    public static final Parcelable.Creator<C0951b> CREATOR = new C0787c(6);

    /* JADX INFO: renamed from: g */
    public final int[] f4152g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f4153h;

    /* JADX INFO: renamed from: i */
    public final int[] f4154i;

    /* JADX INFO: renamed from: j */
    public final int[] f4155j;

    /* JADX INFO: renamed from: k */
    public final int f4156k;

    /* JADX INFO: renamed from: l */
    public final String f4157l;

    /* JADX INFO: renamed from: m */
    public final int f4158m;

    /* JADX INFO: renamed from: n */
    public final int f4159n;

    /* JADX INFO: renamed from: o */
    public final CharSequence f4160o;

    /* JADX INFO: renamed from: p */
    public final int f4161p;

    /* JADX INFO: renamed from: q */
    public final CharSequence f4162q;

    /* JADX INFO: renamed from: r */
    public final ArrayList f4163r;

    /* JADX INFO: renamed from: s */
    public final ArrayList f4164s;

    /* JADX INFO: renamed from: t */
    public final boolean f4165t;

    public C0951b(C0950a c0950a) {
        int size = c0950a.f4134a.size();
        this.f4152g = new int[size * 6];
        if (!c0950a.f4140g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f4153h = new ArrayList(size);
        this.f4154i = new int[size];
        this.f4155j = new int[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C0944J c0944j = (C0944J) c0950a.f4134a.get(i4);
            int i5 = i3 + 1;
            this.f4152g[i3] = c0944j.f4123a;
            ArrayList arrayList = this.f4153h;
            AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = c0944j.f4124b;
            arrayList.add(abstractComponentCallbacksC0963n != null ? abstractComponentCallbacksC0963n.f4230k : null);
            int[] iArr = this.f4152g;
            iArr[i5] = c0944j.f4125c ? 1 : 0;
            iArr[i3 + 2] = c0944j.f4126d;
            iArr[i3 + 3] = c0944j.f4127e;
            int i6 = i3 + 5;
            iArr[i3 + 4] = c0944j.f4128f;
            i3 += 6;
            iArr[i6] = c0944j.f4129g;
            this.f4154i[i4] = c0944j.f4130h.ordinal();
            this.f4155j[i4] = c0944j.f4131i.ordinal();
        }
        this.f4156k = c0950a.f4139f;
        this.f4157l = c0950a.f4141h;
        this.f4158m = c0950a.f4151r;
        this.f4159n = c0950a.f4142i;
        this.f4160o = c0950a.f4143j;
        this.f4161p = c0950a.f4144k;
        this.f4162q = c0950a.f4145l;
        this.f4163r = c0950a.f4146m;
        this.f4164s = c0950a.f4147n;
        this.f4165t = c0950a.f4148o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeIntArray(this.f4152g);
        parcel.writeStringList(this.f4153h);
        parcel.writeIntArray(this.f4154i);
        parcel.writeIntArray(this.f4155j);
        parcel.writeInt(this.f4156k);
        parcel.writeString(this.f4157l);
        parcel.writeInt(this.f4158m);
        parcel.writeInt(this.f4159n);
        TextUtils.writeToParcel(this.f4160o, parcel, 0);
        parcel.writeInt(this.f4161p);
        TextUtils.writeToParcel(this.f4162q, parcel, 0);
        parcel.writeStringList(this.f4163r);
        parcel.writeStringList(this.f4164s);
        parcel.writeInt(this.f4165t ? 1 : 0);
    }

    public C0951b(Parcel parcel) {
        this.f4152g = parcel.createIntArray();
        this.f4153h = parcel.createStringArrayList();
        this.f4154i = parcel.createIntArray();
        this.f4155j = parcel.createIntArray();
        this.f4156k = parcel.readInt();
        this.f4157l = parcel.readString();
        this.f4158m = parcel.readInt();
        this.f4159n = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f4160o = (CharSequence) creator.createFromParcel(parcel);
        this.f4161p = parcel.readInt();
        this.f4162q = (CharSequence) creator.createFromParcel(parcel);
        this.f4163r = parcel.createStringArrayList();
        this.f4164s = parcel.createStringArrayList();
        this.f4165t = parcel.readInt() != 0;
    }
}
