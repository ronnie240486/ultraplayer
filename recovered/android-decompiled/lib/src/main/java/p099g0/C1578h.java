package p099g0;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageOutput;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import p009D0.C0106b;
import p045P0.AbstractC0462h;
import p055T.C0583o;
import p064W.AbstractC0646n;
import p073Z.C0771f;
import p077a0.AbstractC0827g;
import p077a0.C0839o;
import p082b0.C1063d;
import p089d1.C1447t;
import p114k0.C1907A;

/* JADX INFO: renamed from: g0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1578h extends AbstractC0827g {

    /* JADX INFO: renamed from: A */
    public boolean f7165A;

    /* JADX INFO: renamed from: B */
    public boolean f7166B;

    /* JADX INFO: renamed from: C */
    public C1576f f7167C;

    /* JADX INFO: renamed from: D */
    public long f7168D;

    /* JADX INFO: renamed from: E */
    public long f7169E;

    /* JADX INFO: renamed from: F */
    public int f7170F;

    /* JADX INFO: renamed from: G */
    public int f7171G;

    /* JADX INFO: renamed from: H */
    public C0583o f7172H;

    /* JADX INFO: renamed from: I */
    public C1572b f7173I;

    /* JADX INFO: renamed from: J */
    public C0771f f7174J;

    /* JADX INFO: renamed from: K */
    public ImageOutput f7175K;

    /* JADX INFO: renamed from: L */
    public Bitmap f7176L;

    /* JADX INFO: renamed from: M */
    public boolean f7177M;

    /* JADX INFO: renamed from: N */
    public C1577g f7178N;

    /* JADX INFO: renamed from: O */
    public C1577g f7179O;

    /* JADX INFO: renamed from: P */
    public int f7180P;

    /* JADX INFO: renamed from: x */
    public final C1447t f7181x;

    /* JADX INFO: renamed from: y */
    public final C0771f f7182y;

    /* JADX INFO: renamed from: z */
    public final ArrayDeque f7183z;

    public C1578h(C1447t c1447t) {
        super(4);
        this.f7181x = c1447t;
        this.f7175K = ImageOutput.f4366a;
        this.f7182y = new C0771f(0);
        this.f7167C = C1576f.f7159c;
        this.f7183z = new ArrayDeque();
        this.f7169E = -9223372036854775807L;
        this.f7168D = -9223372036854775807L;
        this.f7170F = 0;
        this.f7171G = 1;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:69:0x0108  */
    /* JADX WARN: Code duplicated, block: B:77:0x0131  */
    /* JADX WARN: Code duplicated, block: B:79:0x014b  */
    /* JADX INFO: renamed from: B */
    public final boolean m3911B(long j3) throws C0839o {
        boolean z3;
        C1577g c1577g;
        Bitmap bitmap;
        long j4;
        boolean z4;
        int i3;
        boolean z5;
        C1577g c1577g2;
        C0583o c0583o;
        C0583o c0583o2;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap2 = this.f7176L;
        if ((bitmap2 == null || this.f7178N != null) && (this.f7171G != 0 || this.f3484n == 2)) {
            ArrayDeque arrayDeque = this.f7183z;
            if (bitmap2 == null) {
                AbstractC0646n.m1631i(this.f7173I);
                C1571a c1571a = (C1571a) this.f7173I.mo1230d();
                if (c1571a != null) {
                    if (!c1571a.m1787c(4)) {
                        AbstractC0646n.m1632j(c1571a.f7141k, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.f7176L = c1571a.f7141k;
                        c1571a.mo1159f();
                        if (this.f7177M && this.f7176L != null && this.f7178N != null) {
                            AbstractC0646n.m1631i(this.f7172H);
                            C0583o c0583o3 = this.f7172H;
                            int i4 = c0583o3.f2137J;
                            int i5 = c0583o3.f2138K;
                            z3 = ((i4 != 1 && i5 == 1) || i4 == -1 || i5 == -1) ? false : true;
                            c1577g = this.f7178N;
                            if (((Bitmap) c1577g.f7164c) == null) {
                                if (z3) {
                                    AbstractC0646n.m1631i(this.f7176L);
                                    int width = this.f7176L.getWidth();
                                    C0583o c0583o4 = this.f7172H;
                                    AbstractC0646n.m1631i(c0583o4);
                                    int i6 = width / c0583o4.f2137J;
                                    int height = this.f7176L.getHeight();
                                    C0583o c0583o5 = this.f7172H;
                                    AbstractC0646n.m1631i(c0583o5);
                                    int i7 = height / c0583o5.f2138K;
                                    int i8 = this.f7172H.f2137J;
                                    int i9 = c1577g.f7162a;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.f7176L, (i9 % i8) * i6, (i9 / i8) * i7, i6, i7);
                                } else {
                                    bitmapCreateBitmap = this.f7176L;
                                    AbstractC0646n.m1631i(bitmapCreateBitmap);
                                }
                                c1577g.f7164c = bitmapCreateBitmap;
                            }
                            bitmap = (Bitmap) this.f7178N.f7164c;
                            AbstractC0646n.m1631i(bitmap);
                            j4 = this.f7178N.f7163b;
                            long j5 = j4 - j3;
                            if (this.f3484n == 2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            i3 = this.f7171G;
                            if (i3 != 0) {
                                if (i3 != 1) {
                                    z4 = true;
                                } else {
                                    if (i3 == 3) {
                                        throw new IllegalStateException();
                                    }
                                    z4 = false;
                                }
                            }
                            if (!z4 || j5 < 30000) {
                                this.f7175K.onImageAvailable(j4 - this.f7167C.f7161b, bitmap);
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                C1577g c1577g3 = this.f7178N;
                                AbstractC0646n.m1631i(c1577g3);
                                long j6 = c1577g3.f7163b;
                                this.f7168D = j6;
                                while (!arrayDeque.isEmpty() && j6 >= ((C1576f) arrayDeque.peek()).f7160a) {
                                    this.f7167C = (C1576f) arrayDeque.removeFirst();
                                }
                                this.f7171G = 3;
                                if (z3) {
                                    c1577g2 = this.f7178N;
                                    AbstractC0646n.m1631i(c1577g2);
                                    c0583o = this.f7172H;
                                    AbstractC0646n.m1631i(c0583o);
                                    c0583o2 = this.f7172H;
                                    AbstractC0646n.m1631i(c0583o2);
                                    if (c1577g2.f7162a == (c0583o.f2138K * c0583o2.f2137J) - 1) {
                                        this.f7176L = null;
                                    }
                                } else {
                                    this.f7176L = null;
                                }
                                this.f7178N = this.f7179O;
                                this.f7179O = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.f7170F == 3) {
                            m3914E();
                            AbstractC0646n.m1631i(this.f7172H);
                            m3913D();
                            return false;
                        }
                        c1571a.mo1159f();
                        if (arrayDeque.isEmpty()) {
                            this.f7166B = true;
                            return false;
                        }
                    }
                }
            } else if (this.f7177M) {
                AbstractC0646n.m1631i(this.f7172H);
                C0583o c0583o6 = this.f7172H;
                int i10 = c0583o6.f2137J;
                int i11 = c0583o6.f2138K;
                if (i10 != 1) {
                }
                c1577g = this.f7178N;
                if (((Bitmap) c1577g.f7164c) == null) {
                    if (z3) {
                        AbstractC0646n.m1631i(this.f7176L);
                        int width2 = this.f7176L.getWidth();
                        C0583o c0583o7 = this.f7172H;
                        AbstractC0646n.m1631i(c0583o7);
                        int i12 = width2 / c0583o7.f2137J;
                        int height2 = this.f7176L.getHeight();
                        C0583o c0583o8 = this.f7172H;
                        AbstractC0646n.m1631i(c0583o8);
                        int i13 = height2 / c0583o8.f2138K;
                        int i14 = this.f7172H.f2137J;
                        int i15 = c1577g.f7162a;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.f7176L, (i15 % i14) * i12, (i15 / i14) * i13, i12, i13);
                    } else {
                        bitmapCreateBitmap = this.f7176L;
                        AbstractC0646n.m1631i(bitmapCreateBitmap);
                    }
                    c1577g.f7164c = bitmapCreateBitmap;
                }
                bitmap = (Bitmap) this.f7178N.f7164c;
                AbstractC0646n.m1631i(bitmap);
                j4 = this.f7178N.f7163b;
                long j7 = j4 - j3;
                if (this.f3484n == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i3 = this.f7171G;
                if (i3 != 0) {
                    if (i3 != 1) {
                        z4 = true;
                    } else {
                        if (i3 == 3) {
                            throw new IllegalStateException();
                        }
                        z4 = false;
                    }
                }
                if (z4) {
                    this.f7175K.onImageAvailable(j4 - this.f7167C.f7161b, bitmap);
                    z5 = true;
                } else {
                    this.f7175K.onImageAvailable(j4 - this.f7167C.f7161b, bitmap);
                    z5 = true;
                }
                if (z5) {
                    C1577g c1577g4 = this.f7178N;
                    AbstractC0646n.m1631i(c1577g4);
                    long j8 = c1577g4.f7163b;
                    this.f7168D = j8;
                    while (!arrayDeque.isEmpty()) {
                        this.f7167C = (C1576f) arrayDeque.removeFirst();
                    }
                    this.f7171G = 3;
                    if (z3) {
                        c1577g2 = this.f7178N;
                        AbstractC0646n.m1631i(c1577g2);
                        c0583o = this.f7172H;
                        AbstractC0646n.m1631i(c0583o);
                        c0583o2 = this.f7172H;
                        AbstractC0646n.m1631i(c0583o2);
                        if (c1577g2.f7162a == (c0583o.f2138K * c0583o2.f2137J) - 1) {
                            this.f7176L = null;
                        }
                    } else {
                        this.f7176L = null;
                    }
                    this.f7178N = this.f7179O;
                    this.f7179O = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x0101  */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:83:0x011a  */
    /* JADX WARN: Code duplicated, block: B:85:0x011f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    /* JADX WARN: Code duplicated, block: B:88:0x0133  */
    /* JADX WARN: Code duplicated, block: B:91:0x013f  */
    /* JADX INFO: renamed from: C */
    public final boolean m3912C(long j3) {
        int iM2094u;
        ByteBuffer byteBuffer;
        C0771f c0771f;
        boolean z3;
        C0771f c0771f2;
        long j4;
        boolean z4;
        C1577g c1577g;
        boolean z5;
        C0583o c0583o;
        boolean z6;
        boolean z7;
        C0583o c0583o2;
        int i3;
        C0771f c0771f3;
        if (!this.f7177M || this.f7178N == null) {
            C0106b c0106b = this.f3479i;
            c0106b.m526n();
            C1572b c1572b = this.f7173I;
            if (c1572b != null && this.f7170F != 3 && !this.f7165A) {
                if (this.f7174J == null) {
                    C0771f c0771f4 = (C0771f) c1572b.mo1269e();
                    this.f7174J = c0771f4;
                    if (c0771f4 != null) {
                        if (this.f7170F == 2) {
                            AbstractC0646n.m1631i(this.f7174J);
                            this.f7174J.f2573h = 4;
                            C1572b c1572b2 = this.f7173I;
                            AbstractC0646n.m1631i(c1572b2);
                            c1572b2.mo1268c(this.f7174J);
                            this.f7174J = null;
                            this.f7170F = 3;
                            return false;
                        }
                        iM2094u = m2094u(c0106b, this.f7174J, 0);
                        if (iM2094u != -5) {
                            C0583o c0583o3 = (C0583o) c0106b.f141i;
                            AbstractC0646n.m1631i(c0583o3);
                            this.f7172H = c0583o3;
                            this.f7170F = 2;
                            return true;
                        }
                        if (iM2094u != -4) {
                            this.f7174J.m1886i();
                            byteBuffer = this.f7174J.f3144k;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                c0771f = this.f7174J;
                                AbstractC0646n.m1631i(c0771f);
                                if (c0771f.m1787c(4)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else {
                                z3 = true;
                            }
                            if (z3) {
                                C1572b c1572b3 = this.f7173I;
                                AbstractC0646n.m1631i(c1572b3);
                                C0771f c0771f5 = this.f7174J;
                                AbstractC0646n.m1631i(c0771f5);
                                c1572b3.mo1268c(c0771f5);
                                this.f7180P = 0;
                            }
                            c0771f2 = this.f7174J;
                            AbstractC0646n.m1631i(c0771f2);
                            if (c0771f2.m1787c(4)) {
                                this.f7177M = true;
                            } else {
                                int i4 = this.f7180P;
                                j4 = c0771f2.f3146m;
                                C1577g c1577g2 = new C1577g();
                                c1577g2.f7162a = i4;
                                c1577g2.f7163b = j4;
                                this.f7179O = c1577g2;
                                this.f7180P = i4 + 1;
                                if (this.f7177M) {
                                    this.f7178N = this.f7179O;
                                    this.f7179O = null;
                                } else {
                                    if (j4 - 30000 <= j3 || j3 > 30000 + j4) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    c1577g = this.f7178N;
                                    if (c1577g != null || c1577g.f7163b > j3 || j3 >= j4) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    c0583o = this.f7172H;
                                    AbstractC0646n.m1631i(c0583o);
                                    if (c0583o.f2137J != -1 || (i3 = (c0583o2 = this.f7172H).f2138K) == -1 || i4 == (i3 * c0583o2.f2137J) - 1) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (!z4 || z5 || z6) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    this.f7177M = z7;
                                    if (z5 || z4) {
                                        this.f7178N = this.f7179O;
                                        this.f7179O = null;
                                    }
                                }
                            }
                            c0771f3 = this.f7174J;
                            AbstractC0646n.m1631i(c0771f3);
                            if (c0771f3.m1787c(4)) {
                                this.f7165A = true;
                                this.f7174J = null;
                                return false;
                            }
                            long j5 = this.f7169E;
                            C0771f c0771f6 = this.f7174J;
                            AbstractC0646n.m1631i(c0771f6);
                            this.f7169E = Math.max(j5, c0771f6.f3146m);
                            if (z3) {
                                this.f7174J = null;
                            } else {
                                C0771f c0771f7 = this.f7174J;
                                AbstractC0646n.m1631i(c0771f7);
                                c0771f7.mo1883e();
                            }
                            return !this.f7177M;
                        }
                        if (iM2094u != -3) {
                            throw new IllegalStateException();
                        }
                    }
                } else {
                    if (this.f7170F == 2) {
                        AbstractC0646n.m1631i(this.f7174J);
                        this.f7174J.f2573h = 4;
                        C1572b c1572b4 = this.f7173I;
                        AbstractC0646n.m1631i(c1572b4);
                        c1572b4.mo1268c(this.f7174J);
                        this.f7174J = null;
                        this.f7170F = 3;
                        return false;
                    }
                    iM2094u = m2094u(c0106b, this.f7174J, 0);
                    if (iM2094u != -5) {
                        C0583o c0583o4 = (C0583o) c0106b.f141i;
                        AbstractC0646n.m1631i(c0583o4);
                        this.f7172H = c0583o4;
                        this.f7170F = 2;
                        return true;
                    }
                    if (iM2094u != -4) {
                        this.f7174J.m1886i();
                        byteBuffer = this.f7174J.f3144k;
                        if (byteBuffer != null) {
                            c0771f = this.f7174J;
                            AbstractC0646n.m1631i(c0771f);
                            if (c0771f.m1787c(4)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            c0771f = this.f7174J;
                            AbstractC0646n.m1631i(c0771f);
                            if (c0771f.m1787c(4)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                        if (z3) {
                            C1572b c1572b5 = this.f7173I;
                            AbstractC0646n.m1631i(c1572b5);
                            C0771f c0771f8 = this.f7174J;
                            AbstractC0646n.m1631i(c0771f8);
                            c1572b5.mo1268c(c0771f8);
                            this.f7180P = 0;
                        }
                        c0771f2 = this.f7174J;
                        AbstractC0646n.m1631i(c0771f2);
                        if (c0771f2.m1787c(4)) {
                            this.f7177M = true;
                        } else {
                            int i5 = this.f7180P;
                            j4 = c0771f2.f3146m;
                            C1577g c1577g3 = new C1577g();
                            c1577g3.f7162a = i5;
                            c1577g3.f7163b = j4;
                            this.f7179O = c1577g3;
                            this.f7180P = i5 + 1;
                            if (this.f7177M) {
                                this.f7178N = this.f7179O;
                                this.f7179O = null;
                            } else {
                                if (j4 - 30000 <= j3) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                c1577g = this.f7178N;
                                if (c1577g != null) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                c0583o = this.f7172H;
                                AbstractC0646n.m1631i(c0583o);
                                if (c0583o.f2137J != -1) {
                                    z6 = true;
                                } else {
                                    z6 = true;
                                }
                                if (z4) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                }
                                this.f7177M = z7;
                                if (z5) {
                                    this.f7178N = this.f7179O;
                                    this.f7179O = null;
                                } else {
                                    this.f7178N = this.f7179O;
                                    this.f7179O = null;
                                }
                            }
                        }
                        c0771f3 = this.f7174J;
                        AbstractC0646n.m1631i(c0771f3);
                        if (c0771f3.m1787c(4)) {
                            this.f7165A = true;
                            this.f7174J = null;
                            return false;
                        }
                        long j6 = this.f7169E;
                        C0771f c0771f9 = this.f7174J;
                        AbstractC0646n.m1631i(c0771f9);
                        this.f7169E = Math.max(j6, c0771f9.f3146m);
                        if (z3) {
                            this.f7174J = null;
                        } else {
                            C0771f c0771f10 = this.f7174J;
                            AbstractC0646n.m1631i(c0771f10);
                            c0771f10.mo1883e();
                        }
                        return !this.f7177M;
                    }
                    if (iM2094u != -3) {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final void m3913D() throws C0839o {
        C0583o c0583o = this.f7172H;
        C1447t c1447t = this.f7181x;
        int iM3627o = c1447t.m3627o(c0583o);
        if (iM3627o != AbstractC0462h.m1162b(4, 0, 0, 0) && iM3627o != AbstractC0462h.m1162b(3, 0, 0, 0)) {
            throw m2079e(new C1574d("Provided decoder factory can't create decoder for format."), this.f7172H, false, 4005);
        }
        C1572b c1572b = this.f7173I;
        if (c1572b != null) {
            c1572b.mo1229a();
        }
        this.f7173I = new C1572b((C1063d) c1447t.f6406h);
    }

    /* JADX INFO: renamed from: E */
    public final void m3914E() {
        this.f7174J = null;
        this.f7170F = 0;
        this.f7169E = -9223372036854775807L;
        C1572b c1572b = this.f7173I;
        if (c1572b != null) {
            c1572b.mo1229a();
            this.f7173I = null;
        }
    }

    @Override // p077a0.AbstractC0827g, p077a0.InterfaceC0822d0
    /* JADX INFO: renamed from: c */
    public final void mo1903c(int i3, Object obj) {
        if (i3 != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.f4366a;
        }
        this.f7175K = imageOutput;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: i */
    public final String mo2082i() {
        return "ImageRenderer";
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: k */
    public final boolean mo2084k() {
        return this.f7166B;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: l */
    public final boolean mo2085l() {
        int i3 = this.f7171G;
        if (i3 != 3) {
            return i3 == 0 && this.f7177M;
        }
        return true;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: m */
    public final void mo2086m() {
        this.f7172H = null;
        this.f7167C = C1576f.f7159c;
        this.f7183z.clear();
        m3914E();
        this.f7175K.mo2585a();
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: n */
    public final void mo2087n(boolean z3, boolean z4) {
        this.f7171G = z4 ? 1 : 0;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: o */
    public final void mo2088o(long j3, boolean z3) {
        this.f7171G = Math.min(this.f7171G, 1);
        this.f7166B = false;
        this.f7165A = false;
        this.f7176L = null;
        this.f7178N = null;
        this.f7179O = null;
        this.f7177M = false;
        this.f7174J = null;
        C1572b c1572b = this.f7173I;
        if (c1572b != null) {
            c1572b.flush();
        }
        this.f7183z.clear();
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: p */
    public final void mo2089p() {
        m3914E();
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: q */
    public final void mo2090q() {
        m3914E();
        this.f7171G = Math.min(this.f7171G, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2093t(C0583o[] c0583oArr, long j3, long j4, C1907A c1907a) {
        if (this.f7167C.f7161b != -9223372036854775807L) {
            ArrayDeque arrayDeque = this.f7183z;
            if (arrayDeque.isEmpty()) {
                long j5 = this.f7169E;
                if (j5 != -9223372036854775807L) {
                    long j6 = this.f7168D;
                    if (j6 != -9223372036854775807L) {
                    }
                }
            }
            arrayDeque.add(new C1576f(this.f7169E, j4));
            return;
        }
        this.f7167C = new C1576f(-9223372036854775807L, j4);
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: v */
    public final void mo2095v(long j3, long j4) throws C0839o {
        if (this.f7166B) {
            return;
        }
        if (this.f7172H == null) {
            C0106b c0106b = this.f3479i;
            c0106b.m526n();
            C0771f c0771f = this.f7182y;
            c0771f.mo1883e();
            int iM2094u = m2094u(c0106b, c0771f, 2);
            if (iM2094u != -5) {
                if (iM2094u == -4) {
                    AbstractC0646n.m1630h(c0771f.m1787c(4));
                    this.f7165A = true;
                    this.f7166B = true;
                    return;
                }
                return;
            }
            C0583o c0583o = (C0583o) c0106b.f141i;
            AbstractC0646n.m1631i(c0583o);
            this.f7172H = c0583o;
            m3913D();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (m3911B(j3)) {
            }
            while (m3912C(j3)) {
            }
            Trace.endSection();
        } catch (C1574d e3) {
            throw m2079e(e3, null, false, 4003);
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: z */
    public final int mo2099z(C0583o c0583o) {
        return this.f7181x.m3627o(c0583o);
    }
}
