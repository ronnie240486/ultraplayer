package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: renamed from: androidx.emoji2.text.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0913c {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f3994b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final TextPaint f3995a;

    public C0913c() {
        TextPaint textPaint = new TextPaint();
        this.f3995a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
