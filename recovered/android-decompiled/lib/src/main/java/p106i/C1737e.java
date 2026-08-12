package p106i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p110j.MenuC1756B;

/* JADX INFO: renamed from: i.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1737e extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f7738a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1733a f7739b;

    public C1737e(Context context, AbstractC1733a abstractC1733a) {
        this.f7738a = context;
        this.f7739b = abstractC1733a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f7739b.mo3680a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f7739b.mo3681c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC1756B(this.f7738a, this.f7739b.mo3682d());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f7739b.mo3683e();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f7739b.mo3684g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f7739b.f7724g;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f7739b.mo3685h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f7739b.f7725h;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f7739b.mo3686i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f7739b.mo3687j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f7739b.mo3688k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f7739b.mo3690m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f7739b.f7724g = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f7739b.mo3692o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z3) {
        this.f7739b.mo3693p(z3);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i3) {
        this.f7739b.mo3689l(i3);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i3) {
        this.f7739b.mo3691n(i3);
    }
}
