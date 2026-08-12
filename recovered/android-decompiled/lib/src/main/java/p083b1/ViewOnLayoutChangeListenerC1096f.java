package p083b1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: b1.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC1096f implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5031a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5032b;

    public /* synthetic */ ViewOnLayoutChangeListenerC1096f(int i3, Object obj) {
        this.f5031a = i3;
        this.f5032b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int height;
        int height2;
        switch (this.f5031a) {
            case 0:
                C1109s c1109s = (C1109s) this.f5032b;
                c1109s.getClass();
                int i11 = i6 - i4;
                int i12 = i10 - i8;
                if (i5 - i3 != i9 - i7 || i11 != i12) {
                    PopupWindow popupWindow = c1109s.f5117q;
                    if (popupWindow.isShowing()) {
                        c1109s.m2958q();
                        int width = c1109s.getWidth() - popupWindow.getWidth();
                        int i13 = c1109s.f5119r;
                        popupWindow.update(view, width - i13, (-popupWindow.getHeight()) - i13, -1, -1);
                    }
                }
                break;
            default:
                C1114x c1114x = (C1114x) this.f5032b;
                C1109s c1109s2 = c1114x.f5149a;
                int width2 = (c1109s2.getWidth() - c1109s2.getPaddingLeft()) - c1109s2.getPaddingRight();
                int height3 = (c1109s2.getHeight() - c1109s2.getPaddingBottom()) - c1109s2.getPaddingTop();
                ViewGroup viewGroup = c1114x.f5151c;
                int iM2962c = C1114x.m2962c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iM2962c, C1114x.m2962c(c1114x.f5159k) + C1114x.m2962c(c1114x.f5157i));
                ViewGroup viewGroup2 = c1114x.f5152d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z3 = width2 <= iMax || height3 <= (height2 * 2) + paddingBottom;
                if (c1114x.f5146A != z3) {
                    c1114x.f5146A = z3;
                    view.post(new RunnableC1110t(c1114x, 1));
                }
                boolean z4 = i5 - i3 != i9 - i7;
                if (!c1114x.f5146A && z4) {
                    view.post(new RunnableC1110t(c1114x, 2));
                    break;
                }
                break;
        }
    }
}
