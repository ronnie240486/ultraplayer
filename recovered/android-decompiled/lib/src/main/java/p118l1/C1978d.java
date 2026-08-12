package p118l1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p098g.C1569f;
import p122m1.AbstractC2003a;
import p124n.C2018e;
import p144s.AbstractC2208b;
import p144s.AbstractC2215i;
import p144s.AbstractC2220n;
import p152u.AbstractC2279a;

/* JADX INFO: renamed from: l1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1978d extends AbstractC1981g implements Animatable {

    /* JADX INFO: renamed from: i */
    public final Context f8629i;

    /* JADX INFO: renamed from: j */
    public final C1569f f8630j = new C1569f(this);

    /* JADX INFO: renamed from: h */
    public final C1976b f8628h = new C1976b();

    public C1978d(Context context) {
        this.f8629i = context;
    }

    @Override // p118l1.AbstractC1981g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            AbstractC2279a.m4885a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            return AbstractC2279a.m4886b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C1976b c1976b = this.f8628h;
        c1976b.f8623a.draw(canvas);
        if (c1976b.f8624b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f8633g;
        return drawable != null ? drawable.getAlpha() : this.f8628h.f8623a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f8628h.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f8633g;
        return drawable != null ? AbstractC2279a.m4887c(drawable) : this.f8628h.f8623a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f8633g == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1977c(this.f8633g.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f8633g;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f8628h.f8623a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f8633g;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f8628h.f8623a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f8633g;
        return drawable != null ? drawable.getOpacity() : this.f8628h.f8623a.getOpacity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        C1976b c1976b;
        XmlResourceParser xmlResourceParser;
        Animator animatorM4513a;
        C1990p c1990p;
        int next;
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            AbstractC2279a.m4888d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c1976b = this.f8628h;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM4787f = AbstractC2208b.m4787f(resources, theme, attributeSet, AbstractC1975a.f8616e);
                    int resourceId = typedArrayM4787f.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = C1990p.f8688p;
                        if (Build.VERSION.SDK_INT >= 24) {
                            c1990p = new C1990p();
                            ThreadLocal threadLocal = AbstractC2220n.f9530a;
                            c1990p.f8633g = AbstractC2215i.m4796a(resources, resourceId, theme);
                            new C1989o(c1990p.f8633g.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                                do {
                                    next = xml.next();
                                    if (next == 2) {
                                        break;
                                    }
                                } while (next != 1);
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                c1990p = new C1990p();
                                c1990p.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException e3) {
                                Log.e("VectorDrawableCompat", "parser error", e3);
                                c1990p = null;
                            } catch (XmlPullParserException e4) {
                                Log.e("VectorDrawableCompat", "parser error", e4);
                                c1990p = null;
                            }
                        }
                        c1990p.f8693l = false;
                        c1990p.setCallback(this.f8630j);
                        C1990p c1990p2 = c1976b.f8623a;
                        if (c1990p2 != null) {
                            c1990p2.setCallback(null);
                        }
                        c1976b.f8623a = c1990p;
                    }
                    typedArrayM4787f.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC1975a.f8617f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f8629i;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            animatorM4513a = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    XmlResourceParser animation = resources2.getAnimation(resourceId2);
                                    try {
                                        animatorM4513a = AbstractC1975a.m4513a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                        animation.close();
                                    } catch (IOException e5) {
                                        e = e5;
                                        Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException.initCause(e);
                                        throw notFoundException;
                                    } catch (XmlPullParserException e6) {
                                        e = e6;
                                        Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException2.initCause(e);
                                        throw notFoundException2;
                                    } catch (Throwable th) {
                                        th = th;
                                        xmlResourceParser = animation;
                                        if (xmlResourceParser != 0) {
                                            xmlResourceParser.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    xmlResourceParser = context;
                                }
                            } catch (IOException e7) {
                                e = e7;
                            } catch (XmlPullParserException e8) {
                                e = e8;
                            } catch (Throwable th3) {
                                th = th3;
                                xmlResourceParser = 0;
                            }
                        }
                        animatorM4513a.setTarget(c1976b.f8623a.f8689h.f8676b.f8674o.getOrDefault(string, null));
                        if (c1976b.f8625c == null) {
                            c1976b.f8625c = new ArrayList();
                            c1976b.f8626d = new C2018e();
                        }
                        c1976b.f8625c.add(animatorM4513a);
                        c1976b.f8626d.put(animatorM4513a, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c1976b.f8624b == null) {
            c1976b.f8624b = new AnimatorSet();
        }
        c1976b.f8624b.playTogether(c1976b.f8625c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f8633g;
        return drawable != null ? drawable.isAutoMirrored() : this.f8628h.f8623a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f8633g;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f8628h.f8624b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f8633g;
        return drawable != null ? drawable.isStateful() : this.f8628h.f8623a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f8628h.f8623a.setBounds(rect);
        }
    }

    @Override // p118l1.AbstractC1981g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        Drawable drawable = this.f8633g;
        return drawable != null ? drawable.setLevel(i3) : this.f8628h.f8623a.setLevel(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f8633g;
        return drawable != null ? drawable.setState(iArr) : this.f8628h.f8623a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            drawable.setAlpha(i3);
        } else {
            this.f8628h.f8623a.setAlpha(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f8628h.f8623a.setAutoMirrored(z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f8628h.f8623a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            AbstractC2003a.m4546s(drawable, i3);
        } else {
            this.f8628h.f8623a.setTint(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            AbstractC2279a.m4892h(drawable, colorStateList);
        } else {
            this.f8628h.f8623a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            AbstractC2279a.m4893i(drawable, mode);
        } else {
            this.f8628h.f8623a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        this.f8628h.f8623a.setVisible(z3, z4);
        return super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C1976b c1976b = this.f8628h;
        if (c1976b.f8624b.isStarted()) {
            return;
        }
        c1976b.f8624b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f8633g;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f8628h.f8624b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
