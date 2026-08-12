package p103h0;

import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import p030K0.C0334e;
import p045P0.AbstractC0462h;
import p055T.AbstractC0545H;
import p055T.C0573f;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0633a;
import p064W.AbstractC0646n;
import p095f0.C1528a;
import p105h2.AbstractC1676G;
import p105h2.C1673D;
import p105h2.C1692X;

/* JADX INFO: renamed from: h0.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1616y {

    /* JADX INFO: renamed from: a */
    public static final HashMap f7337a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m3981a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (AbstractC0632A.f2454a < 26 && AbstractC0632A.f2455b.equals("R9") && arrayList.size() == 1 && ((C1606o) arrayList.get(0)).f7252a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C1606o.m3937h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new C1611t(new C1601j()));
        }
        if (AbstractC0632A.f2454a >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C1606o) arrayList.get(0)).f7252a)) {
            return;
        }
        arrayList.add((C1606o) arrayList.remove(0));
    }

    /* JADX INFO: renamed from: b */
    public static String m3982b(C0583o c0583o) {
        Pair pairM3984d;
        if ("audio/eac3-joc".equals(c0583o.f2154n)) {
            return "audio/eac3";
        }
        String str = c0583o.f2154n;
        if ("video/dolby-vision".equals(str) && (pairM3984d = m3984d(c0583o)) != null) {
            int iIntValue = ((Integer) pairM3984d.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m3983c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:161:0x0242  */
    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:20:0x0080  */
    /* JADX WARN: Code duplicated, block: B:290:0x03da A[PHI: r3
      0x03da: PHI (r3v6 int) = (r3v5 int), (r3v10 int), (r3v11 int), (r3v12 int), (r3v13 int) binds: [B:272:0x03ae, B:275:0x03b4, B:277:0x03b8, B:279:0x03bc, B:281:0x03c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0134  */
    /* JADX WARN: Code duplicated, block: B:86:0x013f  */
    /* JADX INFO: renamed from: d */
    public static Pair m3984d(C0583o c0583o) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Integer num;
        Integer num2;
        byte[] bArr = AbstractC0633a.f2468a;
        String str = c0583o.f2151k;
        if (str != null) {
            String[] strArrSplit = str.split("\\.");
            boolean zEquals = "video/dolby-vision".equals(c0583o.f2154n);
            String str2 = c0583o.f2151k;
            if (zEquals) {
                if (strArrSplit.length < 3) {
                    AbstractC0462h.m1171k("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                Matcher matcher = AbstractC0633a.f2470c.matcher(strArrSplit[1]);
                if (!matcher.matches()) {
                    AbstractC0462h.m1171k("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                String strGroup = matcher.group(1);
                if (strGroup != null) {
                    switch (strGroup) {
                        case "00":
                            num = 1;
                            break;
                        case "01":
                            num = 2;
                            break;
                        case "02":
                            num = 4;
                            break;
                        case "03":
                            num = 8;
                            break;
                        case "04":
                            num = 16;
                            break;
                        case "05":
                            num = 32;
                            break;
                        case "06":
                            num = 64;
                            break;
                        case "07":
                            num = 128;
                            break;
                        case "08":
                            num = 256;
                            break;
                        case "09":
                            num = 512;
                            break;
                        case "10":
                            num = 1024;
                            break;
                        default:
                            num = null;
                            break;
                    }
                } else {
                    num = null;
                }
                if (num == null) {
                    AbstractC0462h.m1171k("Unknown Dolby Vision profile string: ", strGroup, "CodecSpecificDataUtil");
                    return null;
                }
                String str3 = strArrSplit[2];
                if (str3 != null) {
                    switch (str3) {
                        case "01":
                            num2 = 1;
                            break;
                        case "02":
                            num2 = 2;
                            break;
                        case "03":
                            num2 = 4;
                            break;
                        case "04":
                            num2 = 8;
                            break;
                        case "05":
                            num2 = 16;
                            break;
                        case "06":
                            num2 = 32;
                            break;
                        case "07":
                            num2 = 64;
                            break;
                        case "08":
                            num2 = 128;
                            break;
                        case "09":
                            num2 = 256;
                            break;
                        case "10":
                            num2 = 512;
                            break;
                        case "11":
                            num2 = 1024;
                            break;
                        case "12":
                            num2 = 2048;
                            break;
                        case "13":
                            num2 = 4096;
                            break;
                        default:
                            num2 = null;
                            break;
                    }
                } else {
                    num2 = null;
                }
                if (num2 != null) {
                    return new Pair(num, num2);
                }
                AbstractC0462h.m1171k("Unknown Dolby Vision level string: ", str3, "CodecSpecificDataUtil");
                return null;
            }
            String str4 = strArrSplit[0];
            str4.getClass();
            C0573f c0573f = c0583o.f2129B;
            switch (str4) {
                case "av01":
                    if (strArrSplit.length < 4) {
                        AbstractC0462h.m1171k("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int i16 = Integer.parseInt(strArrSplit[1]);
                        int i17 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                        int i18 = Integer.parseInt(strArrSplit[3]);
                        if (i16 != 0) {
                            AbstractC0462h.m1170j("Unknown AV1 profile: ", "CodecSpecificDataUtil", i16);
                            return null;
                        }
                        if (i18 != 8 && i18 != 10) {
                            AbstractC0462h.m1170j("Unknown AV1 bit depth: ", "CodecSpecificDataUtil", i18);
                            return null;
                        }
                        if (i18 == 8) {
                            i3 = 1;
                        } else {
                            i3 = (c0573f == null || !(c0573f.f2066d != null || (i4 = c0573f.f2065c) == 7 || i4 == 6)) ? 2 : 4096;
                        }
                        switch (i17) {
                            case 0:
                                i5 = -1;
                                i6 = 1;
                                break;
                            case 1:
                                i5 = -1;
                                i6 = 2;
                                break;
                            case 2:
                                i5 = -1;
                                i6 = 4;
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                i5 = -1;
                                i6 = 8;
                                break;
                            case 4:
                                i5 = -1;
                                i6 = 16;
                                break;
                            case 5:
                                i5 = -1;
                                i6 = 32;
                                break;
                            case 6:
                                i5 = -1;
                                i6 = 64;
                                break;
                            case 7:
                                i5 = -1;
                                i6 = 128;
                                break;
                            case 8:
                                i5 = -1;
                                i6 = 256;
                                break;
                            case 9:
                                i5 = -1;
                                i6 = 512;
                                break;
                            case 10:
                                i5 = -1;
                                i6 = 1024;
                                break;
                            case 11:
                                i5 = -1;
                                i6 = 2048;
                                break;
                            case 12:
                                i5 = -1;
                                i6 = 4096;
                                break;
                            case 13:
                                i5 = -1;
                                i6 = 8192;
                                break;
                            case 14:
                                i5 = -1;
                                i6 = 16384;
                                break;
                            case 15:
                                i5 = -1;
                                i6 = 32768;
                                break;
                            case 16:
                                i5 = -1;
                                i6 = 65536;
                                break;
                            case 17:
                                i6 = 131072;
                                i5 = -1;
                                break;
                            case 18:
                                i6 = 262144;
                                i5 = -1;
                                break;
                            case 19:
                                i6 = 524288;
                                i5 = -1;
                                break;
                            case 20:
                                i6 = 1048576;
                                i5 = -1;
                                break;
                            case 21:
                                i6 = 2097152;
                                i5 = -1;
                                break;
                            case 22:
                                i6 = 4194304;
                                i5 = -1;
                                break;
                            case 23:
                                i6 = 8388608;
                                i5 = -1;
                                break;
                            default:
                                i5 = -1;
                                i6 = -1;
                                break;
                        }
                        if (i6 != i5) {
                            return new Pair(Integer.valueOf(i3), Integer.valueOf(i6));
                        }
                        AbstractC0462h.m1170j("Unknown AV1 level: ", "CodecSpecificDataUtil", i17);
                        return null;
                    } catch (NumberFormatException unused) {
                        AbstractC0462h.m1171k("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                case "avc1":
                case "avc2":
                    if (strArrSplit.length < 2) {
                        AbstractC0462h.m1171k("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        if (strArrSplit[1].length() == 6) {
                            i7 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                            i8 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                        } else {
                            if (strArrSplit.length < 3) {
                                AbstractC0646n.m1647y("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str2);
                                return null;
                            }
                            i7 = Integer.parseInt(strArrSplit[1]);
                            i8 = Integer.parseInt(strArrSplit[2]);
                        }
                        if (i7 == 66) {
                            i9 = 1;
                        } else if (i7 == 77) {
                            i9 = 2;
                        } else if (i7 == 88) {
                            i9 = 4;
                        } else if (i7 == 100) {
                            i9 = 8;
                        } else if (i7 == 110) {
                            i9 = 16;
                        } else if (i7 != 122) {
                            i9 = i7 != 244 ? -1 : 64;
                        } else {
                            i9 = 32;
                        }
                        if (i9 == -1) {
                            AbstractC0462h.m1170j("Unknown AVC profile: ", "CodecSpecificDataUtil", i7);
                            return null;
                        }
                        switch (i8) {
                            case 10:
                                i10 = -1;
                                i11 = 1;
                                break;
                            case 11:
                                i10 = -1;
                                i11 = 4;
                                break;
                            case 12:
                                i10 = -1;
                                i11 = 8;
                                break;
                            case 13:
                                i10 = -1;
                                i11 = 16;
                                break;
                            default:
                                switch (i8) {
                                    case 20:
                                        i10 = -1;
                                        i11 = 32;
                                        break;
                                    case 21:
                                        i10 = -1;
                                        i11 = 64;
                                        break;
                                    case 22:
                                        i10 = -1;
                                        i11 = 128;
                                        break;
                                    default:
                                        switch (i8) {
                                            case 30:
                                                i10 = -1;
                                                i11 = 256;
                                                break;
                                            case 31:
                                                i10 = -1;
                                                i11 = 512;
                                                break;
                                            case 32:
                                                i10 = -1;
                                                i11 = 1024;
                                                break;
                                            default:
                                                switch (i8) {
                                                    case 40:
                                                        i10 = -1;
                                                        i11 = 2048;
                                                        break;
                                                    case 41:
                                                        i10 = -1;
                                                        i11 = 4096;
                                                        break;
                                                    case 42:
                                                        i10 = -1;
                                                        i11 = 8192;
                                                        break;
                                                    default:
                                                        switch (i8) {
                                                            case 50:
                                                                i10 = -1;
                                                                i11 = 16384;
                                                                break;
                                                            case 51:
                                                                i10 = -1;
                                                                i11 = 32768;
                                                                break;
                                                            case 52:
                                                                i10 = -1;
                                                                i11 = 65536;
                                                                break;
                                                            default:
                                                                i10 = -1;
                                                                i11 = -1;
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        if (i11 != i10) {
                            return new Pair(Integer.valueOf(i9), Integer.valueOf(i11));
                        }
                        AbstractC0462h.m1170j("Unknown AVC level: ", "CodecSpecificDataUtil", i8);
                        return null;
                    } catch (NumberFormatException unused2) {
                        AbstractC0462h.m1171k("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                case "hev1":
                case "hvc1":
                    return AbstractC0633a.m1609b(str2, strArrSplit, c0573f);
                case "mp4a":
                    if (strArrSplit.length != 3) {
                        AbstractC0462h.m1171k("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        if (!"audio/mp4a-latm".equals(AbstractC0545H.m1356d(Integer.parseInt(strArrSplit[1], 16)))) {
                            return null;
                        }
                        int i19 = Integer.parseInt(strArrSplit[2]);
                        int i20 = 17;
                        if (i19 == 17) {
                            i12 = -1;
                        } else if (i19 != 20) {
                            i20 = 23;
                            if (i19 != 23) {
                                i20 = 29;
                                if (i19 != 29) {
                                    i20 = 39;
                                    if (i19 != 39) {
                                        i20 = 42;
                                        if (i19 != 42) {
                                            switch (i19) {
                                                case 1:
                                                    i12 = -1;
                                                    i20 = 1;
                                                    break;
                                                case 2:
                                                    i12 = -1;
                                                    i20 = 2;
                                                    break;
                                                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                    i12 = -1;
                                                    i20 = 3;
                                                    break;
                                                case 4:
                                                    i12 = -1;
                                                    i20 = 4;
                                                    break;
                                                case 5:
                                                    i12 = -1;
                                                    i20 = 5;
                                                    break;
                                                case 6:
                                                    i12 = -1;
                                                    i20 = 6;
                                                    break;
                                                default:
                                                    i12 = -1;
                                                    i20 = -1;
                                                    break;
                                            }
                                        } else {
                                            i12 = -1;
                                        }
                                    } else {
                                        i12 = -1;
                                    }
                                } else {
                                    i12 = -1;
                                }
                            } else {
                                i12 = -1;
                            }
                        } else {
                            i12 = -1;
                            i20 = 20;
                        }
                        if (i20 != i12) {
                            return new Pair(Integer.valueOf(i20), 0);
                        }
                        return null;
                    } catch (NumberFormatException unused3) {
                        AbstractC0462h.m1171k("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                case "s263":
                    Pair pair = new Pair(1, 1);
                    if (strArrSplit.length < 3) {
                        AbstractC0462h.m1171k("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                        return pair;
                    }
                    try {
                        return new Pair(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                    } catch (NumberFormatException unused4) {
                        AbstractC0462h.m1171k("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                        return pair;
                    }
                case "vp09":
                    if (strArrSplit.length < 3) {
                        AbstractC0462h.m1171k("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int i21 = Integer.parseInt(strArrSplit[1]);
                        int i22 = Integer.parseInt(strArrSplit[2]);
                        if (i21 == 0) {
                            i13 = 1;
                        } else if (i21 == 1) {
                            i13 = 2;
                        } else if (i21 != 2) {
                            i13 = i21 != 3 ? -1 : 8;
                        } else {
                            i13 = 4;
                        }
                        if (i13 == -1) {
                            AbstractC0462h.m1170j("Unknown VP9 profile: ", "CodecSpecificDataUtil", i21);
                            return null;
                        }
                        if (i22 == 10) {
                            i14 = -1;
                            i15 = 1;
                        } else if (i22 == 11) {
                            i14 = -1;
                            i15 = 2;
                        } else if (i22 == 20) {
                            i14 = -1;
                            i15 = 4;
                        } else if (i22 == 21) {
                            i14 = -1;
                            i15 = 8;
                        } else if (i22 == 30) {
                            i14 = -1;
                            i15 = 16;
                        } else if (i22 == 31) {
                            i14 = -1;
                            i15 = 32;
                        } else if (i22 == 40) {
                            i14 = -1;
                            i15 = 64;
                        } else if (i22 == 41) {
                            i14 = -1;
                            i15 = 128;
                        } else if (i22 == 50) {
                            i14 = -1;
                            i15 = 256;
                        } else if (i22 != 51) {
                            switch (i22) {
                                case 60:
                                    i14 = -1;
                                    i15 = 2048;
                                    break;
                                case 61:
                                    i14 = -1;
                                    i15 = 4096;
                                    break;
                                case 62:
                                    i14 = -1;
                                    i15 = 8192;
                                    break;
                                default:
                                    i14 = -1;
                                    i15 = -1;
                                    break;
                            }
                        } else {
                            i14 = -1;
                            i15 = 512;
                        }
                        if (i15 != i14) {
                            return new Pair(Integer.valueOf(i13), Integer.valueOf(i15));
                        }
                        AbstractC0462h.m1170j("Unknown VP9 level: ", "CodecSpecificDataUtil", i22);
                        return null;
                    } catch (NumberFormatException unused5) {
                        AbstractC0462h.m1171k("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized List m3985e(String str, boolean z3, boolean z4) {
        try {
            C1612u c1612u = new C1612u(str, z3, z4);
            HashMap map = f7337a;
            List list = (List) map.get(c1612u);
            if (list != null) {
                return list;
            }
            C0334e c0334e = new C0334e();
            c0334e.f1062g = (z3 || z4) ? 1 : 0;
            ArrayList arrayListM3986f = m3986f(c1612u, c0334e);
            if (z3 && arrayListM3986f.isEmpty() && AbstractC0632A.f2454a <= 23) {
                arrayListM3986f = m3986f(c1612u, new C1528a(5));
                if (!arrayListM3986f.isEmpty()) {
                    AbstractC0646n.m1647y("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C1606o) arrayListM3986f.get(0)).f7252a);
                }
            }
            m3981a(str, arrayListM3986f);
            AbstractC1676G abstractC1676GM4117n = AbstractC1676G.m4117n(arrayListM3986f);
            map.put(c1612u, abstractC1676GM4117n);
            return abstractC1676GM4117n;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m3986f(C1612u c1612u, InterfaceC1614w interfaceC1614w) throws C1613v {
        String strM3983c;
        String str;
        String str2;
        InterfaceC1614w interfaceC1614w2 = interfaceC1614w;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = c1612u.f7334a;
            int iMo926f = interfaceC1614w2.mo926f();
            boolean zMo934x = interfaceC1614w2.mo934x();
            int i3 = 0;
            while (i3 < iMo926f) {
                MediaCodecInfo mediaCodecInfoMo930j = interfaceC1614w2.mo930j(i3);
                int i4 = AbstractC0632A.f2454a;
                if (i4 < 29 || !mediaCodecInfoMo930j.isAlias()) {
                    String name = mediaCodecInfoMo930j.getName();
                    if (m3988h(mediaCodecInfoMo930j, name, zMo934x, str3) && (strM3983c = m3983c(mediaCodecInfoMo930j, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo930j.getCapabilitiesForType(strM3983c);
                            boolean zMo933t = interfaceC1614w2.mo933t("tunneled-playback", strM3983c, capabilitiesForType);
                            boolean zMo925e = interfaceC1614w2.mo925e("tunneled-playback", capabilitiesForType);
                            boolean z3 = c1612u.f7336c;
                            if ((z3 || !zMo925e) && (!z3 || zMo933t)) {
                                boolean zMo933t2 = interfaceC1614w2.mo933t("secure-playback", strM3983c, capabilitiesForType);
                                boolean zMo925e2 = interfaceC1614w2.mo925e("secure-playback", capabilitiesForType);
                                boolean z4 = c1612u.f7335b;
                                if ((z4 || !zMo925e2) && (!z4 || zMo933t2)) {
                                    boolean zIsHardwareAccelerated = i4 >= 29 ? mediaCodecInfoMo930j.isHardwareAccelerated() : !m3989i(mediaCodecInfoMo930j, str3);
                                    m3989i(mediaCodecInfoMo930j, str3);
                                    if (i4 >= 29) {
                                        mediaCodecInfoMo930j.isVendor();
                                    } else {
                                        String strM3288K = AbstractC1303m.m3288K(mediaCodecInfoMo930j.getName());
                                        if (!strM3288K.startsWith("omx.google.") && !strM3288K.startsWith("c2.android.")) {
                                            strM3288K.startsWith("c2.google.");
                                        }
                                    }
                                    if (!(zMo934x && z4 == zMo933t2) && (zMo934x || z4)) {
                                        str2 = name;
                                        boolean z5 = zIsHardwareAccelerated;
                                        if (!zMo934x && zMo933t2) {
                                            str = strM3983c;
                                            try {
                                                arrayList.add(C1606o.m3937h(str2 + ".secure", str3, str, capabilitiesForType, z5, true));
                                                break;
                                            } catch (Exception e3) {
                                                e = e3;
                                                if (AbstractC0632A.f2454a <= 23 || arrayList.isEmpty()) {
                                                    AbstractC0646n.m1635m("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                                AbstractC0646n.m1635m("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                i3++;
                                                interfaceC1614w2 = interfaceC1614w;
                                            }
                                        }
                                    } else {
                                        str = strM3983c;
                                        try {
                                            str2 = name;
                                            try {
                                                arrayList.add(C1606o.m3937h(name, str3, str, capabilitiesForType, zIsHardwareAccelerated, false));
                                            } catch (Exception e4) {
                                                e = e4;
                                                str = str;
                                                if (AbstractC0632A.f2454a <= 23) {
                                                }
                                                AbstractC0646n.m1635m("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            str2 = name;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e6) {
                            e = e6;
                            str = strM3983c;
                            str2 = name;
                        }
                    }
                }
                i3++;
                interfaceC1614w2 = interfaceC1614w;
            }
            return arrayList;
        } catch (Exception e7) {
            throw new C1613v("Failed to query underlying media codecs", e7);
        }
    }

    /* JADX INFO: renamed from: g */
    public static C1692X m3987g(C1601j c1601j, C0583o c0583o, boolean z3, boolean z4) {
        List listM3985e;
        String str = c0583o.f2154n;
        c1601j.getClass();
        List listM3985e2 = m3985e(str, z3, z4);
        String strM3982b = m3982b(c0583o);
        if (strM3982b == null) {
            listM3985e = C1692X.f7629k;
        } else {
            c1601j.getClass();
            listM3985e = m3985e(strM3982b, z3, z4);
        }
        C1673D c1673dM4116m = AbstractC1676G.m4116m();
        c1673dM4116m.m4104c(listM3985e2);
        c1673dM4116m.m4104c(listM3985e);
        return c1673dM4116m.m4112f();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m3988h(MediaCodecInfo mediaCodecInfo, String str, boolean z3, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z3 && str.endsWith(".secure")) {
            return false;
        }
        int i3 = AbstractC0632A.f2454a;
        if (i3 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(AbstractC0632A.f2456c))) {
            String str3 = AbstractC0632A.f2455b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i3 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m3989i(MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC0632A.f2454a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (AbstractC0545H.m1360h(str)) {
            return true;
        }
        String strM3288K = AbstractC1303m.m3288K(mediaCodecInfo.getName());
        if (strM3288K.startsWith("arc.")) {
            return false;
        }
        if (strM3288K.startsWith("omx.google.") || strM3288K.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strM3288K.startsWith("omx.sec.") && strM3288K.contains(".sw.")) || strM3288K.equals("omx.qcom.video.decoder.hevcswvdec") || strM3288K.startsWith("c2.android.") || strM3288K.startsWith("c2.google.")) {
            return true;
        }
        return (strM3288K.startsWith("omx.") || strM3288K.startsWith("c2.")) ? false : true;
    }
}
