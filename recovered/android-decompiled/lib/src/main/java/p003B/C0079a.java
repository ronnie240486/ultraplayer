package p003B;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: B.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0079a extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f113a;

    /* JADX INFO: renamed from: b */
    public final C0090l f114b;

    /* JADX INFO: renamed from: c */
    public final int f115c;

    public C0079a(int i3, C0090l c0090l, int i4) {
        this.f113a = i3;
        this.f114b = c0090l;
        this.f115c = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f113a);
        this.f114b.f123a.performAction(this.f115c, bundle);
    }
}
