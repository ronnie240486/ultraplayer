package p030K0;

import android.support.v4.media.session.C0858A;
import android.util.Pair;
import android.util.SparseArray;
import androidx.emoji2.text.C0924n;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import p000A.C0031d;
import p045P0.AbstractC0462h;
import p045P0.InterfaceC0463i;
import p048Q0.C0508g;
import p055T.AbstractC0545H;
import p055T.AbstractC0571e;
import p055T.C0546I;
import p055T.C0573f;
import p055T.C0578j;
import p055T.C0579k;
import p055T.C0582n;
import p055T.C0583o;
import p055T.C0587s;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p067X.AbstractC0684p;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.AbstractC2229b;
import p145s0.C2225D;
import p145s0.C2227F;
import p145s0.C2228a;
import p145s0.C2230c;
import p145s0.C2236i;
import p145s0.C2237j;
import p145s0.C2244q;
import p145s0.C2248u;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: K0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0333d implements InterfaceC2240m {

    /* JADX INFO: renamed from: e0 */
    public static final byte[] f1000e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: f0 */
    public static final byte[] f1001f0;

    /* JADX INFO: renamed from: g0 */
    public static final byte[] f1002g0;

    /* JADX INFO: renamed from: h0 */
    public static final byte[] f1003h0;

    /* JADX INFO: renamed from: i0 */
    public static final UUID f1004i0;

    /* JADX INFO: renamed from: j0 */
    public static final Map f1005j0;

    /* JADX INFO: renamed from: A */
    public boolean f1006A;

    /* JADX INFO: renamed from: B */
    public long f1007B;

    /* JADX INFO: renamed from: C */
    public long f1008C;

    /* JADX INFO: renamed from: D */
    public long f1009D;

    /* JADX INFO: renamed from: E */
    public C0334e f1010E;

    /* JADX INFO: renamed from: F */
    public C0334e f1011F;

    /* JADX INFO: renamed from: G */
    public boolean f1012G;

    /* JADX INFO: renamed from: H */
    public boolean f1013H;

    /* JADX INFO: renamed from: I */
    public int f1014I;

    /* JADX INFO: renamed from: J */
    public long f1015J;

    /* JADX INFO: renamed from: K */
    public long f1016K;

    /* JADX INFO: renamed from: L */
    public int f1017L;

    /* JADX INFO: renamed from: M */
    public int f1018M;

    /* JADX INFO: renamed from: N */
    public int[] f1019N;

    /* JADX INFO: renamed from: O */
    public int f1020O;

    /* JADX INFO: renamed from: P */
    public int f1021P;

    /* JADX INFO: renamed from: Q */
    public int f1022Q;

    /* JADX INFO: renamed from: R */
    public int f1023R;

    /* JADX INFO: renamed from: S */
    public boolean f1024S;

    /* JADX INFO: renamed from: T */
    public long f1025T;

    /* JADX INFO: renamed from: U */
    public int f1026U;

    /* JADX INFO: renamed from: V */
    public int f1027V;

    /* JADX INFO: renamed from: W */
    public int f1028W;

    /* JADX INFO: renamed from: X */
    public boolean f1029X;

    /* JADX INFO: renamed from: Y */
    public boolean f1030Y;

    /* JADX INFO: renamed from: Z */
    public boolean f1031Z;

    /* JADX INFO: renamed from: a */
    public final C0331b f1032a;

    /* JADX INFO: renamed from: a0 */
    public int f1033a0;

    /* JADX INFO: renamed from: b */
    public final C0335f f1034b;

    /* JADX INFO: renamed from: b0 */
    public byte f1035b0;

    /* JADX INFO: renamed from: c */
    public final SparseArray f1036c;

    /* JADX INFO: renamed from: c0 */
    public boolean f1037c0;

    /* JADX INFO: renamed from: d */
    public final boolean f1038d;

    /* JADX INFO: renamed from: d0 */
    public InterfaceC2242o f1039d0;

    /* JADX INFO: renamed from: e */
    public final boolean f1040e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0463i f1041f;

    /* JADX INFO: renamed from: g */
    public final C0651s f1042g;

    /* JADX INFO: renamed from: h */
    public final C0651s f1043h;

    /* JADX INFO: renamed from: i */
    public final C0651s f1044i;

    /* JADX INFO: renamed from: j */
    public final C0651s f1045j;

    /* JADX INFO: renamed from: k */
    public final C0651s f1046k;

    /* JADX INFO: renamed from: l */
    public final C0651s f1047l;

    /* JADX INFO: renamed from: m */
    public final C0651s f1048m;

    /* JADX INFO: renamed from: n */
    public final C0651s f1049n;

    /* JADX INFO: renamed from: o */
    public final C0651s f1050o;

    /* JADX INFO: renamed from: p */
    public final C0651s f1051p;

    /* JADX INFO: renamed from: q */
    public ByteBuffer f1052q;

    /* JADX INFO: renamed from: r */
    public long f1053r;

    /* JADX INFO: renamed from: s */
    public long f1054s;

    /* JADX INFO: renamed from: t */
    public long f1055t;

    /* JADX INFO: renamed from: u */
    public long f1056u;

    /* JADX INFO: renamed from: v */
    public long f1057v;

    /* JADX INFO: renamed from: w */
    public C0332c f1058w;

    /* JADX INFO: renamed from: x */
    public boolean f1059x;

    /* JADX INFO: renamed from: y */
    public int f1060y;

    /* JADX INFO: renamed from: z */
    public long f1061z;

    static {
        int i3 = AbstractC0632A.f2454a;
        f1001f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f1002g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f1003h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f1004i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        AbstractC0462h.m1168h(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC0462h.m1168h(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f1005j0 = Collections.unmodifiableMap(map);
    }

    public C0333d(InterfaceC0463i interfaceC0463i, int i3) {
        C0331b c0331b = new C0331b();
        this.f1054s = -1L;
        this.f1055t = -9223372036854775807L;
        this.f1056u = -9223372036854775807L;
        this.f1057v = -9223372036854775807L;
        this.f1007B = -1L;
        this.f1008C = -1L;
        this.f1009D = -9223372036854775807L;
        this.f1032a = c0331b;
        c0331b.f944d = new C0031d(11, this);
        this.f1041f = interfaceC0463i;
        this.f1038d = (i3 & 1) == 0;
        this.f1040e = (i3 & 2) == 0;
        this.f1034b = new C0335f();
        this.f1036c = new SparseArray();
        this.f1044i = new C0651s(4);
        this.f1045j = new C0651s(ByteBuffer.allocate(4).putInt(-1).array());
        this.f1046k = new C0651s(4);
        this.f1042g = new C0651s(AbstractC0684p.f2629a);
        this.f1043h = new C0651s(4);
        this.f1047l = new C0651s();
        this.f1048m = new C0651s();
        this.f1049n = new C0651s(8);
        this.f1050o = new C0651s();
        this.f1051p = new C0651s();
        this.f1019N = new int[1];
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m912i(long j3, long j4, String str) {
        AbstractC0646n.m1625c(j3 != -9223372036854775807L);
        int i3 = (int) (j3 / 3600000000L);
        long j5 = j3 - (((long) i3) * 3600000000L);
        int i4 = (int) (j5 / 60000000);
        long j6 = j5 - (((long) i4) * 60000000);
        int i5 = (int) (j6 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf((int) ((j6 - (((long) i5) * 1000000)) / j4)));
        int i6 = AbstractC0632A.f2454a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: b */
    public final void m913b(int i3) {
        if (this.f1010E == null || this.f1011F == null) {
            throw C0546I.m1365a(null, "Element " + i3 + " must be in a Cues");
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final void m914d(int i3) {
        if (this.f1058w != null) {
            return;
        }
        throw C0546I.m1365a(null, "Element " + i3 + " must be in a TrackEntry");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x025b A[PHI: r5
      0x025b: PHI (r5v207 java.lang.String) = 
      (r5v19 java.lang.String)
      (r5v20 java.lang.String)
      (r5v21 java.lang.String)
      (r5v22 java.lang.String)
      (r5v23 java.lang.String)
      (r5v24 java.lang.String)
      (r5v25 java.lang.String)
      (r5v26 java.lang.String)
      (r5v27 java.lang.String)
      (r5v28 java.lang.String)
      (r5v29 java.lang.String)
      (r5v30 java.lang.String)
      (r5v31 java.lang.String)
      (r5v32 java.lang.String)
      (r5v33 java.lang.String)
      (r5v34 java.lang.String)
      (r5v35 java.lang.String)
      (r5v36 java.lang.String)
      (r5v37 java.lang.String)
      (r5v38 java.lang.String)
      (r5v39 java.lang.String)
      (r5v40 java.lang.String)
      (r5v41 java.lang.String)
      (r5v42 java.lang.String)
      (r5v43 java.lang.String)
      (r5v44 java.lang.String)
      (r5v45 java.lang.String)
      (r5v46 java.lang.String)
      (r5v47 java.lang.String)
      (r5v48 java.lang.String)
      (r5v208 java.lang.String)
     binds: [B:222:0x04ff, B:218:0x04ee, B:214:0x04dc, B:210:0x04c9, B:206:0x04b4, B:202:0x049e, B:198:0x0486, B:194:0x046e, B:190:0x0456, B:186:0x043e, B:182:0x0426, B:178:0x040e, B:174:0x03f8, B:170:0x03e2, B:166:0x03ca, B:162:0x03b2, B:158:0x039a, B:154:0x0384, B:150:0x036c, B:146:0x0354, B:142:0x033c, B:138:0x0326, B:134:0x0310, B:130:0x02f8, B:126:0x02e0, B:122:0x02c8, B:118:0x02b0, B:114:0x0298, B:110:0x0280, B:106:0x026a, B:101:0x0259] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:243:0x0581 A[PHI: r40
      0x0581: PHI (r40v39 java.lang.String) = 
      (r40v4 java.lang.String)
      (r40v5 java.lang.String)
      (r40v6 java.lang.String)
      (r40v7 java.lang.String)
      (r40v8 java.lang.String)
      (r40v9 java.lang.String)
      (r40v10 java.lang.String)
      (r40v11 java.lang.String)
      (r40v12 java.lang.String)
      (r40v13 java.lang.String)
      (r40v14 java.lang.String)
      (r40v15 java.lang.String)
      (r40v16 java.lang.String)
      (r40v17 java.lang.String)
      (r40v18 java.lang.String)
      (r40v19 java.lang.String)
      (r40v20 java.lang.String)
      (r40v21 java.lang.String)
      (r40v22 java.lang.String)
      (r40v23 java.lang.String)
      (r40v24 java.lang.String)
      (r40v25 java.lang.String)
      (r40v26 java.lang.String)
      (r40v27 java.lang.String)
      (r40v28 java.lang.String)
      (r40v29 java.lang.String)
      (r40v30 java.lang.String)
      (r40v31 java.lang.String)
      (r40v32 java.lang.String)
      (r40v33 java.lang.String)
      (r40v34 java.lang.String)
      (r40v35 java.lang.String)
      (r40v40 java.lang.String)
     binds: [B:373:0x0768, B:369:0x075d, B:365:0x0752, B:361:0x0747, B:357:0x073c, B:353:0x0731, B:349:0x0726, B:345:0x0719, B:341:0x0709, B:337:0x06f9, B:333:0x06e9, B:329:0x06d9, B:325:0x06c9, B:321:0x06b9, B:317:0x06a9, B:313:0x0699, B:309:0x0689, B:305:0x0679, B:301:0x0669, B:297:0x0659, B:293:0x0649, B:289:0x0639, B:285:0x0629, B:281:0x0619, B:277:0x0609, B:273:0x05f9, B:269:0x05e9, B:265:0x05d9, B:261:0x05c9, B:257:0x05b9, B:253:0x05a9, B:249:0x0599, B:242:0x057f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:534:0x0b7b  */
    /* JADX WARN: Code duplicated, block: B:539:0x0b92  */
    /* JADX WARN: Code duplicated, block: B:540:0x0b94  */
    /* JADX WARN: Code duplicated, block: B:543:0x0ba5  */
    /* JADX WARN: Code duplicated, block: B:545:0x0bb4  */
    /* JADX WARN: Code duplicated, block: B:547:0x0bba  */
    /* JADX WARN: Code duplicated, block: B:549:0x0bbe  */
    /* JADX WARN: Code duplicated, block: B:551:0x0bc3  */
    /* JADX WARN: Code duplicated, block: B:554:0x0bcb  */
    /* JADX WARN: Code duplicated, block: B:556:0x0bd0  */
    /* JADX WARN: Code duplicated, block: B:559:0x0bd7  */
    /* JADX WARN: Code duplicated, block: B:562:0x0be7  */
    /* JADX WARN: Code duplicated, block: B:565:0x0bed  */
    /* JADX WARN: Code duplicated, block: B:567:0x0bf3  */
    /* JADX WARN: Code duplicated, block: B:585:0x0c29  */
    /* JADX WARN: Code duplicated, block: B:589:0x0cd9  */
    /* JADX WARN: Code duplicated, block: B:592:0x0cde  */
    /* JADX WARN: Code duplicated, block: B:595:0x0cf1  */
    /* JADX WARN: Code duplicated, block: B:598:0x0cf6  */
    /* JADX WARN: Code duplicated, block: B:604:0x0d0f  */
    /* JADX WARN: Code duplicated, block: B:605:0x0d11  */
    /* JADX WARN: Code duplicated, block: B:607:0x0d1b  */
    /* JADX WARN: Code duplicated, block: B:608:0x0d1e  */
    /* JADX WARN: Code duplicated, block: B:610:0x0d28  */
    /* JADX WARN: Code duplicated, block: B:616:0x0d40  */
    /* JADX WARN: Code duplicated, block: B:618:0x0d5b  */
    /* JADX WARN: Code duplicated, block: B:620:0x0d63  */
    /* JADX WARN: Code duplicated, block: B:636:0x0d93  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v14, types: [s0.j] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r3v41, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v20 */
    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) throws C0546I {
        String str;
        boolean z3;
        int i3;
        String str2;
        ?? r3;
        int iM936b;
        int iM935a;
        String str3;
        int i4;
        String str4;
        byte b3;
        byte b4;
        List listSingletonList;
        int iM1605x;
        int i5;
        String str5;
        RuntimeException runtimeException;
        Pair pair;
        String str6;
        int i6;
        C0582n c0582n;
        boolean zM1360h;
        int i7;
        int i8;
        int i9;
        float f;
        C0573f c0573f;
        String str7;
        int iIntValue;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        String str8;
        C0924n c0924nM2411b;
        String str9;
        String str10;
        InterfaceC2252y c2244q;
        int i13;
        C0333d c0333d = this;
        String str11 = "A_MPEG/L2";
        String str12 = "A_VORBIS";
        String str13 = "A_TRUEHD";
        String str14 = "A_MS/ACM";
        String str15 = "V_MPEG4/ISO/SP";
        String str16 = "V_MPEG4/ISO/AP";
        String str17 = "A_OPUS";
        c0333d.f1013H = false;
        boolean z4 = true;
        while (z4 && !c0333d.f1013H) {
            C0331b c0331b = c0333d.f1032a;
            AbstractC0646n.m1631i(c0331b.f944d);
            while (true) {
                ArrayDeque arrayDeque = c0331b.f942b;
                C0330a c0330a = (C0330a) arrayDeque.peek();
                if (c0330a != null) {
                    String str18 = str17;
                    if (((C2237j) interfaceC2241n).f9629j >= c0330a.f940b) {
                        C0031d c0031d = c0331b.f944d;
                        int i14 = ((C0330a) arrayDeque.pop()).f939a;
                        C0333d c0333d2 = (C0333d) c0031d.f38h;
                        AbstractC0646n.m1631i(c0333d2.f1039d0);
                        SparseArray sparseArray = c0333d2.f1036c;
                        if (i14 != 160) {
                            if (i14 == 174) {
                                String str19 = str14;
                                String str20 = str15;
                                String str21 = str16;
                                C0332c c0332c = c0333d2.f1058w;
                                AbstractC0646n.m1631i(c0332c);
                                String str22 = c0332c.f975b;
                                if (str22 == null) {
                                    throw C0546I.m1365a(null, "CodecId is missing in TrackEntry element");
                                }
                                switch (str22.hashCode()) {
                                    case -2095576542:
                                        str4 = str18;
                                        str16 = str21;
                                        str14 = str19;
                                        str15 = str20;
                                        b3 = str22.equals(str16) ? (byte) 0 : (byte) -1;
                                        break;
                                    case -2095575984:
                                        str4 = str18;
                                        str14 = str19;
                                        str15 = str20;
                                        if (str22.equals(str15)) {
                                            str16 = str21;
                                            b3 = 1;
                                        } else {
                                            str16 = str21;
                                        }
                                        break;
                                    case -1985379776:
                                        str4 = str18;
                                        str14 = str19;
                                        str16 = str21;
                                        if (str22.equals(str14)) {
                                            str15 = str20;
                                            b3 = 2;
                                        } else {
                                            str15 = str20;
                                        }
                                        break;
                                    case -1784763192:
                                        str4 = str18;
                                        if (str22.equals(str13)) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 3;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case -1730367663:
                                        str4 = str18;
                                        if (str22.equals(str12)) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 4;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case -1482641358:
                                        str4 = str18;
                                        if (str22.equals(str11)) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 5;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case -1482641357:
                                        str4 = str18;
                                        if (str22.equals("A_MPEG/L3")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 6;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case -1373388978:
                                        str4 = str18;
                                        if (str22.equals("V_MS/VFW/FOURCC")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 7;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case -933872740:
                                        str4 = str18;
                                        if (str22.equals("S_DVBSUB")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 8;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case -538363189:
                                        str4 = str18;
                                        if (str22.equals("V_MPEG4/ISO/ASP")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 9;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case -538363109:
                                        str4 = str18;
                                        if (str22.equals("V_MPEG4/ISO/AVC")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 10;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case -425012669:
                                        str4 = str18;
                                        if (str22.equals("S_VOBSUB")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 11;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case -356037306:
                                        str4 = str18;
                                        if (str22.equals("A_DTS/LOSSLESS")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 12;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 62923557:
                                        str4 = str18;
                                        if (str22.equals("A_AAC")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 13;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 62923603:
                                        str4 = str18;
                                        if (str22.equals("A_AC3")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 14;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 62927045:
                                        str4 = str18;
                                        if (str22.equals("A_DTS")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 15;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 82318131:
                                        str4 = str18;
                                        if (str22.equals("V_AV1")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 16;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 82338133:
                                        str4 = str18;
                                        if (str22.equals("V_VP8")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 17;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 82338134:
                                        str4 = str18;
                                        if (str22.equals("V_VP9")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 18;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 99146302:
                                        str4 = str18;
                                        if (str22.equals("S_HDMV/PGS")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 19;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 444813526:
                                        str4 = str18;
                                        if (str22.equals("V_THEORA")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 20;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 542569478:
                                        str4 = str18;
                                        if (str22.equals("A_DTS/EXPRESS")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 21;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 635596514:
                                        str4 = str18;
                                        if (str22.equals("A_PCM/FLOAT/IEEE")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 22;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 725948237:
                                        str4 = str18;
                                        if (str22.equals("A_PCM/INT/BIG")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 23;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 725957860:
                                        str4 = str18;
                                        if (str22.equals("A_PCM/INT/LIT")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 24;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 738597099:
                                        str4 = str18;
                                        if (str22.equals("S_TEXT/ASS")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 25;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 855502857:
                                        str4 = str18;
                                        if (str22.equals("V_MPEGH/ISO/HEVC")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 26;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 1045209816:
                                        str4 = str18;
                                        if (str22.equals("S_TEXT/WEBVTT")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 27;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 1422270023:
                                        str4 = str18;
                                        if (str22.equals("S_TEXT/UTF8")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 28;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 1809237540:
                                        str4 = str18;
                                        if (str22.equals("V_MPEG2")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 29;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 1950749482:
                                        str4 = str18;
                                        if (str22.equals("A_EAC3")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 30;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 1950789798:
                                        str4 = str18;
                                        if (str22.equals("A_FLAC")) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 31;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    case 1951062397:
                                        str4 = str18;
                                        if (str22.equals(str4)) {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                            b3 = 32;
                                        } else {
                                            str16 = str21;
                                            str14 = str19;
                                            str15 = str20;
                                        }
                                        break;
                                    default:
                                        str4 = str18;
                                        str16 = str21;
                                        str14 = str19;
                                        str15 = str20;
                                        break;
                                }
                                switch (b3) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        InterfaceC2242o interfaceC2242o = c0333d2.f1039d0;
                                        int i15 = c0332c.f976c;
                                        String str23 = "video/x-unknown";
                                        switch (str22.hashCode()) {
                                            case -2095576542:
                                                str3 = str4;
                                                if (str22.equals(str16)) {
                                                    b4 = 0;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case -2095575984:
                                                str3 = str4;
                                                if (str22.equals(str15)) {
                                                    b4 = 1;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case -1985379776:
                                                str3 = str4;
                                                if (str22.equals(str14)) {
                                                    b4 = 2;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case -1784763192:
                                                str3 = str4;
                                                if (str22.equals(str13)) {
                                                    b4 = 3;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case -1730367663:
                                                str3 = str4;
                                                if (str22.equals(str12)) {
                                                    b4 = 4;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case -1482641358:
                                                str3 = str4;
                                                if (str22.equals(str11)) {
                                                    b4 = 5;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case -1482641357:
                                                str3 = str4;
                                                if (str22.equals("A_MPEG/L3")) {
                                                    b4 = 6;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case -1373388978:
                                                str3 = str4;
                                                if (str22.equals("V_MS/VFW/FOURCC")) {
                                                    b4 = 7;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case -933872740:
                                                str3 = str4;
                                                if (str22.equals("S_DVBSUB")) {
                                                    b4 = 8;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case -538363189:
                                                str3 = str4;
                                                if (str22.equals("V_MPEG4/ISO/ASP")) {
                                                    b4 = 9;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case -538363109:
                                                str3 = str4;
                                                if (str22.equals("V_MPEG4/ISO/AVC")) {
                                                    b4 = 10;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case -425012669:
                                                str3 = str4;
                                                if (str22.equals("S_VOBSUB")) {
                                                    b4 = 11;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case -356037306:
                                                str3 = str4;
                                                if (str22.equals("A_DTS/LOSSLESS")) {
                                                    b4 = 12;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 62923557:
                                                str3 = str4;
                                                if (str22.equals("A_AAC")) {
                                                    b4 = 13;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 62923603:
                                                str3 = str4;
                                                if (str22.equals("A_AC3")) {
                                                    b4 = 14;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 62927045:
                                                str3 = str4;
                                                if (str22.equals("A_DTS")) {
                                                    b4 = 15;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 82318131:
                                                str3 = str4;
                                                if (str22.equals("V_AV1")) {
                                                    b4 = 16;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 82338133:
                                                str3 = str4;
                                                if (str22.equals("V_VP8")) {
                                                    b4 = 17;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 82338134:
                                                str3 = str4;
                                                if (str22.equals("V_VP9")) {
                                                    b4 = 18;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 99146302:
                                                str3 = str4;
                                                if (str22.equals("S_HDMV/PGS")) {
                                                    b4 = 19;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 444813526:
                                                str3 = str4;
                                                if (str22.equals("V_THEORA")) {
                                                    b4 = 20;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 542569478:
                                                str3 = str4;
                                                if (str22.equals("A_DTS/EXPRESS")) {
                                                    b4 = 21;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 635596514:
                                                str3 = str4;
                                                if (str22.equals("A_PCM/FLOAT/IEEE")) {
                                                    b4 = 22;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 725948237:
                                                str3 = str4;
                                                if (str22.equals("A_PCM/INT/BIG")) {
                                                    b4 = 23;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 725957860:
                                                str3 = str4;
                                                if (str22.equals("A_PCM/INT/LIT")) {
                                                    b4 = 24;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 738597099:
                                                str3 = str4;
                                                if (str22.equals("S_TEXT/ASS")) {
                                                    b4 = 25;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 855502857:
                                                str3 = str4;
                                                if (str22.equals("V_MPEGH/ISO/HEVC")) {
                                                    b4 = 26;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 1045209816:
                                                str3 = str4;
                                                if (str22.equals("S_TEXT/WEBVTT")) {
                                                    b4 = 27;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 1422270023:
                                                str3 = str4;
                                                if (str22.equals("S_TEXT/UTF8")) {
                                                    b4 = 28;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 1809237540:
                                                str3 = str4;
                                                if (str22.equals("V_MPEG2")) {
                                                    b4 = 29;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 1950749482:
                                                str3 = str4;
                                                if (str22.equals("A_EAC3")) {
                                                    b4 = 30;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 1950789798:
                                                str3 = str4;
                                                if (str22.equals("A_FLAC")) {
                                                    b4 = 31;
                                                } else {
                                                    b4 = -1;
                                                }
                                                break;
                                            case 1951062397:
                                                if (str22.equals(str4)) {
                                                    str3 = str4;
                                                    b4 = 32;
                                                    break;
                                                }
                                            default:
                                                str3 = str4;
                                                b4 = -1;
                                                break;
                                        }
                                        switch (b4) {
                                            case 0:
                                            case 1:
                                            case 9:
                                                str11 = str11;
                                                str12 = str12;
                                                byte[] bArr2 = c0332c.f984k;
                                                str23 = "video/mp4v-es";
                                                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                                                iM1605x = -1;
                                                i5 = -1;
                                                str5 = null;
                                                if (c0332c.f962O != null && (c0924nM2411b = C0924n.m2411b(new C0651s(c0332c.f962O))) != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z5 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i16 = (z5 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8 || (i10 = c0332c.f990q) == i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = (c0332c.f987n * i9) / (c0332c.f986m * i10);
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f && c0332c.f953F != -1.0f && c0332c.f954G != -1.0f && c0332c.f955H != -1.0f && c0332c.f956I != -1.0f && c0332c.f957J != -1.0f && c0332c.f958K != -1.0f && c0332c.f959L != -1.0f && c0332c.f960M != -1.0f && c0332c.f961N != -1.0f) {
                                                                byte[] bArr3 = new byte[25];
                                                                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr3).order(ByteOrder.LITTLE_ENDIAN);
                                                                byteBufferOrder.put((byte) 0);
                                                                byteBufferOrder.putShort((short) ((c0332c.f952E * 50000.0f) + 0.5f));
                                                                byteBufferOrder.putShort((short) ((c0332c.f953F * 50000.0f) + 0.5f));
                                                                byteBufferOrder.putShort((short) ((c0332c.f954G * 50000.0f) + 0.5f));
                                                                byteBufferOrder.putShort((short) ((c0332c.f955H * 50000.0f) + 0.5f));
                                                                byteBufferOrder.putShort((short) ((c0332c.f956I * 50000.0f) + 0.5f));
                                                                byteBufferOrder.putShort((short) ((c0332c.f957J * 50000.0f) + 0.5f));
                                                                byteBufferOrder.putShort((short) ((c0332c.f958K * 50000.0f) + 0.5f));
                                                                byteBufferOrder.putShort((short) ((c0332c.f959L * 50000.0f) + 0.5f));
                                                                byteBufferOrder.putShort((short) (c0332c.f960M + 0.5f));
                                                                byteBufferOrder.putShort((short) (c0332c.f961N + 0.5f));
                                                                byteBufferOrder.putShort((short) c0332c.f950C);
                                                                byteBufferOrder.putShort((short) c0332c.f951D);
                                                                bArr = bArr3;
                                                            }
                                                            int i17 = c0332c.f999z;
                                                            int i18 = c0332c.f949B;
                                                            int i19 = c0332c.f948A;
                                                            int i20 = c0332c.f988o;
                                                            c0573f = new C0573f(i17, i18, i19, i20, i20, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null && map.containsKey(str7)) {
                                                            iIntValue = ((Integer) map.get(c0332c.f974a)).intValue();
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0 && Float.compare(c0332c.f993t, 0.0f) == 0 && Float.compare(c0332c.f994u, 0.0f) == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0 || Float.compare(c0332c.f995v, 180.0f) == 0) {
                                                                iIntValue = 180;
                                                            } else if (Float.compare(c0332c.f995v, -90.0f) == 0) {
                                                                iIntValue = 270;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23) && !"text/x-ssa".equals(str23) && !"text/vtt".equals(str23) && !"application/vobsub".equals(str23) && !"application/pgs".equals(str23) && !"application/dvbsubs".equals(str23)) {
                                                            throw C0546I.m1365a(null, "Unexpected MIME type.");
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null && !map.containsKey(str8)) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i16;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p;
                                                    interfaceC2226EMo344p.mo1176e(c0583o);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i16;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o2 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p2 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p2;
                                                interfaceC2226EMo344p2.mo1176e(c0583o2);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 2:
                                                str11 = str11;
                                                str12 = str12;
                                                C0651s c0651s = new C0651s(c0332c.m911a(c0332c.f975b));
                                                try {
                                                    int iM1680n = c0651s.m1680n();
                                                    if (iM1680n != 1) {
                                                        if (iM1680n == 65534) {
                                                            c0651s.m1665G(24);
                                                            long jM1681o = c0651s.m1681o();
                                                            UUID uuid = f1004i0;
                                                            if (jM1681o != uuid.getMostSignificantBits() || c0651s.m1681o() != uuid.getLeastSignificantBits()) {
                                                            }
                                                            str23 = "audio/x-unknown";
                                                            iM1605x = -1;
                                                            i5 = -1;
                                                            listSingletonList = null;
                                                            str5 = null;
                                                            if (c0332c.f962O != null) {
                                                                str5 = c0924nM2411b.f4016g;
                                                                str23 = "video/dolby-vision";
                                                            }
                                                            boolean z6 = c0332c.f970W;
                                                            if (c0332c.f969V) {
                                                                i6 = 2;
                                                            } else {
                                                                i6 = 0;
                                                            }
                                                            int i110 = (z6 ? 1 : 0) | i6;
                                                            c0582n = new C0582n();
                                                            zM1360h = AbstractC0545H.m1360h(str23);
                                                            Map map2 = f1005j0;
                                                            if (zM1360h) {
                                                                if (AbstractC0545H.m1363k(str23)) {
                                                                    if (c0332c.f991r == 0) {
                                                                        i11 = c0332c.f989p;
                                                                        i8 = -1;
                                                                        if (i11 == -1) {
                                                                            i11 = c0332c.f986m;
                                                                        }
                                                                        c0332c.f989p = i11;
                                                                        i12 = c0332c.f990q;
                                                                        if (i12 == -1) {
                                                                            i12 = c0332c.f987n;
                                                                        }
                                                                        c0332c.f990q = i12;
                                                                    } else {
                                                                        i8 = -1;
                                                                    }
                                                                    i9 = c0332c.f989p;
                                                                    if (i9 != i8) {
                                                                        f = -1.0f;
                                                                    } else {
                                                                        f = -1.0f;
                                                                    }
                                                                    if (c0332c.f998y) {
                                                                        bArr = c0332c.f952E == -1.0f ? null : null;
                                                                        int i111 = c0332c.f999z;
                                                                        int i112 = c0332c.f949B;
                                                                        int i113 = c0332c.f948A;
                                                                        int i21 = c0332c.f988o;
                                                                        c0573f = new C0573f(i111, i112, i113, i21, i21, bArr);
                                                                    } else {
                                                                        c0573f = null;
                                                                    }
                                                                    str7 = c0332c.f974a;
                                                                    if (str7 == null) {
                                                                        iIntValue = -1;
                                                                    } else {
                                                                        iIntValue = -1;
                                                                    }
                                                                    if (c0332c.f992s == 0) {
                                                                        if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                            iIntValue = 0;
                                                                        } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                            iIntValue = 90;
                                                                        } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                            iIntValue = 180;
                                                                        } else {
                                                                            iIntValue = 180;
                                                                        }
                                                                    }
                                                                    c0582n.f2121t = c0332c.f986m;
                                                                    c0582n.f2122u = c0332c.f987n;
                                                                    c0582n.f2125x = f;
                                                                    c0582n.f2124w = iIntValue;
                                                                    c0582n.f2126y = c0332c.f996w;
                                                                    c0582n.f2127z = c0332c.f997x;
                                                                    c0582n.f2091A = c0573f;
                                                                    i7 = 2;
                                                                } else {
                                                                    if ("application/x-subrip".equals(str23)) {
                                                                    }
                                                                    i7 = 3;
                                                                }
                                                                str8 = c0332c.f974a;
                                                                if (str8 != null) {
                                                                    c0582n.f2103b = c0332c.f974a;
                                                                }
                                                                c0582n.f2102a = Integer.toString(i15);
                                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                                c0582n.f2115n = i5;
                                                                c0582n.f2105d = c0332c.f971X;
                                                                c0582n.f2106e = i110;
                                                                c0582n.f2117p = listSingletonList;
                                                                c0582n.f2111j = str5;
                                                                c0582n.f2118q = c0332c.f985l;
                                                                C0583o c0583o3 = new C0583o(c0582n);
                                                                InterfaceC2226E interfaceC2226EMo344p3 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                                c0332c.f972Y = interfaceC2226EMo344p3;
                                                                interfaceC2226EMo344p3.mo1176e(c0583o3);
                                                                sparseArray.put(c0332c.f976c, c0332c);
                                                                c0333d2 = c0333d2;
                                                            } else {
                                                                c0582n.f2092B = c0332c.f963P;
                                                                c0582n.f2093C = c0332c.f965R;
                                                                c0582n.f2094D = iM1605x;
                                                                i7 = 1;
                                                            }
                                                            str8 = c0332c.f974a;
                                                            if (str8 != null) {
                                                                c0582n.f2103b = c0332c.f974a;
                                                            }
                                                            c0582n.f2102a = Integer.toString(i15);
                                                            c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                            c0582n.f2115n = i5;
                                                            c0582n.f2105d = c0332c.f971X;
                                                            c0582n.f2106e = i110;
                                                            c0582n.f2117p = listSingletonList;
                                                            c0582n.f2111j = str5;
                                                            c0582n.f2118q = c0332c.f985l;
                                                            C0583o c0583o4 = new C0583o(c0582n);
                                                            InterfaceC2226E interfaceC2226EMo344p4 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                            c0332c.f972Y = interfaceC2226EMo344p4;
                                                            interfaceC2226EMo344p4.mo1176e(c0583o4);
                                                            sparseArray.put(c0332c.f976c, c0332c);
                                                            c0333d2 = c0333d2;
                                                            break;
                                                        }
                                                        AbstractC0646n.m1647y("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                        str23 = "audio/x-unknown";
                                                        iM1605x = -1;
                                                        i5 = -1;
                                                        listSingletonList = null;
                                                        str5 = null;
                                                        if (c0332c.f962O != null) {
                                                            str5 = c0924nM2411b.f4016g;
                                                            str23 = "video/dolby-vision";
                                                        }
                                                        boolean z7 = c0332c.f970W;
                                                        if (c0332c.f969V) {
                                                            i6 = 2;
                                                        } else {
                                                            i6 = 0;
                                                        }
                                                        int i114 = (z7 ? 1 : 0) | i6;
                                                        c0582n = new C0582n();
                                                        zM1360h = AbstractC0545H.m1360h(str23);
                                                        Map map3 = f1005j0;
                                                        if (zM1360h) {
                                                            if (AbstractC0545H.m1363k(str23)) {
                                                                if (c0332c.f991r == 0) {
                                                                    i11 = c0332c.f989p;
                                                                    i8 = -1;
                                                                    if (i11 == -1) {
                                                                        i11 = c0332c.f986m;
                                                                    }
                                                                    c0332c.f989p = i11;
                                                                    i12 = c0332c.f990q;
                                                                    if (i12 == -1) {
                                                                        i12 = c0332c.f987n;
                                                                    }
                                                                    c0332c.f990q = i12;
                                                                } else {
                                                                    i8 = -1;
                                                                }
                                                                i9 = c0332c.f989p;
                                                                if (i9 != i8) {
                                                                    f = -1.0f;
                                                                } else {
                                                                    f = -1.0f;
                                                                }
                                                                if (c0332c.f998y) {
                                                                    if (c0332c.f952E == -1.0f) {
                                                                    }
                                                                    int i115 = c0332c.f999z;
                                                                    int i116 = c0332c.f949B;
                                                                    int i117 = c0332c.f948A;
                                                                    int i22 = c0332c.f988o;
                                                                    c0573f = new C0573f(i115, i116, i117, i22, i22, bArr);
                                                                } else {
                                                                    c0573f = null;
                                                                }
                                                                str7 = c0332c.f974a;
                                                                if (str7 == null) {
                                                                    iIntValue = -1;
                                                                } else {
                                                                    iIntValue = -1;
                                                                }
                                                                if (c0332c.f992s == 0) {
                                                                    if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                        iIntValue = 0;
                                                                    } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                        iIntValue = 90;
                                                                    } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                        iIntValue = 180;
                                                                    } else {
                                                                        iIntValue = 180;
                                                                    }
                                                                }
                                                                c0582n.f2121t = c0332c.f986m;
                                                                c0582n.f2122u = c0332c.f987n;
                                                                c0582n.f2125x = f;
                                                                c0582n.f2124w = iIntValue;
                                                                c0582n.f2126y = c0332c.f996w;
                                                                c0582n.f2127z = c0332c.f997x;
                                                                c0582n.f2091A = c0573f;
                                                                i7 = 2;
                                                            } else {
                                                                if ("application/x-subrip".equals(str23)) {
                                                                }
                                                                i7 = 3;
                                                            }
                                                            str8 = c0332c.f974a;
                                                            if (str8 != null) {
                                                                c0582n.f2103b = c0332c.f974a;
                                                            }
                                                            c0582n.f2102a = Integer.toString(i15);
                                                            c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                            c0582n.f2115n = i5;
                                                            c0582n.f2105d = c0332c.f971X;
                                                            c0582n.f2106e = i114;
                                                            c0582n.f2117p = listSingletonList;
                                                            c0582n.f2111j = str5;
                                                            c0582n.f2118q = c0332c.f985l;
                                                            C0583o c0583o5 = new C0583o(c0582n);
                                                            InterfaceC2226E interfaceC2226EMo344p5 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                            c0332c.f972Y = interfaceC2226EMo344p5;
                                                            interfaceC2226EMo344p5.mo1176e(c0583o5);
                                                            sparseArray.put(c0332c.f976c, c0332c);
                                                            c0333d2 = c0333d2;
                                                        } else {
                                                            c0582n.f2092B = c0332c.f963P;
                                                            c0582n.f2093C = c0332c.f965R;
                                                            c0582n.f2094D = iM1605x;
                                                            i7 = 1;
                                                        }
                                                        str8 = c0332c.f974a;
                                                        if (str8 != null) {
                                                            c0582n.f2103b = c0332c.f974a;
                                                        }
                                                        c0582n.f2102a = Integer.toString(i15);
                                                        c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                        c0582n.f2115n = i5;
                                                        c0582n.f2105d = c0332c.f971X;
                                                        c0582n.f2106e = i114;
                                                        c0582n.f2117p = listSingletonList;
                                                        c0582n.f2111j = str5;
                                                        c0582n.f2118q = c0332c.f985l;
                                                        C0583o c0583o6 = new C0583o(c0582n);
                                                        InterfaceC2226E interfaceC2226EMo344p6 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                        c0332c.f972Y = interfaceC2226EMo344p6;
                                                        interfaceC2226EMo344p6.mo1176e(c0583o6);
                                                        sparseArray.put(c0332c.f976c, c0332c);
                                                        c0333d2 = c0333d2;
                                                        break;
                                                    }
                                                    iM1605x = AbstractC0632A.m1605x(c0332c.f964Q);
                                                    if (iM1605x == 0) {
                                                        AbstractC0646n.m1647y("MatroskaExtractor", "Unsupported PCM bit depth: " + c0332c.f964Q + ". Setting mimeType to audio/x-unknown");
                                                        str23 = "audio/x-unknown";
                                                        iM1605x = -1;
                                                    } else {
                                                        str23 = "audio/raw";
                                                    }
                                                    i5 = -1;
                                                    listSingletonList = null;
                                                    str5 = null;
                                                    if (c0332c.f962O != null) {
                                                        str5 = c0924nM2411b.f4016g;
                                                        str23 = "video/dolby-vision";
                                                    }
                                                    boolean z8 = c0332c.f970W;
                                                    if (c0332c.f969V) {
                                                        i6 = 2;
                                                    } else {
                                                        i6 = 0;
                                                    }
                                                    int i118 = (z8 ? 1 : 0) | i6;
                                                    c0582n = new C0582n();
                                                    zM1360h = AbstractC0545H.m1360h(str23);
                                                    Map map4 = f1005j0;
                                                    if (zM1360h) {
                                                        if (AbstractC0545H.m1363k(str23)) {
                                                            if (c0332c.f991r == 0) {
                                                                i11 = c0332c.f989p;
                                                                i8 = -1;
                                                                if (i11 == -1) {
                                                                    i11 = c0332c.f986m;
                                                                }
                                                                c0332c.f989p = i11;
                                                                i12 = c0332c.f990q;
                                                                if (i12 == -1) {
                                                                    i12 = c0332c.f987n;
                                                                }
                                                                c0332c.f990q = i12;
                                                            } else {
                                                                i8 = -1;
                                                            }
                                                            i9 = c0332c.f989p;
                                                            if (i9 != i8) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (c0332c.f998y) {
                                                                if (c0332c.f952E == -1.0f) {
                                                                }
                                                                int i119 = c0332c.f999z;
                                                                int i1110 = c0332c.f949B;
                                                                int i1111 = c0332c.f948A;
                                                                int i23 = c0332c.f988o;
                                                                c0573f = new C0573f(i119, i1110, i1111, i23, i23, bArr);
                                                            } else {
                                                                c0573f = null;
                                                            }
                                                            str7 = c0332c.f974a;
                                                            if (str7 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (c0332c.f992s == 0) {
                                                                if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                    iIntValue = 0;
                                                                } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                    iIntValue = 90;
                                                                } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                    iIntValue = 180;
                                                                } else {
                                                                    iIntValue = 180;
                                                                }
                                                            }
                                                            c0582n.f2121t = c0332c.f986m;
                                                            c0582n.f2122u = c0332c.f987n;
                                                            c0582n.f2125x = f;
                                                            c0582n.f2124w = iIntValue;
                                                            c0582n.f2126y = c0332c.f996w;
                                                            c0582n.f2127z = c0332c.f997x;
                                                            c0582n.f2091A = c0573f;
                                                            i7 = 2;
                                                        } else {
                                                            if ("application/x-subrip".equals(str23)) {
                                                            }
                                                            i7 = 3;
                                                        }
                                                        str8 = c0332c.f974a;
                                                        if (str8 != null) {
                                                            c0582n.f2103b = c0332c.f974a;
                                                        }
                                                        c0582n.f2102a = Integer.toString(i15);
                                                        c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                        c0582n.f2115n = i5;
                                                        c0582n.f2105d = c0332c.f971X;
                                                        c0582n.f2106e = i118;
                                                        c0582n.f2117p = listSingletonList;
                                                        c0582n.f2111j = str5;
                                                        c0582n.f2118q = c0332c.f985l;
                                                        C0583o c0583o7 = new C0583o(c0582n);
                                                        InterfaceC2226E interfaceC2226EMo344p7 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                        c0332c.f972Y = interfaceC2226EMo344p7;
                                                        interfaceC2226EMo344p7.mo1176e(c0583o7);
                                                        sparseArray.put(c0332c.f976c, c0332c);
                                                        c0333d2 = c0333d2;
                                                    } else {
                                                        c0582n.f2092B = c0332c.f963P;
                                                        c0582n.f2093C = c0332c.f965R;
                                                        c0582n.f2094D = iM1605x;
                                                        i7 = 1;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i118;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o8 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p8 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p8;
                                                    interfaceC2226EMo344p8.mo1176e(c0583o8);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } catch (ArrayIndexOutOfBoundsException unused) {
                                                    throw C0546I.m1365a(null, "Error parsing MS/ACM codec private");
                                                }
                                                break;
                                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                c0332c.f968U = new C2227F();
                                                str23 = "audio/true-hd";
                                                iM1605x = -1;
                                                i5 = -1;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z9 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i1112 = (z9 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map5 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i1113 = c0332c.f999z;
                                                            int i1114 = c0332c.f949B;
                                                            int i1115 = c0332c.f948A;
                                                            int i24 = c0332c.f988o;
                                                            c0573f = new C0573f(i1113, i1114, i1115, i24, i24, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i1112;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o9 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p9 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p9;
                                                    interfaceC2226EMo344p9.mo1176e(c0583o9);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i1112;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o10 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p10 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p10;
                                                interfaceC2226EMo344p10.mo1176e(c0583o10);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 4:
                                                byte[] bArrM911a = c0332c.m911a(str22);
                                                try {
                                                    try {
                                                        if (bArrM911a[0] != 2) {
                                                            throw C0546I.m1365a(null, "Error parsing vorbis codec private");
                                                        }
                                                        int i25 = 0;
                                                        int i26 = 1;
                                                        while (true) {
                                                            str11 = str11;
                                                            int i27 = bArrM911a[i26] & 255;
                                                            if (i27 != 255) {
                                                                int i28 = i26 + 1;
                                                                int i29 = i25 + i27;
                                                                int i30 = 0;
                                                                while (true) {
                                                                    str12 = str12;
                                                                    int i31 = bArrM911a[i28] & 255;
                                                                    if (i31 != 255) {
                                                                        int i32 = i28 + 1;
                                                                        int i33 = i30 + i31;
                                                                        if (bArrM911a[i32] != 1) {
                                                                            throw C0546I.m1365a(null, "Error parsing vorbis codec private");
                                                                        }
                                                                        byte[] bArr4 = new byte[i29];
                                                                        System.arraycopy(bArrM911a, i32, bArr4, 0, i29);
                                                                        int i34 = i32 + i29;
                                                                        if (bArrM911a[i34] != 3) {
                                                                            throw C0546I.m1365a(null, "Error parsing vorbis codec private");
                                                                        }
                                                                        int i35 = i34 + i33;
                                                                        if (bArrM911a[i35] != 5) {
                                                                            throw C0546I.m1365a(null, "Error parsing vorbis codec private");
                                                                        }
                                                                        byte[] bArr5 = new byte[bArrM911a.length - i35];
                                                                        System.arraycopy(bArrM911a, i35, bArr5, 0, bArrM911a.length - i35);
                                                                        ArrayList arrayList = new ArrayList(2);
                                                                        arrayList.add(bArr4);
                                                                        arrayList.add(bArr5);
                                                                        str23 = "audio/vorbis";
                                                                        listSingletonList = arrayList;
                                                                        iM1605x = -1;
                                                                        i5 = 8192;
                                                                        str5 = null;
                                                                        if (c0332c.f962O != null) {
                                                                            str5 = c0924nM2411b.f4016g;
                                                                            str23 = "video/dolby-vision";
                                                                        }
                                                                        boolean z10 = c0332c.f970W;
                                                                        if (c0332c.f969V) {
                                                                            i6 = 2;
                                                                        } else {
                                                                            i6 = 0;
                                                                        }
                                                                        int i1116 = (z10 ? 1 : 0) | i6;
                                                                        c0582n = new C0582n();
                                                                        zM1360h = AbstractC0545H.m1360h(str23);
                                                                        Map map6 = f1005j0;
                                                                        if (zM1360h) {
                                                                            if (AbstractC0545H.m1363k(str23)) {
                                                                                if (c0332c.f991r == 0) {
                                                                                    i11 = c0332c.f989p;
                                                                                    i8 = -1;
                                                                                    if (i11 == -1) {
                                                                                        i11 = c0332c.f986m;
                                                                                    }
                                                                                    c0332c.f989p = i11;
                                                                                    i12 = c0332c.f990q;
                                                                                    if (i12 == -1) {
                                                                                        i12 = c0332c.f987n;
                                                                                    }
                                                                                    c0332c.f990q = i12;
                                                                                } else {
                                                                                    i8 = -1;
                                                                                }
                                                                                i9 = c0332c.f989p;
                                                                                if (i9 != i8) {
                                                                                    f = -1.0f;
                                                                                } else {
                                                                                    f = -1.0f;
                                                                                }
                                                                                if (c0332c.f998y) {
                                                                                    if (c0332c.f952E == -1.0f) {
                                                                                    }
                                                                                    int i1117 = c0332c.f999z;
                                                                                    int i1118 = c0332c.f949B;
                                                                                    int i1119 = c0332c.f948A;
                                                                                    int i210 = c0332c.f988o;
                                                                                    c0573f = new C0573f(i1117, i1118, i1119, i210, i210, bArr);
                                                                                } else {
                                                                                    c0573f = null;
                                                                                }
                                                                                str7 = c0332c.f974a;
                                                                                if (str7 == null) {
                                                                                    iIntValue = -1;
                                                                                } else {
                                                                                    iIntValue = -1;
                                                                                }
                                                                                if (c0332c.f992s == 0) {
                                                                                    if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                                        iIntValue = 0;
                                                                                    } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                                        iIntValue = 90;
                                                                                    } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                                        iIntValue = 180;
                                                                                    } else {
                                                                                        iIntValue = 180;
                                                                                    }
                                                                                }
                                                                                c0582n.f2121t = c0332c.f986m;
                                                                                c0582n.f2122u = c0332c.f987n;
                                                                                c0582n.f2125x = f;
                                                                                c0582n.f2124w = iIntValue;
                                                                                c0582n.f2126y = c0332c.f996w;
                                                                                c0582n.f2127z = c0332c.f997x;
                                                                                c0582n.f2091A = c0573f;
                                                                                i7 = 2;
                                                                            } else {
                                                                                if ("application/x-subrip".equals(str23)) {
                                                                                }
                                                                                i7 = 3;
                                                                            }
                                                                            str8 = c0332c.f974a;
                                                                            if (str8 != null) {
                                                                                c0582n.f2103b = c0332c.f974a;
                                                                            }
                                                                            c0582n.f2102a = Integer.toString(i15);
                                                                            c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                                            c0582n.f2115n = i5;
                                                                            c0582n.f2105d = c0332c.f971X;
                                                                            c0582n.f2106e = i1116;
                                                                            c0582n.f2117p = listSingletonList;
                                                                            c0582n.f2111j = str5;
                                                                            c0582n.f2118q = c0332c.f985l;
                                                                            C0583o c0583o11 = new C0583o(c0582n);
                                                                            InterfaceC2226E interfaceC2226EMo344p11 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                                            c0332c.f972Y = interfaceC2226EMo344p11;
                                                                            interfaceC2226EMo344p11.mo1176e(c0583o11);
                                                                            sparseArray.put(c0332c.f976c, c0332c);
                                                                            c0333d2 = c0333d2;
                                                                        } else {
                                                                            c0582n.f2092B = c0332c.f963P;
                                                                            c0582n.f2093C = c0332c.f965R;
                                                                            c0582n.f2094D = iM1605x;
                                                                            i7 = 1;
                                                                        }
                                                                        str8 = c0332c.f974a;
                                                                        if (str8 != null) {
                                                                            c0582n.f2103b = c0332c.f974a;
                                                                        }
                                                                        c0582n.f2102a = Integer.toString(i15);
                                                                        c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                                        c0582n.f2115n = i5;
                                                                        c0582n.f2105d = c0332c.f971X;
                                                                        c0582n.f2106e = i1116;
                                                                        c0582n.f2117p = listSingletonList;
                                                                        c0582n.f2111j = str5;
                                                                        c0582n.f2118q = c0332c.f985l;
                                                                        C0583o c0583o12 = new C0583o(c0582n);
                                                                        InterfaceC2226E interfaceC2226EMo344p12 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                                        c0332c.f972Y = interfaceC2226EMo344p12;
                                                                        interfaceC2226EMo344p12.mo1176e(c0583o12);
                                                                        sparseArray.put(c0332c.f976c, c0332c);
                                                                        c0333d2 = c0333d2;
                                                                    } else {
                                                                        i30 += 255;
                                                                        i28++;
                                                                        str12 = str12;
                                                                    }
                                                                }
                                                            } else {
                                                                i25 += 255;
                                                                i26++;
                                                                str11 = str11;
                                                            }
                                                        }
                                                    } catch (ArrayIndexOutOfBoundsException unused2) {
                                                        throw C0546I.m1365a(bArrM911a, "Error parsing vorbis codec private");
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused3) {
                                                    bArrM911a = 0;
                                                }
                                                break;
                                            case 5:
                                                str23 = "audio/mpeg-L2";
                                                iM1605x = -1;
                                                i5 = 4096;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z11 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i11110 = (z11 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map7 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i11111 = c0332c.f999z;
                                                            int i11112 = c0332c.f949B;
                                                            int i11113 = c0332c.f948A;
                                                            int i211 = c0332c.f988o;
                                                            c0573f = new C0573f(i11111, i11112, i11113, i211, i211, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i11110;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o13 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p13 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p13;
                                                    interfaceC2226EMo344p13.mo1176e(c0583o13);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i11110;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o14 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p14 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p14;
                                                interfaceC2226EMo344p14.mo1176e(c0583o14);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 6:
                                                str23 = "audio/mpeg";
                                                iM1605x = -1;
                                                i5 = 4096;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z12 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i11114 = (z12 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map8 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i11115 = c0332c.f999z;
                                                            int i11116 = c0332c.f949B;
                                                            int i11117 = c0332c.f948A;
                                                            int i212 = c0332c.f988o;
                                                            c0573f = new C0573f(i11115, i11116, i11117, i212, i212, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i11114;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o15 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p15 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p15;
                                                    interfaceC2226EMo344p15.mo1176e(c0583o15);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i11114;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o16 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p16 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p16;
                                                interfaceC2226EMo344p16.mo1176e(c0583o16);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 7:
                                                C0651s c0651s2 = new C0651s(c0332c.m911a(c0332c.f975b));
                                                try {
                                                    c0651s2.m1666H(16);
                                                    long jM1678l = c0651s2.m1678l();
                                                    if (jM1678l == 1482049860) {
                                                        runtimeException = null;
                                                        try {
                                                            pair = new Pair("video/divx", null);
                                                            str6 = null;
                                                        } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        }
                                                    } else {
                                                        if (jM1678l == 859189832) {
                                                            pair = new Pair("video/3gpp", null);
                                                        } else {
                                                            if (jM1678l == 826496599) {
                                                                int i36 = c0651s2.f2521b + 20;
                                                                byte[] bArr6 = c0651s2.f2520a;
                                                                while (true) {
                                                                    if (i36 < bArr6.length - 4) {
                                                                        if (bArr6[i36] == 0 && bArr6[i36 + 1] == 0 && bArr6[i36 + 2] == 1) {
                                                                            if (bArr6[i36 + 3] == 15) {
                                                                                pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr6, i36, bArr6.length)));
                                                                            }
                                                                        }
                                                                        i36++;
                                                                    } else {
                                                                        try {
                                                                            throw C0546I.m1365a(null, "Failed to find FourCC VC1 initialization data");
                                                                        } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                            runtimeException = null;
                                                                        }
                                                                    }
                                                                    throw C0546I.m1365a(runtimeException, "Error parsing FourCC private data");
                                                                }
                                                            }
                                                            AbstractC0646n.m1647y("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                            str6 = null;
                                                            pair = new Pair("video/x-unknown", null);
                                                        }
                                                        str6 = null;
                                                    }
                                                    str23 = (String) pair.first;
                                                    str11 = str11;
                                                    str12 = str12;
                                                    str5 = str6;
                                                    listSingletonList = (List) pair.second;
                                                    iM1605x = -1;
                                                    i5 = -1;
                                                    if (c0332c.f962O != null) {
                                                        str5 = c0924nM2411b.f4016g;
                                                        str23 = "video/dolby-vision";
                                                    }
                                                    boolean z13 = c0332c.f970W;
                                                    if (c0332c.f969V) {
                                                        i6 = 2;
                                                    } else {
                                                        i6 = 0;
                                                    }
                                                    int i11118 = (z13 ? 1 : 0) | i6;
                                                    c0582n = new C0582n();
                                                    zM1360h = AbstractC0545H.m1360h(str23);
                                                    Map map9 = f1005j0;
                                                    if (zM1360h) {
                                                        if (AbstractC0545H.m1363k(str23)) {
                                                            if (c0332c.f991r == 0) {
                                                                i11 = c0332c.f989p;
                                                                i8 = -1;
                                                                if (i11 == -1) {
                                                                    i11 = c0332c.f986m;
                                                                }
                                                                c0332c.f989p = i11;
                                                                i12 = c0332c.f990q;
                                                                if (i12 == -1) {
                                                                    i12 = c0332c.f987n;
                                                                }
                                                                c0332c.f990q = i12;
                                                            } else {
                                                                i8 = -1;
                                                            }
                                                            i9 = c0332c.f989p;
                                                            if (i9 != i8) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (c0332c.f998y) {
                                                                if (c0332c.f952E == -1.0f) {
                                                                }
                                                                int i11119 = c0332c.f999z;
                                                                int i111110 = c0332c.f949B;
                                                                int i111111 = c0332c.f948A;
                                                                int i213 = c0332c.f988o;
                                                                c0573f = new C0573f(i11119, i111110, i111111, i213, i213, bArr);
                                                            } else {
                                                                c0573f = null;
                                                            }
                                                            str7 = c0332c.f974a;
                                                            if (str7 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (c0332c.f992s == 0) {
                                                                if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                    iIntValue = 0;
                                                                } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                    iIntValue = 90;
                                                                } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                    iIntValue = 180;
                                                                } else {
                                                                    iIntValue = 180;
                                                                }
                                                            }
                                                            c0582n.f2121t = c0332c.f986m;
                                                            c0582n.f2122u = c0332c.f987n;
                                                            c0582n.f2125x = f;
                                                            c0582n.f2124w = iIntValue;
                                                            c0582n.f2126y = c0332c.f996w;
                                                            c0582n.f2127z = c0332c.f997x;
                                                            c0582n.f2091A = c0573f;
                                                            i7 = 2;
                                                        } else {
                                                            if ("application/x-subrip".equals(str23)) {
                                                            }
                                                            i7 = 3;
                                                        }
                                                        str8 = c0332c.f974a;
                                                        if (str8 != null) {
                                                            c0582n.f2103b = c0332c.f974a;
                                                        }
                                                        c0582n.f2102a = Integer.toString(i15);
                                                        c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                        c0582n.f2115n = i5;
                                                        c0582n.f2105d = c0332c.f971X;
                                                        c0582n.f2106e = i11118;
                                                        c0582n.f2117p = listSingletonList;
                                                        c0582n.f2111j = str5;
                                                        c0582n.f2118q = c0332c.f985l;
                                                        C0583o c0583o17 = new C0583o(c0582n);
                                                        InterfaceC2226E interfaceC2226EMo344p17 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                        c0332c.f972Y = interfaceC2226EMo344p17;
                                                        interfaceC2226EMo344p17.mo1176e(c0583o17);
                                                        sparseArray.put(c0332c.f976c, c0332c);
                                                        c0333d2 = c0333d2;
                                                    } else {
                                                        c0582n.f2092B = c0332c.f963P;
                                                        c0582n.f2093C = c0332c.f965R;
                                                        c0582n.f2094D = iM1605x;
                                                        i7 = 1;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i11118;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o18 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p18 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p18;
                                                    interfaceC2226EMo344p18.mo1176e(c0583o18);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } catch (ArrayIndexOutOfBoundsException unused6) {
                                                    runtimeException = null;
                                                }
                                                break;
                                            case 8:
                                                byte[] bArr7 = new byte[4];
                                                System.arraycopy(c0332c.m911a(str22), 0, bArr7, 0, 4);
                                                listSingletonList = AbstractC1676G.m4120r(bArr7);
                                                str23 = "application/dvbsubs";
                                                iM1605x = -1;
                                                i5 = -1;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z14 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i111112 = (z14 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map10 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i111113 = c0332c.f999z;
                                                            int i111114 = c0332c.f949B;
                                                            int i111115 = c0332c.f948A;
                                                            int i214 = c0332c.f988o;
                                                            c0573f = new C0573f(i111113, i111114, i111115, i214, i214, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i111112;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o19 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p19 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p19;
                                                    interfaceC2226EMo344p19.mo1176e(c0583o19);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i111112;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o110 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p110 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p110;
                                                interfaceC2226EMo344p110.mo1176e(c0583o110);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 10:
                                                C2230c c2230cM4829a = C2230c.m4829a(new C0651s(c0332c.m911a(c0332c.f975b)));
                                                c0332c.f973Z = c2230cM4829a.f9591b;
                                                listSingletonList = c2230cM4829a.f9590a;
                                                str23 = "video/avc";
                                                str5 = c2230cM4829a.f9601l;
                                                iM1605x = -1;
                                                i5 = -1;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z15 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i111116 = (z15 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map11 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i111117 = c0332c.f999z;
                                                            int i111118 = c0332c.f949B;
                                                            int i111119 = c0332c.f948A;
                                                            int i215 = c0332c.f988o;
                                                            c0573f = new C0573f(i111117, i111118, i111119, i215, i215, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i111116;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o111 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p111 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p111;
                                                    interfaceC2226EMo344p111.mo1176e(c0583o111);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i111116;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o112 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p112 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p112;
                                                interfaceC2226EMo344p112.mo1176e(c0583o112);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 11:
                                                listSingletonList = AbstractC1676G.m4120r(c0332c.m911a(str22));
                                                str23 = "application/vobsub";
                                                iM1605x = -1;
                                                i5 = -1;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z16 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i1111110 = (z16 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map12 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i1111111 = c0332c.f999z;
                                                            int i1111112 = c0332c.f949B;
                                                            int i1111113 = c0332c.f948A;
                                                            int i216 = c0332c.f988o;
                                                            c0573f = new C0573f(i1111111, i1111112, i1111113, i216, i216, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i1111110;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o113 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p113 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p113;
                                                    interfaceC2226EMo344p113.mo1176e(c0583o113);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i1111110;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o114 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p114 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p114;
                                                interfaceC2226EMo344p114.mo1176e(c0583o114);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 12:
                                                str23 = "audio/vnd.dts.hd";
                                                iM1605x = -1;
                                                i5 = -1;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z17 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i1111114 = (z17 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map13 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i1111115 = c0332c.f999z;
                                                            int i1111116 = c0332c.f949B;
                                                            int i1111117 = c0332c.f948A;
                                                            int i217 = c0332c.f988o;
                                                            c0573f = new C0573f(i1111115, i1111116, i1111117, i217, i217, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i1111114;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o115 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p115 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p115;
                                                    interfaceC2226EMo344p115.mo1176e(c0583o115);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i1111114;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o116 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p116 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p116;
                                                interfaceC2226EMo344p116.mo1176e(c0583o116);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 13:
                                                List listSingletonList2 = Collections.singletonList(c0332c.m911a(str22));
                                                byte[] bArr8 = c0332c.f984k;
                                                C2228a c2228aM4819n = AbstractC2229b.m4819n(new C0508g(bArr8, bArr8.length), false);
                                                c0332c.f965R = c2228aM4819n.f9563b;
                                                c0332c.f963P = c2228aM4819n.f9564c;
                                                str23 = "audio/mp4a-latm";
                                                str11 = str11;
                                                str12 = str12;
                                                str5 = c2228aM4819n.f9562a;
                                                i5 = -1;
                                                listSingletonList = listSingletonList2;
                                                iM1605x = -1;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z18 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i1111118 = (z18 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map14 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i1111119 = c0332c.f999z;
                                                            int i11111110 = c0332c.f949B;
                                                            int i11111111 = c0332c.f948A;
                                                            int i218 = c0332c.f988o;
                                                            c0573f = new C0573f(i1111119, i11111110, i11111111, i218, i218, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i1111118;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o117 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p117 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p117;
                                                    interfaceC2226EMo344p117.mo1176e(c0583o117);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i1111118;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o118 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p118 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p118;
                                                interfaceC2226EMo344p118.mo1176e(c0583o118);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 14:
                                                str23 = "audio/ac3";
                                                iM1605x = -1;
                                                i5 = -1;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z19 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i11111112 = (z19 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map15 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i11111113 = c0332c.f999z;
                                                            int i11111114 = c0332c.f949B;
                                                            int i11111115 = c0332c.f948A;
                                                            int i219 = c0332c.f988o;
                                                            c0573f = new C0573f(i11111113, i11111114, i11111115, i219, i219, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i11111112;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o119 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p119 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p119;
                                                    interfaceC2226EMo344p119.mo1176e(c0583o119);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i11111112;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o1110 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p1110 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p1110;
                                                interfaceC2226EMo344p1110.mo1176e(c0583o1110);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 15:
                                            case 21:
                                                str23 = "audio/vnd.dts";
                                                iM1605x = -1;
                                                i5 = -1;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z110 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i11111116 = (z110 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map16 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i11111117 = c0332c.f999z;
                                                            int i11111118 = c0332c.f949B;
                                                            int i11111119 = c0332c.f948A;
                                                            int i2110 = c0332c.f988o;
                                                            c0573f = new C0573f(i11111117, i11111118, i11111119, i2110, i2110, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i11111116;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o1111 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p1111 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p1111;
                                                    interfaceC2226EMo344p1111.mo1176e(c0583o1111);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i11111116;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o1112 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p1112 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p1112;
                                                interfaceC2226EMo344p1112.mo1176e(c0583o1112);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 16:
                                                str23 = "video/av01";
                                                iM1605x = -1;
                                                i5 = -1;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z111 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i111111110 = (z111 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map17 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i111111111 = c0332c.f999z;
                                                            int i111111112 = c0332c.f949B;
                                                            int i111111113 = c0332c.f948A;
                                                            int i2111 = c0332c.f988o;
                                                            c0573f = new C0573f(i111111111, i111111112, i111111113, i2111, i2111, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i111111110;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o1113 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p1113 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p1113;
                                                    interfaceC2226EMo344p1113.mo1176e(c0583o1113);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i111111110;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o1114 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p1114 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p1114;
                                                interfaceC2226EMo344p1114.mo1176e(c0583o1114);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 17:
                                                str23 = "video/x-vnd.on2.vp8";
                                                iM1605x = -1;
                                                i5 = -1;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z112 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i111111114 = (z112 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map18 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i111111115 = c0332c.f999z;
                                                            int i111111116 = c0332c.f949B;
                                                            int i111111117 = c0332c.f948A;
                                                            int i2112 = c0332c.f988o;
                                                            c0573f = new C0573f(i111111115, i111111116, i111111117, i2112, i2112, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i111111114;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o1115 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p1115 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p1115;
                                                    interfaceC2226EMo344p1115.mo1176e(c0583o1115);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i111111114;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o1116 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p1116 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p1116;
                                                interfaceC2226EMo344p1116.mo1176e(c0583o1116);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 18:
                                                str23 = "video/x-vnd.on2.vp9";
                                                iM1605x = -1;
                                                i5 = -1;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z113 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i111111118 = (z113 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map19 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i111111119 = c0332c.f999z;
                                                            int i1111111110 = c0332c.f949B;
                                                            int i1111111111 = c0332c.f948A;
                                                            int i2113 = c0332c.f988o;
                                                            c0573f = new C0573f(i111111119, i1111111110, i1111111111, i2113, i2113, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i111111118;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o1117 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p1117 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p1117;
                                                    interfaceC2226EMo344p1117.mo1176e(c0583o1117);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i111111118;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o1118 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p1118 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p1118;
                                                interfaceC2226EMo344p1118.mo1176e(c0583o1118);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 19:
                                                str23 = "application/pgs";
                                                iM1605x = -1;
                                                i5 = -1;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z114 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i1111111112 = (z114 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map110 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i1111111113 = c0332c.f999z;
                                                            int i1111111114 = c0332c.f949B;
                                                            int i1111111115 = c0332c.f948A;
                                                            int i2114 = c0332c.f988o;
                                                            c0573f = new C0573f(i1111111113, i1111111114, i1111111115, i2114, i2114, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i1111111112;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o1119 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p1119 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p1119;
                                                    interfaceC2226EMo344p1119.mo1176e(c0583o1119);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i1111111112;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o11110 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p11110 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p11110;
                                                interfaceC2226EMo344p11110.mo1176e(c0583o11110);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 20:
                                                iM1605x = -1;
                                                i5 = -1;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z115 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i1111111116 = (z115 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map111 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i1111111117 = c0332c.f999z;
                                                            int i1111111118 = c0332c.f949B;
                                                            int i1111111119 = c0332c.f948A;
                                                            int i2115 = c0332c.f988o;
                                                            c0573f = new C0573f(i1111111117, i1111111118, i1111111119, i2115, i2115, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i1111111116;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o11111 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p11111 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p11111;
                                                    interfaceC2226EMo344p11111.mo1176e(c0583o11111);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i1111111116;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o11112 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p11112 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p11112;
                                                interfaceC2226EMo344p11112.mo1176e(c0583o11112);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 22:
                                                if (c0332c.f964Q == 32) {
                                                    str11 = str11;
                                                    str12 = str12;
                                                    str23 = "audio/raw";
                                                    iM1605x = 4;
                                                } else {
                                                    AbstractC0646n.m1647y("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + c0332c.f964Q + ". Setting mimeType to audio/x-unknown");
                                                    str23 = "audio/x-unknown";
                                                    iM1605x = -1;
                                                }
                                                i5 = -1;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z116 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i11111111110 = (z116 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map112 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i11111111111 = c0332c.f999z;
                                                            int i11111111112 = c0332c.f949B;
                                                            int i11111111113 = c0332c.f948A;
                                                            int i2116 = c0332c.f988o;
                                                            c0573f = new C0573f(i11111111111, i11111111112, i11111111113, i2116, i2116, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i11111111110;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o11113 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p11113 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p11113;
                                                    interfaceC2226EMo344p11113.mo1176e(c0583o11113);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i11111111110;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o11114 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p11114 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p11114;
                                                interfaceC2226EMo344p11114.mo1176e(c0583o11114);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 23:
                                                int i37 = c0332c.f964Q;
                                                if (i37 == 8) {
                                                    str11 = str11;
                                                    str12 = str12;
                                                    str23 = "audio/raw";
                                                    iM1605x = 3;
                                                } else {
                                                    if (i37 == 16) {
                                                        iM1605x = 268435456;
                                                    } else if (i37 == 24) {
                                                        iM1605x = 1342177280;
                                                    } else if (i37 == 32) {
                                                        iM1605x = 1610612736;
                                                    } else {
                                                        AbstractC0646n.m1647y("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + c0332c.f964Q + ". Setting mimeType to audio/x-unknown");
                                                        str23 = "audio/x-unknown";
                                                        iM1605x = -1;
                                                    }
                                                    str11 = str11;
                                                    str12 = str12;
                                                    str23 = "audio/raw";
                                                }
                                                i5 = -1;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z117 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i11111111114 = (z117 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map113 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i11111111115 = c0332c.f999z;
                                                            int i11111111116 = c0332c.f949B;
                                                            int i11111111117 = c0332c.f948A;
                                                            int i2117 = c0332c.f988o;
                                                            c0573f = new C0573f(i11111111115, i11111111116, i11111111117, i2117, i2117, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i11111111114;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o11115 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p11115 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p11115;
                                                    interfaceC2226EMo344p11115.mo1176e(c0583o11115);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i11111111114;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o11116 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p11116 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p11116;
                                                interfaceC2226EMo344p11116.mo1176e(c0583o11116);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 24:
                                                iM1605x = AbstractC0632A.m1605x(c0332c.f964Q);
                                                if (iM1605x == 0) {
                                                    AbstractC0646n.m1647y("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + c0332c.f964Q + ". Setting mimeType to audio/x-unknown");
                                                    str23 = "audio/x-unknown";
                                                    iM1605x = -1;
                                                } else {
                                                    str11 = str11;
                                                    str12 = str12;
                                                    str23 = "audio/raw";
                                                }
                                                i5 = -1;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z118 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i11111111118 = (z118 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map114 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i11111111119 = c0332c.f999z;
                                                            int i111111111110 = c0332c.f949B;
                                                            int i111111111111 = c0332c.f948A;
                                                            int i2118 = c0332c.f988o;
                                                            c0573f = new C0573f(i11111111119, i111111111110, i111111111111, i2118, i2118, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i11111111118;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o11117 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p11117 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p11117;
                                                    interfaceC2226EMo344p11117.mo1176e(c0583o11117);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i11111111118;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o11118 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p11118 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p11118;
                                                interfaceC2226EMo344p11118.mo1176e(c0583o11118);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 25:
                                                listSingletonList = AbstractC1676G.m4121s(f1001f0, c0332c.m911a(str22));
                                                str23 = "text/x-ssa";
                                                iM1605x = -1;
                                                i5 = -1;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z119 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i111111111112 = (z119 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map115 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i111111111113 = c0332c.f999z;
                                                            int i111111111114 = c0332c.f949B;
                                                            int i111111111115 = c0332c.f948A;
                                                            int i2119 = c0332c.f988o;
                                                            c0573f = new C0573f(i111111111113, i111111111114, i111111111115, i2119, i2119, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i111111111112;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o11119 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p11119 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p11119;
                                                    interfaceC2226EMo344p11119.mo1176e(c0583o11119);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i111111111112;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o111110 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p111110 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p111110;
                                                interfaceC2226EMo344p111110.mo1176e(c0583o111110);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 26:
                                                C2248u c2248uM4844a = C2248u.m4844a(new C0651s(c0332c.m911a(c0332c.f975b)), false, null);
                                                c0332c.f973Z = c2248uM4844a.f9662b;
                                                str23 = "video/hevc";
                                                List list = c2248uM4844a.f9661a;
                                                str5 = c2248uM4844a.f9671k;
                                                listSingletonList = list;
                                                iM1605x = -1;
                                                i5 = -1;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z1110 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i111111111116 = (z1110 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map116 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i111111111117 = c0332c.f999z;
                                                            int i111111111118 = c0332c.f949B;
                                                            int i111111111119 = c0332c.f948A;
                                                            int i21110 = c0332c.f988o;
                                                            c0573f = new C0573f(i111111111117, i111111111118, i111111111119, i21110, i21110, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i111111111116;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o111111 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p111111 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p111111;
                                                    interfaceC2226EMo344p111111.mo1176e(c0583o111111);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i111111111116;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o111112 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p111112 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p111112;
                                                interfaceC2226EMo344p111112.mo1176e(c0583o111112);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 27:
                                                str23 = "text/vtt";
                                                iM1605x = -1;
                                                i5 = -1;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z1111 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i1111111111110 = (z1111 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map117 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i1111111111111 = c0332c.f999z;
                                                            int i1111111111112 = c0332c.f949B;
                                                            int i1111111111113 = c0332c.f948A;
                                                            int i21111 = c0332c.f988o;
                                                            c0573f = new C0573f(i1111111111111, i1111111111112, i1111111111113, i21111, i21111, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i1111111111110;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o111113 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p111113 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p111113;
                                                    interfaceC2226EMo344p111113.mo1176e(c0583o111113);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i1111111111110;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o111114 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p111114 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p111114;
                                                interfaceC2226EMo344p111114.mo1176e(c0583o111114);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 28:
                                                str23 = "application/x-subrip";
                                                iM1605x = -1;
                                                i5 = -1;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z1112 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i1111111111114 = (z1112 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map118 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i1111111111115 = c0332c.f999z;
                                                            int i1111111111116 = c0332c.f949B;
                                                            int i1111111111117 = c0332c.f948A;
                                                            int i21112 = c0332c.f988o;
                                                            c0573f = new C0573f(i1111111111115, i1111111111116, i1111111111117, i21112, i21112, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i1111111111114;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o111115 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p111115 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p111115;
                                                    interfaceC2226EMo344p111115.mo1176e(c0583o111115);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i1111111111114;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o111116 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p111116 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p111116;
                                                interfaceC2226EMo344p111116.mo1176e(c0583o111116);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 29:
                                                str23 = "video/mpeg2";
                                                iM1605x = -1;
                                                i5 = -1;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z1113 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i1111111111118 = (z1113 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map119 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i1111111111119 = c0332c.f999z;
                                                            int i11111111111110 = c0332c.f949B;
                                                            int i11111111111111 = c0332c.f948A;
                                                            int i21113 = c0332c.f988o;
                                                            c0573f = new C0573f(i1111111111119, i11111111111110, i11111111111111, i21113, i21113, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i1111111111118;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o111117 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p111117 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p111117;
                                                    interfaceC2226EMo344p111117.mo1176e(c0583o111117);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i1111111111118;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o111118 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p111118 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p111118;
                                                interfaceC2226EMo344p111118.mo1176e(c0583o111118);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 30:
                                                str23 = "audio/eac3";
                                                iM1605x = -1;
                                                i5 = -1;
                                                listSingletonList = null;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z1114 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i11111111111112 = (z1114 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map1110 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i11111111111113 = c0332c.f999z;
                                                            int i11111111111114 = c0332c.f949B;
                                                            int i11111111111115 = c0332c.f948A;
                                                            int i21114 = c0332c.f988o;
                                                            c0573f = new C0573f(i11111111111113, i11111111111114, i11111111111115, i21114, i21114, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i11111111111112;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o111119 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p111119 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p111119;
                                                    interfaceC2226EMo344p111119.mo1176e(c0583o111119);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i11111111111112;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o1111110 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p1111110 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p1111110;
                                                interfaceC2226EMo344p1111110.mo1176e(c0583o1111110);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 31:
                                                str23 = "audio/flac";
                                                listSingletonList = Collections.singletonList(c0332c.m911a(str22));
                                                iM1605x = -1;
                                                i5 = -1;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z1115 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i11111111111116 = (z1115 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map1111 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i11111111111117 = c0332c.f999z;
                                                            int i11111111111118 = c0332c.f949B;
                                                            int i11111111111119 = c0332c.f948A;
                                                            int i21115 = c0332c.f988o;
                                                            c0573f = new C0573f(i11111111111117, i11111111111118, i11111111111119, i21115, i21115, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i11111111111116;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o1111111 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p1111111 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p1111111;
                                                    interfaceC2226EMo344p1111111.mo1176e(c0583o1111111);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i11111111111116;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o1111112 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p1111112 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p1111112;
                                                interfaceC2226EMo344p1111112.mo1176e(c0583o1111112);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            case 32:
                                                ArrayList arrayList2 = new ArrayList(3);
                                                arrayList2.add(c0332c.m911a(c0332c.f975b));
                                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                                arrayList2.add(byteBufferAllocate.order(byteOrder).putLong(c0332c.f966S).array());
                                                arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(c0332c.f967T).array());
                                                str23 = "audio/opus";
                                                listSingletonList = arrayList2;
                                                str11 = str11;
                                                str12 = str12;
                                                iM1605x = -1;
                                                i5 = 5760;
                                                str5 = null;
                                                if (c0332c.f962O != null) {
                                                    str5 = c0924nM2411b.f4016g;
                                                    str23 = "video/dolby-vision";
                                                }
                                                boolean z1116 = c0332c.f970W;
                                                if (c0332c.f969V) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i111111111111110 = (z1116 ? 1 : 0) | i6;
                                                c0582n = new C0582n();
                                                zM1360h = AbstractC0545H.m1360h(str23);
                                                Map map1112 = f1005j0;
                                                if (zM1360h) {
                                                    if (AbstractC0545H.m1363k(str23)) {
                                                        if (c0332c.f991r == 0) {
                                                            i11 = c0332c.f989p;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = c0332c.f986m;
                                                            }
                                                            c0332c.f989p = i11;
                                                            i12 = c0332c.f990q;
                                                            if (i12 == -1) {
                                                                i12 = c0332c.f987n;
                                                            }
                                                            c0332c.f990q = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = c0332c.f989p;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c0332c.f998y) {
                                                            if (c0332c.f952E == -1.0f) {
                                                            }
                                                            int i111111111111111 = c0332c.f999z;
                                                            int i111111111111112 = c0332c.f949B;
                                                            int i111111111111113 = c0332c.f948A;
                                                            int i21116 = c0332c.f988o;
                                                            c0573f = new C0573f(i111111111111111, i111111111111112, i111111111111113, i21116, i21116, bArr);
                                                        } else {
                                                            c0573f = null;
                                                        }
                                                        str7 = c0332c.f974a;
                                                        if (str7 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c0332c.f992s == 0) {
                                                            if (Float.compare(c0332c.f995v, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c0332c.f995v, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c0332c.f995v, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0582n.f2121t = c0332c.f986m;
                                                        c0582n.f2122u = c0332c.f987n;
                                                        c0582n.f2125x = f;
                                                        c0582n.f2124w = iIntValue;
                                                        c0582n.f2126y = c0332c.f996w;
                                                        c0582n.f2127z = c0332c.f997x;
                                                        c0582n.f2091A = c0573f;
                                                        i7 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str23)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str8 = c0332c.f974a;
                                                    if (str8 != null) {
                                                        c0582n.f2103b = c0332c.f974a;
                                                    }
                                                    c0582n.f2102a = Integer.toString(i15);
                                                    c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                    c0582n.f2115n = i5;
                                                    c0582n.f2105d = c0332c.f971X;
                                                    c0582n.f2106e = i111111111111110;
                                                    c0582n.f2117p = listSingletonList;
                                                    c0582n.f2111j = str5;
                                                    c0582n.f2118q = c0332c.f985l;
                                                    C0583o c0583o1111113 = new C0583o(c0582n);
                                                    InterfaceC2226E interfaceC2226EMo344p1111113 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                    c0332c.f972Y = interfaceC2226EMo344p1111113;
                                                    interfaceC2226EMo344p1111113.mo1176e(c0583o1111113);
                                                    sparseArray.put(c0332c.f976c, c0332c);
                                                    c0333d2 = c0333d2;
                                                } else {
                                                    c0582n.f2092B = c0332c.f963P;
                                                    c0582n.f2093C = c0332c.f965R;
                                                    c0582n.f2094D = iM1605x;
                                                    i7 = 1;
                                                }
                                                str8 = c0332c.f974a;
                                                if (str8 != null) {
                                                    c0582n.f2103b = c0332c.f974a;
                                                }
                                                c0582n.f2102a = Integer.toString(i15);
                                                c0582n.f2114m = AbstractC0545H.m1364l(str23);
                                                c0582n.f2115n = i5;
                                                c0582n.f2105d = c0332c.f971X;
                                                c0582n.f2106e = i111111111111110;
                                                c0582n.f2117p = listSingletonList;
                                                c0582n.f2111j = str5;
                                                c0582n.f2118q = c0332c.f985l;
                                                C0583o c0583o1111114 = new C0583o(c0582n);
                                                InterfaceC2226E interfaceC2226EMo344p1111114 = interfaceC2242o.mo344p(c0332c.f976c, i7);
                                                c0332c.f972Y = interfaceC2226EMo344p1111114;
                                                interfaceC2226EMo344p1111114.mo1176e(c0583o1111114);
                                                sparseArray.put(c0332c.f976c, c0332c);
                                                c0333d2 = c0333d2;
                                                break;
                                            default:
                                                throw C0546I.m1365a(null, "Unrecognized codec identifier.");
                                        }
                                        break;
                                    default:
                                        str11 = str11;
                                        str12 = str12;
                                        str3 = str4;
                                        break;
                                }
                                c0333d2.f1058w = null;
                            } else {
                                if (i14 == 19899) {
                                    str9 = str14;
                                    str10 = str15;
                                    str16 = str16;
                                    int i38 = c0333d2.f1060y;
                                    if (i38 != -1) {
                                        long j3 = c0333d2.f1061z;
                                        if (j3 != -1) {
                                            if (i38 == 475249515) {
                                                c0333d2.f1007B = j3;
                                                str13 = str13;
                                                str = str18;
                                                str16 = str16;
                                                str14 = str9;
                                                str15 = str10;
                                                str11 = str11;
                                                str12 = str12;
                                            }
                                            str13 = str13;
                                            str16 = str16;
                                            str14 = str9;
                                            str15 = str10;
                                            str11 = str11;
                                            str12 = str12;
                                            str3 = str18;
                                        }
                                    }
                                    throw C0546I.m1365a(null, "Mandatory element SeekID or SeekPosition not found");
                                }
                                if (i14 != 25152) {
                                    if (i14 != 28032) {
                                        if (i14 == 357149030) {
                                            str9 = str14;
                                            str10 = str15;
                                            str16 = str16;
                                            if (c0333d2.f1055t == -9223372036854775807L) {
                                                c0333d2.f1055t = 1000000L;
                                            }
                                            long j4 = c0333d2.f1056u;
                                            if (j4 != -9223372036854775807L) {
                                                c0333d2.f1057v = c0333d2.m918n(j4);
                                            }
                                        } else if (i14 == 374648427) {
                                            str9 = str14;
                                            str10 = str15;
                                            str16 = str16;
                                            if (sparseArray.size() == 0) {
                                                throw C0546I.m1365a(null, "No valid tracks were found");
                                            }
                                            c0333d2.f1039d0.mo341l();
                                        } else if (i14 != 475249515) {
                                            str11 = str11;
                                            str12 = str12;
                                            str13 = str13;
                                            str16 = str16;
                                            str3 = str18;
                                            str15 = str15;
                                            str14 = str14;
                                        } else {
                                            if (c0333d2.f1059x) {
                                                str9 = str14;
                                                str10 = str15;
                                                str16 = str16;
                                            } else {
                                                InterfaceC2242o interfaceC2242o2 = c0333d2.f1039d0;
                                                C0334e c0334e = c0333d2.f1010E;
                                                C0334e c0334e2 = c0333d2.f1011F;
                                                if (c0333d2.f1054s == -1 || c0333d2.f1057v == -9223372036854775807L || c0334e == null || (i13 = c0334e.f1062g) == 0 || c0334e2 == null || c0334e2.f1062g != i13) {
                                                    str9 = str14;
                                                    str10 = str15;
                                                    c2244q = new C2244q(c0333d2.f1057v);
                                                } else {
                                                    int[] iArrCopyOf = new int[i13];
                                                    long[] jArrCopyOf = new long[i13];
                                                    long[] jArrCopyOf2 = new long[i13];
                                                    long[] jArrCopyOf3 = new long[i13];
                                                    int i39 = 0;
                                                    while (i39 < i13) {
                                                        jArrCopyOf3[i39] = c0334e.m927g(i39);
                                                        jArrCopyOf[i39] = c0334e2.m927g(i39) + c0333d2.f1054s;
                                                        i39++;
                                                        str14 = str14;
                                                        str15 = str15;
                                                    }
                                                    str9 = str14;
                                                    str10 = str15;
                                                    int i40 = 0;
                                                    while (true) {
                                                        int i41 = i13 - 1;
                                                        if (i40 < i41) {
                                                            int i42 = i40 + 1;
                                                            iArrCopyOf[i40] = (int) (jArrCopyOf[i42] - jArrCopyOf[i40]);
                                                            jArrCopyOf2[i40] = jArrCopyOf3[i42] - jArrCopyOf3[i40];
                                                            i40 = i42;
                                                        } else {
                                                            int i43 = i41;
                                                            while (i43 > 0 && jArrCopyOf3[i43] > c0333d2.f1057v) {
                                                                i43--;
                                                            }
                                                            iArrCopyOf[i43] = (int) ((c0333d2.f1054s + c0333d2.f1053r) - jArrCopyOf[i43]);
                                                            jArrCopyOf2[i43] = c0333d2.f1057v - jArrCopyOf3[i43];
                                                            if (i43 < i41) {
                                                                AbstractC0646n.m1647y("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
                                                                int i44 = i43 + 1;
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i44);
                                                                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i44);
                                                                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i44);
                                                                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i44);
                                                            }
                                                            c2244q = new C2236i(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                                                        }
                                                    }
                                                }
                                                interfaceC2242o2.mo333b(c2244q);
                                                c0333d2.f1059x = true;
                                            }
                                            c0333d2.f1010E = null;
                                            c0333d2.f1011F = null;
                                        }
                                        str13 = str13;
                                        str = str18;
                                        str16 = str16;
                                        str14 = str9;
                                        str15 = str10;
                                        str11 = str11;
                                        str12 = str12;
                                    } else {
                                        str9 = str14;
                                        str10 = str15;
                                        str16 = str16;
                                        c0333d2.m914d(i14);
                                        C0332c c0332c2 = c0333d2.f1058w;
                                        if (c0332c2.f981h && c0332c2.f982i != null) {
                                            throw C0546I.m1365a(null, "Combining encryption and compression is not supported");
                                        }
                                    }
                                    str13 = str13;
                                    str16 = str16;
                                    str14 = str9;
                                    str15 = str10;
                                    str11 = str11;
                                    str12 = str12;
                                    str3 = str18;
                                } else {
                                    str9 = str14;
                                    str10 = str15;
                                    str16 = str16;
                                    c0333d2.m914d(i14);
                                    C0332c c0332c3 = c0333d2.f1058w;
                                    if (c0332c3.f981h) {
                                        C2225D c2225d = c0332c3.f983j;
                                        if (c2225d == null) {
                                            throw C0546I.m1365a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                        }
                                        c0332c3.f985l = new C0579k(null, true, new C0578j(AbstractC0571e.f2057a, null, "video/webm", c2225d.f9552b));
                                        str13 = str13;
                                        str = str18;
                                        str16 = str16;
                                        str14 = str9;
                                        str15 = str10;
                                        str11 = str11;
                                        str12 = str12;
                                    }
                                    str13 = str13;
                                    str16 = str16;
                                    str14 = str9;
                                    str15 = str10;
                                    str11 = str11;
                                    str12 = str12;
                                    str3 = str18;
                                }
                            }
                            str = str3;
                        } else {
                            str11 = str11;
                            str12 = str12;
                            str13 = str13;
                            str16 = str16;
                            str3 = str18;
                            str15 = str15;
                            str14 = str14;
                            if (c0333d2.f1014I != 2) {
                                str = str3;
                            } else {
                                C0332c c0332c4 = (C0332c) sparseArray.get(c0333d2.f1020O);
                                c0332c4.f972Y.getClass();
                                if (c0333d2.f1025T > 0) {
                                    str = str3;
                                    if (str.equals(c0332c4.f975b)) {
                                        byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(c0333d2.f1025T).array();
                                        C0651s c0651s3 = c0333d2.f1051p;
                                        c0651s3.getClass();
                                        c0651s3.m1663E(bArrArray, bArrArray.length);
                                    }
                                } else {
                                    str = str3;
                                }
                                int i45 = 0;
                                for (int i46 = 0; i46 < c0333d2.f1018M; i46++) {
                                    i45 += c0333d2.f1019N[i46];
                                }
                                int i47 = 0;
                                while (i47 < c0333d2.f1018M) {
                                    long j5 = c0333d2.f1015J + ((long) ((c0332c4.f978e * i47) / 1000));
                                    int i48 = c0333d2.f1022Q;
                                    if (i47 != 0 || c0333d2.f1024S) {
                                        i4 = 1;
                                    } else {
                                        i4 = 1;
                                        i48 |= 1;
                                    }
                                    int i49 = i48;
                                    int i50 = c0333d2.f1019N[i47];
                                    int i51 = i45 - i50;
                                    c0333d2.m915g(c0332c4, j5, i49, i50, i51);
                                    i47 += i4;
                                    i45 = i51;
                                }
                                c0333d2.f1014I = 0;
                            }
                        }
                    } else {
                        str = str18;
                    }
                    z4 = true;
                } else {
                    str = str17;
                }
                str11 = str11;
                str12 = str12;
                str13 = str13;
                ?? r4 = 0;
                int i52 = c0331b.f945e;
                C0335f c0335f = c0331b.f943c;
                if (i52 == 0) {
                    C2237j c2237j = (C2237j) interfaceC2241n;
                    int i53 = 4;
                    long jM937c = c0335f.m937c(c2237j, true, false, 4);
                    if (jM937c == -2) {
                        c2237j.f9631l = 0;
                        while (true) {
                            byte[] bArr9 = c0331b.f941a;
                            r3 = (C2237j) interfaceC2241n;
                            r3.mo338i(bArr9, r4, i53, r4);
                            iM936b = C0335f.m936b(bArr9[r4]);
                            if (iM936b != -1 && iM936b <= i53) {
                                iM935a = (int) C0335f.m935a(iM936b, r4, bArr9);
                                ((C0333d) c0331b.f944d.f38h).getClass();
                                if (iM935a == 357149030 || iM935a == 524531317 || iM935a == 475249515 || iM935a == 374648427) {
                                }
                            }
                            r3.mo335d(1);
                            r4 = 0;
                            i53 = 4;
                        }
                        r3.mo335d(iM936b);
                        jM937c = iM935a;
                    }
                    z3 = true;
                    if (jM937c == -1) {
                        z4 = false;
                    } else {
                        c0331b.f946f = (int) jM937c;
                        c0331b.f945e = 1;
                    }
                } else {
                    z3 = true;
                }
                if (c0331b.f945e == z3) {
                    c0331b.f947g = c0335f.m937c((C2237j) interfaceC2241n, false, z3, 8);
                    c0331b.f945e = 2;
                }
                C0031d c0031d2 = c0331b.f944d;
                int i54 = c0331b.f946f;
                ((C0333d) c0031d2.f38h).getClass();
                switch (i54) {
                    case 131:
                    case 136:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case 215:
                    case 231:
                    case 238:
                    case 241:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21938:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        i3 = 2;
                        break;
                    case 134:
                    case 17026:
                    case 21358:
                    case 2274716:
                        i3 = 3;
                        break;
                    case 160:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        i3 = 1;
                        break;
                    case 161:
                    case 163:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        i3 = 4;
                        break;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        i3 = 5;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                if (i3 != 0) {
                    if (i3 == 1) {
                        long j6 = ((C2237j) interfaceC2241n).f9629j;
                        arrayDeque.push(new C0330a(c0331b.f946f, c0331b.f947g + j6));
                        c0331b.f944d.m151A(c0331b.f946f, j6, c0331b.f947g);
                        c0331b.f945e = 0;
                    } else if (i3 == 2) {
                        long j7 = c0331b.f947g;
                        if (j7 > 8) {
                            throw C0546I.m1365a(null, "Invalid integer size: " + c0331b.f947g);
                        }
                        c0331b.f944d.m174v(c0331b.f946f, c0331b.m910a((C2237j) interfaceC2241n, (int) j7));
                        c0331b.f945e = 0;
                    } else if (i3 == 3) {
                        long j8 = c0331b.f947g;
                        if (j8 > 2147483647L) {
                            throw C0546I.m1365a(null, "String element size: " + c0331b.f947g);
                        }
                        C0031d c0031d3 = c0331b.f944d;
                        int i55 = c0331b.f946f;
                        int i56 = (int) j8;
                        if (i56 == 0) {
                            str2 = "";
                        } else {
                            byte[] bArr10 = new byte[i56];
                            ((C2237j) interfaceC2241n).mo336f(bArr10, 0, i56, false);
                            while (i56 > 0 && bArr10[i56 - 1] == 0) {
                                i56--;
                            }
                            str2 = new String(bArr10, 0, i56);
                        }
                        C0333d c0333d3 = (C0333d) c0031d3.f38h;
                        c0333d3.getClass();
                        if (i55 == 134) {
                            c0333d3.m914d(i55);
                            c0333d3.f1058w.f975b = str2;
                        } else if (i55 != 17026) {
                            if (i55 == 21358) {
                                c0333d3.m914d(i55);
                                c0333d3.f1058w.f974a = str2;
                            } else if (i55 == 2274716) {
                                c0333d3.m914d(i55);
                                c0333d3.f1058w.f971X = str2;
                            }
                        } else if (!"webm".equals(str2) && !"matroska".equals(str2)) {
                            throw C0546I.m1365a(null, "DocType " + str2 + " not supported");
                        }
                        c0331b.f945e = 0;
                    } else if (i3 == 4) {
                        c0331b.f944d.m169q(c0331b.f946f, (int) c0331b.f947g, (C2237j) interfaceC2241n);
                        c0331b.f945e = 0;
                    } else {
                        if (i3 != 5) {
                            throw C0546I.m1365a(null, "Invalid element type " + i3);
                        }
                        long j9 = c0331b.f947g;
                        if (j9 != 4 && j9 != 8) {
                            throw C0546I.m1365a(null, "Invalid float size: " + c0331b.f947g);
                        }
                        C0031d c0031d4 = c0331b.f944d;
                        int i57 = c0331b.f946f;
                        int i58 = (int) j9;
                        long jM910a = c0331b.m910a((C2237j) interfaceC2241n, i58);
                        double dIntBitsToFloat = i58 == 4 ? Float.intBitsToFloat((int) jM910a) : Double.longBitsToDouble(jM910a);
                        C0333d c0333d4 = (C0333d) c0031d4.f38h;
                        if (i57 == 181) {
                            c0333d4.m914d(i57);
                            c0333d4.f1058w.f965R = (int) dIntBitsToFloat;
                        } else if (i57 != 17545) {
                            switch (i57) {
                                case 21969:
                                    c0333d4.m914d(i57);
                                    c0333d4.f1058w.f952E = (float) dIntBitsToFloat;
                                    break;
                                case 21970:
                                    c0333d4.m914d(i57);
                                    c0333d4.f1058w.f953F = (float) dIntBitsToFloat;
                                    break;
                                case 21971:
                                    c0333d4.m914d(i57);
                                    c0333d4.f1058w.f954G = (float) dIntBitsToFloat;
                                    break;
                                case 21972:
                                    c0333d4.m914d(i57);
                                    c0333d4.f1058w.f955H = (float) dIntBitsToFloat;
                                    break;
                                case 21973:
                                    c0333d4.m914d(i57);
                                    c0333d4.f1058w.f956I = (float) dIntBitsToFloat;
                                    break;
                                case 21974:
                                    c0333d4.m914d(i57);
                                    c0333d4.f1058w.f957J = (float) dIntBitsToFloat;
                                    break;
                                case 21975:
                                    c0333d4.m914d(i57);
                                    c0333d4.f1058w.f958K = (float) dIntBitsToFloat;
                                    break;
                                case 21976:
                                    c0333d4.m914d(i57);
                                    c0333d4.f1058w.f959L = (float) dIntBitsToFloat;
                                    break;
                                case 21977:
                                    c0333d4.m914d(i57);
                                    c0333d4.f1058w.f960M = (float) dIntBitsToFloat;
                                    break;
                                case 21978:
                                    c0333d4.m914d(i57);
                                    c0333d4.f1058w.f961N = (float) dIntBitsToFloat;
                                    break;
                                default:
                                    switch (i57) {
                                        case 30323:
                                            c0333d4.m914d(i57);
                                            c0333d4.f1058w.f993t = (float) dIntBitsToFloat;
                                            break;
                                        case 30324:
                                            c0333d4.m914d(i57);
                                            c0333d4.f1058w.f994u = (float) dIntBitsToFloat;
                                            break;
                                        case 30325:
                                            c0333d4.m914d(i57);
                                            c0333d4.f1058w.f995v = (float) dIntBitsToFloat;
                                            break;
                                        default:
                                            c0333d4.getClass();
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            c0333d4.f1056u = (long) dIntBitsToFloat;
                        }
                        c0331b.f945e = 0;
                    }
                    z4 = true;
                } else {
                    ((C2237j) interfaceC2241n).mo335d((int) c0331b.f947g);
                    c0331b.f945e = 0;
                    str17 = str;
                    str14 = str14;
                    str15 = str15;
                    str16 = str16;
                    str11 = str11;
                    str12 = str12;
                    str13 = str13;
                }
            }
            if (z4) {
                long j10 = ((C2237j) interfaceC2241n).f9629j;
                c0333d = this;
                if (c0333d.f1006A) {
                    c0333d.f1008C = j10;
                    c0587s.f2181a = c0333d.f1007B;
                    c0333d.f1006A = false;
                    return 1;
                }
                if (c0333d.f1059x) {
                    long j11 = c0333d.f1008C;
                    if (j11 != -1) {
                        c0587s.f2181a = j11;
                        c0333d.f1008C = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                c0333d = this;
            }
            str17 = str;
            str14 = str14;
            str15 = str15;
            str16 = str16;
            str11 = str11;
            str12 = str12;
            str13 = str13;
        }
        if (z4) {
            return 0;
        }
        int i59 = 0;
        while (true) {
            SparseArray sparseArray2 = c0333d.f1036c;
            if (i59 >= sparseArray2.size()) {
                return -1;
            }
            C0332c c0332c5 = (C0332c) sparseArray2.valueAt(i59);
            c0332c5.f972Y.getClass();
            C2227F c2227f = c0332c5.f968U;
            if (c2227f != null) {
                c2227f.m4803a(c0332c5.f972Y, c0332c5.f983j);
            }
            i59++;
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) throws EOFException, InterruptedIOException {
        C0334e c0334e = new C0334e(0, (byte) 0);
        C2237j c2237j = (C2237j) interfaceC2241n;
        long j3 = c2237j.f9628i;
        long j4 = 1024;
        if (j3 != -1 && j3 <= 1024) {
            j4 = j3;
        }
        int i3 = (int) j4;
        C0651s c0651s = (C0651s) c0334e.f1063h;
        c2237j.mo338i(c0651s.f2520a, 0, 4, false);
        c0334e.f1062g = 4;
        for (long jM1689w = c0651s.m1689w(); jM1689w != 440786851; jM1689w = ((jM1689w << 8) & (-256)) | ((long) (c0651s.f2520a[0] & 255))) {
            int i4 = c0334e.f1062g + 1;
            c0334e.f1062g = i4;
            if (i4 == i3) {
                return false;
            }
            c2237j.mo338i(c0651s.f2520a, 0, 1, false);
        }
        long jM931k = c0334e.m931k(c2237j);
        long j5 = c0334e.f1062g;
        if (jM931k != Long.MIN_VALUE && (j3 == -1 || j5 + jM931k < j3)) {
            while (true) {
                long j6 = c0334e.f1062g;
                long j7 = j5 + jM931k;
                if (j6 < j7) {
                    if (c0334e.m931k(c2237j) == Long.MIN_VALUE) {
                        break;
                    }
                    long jM931k2 = c0334e.m931k(c2237j);
                    if (jM931k2 < 0 || jM931k2 > 2147483647L) {
                        break;
                    }
                    if (jM931k2 != 0) {
                        int i5 = (int) jM931k2;
                        c2237j.m4831b(i5, false);
                        c0334e.f1062g += i5;
                    }
                } else if (j6 == j7) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m915g(C0332c c0332c, long j3, int i3, int i4, int i5) {
        byte[] bArrM912i;
        int i6;
        int i7;
        C2227F c2227f = c0332c.f968U;
        if (c2227f != null) {
            c2227f.m4804b(c0332c.f972Y, j3, i3, i4, i5, c0332c.f983j);
        } else {
            if ("S_TEXT/UTF8".equals(c0332c.f975b) || "S_TEXT/ASS".equals(c0332c.f975b) || "S_TEXT/WEBVTT".equals(c0332c.f975b)) {
                if (this.f1018M > 1) {
                    AbstractC0646n.m1647y("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j4 = this.f1016K;
                    if (j4 == -9223372036854775807L) {
                        AbstractC0646n.m1647y("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = c0332c.f975b;
                        C0651s c0651s = this.f1048m;
                        byte[] bArr = c0651s.f2520a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                bArrM912i = m912i(j4, 10000L, "%01d:%02d:%02d:%02d");
                                i6 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrM912i = m912i(j4, 1000L, "%02d:%02d:%02d.%03d");
                                i6 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrM912i = m912i(j4, 1000L, "%02d:%02d:%02d,%03d");
                                i6 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrM912i, 0, bArr, i6, bArrM912i.length);
                        for (int i8 = c0651s.f2521b; i8 < c0651s.f2522c; i8++) {
                            if (c0651s.f2520a[i8] == 0) {
                                c0651s.m1664F(i8);
                                c0332c.f972Y.mo1173b(c0651s.f2522c, c0651s);
                                i7 = i4 + c0651s.f2522c;
                            }
                        }
                        c0332c.f972Y.mo1173b(c0651s.f2522c, c0651s);
                        i7 = i4 + c0651s.f2522c;
                    }
                }
                i7 = i4;
            } else {
                i7 = i4;
            }
            if ((i3 & 268435456) != 0) {
                int i9 = this.f1018M;
                C0651s c0651s2 = this.f1051p;
                if (i9 > 1) {
                    c0651s2.m1662D(0);
                } else {
                    int i10 = c0651s2.f2522c;
                    c0332c.f972Y.mo1175d(c0651s2, i10, 2);
                    i7 += i10;
                }
            }
            c0332c.f972Y.mo1172a(j3, i3, i7, i5, c0332c.f983j);
        }
        this.f1013H = true;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        if (this.f1040e) {
            interfaceC2242o = new C0858A(interfaceC2242o, this.f1041f);
        }
        this.f1039d0 = interfaceC2242o;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        this.f1009D = -9223372036854775807L;
        this.f1014I = 0;
        C0331b c0331b = this.f1032a;
        c0331b.f945e = 0;
        c0331b.f942b.clear();
        C0335f c0335f = c0331b.f943c;
        c0335f.f1066b = 0;
        c0335f.f1067c = 0;
        C0335f c0335f2 = this.f1034b;
        c0335f2.f1066b = 0;
        c0335f2.f1067c = 0;
        m917l();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f1036c;
            if (i3 >= sparseArray.size()) {
                return;
            }
            C2227F c2227f = ((C0332c) sparseArray.valueAt(i3)).f968U;
            if (c2227f != null) {
                c2227f.f9556b = false;
                c2227f.f9557c = 0;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m916k(C2237j c2237j, int i3) {
        C0651s c0651s = this.f1044i;
        if (c0651s.f2522c >= i3) {
            return;
        }
        byte[] bArr = c0651s.f2520a;
        if (bArr.length < i3) {
            c0651s.m1668b(Math.max(bArr.length * 2, i3));
        }
        byte[] bArr2 = c0651s.f2520a;
        int i4 = c0651s.f2522c;
        c2237j.mo336f(bArr2, i4, i3 - i4, false);
        c0651s.m1664F(i3);
    }

    /* JADX INFO: renamed from: l */
    public final void m917l() {
        this.f1026U = 0;
        this.f1027V = 0;
        this.f1028W = 0;
        this.f1029X = false;
        this.f1030Y = false;
        this.f1031Z = false;
        this.f1033a0 = 0;
        this.f1035b0 = (byte) 0;
        this.f1037c0 = false;
        this.f1047l.m1662D(0);
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: m */
    public final List mo332m() {
        C1674E c1674e = AbstractC1676G.f7601h;
        return C1692X.f7629k;
    }

    /* JADX INFO: renamed from: n */
    public final long m918n(long j3) throws C0546I {
        long j4 = this.f1055t;
        if (j4 == -9223372036854775807L) {
            throw C0546I.m1365a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i3 = AbstractC0632A.f2454a;
        return AbstractC0632A.m1577R(j3, j4, 1000L, RoundingMode.DOWN);
    }

    /* JADX INFO: renamed from: o */
    public final int m919o(C2237j c2237j, C0332c c0332c, int i3, boolean z3) {
        int iMo1174c;
        int iMo1174c2;
        boolean z4;
        int i4;
        if ("S_TEXT/UTF8".equals(c0332c.f975b)) {
            m920p(c2237j, f1000e0, i3);
            int i5 = this.f1027V;
            m917l();
            return i5;
        }
        if ("S_TEXT/ASS".equals(c0332c.f975b)) {
            m920p(c2237j, f1002g0, i3);
            int i6 = this.f1027V;
            m917l();
            return i6;
        }
        if ("S_TEXT/WEBVTT".equals(c0332c.f975b)) {
            m920p(c2237j, f1003h0, i3);
            int i7 = this.f1027V;
            m917l();
            return i7;
        }
        InterfaceC2226E interfaceC2226E = c0332c.f972Y;
        boolean z5 = this.f1029X;
        C0651s c0651s = this.f1047l;
        if (!z5) {
            boolean z6 = c0332c.f981h;
            C0651s c0651s2 = this.f1044i;
            if (z6) {
                this.f1022Q &= -1073741825;
                if (!this.f1030Y) {
                    c2237j.mo336f(c0651s2.f2520a, 0, 1, false);
                    this.f1026U++;
                    byte b3 = c0651s2.f2520a[0];
                    if ((b3 & 128) == 128) {
                        throw C0546I.m1365a(null, "Extension bit is set in signal byte");
                    }
                    this.f1035b0 = b3;
                    this.f1030Y = true;
                }
                byte b4 = this.f1035b0;
                if ((b4 & 1) == 1) {
                    boolean z7 = (b4 & 2) == 2;
                    this.f1022Q |= 1073741824;
                    if (!this.f1037c0) {
                        C0651s c0651s3 = this.f1049n;
                        c2237j.mo336f(c0651s3.f2520a, 0, 8, false);
                        this.f1026U += 8;
                        this.f1037c0 = true;
                        c0651s2.f2520a[0] = (byte) ((z7 ? 128 : 0) | 8);
                        c0651s2.m1665G(0);
                        interfaceC2226E.mo1175d(c0651s2, 1, 1);
                        this.f1027V++;
                        c0651s3.m1665G(0);
                        interfaceC2226E.mo1175d(c0651s3, 8, 1);
                        this.f1027V += 8;
                    }
                    if (z7) {
                        if (!this.f1031Z) {
                            c2237j.mo336f(c0651s2.f2520a, 0, 1, false);
                            this.f1026U++;
                            c0651s2.m1665G(0);
                            this.f1033a0 = c0651s2.m1687u();
                            this.f1031Z = true;
                        }
                        int i8 = this.f1033a0 * 4;
                        c0651s2.m1662D(i8);
                        c2237j.mo336f(c0651s2.f2520a, 0, i8, false);
                        this.f1026U += i8;
                        short s3 = (short) ((this.f1033a0 / 2) + 1);
                        int i9 = (s3 * 6) + 2;
                        ByteBuffer byteBuffer = this.f1052q;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.f1052q = ByteBuffer.allocate(i9);
                        }
                        this.f1052q.position(0);
                        this.f1052q.putShort(s3);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i4 = this.f1033a0;
                            if (i10 >= i4) {
                                break;
                            }
                            int iM1691y = c0651s2.m1691y();
                            if (i10 % 2 == 0) {
                                this.f1052q.putShort((short) (iM1691y - i11));
                            } else {
                                this.f1052q.putInt(iM1691y - i11);
                            }
                            i10++;
                            i11 = iM1691y;
                        }
                        int i12 = (i3 - this.f1026U) - i11;
                        if (i4 % 2 == 1) {
                            this.f1052q.putInt(i12);
                        } else {
                            this.f1052q.putShort((short) i12);
                            this.f1052q.putInt(0);
                        }
                        byte[] bArrArray = this.f1052q.array();
                        C0651s c0651s4 = this.f1050o;
                        c0651s4.m1663E(bArrArray, i9);
                        interfaceC2226E.mo1175d(c0651s4, i9, 1);
                        this.f1027V += i9;
                    }
                }
            } else {
                byte[] bArr = c0332c.f982i;
                if (bArr != null) {
                    c0651s.m1663E(bArr, bArr.length);
                }
            }
            if ("A_OPUS".equals(c0332c.f975b)) {
                z4 = z3;
            } else {
                z4 = c0332c.f979f > 0;
            }
            if (z4) {
                this.f1022Q |= 268435456;
                this.f1051p.m1662D(0);
                int i13 = (c0651s.f2522c + i3) - this.f1026U;
                c0651s2.m1662D(4);
                byte[] bArr2 = c0651s2.f2520a;
                bArr2[0] = (byte) ((i13 >> 24) & 255);
                bArr2[1] = (byte) ((i13 >> 16) & 255);
                bArr2[2] = (byte) ((i13 >> 8) & 255);
                bArr2[3] = (byte) (i13 & 255);
                interfaceC2226E.mo1175d(c0651s2, 4, 2);
                this.f1027V += 4;
            }
            this.f1029X = true;
        }
        int i14 = i3 + c0651s.f2522c;
        if (!"V_MPEG4/ISO/AVC".equals(c0332c.f975b) && !"V_MPEGH/ISO/HEVC".equals(c0332c.f975b)) {
            if (c0332c.f968U != null) {
                AbstractC0646n.m1630h(c0651s.f2522c == 0);
                c0332c.f968U.m4805c(c2237j);
            }
            while (true) {
                int i15 = this.f1026U;
                if (i15 >= i14) {
                    break;
                }
                int i16 = i14 - i15;
                int iM1667a = c0651s.m1667a();
                if (iM1667a > 0) {
                    iMo1174c2 = Math.min(i16, iM1667a);
                    interfaceC2226E.mo1173b(iMo1174c2, c0651s);
                } else {
                    iMo1174c2 = interfaceC2226E.mo1174c(c2237j, i16, false);
                }
                this.f1026U += iMo1174c2;
                this.f1027V += iMo1174c2;
            }
        } else {
            C0651s c0651s5 = this.f1043h;
            byte[] bArr3 = c0651s5.f2520a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i17 = c0332c.f973Z;
            int i18 = 4 - i17;
            while (this.f1026U < i14) {
                int i19 = this.f1028W;
                if (i19 == 0) {
                    int iMin = Math.min(i17, c0651s.m1667a());
                    c2237j.mo336f(bArr3, i18 + iMin, i17 - iMin, false);
                    if (iMin > 0) {
                        c0651s.m1671e(bArr3, i18, iMin);
                    }
                    this.f1026U += i17;
                    c0651s5.m1665G(0);
                    this.f1028W = c0651s5.m1691y();
                    C0651s c0651s6 = this.f1042g;
                    c0651s6.m1665G(0);
                    interfaceC2226E.mo1173b(4, c0651s6);
                    this.f1027V += 4;
                } else {
                    int iM1667a2 = c0651s.m1667a();
                    if (iM1667a2 > 0) {
                        iMo1174c = Math.min(i19, iM1667a2);
                        interfaceC2226E.mo1173b(iMo1174c, c0651s);
                    } else {
                        iMo1174c = interfaceC2226E.mo1174c(c2237j, i19, false);
                    }
                    this.f1026U += iMo1174c;
                    this.f1027V += iMo1174c;
                    this.f1028W -= iMo1174c;
                }
            }
        }
        if ("A_VORBIS".equals(c0332c.f975b)) {
            C0651s c0651s7 = this.f1045j;
            c0651s7.m1665G(0);
            interfaceC2226E.mo1173b(4, c0651s7);
            this.f1027V += 4;
        }
        int i20 = this.f1027V;
        m917l();
        return i20;
    }

    /* JADX INFO: renamed from: p */
    public final void m920p(C2237j c2237j, byte[] bArr, int i3) {
        int length = bArr.length + i3;
        C0651s c0651s = this.f1048m;
        byte[] bArr2 = c0651s.f2520a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i3);
            c0651s.m1663E(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        c2237j.mo336f(c0651s.f2520a, bArr.length, i3, false);
        c0651s.m1665G(0);
        c0651s.m1664F(length);
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: a */
    public final void mo325a() {
    }
}
