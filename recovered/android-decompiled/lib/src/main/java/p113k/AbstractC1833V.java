package p113k;

import android.widget.TextView;

/* JADX INFO: renamed from: k.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1833V {
    /* JADX INFO: renamed from: a */
    public static int m4343a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* JADX INFO: renamed from: b */
    public static void m4344b(TextView textView, int i3, int i4, int i5, int i6) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
    }

    /* JADX INFO: renamed from: c */
    public static void m4345c(TextView textView, int[] iArr, int i3) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m4346d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
