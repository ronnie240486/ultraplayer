package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.C0858A;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p009D0.C0106b;
import p028J1.RunnableC0316v;
import p034L1.C0352g;
import p066W1.AbstractC0664e;
import p124n.C2019f;

/* JADX INFO: renamed from: androidx.emoji2.text.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0919i {

    /* JADX INFO: renamed from: j */
    public static final Object f4003j = new Object();

    /* JADX INFO: renamed from: k */
    public static volatile C0919i f4004k;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f4005a;

    /* JADX INFO: renamed from: b */
    public final C2019f f4006b;

    /* JADX INFO: renamed from: c */
    public volatile int f4007c;

    /* JADX INFO: renamed from: d */
    public final Handler f4008d;

    /* JADX INFO: renamed from: e */
    public final C0915e f4009e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0918h f4010f;

    /* JADX INFO: renamed from: g */
    public final C0352g f4011g;

    /* JADX INFO: renamed from: h */
    public final int f4012h;

    /* JADX INFO: renamed from: i */
    public final C0913c f4013i;

    public C0919i(C0927q c0927q) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f4005a = reentrantReadWriteLock;
        this.f4007c = 3;
        InterfaceC0918h interfaceC0918h = (InterfaceC0918h) c0927q.f4001b;
        this.f4010f = interfaceC0918h;
        int i3 = c0927q.f4000a;
        this.f4012h = i3;
        this.f4013i = (C0913c) c0927q.f4002c;
        this.f4008d = new Handler(Looper.getMainLooper());
        this.f4006b = new C2019f(0);
        this.f4011g = new C0352g(22);
        C0915e c0915e = new C0915e(this);
        this.f4009e = c0915e;
        reentrantReadWriteLock.writeLock().lock();
        if (i3 == 0) {
            try {
                this.f4007c = 0;
            } catch (Throwable th) {
                this.f4005a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m2405b() == 0) {
            try {
                interfaceC0918h.mo1532a(new C0914d(c0915e));
            } catch (Throwable th2) {
                m2407d(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0919i m2404a() {
        C0919i c0919i;
        synchronized (f4003j) {
            try {
                c0919i = f4004k;
                if (!(c0919i != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0919i;
    }

    /* JADX INFO: renamed from: b */
    public final int m2405b() {
        this.f4005a.readLock().lock();
        try {
            return this.f4007c;
        } finally {
            this.f4005a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2406c() {
        if (!(this.f4012h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m2405b() == 1) {
            return;
        }
        this.f4005a.writeLock().lock();
        try {
            if (this.f4007c == 0) {
                this.f4005a.writeLock().unlock();
                return;
            }
            this.f4007c = 0;
            this.f4005a.writeLock().unlock();
            C0915e c0915e = this.f4009e;
            C0919i c0919i = c0915e.f3997a;
            try {
                c0919i.f4010f.mo1532a(new C0914d(c0915e));
            } catch (Throwable th) {
                c0919i.m2407d(th);
            }
        } catch (Throwable th2) {
            this.f4005a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2407d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f4005a.writeLock().lock();
        try {
            this.f4007c = 2;
            arrayList.addAll(this.f4006b);
            this.f4006b.clear();
            this.f4005a.writeLock().unlock();
            this.f4008d.post(new RunnableC0316v(arrayList, this.f4007c, th));
        } catch (Throwable th2) {
            this.f4005a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0096 A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:35:0x0051, B:38:0x0056, B:40:0x005a, B:42:0x0067, B:49:0x0086, B:51:0x0090, B:53:0x0093, B:55:0x0096, B:57:0x00a6, B:58:0x00a9), top: B:105:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6 A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:35:0x0051, B:38:0x0056, B:40:0x005a, B:42:0x0067, B:49:0x0086, B:51:0x0090, B:53:0x0093, B:55:0x0096, B:57:0x00a6, B:58:0x00a9), top: B:105:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX INFO: renamed from: e */
    public final CharSequence m2408e(CharSequence charSequence, int i3, int i4) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i5;
        int i6;
        C0932v[] c0932vArr;
        int spanStart;
        if (!(m2405b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i3 <= i4)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        C0934x c0934x = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i3 <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i4 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() == 0 || i3 == i4) {
            return charSequence;
        }
        C0858A c0858a = this.f4009e.f3998b;
        c0858a.getClass();
        boolean z3 = charSequence instanceof C0930t;
        if (z3) {
            ((C0930t) charSequence).m2421a();
        }
        if (z3) {
            c0934x = new C0934x((Spannable) charSequence);
            if (c0934x != null) {
                for (C0932v c0932v : c0932vArr) {
                    spanStart = c0934x.f4048h.getSpanStart(c0932v);
                    int spanEnd = c0934x.f4048h.getSpanEnd(c0932v);
                    if (spanStart != i4) {
                        c0934x.removeSpan(c0932v);
                    }
                    i3 = Math.min(spanStart, i3);
                    i4 = Math.max(spanEnd, i4);
                }
            }
            i5 = i3;
            i6 = i4;
            if (i5 != i6) {
                charSequence2 = charSequence;
                if (!z3) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z3) {
                    return charSequence2;
                }
            }
            ((C0930t) charSequence2).m2422b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    c0934x = new C0934x((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z3) {
                        throw th;
                    }
                    ((C0930t) charSequence2).m2422b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i3 - 1, i4 + 1, C0932v.class) <= i4) {
                c0934x = new C0934x();
                c0934x.f4047g = false;
                c0934x.f4048h = new SpannableString(charSequence);
            }
            if (c0934x != null && (c0932vArr = (C0932v[]) c0934x.f4048h.getSpans(i3, i4, C0932v.class)) != null && c0932vArr.length > 0) {
                while (i < r5) {
                    spanStart = c0934x.f4048h.getSpanStart(c0932v);
                    int spanEnd2 = c0934x.f4048h.getSpanEnd(c0932v);
                    if (spanStart != i4) {
                        c0934x.removeSpan(c0932v);
                    }
                    i3 = Math.min(spanStart, i3);
                    i4 = Math.max(spanEnd2, i4);
                }
            }
            i5 = i3;
            i6 = i4;
            if (i5 != i6 || i5 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z3) {
                    return charSequence2;
                }
            } else {
                try {
                    charSequence2 = charSequence;
                    try {
                        C0934x c0934x2 = (C0934x) c0858a.m2169R(charSequence2, i5, i6, Integer.MAX_VALUE, false, new C0106b(c0934x, 25, (C0352g) c0858a.f3639h));
                        if (c0934x2 != null) {
                            Spannable spannable = c0934x2.f4048h;
                            if (z3) {
                                ((C0930t) charSequence2).m2422b();
                            }
                            return spannable;
                        }
                        if (!z3) {
                            return charSequence2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        if (!z3) {
                            throw th;
                        }
                        ((C0930t) charSequence2).m2422b();
                        throw th;
                    }
                } catch (Throwable th4) {
                    charSequence2 = charSequence;
                    th = th4;
                }
            }
            ((C0930t) charSequence2).m2422b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
        }
        if (!z3) {
            throw th;
        }
        ((C0930t) charSequence2).m2422b();
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final void m2409f(AbstractC0917g abstractC0917g) {
        AbstractC0664e.m1747h(abstractC0917g, "initCallback cannot be null");
        this.f4005a.writeLock().lock();
        try {
            if (this.f4007c == 1 || this.f4007c == 2) {
                this.f4008d.post(new RunnableC0316v(Arrays.asList(abstractC0917g), this.f4007c, (Throwable) null));
            } else {
                this.f4006b.add(abstractC0917g);
            }
        } finally {
            this.f4005a.writeLock().unlock();
        }
    }
}
