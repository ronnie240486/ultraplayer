package p110j;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p106i.InterfaceC1734b;

/* JADX INFO: renamed from: j.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1776q extends FrameLayout implements InterfaceC1734b {

    /* JADX INFO: renamed from: g */
    public final CollapsibleActionView f7954g;

    /* JADX WARN: Multi-variable type inference failed */
    public C1776q(View view) {
        super(view.getContext());
        this.f7954g = (CollapsibleActionView) view;
        addView(view);
    }
}
