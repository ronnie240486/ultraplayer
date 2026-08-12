package p098g;

import android.graphics.drawable.Animatable;
import p066W1.AbstractC0664e;
import p118l1.C1978d;

/* JADX INFO: renamed from: g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1564a extends AbstractC0664e {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f7076i;

    /* JADX INFO: renamed from: j */
    public final Animatable f7077j;

    public /* synthetic */ C1564a(Animatable animatable, int i3) {
        this.f7076i = i3;
        this.f7077j = animatable;
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: V */
    public final void mo1764V() {
        switch (this.f7076i) {
            case 0:
                this.f7077j.start();
                break;
            default:
                ((C1978d) this.f7077j).start();
                break;
        }
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: W */
    public final void mo1765W() {
        switch (this.f7076i) {
            case 0:
                this.f7077j.stop();
                break;
            default:
                ((C1978d) this.f7077j).stop();
                break;
        }
    }
}
