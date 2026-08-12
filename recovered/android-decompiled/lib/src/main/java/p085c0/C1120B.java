package p085c0;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.C0858A;
import androidx.activity.RunnableC0892b;
import com.zuxoplayer.app.PlayerActivity;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p000A.C0031d;
import p003B.AbstractC0081c;
import p009D0.C0106b;
import p011E.C0111d;
import p045P0.AbstractC0462h;
import p046P1.C0475c;
import p055T.AbstractC0545H;
import p055T.C0548K;
import p055T.C0567c;
import p055T.C0569d;
import p055T.C0582n;
import p055T.C0583o;
import p058U.C0606f;
import p058U.C0607g;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0653u;
import p073Z.C0771f;
import p077a0.C0793D;
import p077a0.C0829h;
import p077a0.C0830h0;
import p077a0.C0831i;
import p077a0.C0839o;
import p077a0.InterfaceC0801L;
import p077a0.SurfaceHolderCallbackC0850z;
import p082b0.C1071l;
import p088d0.InterfaceC1384h;
import p103h0.AbstractC1609r;
import p103h0.AbstractC1616y;
import p103h0.C1600i;
import p103h0.C1601j;
import p103h0.C1606o;
import p103h0.C1611t;
import p103h0.InterfaceC1602k;
import p103h0.InterfaceC1603l;
import p105h2.AbstractC1676G;
import p105h2.C1692X;
import p119l2.EnumC1991a;

/* JADX INFO: renamed from: c0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1120B extends AbstractC1609r implements InterfaceC0801L {

    /* JADX INFO: renamed from: I0 */
    public final Context f5179I0;

    /* JADX INFO: renamed from: J0 */
    public final C1133i f5180J0;

    /* JADX INFO: renamed from: K0 */
    public final C1150z f5181K0;

    /* JADX INFO: renamed from: L0 */
    public final C0858A f5182L0;

    /* JADX INFO: renamed from: M0 */
    public int f5183M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f5184N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f5185O0;

    /* JADX INFO: renamed from: P0 */
    public C0583o f5186P0;

    /* JADX INFO: renamed from: Q0 */
    public C0583o f5187Q0;

    /* JADX INFO: renamed from: R0 */
    public long f5188R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f5189S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f5190T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f5191U0;

    /* JADX INFO: renamed from: V0 */
    public int f5192V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1120B(PlayerActivity playerActivity, InterfaceC1602k interfaceC1602k, Handler handler, SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z, C1150z c1150z) {
        super(1, interfaceC1602k, 44100.0f);
        C0858A c0858a = AbstractC0632A.f2454a >= 35 ? new C0858A(23) : null;
        this.f5179I0 = playerActivity.getApplicationContext();
        this.f5181K0 = c1150z;
        this.f5182L0 = c0858a;
        this.f5192V0 = -1000;
        this.f5180J0 = new C1133i(handler, surfaceHolderCallbackC0850z, 0);
        c1150z.f5394r = new C0031d(29, this);
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: C */
    public final C0831i mo2980C(C1606o c1606o, C0583o c0583o, C0583o c0583o2) {
        C0831i c0831iM3938b = c1606o.m3938b(c0583o, c0583o2);
        boolean z3 = this.f7288K == null && mo2994q0(c0583o2);
        int i3 = c0831iM3938b.f3523e;
        if (z3) {
            i3 |= 32768;
        }
        if (m2997w0(c1606o, c0583o2) > this.f5183M0) {
            i3 |= 64;
        }
        int i4 = i3;
        return new C0831i(c1606o.f7252a, c0583o, c0583o2, i4 != 0 ? 0 : c0831iM3938b.f3522d, i4);
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: N */
    public final float mo2981N(float f, C0583o[] c0583oArr) {
        int iMax = -1;
        for (C0583o c0583o : c0583oArr) {
            int i3 = c0583o.f2131D;
            if (i3 != -1) {
                iMax = Math.max(iMax, i3);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: O */
    public final ArrayList mo2982O(C1601j c1601j, C0583o c0583o, boolean z3) {
        C1692X c1692xM3987g;
        if (c0583o.f2154n == null) {
            c1692xM3987g = C1692X.f7629k;
        } else if (this.f5181K0.m3054i(c0583o) != 0) {
            List listM3985e = AbstractC1616y.m3985e("audio/raw", false, false);
            C1606o c1606o = listM3985e.isEmpty() ? null : (C1606o) listM3985e.get(0);
            if (c1606o != null) {
                c1692xM3987g = AbstractC1676G.m4120r(c1606o);
            } else {
                c1692xM3987g = AbstractC1616y.m3987g(c1601j, c0583o, z3, false);
            }
        } else {
            c1692xM3987g = AbstractC1616y.m3987g(c1601j, c0583o, z3, false);
        }
        HashMap map = AbstractC1616y.f7337a;
        ArrayList arrayList = new ArrayList(c1692xM3987g);
        Collections.sort(arrayList, new C1611t(new C0111d(19, c0583o)));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: P */
    public final C0475c mo2983P(C1606o c1606o, C0583o c0583o, MediaCrypto mediaCrypto, float f) {
        boolean z3;
        C0583o[] c0583oArr = this.f3486p;
        c0583oArr.getClass();
        int iM2997w0 = m2997w0(c1606o, c0583o);
        if (c0583oArr.length != 1) {
            for (C0583o c0583o2 : c0583oArr) {
                if (c1606o.m3938b(c0583o, c0583o2).f3522d != 0) {
                    iM2997w0 = Math.max(iM2997w0, m2997w0(c1606o, c0583o2));
                }
            }
        }
        this.f5183M0 = iM2997w0;
        int i3 = AbstractC0632A.f2454a;
        String str = c1606o.f7252a;
        if (i3 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(AbstractC0632A.f2456c)) {
            String str2 = AbstractC0632A.f2455b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        this.f5184N0 = z3;
        this.f5185O0 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        int i4 = this.f5183M0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", c1606o.f7254c);
        mediaFormat.setInteger("channel-count", c0583o.f2130C);
        int i5 = c0583o.f2131D;
        mediaFormat.setInteger("sample-rate", i5);
        AbstractC0646n.m1646x(mediaFormat, c0583o.f2157q);
        AbstractC0646n.m1642t(mediaFormat, "max-input-size", i4);
        if (i3 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                if (i3 == 23) {
                    String str3 = AbstractC0632A.f2457d;
                    if (!"ZTE B2017G".equals(str3) && !"AXON 7 mini".equals(str3)) {
                        mediaFormat.setFloat("operating-rate", f);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f);
                }
            }
        }
        String str4 = c0583o.f2154n;
        if (i3 <= 28 && "audio/ac4".equals(str4)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i3 >= 24) {
            C0582n c0582n = new C0582n();
            c0582n.f2114m = AbstractC0545H.m1364l("audio/raw");
            c0582n.f2092B = c0583o.f2130C;
            c0582n.f2093C = i5;
            c0582n.f2094D = 4;
            if (this.f5181K0.m3054i(new C0583o(c0582n)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i3 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i3 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f5192V0));
        }
        this.f5187Q0 = (!"audio/raw".equals(c1606o.f7253b) || "audio/raw".equals(str4)) ? null : c0583o;
        return new C0475c(c1606o, mediaFormat, c0583o, null, mediaCrypto, this.f5182L0);
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: Q */
    public final void mo2984Q(C0771f c0771f) {
        C0583o c0583o;
        C1144t c1144t;
        if (AbstractC0632A.f2454a < 29 || (c0583o = c0771f.f3142i) == null || !Objects.equals(c0583o.f2154n, "audio/opus") || !this.f7316m0) {
            return;
        }
        ByteBuffer byteBuffer = c0771f.f3147n;
        byteBuffer.getClass();
        C0583o c0583o2 = c0771f.f3142i;
        c0583o2.getClass();
        if (byteBuffer.remaining() == 8) {
            int i3 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            C1150z c1150z = this.f5181K0;
            AudioTrack audioTrack = c1150z.f5398v;
            if (audioTrack == null || !C1150z.m3045p(audioTrack) || (c1144t = c1150z.f5396t) == null || !c1144t.f5326k) {
                return;
            }
            c1150z.f5398v.setOffloadDelayPadding(c0583o2.f2133F, i3);
        }
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: V */
    public final void mo2985V(Exception exc) {
        AbstractC0646n.m1636n("MediaCodecAudioRenderer", "Audio codec error", exc);
        C1133i c1133i = this.f5180J0;
        Handler handler = c1133i.f5252b;
        if (handler != null) {
            handler.post(new RunnableC1131g(c1133i, exc, 3));
        }
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: W */
    public final void mo2986W(long j3, long j4, String str) {
        C1133i c1133i = this.f5180J0;
        Handler handler = c1133i.f5252b;
        if (handler != null) {
            handler.post(new RunnableC1131g(c1133i, str, j3, j4));
        }
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: X */
    public final void mo2987X(String str) {
        C1133i c1133i = this.f5180J0;
        Handler handler = c1133i.f5252b;
        if (handler != null) {
            handler.post(new RunnableC1131g(c1133i, str, 7));
        }
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: Y */
    public final C0831i mo2988Y(C0106b c0106b) {
        C0583o c0583o = (C0583o) c0106b.f141i;
        c0583o.getClass();
        this.f5186P0 = c0583o;
        C0831i c0831iMo2988Y = super.mo2988Y(c0106b);
        C1133i c1133i = this.f5180J0;
        Handler handler = c1133i.f5252b;
        if (handler != null) {
            handler.post(new RunnableC1131g(c1133i, c0583o, c0831iMo2988Y));
        }
        return c0831iMo2988Y;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0104 A[Catch: k -> 0x0102, TryCatch #0 {k -> 0x0102, blocks: (B:42:0x00d9, B:45:0x00e1, B:47:0x00e5, B:49:0x00ee, B:53:0x00fc, B:56:0x0104, B:60:0x010b, B:61:0x0110), top: B:65:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:59:0x010a  */
    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: Z */
    public final void mo2989Z(C0583o c0583o, MediaFormat mediaFormat) throws C0839o {
        int iM1605x;
        int i3;
        C0583o c0583o2 = this.f5187Q0;
        boolean z3 = true;
        int[] iArr = null;
        if (c0583o2 != null) {
            c0583o = c0583o2;
        } else if (this.f7294Q != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(c0583o.f2154n)) {
                iM1605x = c0583o.f2132E;
            } else if (AbstractC0632A.f2454a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iM1605x = mediaFormat.containsKey("v-bits-per-sample") ? AbstractC0632A.m1605x(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iM1605x = mediaFormat.getInteger("pcm-encoding");
            }
            C0582n c0582n = new C0582n();
            c0582n.f2114m = AbstractC0545H.m1364l("audio/raw");
            c0582n.f2094D = iM1605x;
            c0582n.f2095E = c0583o.f2133F;
            c0582n.f2096F = c0583o.f2134G;
            c0582n.f2112k = c0583o.f2152l;
            c0582n.f2102a = c0583o.f2141a;
            c0582n.f2103b = c0583o.f2142b;
            c0582n.f2104c = AbstractC1676G.m4117n(c0583o.f2143c);
            c0582n.f2105d = c0583o.f2144d;
            c0582n.f2106e = c0583o.f2145e;
            c0582n.f2107f = c0583o.f2146f;
            c0582n.f2092B = mediaFormat.getInteger("channel-count");
            c0582n.f2093C = mediaFormat.getInteger("sample-rate");
            C0583o c0583o3 = new C0583o(c0582n);
            boolean z4 = this.f5184N0;
            int i4 = c0583o3.f2130C;
            if (z4 && i4 == 6 && (i3 = c0583o.f2130C) < 6) {
                iArr = new int[i3];
                for (int i5 = 0; i5 < i3; i5++) {
                    iArr[i5] = i5;
                }
            } else if (this.f5185O0) {
                if (i4 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i4 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i4 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i4 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i4 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            c0583o = c0583o3;
        }
        try {
            int i6 = AbstractC0632A.f2454a;
            C1150z c1150z = this.f5181K0;
            if (i6 >= 29) {
                if (this.f7316m0) {
                    C0830h0 c0830h0 = this.f3480j;
                    c0830h0.getClass();
                    if (c0830h0.f3517a != 0) {
                        C0830h0 c0830h1 = this.f3480j;
                        c0830h1.getClass();
                        int i7 = c0830h1.f3517a;
                        c1150z.getClass();
                        if (i6 < 29) {
                            z3 = false;
                        }
                        AbstractC0646n.m1630h(z3);
                        c1150z.f5386j = i7;
                    } else {
                        c1150z.getClass();
                        if (i6 >= 29) {
                            z3 = false;
                        }
                        AbstractC0646n.m1630h(z3);
                        c1150z.f5386j = 0;
                    }
                } else {
                    c1150z.getClass();
                    if (i6 >= 29) {
                        z3 = false;
                    }
                    AbstractC0646n.m1630h(z3);
                    c1150z.f5386j = 0;
                }
            }
            c1150z.m3049d(c0583o, iArr);
        } catch (C1135k e3) {
            throw m2079e(e3, e3.f5260g, false, 5001);
        }
    }

    @Override // p077a0.InterfaceC0801L
    /* JADX INFO: renamed from: a */
    public final boolean mo2000a() {
        boolean z3 = this.f5191U0;
        this.f5191U0 = false;
        return z3;
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: a0 */
    public final void mo2990a0() {
        this.f5181K0.getClass();
    }

    @Override // p077a0.InterfaceC0801L
    /* JADX INFO: renamed from: b */
    public final long mo2001b() {
        if (this.f3484n == 2) {
            m2998x0();
        }
        return this.f5188R0;
    }

    @Override // p077a0.AbstractC0827g, p077a0.InterfaceC0822d0
    /* JADX INFO: renamed from: c */
    public final void mo1903c(int i3, Object obj) {
        C0031d c0031d;
        C0858A c0858a;
        C1150z c1150z = this.f5181K0;
        if (i3 == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (c1150z.f5356O != fFloatValue) {
                c1150z.f5356O = fFloatValue;
                if (c1150z.m3060o()) {
                    c1150z.f5398v.setVolume(c1150z.f5356O);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == 3) {
            C0567c c0567c = (C0567c) obj;
            c0567c.getClass();
            if (c1150z.f5402z.equals(c0567c)) {
                return;
            }
            c1150z.f5402z = c0567c;
            if (c1150z.f5369a0) {
                return;
            }
            C1129e c1129e = c1150z.f5400x;
            if (c1129e != null) {
                c1129e.f5241i = c0567c;
                c1129e.m3009a(C1126b.m3005b(c1129e.f5233a, c0567c, c1129e.f5240h));
            }
            c1150z.m3052g();
            return;
        }
        if (i3 == 6) {
            C0569d c0569d = (C0569d) obj;
            c0569d.getClass();
            if (c1150z.f5366Y.equals(c0569d)) {
                return;
            }
            if (c1150z.f5398v != null) {
                c1150z.f5366Y.getClass();
            }
            c1150z.f5366Y = c0569d;
            return;
        }
        if (i3 == 12) {
            if (AbstractC0632A.f2454a >= 23) {
                AudioDeviceInfo audioDeviceInfoM399g = AbstractC0081c.m399g(obj);
                if (audioDeviceInfoM399g == null) {
                    c0031d = null;
                } else {
                    c1150z.getClass();
                    c0031d = new C0031d(27, audioDeviceInfoM399g);
                }
                c1150z.f5367Z = c0031d;
                C1129e c1129e2 = c1150z.f5400x;
                if (c1129e2 != null) {
                    c1129e2.m3010b(audioDeviceInfoM399g);
                }
                AudioTrack audioTrack = c1150z.f5398v;
                if (audioTrack != null) {
                    C0031d c0031d2 = c1150z.f5367Z;
                    audioTrack.setPreferredDevice(c0031d2 != null ? (AudioDeviceInfo) c0031d2.f38h : null);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == 16) {
            obj.getClass();
            this.f5192V0 = ((Integer) obj).intValue();
            InterfaceC1603l interfaceC1603l = this.f7294Q;
            if (interfaceC1603l != null && AbstractC0632A.f2454a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f5192V0));
                interfaceC1603l.mo3369c(bundle);
                return;
            }
            return;
        }
        if (i3 == 9) {
            obj.getClass();
            c1150z.f5345D = ((Boolean) obj).booleanValue();
            C1145u c1145u = new C1145u(c1150z.m3068x() ? C0548K.f1948d : c1150z.f5344C, -9223372036854775807L, -9223372036854775807L);
            if (c1150z.m3060o()) {
                c1150z.f5342A = c1145u;
                return;
            } else {
                c1150z.f5343B = c1145u;
                return;
            }
        }
        if (i3 != 10) {
            if (i3 == 11) {
                this.f7289L = (C0793D) obj;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (c1150z.f5365X != iIntValue) {
            c1150z.f5365X = iIntValue;
            c1150z.f5364W = iIntValue != 0;
            c1150z.m3052g();
        }
        if (AbstractC0632A.f2454a < 35 || (c0858a = this.f5182L0) == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c0858a.f3641j;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            c0858a.f3641j = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(iIntValue, EnumC1991a.f8697g, new C1600i(c0858a));
        c0858a.f3641j = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) c0858a.f3639h).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: c0 */
    public final void mo2991c0() {
        this.f5181K0.f5353L = true;
    }

    @Override // p077a0.InterfaceC0801L
    /* JADX INFO: renamed from: d */
    public final void mo2002d(C0548K c0548k) {
        C1150z c1150z = this.f5181K0;
        c1150z.getClass();
        c1150z.f5344C = new C0548K(AbstractC0632A.m1589h(c0548k.f1949a, 0.1f, 8.0f), AbstractC0632A.m1589h(c0548k.f1950b, 0.1f, 8.0f));
        if (c1150z.m3068x()) {
            c1150z.m3066v();
            return;
        }
        C1145u c1145u = new C1145u(c0548k, -9223372036854775807L, -9223372036854775807L);
        if (c1150z.m3060o()) {
            c1150z.f5342A = c1145u;
        } else {
            c1150z.f5343B = c1145u;
        }
    }

    @Override // p077a0.InterfaceC0801L
    /* JADX INFO: renamed from: f */
    public final C0548K mo2003f() {
        return this.f5181K0.f5344C;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: g0 */
    public final boolean mo2992g0(long j3, long j4, InterfaceC1603l interfaceC1603l, ByteBuffer byteBuffer, int i3, int i4, int i5, long j5, boolean z3, boolean z4, C0583o c0583o) throws C0839o {
        int i6;
        int i7;
        byteBuffer.getClass();
        if (this.f5187Q0 != null && (i4 & 2) != 0) {
            interfaceC1603l.getClass();
            interfaceC1603l.mo3376j(i3);
            return true;
        }
        C1150z c1150z = this.f5181K0;
        if (z3) {
            if (interfaceC1603l != null) {
                interfaceC1603l.mo3376j(i3);
            }
            this.f7278D0.f3509f += i5;
            c1150z.f5353L = true;
            return true;
        }
        try {
            if (!c1150z.m3057l(byteBuffer, j5, i5)) {
                return false;
            }
            if (interfaceC1603l != null) {
                interfaceC1603l.mo3376j(i3);
            }
            this.f7278D0.f3508e += i5;
            return true;
        } catch (C1136l e3) {
            C0583o c0583o2 = this.f5186P0;
            if (this.f7316m0) {
                C0830h0 c0830h0 = this.f3480j;
                c0830h0.getClass();
                if (c0830h0.f3517a != 0) {
                    i7 = 5004;
                } else {
                    i7 = 5001;
                }
            } else {
                i7 = 5001;
            }
            throw m2079e(e3, c0583o2, e3.f5262h, i7);
        } catch (C1138n e4) {
            if (this.f7316m0) {
                C0830h0 c0830h1 = this.f3480j;
                c0830h1.getClass();
                if (c0830h1.f3517a != 0) {
                    i6 = 5003;
                } else {
                    i6 = 5002;
                }
            } else {
                i6 = 5002;
            }
            throw m2079e(e4, c0583o, e4.f5264h, i6);
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: i */
    public final String mo2082i() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: j0 */
    public final void mo2993j0() throws C0839o {
        try {
            C1150z c1150z = this.f5181K0;
            if (!c1150z.f5360S && c1150z.m3060o() && c1150z.m3051f()) {
                c1150z.m3063s();
                c1150z.f5360S = true;
            }
        } catch (C1138n e3) {
            throw m2079e(e3, e3.f5265i, e3.f5264h, this.f7316m0 ? 5003 : 5002);
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: k */
    public final boolean mo2084k() {
        if (!this.f7332z0) {
            return false;
        }
        C1150z c1150z = this.f5181K0;
        if (c1150z.m3060o()) {
            return c1150z.f5360S && !c1150z.m3058m();
        }
        return true;
    }

    @Override // p103h0.AbstractC1609r, p077a0.AbstractC0827g
    /* JADX INFO: renamed from: l */
    public final boolean mo2085l() {
        return this.f5181K0.m3058m() || super.mo2085l();
    }

    @Override // p103h0.AbstractC1609r, p077a0.AbstractC0827g
    /* JADX INFO: renamed from: m */
    public final void mo2086m() {
        C1133i c1133i = this.f5180J0;
        this.f5190T0 = true;
        this.f5186P0 = null;
        try {
            this.f5181K0.m3052g();
            try {
                super.mo2086m();
            } finally {
                c1133i.m3012a(this.f7278D0);
            }
        } catch (Throwable th) {
            try {
                super.mo2086m();
                throw th;
            } finally {
                c1133i.m3012a(this.f7278D0);
            }
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: n */
    public final void mo2087n(boolean z3, boolean z4) {
        C0829h c0829h = new C0829h();
        this.f7278D0 = c0829h;
        C1133i c1133i = this.f5180J0;
        Handler handler = c1133i.f5252b;
        if (handler != null) {
            handler.post(new RunnableC1131g(c1133i, c0829h, 0));
        }
        C0830h0 c0830h0 = this.f3480j;
        c0830h0.getClass();
        boolean z5 = c0830h0.f3518b;
        C1150z c1150z = this.f5181K0;
        if (z5) {
            AbstractC0646n.m1630h(c1150z.f5364W);
            if (!c1150z.f5369a0) {
                c1150z.f5369a0 = true;
                c1150z.m3052g();
            }
        } else if (c1150z.f5369a0) {
            c1150z.f5369a0 = false;
            c1150z.m3052g();
        }
        C1071l c1071l = this.f3482l;
        c1071l.getClass();
        c1150z.f5393q = c1071l;
        C0653u c0653u = this.f3483m;
        c0653u.getClass();
        c1150z.f5380g.f5287I = c0653u;
    }

    @Override // p103h0.AbstractC1609r, p077a0.AbstractC0827g
    /* JADX INFO: renamed from: o */
    public final void mo2088o(long j3, boolean z3) {
        super.mo2088o(j3, z3);
        this.f5181K0.m3052g();
        this.f5188R0 = j3;
        this.f5191U0 = false;
        this.f5189S0 = true;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: p */
    public final void mo2089p() {
        C0858A c0858a;
        C1127c c1127c;
        C1129e c1129e = this.f5181K0.f5400x;
        if (c1129e != null && c1129e.f5242j) {
            c1129e.f5239g = null;
            int i3 = AbstractC0632A.f2454a;
            Context context = c1129e.f5233a;
            if (i3 >= 23 && (c1127c = c1129e.f5236d) != null) {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                audioManager.getClass();
                audioManager.unregisterAudioDeviceCallback(c1127c);
            }
            context.unregisterReceiver(c1129e.f5237e);
            C1128d c1128d = c1129e.f5238f;
            if (c1128d != null) {
                c1128d.f5230a.unregisterContentObserver(c1128d);
            }
            c1129e.f5242j = false;
        }
        if (AbstractC0632A.f2454a < 35 || (c0858a = this.f5182L0) == null) {
            return;
        }
        ((HashSet) c0858a.f3639h).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c0858a.f3641j;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: q */
    public final void mo2090q() {
        C1150z c1150z = this.f5181K0;
        this.f5191U0 = false;
        try {
            try {
                m3946E();
                m3964i0();
                InterfaceC1384h interfaceC1384h = this.f7288K;
                if (interfaceC1384h != null) {
                    interfaceC1384h.mo3463d(null);
                }
                this.f7288K = null;
                if (this.f5190T0) {
                    this.f5190T0 = false;
                    c1150z.m3065u();
                }
            } catch (Throwable th) {
                InterfaceC1384h interfaceC1384h2 = this.f7288K;
                if (interfaceC1384h2 != null) {
                    interfaceC1384h2.mo3463d(null);
                }
                this.f7288K = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.f5190T0) {
                this.f5190T0 = false;
                c1150z.m3065u();
            }
            throw th2;
        }
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: q0 */
    public final boolean mo2994q0(C0583o c0583o) {
        C0830h0 c0830h0 = this.f3480j;
        c0830h0.getClass();
        if (c0830h0.f3517a != 0) {
            int iM2996v0 = m2996v0(c0583o);
            if ((iM2996v0 & 512) != 0) {
                C0830h0 c0830h1 = this.f3480j;
                c0830h1.getClass();
                if (c0830h1.f3517a == 2 || (iM2996v0 & 1024) != 0 || (c0583o.f2133F == 0 && c0583o.f2134G == 0)) {
                    return true;
                }
            }
        }
        return this.f5181K0.m3054i(c0583o) != 0;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: r */
    public final void mo2091r() {
        this.f5181K0.m3062r();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: r0 */
    public final int mo2995r0(C1601j c1601j, C0583o c0583o) {
        int iM2996v0;
        C1692X c1692xM3987g;
        C1606o c1606o;
        boolean z3;
        if (!AbstractC0545H.m1360h(c0583o.f2154n)) {
            return AbstractC0462h.m1162b(0, 0, 0, 0);
        }
        boolean z4 = true;
        int i3 = c0583o.f2139L;
        boolean z5 = i3 != 0;
        boolean z6 = i3 == 0 || i3 == 2;
        int i4 = 8;
        C1150z c1150z = this.f5181K0;
        if (z6) {
            if (z5) {
                List listM3985e = AbstractC1616y.m3985e("audio/raw", false, false);
                if ((listM3985e.isEmpty() ? null : (C1606o) listM3985e.get(0)) == null) {
                    iM2996v0 = 0;
                }
            }
            iM2996v0 = m2996v0(c0583o);
            if (c1150z.m3054i(c0583o) != 0) {
                return AbstractC0462h.m1162b(4, 8, 32, iM2996v0);
            }
        } else {
            iM2996v0 = 0;
        }
        String str = c0583o.f2154n;
        if ("audio/raw".equals(str) && c1150z.m3054i(c0583o) == 0) {
            return AbstractC0462h.m1162b(1, 0, 0, 0);
        }
        C0582n c0582n = new C0582n();
        c0582n.f2114m = AbstractC0545H.m1364l("audio/raw");
        c0582n.f2092B = c0583o.f2130C;
        c0582n.f2093C = c0583o.f2131D;
        c0582n.f2094D = 2;
        if (c1150z.m3054i(new C0583o(c0582n)) == 0) {
            return AbstractC0462h.m1162b(1, 0, 0, 0);
        }
        if (str == null) {
            c1692xM3987g = C1692X.f7629k;
        } else if (c1150z.m3054i(c0583o) != 0) {
            List listM3985e2 = AbstractC1616y.m3985e("audio/raw", false, false);
            C1606o c1606o2 = listM3985e2.isEmpty() ? null : (C1606o) listM3985e2.get(0);
            if (c1606o2 != null) {
                c1692xM3987g = AbstractC1676G.m4120r(c1606o2);
            } else {
                c1692xM3987g = AbstractC1616y.m3987g(c1601j, c0583o, false, false);
            }
        } else {
            c1692xM3987g = AbstractC1616y.m3987g(c1601j, c0583o, false, false);
        }
        if (c1692xM3987g.isEmpty()) {
            return AbstractC0462h.m1162b(1, 0, 0, 0);
        }
        if (!z6) {
            return AbstractC0462h.m1162b(2, 0, 0, 0);
        }
        C1606o c1606o3 = (C1606o) c1692xM3987g.get(0);
        boolean zM3940d = c1606o3.m3940d(c0583o);
        if (!zM3940d) {
            int i5 = 1;
            while (true) {
                if (i5 >= c1692xM3987g.f7631j) {
                    c1606o = c1606o3;
                    z4 = zM3940d;
                    z3 = true;
                    break;
                }
                c1606o = (C1606o) c1692xM3987g.get(i5);
                if (c1606o.m3940d(c0583o)) {
                    z3 = false;
                    break;
                }
                i5++;
            }
        } else {
            c1606o = c1606o3;
            z4 = zM3940d;
            z3 = true;
            break;
        }
        int i6 = z4 ? 4 : 3;
        if (z4 && c1606o.m3941e(c0583o)) {
            i4 = 16;
        }
        return (c1606o.f7258g ? 64 : 0) | i6 | i4 | 32 | (z3 ? 128 : 0) | iM2996v0;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: s */
    public final void mo2092s() {
        m2998x0();
        C1150z c1150z = this.f5181K0;
        c1150z.f5363V = false;
        if (c1150z.m3060o()) {
            C1141q c1141q = c1150z.f5380g;
            c1141q.m3019d();
            if (c1141q.f5311x == -9223372036854775807L) {
                C1140p c1140p = c1141q.f5292e;
                c1140p.getClass();
                c1140p.m3014a();
            } else {
                c1141q.f5313z = c1141q.m3017b();
                if (!C1150z.m3045p(c1150z.f5398v)) {
                    return;
                }
            }
            c1150z.f5398v.pause();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final int m2996v0(C0583o c0583o) {
        C1130f c1130fM3053h = this.f5181K0.m3053h(c0583o);
        if (!c1130fM3053h.f5244a) {
            return 0;
        }
        int i3 = c1130fM3053h.f5245b ? 1536 : 512;
        return c1130fM3053h.f5246c ? i3 | 2048 : i3;
    }

    /* JADX INFO: renamed from: w0 */
    public final int m2997w0(C1606o c1606o, C0583o c0583o) {
        int i3;
        if (!"OMX.google.raw.decoder".equals(c1606o.f7252a) || (i3 = AbstractC0632A.f2454a) >= 24 || (i3 == 23 && AbstractC0632A.m1570K(this.f5179I0))) {
            return c0583o.f2155o;
        }
        return -1;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m2998x0() {
        long jMax;
        ArrayDeque arrayDeque;
        long j3;
        boolean zMo2084k = mo2084k();
        C1150z c1150z = this.f5181K0;
        if (!c1150z.m3060o() || c1150z.f5354M) {
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(c1150z.f5380g.m3016a(zMo2084k), AbstractC0632A.m1575P(c1150z.f5396t.f5320e, c1150z.m3056k()));
            while (true) {
                arrayDeque = c1150z.f5382h;
                if (arrayDeque.isEmpty() || jMin < ((C1145u) arrayDeque.getFirst()).f5330c) {
                    break;
                } else {
                    c1150z.f5343B = (C1145u) arrayDeque.remove();
                }
            }
            C1145u c1145u = c1150z.f5343B;
            long jM1577R = jMin - c1145u.f5330c;
            long jM1604w = AbstractC0632A.m1604w(jM1577R, c1145u.f5328a.f1949a);
            boolean zIsEmpty = arrayDeque.isEmpty();
            C0858A c0858a = c1150z.f5370b;
            if (zIsEmpty) {
                C0607g c0607g = (C0607g) c0858a.f3641j;
                if (c0607g.mo1475e()) {
                    if (c0607g.f2296o >= 1024) {
                        long j4 = c0607g.f2295n;
                        C0606f c0606f = c0607g.f2291j;
                        c0606f.getClass();
                        long j5 = j4 - ((long) ((c0606f.f2270k * c0606f.f2261b) * 2));
                        int i3 = c0607g.f2289h.f2248a;
                        int i4 = c0607g.f2288g.f2248a;
                        jM1577R = i3 == i4 ? AbstractC0632A.m1577R(jM1577R, j5, c0607g.f2296o, RoundingMode.DOWN) : AbstractC0632A.m1577R(jM1577R, j5 * ((long) i3), c0607g.f2296o * ((long) i4), RoundingMode.DOWN);
                    } else {
                        jM1577R = (long) (((double) c0607g.f2284c) * jM1577R);
                    }
                }
                C1145u c1145u2 = c1150z.f5343B;
                j3 = c1145u2.f5329b + jM1577R;
                c1145u2.f5331d = jM1577R - jM1604w;
            } else {
                C1145u c1145u3 = c1150z.f5343B;
                j3 = c1145u3.f5329b + jM1604w + c1145u3.f5331d;
            }
            long j6 = ((C1122D) c0858a.f3640i).f5206q;
            jMax = AbstractC0632A.m1575P(c1150z.f5396t.f5320e, j6) + j3;
            long j7 = c1150z.f5381g0;
            if (j6 > j7) {
                long jM1575P = AbstractC0632A.m1575P(c1150z.f5396t.f5320e, j6 - j7);
                c1150z.f5381g0 = j6;
                c1150z.f5383h0 += jM1575P;
                if (c1150z.f5385i0 == null) {
                    c1150z.f5385i0 = new Handler(Looper.myLooper());
                }
                c1150z.f5385i0.removeCallbacksAndMessages(null);
                c1150z.f5385i0.postDelayed(new RunnableC0892b(9, c1150z), 100L);
            }
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.f5189S0) {
                jMax = Math.max(this.f5188R0, jMax);
            }
            this.f5188R0 = jMax;
            this.f5189S0 = false;
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: h */
    public final InterfaceC0801L mo2081h() {
        return this;
    }
}
