package p103h0;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.cast.C1323r;
import p064W.AbstractC0632A;
import p137q0.C2143d;

/* JADX INFO: renamed from: h0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1593b implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2143d f7207b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1603l f7208c;

    public /* synthetic */ C1593b(InterfaceC1603l interfaceC1603l, C2143d c2143d, int i3) {
        this.f7206a = i3;
        this.f7208c = interfaceC1603l;
        this.f7207b = c2143d;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j3, long j4) {
        switch (this.f7206a) {
            case 0:
                C1595d c1595d = (C1595d) this.f7208c;
                C2143d c2143d = this.f7207b;
                c1595d.getClass();
                c2143d.getClass();
                if (AbstractC0632A.f2454a >= 30) {
                    c2143d.m4715a(j3);
                } else {
                    Handler handler = c2143d.f9217g;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j3 >> 32), (int) j3));
                }
                break;
            default:
                C1323r c1323r = (C1323r) this.f7208c;
                C2143d c2143d2 = this.f7207b;
                c1323r.getClass();
                c2143d2.getClass();
                if (AbstractC0632A.f2454a >= 30) {
                    c2143d2.m4715a(j3);
                } else {
                    Handler handler2 = c2143d2.f9217g;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j3 >> 32), (int) j3));
                }
                break;
        }
    }
}
