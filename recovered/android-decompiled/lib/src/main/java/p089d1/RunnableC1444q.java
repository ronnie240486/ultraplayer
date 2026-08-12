package p089d1;

import java.util.ArrayList;

/* JADX INFO: renamed from: d1.q */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1444q implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6390g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1428b f6391h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1442o f6392i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ArrayList f6393j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AbstractC1446s f6394k;

    public /* synthetic */ RunnableC1444q(AbstractC1446s abstractC1446s, C1428b c1428b, C1442o c1442o, ArrayList arrayList, int i3) {
        this.f6390g = i3;
        this.f6394k = abstractC1446s;
        this.f6391h = c1428b;
        this.f6392i = c1442o;
        this.f6393j = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6390g) {
            case 0:
                ArrayList arrayList = this.f6393j;
                this.f6391h.m3570a(this.f6394k, this.f6392i, arrayList);
                break;
            default:
                this.f6391h.m3570a(this.f6394k, this.f6392i, this.f6393j);
                break;
        }
    }
}
