package p001A0;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p055T.C0546I;
import p064W.AbstractC0646n;
import p105h2.AbstractC1676G;
import p105h2.C1673D;
import p105h2.C1674E;
import p105h2.C1692X;

/* JADX INFO: renamed from: A0.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0071e {

    /* JADX INFO: renamed from: a */
    public static final String[] f110a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b */
    public static final String[] f111b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c */
    public static final String[] f112c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: a */
    public static C0069c m356a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!AbstractC0646n.m1641s(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw C0546I.m1365a(null, "Couldn't find xmp metadata");
        }
        C1674E c1674e = AbstractC1676G.f7601h;
        C1692X c1692xM357b = C1692X.f7629k;
        long j3 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (AbstractC0646n.m1641s(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f110a;
                for (int i3 = 0; i3 < 4; i3++) {
                    String strM1637o = AbstractC0646n.m1637o(xmlPullParserNewPullParser, strArr[i3]);
                    if (strM1637o != null) {
                        if (Integer.parseInt(strM1637o) != 1) {
                            break loop0;
                        }
                        String[] strArr2 = f111b;
                        int i4 = 0;
                        while (true) {
                            if (i4 < 4) {
                                String strM1637o2 = AbstractC0646n.m1637o(xmlPullParserNewPullParser, strArr2[i4]);
                                if (strM1637o2 != null) {
                                    j3 = Long.parseLong(strM1637o2);
                                    if (j3 != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i4++;
                            }
                            j3 = -9223372036854775807L;
                            break;
                        }
                        String[] strArr3 = f112c;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= 2) {
                                C1674E c1674e2 = AbstractC1676G.f7601h;
                                c1692xM357b = C1692X.f7629k;
                                break;
                            }
                            String strM1637o3 = AbstractC0646n.m1637o(xmlPullParserNewPullParser, strArr3[i5]);
                            if (strM1637o3 != null) {
                                c1692xM357b = AbstractC1676G.m4121s(new C0068b(0L, 0L, "image/jpeg"), new C0068b(Long.parseLong(strM1637o3), 0L, "video/mp4"));
                                break;
                            }
                            i5++;
                        }
                    }
                }
                return null;
            }
            if (AbstractC0646n.m1641s(xmlPullParserNewPullParser, "Container:Directory")) {
                c1692xM357b = m357b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (AbstractC0646n.m1641s(xmlPullParserNewPullParser, "GContainer:Directory")) {
                c1692xM357b = m357b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!AbstractC0646n.m1640r(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (c1692xM357b.isEmpty()) {
            break loop0;
        }
        return new C0069c(0, j3, c1692xM357b);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C1692X m357b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        C1673D c1673dM4116m = AbstractC1676G.m4116m();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (AbstractC0646n.m1641s(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM1637o = AbstractC0646n.m1637o(xmlPullParser, strConcat3);
                String strM1637o2 = AbstractC0646n.m1637o(xmlPullParser, strConcat4);
                String strM1637o3 = AbstractC0646n.m1637o(xmlPullParser, strConcat5);
                String strM1637o4 = AbstractC0646n.m1637o(xmlPullParser, strConcat6);
                if (strM1637o == null || strM1637o2 == null) {
                    return C1692X.f7629k;
                }
                c1673dM4116m.m4102a(new C0068b(strM1637o3 != null ? Long.parseLong(strM1637o3) : 0L, strM1637o4 != null ? Long.parseLong(strM1637o4) : 0L, strM1637o));
            }
        } while (!AbstractC0646n.m1640r(xmlPullParser, strConcat2));
        return c1673dM4116m.m4112f();
    }
}
