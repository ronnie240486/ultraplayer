package p044P;

import android.media.VolumeProvider;
import android.support.v4.media.session.C0858A;
import androidx.emoji2.text.C0925o;
import p089d1.C1433f;
import p089d1.RunnableC1431d;

/* JADX INFO: renamed from: P.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0453e extends VolumeProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0925o f1519a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0453e(C0925o c0925o, int i3, int i4, int i5) {
        super(i3, i4, i5);
        this.f1519a = c0925o;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i3) {
        C0925o c0925o = this.f1519a;
        C1433f c1433f = (C1433f) ((C0858A) c0925o.f4022f).f3641j;
        c1433f.f6330a.post(new RunnableC1431d(c0925o, i3, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i3) {
        C0925o c0925o = this.f1519a;
        C1433f c1433f = (C1433f) ((C0858A) c0925o.f4022f).f3641j;
        c1433f.f6330a.post(new RunnableC1431d(c0925o, i3, 0));
    }
}
