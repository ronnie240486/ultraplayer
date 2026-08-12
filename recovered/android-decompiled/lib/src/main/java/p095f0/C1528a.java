package p095f0;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Trace;
import android.support.v4.media.session.C0858A;
import android.util.Log;
import android.view.Surface;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.C1323r;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executors;
import p000A.C0058r;
import p009D0.C0106b;
import p030K0.C0334e;
import p034L1.C0352g;
import p040N1.ExecutorC0433n;
import p046P1.C0475c;
import p055T.C0546I;
import p064W.AbstractC0632A;
import p070Y.C0712i;
import p070Y.C0722s;
import p070Y.C0725v;
import p073Z.C0771f;
import p074Z0.C0778e;
import p096f1.InterfaceC1548c;
import p103h0.C1606o;
import p103h0.InterfaceC1602k;
import p103h0.InterfaceC1603l;
import p103h0.InterfaceC1614w;
import p110j.InterfaceC1783x;
import p110j.MenuC1772m;
import p114k0.InterfaceC1931Z;
import p117l0.InterfaceC1974c;
import p126n1.EnumC2048c;
import p129o0.C2073m;
import p129o0.InterfaceC2075o;
import p137q0.InterfaceC2163x;
import p145s0.C2239l;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2233f;
import p145s0.InterfaceC2242o;
import p145s0.InterfaceC2252y;
import p150t1.InterfaceC2276b;
import p162x1.C2352a;
import p162x1.C2353b;
import p162x1.EnumC2355d;

/* JADX INFO: renamed from: f0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1528a implements InterfaceC1544q, InterfaceC1548c, InterfaceC1614w, InterfaceC1602k, InterfaceC1783x, InterfaceC1931Z, InterfaceC1974c, InterfaceC2163x, InterfaceC2276b, InterfaceC2233f, InterfaceC2242o {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6888g;

    public /* synthetic */ C1528a(int i3) {
        this.f6888g = i3;
    }

    /* JADX INFO: renamed from: A */
    public static C0778e m3817A(C0058r c0058r, C0334e c0334e) {
        IOException iOException = (IOException) c0334e.f1063h;
        if (!(iOException instanceof C0725v)) {
            return null;
        }
        int i3 = ((C0725v) iOException).f2773j;
        if ((i3 == 403 || i3 == 404 || i3 == 410 || i3 == 416 || i3 == 500 || i3 == 503) && c0058r.f82a - c0058r.f83b > 1) {
            return new C0778e(2, 60000L);
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static long m3818C(C0334e c0334e) {
        Throwable cause = (IOException) c0334e.f1063h;
        if ((cause instanceof C0546I) || (cause instanceof FileNotFoundException) || (cause instanceof C0722s) || (cause instanceof C2073m)) {
            return -9223372036854775807L;
        }
        int i3 = C0712i.f2720h;
        while (cause != null) {
            if ((cause instanceof C0712i) && ((C0712i) cause).f2721g == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((c0334e.f1062g - 1) * 1000, 5000);
    }

    /* JADX INFO: renamed from: y */
    public static MediaCodec m3822y(C0475c c0475c) throws IOException {
        C1606o c1606o = (C1606o) c0475c.f1568a;
        StringBuilder sb = new StringBuilder("createCodec:");
        String str = c1606o.f7252a;
        sb.append(str);
        Trace.beginSection(sb.toString());
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    /* JADX INFO: renamed from: B */
    public int m3824B(int i3) {
        return i3 == 7 ? 6 : 3;
    }

    @Override // p145s0.InterfaceC2242o
    /* JADX INFO: renamed from: b */
    public void mo333b(InterfaceC2252y interfaceC2252y) {
        switch (this.f6888g) {
            case 16:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // p110j.InterfaceC1783x
    /* JADX INFO: renamed from: c */
    public boolean mo3617c(MenuC1772m menuC1772m) {
        return false;
    }

    @Override // p103h0.InterfaceC1614w
    /* JADX INFO: renamed from: e */
    public boolean mo925e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // p103h0.InterfaceC1614w
    /* JADX INFO: renamed from: f */
    public int mo926f() {
        return MediaCodecList.getCodecCount();
    }

    @Override // p117l0.InterfaceC1974c
    /* JADX INFO: renamed from: g */
    public long mo3744g() {
        throw new NoSuchElementException();
    }

    @Override // p139q2.InterfaceC2180a
    public Object get() {
        int i3 = 2;
        switch (this.f6888g) {
            case 14:
                return new ExecutorC0433n(2, Executors.newSingleThreadExecutor());
            default:
                C0352g c0352g = new C0352g(i3);
                HashMap map = new HashMap();
                EnumC2048c enumC2048c = EnumC2048c.f8921g;
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(enumC2048c, new C2353b(30000L, 86400000L, set));
                EnumC2048c enumC2048c2 = EnumC2048c.f8923i;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(enumC2048c2, new C2353b(1000L, 86400000L, set));
                EnumC2048c enumC2048c3 = EnumC2048c.f8922h;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(EnumC2355d.f9888g, EnumC2355d.f9889h)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(enumC2048c3, new C2353b(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() < EnumC2048c.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new C2352a(c0352g, map);
        }
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: h */
    public boolean mo3786h() {
        return true;
    }

    @Override // p095f0.InterfaceC1544q
    /* JADX INFO: renamed from: i */
    public InterfaceC2075o mo3375i(C1540m c1540m, C1537j c1537j) {
        return new C1543p(c1540m, c1537j);
    }

    @Override // p103h0.InterfaceC1614w
    /* JADX INFO: renamed from: j */
    public MediaCodecInfo mo930j(int i3) {
        return MediaCodecList.getCodecInfoAt(i3);
    }

    @Override // p096f1.InterfaceC1548c
    /* JADX INFO: renamed from: k */
    public void mo3623k(int i3, Serializable serializable) {
        String str;
        switch (this.f6888g) {
            case 1:
                break;
            default:
                switch (i3) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i3 == 6 || i3 == 7 || i3 == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    @Override // p145s0.InterfaceC2242o
    /* JADX INFO: renamed from: l */
    public void mo341l() {
        switch (this.f6888g) {
            case 16:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // p096f1.InterfaceC1548c
    /* JADX INFO: renamed from: m */
    public void mo3625m() {
        switch (this.f6888g) {
            case 1:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: n */
    public int mo3787n(C0106b c0106b, C0771f c0771f, int i3) {
        c0771f.f2573h = 4;
        return -4;
    }

    @Override // p117l0.InterfaceC1974c
    public boolean next() {
        return false;
    }

    @Override // p117l0.InterfaceC1974c
    /* JADX INFO: renamed from: o */
    public long mo3745o() {
        throw new NoSuchElementException();
    }

    @Override // p145s0.InterfaceC2242o
    /* JADX INFO: renamed from: p */
    public InterfaceC2226E mo344p(int i3, int i4) {
        switch (this.f6888g) {
            case 16:
                throw new UnsupportedOperationException();
            default:
                return new C2239l();
        }
    }

    @Override // p095f0.InterfaceC1544q
    /* JADX INFO: renamed from: r */
    public InterfaceC2075o mo3384r() {
        return new C1543p(C1540m.f6968l, null);
    }

    @Override // p103h0.InterfaceC1614w
    /* JADX INFO: renamed from: t */
    public boolean mo933t(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: v */
    public int mo3789v(long j3) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    @Override // p103h0.InterfaceC1602k
    /* JADX INFO: renamed from: w */
    public InterfaceC1603l mo3389w(C0475c c0475c) throws Throwable {
        MediaCodec mediaCodecM3822y = null;
        try {
            mediaCodecM3822y = m3822y(c0475c);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) c0475c.f1571d;
            mediaCodecM3822y.configure((MediaFormat) c0475c.f1569b, surface, (MediaCrypto) c0475c.f1572e, (surface == null && ((C1606o) c0475c.f1568a).f7259h && AbstractC0632A.f2454a >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecM3822y.start();
            Trace.endSection();
            return new C1323r(mediaCodecM3822y, (C0858A) c0475c.f1573f);
        } catch (IOException e3) {
            e = e3;
            if (mediaCodecM3822y != null) {
                mediaCodecM3822y.release();
            }
            throw e;
        } catch (RuntimeException e4) {
            e = e4;
            if (mediaCodecM3822y != null) {
                mediaCodecM3822y.release();
            }
            throw e;
        }
    }

    @Override // p103h0.InterfaceC1614w
    /* JADX INFO: renamed from: x */
    public boolean mo934x() {
        return false;
    }

    /* JADX INFO: renamed from: D */
    private final void m3819D() {
    }

    /* JADX INFO: renamed from: z */
    private final void m3823z() {
    }

    @Override // p137q0.InterfaceC2163x
    /* JADX INFO: renamed from: q */
    public void mo3628q() {
    }

    @Override // p137q0.InterfaceC2163x
    /* JADX INFO: renamed from: s */
    public void mo3629s() {
    }

    @Override // p114k0.InterfaceC1931Z
    /* JADX INFO: renamed from: u */
    public void mo3788u() {
    }

    /* JADX INFO: renamed from: F */
    private final void m3821F(InterfaceC2252y interfaceC2252y) {
    }

    @Override // p145s0.InterfaceC2233f
    /* JADX INFO: renamed from: d */
    public long mo547d(long j3) {
        return j3;
    }

    /* JADX INFO: renamed from: E */
    private final void m3820E(int i3, Serializable serializable) {
    }

    @Override // p110j.InterfaceC1783x
    /* JADX INFO: renamed from: a */
    public void mo3615a(MenuC1772m menuC1772m, boolean z3) {
    }
}
