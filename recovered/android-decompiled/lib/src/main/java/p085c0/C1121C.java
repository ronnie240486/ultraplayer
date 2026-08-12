package p085c0;

import java.nio.ByteBuffer;
import p019G1.AbstractC0230e;

/* JADX INFO: renamed from: c0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C1121C {

    /* JADX INFO: renamed from: d */
    public static final byte[] f5193d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f5194e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    public ByteBuffer f5195a;

    /* JADX INFO: renamed from: b */
    public int f5196b;

    /* JADX INFO: renamed from: c */
    public int f5197c;

    /* JADX INFO: renamed from: a */
    public static void m2999a(ByteBuffer byteBuffer, long j3, int i3, int i4, boolean z3) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z3 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j3);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i3);
        byteBuffer.putInt(0);
        long j4 = i4;
        AbstractC0230e.m728f((j4 >> 8) == 0, "out of range: %s", j4);
        byteBuffer.put((byte) j4);
    }
}
