package p113k;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0971v;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p110j.InterfaceC1770k;
import p110j.MenuC1772m;

/* JADX INFO: renamed from: k.W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1836W0 implements InterfaceC1881n, InterfaceC1770k {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Toolbar f8097g;

    public /* synthetic */ C1836W0(Toolbar toolbar) {
        this.f8097g = toolbar;
    }

    @Override // p110j.InterfaceC1770k
    /* JADX INFO: renamed from: b */
    public void mo3616b(MenuC1772m menuC1772m) {
        Toolbar toolbar = this.f8097g;
        C1873k c1873k = toolbar.f3921g.f3882z;
        if (c1873k == null || !c1873k.m4393j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f3910M.f3640i).iterator();
            while (it.hasNext()) {
                ((C0971v) it.next()).f4266a.m2475s();
            }
        }
    }

    @Override // p110j.InterfaceC1770k
    /* JADX INFO: renamed from: f */
    public boolean mo3619f(MenuC1772m menuC1772m, MenuItem menuItem) {
        this.f8097g.getClass();
        return false;
    }
}
