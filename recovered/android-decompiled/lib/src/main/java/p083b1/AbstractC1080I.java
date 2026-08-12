package p083b1;

import android.text.Html;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: b1.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1080I {

    /* JADX INFO: renamed from: a */
    public static final Pattern f4928a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: renamed from: a */
    public static String m2922a(CharSequence charSequence) {
        return f4928a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
