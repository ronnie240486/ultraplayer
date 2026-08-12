package p028J1;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: J1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0295a {

    /* JADX INFO: renamed from: a */
    public static final Pattern f786a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");

    /* JADX INFO: renamed from: b */
    public static final Random f787b = new Random(SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: a */
    public static JSONObject m824a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m825b(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m826c(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Namespace cannot be null or empty");
        }
        if (str.length() > 128) {
            throw new IllegalArgumentException("Invalid namespace length");
        }
        if (!str.startsWith("urn:x-cast:")) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        }
        if (str.length() == 11) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m827d(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i3 : iArr) {
            arrayList.add(Integer.valueOf(i3));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m828e(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public static int[] m829f(AbstractCollection abstractCollection) {
        int[] iArr = new int[abstractCollection.size()];
        Iterator it = abstractCollection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            iArr[i3] = ((Integer) it.next()).intValue();
            i3++;
        }
        return iArr;
    }
}
