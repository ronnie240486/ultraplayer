package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p009D0.C0106b;
import p089d1.C1403C;

/* JADX INFO: renamed from: androidx.mediarouter.app.m */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1044m implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ HashMap f4586g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ HashMap f4587h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ DialogC1051t f4588i;

    public ViewTreeObserverOnGlobalLayoutListenerC1044m(DialogC1051t dialogC1051t, HashMap map, HashMap map2) {
        this.f4588i = dialogC1051t;
        this.f4586g = map;
        this.f4587h = map2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        HashMap map;
        HashMap map2;
        C1029P c1029p;
        DialogC1051t dialogC1051t = this.f4588i;
        dialogC1051t.f4618K.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = dialogC1051t.f4621N;
        if (hashSet == null || dialogC1051t.f4622O == null) {
            return;
        }
        int size = hashSet.size() - dialogC1051t.f4622O.size();
        AnimationAnimationListenerC1045n animationAnimationListenerC1045n = new AnimationAnimationListenerC1045n(0, dialogC1051t);
        int firstVisiblePosition = dialogC1051t.f4618K.getFirstVisiblePosition();
        int i3 = 0;
        boolean z3 = false;
        while (true) {
            int childCount = dialogC1051t.f4618K.getChildCount();
            map = this.f4586g;
            map2 = this.f4587h;
            if (i3 >= childCount) {
                break;
            }
            View childAt = dialogC1051t.f4618K.getChildAt(i3);
            C1403C c1403c = (C1403C) dialogC1051t.f4619L.getItem(firstVisiblePosition + i3);
            Rect rect = (Rect) map.get(c1403c);
            int top = childAt.getTop();
            int i4 = rect != null ? rect.top : (dialogC1051t.f4628U * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = dialogC1051t.f4621N;
            if (hashSet2 != null && hashSet2.contains(c1403c)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(dialogC1051t.f4651o0);
                animationSet.addAnimation(alphaAnimation);
                i4 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i4 - top, 0.0f);
            translateAnimation.setDuration(dialogC1051t.f4649n0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(dialogC1051t.f4655q0);
            if (!z3) {
                animationSet.setAnimationListener(animationAnimationListenerC1045n);
                z3 = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            map.remove(c1403c);
            map2.remove(c1403c);
            i3++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            C1403C c1403c2 = (C1403C) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(c1403c2);
            if (dialogC1051t.f4622O.contains(c1403c2)) {
                c1029p = new C1029P(bitmapDrawable, rect2);
                c1029p.f4519h = 0.0f;
                c1029p.f4516e = dialogC1051t.f4653p0;
                c1029p.f4515d = dialogC1051t.f4655q0;
            } else {
                int i5 = dialogC1051t.f4628U * size;
                C1029P c1029p2 = new C1029P(bitmapDrawable, rect2);
                c1029p2.f4518g = i5;
                c1029p2.f4516e = dialogC1051t.f4649n0;
                c1029p2.f4515d = dialogC1051t.f4655q0;
                c1029p2.f4523l = new C0106b((Object) dialogC1051t, (Object) c1403c2, 27, false);
                dialogC1051t.f4623P.add(c1403c2);
                c1029p = c1029p2;
            }
            dialogC1051t.f4618K.f4511g.add(c1029p);
        }
    }
}
