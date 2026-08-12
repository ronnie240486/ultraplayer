package p070Y;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: Y.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0716m implements InterfaceC0711h {

    /* JADX INFO: renamed from: g */
    public final Context f2742g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f2743h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC0711h f2744i;

    /* JADX INFO: renamed from: j */
    public C0721r f2745j;

    /* JADX INFO: renamed from: k */
    public C0705b f2746k;

    /* JADX INFO: renamed from: l */
    public C0708e f2747l;

    /* JADX INFO: renamed from: m */
    public InterfaceC0711h f2748m;

    /* JADX INFO: renamed from: n */
    public C0703C f2749n;

    /* JADX INFO: renamed from: o */
    public C0709f f2750o;

    /* JADX INFO: renamed from: p */
    public C0728y f2751p;

    /* JADX INFO: renamed from: q */
    public InterfaceC0711h f2752q;

    public C0716m(Context context, InterfaceC0711h interfaceC0711h) {
        this.f2742g = context.getApplicationContext();
        interfaceC0711h.getClass();
        this.f2744i = interfaceC0711h;
        this.f2743h = new ArrayList();
    }

    /* JADX INFO: renamed from: k */
    public static void m1837k(InterfaceC0711h interfaceC0711h, InterfaceC0701A interfaceC0701A) {
        if (interfaceC0711h != null) {
            interfaceC0711h.mo1830e(interfaceC0701A);
        }
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: a */
    public final long mo1827a(C0715l c0715l) {
        AbstractC0646n.m1630h(this.f2752q == null);
        String scheme = c0715l.f2735a.getScheme();
        int i3 = AbstractC0632A.f2454a;
        Uri uri = c0715l.f2735a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f2742g;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f2745j == null) {
                    C0721r c0721r = new C0721r(false);
                    this.f2745j = c0721r;
                    m1838b(c0721r);
                }
                this.f2752q = this.f2745j;
            } else {
                if (this.f2746k == null) {
                    C0705b c0705b = new C0705b(context);
                    this.f2746k = c0705b;
                    m1838b(c0705b);
                }
                this.f2752q = this.f2746k;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f2746k == null) {
                C0705b c0705b2 = new C0705b(context);
                this.f2746k = c0705b2;
                m1838b(c0705b2);
            }
            this.f2752q = this.f2746k;
        } else if ("content".equals(scheme)) {
            if (this.f2747l == null) {
                C0708e c0708e = new C0708e(context);
                this.f2747l = c0708e;
                m1838b(c0708e);
            }
            this.f2752q = this.f2747l;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            InterfaceC0711h interfaceC0711h = this.f2744i;
            if (zEquals) {
                if (this.f2748m == null) {
                    try {
                        InterfaceC0711h interfaceC0711h2 = (InterfaceC0711h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f2748m = interfaceC0711h2;
                        m1838b(interfaceC0711h2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC0646n.m1647y("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e3) {
                        throw new RuntimeException("Error instantiating RTMP extension", e3);
                    }
                    if (this.f2748m == null) {
                        this.f2748m = interfaceC0711h;
                    }
                }
                this.f2752q = this.f2748m;
            } else if ("udp".equals(scheme)) {
                if (this.f2749n == null) {
                    C0703C c0703c = new C0703C();
                    this.f2749n = c0703c;
                    m1838b(c0703c);
                }
                this.f2752q = this.f2749n;
            } else if ("data".equals(scheme)) {
                if (this.f2750o == null) {
                    C0709f c0709f = new C0709f(false);
                    this.f2750o = c0709f;
                    m1838b(c0709f);
                }
                this.f2752q = this.f2750o;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f2751p == null) {
                    C0728y c0728y = new C0728y(context);
                    this.f2751p = c0728y;
                    m1838b(c0728y);
                }
                this.f2752q = this.f2751p;
            } else {
                this.f2752q = interfaceC0711h;
            }
        }
        return this.f2752q.mo1827a(c0715l);
    }

    /* JADX INFO: renamed from: b */
    public final void m1838b(InterfaceC0711h interfaceC0711h) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f2743h;
            if (i3 >= arrayList.size()) {
                return;
            }
            interfaceC0711h.mo1830e((InterfaceC0701A) arrayList.get(i3));
            i3++;
        }
    }

    @Override // p070Y.InterfaceC0711h
    public final void close() {
        InterfaceC0711h interfaceC0711h = this.f2752q;
        if (interfaceC0711h != null) {
            try {
                interfaceC0711h.close();
            } finally {
                this.f2752q = null;
            }
        }
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: e */
    public final void mo1830e(InterfaceC0701A interfaceC0701A) {
        interfaceC0701A.getClass();
        this.f2744i.mo1830e(interfaceC0701A);
        this.f2743h.add(interfaceC0701A);
        m1837k(this.f2745j, interfaceC0701A);
        m1837k(this.f2746k, interfaceC0701A);
        m1837k(this.f2747l, interfaceC0701A);
        m1837k(this.f2748m, interfaceC0701A);
        m1837k(this.f2749n, interfaceC0701A);
        m1837k(this.f2750o, interfaceC0701A);
        m1837k(this.f2751p, interfaceC0701A);
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: h */
    public final Uri mo1828h() {
        InterfaceC0711h interfaceC0711h = this.f2752q;
        if (interfaceC0711h == null) {
            return null;
        }
        return interfaceC0711h.mo1828h();
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: m */
    public final Map mo1833m() {
        InterfaceC0711h interfaceC0711h = this.f2752q;
        return interfaceC0711h == null ? Collections.EMPTY_MAP : interfaceC0711h.mo1833m();
    }

    @Override // p055T.InterfaceC0575g
    /* JADX INFO: renamed from: q */
    public final int mo345q(byte[] bArr, int i3, int i4) {
        InterfaceC0711h interfaceC0711h = this.f2752q;
        interfaceC0711h.getClass();
        return interfaceC0711h.mo345q(bArr, i3, i4);
    }
}
