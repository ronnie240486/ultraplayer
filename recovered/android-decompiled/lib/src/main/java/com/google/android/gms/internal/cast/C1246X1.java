package com.google.android.gms.internal.cast;

import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.X1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1246X1 extends C1250Y1 {

    /* JADX INFO: renamed from: j */
    public final int f5726j;

    public C1246X1(byte[] bArr) {
        super(bArr);
        C1250Y1.m3218i(bArr.length);
        this.f5726j = 47;
    }

    @Override // com.google.android.gms.internal.cast.C1250Y1
    /* JADX INFO: renamed from: e */
    public final byte mo3213e(int i3) {
        int i4 = this.f5726j;
        if (((i4 - (i3 + 1)) | i3) >= 0) {
            return this.f5745h[i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0462h.m1165e(i3, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i3 + ", " + i4);
    }

    @Override // com.google.android.gms.internal.cast.C1250Y1
    /* JADX INFO: renamed from: g */
    public final byte mo3214g(int i3) {
        return this.f5745h[i3];
    }

    @Override // com.google.android.gms.internal.cast.C1250Y1
    /* JADX INFO: renamed from: h */
    public final int mo3215h() {
        return this.f5726j;
    }
}
