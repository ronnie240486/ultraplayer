package p148t;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p066W1.AbstractC0664e;
import p144s.C2212f;
import p144s.C2213g;
import p160x.C2348g;

/* JADX INFO: renamed from: t.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2273l extends AbstractC0664e {
    /* JADX INFO: renamed from: f0 */
    public static Font m4880f0(FontFamily fontFamily, int i3) {
        FontStyle fontStyle = new FontStyle((i3 & 1) != 0 ? 700 : 400, (i3 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM4881g0 = m4881g0(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int iM4881g1 = m4881g0(fontStyle, font2.getStyle());
            if (iM4881g1 < iM4881g0) {
                font = font2;
                iM4881g0 = iM4881g1;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: g0 */
    public static int m4881g0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: l */
    public final Typeface mo1770l(Context context, C2212f c2212f, Resources resources, int i3) {
        try {
            FontFamily.Builder builder = null;
            for (C2213g c2213g : c2212f.f9514a) {
                try {
                    Font fontBuild = new Font.Builder(resources, c2213g.f9520f).setWeight(c2213g.f9516b).setSlant(c2213g.f9517c ? 1 : 0).setTtcIndex(c2213g.f9519e).setFontVariationSettings(c2213g.f9518d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m4880f0(fontFamilyBuild, i3).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: m */
    public final Typeface mo1771m(Context context, C2348g[] c2348gArr, int i3) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C2348g c2348g : c2348gArr) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c2348g.f9860a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                        }
                    } else {
                        try {
                            Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c2348g.f9862c).setSlant(c2348g.f9863d ? 1 : 0).setTtcIndex(c2348g.f9861b).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(fontBuild);
                            } else {
                                builder.addFont(fontBuild);
                            }
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            if (builder != null) {
                FontFamily fontFamilyBuild = builder.build();
                return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m4880f0(fontFamilyBuild, i3).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: n */
    public final Typeface mo1772n(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: o */
    public final Typeface mo1773o(Context context, Resources resources, int i3, String str, int i4) {
        try {
            Font fontBuild = new Font.Builder(resources, i3).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p066W1.AbstractC0664e
    /* JADX INFO: renamed from: y */
    public final C2348g mo1774y(C2348g[] c2348gArr, int i3) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
