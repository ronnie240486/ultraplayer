package androidx.fragment.app;

import android.content.Intent;
import androidx.activity.result.C0908a;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import java.util.Iterator;
import p143r2.C2203a;
import p147s2.AbstractC2261g;
import p147s2.C2259e;

/* JADX INFO: renamed from: androidx.fragment.app.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0974y extends AbstractC1303m {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f4270i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0974y(int i3) {
        super(10);
        this.f4270i = i3;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1303m
    /* JADX INFO: renamed from: A */
    public final Object mo2549A(int i3, Intent intent) {
        switch (this.f4270i) {
            case 0:
                return new C0908a(i3, intent);
            case 1:
                C2259e c2259e = C2259e.f9694g;
                if (i3 != -1 || intent == null) {
                    return c2259e;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return c2259e;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i4 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i4 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(arrayList2.size(), arrayList.size()));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new C2203a(it.next(), it2.next()));
                }
                return AbstractC2261g.m4852E(arrayList3);
            default:
                return new C0908a(i3, intent);
        }
    }
}
