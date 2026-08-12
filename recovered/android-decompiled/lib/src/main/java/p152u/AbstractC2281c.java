package p152u;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: u.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2281c {
    /* JADX INFO: renamed from: a */
    public static Uri m4896a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC2283e.m4904d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m4897b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    /* JADX INFO: renamed from: c */
    public static Icon m4898c(IconCompat iconCompat, Context context) {
        Icon iconCreateWithBitmap;
        String strM4902b;
        int i3;
        InputStream inputStreamOpenInputStream;
        switch (iconCompat.f3952a) {
            case -1:
                return (Icon) iconCompat.f3953b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f3953b);
                break;
            case 2:
                int i4 = iconCompat.f3952a;
                if (i4 == -1 && (i3 = Build.VERSION.SDK_INT) >= 23) {
                    Object obj = iconCompat.f3953b;
                    if (i3 >= 28) {
                        strM4902b = AbstractC2283e.m4902b(obj);
                    } else {
                        try {
                            strM4902b = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                            strM4902b = null;
                        } catch (NoSuchMethodException e4) {
                            Log.e("IconCompat", "Unable to get icon package", e4);
                            strM4902b = null;
                        } catch (InvocationTargetException e5) {
                            Log.e("IconCompat", "Unable to get icon package", e5);
                            strM4902b = null;
                        }
                    }
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str = iconCompat.f3961j;
                    strM4902b = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.f3953b).split(":", -1)[0] : iconCompat.f3961j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strM4902b, iconCompat.f3956e);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f3953b, iconCompat.f3956e, iconCompat.f3957f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f3953b);
                break;
            case 5:
                iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.m2361a((Bitmap) iconCompat.f3953b, false)) : AbstractC2282d.m4900b((Bitmap) iconCompat.f3953b);
                break;
            case 6:
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 30) {
                    iconCreateWithBitmap = AbstractC2284f.m4905a(iconCompat.m2364d());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m2364d());
                    }
                    Uri uriM2364d = iconCompat.m2364d();
                    String scheme = uriM2364d.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriM2364d);
                        } catch (Exception e6) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriM2364d, e6);
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.f3953b));
                        } catch (FileNotFoundException e7) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriM2364d, e7);
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m2364d());
                    }
                    if (i5 < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.m2361a(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                    } else {
                        iconCreateWithBitmap = AbstractC2282d.m4900b(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    }
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.f3958g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f3959h;
        if (mode != IconCompat.f3951k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }
}
