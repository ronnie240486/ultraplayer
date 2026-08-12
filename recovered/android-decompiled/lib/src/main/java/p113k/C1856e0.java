package p113k;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: k.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1856e0 extends C1853d0 {
    @Override // p113k.C1853d0, p113k.C1859f0
    /* JADX INFO: renamed from: a */
    public void mo4371a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p113k.C1859f0
    /* JADX INFO: renamed from: b */
    public boolean mo4375b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
