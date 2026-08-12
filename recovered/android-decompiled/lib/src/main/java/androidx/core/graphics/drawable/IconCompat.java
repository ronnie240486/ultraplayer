package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import p152u.AbstractC2281c;
import p152u.AbstractC2283e;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f3951k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f3952a;

    /* JADX INFO: renamed from: b */
    public Object f3953b;

    /* JADX INFO: renamed from: c */
    public byte[] f3954c;

    /* JADX INFO: renamed from: d */
    public Parcelable f3955d;

    /* JADX INFO: renamed from: e */
    public int f3956e;

    /* JADX INFO: renamed from: f */
    public int f3957f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f3958g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f3959h;

    /* JADX INFO: renamed from: i */
    public String f3960i;

    /* JADX INFO: renamed from: j */
    public String f3961j;

    public IconCompat() {
        this.f3952a = -1;
        this.f3954c = null;
        this.f3955d = null;
        this.f3956e = 0;
        this.f3957f = 0;
        this.f3958g = null;
        this.f3959h = f3951k;
        this.f3960i = null;
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m2361a(Bitmap bitmap, boolean z3) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f3 = 0.5f * f;
        float f4 = 0.9166667f * f3;
        if (z3) {
            float f5 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public static IconCompat m2362b(Resources resources, String str, int i3) {
        str.getClass();
        if (i3 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f3956e = i3;
        if (resources != null) {
            try {
                iconCompat.f3953b = resources.getResourceName(i3);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f3953b = str;
        }
        iconCompat.f3961j = str;
        return iconCompat;
    }

    /* JADX INFO: renamed from: c */
    public final int m2363c() {
        int i3;
        int i4 = this.f3952a;
        if (i4 != -1 || (i3 = Build.VERSION.SDK_INT) < 23) {
            if (i4 == 2) {
                return this.f3956e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        Object obj = this.f3953b;
        if (i3 >= 28) {
            return AbstractC2283e.m4901a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (InvocationTargetException e5) {
            Log.e("IconCompat", "Unable to get icon resource", e5);
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Uri m2364d() {
        int i3 = this.f3952a;
        if (i3 == -1 && Build.VERSION.SDK_INT >= 23) {
            return AbstractC2281c.m4896a(this.f3953b);
        }
        if (i3 == 4 || i3 == 6) {
            return Uri.parse((String) this.f3953b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* JADX INFO: renamed from: e */
    public final Icon m2365e(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC2281c.m4898c(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public final String toString() {
        String str;
        if (this.f3952a == -1) {
            return String.valueOf(this.f3953b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f3952a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f3952a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3953b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f3953b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f3961j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m2363c())));
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                sb.append(" len=");
                sb.append(this.f3956e);
                if (this.f3957f != 0) {
                    sb.append(" off=");
                    sb.append(this.f3957f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3953b);
                break;
        }
        if (this.f3958g != null) {
            sb.append(" tint=");
            sb.append(this.f3958g);
        }
        if (this.f3959h != f3951k) {
            sb.append(" mode=");
            sb.append(this.f3959h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i3) {
        this.f3954c = null;
        this.f3955d = null;
        this.f3956e = 0;
        this.f3957f = 0;
        this.f3958g = null;
        this.f3959h = f3951k;
        this.f3960i = null;
        this.f3952a = i3;
    }
}
