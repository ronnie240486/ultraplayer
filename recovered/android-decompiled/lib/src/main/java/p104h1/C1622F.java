package p104h1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: h1.F */
/* JADX INFO: loaded from: classes.dex */
public class C1622F extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public AbstractC1635T f7364a;

    /* JADX INFO: renamed from: b */
    public final Rect f7365b;

    /* JADX INFO: renamed from: c */
    public boolean f7366c;

    /* JADX INFO: renamed from: d */
    public boolean f7367d;

    public C1622F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7365b = new Rect();
        this.f7366c = true;
        this.f7367d = false;
    }

    public C1622F(int i3, int i4) {
        super(i3, i4);
        this.f7365b = new Rect();
        this.f7366c = true;
        this.f7367d = false;
    }

    public C1622F(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f7365b = new Rect();
        this.f7366c = true;
        this.f7367d = false;
    }

    public C1622F(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7365b = new Rect();
        this.f7366c = true;
        this.f7367d = false;
    }

    public C1622F(C1622F c1622f) {
        super((ViewGroup.LayoutParams) c1622f);
        this.f7365b = new Rect();
        this.f7366c = true;
        this.f7367d = false;
    }
}
