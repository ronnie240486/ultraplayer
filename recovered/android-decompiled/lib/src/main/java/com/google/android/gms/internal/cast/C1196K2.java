package com.google.android.gms.internal.cast;

import p016F1.C0185b;
import p028J1.C0296b;
import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.K2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1196K2 implements InterfaceC1161C, InterfaceC1343w, InterfaceC1294j2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C1196K2 f5650a = new C1196K2();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static boolean m3177b(byte[] bArr, int i3) {
        int iM3210a;
        int i4 = 0;
        while (i4 < i3 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 >= i3) {
            iM3210a = 0;
            break;
        }
        while (true) {
            if (i4 >= i3) {
                iM3210a = 0;
                break;
            }
            int i5 = i4 + 1;
            iM3210a = bArr[i4];
            if (iM3210a < 0) {
                if (iM3210a >= -32) {
                    if (iM3210a >= -16) {
                        if (i5 < i3 - 2) {
                            int i6 = i4 + 2;
                            int i7 = bArr[i5];
                            if (i7 <= -65) {
                                if ((((i7 + 112) + (iM3210a << 28)) >> 30) == 0) {
                                    int i8 = i4 + 3;
                                    if (bArr[i6] <= -65) {
                                        i4 += 4;
                                        if (bArr[i8] > -65) {
                                        }
                                    }
                                }
                            }
                            iM3210a = -1;
                            break;
                        }
                        iM3210a = AbstractC1243W2.m3210a(bArr, i5, i3);
                        break;
                    }
                    if (i5 < i3 - 1) {
                        int i9 = i4 + 2;
                        char c = bArr[i5];
                        if (c <= -65 && ((iM3210a != -32 || c >= -96) && (iM3210a != -19 || c < -96))) {
                            i4 += 3;
                            if (bArr[i9] > -65) {
                            }
                        }
                        iM3210a = -1;
                        break;
                    }
                    iM3210a = AbstractC1243W2.m3210a(bArr, i5, i3);
                    break;
                }
                if (i5 < i3) {
                    if (iM3210a >= -62) {
                        i4 += 2;
                        if (bArr[i5] > -65) {
                        }
                    }
                    iM3210a = -1;
                    break;
                }
                break;
            }
            i4 = i5;
        }
        return iM3210a == 0;
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1343w
    /* JADX INFO: renamed from: a */
    public void mo3178a() {
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1161C
    /* JADX INFO: renamed from: a */
    public Object mo2827a() {
        C0296b c0296b = C1247X2.f5727n;
        C0296b c0296b2 = C0185b.f423k;
        AbstractC0491s.m1210b();
        C0185b c0185b = C0185b.f425m;
        AbstractC0491s.m1213e(c0185b);
        AbstractC0491s.m1210b();
        return c0185b.f430e.f439g;
    }
}
