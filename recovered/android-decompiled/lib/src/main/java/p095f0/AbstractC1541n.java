package p095f0;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: f0.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1541n {

    /* JADX INFO: renamed from: a */
    public final String f6977a;

    /* JADX INFO: renamed from: b */
    public final List f6978b;

    /* JADX INFO: renamed from: c */
    public final boolean f6979c;

    public AbstractC1541n(String str, List list, boolean z3) {
        this.f6977a = str;
        this.f6978b = Collections.unmodifiableList(list);
        this.f6979c = z3;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo3834a(List list);
}
