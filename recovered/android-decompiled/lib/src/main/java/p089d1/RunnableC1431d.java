package p089d1;

import android.support.v4.media.session.C0858A;
import androidx.emoji2.text.C0925o;

/* JADX INFO: renamed from: d1.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1431d implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6321g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0925o f6322h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f6323i;

    public /* synthetic */ RunnableC1431d(C0925o c0925o, int i3, int i4) {
        this.f6321g = i4;
        this.f6322h = c0925o;
        this.f6323i = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6321g) {
            case 0:
                C1403C c1403c = ((C1433f) ((C0858A) this.f6322h.f4022f).f3641j).f6333d;
                if (c1403c != null) {
                    c1403c.m3500j(this.f6323i);
                }
                break;
            default:
                C1403C c1403c2 = ((C1433f) ((C0858A) this.f6322h.f4022f).f3641j).f6333d;
                if (c1403c2 != null) {
                    c1403c2.m3501k(this.f6323i);
                }
                break;
        }
    }
}
