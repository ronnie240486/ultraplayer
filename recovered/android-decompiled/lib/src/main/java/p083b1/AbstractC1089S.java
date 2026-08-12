package p083b1;

import android.text.Layout;

/* JADX INFO: renamed from: b1.S */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1089S {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f4969a;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        f4969a = iArr;
        try {
            iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4969a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4969a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
