package p022H1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p028J1.C0296b;

/* JADX INFO: renamed from: H1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0265i implements InterfaceC0257a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f700g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0267k f701h;

    public /* synthetic */ C0265i(C0267k c0267k, int i3) {
        this.f700g = i3;
        this.f701h = c0267k;
    }

    @Override // p022H1.InterfaceC0257a
    /* JADX INFO: renamed from: i */
    public final void mo521i(Bitmap bitmap) {
        C0267k c0267k = this.f701h;
        switch (this.f700g) {
            case 0:
                C0296b c0296b = C0267k.f703v;
                Bitmap bitmap2 = null;
                if (bitmap != null) {
                    int width = bitmap.getWidth();
                    float f = width;
                    int height = bitmap.getHeight();
                    int i3 = (int) (((9.0f * f) / 16.0f) + 0.5f);
                    float f3 = (i3 - height) / 2.0f;
                    RectF rectF = new RectF(0.0f, f3, f, height + f3);
                    Bitmap.Config config = bitmap.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, i3, config);
                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
                    bitmap2 = bitmapCreateBitmap;
                }
                c0267k.m808e(bitmap2, 0);
                break;
            default:
                c0267k.m808e(bitmap, 3);
                break;
        }
    }
}
