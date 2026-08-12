package p049Q1;

import android.os.Parcel;

/* JADX INFO: renamed from: Q1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0513b extends RuntimeException {
    public C0513b(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
