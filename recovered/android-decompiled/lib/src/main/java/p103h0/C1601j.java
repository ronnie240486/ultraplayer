package p103h0;

import p064W.AbstractC0632A;

/* JADX INFO: renamed from: h0.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1601j implements InterfaceC1615x {

    /* JADX INFO: renamed from: g */
    public static final C1601j f7249g = new C1601j();

    /* JADX INFO: renamed from: h */
    public static final C1601j f7250h = new C1601j();

    @Override // p103h0.InterfaceC1615x
    /* JADX INFO: renamed from: a */
    public int mo544a(Object obj) {
        String str = ((C1606o) obj).f7252a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (AbstractC0632A.f2454a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
