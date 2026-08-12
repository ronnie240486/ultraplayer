package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: androidx.fragment.app.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0946L extends Writer implements AutoCloseable {

    /* JADX INFO: renamed from: h */
    public final StringBuilder f4133h = new StringBuilder(128);

    /* JADX INFO: renamed from: g */
    public final String f4132g = "FragmentManager";

    /* JADX INFO: renamed from: a */
    public final void m2503a() {
        StringBuilder sb = this.f4133h;
        if (sb.length() > 0) {
            Log.d(this.f4132g, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m2503a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m2503a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            char c = cArr[i3 + i5];
            if (c == '\n') {
                m2503a();
            } else {
                this.f4133h.append(c);
            }
        }
    }
}
