package p070Y;

import java.util.Map;
import p101g2.InterfaceC1584e;

/* JADX INFO: renamed from: Y.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0717n implements InterfaceC1584e {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2753g;

    @Override // p101g2.InterfaceC1584e
    public final boolean apply(Object obj) {
        switch (this.f2753g) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
