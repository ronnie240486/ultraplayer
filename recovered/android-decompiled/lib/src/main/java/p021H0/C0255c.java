package p021H0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p007C0.C0101a;
import p055T.C0541D;
import p055T.C0583o;
import p055T.InterfaceC0543F;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: H0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0255c implements InterfaceC0543F {
    public static final Parcelable.Creator<C0255c> CREATOR = new C0101a(27);

    /* JADX INFO: renamed from: g */
    public final ArrayList f659g;

    public C0255c(ArrayList arrayList) {
        this.f659g = arrayList;
        boolean z3 = false;
        if (!arrayList.isEmpty()) {
            long j3 = ((C0254b) arrayList.get(0)).f657h;
            for (int i3 = 1; i3 < arrayList.size(); i3++) {
                if (((C0254b) arrayList.get(i3)).f656g < j3) {
                    z3 = true;
                    break;
                }
                j3 = ((C0254b) arrayList.get(i3)).f657h;
            }
        }
        AbstractC0646n.m1625c(!z3);
    }

    @Override // p055T.InterfaceC0543F
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte[] mo497a() {
        return null;
    }

    @Override // p055T.InterfaceC0543F
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0583o mo498b() {
        return null;
    }

    @Override // p055T.InterfaceC0543F
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo499c(C0541D c0541d) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0255c.class != obj.getClass()) {
            return false;
        }
        return this.f659g.equals(((C0255c) obj).f659g);
    }

    public final int hashCode() {
        return this.f659g.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f659g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeList(this.f659g);
    }
}
