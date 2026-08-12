package com.google.android.gms.internal.cast;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.a2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1258a2 extends IOException {
    public C1258a2(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }

    public C1258a2(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
