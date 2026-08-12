package com.google.android.gms.internal.cast;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.m2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1306m2 {

    /* JADX INFO: renamed from: a */
    public static final Charset f5927a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f5928b;

    static {
        Charset.forName("US-ASCII");
        f5927a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f5928b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
