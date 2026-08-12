package androidx.mediarouter.app;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p089d1.C1403C;

/* JADX INFO: renamed from: androidx.mediarouter.app.k */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1042k implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f4580g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DialogC1051t f4581h;

    public ViewTreeObserverOnGlobalLayoutListenerC1042k(DialogC1051t dialogC1051t, boolean z3) {
        this.f4581h = dialogC1051t;
        this.f4580g = z3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iM2657m;
        HashMap map;
        HashMap map2;
        Bitmap bitmap;
        DialogC1051t dialogC1051t = this.f4581h;
        dialogC1051t.f4668z.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (dialogC1051t.f4645l0) {
            dialogC1051t.f4647m0 = true;
            return;
        }
        int i3 = dialogC1051t.f4614G.getLayoutParams().height;
        DialogC1051t.m2652p(dialogC1051t.f4614G, -1);
        dialogC1051t.m2665v(dialogC1051t.m2654j());
        View decorView = dialogC1051t.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(dialogC1051t.getWindow().getAttributes().width, 1073741824), 0);
        DialogC1051t.m2652p(dialogC1051t.f4614G, i3);
        if (!(dialogC1051t.f4608A.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) dialogC1051t.f4608A.getDrawable()).getBitmap()) == null) {
            iM2657m = 0;
        } else {
            iM2657m = dialogC1051t.m2657m(bitmap.getWidth(), bitmap.getHeight());
            dialogC1051t.f4608A.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int iM2658n = dialogC1051t.m2658n(dialogC1051t.m2654j());
        int size = dialogC1051t.f4620M.size();
        boolean zM2659o = dialogC1051t.m2659o();
        C1403C c1403c = dialogC1051t.f4650o;
        int size2 = zM2659o ? Collections.unmodifiableList(c1403c.f6237v).size() * dialogC1051t.f4628U : 0;
        if (size > 0) {
            size2 += dialogC1051t.f4630W;
        }
        int iMin = Math.min(size2, dialogC1051t.f4629V);
        if (!dialogC1051t.f4644k0) {
            iMin = 0;
        }
        int iMax = Math.max(iM2657m, iMin) + iM2658n;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height() - (dialogC1051t.f4667y.getMeasuredHeight() - dialogC1051t.f4668z.getMeasuredHeight());
        if (iM2657m <= 0 || iMax > iHeight) {
            if (dialogC1051t.f4614G.getMeasuredHeight() + dialogC1051t.f4618K.getLayoutParams().height >= dialogC1051t.f4668z.getMeasuredHeight()) {
                dialogC1051t.f4608A.setVisibility(8);
            }
            iMax = iMin + iM2658n;
            iM2657m = 0;
        } else {
            dialogC1051t.f4608A.setVisibility(0);
            DialogC1051t.m2652p(dialogC1051t.f4608A, iM2657m);
        }
        if (!dialogC1051t.m2654j() || iMax > iHeight) {
            dialogC1051t.f4615H.setVisibility(8);
        } else {
            dialogC1051t.f4615H.setVisibility(0);
        }
        dialogC1051t.m2665v(dialogC1051t.f4615H.getVisibility() == 0);
        int iM2658n2 = dialogC1051t.m2658n(dialogC1051t.f4615H.getVisibility() == 0);
        int iMax2 = Math.max(iM2657m, iMin) + iM2658n2;
        if (iMax2 > iHeight) {
            iMin -= iMax2 - iHeight;
        } else {
            iHeight = iMax2;
        }
        dialogC1051t.f4614G.clearAnimation();
        dialogC1051t.f4618K.clearAnimation();
        dialogC1051t.f4668z.clearAnimation();
        boolean z3 = this.f4580g;
        if (z3) {
            dialogC1051t.m2653i(dialogC1051t.f4614G, iM2658n2);
            dialogC1051t.m2653i(dialogC1051t.f4618K, iMin);
            dialogC1051t.m2653i(dialogC1051t.f4668z, iHeight);
        } else {
            DialogC1051t.m2652p(dialogC1051t.f4614G, iM2658n2);
            DialogC1051t.m2652p(dialogC1051t.f4618K, iMin);
            DialogC1051t.m2652p(dialogC1051t.f4668z, iHeight);
        }
        DialogC1051t.m2652p(dialogC1051t.f4666x, rect.height());
        List listUnmodifiableList = Collections.unmodifiableList(c1403c.f6237v);
        if (listUnmodifiableList.isEmpty()) {
            dialogC1051t.f4620M.clear();
            dialogC1051t.f4619L.notifyDataSetChanged();
            return;
        }
        if (new HashSet(dialogC1051t.f4620M).equals(new HashSet(listUnmodifiableList))) {
            dialogC1051t.f4619L.notifyDataSetChanged();
            return;
        }
        if (z3) {
            OverlayListView overlayListView = dialogC1051t.f4618K;
            C1050s c1050s = dialogC1051t.f4619L;
            map = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i4 = 0; i4 < overlayListView.getChildCount(); i4++) {
                Object item = c1050s.getItem(firstVisiblePosition + i4);
                View childAt = overlayListView.getChildAt(i4);
                map.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            map = null;
        }
        if (z3) {
            OverlayListView overlayListView2 = dialogC1051t.f4618K;
            C1050s c1050s2 = dialogC1051t.f4619L;
            map2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i5 = 0; i5 < overlayListView2.getChildCount(); i5++) {
                Object item2 = c1050s2.getItem(firstVisiblePosition2 + i5);
                View childAt2 = overlayListView2.getChildAt(i5);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(bitmapCreateBitmap));
                map2.put(item2, new BitmapDrawable(dialogC1051t.f4652p.getResources(), bitmapCreateBitmap));
            }
        } else {
            map2 = null;
        }
        ArrayList arrayList = dialogC1051t.f4620M;
        HashSet hashSet = new HashSet(listUnmodifiableList);
        hashSet.removeAll(arrayList);
        dialogC1051t.f4621N = hashSet;
        HashSet hashSet2 = new HashSet(dialogC1051t.f4620M);
        hashSet2.removeAll(listUnmodifiableList);
        dialogC1051t.f4622O = hashSet2;
        dialogC1051t.f4620M.addAll(0, dialogC1051t.f4621N);
        dialogC1051t.f4620M.removeAll(dialogC1051t.f4622O);
        dialogC1051t.f4619L.notifyDataSetChanged();
        if (z3 && dialogC1051t.f4644k0) {
            if (dialogC1051t.f4622O.size() + dialogC1051t.f4621N.size() > 0) {
                dialogC1051t.f4618K.setEnabled(false);
                dialogC1051t.f4618K.requestLayout();
                dialogC1051t.f4645l0 = true;
                dialogC1051t.f4618K.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1044m(dialogC1051t, map, map2));
                return;
            }
        }
        dialogC1051t.f4621N = null;
        dialogC1051t.f4622O = null;
    }
}
