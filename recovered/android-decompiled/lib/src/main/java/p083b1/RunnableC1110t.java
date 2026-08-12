package p083b1;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.zuxoplayer.app.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: b1.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1110t implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5137g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1114x f5138h;

    public /* synthetic */ RunnableC1110t(C1114x c1114x, int i3) {
        this.f5137g = i3;
        this.f5138h = c1114x;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc A[LOOP:3: B:39:0x00b6->B:41:0x00bc, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f5137g) {
            case 0:
                this.f5138h.m2972k();
                break;
            case 1:
                C1114x c1114x = this.f5138h;
                ViewGroup viewGroup2 = c1114x.f5153e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(c1114x.f5146A ? 0 : 4);
                }
                View view = c1114x.f5158j;
                if (view != null) {
                    int dimensionPixelSize = c1114x.f5149a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (c1114x.f5146A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof C1095e) {
                        C1095e c1095e = (C1095e) view;
                        boolean z3 = c1114x.f5146A;
                        Rect rect = c1095e.f5011g;
                        if (z3) {
                            ValueAnimator valueAnimator = c1095e.f5000K;
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            c1095e.f5002M = true;
                            c1095e.f5001L = 0.0f;
                            c1095e.invalidate(rect);
                        } else {
                            int i3 = c1114x.f5174z;
                            if (i3 == 1) {
                                ValueAnimator valueAnimator2 = c1095e.f5000K;
                                if (valueAnimator2.isStarted()) {
                                    valueAnimator2.cancel();
                                }
                                c1095e.f5002M = false;
                                c1095e.f5001L = 0.0f;
                                c1095e.invalidate(rect);
                            } else if (i3 != 3) {
                                ValueAnimator valueAnimator3 = c1095e.f5000K;
                                if (valueAnimator3.isStarted()) {
                                    valueAnimator3.cancel();
                                }
                                c1095e.f5002M = false;
                                c1095e.f5001L = 1.0f;
                                c1095e.invalidate(rect);
                            }
                        }
                    }
                }
                ArrayList arrayList = c1114x.f5173y;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    View view2 = (View) obj;
                    view2.setVisibility((c1114x.f5146A && C1114x.m2964j(view2)) ? 4 : 0);
                }
                break;
            case 2:
                C1114x c1114x2 = this.f5138h;
                ViewGroup viewGroup3 = c1114x2.f5154f;
                if (viewGroup3 != null && (viewGroup = c1114x2.f5155g) != null) {
                    C1109s c1109s = c1114x2.f5149a;
                    int width = (c1109s.getWidth() - c1109s.getPaddingLeft()) - c1109s.getPaddingRight();
                    while (true) {
                        if (viewGroup.getChildCount() <= 1) {
                            View view3 = c1114x2.f5159k;
                            if (view3 != null) {
                                view3.setVisibility(8);
                            }
                            int iM2962c = C1114x.m2962c(c1114x2.f5157i);
                            int childCount = viewGroup3.getChildCount() - 1;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                iM2962c += C1114x.m2962c(viewGroup3.getChildAt(i5));
                            }
                            if (iM2962c > width) {
                                if (view3 != null) {
                                    view3.setVisibility(0);
                                    iM2962c += C1114x.m2962c(view3);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (int i6 = 0; i6 < childCount; i6++) {
                                    View childAt = viewGroup3.getChildAt(i6);
                                    iM2962c -= C1114x.m2962c(childAt);
                                    arrayList2.add(childAt);
                                    if (iM2962c <= width) {
                                        if (!arrayList2.isEmpty()) {
                                            viewGroup3.removeViews(0, arrayList2.size());
                                            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                                                viewGroup.addView((View) arrayList2.get(i7), viewGroup.getChildCount() - 1);
                                            }
                                        }
                                    }
                                    break;
                                }
                                if (!arrayList2.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList2.size());
                                    while (i7 < arrayList2.size()) {
                                        viewGroup.addView((View) arrayList2.get(i7), viewGroup.getChildCount() - 1);
                                    }
                                }
                                break;
                            } else {
                                ViewGroup viewGroup4 = c1114x2.f5156h;
                                if (viewGroup4 != null && viewGroup4.getVisibility() == 0) {
                                    ValueAnimator valueAnimator4 = c1114x2.f5166r;
                                    if (!valueAnimator4.isStarted()) {
                                        c1114x2.f5165q.cancel();
                                        valueAnimator4.start();
                                    }
                                    break;
                                }
                            }
                        } else {
                            int childCount2 = viewGroup.getChildCount() - 2;
                            View childAt2 = viewGroup.getChildAt(childCount2);
                            viewGroup.removeViewAt(childCount2);
                            viewGroup3.addView(childAt2, 0);
                        }
                    }
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                this.f5138h.f5162n.start();
                break;
            case 4:
                this.f5138h.f5161m.start();
                break;
            case 5:
                C1114x c1114x3 = this.f5138h;
                c1114x3.f5160l.start();
                c1114x3.m2967e(c1114x3.f5169u, 2000L);
                break;
            default:
                this.f5138h.m2971i(2);
                break;
        }
    }
}
