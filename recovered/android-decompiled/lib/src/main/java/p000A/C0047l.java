package p000A;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: A.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0047l {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f71a;

    public C0047l(DisplayCutout displayCutout) {
        this.f71a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0047l.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f71a, ((C0047l) obj).f71a);
    }

    public final int hashCode() {
        return this.f71a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f71a + "}";
    }
}
