package p077a0;

import android.util.Base64;
import p055T.InterfaceC0572e0;
import p082b0.C1066g;
import p101g2.InterfaceC1587h;

/* JADX INFO: renamed from: a0.q */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0841q implements InterfaceC1587h {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3574g;

    @Override // p101g2.InterfaceC1587h
    public final Object get() {
        switch (this.f3574g) {
            case 0:
                return new C0836l();
            case 1:
                byte[] bArr = new byte[12];
                C1066g.f4843i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                throw new IllegalStateException();
            default:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    objInvoke.getClass();
                    return (InterfaceC0572e0) objInvoke;
                } catch (Exception e3) {
                    throw new IllegalStateException(e3);
                }
        }
    }
}
