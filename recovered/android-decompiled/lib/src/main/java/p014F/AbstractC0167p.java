package p014F;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* JADX INFO: renamed from: F.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0167p {
    /* JADX INFO: renamed from: b */
    public static String[] m642b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* JADX INFO: renamed from: c */
    public static PrecomputedText.Params m643c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* JADX INFO: renamed from: d */
    public static void m644d(TextView textView, int i3) {
        textView.setFirstBaselineToTopHeight(i3);
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m641a(PrecomputedText precomputedText) {
        return precomputedText;
    }
}
