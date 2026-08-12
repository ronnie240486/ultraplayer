package p113k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.zuxoplayer.app.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p014F.RunnableC0153b;
import p014F.ViewOnTouchListenerC0159h;
import p152u.AbstractC2279a;

/* JADX INFO: renamed from: k.r0 */
/* JADX INFO: loaded from: classes.dex */
public class C1890r0 extends ListView {

    /* JADX INFO: renamed from: g */
    public final Rect f8250g;

    /* JADX INFO: renamed from: h */
    public int f8251h;

    /* JADX INFO: renamed from: i */
    public int f8252i;

    /* JADX INFO: renamed from: j */
    public int f8253j;

    /* JADX INFO: renamed from: k */
    public int f8254k;

    /* JADX INFO: renamed from: l */
    public int f8255l;

    /* JADX INFO: renamed from: m */
    public C1886p0 f8256m;

    /* JADX INFO: renamed from: n */
    public boolean f8257n;

    /* JADX INFO: renamed from: o */
    public final boolean f8258o;

    /* JADX INFO: renamed from: p */
    public boolean f8259p;

    /* JADX INFO: renamed from: q */
    public ViewOnTouchListenerC0159h f8260q;

    /* JADX INFO: renamed from: r */
    public RunnableC0153b f8261r;

    public C1890r0(Context context, boolean z3) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f8250g = new Rect();
        this.f8251h = 0;
        this.f8252i = 0;
        this.f8253j = 0;
        this.f8254k = 0;
        this.f8258o = z3;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    public final int m4405a(int i3, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i5 = 0;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i7 = layoutParams.height;
            view.measure(i3, i7 > 0 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return i4;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x014a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0160  */
    /* JADX WARN: Code duplicated, block: B:86:0x0165  */
    /* JADX WARN: Code duplicated, block: B:88:0x0169  */
    /* JADX WARN: Code duplicated, block: B:90:0x017b  */
    /* JADX WARN: Code duplicated, block: B:92:0x017f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0183  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    /* JADX INFO: renamed from: b */
    public final boolean m4406b(MotionEvent motionEvent, int i3) {
        boolean z3;
        boolean zM4399a;
        View childAt;
        View childAt2;
        ViewOnTouchListenerC0159h viewOnTouchListenerC0159h;
        int actionMasked = motionEvent.getActionMasked();
        boolean z4 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z3 = true;
            } else if (actionMasked != 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 || z4) {
                this.f8259p = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f8255l - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z3) {
                if (this.f8260q == null) {
                    this.f8260q = new ViewOnTouchListenerC0159h(this);
                }
                ViewOnTouchListenerC0159h viewOnTouchListenerC0159h2 = this.f8260q;
                boolean z5 = viewOnTouchListenerC0159h2.f387v;
                viewOnTouchListenerC0159h2.f387v = true;
                viewOnTouchListenerC0159h2.onTouch(this, motionEvent);
            } else {
                viewOnTouchListenerC0159h = this.f8260q;
                if (viewOnTouchListenerC0159h != null) {
                    if (viewOnTouchListenerC0159h.f387v) {
                        viewOnTouchListenerC0159h.m625d();
                    }
                    viewOnTouchListenerC0159h.f387v = false;
                }
            }
            return z3;
        }
        z3 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i3);
        if (iFindPointerIndex < 0) {
            z3 = false;
        } else {
            int x3 = (int) motionEvent.getX(iFindPointerIndex);
            int y3 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x3, y3);
            if (iPointToPosition == -1) {
                z4 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x3;
                float f3 = y3;
                this.f8259p = true;
                int i4 = Build.VERSION.SDK_INT;
                AbstractC1880m0.m4398a(this, f, f3);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i5 = this.f8255l;
                if (i5 != -1 && (childAt = getChildAt(i5 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f8255l = iPointToPosition;
                AbstractC1880m0.m4398a(childAt3, f - childAt3.getLeft(), f3 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z6 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z6) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f8250g;
                rect.set(left, top, right, bottom);
                rect.left -= this.f8251h;
                rect.top -= this.f8252i;
                rect.right += this.f8253j;
                rect.bottom += this.f8254k;
                if (i4 >= 33) {
                    zM4399a = AbstractC1884o0.m4399a(this);
                } else {
                    Field field = AbstractC1888q0.f8245a;
                    if (field != null) {
                        try {
                            zM4399a = field.getBoolean(this);
                        } catch (IllegalAccessException e3) {
                            e3.printStackTrace();
                            zM4399a = false;
                        }
                    } else {
                        zM4399a = false;
                    }
                }
                if (childAt3.isEnabled() != zM4399a) {
                    boolean z7 = !zM4399a;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC1884o0.m4400b(this, z7);
                    } else {
                        Field field2 = AbstractC1888q0.f8245a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z7));
                            } catch (IllegalAccessException e4) {
                                e4.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z6) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    AbstractC2279a.m4889e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    AbstractC2279a.m4889e(selector2, f, f3);
                }
                C1886p0 c1886p0 = this.f8256m;
                if (c1886p0 != null) {
                    c1886p0.f8240h = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z3 = true;
                z4 = false;
            }
        }
        if (z3) {
            this.f8259p = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f8255l - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f8259p = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f8255l - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z3) {
            if (this.f8260q == null) {
                this.f8260q = new ViewOnTouchListenerC0159h(this);
            }
            ViewOnTouchListenerC0159h viewOnTouchListenerC0159h3 = this.f8260q;
            boolean z8 = viewOnTouchListenerC0159h3.f387v;
            viewOnTouchListenerC0159h3.f387v = true;
            viewOnTouchListenerC0159h3.onTouch(this, motionEvent);
        } else {
            viewOnTouchListenerC0159h = this.f8260q;
            if (viewOnTouchListenerC0159h != null) {
                if (viewOnTouchListenerC0159h.f387v) {
                    viewOnTouchListenerC0159h.m625d();
                }
                viewOnTouchListenerC0159h.f387v = false;
            }
        }
        return z3;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f8250g;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f8261r != null) {
            return;
        }
        super.drawableStateChanged();
        C1886p0 c1886p0 = this.f8256m;
        if (c1886p0 != null) {
            c1886p0.f8240h = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f8259p && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f8258o || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f8258o || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f8258o || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f8258o && this.f8257n) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f8261r = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f8261r == null) {
            RunnableC0153b runnableC0153b = new RunnableC0153b(17, this);
            this.f8261r = runnableC0153b;
            post(runnableC0153b);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i3 < 30 || !AbstractC1882n0.f8231d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC1882n0.f8228a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC1882n0.f8229b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC1882n0.f8230c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f8259p && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f8255l = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0153b runnableC0153b = this.f8261r;
        if (runnableC0153b != null) {
            C1890r0 c1890r0 = (C1890r0) runnableC0153b.f370h;
            c1890r0.f8261r = null;
            c1890r0.removeCallbacks(runnableC0153b);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f8257n = z3;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1886p0 c1886p0 = null;
        if (drawable != null) {
            C1886p0 c1886p1 = new C1886p0();
            Drawable drawable2 = c1886p1.f8239g;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c1886p1.f8239g = drawable;
            drawable.setCallback(c1886p1);
            c1886p1.f8240h = true;
            c1886p0 = c1886p1;
        }
        this.f8256m = c1886p0;
        super.setSelector(c1886p0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f8251h = rect.left;
        this.f8252i = rect.top;
        this.f8253j = rect.right;
        this.f8254k = rect.bottom;
    }
}
