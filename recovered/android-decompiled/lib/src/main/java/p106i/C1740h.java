package p106i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p060U1.AbstractC0610a;
import p087d.AbstractC1376a;
import p110j.ActionProviderVisibilityListenerC1775p;
import p110j.MenuC1772m;
import p113k.AbstractC1877l0;

/* JADX INFO: renamed from: i.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1740h extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class[] f7774e;

    /* JADX INFO: renamed from: f */
    public static final Class[] f7775f;

    /* JADX INFO: renamed from: a */
    public final Object[] f7776a;

    /* JADX INFO: renamed from: b */
    public final Object[] f7777b;

    /* JADX INFO: renamed from: c */
    public final Context f7778c;

    /* JADX INFO: renamed from: d */
    public Object f7779d;

    static {
        Class[] clsArr = {Context.class};
        f7774e = clsArr;
        f7775f = clsArr;
    }

    public C1740h(Context context) {
        super(context);
        this.f7778c = context;
        Object[] objArr = {context};
        this.f7776a = objArr;
        this.f7777b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public static Object m4191a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m4191a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX INFO: renamed from: b */
    public final void m4192b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r4;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        C1739g c1739g = new C1739g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            r4 = 1;
            i3 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i3) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z4 && name2.equals(str)) {
                        xmlResourceParser = xmlResourceParser;
                        z4 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        c1739g.f7749b = 0;
                        c1739g.f7750c = 0;
                        c1739g.f7751d = 0;
                        c1739g.f7752e = 0;
                        c1739g.f7753f = r4;
                        c1739g.f7754g = r4;
                    } else if (name2.equals("item")) {
                        if (!c1739g.f7755h) {
                            ActionProviderVisibilityListenerC1775p actionProviderVisibilityListenerC1775p = c1739g.f7773z;
                            if (actionProviderVisibilityListenerC1775p == null || !actionProviderVisibilityListenerC1775p.f7952b.hasSubMenu()) {
                                c1739g.f7755h = r4;
                                c1739g.m4190b(c1739g.f7748a.add(c1739g.f7749b, c1739g.f7756i, c1739g.f7757j, c1739g.f7758k));
                            } else {
                                c1739g.f7755h = r4;
                                c1739g.m4190b(c1739g.f7748a.addSubMenu(c1739g.f7749b, c1739g.f7756i, c1739g.f7757j, c1739g.f7758k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlResourceParser = xmlResourceParser;
                        z3 = true;
                    }
                }
            } else if (!z4) {
                String name3 = xmlResourceParser.getName();
                boolean zEquals = name3.equals("group");
                C1740h c1740h = c1739g.f7747E;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = c1740h.f7778c.obtainStyledAttributes(attributeSet, AbstractC1376a.f6110p);
                    c1739g.f7749b = typedArrayObtainStyledAttributes.getResourceId(r4, 0);
                    c1739g.f7750c = typedArrayObtainStyledAttributes.getInt(3, 0);
                    c1739g.f7751d = typedArrayObtainStyledAttributes.getInt(4, 0);
                    c1739g.f7752e = typedArrayObtainStyledAttributes.getInt(5, 0);
                    c1739g.f7753f = typedArrayObtainStyledAttributes.getBoolean(2, r4);
                    c1739g.f7754g = typedArrayObtainStyledAttributes.getBoolean(0, r4);
                    typedArrayObtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    Context context = c1740h.f7778c;
                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1376a.f6111q);
                    c1739g.f7756i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                    c1739g.f7757j = (typedArrayObtainStyledAttributes2.getInt(5, c1739g.f7750c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c1739g.f7751d) & 65535);
                    c1739g.f7758k = typedArrayObtainStyledAttributes2.getText(7);
                    c1739g.f7759l = typedArrayObtainStyledAttributes2.getText(8);
                    c1739g.f7760m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                    String string = typedArrayObtainStyledAttributes2.getString(9);
                    c1739g.f7761n = string == null ? (char) 0 : string.charAt(0);
                    c1739g.f7762o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                    String string2 = typedArrayObtainStyledAttributes2.getString(10);
                    c1739g.f7763p = string2 == null ? (char) 0 : string2.charAt(0);
                    c1739g.f7764q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                    if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                        c1739g.f7765r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                    } else {
                        c1739g.f7765r = c1739g.f7752e;
                    }
                    c1739g.f7766s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                    c1739g.f7767t = typedArrayObtainStyledAttributes2.getBoolean(4, c1739g.f7753f);
                    c1739g.f7768u = typedArrayObtainStyledAttributes2.getBoolean(1, c1739g.f7754g);
                    c1739g.f7769v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                    c1739g.f7772y = typedArrayObtainStyledAttributes2.getString(12);
                    c1739g.f7770w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                    c1739g.f7771x = typedArrayObtainStyledAttributes2.getString(15);
                    String string3 = typedArrayObtainStyledAttributes2.getString(14);
                    boolean z5 = string3 != null;
                    if (z5 && c1739g.f7770w == 0 && c1739g.f7771x == null) {
                        c1739g.f7773z = (ActionProviderVisibilityListenerC1775p) c1739g.m4189a(string3, f7775f, c1740h.f7777b);
                    } else {
                        if (z5) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        c1739g.f7773z = null;
                    }
                    c1739g.f7743A = typedArrayObtainStyledAttributes2.getText(17);
                    c1739g.f7744B = typedArrayObtainStyledAttributes2.getText(22);
                    if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                        c1739g.f7746D = AbstractC1877l0.m4397b(typedArrayObtainStyledAttributes2.getInt(19, -1), c1739g.f7746D);
                    } else {
                        c1739g.f7746D = null;
                    }
                    if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                        if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0610a.m1510l(context, resourceId)) == null) {
                            colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                        }
                        c1739g.f7745C = colorStateList;
                    } else {
                        c1739g.f7745C = null;
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                    c1739g.f7755h = false;
                } else if (name3.equals("menu")) {
                    c1739g.f7755h = true;
                    SubMenu subMenuAddSubMenu = c1739g.f7748a.addSubMenu(c1739g.f7749b, c1739g.f7756i, c1739g.f7757j, c1739g.f7758k);
                    c1739g.m4190b(subMenuAddSubMenu.getItem());
                    xmlResourceParser = xmlResourceParser;
                    m4192b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                } else {
                    xmlResourceParser = xmlResourceParser;
                    str = name3;
                    z4 = true;
                }
            }
            eventType = xmlResourceParser.next();
            r4 = 1;
            i3 = 2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i3, Menu menu) {
        if (!(menu instanceof MenuC1772m)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z3 = false;
        try {
            try {
                layout = this.f7778c.getResources().getLayout(i3);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC1772m) {
                    MenuC1772m menuC1772m = (MenuC1772m) menu;
                    if (!menuC1772m.f7910p) {
                        menuC1772m.m4265w();
                        z3 = true;
                    }
                }
                m4192b(layout, attributeSetAsAttributeSet, menu);
                if (z3) {
                    ((MenuC1772m) menu).m4264v();
                }
                layout.close();
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            } catch (XmlPullParserException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            }
        } catch (Throwable th) {
            if (z3) {
                ((MenuC1772m) menu).m4264v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
