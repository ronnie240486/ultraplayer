package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;
import p060U1.AbstractC0610a;

/* JADX INFO: renamed from: androidx.mediarouter.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC1032a extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public final int f4524a;

    /* JADX INFO: renamed from: b */
    public final Context f4525b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1033b f4526c;

    public AsyncTaskC1032a(C1033b c1033b, int i3, Context context) {
        this.f4526c = c1033b;
        this.f4524a = i3;
        this.f4525b = context;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        SparseArray sparseArray = C1033b.f4527v;
        int i3 = this.f4524a;
        if (((Drawable.ConstantState) sparseArray.get(i3)) == null) {
            return AbstractC0610a.m1512n(this.f4525b, i3);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            C1033b.f4527v.put(this.f4524a, drawable.getConstantState());
        }
        this.f4526c.f4536m = null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Drawable drawableNewDrawable = (Drawable) obj;
        int i3 = this.f4524a;
        C1033b c1033b = this.f4526c;
        if (drawableNewDrawable != null) {
            C1033b.f4527v.put(i3, drawableNewDrawable.getConstantState());
            c1033b.f4536m = null;
        } else {
            Drawable.ConstantState constantState = (Drawable.ConstantState) C1033b.f4527v.get(i3);
            if (constantState != null) {
                drawableNewDrawable = constantState.newDrawable();
            }
            c1033b.f4536m = null;
        }
        c1033b.setRemoteIndicatorDrawableInternal(drawableNewDrawable);
    }
}
