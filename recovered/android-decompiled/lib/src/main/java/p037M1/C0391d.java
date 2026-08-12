package p037M1;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: M1.d */
/* JADX INFO: loaded from: classes.dex */
public class C0391d extends Exception {

    /* JADX INFO: renamed from: g */
    public final Status f1345g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0391d(Status status) {
        int i3 = status.f5497g;
        String str = status.f5498h;
        super(i3 + ": " + (str == null ? "" : str));
        this.f1345g = status;
    }
}
