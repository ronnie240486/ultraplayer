package p073Z;

import android.media.MediaCodec;
import p009D0.C0106b;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: Z.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0767b {

    /* JADX INFO: renamed from: a */
    public byte[] f3132a;

    /* JADX INFO: renamed from: b */
    public byte[] f3133b;

    /* JADX INFO: renamed from: c */
    public int f3134c;

    /* JADX INFO: renamed from: d */
    public int[] f3135d;

    /* JADX INFO: renamed from: e */
    public int[] f3136e;

    /* JADX INFO: renamed from: f */
    public int f3137f;

    /* JADX INFO: renamed from: g */
    public int f3138g;

    /* JADX INFO: renamed from: h */
    public int f3139h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f3140i;

    /* JADX INFO: renamed from: j */
    public final C0106b f3141j;

    public C0767b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f3140i = cryptoInfo;
        this.f3141j = AbstractC0632A.f2454a >= 24 ? new C0106b(cryptoInfo) : null;
    }
}
