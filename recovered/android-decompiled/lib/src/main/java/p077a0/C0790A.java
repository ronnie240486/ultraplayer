package p077a0;

import android.media.MediaFormat;
import p055T.C0583o;
import p137q0.InterfaceC2154o;
import p141r0.C2194k;
import p141r0.InterfaceC2184a;

/* JADX INFO: renamed from: a0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0790A implements InterfaceC2154o, InterfaceC2184a, InterfaceC0822d0 {

    /* JADX INFO: renamed from: g */
    public InterfaceC2154o f3201g;

    /* JADX INFO: renamed from: h */
    public InterfaceC2184a f3202h;

    /* JADX INFO: renamed from: i */
    public InterfaceC2154o f3203i;

    /* JADX INFO: renamed from: j */
    public InterfaceC2184a f3204j;

    @Override // p141r0.InterfaceC2184a
    /* JADX INFO: renamed from: a */
    public final void mo1901a() {
        InterfaceC2184a interfaceC2184a = this.f3204j;
        if (interfaceC2184a != null) {
            interfaceC2184a.mo1901a();
        }
        InterfaceC2184a interfaceC2184a2 = this.f3202h;
        if (interfaceC2184a2 != null) {
            interfaceC2184a2.mo1901a();
        }
    }

    @Override // p141r0.InterfaceC2184a
    /* JADX INFO: renamed from: b */
    public final void mo1902b(long j3, float[] fArr) {
        InterfaceC2184a interfaceC2184a = this.f3204j;
        if (interfaceC2184a != null) {
            interfaceC2184a.mo1902b(j3, fArr);
        }
        InterfaceC2184a interfaceC2184a2 = this.f3202h;
        if (interfaceC2184a2 != null) {
            interfaceC2184a2.mo1902b(j3, fArr);
        }
    }

    @Override // p077a0.InterfaceC0822d0
    /* JADX INFO: renamed from: c */
    public final void mo1903c(int i3, Object obj) {
        if (i3 == 7) {
            this.f3201g = (InterfaceC2154o) obj;
            return;
        }
        if (i3 == 8) {
            this.f3202h = (InterfaceC2184a) obj;
            return;
        }
        if (i3 != 10000) {
            return;
        }
        C2194k c2194k = (C2194k) obj;
        if (c2194k == null) {
            this.f3203i = null;
            this.f3204j = null;
        } else {
            this.f3203i = c2194k.getVideoFrameMetadataListener();
            this.f3204j = c2194k.getCameraMotionListener();
        }
    }

    @Override // p137q0.InterfaceC2154o
    /* JADX INFO: renamed from: d */
    public final void mo1904d(long j3, long j4, C0583o c0583o, MediaFormat mediaFormat) {
        long j5;
        long j6;
        C0583o c0583o2;
        MediaFormat mediaFormat2;
        InterfaceC2154o interfaceC2154o = this.f3203i;
        if (interfaceC2154o != null) {
            interfaceC2154o.mo1904d(j3, j4, c0583o, mediaFormat);
            mediaFormat2 = mediaFormat;
            c0583o2 = c0583o;
            j6 = j4;
            j5 = j3;
        } else {
            j5 = j3;
            j6 = j4;
            c0583o2 = c0583o;
            mediaFormat2 = mediaFormat;
        }
        InterfaceC2154o interfaceC2154o2 = this.f3201g;
        if (interfaceC2154o2 != null) {
            interfaceC2154o2.mo1904d(j5, j6, c0583o2, mediaFormat2);
        }
    }
}
