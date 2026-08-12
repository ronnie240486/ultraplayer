package p113k;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.support.v4.media.session.C0858A;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.emoji2.text.C0919i;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000A.C0031d;
import p009D0.C0106b;
import p026J.C0285b;
import p026J.C0288e;
import p026J.C0291h;
import p026J.C0292i;
import p066W1.AbstractC0664e;
import p087d.AbstractC1376a;
import p152u.C2287i;
import p152u.InterfaceC2286h;

/* JADX INFO: renamed from: k.B */
/* JADX INFO: loaded from: classes.dex */
public class C1794B {

    /* JADX INFO: renamed from: d */
    public static final int[] f7985d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7986a = 2;

    /* JADX INFO: renamed from: b */
    public View f7987b;

    /* JADX INFO: renamed from: c */
    public Object f7988c;

    public /* synthetic */ C1794B() {
    }

    /* JADX INFO: renamed from: a */
    public KeyListener m4283a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0106b) ((C0031d) this.f7988c).f38h).getClass();
        if (keyListener instanceof C0288e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0288e(keyListener);
    }

    /* JADX INFO: renamed from: b */
    public void mo4284b(AttributeSet attributeSet, int i3) {
        switch (this.f7986a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f7987b;
                C0858A c0858aM2148Q = C0858A.m2148Q(absSeekBar.getContext(), attributeSet, f7985d, i3);
                Drawable drawableM2159G = c0858aM2148Q.m2159G(0);
                if (drawableM2159G != null) {
                    if (drawableM2159G instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM2159G;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i4 = 0; i4 < numberOfFrames; i4++) {
                            Drawable drawableM4287e = m4287e(animationDrawable.getFrame(i4), true);
                            drawableM4287e.setLevel(10000);
                            animationDrawable2.addFrame(drawableM4287e, animationDrawable.getDuration(i4));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM2159G = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM2159G);
                }
                Drawable drawableM2159G2 = c0858aM2148Q.m2159G(1);
                if (drawableM2159G2 != null) {
                    absSeekBar.setProgressDrawable(m4287e(drawableM2159G2, false));
                }
                c0858aM2148Q.m2170S();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f7987b).getContext().obtainStyledAttributes(attributeSet, AbstractC1376a.f6103i, i3, 0);
                try {
                    boolean z3 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z3 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    m4286d(z3);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* JADX INFO: renamed from: c */
    public C0285b m4285c(InputConnection inputConnection, EditorInfo editorInfo) {
        C0031d c0031d = (C0031d) this.f7988c;
        if (inputConnection == null) {
            c0031d.getClass();
            inputConnection = null;
        } else {
            C0106b c0106b = (C0106b) c0031d.f38h;
            c0106b.getClass();
            if (!(inputConnection instanceof C0285b)) {
                inputConnection = new C0285b((EditText) c0106b.f140h, inputConnection, editorInfo);
            }
        }
        return (C0285b) inputConnection;
    }

    /* JADX INFO: renamed from: d */
    public void m4286d(boolean z3) {
        C0292i c0292i = (C0292i) ((C0106b) ((C0031d) this.f7988c).f38h).f141i;
        if (c0292i.f784i != z3) {
            if (c0292i.f783h != null) {
                C0919i c0919iM2404a = C0919i.m2404a();
                C0291h c0291h = c0292i.f783h;
                c0919iM2404a.getClass();
                AbstractC0664e.m1747h(c0291h, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c0919iM2404a.f4005a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c0919iM2404a.f4006b.remove(c0291h);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            c0292i.f784i = z3;
            if (z3) {
                C0292i.m823a(c0292i.f782g, C0919i.m2404a().m2405b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public Drawable m4287e(Drawable drawable, boolean z3) {
        if (drawable instanceof InterfaceC2286h) {
            C2287i c2287i = (C2287i) ((InterfaceC2286h) drawable);
            Drawable drawable2 = c2287i.f9756l;
            if (drawable2 != null) {
                c2287i.m4913h(m4287e(drawable2, z3));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    int id = layerDrawable.getId(i3);
                    drawableArr[i3] = m4287e(layerDrawable.getDrawable(i3), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    layerDrawable2.setId(i4, layerDrawable.getId(i4));
                    if (Build.VERSION.SDK_INT >= 23) {
                        AbstractC1792A.m4282a(layerDrawable, layerDrawable2, i4);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f7988c) == null) {
                    this.f7988c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z3 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C1794B(AbsSeekBar absSeekBar) {
        this.f7987b = absSeekBar;
    }

    public C1794B(EditText editText) {
        this.f7987b = editText;
        this.f7988c = new C0031d(editText);
    }
}
