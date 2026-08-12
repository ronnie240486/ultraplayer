package p000A;

import android.media.session.MediaSessionManager;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* JADX INFO: renamed from: A.k */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0045k {
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ PrecomputedText.Params.Builder m238i(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m250u(String str, int i3, int i4) {
        new MediaSessionManager.RemoteUserInfo(str, i3, i4);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ boolean m251v(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
