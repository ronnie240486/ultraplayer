package p103h0;

import android.media.MediaCodec;
import p064W.AbstractC0632A;
import p073Z.AbstractC0769d;

/* JADX INFO: renamed from: h0.n */
/* JADX INFO: loaded from: classes.dex */
public class C1605n extends AbstractC0769d {

    /* JADX INFO: renamed from: g */
    public final int f7251g;

    public C1605n(IllegalStateException illegalStateException, C1606o c1606o) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(c1606o == null ? null : c1606o.f7252a);
        super(sb.toString(), illegalStateException);
        boolean z3 = illegalStateException instanceof MediaCodec.CodecException;
        this.f7251g = AbstractC0632A.f2454a >= 23 ? z3 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : AbstractC0632A.m1603v(z3 ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null);
    }
}
