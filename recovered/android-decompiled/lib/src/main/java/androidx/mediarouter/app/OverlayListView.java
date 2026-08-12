package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import p009D0.C0106b;
import p089d1.C1403C;

/* JADX INFO: loaded from: classes.dex */
final class OverlayListView extends ListView {

    /* JADX INFO: renamed from: g */
    public final ArrayList f4511g;

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4511g = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z3;
        super.onDraw(canvas);
        ArrayList arrayList = this.f4511g;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1029P c1029p = (C1029P) it.next();
                BitmapDrawable bitmapDrawable = c1029p.f4512a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                if (c1029p.f4522k) {
                    z3 = false;
                } else {
                    float fMax = c1029p.f4521j ? Math.max(0.0f, Math.min(1.0f, (drawingTime - c1029p.f4520i) / c1029p.f4516e)) : 0.0f;
                    Interpolator interpolator = c1029p.f4515d;
                    float interpolation = interpolator == null ? fMax : interpolator.getInterpolation(fMax);
                    int i3 = (int) (c1029p.f4518g * interpolation);
                    Rect rect = c1029p.f4517f;
                    int i4 = rect.top + i3;
                    Rect rect2 = c1029p.f4514c;
                    rect2.top = i4;
                    rect2.bottom = rect.bottom + i3;
                    float f = ((c1029p.f4519h - 1.0f) * interpolation) + 1.0f;
                    c1029p.f4513b = f;
                    BitmapDrawable bitmapDrawable2 = c1029p.f4512a;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (f * 255.0f));
                        bitmapDrawable2.setBounds(rect2);
                    }
                    if (c1029p.f4521j && fMax >= 1.0f) {
                        c1029p.f4522k = true;
                        C0106b c0106b = c1029p.f4523l;
                        if (c0106b != null) {
                            DialogC1051t dialogC1051t = (DialogC1051t) c0106b.f141i;
                            dialogC1051t.f4623P.remove((C1403C) c0106b.f140h);
                            dialogC1051t.f4619L.notifyDataSetChanged();
                        }
                    }
                    z3 = !c1029p.f4522k;
                }
                if (!z3) {
                    it.remove();
                }
            }
        }
    }
}
