package p088d0;

import java.util.UUID;
import p064W.AbstractC0632A;
import p073Z.InterfaceC0766a;

/* JADX INFO: renamed from: d0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1395s implements InterfaceC0766a {

    /* JADX INFO: renamed from: c */
    public static final boolean f6192c;

    /* JADX INFO: renamed from: a */
    public final UUID f6193a;

    /* JADX INFO: renamed from: b */
    public final byte[] f6194b;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z3;
        if ("Amazon".equals(AbstractC0632A.f2456c)) {
            String str = AbstractC0632A.f2457d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        f6192c = z3;
    }

    public C1395s(UUID uuid, byte[] bArr) {
        this.f6193a = uuid;
        this.f6194b = bArr;
    }
}
