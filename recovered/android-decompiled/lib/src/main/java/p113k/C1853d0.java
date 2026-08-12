package p113k;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: renamed from: k.d0 */
/* JADX INFO: loaded from: classes.dex */
public class C1853d0 extends C1859f0 {
    @Override // p113k.C1859f0
    /* JADX INFO: renamed from: a */
    public void mo4371a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C1862g0.m4379e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
