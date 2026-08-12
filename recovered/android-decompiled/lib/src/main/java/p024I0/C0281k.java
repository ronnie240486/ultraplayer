package p024I0;

import android.os.Parcel;
import android.os.Parcelable;
import p064W.C0651s;

/* JADX INFO: renamed from: I0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0281k extends AbstractC0273c {
    public static final Parcelable.Creator<C0281k> CREATOR = new C0271a(4);

    /* JADX INFO: renamed from: g */
    public final long f763g;

    /* JADX INFO: renamed from: h */
    public final long f764h;

    public C0281k(long j3, long j4) {
        this.f763g = j3;
        this.f764h = j4;
    }

    /* JADX INFO: renamed from: d */
    public static long m817d(long j3, C0651s c0651s) {
        long jM1687u = c0651s.m1687u();
        if ((128 & jM1687u) != 0) {
            return 8589934591L & ((((jM1687u & 1) << 32) | c0651s.m1689w()) + j3);
        }
        return -9223372036854775807L;
    }

    @Override // p024I0.AbstractC0273c
    public final String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f763g + ", playbackPositionUs= " + this.f764h + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f763g);
        parcel.writeLong(this.f764h);
    }
}
