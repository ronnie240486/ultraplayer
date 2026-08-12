package p093e1;

import android.util.SparseBooleanArray;
import java.util.ArrayList;
import p124n.C2018e;

/* JADX INFO: renamed from: e1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1521f {

    /* JADX INFO: renamed from: e */
    public static final C1519d f6862e = new C1519d();

    /* JADX INFO: renamed from: a */
    public final ArrayList f6863a;

    /* JADX INFO: renamed from: d */
    public final C1520e f6866d;

    /* JADX INFO: renamed from: c */
    public final SparseBooleanArray f6865c = new SparseBooleanArray();

    /* JADX INFO: renamed from: b */
    public final C2018e f6864b = new C2018e();

    public C1521f(ArrayList arrayList, ArrayList arrayList2) {
        this.f6863a = arrayList;
        int size = arrayList.size();
        int i3 = Integer.MIN_VALUE;
        C1520e c1520e = null;
        for (int i4 = 0; i4 < size; i4++) {
            C1520e c1520e2 = (C1520e) arrayList.get(i4);
            int i5 = c1520e2.f6857e;
            if (i5 > i3) {
                c1520e = c1520e2;
                i3 = i5;
            }
        }
        this.f6866d = c1520e;
    }
}
