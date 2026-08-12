package p089d1;

import android.content.ComponentName;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.Surface;
import androidx.appcompat.widget.ActionMenuView;
import androidx.fragment.app.C0971v;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.RunnableC1307n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p034L1.C0352g;
import p045P0.AbstractC0462h;
import p055T.AbstractC0545H;
import p055T.C0559W;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p082b0.C1063d;
import p085c0.C1133i;
import p092e0.C1499d;
import p092e0.C1506k;
import p092e0.C1512q;
import p096f1.InterfaceC1548c;
import p099g0.InterfaceC1573c;
import p110j.C1765f;
import p110j.C1774o;
import p110j.InterfaceC1770k;
import p110j.InterfaceC1783x;
import p110j.MenuC1772m;
import p110j.SubMenuC1759E;
import p110j.ViewOnKeyListenerC1766g;
import p113k.C1836W0;
import p113k.C1873k;
import p113k.InterfaceC1803F0;
import p113k.InterfaceC1839Y;
import p113k.InterfaceC1881n;
import p114k0.C1945g0;
import p114k0.InterfaceC1933a0;
import p114k0.InterfaceC1935b0;
import p121m0.InterfaceC2001c;
import p137q0.C2144e;
import p137q0.InterfaceC2163x;
import p137q0.RunnableC2162w;

/* JADX INFO: renamed from: d1.t */
/* JADX INFO: loaded from: classes.dex */
public class C1447t implements InterfaceC1933a0, InterfaceC1548c, InterfaceC1573c, InterfaceC1803F0, InterfaceC1783x, InterfaceC1770k, InterfaceC1839Y, InterfaceC2001c, InterfaceC2163x {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6405g;

    /* JADX INFO: renamed from: h */
    public Object f6406h;

    public /* synthetic */ C1447t(int i3, Object obj) {
        this.f6405g = i3;
        this.f6406h = obj;
    }

    @Override // p110j.InterfaceC1783x
    /* JADX INFO: renamed from: a */
    public void mo3615a(MenuC1772m menuC1772m, boolean z3) {
        if (menuC1772m instanceof SubMenuC1759E) {
            ((SubMenuC1759E) menuC1772m).f7829z.mo4231k().m4253c(false);
        }
        InterfaceC1783x interfaceC1783x = ((C1873k) this.f6406h).f8201k;
        if (interfaceC1783x != null) {
            interfaceC1783x.mo3615a(menuC1772m, z3);
        }
    }

    @Override // p110j.InterfaceC1770k
    /* JADX INFO: renamed from: b */
    public void mo3616b(MenuC1772m menuC1772m) {
        C1836W0 c1836w0 = ((ActionMenuView) this.f6406h).f3872A;
        if (c1836w0 != null) {
            c1836w0.mo3616b(menuC1772m);
        }
    }

    @Override // p110j.InterfaceC1783x
    /* JADX INFO: renamed from: c */
    public boolean mo3617c(MenuC1772m menuC1772m) {
        C1873k c1873k = (C1873k) this.f6406h;
        if (menuC1772m == c1873k.f8199i) {
            return false;
        }
        ((SubMenuC1759E) menuC1772m).f7828A.getClass();
        c1873k.getClass();
        InterfaceC1783x interfaceC1783x = c1873k.f8201k;
        if (interfaceC1783x != null) {
            return interfaceC1783x.mo3617c(menuC1772m);
        }
        return false;
    }

    @Override // p113k.InterfaceC1803F0
    /* JADX INFO: renamed from: d */
    public void mo3618d(MenuC1772m menuC1772m, C1774o c1774o) {
        ViewOnKeyListenerC1766g viewOnKeyListenerC1766g = (ViewOnKeyListenerC1766g) this.f6406h;
        viewOnKeyListenerC1766g.f7865l.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC1766g.f7867n;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (menuC1772m == ((C1765f) arrayList.get(i3)).f7853b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        int i4 = i3 + 1;
        viewOnKeyListenerC1766g.f7865l.postAtTime(new RunnableC1307n(this, i4 < arrayList.size() ? (C1765f) arrayList.get(i4) : null, c1774o, menuC1772m), menuC1772m, SystemClock.uptimeMillis() + 200);
    }

    @Override // p110j.InterfaceC1770k
    /* JADX INFO: renamed from: f */
    public boolean mo3619f(MenuC1772m menuC1772m, MenuItem menuItem) {
        InterfaceC1881n interfaceC1881n = ((ActionMenuView) this.f6406h).f3877F;
        if (interfaceC1881n == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((C1836W0) interfaceC1881n).f8097g.f3910M.f3640i).iterator();
        while (it.hasNext()) {
            if (((C0971v) it.next()).f4266a.m2471o()) {
                return true;
            }
        }
        return false;
    }

    @Override // p114k0.InterfaceC1933a0
    /* JADX INFO: renamed from: g */
    public void mo1973g(InterfaceC1935b0 interfaceC1935b0) {
        C1506k c1506k = (C1506k) this.f6406h;
        c1506k.f6736w.mo1973g(c1506k);
    }

    @Override // p096f1.InterfaceC1548c
    /* JADX INFO: renamed from: k */
    public void mo3623k(int i3, Serializable serializable) {
        String str;
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
        ((ProfileInstallReceiver) this.f6406h).setResultCode(i3);
    }

    @Override // p113k.InterfaceC1803F0
    /* JADX INFO: renamed from: l */
    public void mo3624l(MenuC1772m menuC1772m, C1774o c1774o) {
        ((ViewOnKeyListenerC1766g) this.f6406h).f7865l.removeCallbacksAndMessages(menuC1772m);
    }

    @Override // p096f1.InterfaceC1548c
    /* JADX INFO: renamed from: m */
    public void mo3625m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    /* JADX INFO: renamed from: n */
    public void m3626n() {
        C1506k c1506k = (C1506k) this.f6406h;
        int i3 = c1506k.f6737x - 1;
        c1506k.f6737x = i3;
        if (i3 > 0) {
            return;
        }
        int i4 = 0;
        for (C1512q c1512q : c1506k.f6739z) {
            c1512q.m3806v();
            i4 += c1512q.f6781O.f8526a;
        }
        C0559W[] c0559wArr = new C0559W[i4];
        int i5 = 0;
        for (C1512q c1512q2 : c1506k.f6739z) {
            c1512q2.m3806v();
            int i6 = c1512q2.f6781O.f8526a;
            int i7 = 0;
            while (i7 < i6) {
                c1512q2.m3806v();
                c0559wArr[i5] = c1512q2.f6781O.m4499a(i7);
                i7++;
                i5++;
            }
        }
        c1506k.f6738y = new C1945g0(c0559wArr);
        c1506k.f6736w.mo1969e(c1506k);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (r2 >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
    
        if (r2 >= 34) goto L45;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m3627o(C0583o c0583o) {
        String str = c0583o.f2154n;
        if (str == null || !AbstractC0545H.m1361i(str)) {
            return AbstractC0462h.m1162b(0, 0, 0, 0);
        }
        int i3 = AbstractC0632A.f2454a;
        String str2 = c0583o.f2154n;
        str2.getClass();
        int i4 = AbstractC0632A.f2454a;
        switch (str2) {
            case "image/avif":
                break;
            case "image/heic":
            case "image/heif":
                break;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return AbstractC0462h.m1162b(4, 0, 0, 0);
        }
        return AbstractC0462h.m1162b(1, 0, 0, 0);
    }

    @Override // p137q0.InterfaceC2163x
    /* JADX INFO: renamed from: q */
    public void mo3628q() {
        C2144e c2144e = (C2144e) this.f6406h;
        Surface surface = c2144e.f9235V0;
        if (surface != null) {
            C1133i c1133i = c2144e.f9224K0;
            Handler handler = c1133i.f5252b;
            if (handler != null) {
                handler.post(new RunnableC2162w(c1133i, surface, SystemClock.elapsedRealtime()));
            }
            c2144e.f9238Y0 = true;
        }
    }

    @Override // p137q0.InterfaceC2163x
    /* JADX INFO: renamed from: s */
    public void mo3629s() {
        C2144e c2144e = (C2144e) this.f6406h;
        if (c2144e.f9235V0 != null) {
            c2144e.m4725F0(0, 1);
        }
    }

    public String toString() {
        switch (this.f6405g) {
            case 0:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f6406h).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public C1447t(int i3) {
        this.f6405g = i3;
        switch (i3) {
            case 6:
                this.f6406h = new SparseArray();
                break;
            case 8:
                this.f6406h = new C1063d(12);
                break;
            case 17:
                this.f6406h = new C0352g(12);
                break;
            case 18:
                this.f6406h = new CopyOnWriteArrayList();
                break;
            case 22:
                break;
            default:
                this.f6406h = new C1499d(5, 1.0f, false);
                break;
        }
    }

    @Override // p113k.InterfaceC1839Y
    /* JADX INFO: renamed from: h */
    public void mo3620h(int i3) {
    }

    @Override // p113k.InterfaceC1839Y
    /* JADX INFO: renamed from: i */
    public void mo3621i(int i3) {
    }

    @Override // p113k.InterfaceC1839Y
    /* JADX INFO: renamed from: j */
    public void mo3622j(int i3, float f) {
    }
}
