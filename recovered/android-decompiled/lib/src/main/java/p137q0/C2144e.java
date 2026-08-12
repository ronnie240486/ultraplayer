package p137q0;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.zuxoplayer.app.PlayerActivity;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p009D0.C0106b;
import p011E.C0111d;
import p036M0.C0380q;
import p045P0.AbstractC0462h;
import p046P1.C0475c;
import p055T.AbstractC0545H;
import p055T.AbstractC0558V;
import p055T.C0556T;
import p055T.C0573f;
import p055T.C0574f0;
import p055T.C0576h;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0652t;
import p064W.C0653u;
import p064W.C0655w;
import p064W.RunnableC0638f;
import p064W.RunnableC0647o;
import p073Z.C0771f;
import p077a0.C0793D;
import p077a0.C0829h;
import p077a0.C0830h0;
import p077a0.C0831i;
import p077a0.C0839o;
import p077a0.SurfaceHolderCallbackC0850z;
import p085c0.C1133i;
import p088d0.InterfaceC1384h;
import p089d1.C1447t;
import p103h0.AbstractC1609r;
import p103h0.AbstractC1616y;
import p103h0.C1601j;
import p103h0.C1605n;
import p103h0.C1606o;
import p103h0.C1608q;
import p103h0.C1611t;
import p103h0.InterfaceC1602k;
import p103h0.InterfaceC1603l;
import p105h2.C1692X;
import p114k0.C1907A;
import p119l2.EnumC1991a;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: q0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2144e extends AbstractC1609r {

    /* JADX INFO: renamed from: s1 */
    public static final int[] f9219s1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: t1 */
    public static boolean f9220t1;

    /* JADX INFO: renamed from: u1 */
    public static boolean f9221u1;

    /* JADX INFO: renamed from: I0 */
    public final Context f9222I0;

    /* JADX INFO: renamed from: J0 */
    public final boolean f9223J0;

    /* JADX INFO: renamed from: K0 */
    public final C1133i f9224K0;

    /* JADX INFO: renamed from: L0 */
    public final int f9225L0;

    /* JADX INFO: renamed from: M0 */
    public final boolean f9226M0;

    /* JADX INFO: renamed from: N0 */
    public final C2156q f9227N0;

    /* JADX INFO: renamed from: O0 */
    public final C2155p f9228O0;

    /* JADX INFO: renamed from: P0 */
    public C0576h f9229P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f9230Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f9231R0;

    /* JADX INFO: renamed from: S0 */
    public C2149j f9232S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f9233T0;

    /* JADX INFO: renamed from: U0 */
    public List f9234U0;

    /* JADX INFO: renamed from: V0 */
    public Surface f9235V0;

    /* JADX INFO: renamed from: W0 */
    public C2146g f9236W0;

    /* JADX INFO: renamed from: X0 */
    public C0652t f9237X0;

    /* JADX INFO: renamed from: Y0 */
    public boolean f9238Y0;

    /* JADX INFO: renamed from: Z0 */
    public int f9239Z0;

    /* JADX INFO: renamed from: a1 */
    public int f9240a1;

    /* JADX INFO: renamed from: b1 */
    public long f9241b1;

    /* JADX INFO: renamed from: c1 */
    public int f9242c1;

    /* JADX INFO: renamed from: d1 */
    public int f9243d1;

    /* JADX INFO: renamed from: e1 */
    public int f9244e1;

    /* JADX INFO: renamed from: f1 */
    public long f9245f1;

    /* JADX INFO: renamed from: g1 */
    public int f9246g1;

    /* JADX INFO: renamed from: h1 */
    public long f9247h1;

    /* JADX INFO: renamed from: i1 */
    public C0574f0 f9248i1;

    /* JADX INFO: renamed from: j1 */
    public C0574f0 f9249j1;

    /* JADX INFO: renamed from: k1 */
    public int f9250k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f9251l1;

    /* JADX INFO: renamed from: m1 */
    public int f9252m1;

    /* JADX INFO: renamed from: n1 */
    public C2143d f9253n1;

    /* JADX INFO: renamed from: o1 */
    public InterfaceC2154o f9254o1;

    /* JADX INFO: renamed from: p1 */
    public long f9255p1;

    /* JADX INFO: renamed from: q1 */
    public long f9256q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f9257r1;

    public C2144e(PlayerActivity playerActivity, InterfaceC1602k interfaceC1602k, Handler handler, SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z) {
        super(2, interfaceC1602k, 30.0f);
        Context applicationContext = playerActivity.getApplicationContext();
        this.f9222I0 = applicationContext;
        this.f9225L0 = 50;
        this.f9232S0 = null;
        this.f9224K0 = new C1133i(handler, surfaceHolderCallbackC0850z, 1);
        this.f9223J0 = true;
        this.f9227N0 = new C2156q(applicationContext, this);
        this.f9228O0 = new C2155p();
        this.f9226M0 = "NVIDIA".equals(AbstractC0632A.f2456c);
        this.f9237X0 = C0652t.f2523c;
        this.f9239Z0 = 1;
        this.f9240a1 = 0;
        this.f9248i1 = C0574f0.f2070d;
        this.f9252m1 = 0;
        this.f9249j1 = null;
        this.f9250k1 = -1000;
        this.f9255p1 = -9223372036854775807L;
        this.f9256q1 = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:103:0x012f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0140  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:112:0x014d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x015a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163  */
    /* JADX WARN: Code duplicated, block: B:120:0x0167  */
    /* JADX WARN: Code duplicated, block: B:123:0x0170  */
    /* JADX WARN: Code duplicated, block: B:124:0x0174  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0181  */
    /* JADX WARN: Code duplicated, block: B:131:0x018a  */
    /* JADX WARN: Code duplicated, block: B:132:0x018e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0197  */
    /* JADX WARN: Code duplicated, block: B:136:0x019b  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:155:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:167:0x0207  */
    /* JADX WARN: Code duplicated, block: B:168:0x020b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0215  */
    /* JADX WARN: Code duplicated, block: B:172:0x0219  */
    /* JADX WARN: Code duplicated, block: B:175:0x0223  */
    /* JADX WARN: Code duplicated, block: B:176:0x0227  */
    /* JADX WARN: Code duplicated, block: B:179:0x0231  */
    /* JADX WARN: Code duplicated, block: B:180:0x0235  */
    /* JADX WARN: Code duplicated, block: B:183:0x023f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0243  */
    /* JADX WARN: Code duplicated, block: B:187:0x024d  */
    /* JADX WARN: Code duplicated, block: B:188:0x0251  */
    /* JADX WARN: Code duplicated, block: B:191:0x025b  */
    /* JADX WARN: Code duplicated, block: B:192:0x025f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0269  */
    /* JADX WARN: Code duplicated, block: B:196:0x026d  */
    /* JADX WARN: Code duplicated, block: B:199:0x0277  */
    /* JADX WARN: Code duplicated, block: B:200:0x027b  */
    /* JADX WARN: Code duplicated, block: B:203:0x0285  */
    /* JADX WARN: Code duplicated, block: B:204:0x0289  */
    /* JADX WARN: Code duplicated, block: B:207:0x0293  */
    /* JADX WARN: Code duplicated, block: B:208:0x0297  */
    /* JADX WARN: Code duplicated, block: B:211:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:212:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:215:0x02af  */
    /* JADX WARN: Code duplicated, block: B:216:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:219:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:220:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:223:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:224:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:227:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:228:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:231:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:232:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:235:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:236:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:239:0x0303  */
    /* JADX WARN: Code duplicated, block: B:240:0x0307  */
    /* JADX WARN: Code duplicated, block: B:243:0x0311  */
    /* JADX WARN: Code duplicated, block: B:244:0x0315  */
    /* JADX WARN: Code duplicated, block: B:247:0x031f  */
    /* JADX WARN: Code duplicated, block: B:248:0x0323  */
    /* JADX WARN: Code duplicated, block: B:251:0x032d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0331  */
    /* JADX WARN: Code duplicated, block: B:255:0x033b  */
    /* JADX WARN: Code duplicated, block: B:256:0x033f  */
    /* JADX WARN: Code duplicated, block: B:259:0x0349  */
    /* JADX WARN: Code duplicated, block: B:260:0x034d  */
    /* JADX WARN: Code duplicated, block: B:263:0x0357  */
    /* JADX WARN: Code duplicated, block: B:264:0x035b  */
    /* JADX WARN: Code duplicated, block: B:267:0x0365  */
    /* JADX WARN: Code duplicated, block: B:268:0x0369  */
    /* JADX WARN: Code duplicated, block: B:271:0x0373  */
    /* JADX WARN: Code duplicated, block: B:272:0x0377  */
    /* JADX WARN: Code duplicated, block: B:275:0x0381  */
    /* JADX WARN: Code duplicated, block: B:276:0x0385  */
    /* JADX WARN: Code duplicated, block: B:279:0x038f  */
    /* JADX WARN: Code duplicated, block: B:280:0x0393  */
    /* JADX WARN: Code duplicated, block: B:283:0x039d  */
    /* JADX WARN: Code duplicated, block: B:284:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:287:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:288:0x03af  */
    /* JADX WARN: Code duplicated, block: B:291:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:292:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:295:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:296:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:299:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:300:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:303:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:304:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:307:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:308:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:311:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:312:0x0403  */
    /* JADX WARN: Code duplicated, block: B:315:0x040d  */
    /* JADX WARN: Code duplicated, block: B:316:0x0411  */
    /* JADX WARN: Code duplicated, block: B:319:0x041b  */
    /* JADX WARN: Code duplicated, block: B:320:0x041f  */
    /* JADX WARN: Code duplicated, block: B:323:0x0429  */
    /* JADX WARN: Code duplicated, block: B:324:0x042d  */
    /* JADX WARN: Code duplicated, block: B:327:0x0437  */
    /* JADX WARN: Code duplicated, block: B:328:0x043b  */
    /* JADX WARN: Code duplicated, block: B:331:0x0445  */
    /* JADX WARN: Code duplicated, block: B:332:0x0449  */
    /* JADX WARN: Code duplicated, block: B:335:0x0453  */
    /* JADX WARN: Code duplicated, block: B:336:0x0457  */
    /* JADX WARN: Code duplicated, block: B:339:0x0461  */
    /* JADX WARN: Code duplicated, block: B:340:0x0465  */
    /* JADX WARN: Code duplicated, block: B:343:0x046f  */
    /* JADX WARN: Code duplicated, block: B:344:0x0473  */
    /* JADX WARN: Code duplicated, block: B:347:0x047d  */
    /* JADX WARN: Code duplicated, block: B:348:0x0481  */
    /* JADX WARN: Code duplicated, block: B:351:0x048b  */
    /* JADX WARN: Code duplicated, block: B:352:0x048f  */
    /* JADX WARN: Code duplicated, block: B:355:0x0499  */
    /* JADX WARN: Code duplicated, block: B:356:0x049d  */
    /* JADX WARN: Code duplicated, block: B:359:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:360:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:363:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:364:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:367:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:368:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:371:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:372:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:375:0x04df  */
    /* JADX WARN: Code duplicated, block: B:376:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:379:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:380:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:383:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:384:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:387:0x0509  */
    /* JADX WARN: Code duplicated, block: B:388:0x050d  */
    /* JADX WARN: Code duplicated, block: B:391:0x0517  */
    /* JADX WARN: Code duplicated, block: B:392:0x051b  */
    /* JADX WARN: Code duplicated, block: B:395:0x0525  */
    /* JADX WARN: Code duplicated, block: B:396:0x0529  */
    /* JADX WARN: Code duplicated, block: B:399:0x0533  */
    /* JADX WARN: Code duplicated, block: B:400:0x0537  */
    /* JADX WARN: Code duplicated, block: B:403:0x0541  */
    /* JADX WARN: Code duplicated, block: B:404:0x0545  */
    /* JADX WARN: Code duplicated, block: B:407:0x054f  */
    /* JADX WARN: Code duplicated, block: B:408:0x0553  */
    /* JADX WARN: Code duplicated, block: B:411:0x055d  */
    /* JADX WARN: Code duplicated, block: B:412:0x0561  */
    /* JADX WARN: Code duplicated, block: B:415:0x056b  */
    /* JADX WARN: Code duplicated, block: B:416:0x056f  */
    /* JADX WARN: Code duplicated, block: B:419:0x0579  */
    /* JADX WARN: Code duplicated, block: B:420:0x057d  */
    /* JADX WARN: Code duplicated, block: B:423:0x0587  */
    /* JADX WARN: Code duplicated, block: B:424:0x058b  */
    /* JADX WARN: Code duplicated, block: B:427:0x0595  */
    /* JADX WARN: Code duplicated, block: B:428:0x0599  */
    /* JADX WARN: Code duplicated, block: B:431:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:432:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:435:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:436:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:439:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:440:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:443:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:444:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:447:0x05db  */
    /* JADX WARN: Code duplicated, block: B:448:0x05df  */
    /* JADX WARN: Code duplicated, block: B:451:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:452:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:455:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:456:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:459:0x0605  */
    /* JADX WARN: Code duplicated, block: B:460:0x0609  */
    /* JADX WARN: Code duplicated, block: B:463:0x0613  */
    /* JADX WARN: Code duplicated, block: B:464:0x0617  */
    /* JADX WARN: Code duplicated, block: B:467:0x0621  */
    /* JADX WARN: Code duplicated, block: B:468:0x0625  */
    /* JADX WARN: Code duplicated, block: B:471:0x062f  */
    /* JADX WARN: Code duplicated, block: B:472:0x0633  */
    /* JADX WARN: Code duplicated, block: B:475:0x063d  */
    /* JADX WARN: Code duplicated, block: B:476:0x0641  */
    /* JADX WARN: Code duplicated, block: B:479:0x064b  */
    /* JADX WARN: Code duplicated, block: B:480:0x064f  */
    /* JADX WARN: Code duplicated, block: B:483:0x0659  */
    /* JADX WARN: Code duplicated, block: B:484:0x065d  */
    /* JADX WARN: Code duplicated, block: B:487:0x0667  */
    /* JADX WARN: Code duplicated, block: B:488:0x066b  */
    /* JADX WARN: Code duplicated, block: B:491:0x0675  */
    /* JADX WARN: Code duplicated, block: B:492:0x0679  */
    /* JADX WARN: Code duplicated, block: B:495:0x0683  */
    /* JADX WARN: Code duplicated, block: B:496:0x0687  */
    /* JADX WARN: Code duplicated, block: B:499:0x0691  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:500:0x0695  */
    /* JADX WARN: Code duplicated, block: B:503:0x069f  */
    /* JADX WARN: Code duplicated, block: B:504:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:507:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:508:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:511:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:512:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:515:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:516:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:519:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:520:0x06db  */
    /* JADX WARN: Code duplicated, block: B:523:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:524:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:527:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:528:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:531:0x0701  */
    /* JADX WARN: Code duplicated, block: B:532:0x0705  */
    /* JADX WARN: Code duplicated, block: B:535:0x070f  */
    /* JADX WARN: Code duplicated, block: B:536:0x0713  */
    /* JADX WARN: Code duplicated, block: B:539:0x071d  */
    /* JADX WARN: Code duplicated, block: B:540:0x0721  */
    /* JADX WARN: Code duplicated, block: B:543:0x072b  */
    /* JADX WARN: Code duplicated, block: B:544:0x072f  */
    /* JADX WARN: Code duplicated, block: B:547:0x0739  */
    /* JADX WARN: Code duplicated, block: B:548:0x073d  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f A[Catch: all -> 0x08c0, TRY_LEAVE, TryCatch #0 {all -> 0x08c0, blocks: (B:7:0x001d, B:9:0x0021, B:11:0x0025, B:662:0x08bb, B:51:0x0094, B:54:0x009f, B:96:0x0117, B:665:0x08c2), top: B:670:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:551:0x0747  */
    /* JADX WARN: Code duplicated, block: B:552:0x074b  */
    /* JADX WARN: Code duplicated, block: B:555:0x0755  */
    /* JADX WARN: Code duplicated, block: B:558:0x075f  */
    /* JADX WARN: Code duplicated, block: B:559:0x0763  */
    /* JADX WARN: Code duplicated, block: B:562:0x076d  */
    /* JADX WARN: Code duplicated, block: B:563:0x0771  */
    /* JADX WARN: Code duplicated, block: B:566:0x077b  */
    /* JADX WARN: Code duplicated, block: B:567:0x077f  */
    /* JADX WARN: Code duplicated, block: B:570:0x0789  */
    /* JADX WARN: Code duplicated, block: B:571:0x078d  */
    /* JADX WARN: Code duplicated, block: B:574:0x0797  */
    /* JADX WARN: Code duplicated, block: B:575:0x079b  */
    /* JADX WARN: Code duplicated, block: B:578:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:579:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:582:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:583:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:586:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:587:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:590:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:591:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:594:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:595:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:598:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:599:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:602:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:603:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:606:0x0807  */
    /* JADX WARN: Code duplicated, block: B:607:0x080b  */
    /* JADX WARN: Code duplicated, block: B:610:0x0815  */
    /* JADX WARN: Code duplicated, block: B:611:0x0819  */
    /* JADX WARN: Code duplicated, block: B:614:0x0823  */
    /* JADX WARN: Code duplicated, block: B:615:0x0827  */
    /* JADX WARN: Code duplicated, block: B:618:0x0831  */
    /* JADX WARN: Code duplicated, block: B:619:0x0835  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:622:0x083f  */
    /* JADX WARN: Code duplicated, block: B:623:0x0843  */
    /* JADX WARN: Code duplicated, block: B:626:0x084d  */
    /* JADX WARN: Code duplicated, block: B:627:0x0851  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:630:0x085b  */
    /* JADX WARN: Code duplicated, block: B:631:0x085d  */
    /* JADX WARN: Code duplicated, block: B:634:0x0867  */
    /* JADX WARN: Code duplicated, block: B:635:0x0869  */
    /* JADX WARN: Code duplicated, block: B:638:0x0873  */
    /* JADX WARN: Code duplicated, block: B:639:0x0875  */
    /* JADX WARN: Code duplicated, block: B:642:0x087f  */
    /* JADX WARN: Code duplicated, block: B:643:0x0881  */
    /* JADX WARN: Code duplicated, block: B:646:0x088b  */
    /* JADX WARN: Code duplicated, block: B:647:0x088d  */
    /* JADX WARN: Code duplicated, block: B:650:0x0897  */
    /* JADX WARN: Code duplicated, block: B:651:0x0899  */
    /* JADX WARN: Code duplicated, block: B:654:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:655:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:658:0x08af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:660:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0117 A[Catch: all -> 0x08c0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08c0, blocks: (B:7:0x001d, B:9:0x0021, B:11:0x0025, B:662:0x08bb, B:51:0x0094, B:54:0x009f, B:96:0x0117, B:665:0x08c2), top: B:670:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0123  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: v0 */
    public static boolean m4716v0(String str) {
        String str2;
        byte b3;
        String str3;
        byte b4;
        byte b5 = 26;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C2144e.class) {
            try {
                if (!f9220t1) {
                    int i3 = AbstractC0632A.f2454a;
                    if (i3 <= 28) {
                        String str4 = AbstractC0632A.f2455b;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                if (!str4.equals("dangal")) {
                                    b4 = -1;
                                } else {
                                    b4 = 0;
                                }
                                break;
                            case -1220081023:
                                if (!str4.equals("dangalFHD")) {
                                    b4 = -1;
                                } else {
                                    b4 = 1;
                                }
                                break;
                            case -1220066608:
                                if (!str4.equals("dangalUHD")) {
                                    b4 = -1;
                                } else {
                                    b4 = 2;
                                }
                                break;
                            case -1012436106:
                                if (!str4.equals("oneday")) {
                                    b4 = -1;
                                } else {
                                    b4 = 3;
                                }
                                break;
                            case -760312546:
                                if (!str4.equals("aquaman")) {
                                    b4 = -1;
                                } else {
                                    b4 = 4;
                                }
                                break;
                            case -64886864:
                                if (!str4.equals("magnolia")) {
                                    b4 = -1;
                                } else {
                                    b4 = 5;
                                }
                                break;
                            case 3415681:
                                if (!str4.equals("once")) {
                                    b4 = -1;
                                } else {
                                    b4 = 6;
                                }
                                break;
                            case 825323514:
                                if (!str4.equals("machuca")) {
                                    b4 = -1;
                                } else {
                                    b4 = 7;
                                }
                                break;
                            default:
                                b4 = -1;
                                break;
                        }
                        switch (b4) {
                            default:
                                if (i3 <= 27 || !"HWEML".equals(AbstractC0632A.f2455b)) {
                                    str2 = AbstractC0632A.f2457d;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b3 = 0;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b3 = 1;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b3 = 2;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b3 = 3;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b3 = 4;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b3 = 5;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b3 = 6;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b3 = 7;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b3 = 8;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    switch (b3) {
                                        default:
                                            if (i3 <= 26) {
                                                str3 = AbstractC0632A.f2455b;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b5 = 0;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b5 = 1;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b5 = 2;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b5 = 3;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b5 = 4;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b5 = 5;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b5 = 6;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b5 = 7;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b5 = 8;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b5 = 9;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b5 = 10;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b5 = 11;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b5 = 12;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b5 = 13;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b5 = 14;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b5 = 15;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b5 = 16;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b5 = 17;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b5 = 18;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b5 = 19;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b5 = 20;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b5 = 21;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b5 = 22;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b5 = 23;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b5 = 24;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b5 = 25;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b5 = 27;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b5 = 28;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b5 = 29;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b5 = 30;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b5 = 31;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b5 = 32;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b5 = 33;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b5 = 34;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b5 = 35;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b5 = 36;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b5 = 37;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b5 = 38;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b5 = 39;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b5 = 40;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b5 = 41;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b5 = 42;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b5 = 43;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2126:
                                                        if (!str3.equals("C1")) {
                                                            b5 = 44;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b5 = 45;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b5 = 46;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b5 = 47;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b5 = 48;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b5 = 49;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b5 = 50;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b5 = 51;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b5 = 52;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b5 = 53;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b5 = 54;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b5 = 55;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b5 = 56;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b5 = 57;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b5 = 58;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b5 = 59;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b5 = 60;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b5 = 61;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b5 = 62;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b5 = 63;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b5 = 64;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b5 = 65;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b5 = 66;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b5 = 67;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b5 = 68;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b5 = 69;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b5 = 70;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b5 = 71;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b5 = 72;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b5 = 73;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b5 = 74;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b5 = 75;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b5 = 76;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b5 = 77;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b5 = 78;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b5 = 79;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b5 = 80;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b5 = 81;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b5 = 82;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b5 = 83;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b5 = 84;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b5 = 85;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b5 = 86;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b5 = 87;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b5 = 88;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b5 = 89;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b5 = 90;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b5 = 91;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b5 = 92;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b5 = 93;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b5 = 94;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b5 = 95;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b5 = 96;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b5 = 97;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b5 = 98;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b5 = 99;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b5 = 100;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b5 = 101;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b5 = 102;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b5 = 103;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b5 = 104;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b5 = 105;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b5 = 106;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b5 = 107;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b5 = 108;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b5 = 109;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b5 = 110;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b5 = 111;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b5 = 112;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b5 = 113;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b5 = 114;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b5 = 115;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b5 = 116;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b5 = 117;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b5 = 118;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b5 = 119;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b5 = 120;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b5 = 121;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b5 = 122;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b5 = 123;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b5 = 124;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b5 = 125;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b5 = 126;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b5 = 127;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b5 = 128;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b5 = 129;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b5 = 130;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b5 = 131;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b5 = 132;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b5 = 133;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b5 = 134;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b5 = 135;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b5 = 136;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b5 = 137;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b5 = 138;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b5 = 139;
                                                        } else {
                                                            b5 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b5 = -1;
                                                        break;
                                                }
                                                switch (b5) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
                                                        }
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
                                                    case 33:
                                                    case 34:
                                                    case 35:
                                                    case 36:
                                                    case 37:
                                                    case 38:
                                                    case 39:
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                    case 43:
                                                    case 44:
                                                    case 45:
                                                    case 46:
                                                    case 47:
                                                    case 48:
                                                    case 49:
                                                    case 50:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case 54:
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case 64:
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                    case 68:
                                                    case 69:
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                    case 74:
                                                    case 75:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                    case 79:
                                                    case 80:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case 85:
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                    case 93:
                                                    case 94:
                                                    case 95:
                                                    case 96:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                    case 100:
                                                    case 101:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                    case 105:
                                                    case 106:
                                                    case 107:
                                                    case 108:
                                                    case 109:
                                                    case 110:
                                                    case 111:
                                                    case 112:
                                                    case 113:
                                                    case 114:
                                                    case 115:
                                                    case 116:
                                                    case 117:
                                                    case 118:
                                                    case 119:
                                                    case 120:
                                                    case 121:
                                                    case 122:
                                                    case 123:
                                                    case 124:
                                                    case 125:
                                                    case 126:
                                                    case 127:
                                                    case 128:
                                                    case 129:
                                                    case 130:
                                                    case 131:
                                                    case 132:
                                                    case 133:
                                                    case 134:
                                                    case 135:
                                                    case 136:
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                        z3 = true;
                                                        break;
                                                }
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z3 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z3 = true;
                                break;
                        }
                    } else if (i3 <= 27) {
                        str2 = AbstractC0632A.f2457d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b3 = 0;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b3 = 1;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b3 = 2;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b3 = 3;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b3 = 4;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b3 = 5;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b3 = 6;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b3 = 7;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b3 = 8;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            default:
                                if (i3 <= 26) {
                                    str3 = AbstractC0632A.f2455b;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b5 = 0;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b5 = 1;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b5 = 2;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b5 = 3;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b5 = 4;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b5 = 5;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b5 = 6;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b5 = 7;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b5 = 8;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b5 = 9;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b5 = 10;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b5 = 11;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b5 = 12;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b5 = 13;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b5 = 14;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b5 = 15;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b5 = 16;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b5 = 17;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b5 = 18;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b5 = 19;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b5 = 20;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b5 = 21;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b5 = 22;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b5 = 23;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b5 = 24;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b5 = 25;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b5 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b5 = 27;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b5 = 28;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b5 = 29;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b5 = 30;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b5 = 31;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b5 = 32;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b5 = 33;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b5 = 34;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b5 = 35;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b5 = 36;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b5 = 37;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b5 = 38;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b5 = 39;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b5 = 40;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b5 = 41;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b5 = 42;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b5 = 43;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b5 = 44;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b5 = 45;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b5 = 46;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b5 = 47;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b5 = 48;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b5 = 49;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b5 = 50;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b5 = 51;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b5 = 52;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b5 = 53;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b5 = 54;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b5 = 55;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b5 = 56;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b5 = 57;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b5 = 58;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b5 = 59;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b5 = 60;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b5 = 61;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b5 = 62;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b5 = 63;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b5 = 64;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b5 = 65;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b5 = 66;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b5 = 67;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b5 = 68;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b5 = 69;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b5 = 70;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b5 = 71;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b5 = 72;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b5 = 73;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b5 = 74;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b5 = 75;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b5 = 76;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b5 = 77;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b5 = 78;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b5 = 79;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b5 = 80;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b5 = 81;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b5 = 82;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b5 = 83;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b5 = 84;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b5 = 85;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b5 = 86;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b5 = 87;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b5 = 88;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b5 = 89;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b5 = 90;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b5 = 91;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b5 = 92;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b5 = 93;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b5 = 94;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b5 = 95;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b5 = 96;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b5 = 97;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b5 = 98;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b5 = 99;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b5 = 100;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b5 = 101;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b5 = 102;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b5 = 103;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b5 = 104;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b5 = 105;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b5 = 106;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b5 = 107;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b5 = 108;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b5 = 109;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b5 = 110;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b5 = 111;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b5 = 112;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b5 = 113;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b5 = 114;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b5 = 115;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b5 = 116;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b5 = 117;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b5 = 118;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b5 = 119;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b5 = 120;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b5 = 121;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b5 = 122;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b5 = 123;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b5 = 124;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b5 = 125;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b5 = 126;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b5 = 127;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b5 = 128;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b5 = 129;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b5 = 130;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b5 = 131;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b5 = 132;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b5 = 133;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b5 = 134;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b5 = 135;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b5 = 136;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b5 = 137;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b5 = 138;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b5 = 139;
                                            } else {
                                                b5 = -1;
                                            }
                                            break;
                                        default:
                                            b5 = -1;
                                            break;
                                    }
                                    switch (b5) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
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
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z3 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z3 = true;
                                break;
                        }
                    } else {
                        str2 = AbstractC0632A.f2457d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b3 = -1;
                                } else {
                                    b3 = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b3 = -1;
                                } else {
                                    b3 = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b3 = -1;
                                } else {
                                    b3 = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b3 = -1;
                                } else {
                                    b3 = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b3 = -1;
                                } else {
                                    b3 = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b3 = -1;
                                } else {
                                    b3 = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b3 = -1;
                                } else {
                                    b3 = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b3 = -1;
                                } else {
                                    b3 = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b3 = -1;
                                } else {
                                    b3 = 8;
                                }
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            default:
                                if (i3 <= 26) {
                                    str3 = AbstractC0632A.f2455b;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 12;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 20;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 22;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 23;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 24;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b5 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 28;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 30;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 43;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 64;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 127;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 128;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 139;
                                            }
                                            break;
                                        default:
                                            b5 = -1;
                                            break;
                                    }
                                    switch (b5) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
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
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z3 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z3 = true;
                                break;
                        }
                    }
                    f9221u1 = z3;
                    f9220t1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9221u1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX INFO: renamed from: w0 */
    public static int m4717w0(C1606o c1606o, C0583o c0583o) {
        int i3;
        int iIntValue;
        byte b3 = 2;
        int i4 = c0583o.f2161u;
        if (i4 != -1 && (i3 = c0583o.f2162v) != -1) {
            String str = c0583o.f2154n;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairM3984d = AbstractC1616y.m3984d(c0583o);
                str = (pairM3984d == null || !((iIntValue = ((Integer) pairM3984d.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
            }
            switch (str.hashCode()) {
                case -1664118616:
                    if (!str.equals("video/3gpp")) {
                        b3 = -1;
                    } else {
                        b3 = 0;
                    }
                    break;
                case -1662735862:
                    if (!str.equals("video/av01")) {
                        b3 = -1;
                    } else {
                        b3 = 1;
                    }
                    break;
                case -1662541442:
                    if (!str.equals("video/hevc")) {
                        b3 = -1;
                    }
                    break;
                case 1187890754:
                    if (!str.equals("video/mp4v-es")) {
                        b3 = -1;
                    } else {
                        b3 = 3;
                    }
                    break;
                case 1331836730:
                    if (!str.equals("video/avc")) {
                        b3 = -1;
                    } else {
                        b3 = 4;
                    }
                    break;
                case 1599127256:
                    if (!str.equals("video/x-vnd.on2.vp8")) {
                        b3 = -1;
                    } else {
                        b3 = 5;
                    }
                    break;
                case 1599127257:
                    if (!str.equals("video/x-vnd.on2.vp9")) {
                        b3 = -1;
                    } else {
                        b3 = 6;
                    }
                    break;
                default:
                    b3 = -1;
                    break;
            }
            switch (b3) {
                case 0:
                case 1:
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                case 5:
                    return ((i4 * i3) * 3) / 4;
                case 2:
                    return Math.max(2097152, ((i4 * i3) * 3) / 4);
                case 4:
                    String str2 = AbstractC0632A.f2457d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(AbstractC0632A.f2456c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !c1606o.f7257f)))) {
                        return ((AbstractC0632A.m1587f(i3, 16) * AbstractC0632A.m1587f(i4, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i4 * i3) * 3) / 8;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: x0 */
    public static List m4718x0(Context context, C1601j c1601j, C0583o c0583o, boolean z3, boolean z4) {
        List listM3985e;
        String str = c0583o.f2154n;
        if (str == null) {
            return C1692X.f7629k;
        }
        if (AbstractC0632A.f2454a >= 26 && "video/dolby-vision".equals(str) && !AbstractC2003a.m4537j(context)) {
            String strM3982b = AbstractC1616y.m3982b(c0583o);
            if (strM3982b == null) {
                listM3985e = C1692X.f7629k;
            } else {
                c1601j.getClass();
                listM3985e = AbstractC1616y.m3985e(strM3982b, z3, z4);
            }
            if (!listM3985e.isEmpty()) {
                return listM3985e;
            }
        }
        return AbstractC1616y.m3987g(c1601j, c0583o, z3, z4);
    }

    /* JADX INFO: renamed from: y0 */
    public static int m4719y0(C1606o c1606o, C0583o c0583o) {
        if (c0583o.f2155o == -1) {
            return m4717w0(c1606o, c0583o);
        }
        List list = c0583o.f2157q;
        int size = list.size();
        int length = 0;
        for (int i3 = 0; i3 < size; i3++) {
            length += ((byte[]) list.get(i3)).length;
        }
        return c0583o.f2155o + length;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m4720A0() {
        if (this.f9242c1 > 0) {
            this.f3483m.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = jElapsedRealtime - this.f9241b1;
            int i3 = this.f9242c1;
            C1133i c1133i = this.f9224K0;
            Handler handler = c1133i.f5252b;
            if (handler != null) {
                handler.post(new RunnableC2161v(c1133i, i3, j3));
            }
            this.f9242c1 = 0;
            this.f9241b1 = jElapsedRealtime;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m4721B0() {
        int i3;
        InterfaceC1603l interfaceC1603l;
        if (!this.f9251l1 || (i3 = AbstractC0632A.f2454a) < 23 || (interfaceC1603l = this.f7294Q) == null) {
            return;
        }
        this.f9253n1 = new C2143d(this, interfaceC1603l);
        if (i3 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            interfaceC1603l.mo3369c(bundle);
        }
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: C */
    public final C0831i mo2980C(C1606o c1606o, C0583o c0583o, C0583o c0583o2) {
        C0831i c0831iM3938b = c1606o.m3938b(c0583o, c0583o2);
        C0576h c0576h = this.f9229P0;
        c0576h.getClass();
        int i3 = c0583o2.f2161u;
        int i4 = c0576h.f2074a;
        int i5 = c0831iM3938b.f3523e;
        if (i3 > i4 || c0583o2.f2162v > c0576h.f2075b) {
            i5 |= 256;
        }
        if (m4719y0(c1606o, c0583o2) > c0576h.f2076c) {
            i5 |= 64;
        }
        int i6 = i5;
        return new C0831i(c1606o.f7252a, c0583o, c0583o2, i6 != 0 ? 0 : c0831iM3938b.f3522d, i6);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m4722C0(InterfaceC1603l interfaceC1603l, int i3, long j3) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC1603l.mo3379m(i3, j3);
        Trace.endSection();
        this.f7278D0.f3508e++;
        this.f9243d1 = 0;
        if (this.f9232S0 == null) {
            C0574f0 c0574f0 = this.f9248i1;
            boolean zEquals = c0574f0.equals(C0574f0.f2070d);
            C1133i c1133i = this.f9224K0;
            if (!zEquals && !c0574f0.equals(this.f9249j1)) {
                this.f9249j1 = c0574f0;
                c1133i.m3013c(c0574f0);
            }
            C2156q c2156q = this.f9227N0;
            boolean z3 = c2156q.f9312d != 3;
            c2156q.f9312d = 3;
            c2156q.f9319k.getClass();
            c2156q.f9314f = AbstractC0632A.m1571L(SystemClock.elapsedRealtime());
            if (!z3 || (surface = this.f9235V0) == null) {
                return;
            }
            Handler handler = c1133i.f5252b;
            if (handler != null) {
                handler.post(new RunnableC2162w(c1133i, surface, SystemClock.elapsedRealtime()));
            }
            this.f9238Y0 = true;
        }
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: D */
    public final C1605n mo3945D(IllegalStateException illegalStateException, C1606o c1606o) {
        Surface surface = this.f9235V0;
        C2142c c2142c = new C2142c(illegalStateException, c1606o);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c2142c;
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m4723D0(C1606o c1606o) {
        if (AbstractC0632A.f2454a < 23 || this.f9251l1 || m4716v0(c1606o.f7252a)) {
            return false;
        }
        return !c1606o.f7257f || C2146g.m4730d(this.f9222I0);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m4724E0(InterfaceC1603l interfaceC1603l, int i3) {
        Trace.beginSection("skipVideoBuffer");
        interfaceC1603l.mo3376j(i3);
        Trace.endSection();
        this.f7278D0.f3509f++;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m4725F0(int i3, int i4) {
        C0829h c0829h = this.f7278D0;
        c0829h.f3511h += i3;
        int i5 = i3 + i4;
        c0829h.f3510g += i5;
        this.f9242c1 += i5;
        int i6 = this.f9243d1 + i5;
        this.f9243d1 = i6;
        c0829h.f3512i = Math.max(i6, c0829h.f3512i);
        int i7 = this.f9225L0;
        if (i7 <= 0 || this.f9242c1 < i7) {
            return;
        }
        m4720A0();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m4726G0(long j3) {
        C0829h c0829h = this.f7278D0;
        c0829h.f3514k += j3;
        c0829h.f3515l++;
        this.f9245f1 += j3;
        this.f9246g1++;
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: L */
    public final int mo3953L(C0771f c0771f) {
        return (AbstractC0632A.f2454a < 34 || !this.f9251l1 || c0771f.f3146m >= this.f3488r) ? 0 : 32;
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: M */
    public final boolean mo3954M() {
        return this.f9251l1 && AbstractC0632A.f2454a < 23;
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: N */
    public final float mo2981N(float f, C0583o[] c0583oArr) {
        float fMax = -1.0f;
        for (C0583o c0583o : c0583oArr) {
            float f3 = c0583o.f2163w;
            if (f3 != -1.0f) {
                fMax = Math.max(fMax, f3);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: O */
    public final ArrayList mo2982O(C1601j c1601j, C0583o c0583o, boolean z3) {
        List listM4718x0 = m4718x0(this.f9222I0, c1601j, c0583o, z3, this.f9251l1);
        HashMap map = AbstractC1616y.f7337a;
        ArrayList arrayList = new ArrayList(listM4718x0);
        Collections.sort(arrayList, new C1611t(new C0111d(19, c0583o)));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0140  */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0140, please report this as an issue */
    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: P */
    public final C0475c mo2983P(C1606o c1606o, C0583o c0583o, MediaCrypto mediaCrypto, float f) {
        C0573f c0573f;
        int i3;
        C0576h c0576h;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z3;
        Pair pairM3984d;
        int iM4717w0;
        String str = c1606o.f7254c;
        C0583o[] c0583oArr = this.f3486p;
        c0583oArr.getClass();
        int iMax = c0583o.f2161u;
        int iM4719y0 = m4719y0(c1606o, c0583o);
        int length = c0583oArr.length;
        float f3 = c0583o.f2163w;
        int i4 = c0583o.f2161u;
        C0573f c0573f2 = c0583o.f2129B;
        int i5 = c0583o.f2162v;
        if (length == 1) {
            if (iM4719y0 != -1 && (iM4717w0 = m4717w0(c1606o, c0583o)) != -1) {
                iM4719y0 = Math.min((int) (iM4719y0 * 1.5f), iM4717w0);
            }
            c0576h = new C0576h(iMax, i5, iM4719y0);
            c0573f = c0573f2;
            i3 = i5;
        } else {
            int iMax2 = i5;
            int i6 = 0;
            boolean z4 = false;
            for (int length2 = c0583oArr.length; i6 < length2; length2 = length2) {
                C0583o c0583o2 = c0583oArr[i6];
                C0583o[] c0583oArr2 = c0583oArr;
                if (c0573f2 != null && c0583o2.f2129B == null) {
                    C0582n c0582nM1447a = c0583o2.m1447a();
                    c0582nM1447a.f2091A = c0573f2;
                    c0583o2 = new C0583o(c0582nM1447a);
                }
                if (c1606o.m3938b(c0583o, c0583o2).f3522d != 0) {
                    int i7 = c0583o2.f2162v;
                    int i8 = c0583o2.f2161u;
                    z4 |= i8 == -1 || i7 == -1;
                    iMax = Math.max(iMax, i8);
                    iMax2 = Math.max(iMax2, i7);
                    iM4719y0 = Math.max(iM4719y0, m4719y0(c1606o, c0583o2));
                }
                i6++;
                c0583oArr = c0583oArr2;
            }
            if (z4) {
                AbstractC0646n.m1647y("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z5 = i5 > i4;
                int i9 = z5 ? i5 : i4;
                boolean z6 = z5;
                int i10 = z5 ? i4 : i5;
                float f4 = i10 / i9;
                int[] iArr = f9219s1;
                c0573f = c0573f2;
                int i11 = 0;
                while (true) {
                    if (i11 < 9) {
                        int i12 = iArr[i11];
                        int i13 = i11;
                        int i14 = (int) (i12 * f4);
                        if (i12 > i9 && i14 > i10) {
                            if (!z6) {
                                i14 = i12;
                            }
                            if (!z6) {
                                i12 = i14;
                            }
                            int i15 = i10;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = c1606o.f7255d;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point = new Point(AbstractC0632A.m1587f(i14, widthAlignment) * widthAlignment, AbstractC0632A.m1587f(i12, heightAlignment) * heightAlignment);
                            }
                            if (point != null) {
                                i3 = i5;
                                if (c1606o.m3942f(point.x, point.y, f3)) {
                                }
                            } else {
                                i3 = i5;
                            }
                            i11 = i13 + 1;
                            i5 = i3;
                            i10 = i15;
                            i9 = i9;
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            C0582n c0582nM1447a2 = c0583o.m1447a();
                            c0582nM1447a2.f2121t = iMax;
                            c0582nM1447a2.f2122u = iMax2;
                            iM4719y0 = Math.max(iM4719y0, m4717w0(c1606o, new C0583o(c0582nM1447a2)));
                            AbstractC0646n.m1647y("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    i3 = i5;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        C0582n c0582nM1447a3 = c0583o.m1447a();
                        c0582nM1447a3.f2121t = iMax;
                        c0582nM1447a3.f2122u = iMax2;
                        iM4719y0 = Math.max(iM4719y0, m4717w0(c1606o, new C0583o(c0582nM1447a3)));
                        AbstractC0646n.m1647y("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                c0573f = c0573f2;
                i3 = i5;
            }
            c0576h = new C0576h(iMax, iMax2, iM4719y0);
        }
        this.f9229P0 = c0576h;
        int i16 = this.f9251l1 ? this.f9252m1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i4);
        mediaFormat.setInteger("height", i3);
        AbstractC0646n.m1646x(mediaFormat, c0583o.f2157q);
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        AbstractC0646n.m1642t(mediaFormat, "rotation-degrees", c0583o.f2164x);
        if (c0573f != null) {
            C0573f c0573f3 = c0573f;
            AbstractC0646n.m1642t(mediaFormat, "color-transfer", c0573f3.f2065c);
            AbstractC0646n.m1642t(mediaFormat, "color-standard", c0573f3.f2063a);
            AbstractC0646n.m1642t(mediaFormat, "color-range", c0573f3.f2064b);
            byte[] bArr = c0573f3.f2066d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c0583o.f2154n) && (pairM3984d = AbstractC1616y.m3984d(c0583o)) != null) {
            AbstractC0646n.m1642t(mediaFormat, "profile", ((Integer) pairM3984d.first).intValue());
        }
        mediaFormat.setInteger("max-width", c0576h.f2074a);
        mediaFormat.setInteger("max-height", c0576h.f2075b);
        AbstractC0646n.m1642t(mediaFormat, "max-input-size", c0576h.f2076c);
        int i17 = AbstractC0632A.f2454a;
        if (i17 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.f9226M0) {
            z3 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z3 = true;
        }
        if (i16 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z3);
            mediaFormat.setInteger("audio-session-id", i16);
        }
        if (i17 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f9250k1));
        }
        Surface surfaceM4727z0 = m4727z0(c1606o);
        if (this.f9232S0 != null && !AbstractC0632A.m1568I(this.f9222I0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new C0475c(c1606o, mediaFormat, c0583o, surfaceM4727z0, mediaCrypto, null);
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: Q */
    public final void mo2984Q(C0771f c0771f) {
        if (this.f9231R0) {
            ByteBuffer byteBuffer = c0771f.f3147n;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b3 = byteBuffer.get();
                short s3 = byteBuffer.getShort();
                short s4 = byteBuffer.getShort();
                byte b4 = byteBuffer.get();
                byte b5 = byteBuffer.get();
                byteBuffer.position(0);
                if (b3 == -75 && s3 == 60 && s4 == 1 && b4 == 4) {
                    if (b5 == 0 || b5 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        InterfaceC1603l interfaceC1603l = this.f7294Q;
                        interfaceC1603l.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC1603l.mo3369c(bundle);
                    }
                }
            }
        }
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: V */
    public final void mo2985V(Exception exc) {
        AbstractC0646n.m1636n("MediaCodecVideoRenderer", "Video codec error", exc);
        C1133i c1133i = this.f9224K0;
        Handler handler = c1133i.f5252b;
        if (handler != null) {
            handler.post(new RunnableC2161v(c1133i, exc, 3));
        }
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: W */
    public final void mo2986W(long j3, long j4, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C1133i c1133i = this.f9224K0;
        Handler handler = c1133i.f5252b;
        if (handler != null) {
            str2 = str;
            handler.post(new RunnableC2161v(c1133i, str2, j3, j4));
        } else {
            str2 = str;
        }
        this.f9230Q0 = m4716v0(str2);
        C1606o c1606o = this.f7301X;
        c1606o.getClass();
        boolean z3 = false;
        if (AbstractC0632A.f2454a >= 29 && "video/x-vnd.on2.vp9".equals(c1606o.f7253b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c1606o.f7255d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f9231R0 = z3;
        m4721B0();
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: X */
    public final void mo2987X(String str) {
        C1133i c1133i = this.f9224K0;
        Handler handler = c1133i.f5252b;
        if (handler != null) {
            handler.post(new RunnableC2161v(c1133i, str, 6));
        }
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: Y */
    public final C0831i mo2988Y(C0106b c0106b) {
        C0831i c0831iMo2988Y = super.mo2988Y(c0106b);
        C0583o c0583o = (C0583o) c0106b.f141i;
        c0583o.getClass();
        C1133i c1133i = this.f9224K0;
        Handler handler = c1133i.f5252b;
        if (handler != null) {
            handler.post(new RunnableC2161v(c1133i, c0583o, c0831iMo2988Y));
        }
        return c0831iMo2988Y;
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: Z */
    public final void mo2989Z(C0583o c0583o, MediaFormat mediaFormat) {
        int integer;
        int i3;
        InterfaceC1603l interfaceC1603l = this.f7294Q;
        if (interfaceC1603l != null) {
            interfaceC1603l.mo3381o(this.f9239Z0);
        }
        if (this.f9251l1) {
            i3 = c0583o.f2161u;
            integer = c0583o.f2162v;
        } else {
            mediaFormat.getClass();
            boolean z3 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z3 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z3 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i3 = integer2;
        }
        float f = c0583o.f2165y;
        int i4 = c0583o.f2164x;
        if (i4 == 90 || i4 == 270) {
            f = 1.0f / f;
            int i5 = integer;
            integer = i3;
            i3 = i5;
        }
        this.f9248i1 = new C0574f0(f, i3, integer);
        C2149j c2149j = this.f9232S0;
        if (c2149j == null || !this.f9257r1) {
            this.f9227N0.m4750g(c0583o.f2163w);
        } else {
            C0582n c0582nM1447a = c0583o.m1447a();
            c0582nM1447a.f2121t = i3;
            c0582nM1447a.f2122u = integer;
            c0582nM1447a.f2125x = f;
            C0583o c0583o2 = new C0583o(c0582nM1447a);
            AbstractC0646n.m1630h(false);
            c2149j.f9290n.f9294b.m4750g(c0583o2.f2163w);
            c2149j.f9279c = c0583o2;
            if (c2149j.f9285i) {
                AbstractC0646n.m1630h(c2149j.f9284h != -9223372036854775807L);
                c2149j.f9286j = true;
                c2149j.f9287k = c2149j.f9284h;
            } else {
                c2149j.m4735e();
                c2149j.f9285i = true;
                c2149j.f9286j = false;
                c2149j.f9287k = -9223372036854775807L;
            }
        }
        this.f9257r1 = false;
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: b0 */
    public final void mo3959b0(long j3) {
        super.mo3959b0(j3);
        if (this.f9251l1) {
            return;
        }
        this.f9244e1--;
    }

    @Override // p077a0.AbstractC0827g, p077a0.InterfaceC0822d0
    /* JADX INFO: renamed from: c */
    public final void mo1903c(int i3, Object obj) {
        Handler handler;
        C2156q c2156q = this.f9227N0;
        if (i3 == 1) {
            Surface surface = obj instanceof Surface ? (Surface) obj : null;
            Surface surface2 = this.f9235V0;
            C1133i c1133i = this.f9224K0;
            if (surface2 == surface) {
                if (surface != null) {
                    C0574f0 c0574f0 = this.f9249j1;
                    if (c0574f0 != null) {
                        c1133i.m3013c(c0574f0);
                    }
                    Surface surface3 = this.f9235V0;
                    if (surface3 == null || !this.f9238Y0 || (handler = c1133i.f5252b) == null) {
                        return;
                    }
                    handler.post(new RunnableC2162w(c1133i, surface3, SystemClock.elapsedRealtime()));
                    return;
                }
                return;
            }
            this.f9235V0 = surface;
            if (this.f9232S0 == null) {
                C2159t c2159t = c2156q.f9310b;
                if (c2159t.f9331e != surface) {
                    c2159t.m4753b();
                    c2159t.f9331e = surface;
                    c2159t.m4755d(true);
                }
                c2156q.m4747d(1);
            }
            this.f9238Y0 = false;
            int i4 = this.f3484n;
            InterfaceC1603l interfaceC1603l = this.f7294Q;
            if (interfaceC1603l != null && this.f9232S0 == null) {
                C1606o c1606o = this.f7301X;
                c1606o.getClass();
                Surface surface4 = this.f9235V0;
                boolean z3 = (surface4 != null && surface4.isValid()) || (AbstractC0632A.f2454a >= 35 && c1606o.f7259h) || m4723D0(c1606o);
                int i5 = AbstractC0632A.f2454a;
                if (i5 < 23 || !z3 || this.f9230Q0) {
                    m3964i0();
                    m3957T();
                } else {
                    Surface surfaceM4727z0 = m4727z0(c1606o);
                    if (i5 >= 23 && surfaceM4727z0 != null) {
                        interfaceC1603l.mo3374h(surfaceM4727z0);
                    } else {
                        if (i5 < 35) {
                            throw new IllegalStateException();
                        }
                        interfaceC1603l.mo3372f();
                    }
                }
            }
            if (surface != null) {
                C0574f0 c0574f1 = this.f9249j1;
                if (c0574f1 != null) {
                    c1133i.m3013c(c0574f1);
                }
                if (i4 == 2) {
                    C2149j c2149j = this.f9232S0;
                    if (c2149j != null) {
                        c2149j.m4734d(true);
                    } else {
                        c2156q.m4746c(true);
                    }
                }
            } else {
                this.f9249j1 = null;
                C2149j c2149j2 = this.f9232S0;
                if (c2149j2 != null) {
                    C2152m c2152m = c2149j2.f9290n;
                    c2152m.getClass();
                    int i6 = C0652t.f2523c.f2524a;
                    c2152m.f9304l = null;
                }
            }
            m4721B0();
            return;
        }
        if (i3 == 7) {
            obj.getClass();
            InterfaceC2154o interfaceC2154o = (InterfaceC2154o) obj;
            this.f9254o1 = interfaceC2154o;
            C2149j c2149j3 = this.f9232S0;
            if (c2149j3 != null) {
                c2149j3.f9290n.f9302j = interfaceC2154o;
                return;
            }
            return;
        }
        if (i3 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f9252m1 != iIntValue) {
                this.f9252m1 = iIntValue;
                if (this.f9251l1) {
                    m3964i0();
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == 16) {
            obj.getClass();
            this.f9250k1 = ((Integer) obj).intValue();
            InterfaceC1603l interfaceC1603l2 = this.f7294Q;
            if (interfaceC1603l2 != null && AbstractC0632A.f2454a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f9250k1));
                interfaceC1603l2.mo3369c(bundle);
                return;
            }
            return;
        }
        if (i3 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f9239Z0 = iIntValue2;
            InterfaceC1603l interfaceC1603l3 = this.f7294Q;
            if (interfaceC1603l3 != null) {
                interfaceC1603l3.mo3381o(iIntValue2);
                return;
            }
            return;
        }
        if (i3 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f9240a1 = iIntValue3;
            C2149j c2149j4 = this.f9232S0;
            if (c2149j4 != null) {
                c2149j4.m4737g(iIntValue3);
                return;
            }
            C2159t c2159t2 = c2156q.f9310b;
            if (c2159t2.f9336j == iIntValue3) {
                return;
            }
            c2159t2.f9336j = iIntValue3;
            c2159t2.m4755d(true);
            return;
        }
        if (i3 == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f9234U0 = list;
            C2149j c2149j5 = this.f9232S0;
            if (c2149j5 != null) {
                c2149j5.m4741k(list);
                return;
            }
            return;
        }
        if (i3 != 14) {
            if (i3 == 11) {
                this.f7289L = (C0793D) obj;
                return;
            }
            return;
        }
        obj.getClass();
        C0652t c0652t = (C0652t) obj;
        if (c0652t.f2524a == 0 || c0652t.f2525b == 0) {
            return;
        }
        this.f9237X0 = c0652t;
        C2149j c2149j6 = this.f9232S0;
        if (c2149j6 != null) {
            Surface surface5 = this.f9235V0;
            AbstractC0646n.m1631i(surface5);
            c2149j6.m4738h(surface5, c0652t);
        }
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: c0 */
    public final void mo2991c0() {
        C2149j c2149j = this.f9232S0;
        if (c2149j != null) {
            C1608q c1608q = this.f7280E0;
            c2149j.m4740j(c1608q.f7267b, c1608q.f7268c, -this.f9255p1, this.f3488r);
        } else {
            this.f9227N0.m4747d(2);
        }
        this.f9257r1 = true;
        m4721B0();
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: d0 */
    public final void mo3960d0(C0771f c0771f) {
        Surface surface;
        boolean z3 = this.f9251l1;
        if (!z3) {
            this.f9244e1++;
        }
        if (AbstractC0632A.f2454a >= 23 || !z3) {
            return;
        }
        long j3 = c0771f.f3146m;
        m3973u0(j3);
        C0574f0 c0574f0 = this.f9248i1;
        boolean zEquals = c0574f0.equals(C0574f0.f2070d);
        C1133i c1133i = this.f9224K0;
        if (!zEquals && !c0574f0.equals(this.f9249j1)) {
            this.f9249j1 = c0574f0;
            c1133i.m3013c(c0574f0);
        }
        this.f7278D0.f3508e++;
        C2156q c2156q = this.f9227N0;
        boolean z4 = c2156q.f9312d != 3;
        c2156q.f9312d = 3;
        c2156q.f9319k.getClass();
        c2156q.f9314f = AbstractC0632A.m1571L(SystemClock.elapsedRealtime());
        if (z4 && (surface = this.f9235V0) != null) {
            Handler handler = c1133i.f5252b;
            if (handler != null) {
                handler.post(new RunnableC2162w(c1133i, surface, SystemClock.elapsedRealtime()));
            }
            this.f9238Y0 = true;
        }
        mo3959b0(j3);
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: e0 */
    public final void mo3961e0(C0583o c0583o) throws C0839o {
        C2149j c2149j = this.f9232S0;
        if (c2149j == null) {
            return;
        }
        try {
            c2149j.m4733c(c0583o);
            throw null;
        } catch (C2164y e3) {
            throw m2079e(e3, c0583o, false, 7000);
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: g */
    public final void mo2080g() {
        C2149j c2149j = this.f9232S0;
        if (c2149j != null) {
            C2156q c2156q = (C2156q) c2149j.f9290n.f9298f.f5961h;
            if (c2156q.f9312d == 0) {
                c2156q.f9312d = 1;
                return;
            }
            return;
        }
        C2156q c2156q2 = this.f9227N0;
        if (c2156q2.f9312d == 0) {
            c2156q2.f9312d = 1;
        }
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: g0 */
    public final boolean mo2992g0(long j3, long j4, InterfaceC1603l interfaceC1603l, ByteBuffer byteBuffer, int i3, int i4, int i5, long j5, boolean z3, boolean z4, C0583o c0583o) throws C0839o {
        boolean z5;
        interfaceC1603l.getClass();
        C1608q c1608q = this.f7280E0;
        long j6 = j5 - c1608q.f7268c;
        C2149j c2149j = this.f9232S0;
        if (c2149j == null) {
            int iM4744a = this.f9227N0.m4744a(j5, j3, j4, c1608q.f7267b, z4, this.f9228O0);
            if (iM4744a != 4) {
                if (z3 && !z4) {
                    m4724E0(interfaceC1603l, i3);
                    return true;
                }
                Surface surface = this.f9235V0;
                C2155p c2155p = this.f9228O0;
                if (surface == null) {
                    if (c2155p.f9307a < 30000) {
                        m4724E0(interfaceC1603l, i3);
                        m4726G0(c2155p.f9307a);
                        return true;
                    }
                } else {
                    if (iM4744a == 0) {
                        this.f3483m.getClass();
                        long jNanoTime = System.nanoTime();
                        InterfaceC2154o interfaceC2154o = this.f9254o1;
                        if (interfaceC2154o != null) {
                            interfaceC2154o.mo1904d(j6, jNanoTime, c0583o, this.f7296S);
                        }
                        m4722C0(interfaceC1603l, i3, jNanoTime);
                        m4726G0(c2155p.f9307a);
                        return true;
                    }
                    if (iM4744a == 1) {
                        long j7 = c2155p.f9308b;
                        long j8 = c2155p.f9307a;
                        if (j7 == this.f9247h1) {
                            m4724E0(interfaceC1603l, i3);
                        } else {
                            InterfaceC2154o interfaceC2154o2 = this.f9254o1;
                            if (interfaceC2154o2 != null) {
                                interfaceC2154o2.mo1904d(j6, j7, c0583o, this.f7296S);
                            }
                            m4722C0(interfaceC1603l, i3, j7);
                        }
                        m4726G0(j8);
                        this.f9247h1 = j7;
                        return true;
                    }
                    if (iM4744a == 2) {
                        Trace.beginSection("dropVideoBuffer");
                        interfaceC1603l.mo3376j(i3);
                        Trace.endSection();
                        m4725F0(0, 1);
                        m4726G0(c2155p.f9307a);
                        return true;
                    }
                    if (iM4744a == 3) {
                        m4724E0(interfaceC1603l, i3);
                        m4726G0(c2155p.f9307a);
                        return true;
                    }
                    if (iM4744a != 5) {
                        throw new IllegalStateException(String.valueOf(iM4744a));
                    }
                }
            }
            return false;
        }
        try {
            z5 = false;
            try {
                return c2149j.m4732b(j5 + (-this.f9255p1), z4, j3, j4, new C0380q(this, interfaceC1603l, i3, j6));
            } catch (C2164y e3) {
                e = e3;
                throw m2079e(e, e.f9360g, z5, 7001);
            }
        } catch (C2164y e4) {
            e = e4;
            z5 = false;
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: i */
    public final String mo2082i() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: k */
    public final boolean mo2084k() {
        return this.f7332z0 && this.f9232S0 == null;
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: k0 */
    public final void mo3965k0() {
        super.mo3965k0();
        this.f9244e1 = 0;
    }

    @Override // p103h0.AbstractC1609r, p077a0.AbstractC0827g
    /* JADX INFO: renamed from: l */
    public final boolean mo2085l() {
        boolean zMo2085l = super.mo2085l();
        C2149j c2149j = this.f9232S0;
        if (c2149j != null) {
            return ((C2156q) c2149j.f9290n.f9298f.f5961h).m4745b(false);
        }
        if (zMo2085l && (this.f7294Q == null || this.f9235V0 == null || this.f9251l1)) {
            return true;
        }
        return this.f9227N0.m4745b(zMo2085l);
    }

    @Override // p103h0.AbstractC1609r, p077a0.AbstractC0827g
    /* JADX INFO: renamed from: m */
    public final void mo2086m() {
        C1133i c1133i = this.f9224K0;
        this.f9249j1 = null;
        this.f9256q1 = -9223372036854775807L;
        C2149j c2149j = this.f9232S0;
        if (c2149j != null) {
            ((C2156q) c2149j.f9290n.f9298f.f5961h).m4747d(0);
        } else {
            this.f9227N0.m4747d(0);
        }
        m4721B0();
        this.f9238Y0 = false;
        this.f9253n1 = null;
        try {
            super.mo2086m();
            C0829h c0829h = this.f7278D0;
            c1133i.getClass();
            synchronized (c0829h) {
            }
            Handler handler = c1133i.f5252b;
            if (handler != null) {
                handler.post(new RunnableC0647o(c1133i, 15, c0829h));
            }
        } finally {
            c1133i.m3012a(this.f7278D0);
            c1133i.m3013c(C0574f0.f2070d);
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: n */
    public final void mo2087n(boolean z3, boolean z4) {
        this.f7278D0 = new C0829h();
        C0830h0 c0830h0 = this.f3480j;
        c0830h0.getClass();
        boolean z5 = c0830h0.f3518b;
        AbstractC0646n.m1630h((z5 && this.f9252m1 == 0) ? false : true);
        if (this.f9251l1 != z5) {
            this.f9251l1 = z5;
            m3964i0();
        }
        C0829h c0829h = this.f7278D0;
        C1133i c1133i = this.f9224K0;
        Handler handler = c1133i.f5252b;
        if (handler != null) {
            handler.post(new RunnableC2161v(c1133i, c0829h, 4));
        }
        boolean z6 = this.f9233T0;
        C2156q c2156q = this.f9227N0;
        if (!z6) {
            if (this.f9234U0 != null && this.f9232S0 == null) {
                C2147h c2147h = new C2147h(this.f9222I0, c2156q);
                C0653u c0653u = this.f3483m;
                c0653u.getClass();
                c2147h.f9273f = c0653u;
                AbstractC0646n.m1630h(!c2147h.f9274g);
                if (c2147h.f9271d == null) {
                    if (c2147h.f9270c == null) {
                        c2147h.f9270c = new C2150k();
                    }
                    c2147h.f9271d = new C2151l(c2147h.f9270c);
                }
                C2152m c2152m = new C2152m(c2147h);
                c2147h.f9274g = true;
                this.f9232S0 = c2152m.f9293a;
            }
            this.f9233T0 = true;
        }
        C2149j c2149j = this.f9232S0;
        if (c2149j == null) {
            C0653u c0653u2 = this.f3483m;
            c0653u2.getClass();
            c2156q.f9319k = c0653u2;
            c2156q.f9312d = z4 ? 1 : 0;
            return;
        }
        C1447t c1447t = new C1447t(20, this);
        EnumC1991a enumC1991a = EnumC1991a.f8697g;
        c2149j.f9288l = c1447t;
        c2149j.f9289m = enumC1991a;
        InterfaceC2154o interfaceC2154o = this.f9254o1;
        if (interfaceC2154o != null) {
            c2149j.f9290n.f9302j = interfaceC2154o;
        }
        if (this.f9235V0 != null && !this.f9237X0.equals(C0652t.f2523c)) {
            this.f9232S0.m4738h(this.f9235V0, this.f9237X0);
        }
        this.f9232S0.m4737g(this.f9240a1);
        this.f9232S0.m4739i(this.f7292O);
        List list = this.f9234U0;
        if (list != null) {
            this.f9232S0.m4741k(list);
        }
        ((C2156q) this.f9232S0.f9290n.f9298f.f5961h).f9312d = z4 ? 1 : 0;
    }

    @Override // p103h0.AbstractC1609r, p077a0.AbstractC0827g
    /* JADX INFO: renamed from: o */
    public final void mo2088o(long j3, boolean z3) {
        C2149j c2149j = this.f9232S0;
        if (c2149j != null) {
            c2149j.m4731a(true);
            C2149j c2149j2 = this.f9232S0;
            C1608q c1608q = this.f7280E0;
            c2149j2.m4740j(c1608q.f7267b, c1608q.f7268c, -this.f9255p1, this.f3488r);
            this.f9257r1 = true;
        }
        super.mo2088o(j3, z3);
        C2149j c2149j3 = this.f9232S0;
        C2156q c2156q = this.f9227N0;
        if (c2149j3 == null) {
            C2159t c2159t = c2156q.f9310b;
            c2159t.f9339m = 0L;
            c2159t.f9342p = -1L;
            c2159t.f9340n = -1L;
            c2156q.f9315g = -9223372036854775807L;
            c2156q.f9313e = -9223372036854775807L;
            c2156q.m4747d(1);
            c2156q.f9316h = -9223372036854775807L;
        }
        if (z3) {
            C2149j c2149j4 = this.f9232S0;
            if (c2149j4 != null) {
                c2149j4.m4734d(false);
            } else {
                c2156q.m4746c(false);
            }
        }
        m4721B0();
        this.f9243d1 = 0;
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: o0 */
    public final boolean mo3969o0(C1606o c1606o) {
        Surface surface = this.f9235V0;
        if (surface == null || !surface.isValid()) {
            return (AbstractC0632A.f2454a >= 35 && c1606o.f7259h) || m4723D0(c1606o);
        }
        return true;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: p */
    public final void mo2089p() {
        C2149j c2149j = this.f9232S0;
        if (c2149j == null || !this.f9223J0) {
            return;
        }
        C2152m c2152m = c2149j.f9290n;
        if (c2152m.f9306n == 2) {
            return;
        }
        C0655w c0655w = c2152m.f9303k;
        if (c0655w != null) {
            c0655w.f2529a.removeCallbacksAndMessages(null);
        }
        c2152m.f9304l = null;
        c2152m.f9306n = 2;
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: p0 */
    public final boolean mo3970p0(C0771f c0771f) {
        if (c0771f.m1787c(67108864) && !m2083j() && !c0771f.m1787c(536870912)) {
            long j3 = this.f9256q1;
            if (j3 != -9223372036854775807L && j3 - (c0771f.f3146m - this.f7280E0.f7268c) > 100000 && !c0771f.m1787c(1073741824) && c0771f.f3146m < this.f3488r) {
                return true;
            }
        }
        return false;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: q */
    public final void mo2090q() {
        try {
            try {
                m3946E();
                m3964i0();
                InterfaceC1384h interfaceC1384h = this.f7288K;
                if (interfaceC1384h != null) {
                    interfaceC1384h.mo3463d(null);
                }
                this.f7288K = null;
                this.f9233T0 = false;
                this.f9255p1 = -9223372036854775807L;
                C2146g c2146g = this.f9236W0;
                if (c2146g != null) {
                    c2146g.release();
                    this.f9236W0 = null;
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
            this.f9233T0 = false;
            this.f9255p1 = -9223372036854775807L;
            C2146g c2146g2 = this.f9236W0;
            if (c2146g2 != null) {
                c2146g2.release();
                this.f9236W0 = null;
            }
            throw th2;
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: r */
    public final void mo2091r() {
        this.f9242c1 = 0;
        this.f3483m.getClass();
        this.f9241b1 = SystemClock.elapsedRealtime();
        this.f9245f1 = 0L;
        this.f9246g1 = 0;
        C2149j c2149j = this.f9232S0;
        if (c2149j != null) {
            ((C2156q) c2149j.f9290n.f9298f.f5961h).m4748e();
        } else {
            this.f9227N0.m4748e();
        }
    }

    @Override // p103h0.AbstractC1609r
    /* JADX INFO: renamed from: r0 */
    public final int mo2995r0(C1601j c1601j, C0583o c0583o) {
        boolean z3;
        int i3 = 0;
        if (!AbstractC0545H.m1363k(c0583o.f2154n)) {
            return AbstractC0462h.m1162b(0, 0, 0, 0);
        }
        boolean z4 = c0583o.f2158r != null;
        Context context = this.f9222I0;
        List listM4718x0 = m4718x0(context, c1601j, c0583o, z4, false);
        if (z4 && listM4718x0.isEmpty()) {
            listM4718x0 = m4718x0(context, c1601j, c0583o, false, false);
        }
        if (listM4718x0.isEmpty()) {
            return AbstractC0462h.m1162b(1, 0, 0, 0);
        }
        int i4 = c0583o.f2139L;
        if (i4 != 0 && i4 != 2) {
            return AbstractC0462h.m1162b(2, 0, 0, 0);
        }
        C1606o c1606o = (C1606o) listM4718x0.get(0);
        boolean zM3940d = c1606o.m3940d(c0583o);
        if (!zM3940d) {
            int i5 = 1;
            while (true) {
                if (i5 >= listM4718x0.size()) {
                    z3 = true;
                    break;
                }
                C1606o c1606o2 = (C1606o) listM4718x0.get(i5);
                if (c1606o2.m3940d(c0583o)) {
                    c1606o = c1606o2;
                    z3 = false;
                    zM3940d = true;
                    break;
                }
                i5++;
            }
        } else {
            z3 = true;
            break;
        }
        int i6 = zM3940d ? 4 : 3;
        int i7 = c1606o.m3941e(c0583o) ? 16 : 8;
        int i8 = c1606o.f7258g ? 64 : 0;
        int i9 = z3 ? 128 : 0;
        if (AbstractC0632A.f2454a >= 26 && "video/dolby-vision".equals(c0583o.f2154n) && !AbstractC2003a.m4537j(context)) {
            i9 = 256;
        }
        if (zM3940d) {
            List listM4718x1 = m4718x0(context, c1601j, c0583o, z4, true);
            if (!listM4718x1.isEmpty()) {
                HashMap map = AbstractC1616y.f7337a;
                ArrayList arrayList = new ArrayList(listM4718x1);
                Collections.sort(arrayList, new C1611t(new C0111d(19, c0583o)));
                C1606o c1606o3 = (C1606o) arrayList.get(0);
                if (c1606o3.m3940d(c0583o) && c1606o3.m3941e(c0583o)) {
                    i3 = 32;
                }
            }
        }
        return i6 | i7 | i3 | i8 | i9;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: s */
    public final void mo2092s() {
        m4720A0();
        int i3 = this.f9246g1;
        if (i3 != 0) {
            long j3 = this.f9245f1;
            C1133i c1133i = this.f9224K0;
            Handler handler = c1133i.f5252b;
            if (handler != null) {
                handler.post(new RunnableC2161v(c1133i, j3, i3));
            }
            this.f9245f1 = 0L;
            this.f9246g1 = 0;
        }
        C2149j c2149j = this.f9232S0;
        if (c2149j != null) {
            ((C2156q) c2149j.f9290n.f9298f.f5961h).m4749f();
        } else {
            this.f9227N0.m4749f();
        }
    }

    @Override // p103h0.AbstractC1609r, p077a0.AbstractC0827g
    /* JADX INFO: renamed from: t */
    public final void mo2093t(C0583o[] c0583oArr, long j3, long j4, C1907A c1907a) {
        super.mo2093t(c0583oArr, j3, j4, c1907a);
        if (this.f9255p1 == -9223372036854775807L) {
            this.f9255p1 = j3;
        }
        AbstractC0558V abstractC0558V = this.f3492v;
        if (abstractC0558V.m1415p()) {
            this.f9256q1 = -9223372036854775807L;
            return;
        }
        c1907a.getClass();
        this.f9256q1 = abstractC0558V.mo1410g(c1907a.f8311a, new C0556T()).f1969d;
    }

    @Override // p103h0.AbstractC1609r, p077a0.AbstractC0827g
    /* JADX INFO: renamed from: v */
    public final void mo2095v(long j3, long j4) throws C0839o {
        super.mo2095v(j3, j4);
        C2149j c2149j = this.f9232S0;
        if (c2149j != null) {
            try {
                c2149j.m4736f(j3, j4);
            } catch (C2164y e3) {
                throw m2079e(e3, e3.f9360g, false, 7001);
            }
        }
    }

    @Override // p103h0.AbstractC1609r, p077a0.AbstractC0827g
    /* JADX INFO: renamed from: y */
    public final void mo2098y(float f, float f3) {
        super.mo2098y(f, f3);
        C2149j c2149j = this.f9232S0;
        if (c2149j != null) {
            c2149j.m4739i(f);
        } else {
            this.f9227N0.m4751h(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: z0 */
    public final Surface m4727z0(C1606o c1606o) {
        boolean z3;
        HandlerThreadC2145f handlerThreadC2145f;
        int i3;
        RuntimeException runtimeException;
        Error error;
        boolean z4 = false;
        if (this.f9232S0 != null) {
            AbstractC0646n.m1630h(false);
            AbstractC0646n.m1631i(null);
            throw null;
        }
        Surface surface = this.f9235V0;
        if (surface != null) {
            return surface;
        }
        if (AbstractC0632A.f2454a >= 35 && c1606o.f7259h) {
            return null;
        }
        AbstractC0646n.m1630h(m4723D0(c1606o));
        C2146g c2146g = this.f9236W0;
        if (c2146g != null && c2146g.f9265g != c1606o.f7257f && c2146g != null) {
            c2146g.release();
            this.f9236W0 = null;
        }
        if (this.f9236W0 == null) {
            Context context = this.f9222I0;
            boolean z5 = c1606o.f7257f;
            if (z5) {
                if (!C2146g.m4730d(context)) {
                    z3 = false;
                }
                AbstractC0646n.m1630h(z3);
                handlerThreadC2145f = new HandlerThreadC2145f("ExoPlayer:PlaceholderSurface");
                if (z5) {
                    i3 = C2146g.f9263j;
                } else {
                    i3 = 0;
                }
                handlerThreadC2145f.start();
                Handler handler = new Handler(handlerThreadC2145f.getLooper(), handlerThreadC2145f);
                handlerThreadC2145f.f9259h = handler;
                handlerThreadC2145f.f9258g = new RunnableC0638f(handler);
                synchronized (handlerThreadC2145f) {
                    handlerThreadC2145f.f9259h.obtainMessage(1, i3, 0).sendToTarget();
                    while (handlerThreadC2145f.f9262k == null && handlerThreadC2145f.f9261j == null && handlerThreadC2145f.f9260i == null) {
                        try {
                            handlerThreadC2145f.wait();
                        } catch (InterruptedException unused) {
                            z4 = true;
                        }
                    }
                }
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = handlerThreadC2145f.f9261j;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = handlerThreadC2145f.f9260i;
                if (error == null) {
                    throw error;
                }
                C2146g c2146g2 = handlerThreadC2145f.f9262k;
                c2146g2.getClass();
                this.f9236W0 = c2146g2;
            } else {
                int i4 = C2146g.f9263j;
            }
            z3 = true;
            AbstractC0646n.m1630h(z3);
            handlerThreadC2145f = new HandlerThreadC2145f("ExoPlayer:PlaceholderSurface");
            if (z5) {
                i3 = C2146g.f9263j;
            } else {
                i3 = 0;
            }
            handlerThreadC2145f.start();
            Handler handler2 = new Handler(handlerThreadC2145f.getLooper(), handlerThreadC2145f);
            handlerThreadC2145f.f9259h = handler2;
            handlerThreadC2145f.f9258g = new RunnableC0638f(handler2);
            synchronized (handlerThreadC2145f) {
                handlerThreadC2145f.f9259h.obtainMessage(1, i3, 0).sendToTarget();
                while (handlerThreadC2145f.f9262k == null) {
                    handlerThreadC2145f.wait();
                }
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = handlerThreadC2145f.f9261j;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = handlerThreadC2145f.f9260i;
                if (error == null) {
                    throw error;
                }
                C2146g c2146g3 = handlerThreadC2145f.f9262k;
                c2146g3.getClass();
                this.f9236W0 = c2146g3;
            }
        }
        return this.f9236W0;
    }
}
