package androidx.mediarouter.app;

import android.view.KeyEvent;
import android.widget.SeekBar;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.Collections;
import p089d1.AbstractC1452y;
import p089d1.C1402B;
import p089d1.C1403C;
import p089d1.C1405E;
import p089d1.C1406F;
import p089d1.C1445r;
import p089d1.C1447t;

/* JADX INFO: renamed from: androidx.mediarouter.app.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1020G extends AbstractC1452y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4423a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ KeyEvent.Callback f4424b;

    public /* synthetic */ C1020G(KeyEvent.Callback callback, int i3) {
        this.f4423a = i3;
        this.f4424b = callback;
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: a */
    public void mo2601a() {
        switch (this.f4423a) {
            case 1:
                ((C1033b) this.f4424b).m2632b();
                break;
        }
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: b */
    public void mo2602b() {
        switch (this.f4423a) {
            case 1:
                ((C1033b) this.f4424b).m2632b();
                break;
        }
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: c */
    public void mo2603c() {
        switch (this.f4423a) {
            case 1:
                ((C1033b) this.f4424b).m2632b();
                break;
        }
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: d */
    public void mo2604d(C1403C c1403c) {
        switch (this.f4423a) {
            case 0:
                ((DialogC1028O) this.f4424b).m2627o();
                break;
            case 1:
                ((C1033b) this.f4424b).m2632b();
                break;
            case 2:
                ((DialogC1037f) this.f4424b).m2636i();
                break;
            case 4:
                ((DialogC1015B) this.f4424b).m2596h();
                break;
        }
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: e */
    public final void mo2605e(C1403C c1403c) {
        C1447t c1447tM3492b;
        C1445r c1445r;
        switch (this.f4423a) {
            case 0:
                DialogC1028O dialogC1028O = (DialogC1028O) this.f4424b;
                if (c1403c == dialogC1028O.f4499o && C1403C.m3491a() != null) {
                    C1402B c1402b = c1403c.f6216a;
                    c1402b.getClass();
                    C1405E.m3510b();
                    for (C1403C c1403c2 : Collections.unmodifiableList(c1402b.f6212b)) {
                        if (!Collections.unmodifiableList(dialogC1028O.f4499o.f6237v).contains(c1403c2) && (c1447tM3492b = dialogC1028O.f4499o.m3492b(c1403c2)) != null && (c1445r = (C1445r) c1447tM3492b.f6406h) != null && c1445r.f6398d && !dialogC1028O.f4501q.contains(c1403c2)) {
                            dialogC1028O.m2628p();
                            dialogC1028O.m2626n();
                            break;
                        }
                    }
                }
                dialogC1028O.m2627o();
                break;
            case 1:
                ((C1033b) this.f4424b).m2632b();
                break;
            case 2:
                ((DialogC1037f) this.f4424b).m2636i();
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                ((DialogC1051t) this.f4424b).m2661r(true);
                break;
            default:
                ((DialogC1015B) this.f4424b).m2596h();
                break;
        }
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: f */
    public void mo2606f(C1403C c1403c) {
        switch (this.f4423a) {
            case 0:
                ((DialogC1028O) this.f4424b).m2627o();
                break;
            case 1:
                ((C1033b) this.f4424b).m2632b();
                break;
            case 2:
                ((DialogC1037f) this.f4424b).m2636i();
                break;
            case 4:
                ((DialogC1015B) this.f4424b).m2596h();
                break;
        }
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: g */
    public void mo2607g(C1403C c1403c) {
        switch (this.f4423a) {
            case 0:
                DialogC1028O dialogC1028O = (DialogC1028O) this.f4424b;
                dialogC1028O.f4499o = c1403c;
                dialogC1028O.m2628p();
                dialogC1028O.m2626n();
                break;
            case 1:
                ((C1033b) this.f4424b).m2632b();
                break;
            case 2:
                ((DialogC1037f) this.f4424b).dismiss();
                break;
            case 4:
                ((DialogC1015B) this.f4424b).dismiss();
                break;
        }
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: i */
    public void mo2608i() {
        switch (this.f4423a) {
            case 0:
                ((DialogC1028O) this.f4424b).m2627o();
                break;
            case 1:
                ((C1033b) this.f4424b).m2632b();
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                ((DialogC1051t) this.f4424b).m2661r(false);
                break;
        }
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: k */
    public void mo2609k(C1403C c1403c) {
        AbstractC1019F abstractC1019F;
        KeyEvent.Callback callback = this.f4424b;
        switch (this.f4423a) {
            case 0:
                int i3 = DialogC1028O.f4470Z;
                DialogC1028O dialogC1028O = (DialogC1028O) callback;
                if (dialogC1028O.f4473C != c1403c && (abstractC1019F = (AbstractC1019F) dialogC1028O.f4472B.get(c1403c.f6218c)) != null) {
                    int i4 = abstractC1019F.f4419t.f6231p;
                    abstractC1019F.m2600q(i4 == 0);
                    abstractC1019F.f4421v.setProgress(i4);
                    break;
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                DialogC1051t dialogC1051t = (DialogC1051t) callback;
                SeekBar seekBar = (SeekBar) dialogC1051t.f4631X.get(c1403c);
                int i5 = c1403c.f6231p;
                int i6 = DialogC1051t.f4607v0;
                if (seekBar != null && dialogC1051t.f4626S != c1403c) {
                    seekBar.setProgress(i5);
                    break;
                }
                break;
        }
    }

    @Override // p089d1.AbstractC1452y
    /* JADX INFO: renamed from: l */
    public void mo2610l(C1406F c1406f) {
        switch (this.f4423a) {
            case 1:
                boolean z3 = c1406f != null ? c1406f.f6245d.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
                C1033b c1033b = (C1033b) this.f4424b;
                if (c1033b.f4535l != z3) {
                    c1033b.f4535l = z3;
                    c1033b.refreshDrawableState();
                }
                break;
        }
    }
}
