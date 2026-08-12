package androidx.emoji2.text;

import android.os.Trace;
import p157w.AbstractC2317k;

/* JADX INFO: renamed from: androidx.emoji2.text.k */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0921k implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i3 = AbstractC2317k.f9837a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C0919i.f4004k != null) {
                C0919i.m2404a().m2406c();
            }
        } finally {
            int i4 = AbstractC2317k.f9837a;
            Trace.endSection();
        }
    }
}
