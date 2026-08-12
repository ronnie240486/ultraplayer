package p095f0;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p055T.C0554Q;
import p055T.C0583o;

/* JADX INFO: renamed from: f0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1540m extends AbstractC1541n {

    /* JADX INFO: renamed from: l */
    public static final C1540m f6968l;

    /* JADX INFO: renamed from: d */
    public final List f6969d;

    /* JADX INFO: renamed from: e */
    public final List f6970e;

    /* JADX INFO: renamed from: f */
    public final List f6971f;

    /* JADX INFO: renamed from: g */
    public final List f6972g;

    /* JADX INFO: renamed from: h */
    public final C0583o f6973h;

    /* JADX INFO: renamed from: i */
    public final List f6974i;

    /* JADX INFO: renamed from: j */
    public final Map f6975j;

    /* JADX INFO: renamed from: k */
    public final List f6976k;

    static {
        List list = Collections.EMPTY_LIST;
        f6968l = new C1540m("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public C1540m(String str, List list, List list2, List list3, List list4, List list5, List list6, C0583o c0583o, List list7, boolean z3, Map map, List list8) {
        super(str, list, z3);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list2.size(); i3++) {
            Uri uri = ((C1539l) list2.get(i3)).f6962a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m3835b(list3, arrayList);
        m3835b(list4, arrayList);
        m3835b(list5, arrayList);
        m3835b(list6, arrayList);
        this.f6969d = Collections.unmodifiableList(arrayList);
        this.f6970e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f6971f = Collections.unmodifiableList(list4);
        this.f6972g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.f6973h = c0583o;
        this.f6974i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f6975j = Collections.unmodifiableMap(map);
        this.f6976k = Collections.unmodifiableList(list8);
    }

    /* JADX INFO: renamed from: b */
    public static void m3835b(List list, ArrayList arrayList) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            Uri uri = ((C1538k) list.get(i3)).f6959a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m3836c(List list, int i3, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            Object obj = list.get(i4);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                C0554Q c0554q = (C0554Q) list2.get(i5);
                if (c0554q.f1964h == i3 && c0554q.f1965i == i4) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // p095f0.AbstractC1541n
    /* JADX INFO: renamed from: a */
    public final Object mo3834a(List list) {
        ArrayList arrayListM3836c = m3836c(this.f6970e, 0, list);
        List list2 = Collections.EMPTY_LIST;
        return new C1540m(this.f6977a, this.f6978b, arrayListM3836c, list2, m3836c(this.f6971f, 1, list), m3836c(this.f6972g, 2, list), list2, this.f6973h, this.f6974i, this.f6979c, this.f6975j, this.f6976k);
    }
}
