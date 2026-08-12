package p000A;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.zuxoplayer.app.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: A.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0015P {

    /* JADX INFO: renamed from: d */
    public static final ArrayList f10d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public WeakHashMap f11a;

    /* JADX INFO: renamed from: b */
    public SparseArray f12b;

    /* JADX INFO: renamed from: c */
    public WeakReference f13c;

    /* JADX INFO: renamed from: a */
    public final View m78a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f11a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewM78a = m78a(viewGroup.getChildAt(childCount));
                if (viewM78a != null) {
                    return viewM78a;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || (size = arrayList.size() - 1) < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
