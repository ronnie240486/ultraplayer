package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.R;
import p113k.C1899w;
import p140r.AbstractC2181a;

/* JADX INFO: loaded from: classes.dex */
class MediaRouteExpandCollapseButton extends C1899w {

    /* JADX INFO: renamed from: j */
    public final AnimationDrawable f4458j;

    /* JADX INFO: renamed from: k */
    public final AnimationDrawable f4459k;

    /* JADX INFO: renamed from: l */
    public final String f4460l;

    /* JADX INFO: renamed from: m */
    public final String f4461m;

    /* JADX INFO: renamed from: n */
    public boolean f4462n;

    /* JADX INFO: renamed from: o */
    public View.OnClickListener f4463o;

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnimationDrawable animationDrawable = (AnimationDrawable) AbstractC2181a.m4765b(context, R.drawable.mr_group_expand);
        this.f4458j = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) AbstractC2181a.m4765b(context, R.drawable.mr_group_collapse);
        this.f4459k = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(AbstractC1303m.m3321n(context), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.mr_controller_expand_group);
        this.f4460l = string;
        this.f4461m = context.getString(R.string.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new ViewOnClickListenerC1018E(1, this));
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f4463o = onClickListener;
    }
}
