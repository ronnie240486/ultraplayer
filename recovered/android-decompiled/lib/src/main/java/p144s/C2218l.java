package p144s;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: renamed from: s.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2218l {

    /* JADX INFO: renamed from: a */
    public final Resources f9528a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f9529b;

    public C2218l(Resources resources, Resources.Theme theme) {
        this.f9528a = resources;
        this.f9529b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2218l.class == obj.getClass()) {
            C2218l c2218l = (C2218l) obj;
            if (this.f9528a.equals(c2218l.f9528a) && Objects.equals(this.f9529b, c2218l.f9529b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9528a, this.f9529b);
    }
}
