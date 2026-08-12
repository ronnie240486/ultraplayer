package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p087d.AbstractC1376a;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: g */
    public final int f3780g;

    /* JADX INFO: renamed from: h */
    public final int f3781h;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1376a.f6114t);
        this.f3781h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f3780g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
