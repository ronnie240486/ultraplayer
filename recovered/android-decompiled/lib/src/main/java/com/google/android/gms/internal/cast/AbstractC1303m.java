package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.zuxoplayer.app.R;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p014F.AbstractC0165n;
import p014F.AbstractC0166o;
import p014F.AbstractC0167p;
import p014F.ActionModeCallbackC0169r;
import p019G1.AbstractC0230e;
import p023I.C0270b;
import p060U1.AbstractC0610a;
import p064W.C0651s;
import p112j2.AbstractC1791d;
import p113k.C1847b0;
import p115k2.AbstractC1969c;
import p115k2.C1968b;
import p122m1.AbstractC2003a;
import p148t.AbstractC2262a;
import p152u.AbstractC2279a;
import p164y.C2370d;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.m */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1303m {

    /* JADX INFO: renamed from: h */
    public static Boolean f5925h;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5926g;

    public /* synthetic */ AbstractC1303m(int i3) {
        this.f5926g = i3;
    }

    /* JADX INFO: renamed from: B */
    public static C0270b m3279B(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j3;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i3 = byteBufferDuplicate.getShort() & 65535;
        if (i3 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                j3 = -1;
                break;
            }
            int i5 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i5) {
                break;
            }
            i4++;
        }
        if (j3 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j3 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i6 = 0; i6 < j4; i6++) {
                int i7 = byteBufferDuplicate.getInt();
                long j5 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i7 || 1701669481 == i7) {
                    byteBufferDuplicate.position((int) (j5 + j3));
                    C0270b c0270b = new C0270b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c0270b.f5d = byteBufferDuplicate;
                    c0270b.f2a = iPosition;
                    int i8 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c0270b.f3b = i8;
                    c0270b.f4c = ((ByteBuffer) c0270b.f5d).getShort(i8);
                    return c0270b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: C */
    public static long m3280C(C0651s c0651s, int i3, int i4) {
        c0651s.m1665G(i3);
        if (c0651s.m1667a() < 5) {
            return -9223372036854775807L;
        }
        int iM1673g = c0651s.m1673g();
        if ((8388608 & iM1673g) != 0 || ((2096896 & iM1673g) >> 8) != i4 || (iM1673g & 32) == 0 || c0651s.m1687u() < 7 || c0651s.m1667a() < 7 || (c0651s.m1687u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c0651s.m1671e(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    /* JADX INFO: renamed from: D */
    public static int m3281D(long j3) {
        if (j3 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j3 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j3;
    }

    /* JADX INFO: renamed from: E */
    public static long m3282E(long j3, long j4) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j4) + Long.numberOfLeadingZeros(j4) + Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3);
        if (iNumberOfLeadingZeros > 65) {
            return j3 * j4;
        }
        long j5 = ((j3 ^ j4) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j4 == Long.MIN_VALUE) & (j3 < 0)))) {
            long j6 = j3 * j4;
            if (j3 == 0 || j6 / j3 == j4) {
                return j6;
            }
        }
        return j5;
    }

    /* JADX INFO: renamed from: F */
    public static void m3283F(TextView textView, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0167p.m644d(textView, i3);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i3 > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), i3 + i4, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m3284G(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(AbstractC0230e.m739q(context, m3330w(context) ? R.color.mr_cast_progressbar_progress_and_thumb_light : R.color.mr_cast_progressbar_progress_and_thumb_dark), PorterDuff.Mode.SRC_IN);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m3285H(TextView textView, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i3 > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i3 - i4);
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m3286I(TextView textView, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i3 != fontMetricsInt) {
            textView.setLineSpacing(i3 - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: J */
    public static int[] m3287J(Collection collection) {
        if (collection instanceof C1968b) {
            C1968b c1968b = (C1968b) collection;
            return Arrays.copyOfRange(c1968b.f8594g, c1968b.f8595h, c1968b.f8596i);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            Object obj = array[i3];
            obj.getClass();
            iArr[i3] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: K */
    public static String m3288K(String str) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i3 < length) {
                    char c = charArray[i3];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i3] = (char) (c ^ ' ');
                    }
                    i3++;
                }
                return String.valueOf(charArray);
            }
            i3++;
        }
        return str;
    }

    /* JADX INFO: renamed from: L */
    public static String m3289L(String str) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i3 < length) {
                    char c = charArray[i3];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i3] = (char) (c ^ ' ');
                    }
                    i3++;
                }
                return String.valueOf(charArray);
            }
            i3++;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000d  */
    /* JADX INFO: renamed from: M */
    public static Integer m3290M(String str) {
        byte b3;
        Long lValueOf;
        byte b4;
        str.getClass();
        if (!str.isEmpty()) {
            int i3 = str.charAt(0) == '-' ? 1 : 0;
            if (i3 != str.length()) {
                int i4 = i3 + 1;
                char cCharAt = str.charAt(i3);
                if (cCharAt < 128) {
                    b3 = AbstractC1969c.f8597a[cCharAt];
                } else {
                    byte[] bArr = AbstractC1969c.f8597a;
                    b3 = -1;
                }
                if (b3 >= 0 && b3 < 10) {
                    long j3 = -b3;
                    long j4 = 10;
                    long j5 = Long.MIN_VALUE / j4;
                    while (true) {
                        if (i4 >= str.length()) {
                            if (i3 == 0) {
                                if (j3 != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j3);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j3);
                            break;
                        }
                        int i5 = i4 + 1;
                        char cCharAt2 = str.charAt(i4);
                        if (cCharAt2 < 128) {
                            b4 = AbstractC1969c.f8597a[cCharAt2];
                        } else {
                            byte[] bArr2 = AbstractC1969c.f8597a;
                            b4 = -1;
                        }
                        if (b4 >= 0 && b4 < 10 && j3 >= j5) {
                            long j6 = j3 * j4;
                            int i6 = i3;
                            long j7 = b4;
                            if (j6 >= j7 - Long.MIN_VALUE) {
                                j3 = j6 - j7;
                                i4 = i5;
                                i3 = i6;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    /* JADX INFO: renamed from: N */
    public static ActionMode.Callback m3291N(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC0169r) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC0169r) callback).f390a;
    }

    /* JADX INFO: renamed from: O */
    public static ActionMode.Callback m3292O(ActionMode.Callback callback, TextView textView) {
        int i3 = Build.VERSION.SDK_INT;
        return (i3 < 26 || i3 > 27 || (callback instanceof ActionModeCallbackC0169r) || callback == null) ? callback : new ActionModeCallbackC0169r(callback, textView);
    }

    /* JADX INFO: renamed from: P */
    public static void m3293P(Parcel parcel, int i3, Boolean bool) {
        if (bool == null) {
            return;
        }
        m3311d0(parcel, i3, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    /* JADX INFO: renamed from: Q */
    public static void m3294Q(Parcel parcel, int i3, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iM3305a0 = m3305a0(parcel, i3);
        parcel.writeBundle(bundle);
        m3309c0(parcel, iM3305a0);
    }

    /* JADX INFO: renamed from: R */
    public static void m3295R(Parcel parcel, int i3, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iM3305a0 = m3305a0(parcel, i3);
        parcel.writeStrongBinder(iBinder);
        m3309c0(parcel, iM3305a0);
    }

    /* JADX INFO: renamed from: S */
    public static void m3296S(Parcel parcel, int i3, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iM3305a0 = m3305a0(parcel, i3);
        parcel.writeIntArray(iArr);
        m3309c0(parcel, iM3305a0);
    }

    /* JADX INFO: renamed from: T */
    public static void m3297T(Parcel parcel, int i3, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int iM3305a0 = m3305a0(parcel, i3);
        parcel.writeLongArray(jArr);
        m3309c0(parcel, iM3305a0);
    }

    /* JADX INFO: renamed from: U */
    public static void m3298U(Parcel parcel, int i3, Parcelable parcelable, int i4) {
        if (parcelable == null) {
            return;
        }
        int iM3305a0 = m3305a0(parcel, i3);
        parcelable.writeToParcel(parcel, i4);
        m3309c0(parcel, iM3305a0);
    }

    /* JADX INFO: renamed from: V */
    public static void m3299V(Parcel parcel, int i3, String str) {
        if (str == null) {
            return;
        }
        int iM3305a0 = m3305a0(parcel, i3);
        parcel.writeString(str);
        m3309c0(parcel, iM3305a0);
    }

    /* JADX INFO: renamed from: W */
    public static void m3300W(Parcel parcel, int i3, List list) {
        if (list == null) {
            return;
        }
        int iM3305a0 = m3305a0(parcel, i3);
        parcel.writeStringList(list);
        m3309c0(parcel, iM3305a0);
    }

    /* JADX INFO: renamed from: X */
    public static void m3301X(Parcel parcel, int i3, Parcelable[] parcelableArr, int i4) {
        if (parcelableArr == null) {
            return;
        }
        int iM3305a0 = m3305a0(parcel, i3);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i4);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m3309c0(parcel, iM3305a0);
    }

    /* JADX INFO: renamed from: Y */
    public static void m3302Y(Parcel parcel, int i3, List list) {
        if (list == null) {
            return;
        }
        int iM3305a0 = m3305a0(parcel, i3);
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            Parcelable parcelable = (Parcelable) list.get(i4);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m3309c0(parcel, iM3305a0);
    }

    /* JADX INFO: renamed from: Z */
    public static void m3303Z(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m3304a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public static int m3305a0(Parcel parcel, int i3) {
        parcel.writeInt(i3 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX INFO: renamed from: b */
    public static void m3306b(SpannableStringBuilder spannableStringBuilder, Object obj, int i3, int i4) {
        for (Object obj2 : spannableStringBuilder.getSpans(i3, i4, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i3 && spannableStringBuilder.getSpanEnd(obj2) == i4 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i3, i4, 33);
    }

    /* JADX INFO: renamed from: b0 */
    public static String m3307b0(Integer num) {
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return "REPEAT_OFF";
        }
        if (iIntValue == 1) {
            return "REPEAT_ALL";
        }
        if (iIntValue == 2) {
            return "REPEAT_SINGLE";
        }
        if (iIntValue != 3) {
            return null;
        }
        return "REPEAT_ALL_AND_SHUFFLE";
    }

    /* JADX INFO: renamed from: c */
    public static List m3308c(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new C1968b(0, iArr.length, iArr);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m3309c0(Parcel parcel, int i3) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i3 - 4);
        parcel.writeInt(iDataPosition - i3);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX INFO: renamed from: d */
    public static long m3310d(long j3, long j4) {
        long j5 = j3 + j4;
        if (((j3 ^ j4) < 0) || ((j3 ^ j5) >= 0)) {
            return j5;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + j3 + ", " + j4 + ")");
    }

    /* JADX INFO: renamed from: d0 */
    public static void m3311d0(Parcel parcel, int i3, int i4) {
        parcel.writeInt(i3 | (i4 << 16));
    }

    /* JADX INFO: renamed from: e */
    public static int m3312e(long j3) {
        int i3 = (int) j3;
        AbstractC0230e.m728f(((long) i3) == j3, "Out of range: %s", j3);
        return i3;
    }

    /* JADX INFO: renamed from: f */
    public static void m3313f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m3314g(File file, Resources resources, int i3) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i3);
            try {
                boolean zM3315h = m3315h(file, inputStreamOpenRawResource);
                m3313f(inputStreamOpenRawResource);
                return zM3315h;
            } catch (Throwable th) {
                th = th;
                m3313f(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m3315h(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i3 = inputStream.read(bArr);
                        if (i3 == -1) {
                            m3313f(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i3);
                    }
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m3313f(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    m3313f(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public static ContextThemeWrapper m3316i(Context context, boolean z3) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, m3328u(context, !z3 ? R.attr.dialogTheme : R.attr.alertDialogTheme));
        return m3328u(contextThemeWrapper, R.attr.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, m3324q(contextThemeWrapper)) : contextThemeWrapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m3317j(long j3, long j4, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j5 = j3 / j4;
        long j6 = j3 - (j4 * j5);
        if (j6 != 0) {
            int i3 = ((int) ((j3 ^ j4) >> 63)) | 1;
            switch (AbstractC1791d.f7982a[roundingMode.ordinal()]) {
                case 1:
                    if (j6 != 0) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                case 2:
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    break;
                case 4:
                    return j5 + ((long) i3);
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                    long jAbs = Math.abs(j6);
                    long jAbs2 = jAbs - (Math.abs(j4) - jAbs);
                    return jAbs2 != 0 ? j5 : j5;
                default:
                    throw new AssertionError();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m3318k(String str, String str2) {
        char c;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = str.charAt(i3);
                char cCharAt2 = str2.charAt(i3);
                if (cCharAt == cCharAt2 || ((c = (char) ((cCharAt | ' ') - 97)) < 26 && c == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static int m3319l(byte[] bArr) {
        boolean z3 = bArr.length >= 4;
        int length = bArr.length;
        if (!z3) {
            throw new IllegalArgumentException(AbstractC0610a.m1523z("array too small: %s < %s", Integer.valueOf(length), 4));
        }
        return (bArr[3] & 255) | ((bArr[2] & 255) << 8) | (bArr[0] << 24) | ((bArr[1] & 255) << 16);
    }

    /* JADX INFO: renamed from: m */
    public static long m3320m(long j3, long j4) {
        AbstractC2003a.m4533d(j3, "a");
        AbstractC2003a.m4533d(j4, "b");
        if (j3 == 0) {
            return j4;
        }
        if (j4 == 0) {
            return j3;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
        long jNumberOfTrailingZeros = j3 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j4);
        long j5 = j4 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j5) {
            long j6 = jNumberOfTrailingZeros - j5;
            long j7 = (j6 >> 63) & j6;
            long j8 = (j6 - j7) - j7;
            j5 += j7;
            jNumberOfTrailingZeros = j8 >> Long.numberOfTrailingZeros(j8);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    /* JADX INFO: renamed from: n */
    public static int m3321n(Context context) {
        return AbstractC2262a.m4855c(-1, m3327t(context, R.attr.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    /* JADX INFO: renamed from: o */
    public static float m3322o(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    /* JADX INFO: renamed from: p */
    public static Drawable m3323p(Context context, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i3});
        Drawable drawableM4548u = AbstractC2003a.m4548u(AbstractC0610a.m1512n(context, typedArrayObtainStyledAttributes.getResourceId(0, 0)));
        if (m3330w(context)) {
            AbstractC2279a.m4891g(drawableM4548u, AbstractC0230e.m739q(context, R.color.mr_dynamic_dialog_icon_light));
        }
        typedArrayObtainStyledAttributes.recycle();
        return drawableM4548u;
    }

    /* JADX INFO: renamed from: q */
    public static int m3324q(ContextThemeWrapper contextThemeWrapper) {
        if (m3330w(contextThemeWrapper)) {
            return m3321n(contextThemeWrapper) == -570425344 ? R.style.Theme_MediaRouter_Light : R.style.Theme_MediaRouter_Light_DarkControlPanel;
        }
        return m3321n(contextThemeWrapper) == -570425344 ? R.style.Theme_MediaRouter_LightControlPanel : R.style.Theme_MediaRouter;
    }

    /* JADX INFO: renamed from: r */
    public static File m3325r(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i3 = 0; i3 < 100; i3++) {
            File file = new File(cacheDir, str + i3);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static C2370d m3326s(C1847b0 c1847b0) {
        int iM632a;
        int iM635d;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            return new C2370d(AbstractC0167p.m643c(c1847b0));
        }
        TextPaint textPaint = new TextPaint(c1847b0.getPaint());
        if (i3 >= 23) {
            iM632a = 1;
            iM635d = 1;
        } else {
            iM632a = 0;
            iM635d = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i3 >= 23) {
            iM632a = AbstractC0165n.m632a(c1847b0);
            iM635d = AbstractC0165n.m635d(c1847b0);
        }
        if (c1847b0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i3 < 28 || (c1847b0.getInputType() & 15) != 3) {
            boolean z3 = c1847b0.getLayoutDirection() == 1;
            switch (c1847b0.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z3) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(AbstractC0167p.m642b(AbstractC0166o.m640a(c1847b0.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C2370d(textPaint, textDirectionHeuristic, iM632a, iM635d);
    }

    /* JADX INFO: renamed from: t */
    public static int m3327t(Context context, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i3, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    /* JADX INFO: renamed from: u */
    public static int m3328u(Context context, int i3) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i3, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    /* JADX INFO: renamed from: v */
    public static int m3329v(int i3, int i4, int i5, int[] iArr) {
        while (i4 < i5) {
            if (iArr[i4] == i3) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m3330w(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX INFO: renamed from: x */
    public static Integer m3331x(String str) {
        byte b3;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "REPEAT_ALL_AND_SHUFFLE":
                b3 = 3;
                break;
            case "REPEAT_SINGLE":
                b3 = 2;
                break;
            case "REPEAT_ALL":
                b3 = 1;
                break;
            case "REPEAT_OFF":
                b3 = 0;
                break;
            default:
                b3 = -1;
                break;
        }
        if (b3 == 0) {
            return 0;
        }
        if (b3 == 1) {
            return 1;
        }
        if (b3 != 2) {
            return b3 != 3 ? null : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: y */
    public static String m3332y(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i3 = 0; i3 < str.length(); i3++) {
            sb.append(str.charAt(i3));
            if (str2.length() > i3) {
                sb.append(str2.charAt(i3));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: z */
    public static MappedByteBuffer m3333z(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract Object mo2549A(int i3, Intent intent);

    public String toString() {
        switch (this.f5926g) {
            case 11:
                return ((ScheduledFutureC1207N1) this).f5664i.toString();
            default:
                return super.toString();
        }
    }
}
