package p136q;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import p152u.AbstractC2283e;

/* JADX INFO: renamed from: q.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2125h {

    /* JADX INFO: renamed from: a */
    public final Bundle f9175a;

    /* JADX INFO: renamed from: b */
    public IconCompat f9176b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2139v[] f9177c;

    /* JADX INFO: renamed from: d */
    public final boolean f9178d;

    /* JADX INFO: renamed from: e */
    public final boolean f9179e;

    /* JADX INFO: renamed from: f */
    public final int f9180f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f9181g;

    /* JADX INFO: renamed from: h */
    public final PendingIntent f9182h;

    public C2125h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, AbstractC2139v[] abstractC2139vArr, AbstractC2139v[] abstractC2139vArr2, boolean z3, boolean z4) {
        int i3;
        this.f9179e = true;
        this.f9176b = iconCompat;
        if (iconCompat != null) {
            int iIntValue = iconCompat.f3952a;
            if (iIntValue == -1 && (i3 = Build.VERSION.SDK_INT) >= 23) {
                Object obj = iconCompat.f3953b;
                if (i3 >= 28) {
                    iIntValue = AbstractC2283e.m4903c(obj);
                } else {
                    try {
                        iIntValue = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                    } catch (IllegalAccessException e3) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                        iIntValue = -1;
                    } catch (NoSuchMethodException e4) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                        iIntValue = -1;
                    } catch (InvocationTargetException e5) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e5);
                        iIntValue = -1;
                    }
                }
            }
            if (iIntValue == 2) {
                this.f9180f = iconCompat.m2363c();
            }
        }
        this.f9181g = C2127j.m4668b(charSequence);
        this.f9182h = pendingIntent;
        this.f9175a = bundle == null ? new Bundle() : bundle;
        this.f9177c = abstractC2139vArr;
        this.f9178d = z3;
        this.f9179e = z4;
    }
}
