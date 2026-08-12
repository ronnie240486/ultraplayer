package p036M0;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import p064W.AbstractC0646n;
import p145s0.C2225D;

/* JADX INFO: renamed from: M0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0385v {

    /* JADX INFO: renamed from: a */
    public final boolean f1314a;

    /* JADX INFO: renamed from: b */
    public final String f1315b;

    /* JADX INFO: renamed from: c */
    public final C2225D f1316c;

    /* JADX INFO: renamed from: d */
    public final int f1317d;

    /* JADX INFO: renamed from: e */
    public final byte[] f1318e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0020 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C0385v(boolean z3, String str, int i3, byte[] bArr, int i4, int i5, byte[] bArr2) {
        int i6 = 2;
        byte b3 = 0;
        AbstractC0646n.m1625c((i3 == 0) ^ (bArr2 == null));
        this.f1314a = z3;
        this.f1315b = str;
        this.f1317d = i3;
        this.f1318e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b3 = -1;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        b3 = -1;
                    } else {
                        b3 = 1;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        b3 = -1;
                    } else {
                        b3 = 2;
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        b3 = -1;
                    } else {
                        b3 = 3;
                    }
                    break;
                default:
                    b3 = -1;
                    break;
            }
            switch (b3) {
                case 0:
                case 1:
                    break;
                default:
                    AbstractC0646n.m1647y("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                case 2:
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    i6 = 1;
                    break;
            }
        } else {
            i6 = 1;
        }
        this.f1316c = new C2225D(i6, i4, i5, bArr);
    }
}
