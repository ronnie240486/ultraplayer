package p028J1;

import androidx.emoji2.text.AbstractC0917g;
import java.util.ArrayList;
import java.util.List;
import p040N1.C0435p;
import p066W1.AbstractC0664e;

/* JADX INFO: renamed from: J1.v */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0316v implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f846g;

    /* JADX INFO: renamed from: h */
    public final int f847h;

    /* JADX INFO: renamed from: i */
    public final Object f848i;

    public /* synthetic */ RunnableC0316v(int i3, int i4, Object obj) {
        this.f846g = i4;
        this.f848i = obj;
        this.f847h = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f846g) {
            case 0:
                ((C0318x) this.f848i).f855B.m664b(this.f847h);
                break;
            case 1:
                ((C0435p) this.f848i).m1140g(this.f847h);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f848i;
                int size = arrayList.size();
                int i3 = 0;
                if (this.f847h == 1) {
                    while (i3 < size) {
                        ((AbstractC0917g) arrayList.get(i3)).mo818a();
                        i3++;
                    }
                } else {
                    while (i3 < size) {
                        ((AbstractC0917g) arrayList.get(i3)).getClass();
                        i3++;
                    }
                }
                break;
        }
    }

    public RunnableC0316v(List list, int i3, Throwable th) {
        this.f846g = 2;
        AbstractC0664e.m1747h(list, "initCallbacks cannot be null");
        this.f848i = new ArrayList(list);
        this.f847h = i3;
    }
}
