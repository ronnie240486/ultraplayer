package p098g;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParserException;
import p066W1.AbstractC0664e;
import p102h.AbstractC1590a;
import p102h.AbstractC1591b;
import p113k.C1817M0;
import p118l1.C1978d;
import p118l1.C1990p;
import p144s.AbstractC2208b;
import p152u.InterfaceC2285g;

/* JADX INFO: renamed from: g.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1568e extends AbstractC1570g implements InterfaceC2285g {

    /* JADX INFO: renamed from: t */
    public C1565b f7119t;

    /* JADX INFO: renamed from: u */
    public boolean f7120u;

    /* JADX INFO: renamed from: v */
    public C1565b f7121v;

    /* JADX INFO: renamed from: w */
    public AbstractC0664e f7122w;

    /* JADX INFO: renamed from: x */
    public int f7123x;

    /* JADX INFO: renamed from: y */
    public int f7124y;

    /* JADX INFO: renamed from: z */
    public boolean f7125z;

    public C1568e(C1565b c1565b, Resources resources) {
        this.f7133k = 255;
        this.f7135m = -1;
        this.f7123x = -1;
        this.f7124y = -1;
        mo3898d(new C1565b(c1565b, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX INFO: renamed from: e */
    public static C1568e m3897e(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        C1568e c1568e = new C1568e(null, null);
        TypedArray typedArrayM4787f = AbstractC2208b.m4787f(resources2, theme, attributeSet, AbstractC1591b.f7203a);
        int i3 = 1;
        c1568e.setVisible(typedArrayM4787f.getBoolean(1, true), true);
        C1565b c1565b = c1568e.f7121v;
        c1565b.f7091d |= AbstractC1590a.m3917b(typedArrayM4787f);
        int i4 = 2;
        c1565b.f7096i = typedArrayM4787f.getBoolean(2, c1565b.f7096i);
        int i5 = 3;
        c1565b.f7099l = typedArrayM4787f.getBoolean(3, c1565b.f7099l);
        c1565b.f7112y = typedArrayM4787f.getInt(4, c1565b.f7112y);
        c1565b.f7113z = typedArrayM4787f.getInt(5, c1565b.f7113z);
        boolean z3 = false;
        c1568e.setDither(typedArrayM4787f.getBoolean(0, c1565b.f7110w));
        C1565b c1565b2 = c1568e.f7129g;
        if (resources2 != null) {
            c1565b2.f7089b = resources2;
            int i6 = resources2.getDisplayMetrics().densityDpi;
            if (i6 == 0) {
                i6 = 160;
            }
            int i7 = c1565b2.f7090c;
            c1565b2.f7090c = i6;
            if (i7 != i6) {
                c1565b2.f7100m = false;
                c1565b2.f7097j = false;
            }
        } else {
            c1565b2.getClass();
        }
        typedArrayM4787f.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i3 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i5)) {
                break;
            }
            if (next3 == i4 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayM4787f2 = AbstractC2208b.m4787f(resources2, theme, attributeSet, AbstractC1591b.f7204b);
                    int resourceId = typedArrayM4787f2.getResourceId(z3 ? 1 : 0, z3 ? 1 : 0);
                    int resourceId2 = typedArrayM4787f2.getResourceId(i3, -1);
                    Drawable drawableM4324f = resourceId2 > 0 ? C1817M0.m4317d().m4324f(context2, resourceId2) : null;
                    typedArrayM4787f2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i8 = 0;
                    for (int i9 = 0; i9 < attributeCount; i9++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i9);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i10 = i8 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i9, z3)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i8] = attributeNameResource;
                            i8 = i10;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i8);
                    if (drawableM4324f == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableM4324f = new C1990p();
                            drawableM4324f.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            drawableM4324f = AbstractC1590a.m3916a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (drawableM4324f == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    C1565b c1565b3 = c1568e.f7121v;
                    int iM3892a = c1565b3.m3892a(drawableM4324f);
                    c1565b3.f7085H[iM3892a] = iArrTrimStateSet;
                    c1565b3.f7087J.m4596d(iM3892a, Integer.valueOf(resourceId));
                } else {
                    if (xmlResourceParser.getName().equals("transition")) {
                        TypedArray typedArrayM4787f3 = AbstractC2208b.m4787f(resources2, theme, attributeSet, AbstractC1591b.f7205c);
                        int resourceId3 = typedArrayM4787f3.getResourceId(2, -1);
                        int resourceId4 = typedArrayM4787f3.getResourceId(1, -1);
                        int resourceId5 = typedArrayM4787f3.getResourceId(z3 ? 1 : 0, -1);
                        Drawable drawableM4324f2 = resourceId5 > 0 ? C1817M0.m4317d().m4324f(context2, resourceId5) : null;
                        boolean z4 = typedArrayM4787f3.getBoolean(3, z3);
                        typedArrayM4787f3.recycle();
                        if (drawableM4324f2 == null) {
                            do {
                                next = xmlResourceParser.next();
                            } while (next == 4);
                            if (next != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("animated-vector")) {
                                drawableM4324f2 = new C1978d(context2);
                                drawableM4324f2.inflate(resources2, xmlResourceParser, attributeSet, theme);
                            } else {
                                drawableM4324f2 = AbstractC1590a.m3916a(resources, xmlResourceParser, attributeSet, theme);
                            }
                        }
                        if (drawableM4324f2 == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (resourceId3 == -1 || resourceId4 == -1) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                        }
                        C1565b c1565b4 = c1568e.f7121v;
                        int iM3892a2 = c1565b4.m3892a(drawableM4324f2);
                        long j3 = resourceId3;
                        long j4 = resourceId4;
                        long j5 = (j3 << 32) | j4;
                        long j6 = z4 ? 8589934592L : 0L;
                        long j7 = iM3892a2;
                        c1565b4.f7086I.m4579a(j5, Long.valueOf(j7 | j6));
                        if (z4) {
                            c1565b4.f7086I.m4579a((j4 << 32) | j3, Long.valueOf(j7 | 4294967296L | j6));
                        }
                        context2 = context;
                        resources2 = resources;
                        i3 = 1;
                        z3 = false;
                    } else {
                        context2 = context;
                        resources2 = resources;
                    }
                    i4 = 2;
                    i5 = 3;
                }
                i3 = 1;
                i4 = 2;
                i5 = 3;
            }
        }
        c1568e.onStateChange(c1568e.getState());
        return c1568e;
    }

    @Override // p098g.AbstractC1570g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p098g.AbstractC1570g
    /* JADX INFO: renamed from: d */
    public final void mo3898d(C1565b c1565b) {
        this.f7129g = c1565b;
        int i3 = this.f7135m;
        if (i3 >= 0) {
            Drawable drawableM3895d = c1565b.m3895d(i3);
            this.f7131i = drawableM3895d;
            if (drawableM3895d != null) {
                m3902b(drawableM3895d);
            }
        }
        this.f7132j = null;
        this.f7119t = c1565b;
        this.f7121v = c1565b;
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m3899f() {
        if (!this.f7120u) {
            super.mutate();
            C1565b c1565b = this.f7119t;
            c1565b.f7086I = c1565b.f7086I.clone();
            c1565b.f7087J = c1565b.f7087J.clone();
            this.f7120u = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // p098g.AbstractC1570g, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC0664e abstractC0664e = this.f7122w;
        if (abstractC0664e != null) {
            abstractC0664e.mo1765W();
            this.f7122w = null;
            m3903c(this.f7123x);
            this.f7123x = -1;
            this.f7124y = -1;
        }
    }

    @Override // p098g.AbstractC1570g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f7125z) {
            m3899f();
            C1565b c1565b = this.f7121v;
            c1565b.f7086I = c1565b.f7086I.clone();
            c1565b.f7087J = c1565b.f7087J.clone();
            this.f7125z = true;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        C1565b c1565b;
        int iIntValue;
        int iIntValue2;
        AbstractC0664e c1564a;
        C1565b c1565b2 = this.f7121v;
        int iM3896e = c1565b2.m3896e(iArr);
        if (iM3896e < 0) {
            iM3896e = c1565b2.m3896e(StateSet.WILD_CARD);
        }
        int i3 = this.f7135m;
        boolean z3 = false;
        if (iM3896e != i3) {
            AbstractC0664e abstractC0664e = this.f7122w;
            if (abstractC0664e == null) {
                this.f7122w = null;
                this.f7124y = -1;
                this.f7123x = -1;
                c1565b = this.f7121v;
                if (i3 < 0) {
                    c1565b.getClass();
                    iIntValue = 0;
                } else {
                    iIntValue = ((Integer) c1565b.f7087J.m4595c(i3, 0)).intValue();
                }
                if (iM3896e < 0) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = ((Integer) c1565b.f7087J.m4595c(iM3896e, 0)).intValue();
                }
                if (iIntValue2 == 0 && iIntValue != 0) {
                    long j3 = ((long) iIntValue2) | (((long) iIntValue) << 32);
                    int iLongValue = (int) ((Long) c1565b.f7086I.m4582d(j3, -1L)).longValue();
                    if (iLongValue >= 0) {
                        boolean z4 = (((Long) c1565b.f7086I.m4582d(j3, -1L)).longValue() & 8589934592L) != 0;
                        m3903c(iLongValue);
                        Object obj = this.f7131i;
                        if (obj instanceof AnimationDrawable) {
                            c1564a = new C1566c((AnimationDrawable) obj, (((Long) c1565b.f7086I.m4582d(j3, -1L)).longValue() & 4294967296L) != 0, z4);
                        } else if (obj instanceof C1978d) {
                            c1564a = new C1564a((C1978d) obj, 1);
                        } else if (obj instanceof Animatable) {
                            c1564a = new C1564a((Animatable) obj, 0);
                        } else if (m3903c(iM3896e)) {
                            z3 = true;
                        }
                        c1564a.mo1764V();
                        this.f7122w = c1564a;
                        this.f7124y = i3;
                        this.f7123x = iM3896e;
                        z3 = true;
                    } else if (m3903c(iM3896e)) {
                        z3 = true;
                    }
                } else if (m3903c(iM3896e)) {
                    z3 = true;
                }
            } else {
                if (iM3896e != this.f7123x) {
                    if (iM3896e == this.f7124y && abstractC0664e.mo1766d()) {
                        abstractC0664e.mo1763P();
                        this.f7123x = this.f7124y;
                        this.f7124y = iM3896e;
                    } else {
                        i3 = this.f7123x;
                        abstractC0664e.mo1765W();
                        this.f7122w = null;
                        this.f7124y = -1;
                        this.f7123x = -1;
                        c1565b = this.f7121v;
                        if (i3 < 0) {
                            c1565b.getClass();
                            iIntValue = 0;
                        } else {
                            iIntValue = ((Integer) c1565b.f7087J.m4595c(i3, 0)).intValue();
                        }
                        if (iM3896e < 0) {
                            iIntValue2 = 0;
                        } else {
                            iIntValue2 = ((Integer) c1565b.f7087J.m4595c(iM3896e, 0)).intValue();
                        }
                        if (iIntValue2 == 0) {
                            if (m3903c(iM3896e)) {
                            }
                        } else if (m3903c(iM3896e)) {
                        }
                    }
                }
                z3 = true;
            }
        }
        Drawable drawable = this.f7131i;
        return drawable != null ? drawable.setState(iArr) | z3 : z3;
    }

    @Override // p098g.AbstractC1570g, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        AbstractC0664e abstractC0664e = this.f7122w;
        if (abstractC0664e != null && (visible || z4)) {
            if (z3) {
                abstractC0664e.mo1764V();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
