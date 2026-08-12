package p085c0;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import p055T.C0567c;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: c0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1119A {

    /* JADX INFO: renamed from: a */
    public static final C1119A f5177a = new C1119A();

    /* JADX INFO: renamed from: b */
    public static final C1119A f5178b = new C1119A();

    /* JADX INFO: renamed from: b */
    public static AudioAttributes m2977b(C0567c c0567c, boolean z3) {
        return z3 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) c0567c.m1433a().f38h;
    }

    /* JADX INFO: renamed from: c */
    public static int m2978c(int i3) {
        if (i3 == 20) {
            return 63750;
        }
        if (i3 == 30) {
            return 2250000;
        }
        switch (i3) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i3) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    /* JADX INFO: renamed from: a */
    public AudioTrack m2979a(C1134j c1134j, C0567c c0567c, int i3) {
        int i4 = AbstractC0632A.f2454a;
        boolean z3 = c1134j.f5254a;
        int i5 = c1134j.f5255b;
        int i6 = c1134j.f5258e;
        int i7 = c1134j.f5256c;
        if (i4 < 23) {
            return new AudioTrack(m2977b(c0567c, z3), AbstractC0632A.m1597p(i7, i6, i5), c1134j.f5259f, 1, i3);
        }
        AudioTrack.Builder sessionId = AbstractC1143s.m3023d().setAudioAttributes(m2977b(c0567c, z3)).setAudioFormat(AbstractC0632A.m1597p(i7, i6, i5)).setTransferMode(1).setBufferSizeInBytes(c1134j.f5259f).setSessionId(i3);
        if (i4 >= 29) {
            sessionId.setOffloadedPlayback(c1134j.f5257d);
        }
        return sessionId.build();
    }
}
