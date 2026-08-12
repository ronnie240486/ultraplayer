package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.zuxoplayer.app.R;
import java.io.IOException;
import java.util.ArrayList;
import p060U1.AbstractC0610a;
import p089d1.C1403C;

/* JADX INFO: renamed from: androidx.mediarouter.app.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1035d extends ArrayAdapter implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: g */
    public final LayoutInflater f4547g;

    /* JADX INFO: renamed from: h */
    public final Drawable f4548h;

    /* JADX INFO: renamed from: i */
    public final Drawable f4549i;

    /* JADX INFO: renamed from: j */
    public final Drawable f4550j;

    /* JADX INFO: renamed from: k */
    public final Drawable f4551k;

    public C1035d(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.f4547g = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
        this.f4548h = AbstractC0610a.m1512n(context, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        this.f4549i = AbstractC0610a.m1512n(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        this.f4550j = AbstractC0610a.m1512n(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f4551k = AbstractC0610a.m1512n(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        Drawable drawableCreateFromStream;
        int i4;
        Drawable drawable;
        if (view == null) {
            view = this.f4547g.inflate(R.layout.mr_chooser_list_item, viewGroup, false);
        }
        C1403C c1403c = (C1403C) getItem(i3);
        TextView textView = (TextView) view.findViewById(R.id.mr_chooser_route_name);
        TextView textView2 = (TextView) view.findViewById(R.id.mr_chooser_route_desc);
        textView.setText(c1403c.f6219d);
        String str = c1403c.f6220e;
        int i5 = c1403c.f6224i;
        if ((i5 == 2 || i5 == 1) && !TextUtils.isEmpty(str)) {
            textView.setGravity(80);
            textView2.setVisibility(0);
            textView2.setText(str);
        } else {
            textView.setGravity(16);
            textView2.setVisibility(8);
            textView2.setText("");
        }
        view.setEnabled(c1403c.f6222g);
        ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
        if (imageView != null) {
            Uri uri = c1403c.f6221f;
            if (uri != null) {
                try {
                    drawableCreateFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uri), null);
                    if (drawableCreateFromStream == null) {
                        i4 = c1403c.f6229n;
                        if (i4 != 1) {
                            drawable = this.f4549i;
                        } else if (i4 != 2) {
                            drawable = this.f4550j;
                        } else if (c1403c.m3495e()) {
                            drawable = this.f4551k;
                        } else {
                            drawable = this.f4548h;
                        }
                        drawableCreateFromStream = drawable;
                    }
                } catch (IOException e3) {
                    Log.w("MediaRouteChooserDialog", "Failed to load " + uri, e3);
                }
            } else {
                i4 = c1403c.f6229n;
                if (i4 != 1) {
                    drawable = this.f4549i;
                } else if (i4 != 2) {
                    drawable = this.f4550j;
                } else if (c1403c.m3495e()) {
                    drawable = this.f4551k;
                } else {
                    drawable = this.f4548h;
                }
                drawableCreateFromStream = drawable;
            }
            imageView.setImageDrawable(drawableCreateFromStream);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i3) {
        return ((C1403C) getItem(i3)).f6222g;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        C1403C c1403c = (C1403C) getItem(i3);
        ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_chooser_route_progress_bar);
        if (imageView != null && progressBar != null) {
            imageView.setVisibility(8);
            progressBar.setVisibility(0);
        }
        c1403c.m3502l();
    }
}
