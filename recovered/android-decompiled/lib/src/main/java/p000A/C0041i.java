package p000A;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import p036M0.C0384u;
import p045P0.C0455a;
import p049Q1.C0513b;
import p055T.AbstractC0558V;
import p055T.C0567c;
import p055T.C0585q;
import p055T.InterfaceC0551N;
import p061V.AbstractC0616d;
import p061V.C0614b;
import p061V.C0617e;
import p061V.C0619g;
import p061V.C0620h;
import p061V.C0621i;
import p064W.AbstractC0646n;
import p064W.C0653u;
import p064W.InterfaceC0642j;
import p077a0.C0839o;
import p082b0.C1064e;
import p082b0.C1069j;
import p101g2.InterfaceC1583d;

/* JADX INFO: renamed from: A.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0041i implements InterfaceC1583d, InterfaceC0642j {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f53g;

    public /* synthetic */ C0041i(int i3) {
        this.f53g = i3;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:94:0x0311  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36, types: [android.text.Spannable, android.text.SpannableString] */
    @Override // p101g2.InterfaceC1583d
    public Object apply(Object obj) {
        ?? r18;
        Bitmap bitmap;
        float f;
        int i3;
        int i4;
        float f3;
        boolean z3;
        int i5;
        int i6 = 3;
        int i7 = 2;
        int i8 = 1;
        switch (this.f53g) {
            case 4:
                return (C0384u) obj;
            case 5:
                Bundle bundle = (Bundle) obj;
                ?? charSequence = bundle.getCharSequence(C0614b.f2346r);
                if (charSequence != 0) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(C0614b.f2347s);
                    if (parcelableArrayList != null) {
                        charSequence = SpannableString.valueOf(charSequence);
                        int size = parcelableArrayList.size();
                        int i9 = 0;
                        while (i9 < size) {
                            Object obj2 = parcelableArrayList.get(i9);
                            i9 += i8;
                            Bundle bundle2 = (Bundle) obj2;
                            int i10 = bundle2.getInt(AbstractC0616d.f2374a);
                            int i11 = bundle2.getInt(AbstractC0616d.f2375b);
                            int i12 = bundle2.getInt(AbstractC0616d.f2376c);
                            int i13 = bundle2.getInt(AbstractC0616d.f2377d, -1);
                            Bundle bundle3 = bundle2.getBundle(AbstractC0616d.f2378e);
                            if (i13 == i8) {
                                bundle3.getClass();
                                String string = bundle3.getString(C0619g.f2379c);
                                string.getClass();
                                charSequence.setSpan(new C0619g(bundle3.getInt(C0619g.f2380d), string), i10, i11, i12);
                            } else if (i13 == i7) {
                                bundle3.getClass();
                                charSequence.setSpan(new C0620h(bundle3.getInt(C0620h.f2383d), bundle3.getInt(C0620h.f2384e), bundle3.getInt(C0620h.f2385f)), i10, i11, i12);
                            } else if (i13 == i6) {
                                charSequence.setSpan(new C0617e(), i10, i11, i12);
                            } else if (i13 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(C0621i.f2389b);
                                string2.getClass();
                                charSequence.setSpan(new C0621i(string2), i10, i11, i12);
                            }
                            i6 = 3;
                            i7 = 2;
                            i8 = 1;
                        }
                    }
                    r18 = charSequence;
                } else {
                    r18 = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(C0614b.f2348t);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(C0614b.f2349u);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmapDecodeByteArray = (Bitmap) bundle.getParcelable(C0614b.f2350v);
                if (bitmapDecodeByteArray == null) {
                    byte[] byteArray = bundle.getByteArray(C0614b.f2351w);
                    if (byteArray != null) {
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                        bitmap = bitmapDecodeByteArray;
                    } else {
                        bitmap = null;
                    }
                } else {
                    bitmap = bitmapDecodeByteArray;
                }
                String str = C0614b.f2352x;
                if (bundle.containsKey(str)) {
                    String str2 = C0614b.f2353y;
                    if (bundle.containsKey(str2)) {
                        f = bundle.getFloat(str);
                        i3 = bundle.getInt(str2);
                    } else {
                        f = -3.4028235E38f;
                        i3 = Integer.MIN_VALUE;
                    }
                } else {
                    f = -3.4028235E38f;
                    i3 = Integer.MIN_VALUE;
                }
                String str3 = C0614b.f2354z;
                int i14 = bundle.containsKey(str3) ? bundle.getInt(str3) : Integer.MIN_VALUE;
                String str4 = C0614b.f2336A;
                float f4 = bundle.containsKey(str4) ? bundle.getFloat(str4) : -3.4028235E38f;
                String str5 = C0614b.f2337B;
                int i15 = bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
                String str6 = C0614b.f2339D;
                if (bundle.containsKey(str6)) {
                    String str7 = C0614b.f2338C;
                    if (bundle.containsKey(str7)) {
                        f3 = bundle.getFloat(str6);
                        i4 = bundle.getInt(str7);
                    } else {
                        i4 = Integer.MIN_VALUE;
                        f3 = -3.4028235E38f;
                    }
                } else {
                    i4 = Integer.MIN_VALUE;
                    f3 = -3.4028235E38f;
                }
                String str8 = C0614b.f2340E;
                float f5 = bundle.containsKey(str8) ? bundle.getFloat(str8) : -3.4028235E38f;
                String str9 = C0614b.f2341F;
                float f6 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
                String str10 = C0614b.f2342G;
                if (bundle.containsKey(str10)) {
                    i5 = bundle.getInt(str10);
                    z3 = true;
                } else {
                    z3 = false;
                    i5 = -16777216;
                }
                boolean z4 = !bundle.getBoolean(C0614b.f2343H, false) ? false : z3;
                String str11 = C0614b.f2344I;
                int i16 = bundle.containsKey(str11) ? bundle.getInt(str11) : Integer.MIN_VALUE;
                String str12 = C0614b.f2345J;
                return new C0614b(r18, alignment2, alignment4, bitmap, f, i3, i14, f4, i15, i4, f3, f5, f6, z4, i5, i16, bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f);
            case 6:
                C0614b c0614b = (C0614b) obj;
                c0614b.getClass();
                Bundle bundle4 = new Bundle();
                CharSequence charSequence2 = c0614b.f2355a;
                if (charSequence2 != null) {
                    bundle4.putCharSequence(C0614b.f2346r, charSequence2);
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence2;
                        String str13 = AbstractC0616d.f2374a;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (C0619g c0619g : (C0619g[]) spanned.getSpans(0, spanned.length(), C0619g.class)) {
                            c0619g.getClass();
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(C0619g.f2379c, c0619g.f2381a);
                            bundle5.putInt(C0619g.f2380d, c0619g.f2382b);
                            arrayList.add(AbstractC0616d.m1537a(spanned, c0619g, 1, bundle5));
                        }
                        for (C0620h c0620h : (C0620h[]) spanned.getSpans(0, spanned.length(), C0620h.class)) {
                            c0620h.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt(C0620h.f2383d, c0620h.f2386a);
                            bundle6.putInt(C0620h.f2384e, c0620h.f2387b);
                            bundle6.putInt(C0620h.f2385f, c0620h.f2388c);
                            arrayList.add(AbstractC0616d.m1537a(spanned, c0620h, 2, bundle6));
                        }
                        for (C0617e c0617e : (C0617e[]) spanned.getSpans(0, spanned.length(), C0617e.class)) {
                            arrayList.add(AbstractC0616d.m1537a(spanned, c0617e, 3, null));
                        }
                        for (C0621i c0621i : (C0621i[]) spanned.getSpans(0, spanned.length(), C0621i.class)) {
                            c0621i.getClass();
                            Bundle bundle7 = new Bundle();
                            bundle7.putString(C0621i.f2389b, c0621i.f2390a);
                            arrayList.add(AbstractC0616d.m1537a(spanned, c0621i, 4, bundle7));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle4.putParcelableArrayList(C0614b.f2347s, arrayList);
                        }
                    }
                }
                bundle4.putSerializable(C0614b.f2348t, c0614b.f2356b);
                bundle4.putSerializable(C0614b.f2349u, c0614b.f2357c);
                bundle4.putFloat(C0614b.f2352x, c0614b.f2359e);
                bundle4.putInt(C0614b.f2353y, c0614b.f2360f);
                bundle4.putInt(C0614b.f2354z, c0614b.f2361g);
                bundle4.putFloat(C0614b.f2336A, c0614b.f2362h);
                bundle4.putInt(C0614b.f2337B, c0614b.f2363i);
                bundle4.putInt(C0614b.f2338C, c0614b.f2368n);
                bundle4.putFloat(C0614b.f2339D, c0614b.f2369o);
                bundle4.putFloat(C0614b.f2340E, c0614b.f2364j);
                bundle4.putFloat(C0614b.f2341F, c0614b.f2365k);
                bundle4.putBoolean(C0614b.f2343H, c0614b.f2366l);
                bundle4.putInt(C0614b.f2342G, c0614b.f2367m);
                bundle4.putInt(C0614b.f2344I, c0614b.f2370p);
                bundle4.putFloat(C0614b.f2345J, c0614b.f2371q);
                Bitmap bitmap2 = c0614b.f2358d;
                if (bitmap2 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    AbstractC0646n.m1630h(bitmap2.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle4.putByteArray(C0614b.f2351w, byteArrayOutputStream.toByteArray());
                }
                return bundle4;
            case 7:
                long j3 = ((C0455a) obj).f1521b;
                if (j3 == -9223372036854775807L) {
                    j3 = 0;
                }
                return Long.valueOf(j3);
            case 8:
            default:
                return new C1064e((C0653u) obj);
            case 9:
                C0585q c0585q = (C0585q) obj;
                return c0585q.f2168a + ": " + c0585q.f2169b;
        }
    }

    @Override // p064W.InterfaceC0642j
    /* JADX INFO: renamed from: g */
    public void mo214g(Object obj) {
        switch (this.f53g) {
            case 8:
                ((InterfaceC0551N) obj).mo1382e(1);
                break;
            case 9:
            case 10:
            default:
                ((C1069j) obj).getClass();
                break;
            case 11:
                ((InterfaceC0551N) obj).mo1371C(new C0839o(2, new C0513b("Player release timed out."), 1003));
                break;
            case 12:
                C0567c c0567c = C0567c.f2052b;
                ((InterfaceC0551N) obj).mo1392t();
                break;
            case 13:
                ((InterfaceC0551N) obj).mo1370B();
                break;
            case 14:
                ((C1069j) obj).getClass();
                break;
            case 15:
                ((C1069j) obj).getClass();
                break;
            case 16:
                ((C1069j) obj).getClass();
                break;
            case 17:
                ((C1069j) obj).getClass();
                break;
            case 18:
                ((C1069j) obj).getClass();
                break;
            case 19:
                ((C1069j) obj).getClass();
                break;
            case 20:
                ((C1069j) obj).getClass();
                break;
            case 21:
                ((C1069j) obj).getClass();
                break;
            case 22:
                ((C1069j) obj).getClass();
                break;
            case 23:
                ((C1069j) obj).getClass();
                break;
            case 24:
                ((C1069j) obj).getClass();
                break;
            case 25:
                ((C1069j) obj).getClass();
                break;
            case 26:
                ((C1069j) obj).getClass();
                break;
            case 27:
                ((C1069j) obj).getClass();
                break;
            case 28:
                ((C1069j) obj).getClass();
                break;
        }
    }

    public /* synthetic */ C0041i(AbstractC0558V abstractC0558V) {
        this.f53g = 8;
    }
}
