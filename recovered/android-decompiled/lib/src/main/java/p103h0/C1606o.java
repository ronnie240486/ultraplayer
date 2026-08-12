package p103h0;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.List;
import java.util.Objects;
import p000A.AbstractC0034e0;
import p000A.C0058r;
import p048Q0.C0508g;
import p055T.AbstractC0545H;
import p055T.C0573f;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0633a;
import p064W.AbstractC0646n;
import p066W1.AbstractC0664e;
import p067X.AbstractC0684p;
import p067X.C0676h;
import p077a0.C0831i;
import p105h2.AbstractC1676G;
import p105h2.C1673D;
import p105h2.C1692X;

/* JADX INFO: renamed from: h0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1606o {

    /* JADX INFO: renamed from: a */
    public final String f7252a;

    /* JADX INFO: renamed from: b */
    public final String f7253b;

    /* JADX INFO: renamed from: c */
    public final String f7254c;

    /* JADX INFO: renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f7255d;

    /* JADX INFO: renamed from: e */
    public final boolean f7256e;

    /* JADX INFO: renamed from: f */
    public final boolean f7257f;

    /* JADX INFO: renamed from: g */
    public final boolean f7258g;

    /* JADX INFO: renamed from: h */
    public final boolean f7259h;

    /* JADX INFO: renamed from: i */
    public final boolean f7260i;

    public C1606o(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.f7252a = str;
        this.f7253b = str2;
        this.f7254c = str3;
        this.f7255d = codecCapabilities;
        this.f7258g = z3;
        this.f7256e = z4;
        this.f7257f = z5;
        this.f7259h = z6;
        this.f7260i = AbstractC0545H.m1363k(str2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3936a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i3, int i4, double d3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(AbstractC0632A.m1587f(i3, widthAlignment) * widthAlignment, AbstractC0632A.m1587f(i4, heightAlignment) * heightAlignment);
        int i5 = point.x;
        int i6 = point.y;
        return (d3 == -1.0d || d3 < 1.0d) ? videoCapabilities.isSizeSupported(i5, i6) : videoCapabilities.areSizeAndRateSupported(i5, i6, Math.floor(d3));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX INFO: renamed from: h */
    public static C1606o m3937h(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z3, boolean z4) {
        boolean z5;
        if (codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (AbstractC0632A.f2454a <= 22) {
                String str4 = AbstractC0632A.f2457d;
                z5 = (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) ? false : true;
            }
        }
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new C1606o(str, str2, str3, codecCapabilities, z3, z5, z4 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback")), AbstractC0632A.f2454a >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface"));
    }

    /* JADX INFO: renamed from: b */
    public final C0831i m3938b(C0583o c0583o, C0583o c0583o2) {
        C0583o c0583o3;
        C0583o c0583o4;
        String str = c0583o.f2154n;
        String str2 = c0583o2.f2154n;
        int i3 = AbstractC0632A.f2454a;
        int i4 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.f7260i) {
            if (c0583o.f2164x != c0583o2.f2164x) {
                i4 |= 1024;
            }
            if (!this.f7256e && (c0583o.f2161u != c0583o2.f2161u || c0583o.f2162v != c0583o2.f2162v)) {
                i4 |= 512;
            }
            C0573f c0573f = c0583o.f2129B;
            boolean zM1438e = C0573f.m1438e(c0573f);
            C0573f c0573f2 = c0583o2.f2129B;
            if ((!zM1438e || !C0573f.m1438e(c0573f2)) && !Objects.equals(c0573f, c0573f2)) {
                i4 |= 2048;
            }
            if (AbstractC0632A.f2457d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f7252a) && !c0583o.m1448b(c0583o2)) {
                i4 |= 2;
            }
            if (i4 == 0) {
                return new C0831i(this.f7252a, c0583o, c0583o2, c0583o.m1448b(c0583o2) ? 3 : 2, 0);
            }
            c0583o3 = c0583o;
            c0583o4 = c0583o2;
        } else {
            c0583o3 = c0583o;
            c0583o4 = c0583o2;
            if (c0583o3.f2130C != c0583o4.f2130C) {
                i4 |= 4096;
            }
            if (c0583o3.f2131D != c0583o4.f2131D) {
                i4 |= 8192;
            }
            if (c0583o3.f2132E != c0583o4.f2132E) {
                i4 |= 16384;
            }
            String str3 = this.f7253b;
            if (i4 == 0 && "audio/mp4a-latm".equals(str3)) {
                Pair pairM3984d = AbstractC1616y.m3984d(c0583o3);
                Pair pairM3984d2 = AbstractC1616y.m3984d(c0583o4);
                if (pairM3984d != null && pairM3984d2 != null) {
                    int iIntValue = ((Integer) pairM3984d.first).intValue();
                    int iIntValue2 = ((Integer) pairM3984d2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C0831i(this.f7252a, c0583o3, c0583o4, 3, 0);
                    }
                }
            }
            if (!c0583o3.m1448b(c0583o4)) {
                i4 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i4 |= 2;
            }
            if (i4 == 0) {
                return new C0831i(this.f7252a, c0583o3, c0583o4, 1, 0);
            }
        }
        return new C0831i(this.f7252a, c0583o3, c0583o4, 0, i4);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3939c(C0583o c0583o, boolean z3) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pair;
        String strM1608a;
        Pair pairM1609b;
        int i3 = 4;
        int i4 = 3;
        Pair pairM3984d = AbstractC1616y.m3984d(c0583o);
        String str = this.f7254c;
        String str2 = c0583o.f2154n;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strM1364l = AbstractC0545H.m1364l(str);
            if (strM1364l.equals("video/mv-hevc")) {
                return true;
            }
            if (strM1364l.equals("video/hevc")) {
                List list = c0583o.f2157q;
                int i5 = 0;
                loop0: while (true) {
                    if (i5 >= list.size()) {
                        pair = null;
                        strM1608a = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i5);
                    int length = bArr.length;
                    if (length > i4) {
                        boolean[] zArr = new boolean[i4];
                        C1673D c1673dM4116m = AbstractC1676G.m4116m();
                        int i6 = 0;
                        while (i6 < bArr.length) {
                            int iM1789b = AbstractC0684p.m1789b(bArr, i6, bArr.length, zArr);
                            if (iM1789b != bArr.length) {
                                c1673dM4116m.m4102a(Integer.valueOf(iM1789b));
                            }
                            i6 = iM1789b + 3;
                        }
                        C1692X c1692xM4112f = c1673dM4116m.m4112f();
                        for (int i7 = 0; i7 < c1692xM4112f.f7631j; i7++) {
                            if (((Integer) c1692xM4112f.get(i7)).intValue() + i4 < length) {
                                C0508g c0508g = new C0508g(bArr, ((Integer) c1692xM4112f.get(i7)).intValue() + i4, length);
                                C0058r c0058rM1791d = AbstractC0684p.m1791d(c0508g);
                                if (c0058rM1791d.f82a == 33 && c0058rM1791d.f83b == 0) {
                                    c0508g.m1263t(4);
                                    int iM1252i = c0508g.m1252i(3);
                                    c0508g.m1262s();
                                    pair = null;
                                    C0676h c0676hM1792e = AbstractC0684p.m1792e(c0508g, true, iM1252i, null);
                                    strM1608a = AbstractC0633a.m1608a(c0676hM1792e.f2581a, c0676hM1792e.f2582b, c0676hM1792e.f2583c, c0676hM1792e.f2584d, c0676hM1792e.f2585e, c0676hM1792e.f2586f);
                                    break loop0;
                                }
                                i4 = 3;
                            }
                        }
                    }
                    i5++;
                }
                if (strM1608a == null) {
                    pairM1609b = pair;
                } else {
                    String strTrim = strM1608a.trim();
                    int i8 = AbstractC0632A.f2454a;
                    pairM1609b = AbstractC0633a.m1609b(strM1608a, strTrim.split("\\.", -1), c0583o.f2129B);
                }
                pairM3984d = pairM1609b;
            }
        }
        if (pairM3984d == null) {
            return true;
        }
        int iIntValue = ((Integer) pairM3984d.first).intValue();
        int iIntValue2 = ((Integer) pairM3984d.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(str2);
        String str3 = this.f7253b;
        if (zEquals) {
            if (!"video/avc".equals(str3)) {
                iIntValue = "video/hevc".equals(str3) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.f7260i && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7255d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (AbstractC0632A.f2454a <= 23 && "video/x-vnd.on2.vp9".equals(str3) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i3 = 1024;
            } else if (iIntValue3 >= 120000000) {
                i3 = 512;
            } else if (iIntValue3 >= 60000000) {
                i3 = 256;
            } else if (iIntValue3 >= 30000000) {
                i3 = 128;
            } else if (iIntValue3 >= 18000000) {
                i3 = 64;
            } else if (iIntValue3 >= 12000000) {
                i3 = 32;
            } else if (iIntValue3 >= 7200000) {
                i3 = 16;
            } else if (iIntValue3 >= 3600000) {
                i3 = 8;
            } else if (iIntValue3 < 1800000) {
                i3 = iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i3;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z3)) {
                if (!"video/hevc".equals(str3) || 2 != iIntValue) {
                    return true;
                }
                String str4 = AbstractC0632A.f2455b;
                if (!"sailfish".equals(str4) && !"marlin".equals(str4)) {
                    return true;
                }
            }
        }
        m3943g("codec.profileLevel, " + c0583o.f2151k + ", " + str);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3940d(C0583o c0583o) {
        int i3;
        int i4;
        String str = c0583o.f2154n;
        String str2 = this.f7253b;
        if (!(str2.equals(str) || str2.equals(AbstractC1616y.m3982b(c0583o))) || !m3939c(c0583o, true)) {
            return false;
        }
        if (this.f7260i) {
            int i5 = c0583o.f2161u;
            if (i5 > 0 && (i4 = c0583o.f2162v) > 0) {
                return m3942f(i5, i4, c0583o.f2163w);
            }
        } else {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7255d;
            int i6 = c0583o.f2131D;
            if (i6 != -1) {
                if (codecCapabilities == null) {
                    m3943g("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    m3943g("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i6)) {
                    m3943g("sampleRate.support, " + i6);
                    return false;
                }
            }
            int i7 = c0583o.f2130C;
            if (i7 != -1) {
                if (codecCapabilities == null) {
                    m3943g("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    m3943g("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((AbstractC0632A.f2454a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i3 = 6;
                    } else {
                        i3 = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    AbstractC0646n.m1647y("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f7252a + ", [" + maxInputChannelCount + " to " + i3 + "]");
                    maxInputChannelCount = i3;
                }
                if (maxInputChannelCount < i7) {
                    m3943g("channelCount.support, " + i7);
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3941e(C0583o c0583o) {
        if (this.f7260i) {
            return this.f7256e;
        }
        Pair pairM3984d = AbstractC1616y.m3984d(c0583o);
        return pairM3984d != null && ((Integer) pairM3984d.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b7  */
    /* JADX INFO: renamed from: f */
    public final boolean m3942f(int i3, int i4, double d3) {
        String str;
        char c;
        Boolean bool;
        List supportedPerformancePoints;
        boolean z3;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7255d;
        if (codecCapabilities == null) {
            m3943g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m3943g("sizeAndRate.vCaps");
            return false;
        }
        int i5 = AbstractC0632A.f2454a;
        if (i5 >= 29) {
            if (i5 < 29 || (((bool = AbstractC1303m.f5925h) != null && bool.booleanValue()) || (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) == null || supportedPerformancePoints.isEmpty())) {
                c = 0;
            } else {
                AbstractC0034e0.m198l();
                MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointM188b = AbstractC0034e0.m188b(i3, i4, (int) d3);
                int i6 = 0;
                while (true) {
                    if (i6 >= supportedPerformancePoints.size()) {
                        c = 1;
                        break;
                    }
                    if (AbstractC0034e0.m189c(supportedPerformancePoints.get(i6)).covers(performancePointM188b)) {
                        c = 2;
                        break;
                    }
                    i6++;
                }
                if (c == 1 && AbstractC1303m.f5925h == null) {
                    if (i5 >= 35) {
                        z3 = false;
                    } else {
                        int iM1759x = AbstractC0664e.m1759x(false);
                        int iM1759x2 = AbstractC0664e.m1759x(true);
                        if (iM1759x != 0 && (iM1759x2 != 0 ? iM1759x == 2 && iM1759x2 == 2 : iM1759x == 2)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                    }
                    AbstractC1303m.f5925h = Boolean.valueOf(z3);
                    if (z3) {
                        c = 0;
                    }
                }
            }
            if (c != 2) {
                if (c == 1) {
                    m3943g("sizeAndRate.cover, " + i3 + "x" + i4 + "@" + d3);
                    return false;
                }
                if (!m3936a(videoCapabilities, i3, i4, d3)) {
                    if (i3 < i4) {
                        str = this.f7252a;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            AbstractC0646n.m1634l("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i3 + "x" + i4 + "@" + d3) + "] [" + str + ", " + this.f7253b + "] [" + AbstractC0632A.f2458e + "]");
                            return true;
                        }
                        AbstractC0646n.m1634l("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i3 + "x" + i4 + "@" + d3) + "] [" + str + ", " + this.f7253b + "] [" + AbstractC0632A.f2458e + "]");
                        return true;
                    }
                    m3943g("sizeAndRate.support, " + i3 + "x" + i4 + "@" + d3);
                    return false;
                }
            }
        } else if (!m3936a(videoCapabilities, i3, i4, d3)) {
            if (i3 < i4) {
                str = this.f7252a;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(AbstractC0632A.f2455b)) && m3936a(videoCapabilities, i4, i3, d3)) {
                    AbstractC0646n.m1634l("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i3 + "x" + i4 + "@" + d3) + "] [" + str + ", " + this.f7253b + "] [" + AbstractC0632A.f2458e + "]");
                    return true;
                }
            }
            m3943g("sizeAndRate.support, " + i3 + "x" + i4 + "@" + d3);
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m3943g(String str) {
        AbstractC0646n.m1634l("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f7252a + ", " + this.f7253b + "] [" + AbstractC0632A.f2458e + "]");
    }

    public final String toString() {
        return this.f7252a;
    }
}
