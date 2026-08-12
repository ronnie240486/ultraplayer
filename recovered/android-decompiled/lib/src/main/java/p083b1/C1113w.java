package p083b1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import p000A.InterfaceC0028b0;

/* JADX INFO: renamed from: b1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1113w extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5143a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5144b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5145c;

    public /* synthetic */ C1113w(C1114x c1114x, C1109s c1109s, int i3) {
        this.f5143a = i3;
        this.f5145c = c1114x;
        this.f5144b = c1109s;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f5143a) {
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                ((InterfaceC0028b0) this.f5144b).mo119b();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5143a) {
            case 0:
                C1114x c1114x = (C1114x) this.f5145c;
                c1114x.m2971i(1);
                if (c1114x.f5147B) {
                    ((C1109s) this.f5144b).post(c1114x.f5167s);
                    c1114x.f5147B = false;
                }
                break;
            case 1:
                C1114x c1114x2 = (C1114x) this.f5145c;
                c1114x2.m2971i(2);
                if (c1114x2.f5147B) {
                    ((C1109s) this.f5144b).post(c1114x2.f5167s);
                    c1114x2.f5147B = false;
                }
                break;
            case 2:
                C1114x c1114x3 = (C1114x) this.f5145c;
                c1114x3.m2971i(2);
                if (c1114x3.f5147B) {
                    ((C1109s) this.f5144b).post(c1114x3.f5167s);
                    c1114x3.f5147B = false;
                }
                break;
            default:
                ((InterfaceC0028b0) this.f5144b).mo118a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f5143a) {
            case 0:
                ((C1114x) this.f5145c).m2971i(3);
                break;
            case 1:
                ((C1114x) this.f5145c).m2971i(3);
                break;
            case 2:
                ((C1114x) this.f5145c).m2971i(3);
                break;
            default:
                ((InterfaceC0028b0) this.f5144b).mo120c();
                break;
        }
    }

    public C1113w(InterfaceC0028b0 interfaceC0028b0, View view) {
        this.f5143a = 3;
        this.f5144b = interfaceC0028b0;
        this.f5145c = view;
    }
}
