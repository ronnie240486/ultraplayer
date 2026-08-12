package androidx.emoji2.text;

import java.nio.ByteBuffer;
import p023I.C0269a;
import p023I.C0270b;
import p053S0.C0536b;

/* JADX INFO: renamed from: androidx.emoji2.text.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0931u {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f4038d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f4039a;

    /* JADX INFO: renamed from: b */
    public final C0536b f4040b;

    /* JADX INFO: renamed from: c */
    public volatile int f4041c = 0;

    public C0931u(C0536b c0536b, int i3) {
        this.f4040b = c0536b;
        this.f4039a = i3;
    }

    /* JADX INFO: renamed from: a */
    public final int m2426a(int i3) {
        C0269a c0269aM2427b = m2427b();
        int iM3a = c0269aM2427b.m3a(16);
        if (iM3a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c0269aM2427b.f5d;
        int i4 = iM3a + c0269aM2427b.f2a;
        return byteBuffer.getInt((i3 * 4) + byteBuffer.getInt(i4) + i4 + 4);
    }

    /* JADX INFO: renamed from: b */
    public final C0269a m2427b() {
        ThreadLocal threadLocal = f4038d;
        C0269a c0269a = (C0269a) threadLocal.get();
        if (c0269a == null) {
            c0269a = new C0269a();
            threadLocal.set(c0269a);
        }
        C0270b c0270b = (C0270b) this.f4040b.f1867g;
        int iM3a = c0270b.m3a(6);
        if (iM3a != 0) {
            int i3 = iM3a + c0270b.f2a;
            int i4 = (this.f4039a * 4) + ((ByteBuffer) c0270b.f5d).getInt(i3) + i3 + 4;
            int i5 = ((ByteBuffer) c0270b.f5d).getInt(i4) + i4;
            ByteBuffer byteBuffer = (ByteBuffer) c0270b.f5d;
            c0269a.f5d = byteBuffer;
            if (byteBuffer != null) {
                c0269a.f2a = i5;
                int i6 = i5 - byteBuffer.getInt(i5);
                c0269a.f3b = i6;
                c0269a.f4c = ((ByteBuffer) c0269a.f5d).getShort(i6);
                return c0269a;
            }
            c0269a.f2a = 0;
            c0269a.f3b = 0;
            c0269a.f4c = 0;
        }
        return c0269a;
    }

    public final String toString() {
        int i3;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0269a c0269aM2427b = m2427b();
        int iM3a = c0269aM2427b.m3a(4);
        sb.append(Integer.toHexString(iM3a != 0 ? ((ByteBuffer) c0269aM2427b.f5d).getInt(iM3a + c0269aM2427b.f2a) : 0));
        sb.append(", codepoints:");
        C0269a c0269aM2427b2 = m2427b();
        int iM3a2 = c0269aM2427b2.m3a(16);
        if (iM3a2 != 0) {
            int i4 = iM3a2 + c0269aM2427b2.f2a;
            i3 = ((ByteBuffer) c0269aM2427b2.f5d).getInt(((ByteBuffer) c0269aM2427b2.f5d).getInt(i4) + i4);
        } else {
            i3 = 0;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append(Integer.toHexString(m2426a(i5)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
