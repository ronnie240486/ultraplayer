package p083b1;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

/* JADX INFO: renamed from: b1.u */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1111u implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5139a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5140b;

    public /* synthetic */ C1111u(int i3, Object obj) {
        this.f5139a = i3;
        this.f5140b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5139a) {
            case 0:
                C1114x c1114x = (C1114x) this.f5140b;
                c1114x.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = c1114x.f5150b;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup = c1114x.f5151c;
                if (viewGroup != null) {
                    viewGroup.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = c1114x.f5153e;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                break;
            case 1:
                C1114x c1114x2 = (C1114x) this.f5140b;
                c1114x2.getClass();
                c1114x2.m2965a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                C1114x c1114x3 = (C1114x) this.f5140b;
                c1114x3.getClass();
                c1114x3.m2965a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                C1114x c1114x4 = (C1114x) this.f5140b;
                c1114x4.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = c1114x4.f5150b;
                if (view2 != null) {
                    view2.setAlpha(fFloatValue2);
                }
                ViewGroup viewGroup3 = c1114x4.f5151c;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue2);
                }
                ViewGroup viewGroup4 = c1114x4.f5153e;
                if (viewGroup4 != null) {
                    viewGroup4.setAlpha(fFloatValue2);
                }
                break;
            default:
                C1095e c1095e = (C1095e) this.f5140b;
                c1095e.getClass();
                c1095e.f5001L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1095e.invalidate(c1095e.f5011g);
                break;
        }
    }
}
