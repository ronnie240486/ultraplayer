package p110j;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p113k.AbstractViewOnTouchListenerC1896u0;
import p113k.C1861g;
import p113k.C1864h;
import p113k.C1870j;
import p113k.C1873k;

/* JADX INFO: renamed from: j.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1761b extends AbstractViewOnTouchListenerC1896u0 {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f7846p = 0;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ View f7847q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1761b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f7847q = actionMenuItemView;
    }

    @Override // p113k.AbstractViewOnTouchListenerC1896u0
    /* JADX INFO: renamed from: b */
    public final InterfaceC1757C mo4238b() {
        C1861g c1861g;
        switch (this.f7846p) {
            case 0:
                AbstractC1762c abstractC1762c = ((ActionMenuItemView) this.f7847q).f3787s;
                if (abstractC1762c == null || (c1861g = ((C1864h) abstractC1762c).f8179a.f8216z) == null) {
                    return null;
                }
                return c1861g.m4272a();
            default:
                C1861g c1861g2 = ((C1870j) this.f7847q).f8193j.f8215y;
                if (c1861g2 == null) {
                    return null;
                }
                return c1861g2.m4272a();
        }
    }

    @Override // p113k.AbstractViewOnTouchListenerC1896u0
    /* JADX INFO: renamed from: c */
    public final boolean mo4239c() {
        InterfaceC1757C interfaceC1757CMo4238b;
        switch (this.f7846p) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f7847q;
                InterfaceC1771l interfaceC1771l = actionMenuItemView.f3785q;
                return interfaceC1771l != null && interfaceC1771l.mo2317b(actionMenuItemView.f3782n) && (interfaceC1757CMo4238b = mo4238b()) != null && interfaceC1757CMo4238b.mo4211b();
            default:
                ((C1870j) this.f7847q).f8193j.m4394l();
                return true;
        }
    }

    @Override // p113k.AbstractViewOnTouchListenerC1896u0
    /* JADX INFO: renamed from: d */
    public boolean mo4240d() {
        switch (this.f7846p) {
            case 1:
                C1873k c1873k = ((C1870j) this.f7847q).f8193j;
                if (c1873k.f8194A != null) {
                    return false;
                }
                c1873k.m4392f();
                return true;
            default:
                return super.mo4240d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1761b(C1870j c1870j, C1870j c1870j2) {
        super(c1870j2);
        this.f7847q = c1870j;
    }
}
