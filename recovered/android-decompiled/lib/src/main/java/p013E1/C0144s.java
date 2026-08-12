package p013E1;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p028J1.AbstractC0295a;
import p049Q1.AbstractC0512a;
import p057T1.AbstractC0600a;

/* JADX INFO: renamed from: E1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0144s extends AbstractC0512a {
    public static final Parcelable.Creator<C0144s> CREATOR = new C0147v(19);

    /* JADX INFO: renamed from: g */
    public float f327g;

    /* JADX INFO: renamed from: h */
    public int f328h;

    /* JADX INFO: renamed from: i */
    public int f329i;

    /* JADX INFO: renamed from: j */
    public int f330j;

    /* JADX INFO: renamed from: k */
    public int f331k;

    /* JADX INFO: renamed from: l */
    public int f332l;

    /* JADX INFO: renamed from: m */
    public int f333m;

    /* JADX INFO: renamed from: n */
    public int f334n;

    /* JADX INFO: renamed from: o */
    public String f335o;

    /* JADX INFO: renamed from: p */
    public int f336p;

    /* JADX INFO: renamed from: q */
    public int f337q;

    /* JADX INFO: renamed from: r */
    public String f338r;

    /* JADX INFO: renamed from: s */
    public JSONObject f339s;

    public C0144s(float f, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str, int i10, int i11, String str2) {
        this.f327g = f;
        this.f328h = i3;
        this.f329i = i4;
        this.f330j = i5;
        this.f331k = i6;
        this.f332l = i7;
        this.f333m = i8;
        this.f334n = i9;
        this.f335o = str;
        this.f336p = i10;
        this.f337q = i11;
        this.f338r = str2;
        if (str2 == null) {
            this.f339s = null;
            return;
        }
        try {
            this.f339s = new JSONObject(this.f338r);
        } catch (JSONException unused) {
            this.f339s = null;
            this.f338r = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final int m602f(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static final String m603g(int i3) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i3)), Integer.valueOf(Color.green(i3)), Integer.valueOf(Color.blue(i3)), Integer.valueOf(Color.alpha(i3)));
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m604e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.f327g);
            int i3 = this.f328h;
            if (i3 != 0) {
                jSONObject.put("foregroundColor", m603g(i3));
            }
            int i4 = this.f329i;
            if (i4 != 0) {
                jSONObject.put("backgroundColor", m603g(i4));
            }
            int i5 = this.f330j;
            if (i5 == 0) {
                jSONObject.put("edgeType", "NONE");
            } else if (i5 == 1) {
                jSONObject.put("edgeType", "OUTLINE");
            } else if (i5 == 2) {
                jSONObject.put("edgeType", "DROP_SHADOW");
            } else if (i5 == 3) {
                jSONObject.put("edgeType", "RAISED");
            } else if (i5 == 4) {
                jSONObject.put("edgeType", "DEPRESSED");
            }
            int i6 = this.f331k;
            if (i6 != 0) {
                jSONObject.put("edgeColor", m603g(i6));
            }
            int i7 = this.f332l;
            if (i7 == 0) {
                jSONObject.put("windowType", "NONE");
            } else if (i7 == 1) {
                jSONObject.put("windowType", "NORMAL");
            } else if (i7 == 2) {
                jSONObject.put("windowType", "ROUNDED_CORNERS");
            }
            int i8 = this.f333m;
            if (i8 != 0) {
                jSONObject.put("windowColor", m603g(i8));
            }
            if (this.f332l == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f334n);
            }
            String str = this.f335o;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f336p) {
                case 0:
                    jSONObject.put("fontGenericFamily", "SANS_SERIF");
                    break;
                case 1:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                case 2:
                    jSONObject.put("fontGenericFamily", "SERIF");
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                case 4:
                    jSONObject.put("fontGenericFamily", "CASUAL");
                    break;
                case 5:
                    jSONObject.put("fontGenericFamily", "CURSIVE");
                    break;
                case 6:
                    jSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
                    break;
            }
            int i9 = this.f337q;
            if (i9 == 0) {
                jSONObject.put("fontStyle", "NORMAL");
            } else if (i9 == 1) {
                jSONObject.put("fontStyle", "BOLD");
            } else if (i9 == 2) {
                jSONObject.put("fontStyle", "ITALIC");
            } else if (i9 == 3) {
                jSONObject.put("fontStyle", "BOLD_ITALIC");
            }
            JSONObject jSONObject2 = this.f339s;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0144s)) {
            return false;
        }
        C0144s c0144s = (C0144s) obj;
        JSONObject jSONObject = this.f339s;
        boolean z3 = jSONObject == null;
        JSONObject jSONObject2 = c0144s.f339s;
        if (z3 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || AbstractC0600a.m1464a(jSONObject, jSONObject2)) && this.f327g == c0144s.f327g && this.f328h == c0144s.f328h && this.f329i == c0144s.f329i && this.f330j == c0144s.f330j && this.f331k == c0144s.f331k && this.f332l == c0144s.f332l && this.f333m == c0144s.f333m && this.f334n == c0144s.f334n && AbstractC0295a.m828e(this.f335o, c0144s.f335o) && this.f336p == c0144s.f336p && this.f337q == c0144s.f337q;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f327g), Integer.valueOf(this.f328h), Integer.valueOf(this.f329i), Integer.valueOf(this.f330j), Integer.valueOf(this.f331k), Integer.valueOf(this.f332l), Integer.valueOf(this.f333m), Integer.valueOf(this.f334n), this.f335o, Integer.valueOf(this.f336p), Integer.valueOf(this.f337q), String.valueOf(this.f339s)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        JSONObject jSONObject = this.f339s;
        this.f338r = jSONObject == null ? null : jSONObject.toString();
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        float f = this.f327g;
        AbstractC1303m.m3311d0(parcel, 2, 4);
        parcel.writeFloat(f);
        int i4 = this.f328h;
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeInt(i4);
        int i5 = this.f329i;
        AbstractC1303m.m3311d0(parcel, 4, 4);
        parcel.writeInt(i5);
        int i6 = this.f330j;
        AbstractC1303m.m3311d0(parcel, 5, 4);
        parcel.writeInt(i6);
        int i7 = this.f331k;
        AbstractC1303m.m3311d0(parcel, 6, 4);
        parcel.writeInt(i7);
        int i8 = this.f332l;
        AbstractC1303m.m3311d0(parcel, 7, 4);
        parcel.writeInt(i8);
        int i9 = this.f333m;
        AbstractC1303m.m3311d0(parcel, 8, 4);
        parcel.writeInt(i9);
        int i10 = this.f334n;
        AbstractC1303m.m3311d0(parcel, 9, 4);
        parcel.writeInt(i10);
        AbstractC1303m.m3299V(parcel, 10, this.f335o);
        int i11 = this.f336p;
        AbstractC1303m.m3311d0(parcel, 11, 4);
        parcel.writeInt(i11);
        int i12 = this.f337q;
        AbstractC1303m.m3311d0(parcel, 12, 4);
        parcel.writeInt(i12);
        AbstractC1303m.m3299V(parcel, 13, this.f338r);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
