package p113k;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.zuxoplayer.app.R;
import p110j.ViewTreeObserverOnGlobalLayoutListenerC1763d;

/* JADX INFO: renamed from: k.N */
/* JADX INFO: loaded from: classes.dex */
public final class C1818N extends AbstractC1801E0 implements InterfaceC1822P {

    /* JADX INFO: renamed from: I */
    public CharSequence f8060I;

    /* JADX INFO: renamed from: J */
    public C1812K f8061J;

    /* JADX INFO: renamed from: K */
    public final Rect f8062K;

    /* JADX INFO: renamed from: L */
    public int f8063L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ C1824Q f8064M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818N(C1824Q c1824q, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f8064M = c1824q;
        this.f8062K = new Rect();
        this.f8019u = c1824q;
        this.f8003D = true;
        this.f8004E.setFocusable(true);
        this.f8020v = new C1814L(this);
    }

    @Override // p113k.InterfaceC1822P
    /* JADX INFO: renamed from: e */
    public final void mo4308e(int i3, int i4) {
        ViewTreeObserver viewTreeObserver;
        C1905z c1905z = this.f8004E;
        boolean zIsShowing = c1905z.isShowing();
        m4331s();
        this.f8004E.setInputMethodMode(2);
        mo4212f();
        C1890r0 c1890r0 = this.f8007i;
        c1890r0.setChoiceMode(1);
        c1890r0.setTextDirection(i3);
        c1890r0.setTextAlignment(i4);
        C1824Q c1824q = this.f8064M;
        int selectedItemPosition = c1824q.getSelectedItemPosition();
        C1890r0 c1890r1 = this.f8007i;
        if (c1905z.isShowing() && c1890r1 != null) {
            c1890r1.setListSelectionHidden(false);
            c1890r1.setSelection(selectedItemPosition);
            if (c1890r1.getChoiceMode() != 0) {
                c1890r1.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c1824q.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1763d viewTreeObserverOnGlobalLayoutListenerC1763d = new ViewTreeObserverOnGlobalLayoutListenerC1763d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1763d);
        this.f8004E.setOnDismissListener(new C1816M(this, viewTreeObserverOnGlobalLayoutListenerC1763d));
    }

    @Override // p113k.InterfaceC1822P
    /* JADX INFO: renamed from: i */
    public final CharSequence mo4311i() {
        return this.f8060I;
    }

    @Override // p113k.InterfaceC1822P
    /* JADX INFO: renamed from: k */
    public final void mo4312k(CharSequence charSequence) {
        this.f8060I = charSequence;
    }

    @Override // p113k.AbstractC1801E0, p113k.InterfaceC1822P
    /* JADX INFO: renamed from: o */
    public final void mo4296o(ListAdapter listAdapter) {
        super.mo4296o(listAdapter);
        this.f8061J = (C1812K) listAdapter;
    }

    @Override // p113k.InterfaceC1822P
    /* JADX INFO: renamed from: p */
    public final void mo4315p(int i3) {
        this.f8063L = i3;
    }

    /* JADX INFO: renamed from: s */
    public final void m4331s() {
        int i3;
        C1905z c1905z = this.f8004E;
        Drawable background = c1905z.getBackground();
        C1824Q c1824q = this.f8064M;
        if (background != null) {
            background.getPadding(c1824q.f8082n);
            boolean z3 = AbstractC1878l1.f8219a;
            int layoutDirection = c1824q.getLayoutDirection();
            Rect rect = c1824q.f8082n;
            i3 = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c1824q.f8082n;
            rect2.right = 0;
            rect2.left = 0;
            i3 = 0;
        }
        int paddingLeft = c1824q.getPaddingLeft();
        int paddingRight = c1824q.getPaddingRight();
        int width = c1824q.getWidth();
        int i4 = c1824q.f8081m;
        if (i4 == -2) {
            int iM4333a = c1824q.m4333a(this.f8061J, c1905z.getBackground());
            int i5 = c1824q.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c1824q.f8082n;
            int i6 = (i5 - rect3.left) - rect3.right;
            if (iM4333a > i6) {
                iM4333a = i6;
            }
            m4298r(Math.max(iM4333a, (width - paddingLeft) - paddingRight));
        } else if (i4 == -1) {
            m4298r((width - paddingLeft) - paddingRight);
        } else {
            m4298r(i4);
        }
        boolean z4 = AbstractC1878l1.f8219a;
        this.f8010l = c1824q.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f8009k) - this.f8063L) + i3 : paddingLeft + this.f8063L + i3;
    }
}
