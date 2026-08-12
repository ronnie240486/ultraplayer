package p113k;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: k.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1846b extends Drawable {

    /* JADX INFO: renamed from: a */
    public final ActionBarContainer f8121a;

    public C1846b(ActionBarContainer actionBarContainer) {
        this.f8121a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f8121a;
        if (actionBarContainer.f3818m) {
            Drawable drawable = actionBarContainer.f3817l;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f3815j;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f3816k;
        if (drawable3 == null || !actionBarContainer.f3819n) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f8121a;
        if (actionBarContainer.f3818m) {
            if (actionBarContainer.f3817l != null) {
                actionBarContainer.f3815j.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f3815j;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
