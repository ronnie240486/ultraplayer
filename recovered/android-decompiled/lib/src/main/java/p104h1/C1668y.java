package p104h1;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: h1.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1668y extends Observable {
    /* JADX INFO: renamed from: a */
    public final void m4100a() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((C1629M) ((Observable) this).mObservers.get(size)).f7383a;
            recyclerView.m2775f(null);
            recyclerView.f4751j0.f7389e = true;
            recyclerView.m2761P(true);
            if (!recyclerView.f4752k.m785h()) {
                recyclerView.requestLayout();
            }
        }
    }
}
