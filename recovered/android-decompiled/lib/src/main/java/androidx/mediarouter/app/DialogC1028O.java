package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C0872h;
import android.support.v4.media.session.HandlerC0881q;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p009D0.C0106b;
import p019G1.AbstractC0230e;
import p066W1.AbstractC0664e;
import p089d1.C1402B;
import p089d1.C1403C;
import p089d1.C1405E;
import p089d1.C1445r;
import p089d1.C1447t;
import p089d1.C1451x;
import p091e.AbstractDialogC1460E;
import p124n.C2018e;

/* JADX INFO: renamed from: androidx.mediarouter.app.O */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1028O extends AbstractDialogC1460E {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ int f4470Z = 0;

    /* JADX INFO: renamed from: A */
    public C1027N f4471A;

    /* JADX INFO: renamed from: B */
    public HashMap f4472B;

    /* JADX INFO: renamed from: C */
    public C1403C f4473C;

    /* JADX INFO: renamed from: D */
    public HashMap f4474D;

    /* JADX INFO: renamed from: E */
    public boolean f4475E;

    /* JADX INFO: renamed from: F */
    public boolean f4476F;

    /* JADX INFO: renamed from: G */
    public boolean f4477G;

    /* JADX INFO: renamed from: H */
    public ImageButton f4478H;

    /* JADX INFO: renamed from: I */
    public Button f4479I;

    /* JADX INFO: renamed from: J */
    public ImageView f4480J;

    /* JADX INFO: renamed from: K */
    public View f4481K;

    /* JADX INFO: renamed from: L */
    public ImageView f4482L;

    /* JADX INFO: renamed from: M */
    public TextView f4483M;

    /* JADX INFO: renamed from: N */
    public TextView f4484N;

    /* JADX INFO: renamed from: O */
    public String f4485O;

    /* JADX INFO: renamed from: P */
    public C0106b f4486P;

    /* JADX INFO: renamed from: Q */
    public final C1048q f4487Q;

    /* JADX INFO: renamed from: R */
    public MediaDescriptionCompat f4488R;

    /* JADX INFO: renamed from: S */
    public AsyncTaskC1017D f4489S;

    /* JADX INFO: renamed from: T */
    public Bitmap f4490T;

    /* JADX INFO: renamed from: U */
    public Uri f4491U;

    /* JADX INFO: renamed from: V */
    public boolean f4492V;

    /* JADX INFO: renamed from: W */
    public Bitmap f4493W;

    /* JADX INFO: renamed from: X */
    public int f4494X;

    /* JADX INFO: renamed from: Y */
    public final boolean f4495Y;

    /* JADX INFO: renamed from: l */
    public final C1405E f4496l;

    /* JADX INFO: renamed from: m */
    public final C1020G f4497m;

    /* JADX INFO: renamed from: n */
    public C1451x f4498n;

    /* JADX INFO: renamed from: o */
    public C1403C f4499o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f4500p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f4501q;

    /* JADX INFO: renamed from: r */
    public final ArrayList f4502r;

    /* JADX INFO: renamed from: s */
    public final ArrayList f4503s;

    /* JADX INFO: renamed from: t */
    public final Context f4504t;

    /* JADX INFO: renamed from: u */
    public boolean f4505u;

    /* JADX INFO: renamed from: v */
    public boolean f4506v;

    /* JADX INFO: renamed from: w */
    public long f4507w;

    /* JADX INFO: renamed from: x */
    public final HandlerC0881q f4508x;

    /* JADX INFO: renamed from: y */
    public RecyclerView f4509y;

    /* JADX INFO: renamed from: z */
    public C1026M f4510z;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DialogC1028O(Context context) {
        ContextThemeWrapper contextThemeWrapperM3316i = AbstractC1303m.m3316i(context, false);
        int iM3328u = AbstractC1303m.m3328u(contextThemeWrapperM3316i, R.attr.mediaRouteTheme);
        super(contextThemeWrapperM3316i, iM3328u == 0 ? AbstractC1303m.m3324q(contextThemeWrapperM3316i) : iM3328u);
        this.f4498n = C1451x.f6416c;
        this.f4500p = new ArrayList();
        this.f4501q = new ArrayList();
        this.f4502r = new ArrayList();
        this.f4503s = new ArrayList();
        this.f4508x = new HandlerC0881q(3, this);
        Context context2 = getContext();
        this.f4504t = context2;
        this.f4496l = C1405E.m3512d(context2);
        this.f4495Y = C1405E.m3515g();
        this.f4497m = new C1020G(this, 0);
        this.f4499o = C1405E.m3514f();
        this.f4487Q = new C1048q(this, 1);
        m2622j(C1405E.m3513e());
    }

    /* JADX INFO: renamed from: h */
    public final void m2620h(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1403C c1403c = (C1403C) list.get(size);
            if (c1403c.m3494d() || !c1403c.f6222g || !c1403c.m3498h(this.f4498n) || this.f4499o == c1403c) {
                list.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2621i() {
        MediaDescriptionCompat mediaDescriptionCompat = this.f4488R;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.f3622k;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f3623l : null;
        AsyncTaskC1017D asyncTaskC1017D = this.f4489S;
        Bitmap bitmap2 = asyncTaskC1017D == null ? this.f4490T : asyncTaskC1017D.f4413a;
        Uri uri2 = asyncTaskC1017D == null ? this.f4491U : asyncTaskC1017D.f4414b;
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            AsyncTaskC1017D asyncTaskC1017D2 = this.f4489S;
            if (asyncTaskC1017D2 != null) {
                asyncTaskC1017D2.cancel(true);
            }
            AsyncTaskC1017D asyncTaskC1017D3 = new AsyncTaskC1017D(this);
            this.f4489S = asyncTaskC1017D3;
            asyncTaskC1017D3.execute(new Void[0]);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2622j(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        C0106b c0106b = this.f4486P;
        C1048q c1048q = this.f4487Q;
        if (c0106b != null) {
            c0106b.m510H(c1048q);
            this.f4486P = null;
        }
        if (mediaSessionCompat$Token != null && this.f4506v) {
            C0106b c0106b2 = new C0106b(this.f4504t, mediaSessionCompat$Token);
            this.f4486P = c0106b2;
            c0106b2.m509G(c1048q);
            MediaMetadata metadata = ((C0872h) this.f4486P.f140h).f3686a.getMetadata();
            if (metadata != null) {
                C2018e c2018e = MediaMetadataCompat.f3627j;
                Parcel parcelObtain = Parcel.obtain();
                metadata.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                mediaMetadataCompatCreateFromParcel.f3632h = metadata;
            } else {
                mediaMetadataCompatCreateFromParcel = null;
            }
            this.f4488R = mediaMetadataCompatCreateFromParcel != null ? mediaMetadataCompatCreateFromParcel.m2118d() : null;
            m2621i();
            m2625m();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2623k(C1451x c1451x) {
        if (c1451x == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f4498n.equals(c1451x)) {
            return;
        }
        this.f4498n = c1451x;
        if (this.f4506v) {
            C1405E c1405e = this.f4496l;
            C1020G c1020g = this.f4497m;
            c1405e.m3518h(c1020g);
            c1405e.m3517a(c1451x, c1020g, 1);
            m2626n();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2624l() {
        Context context = this.f4504t;
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : AbstractC0664e.m1760z(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        this.f4490T = null;
        this.f4491U = null;
        m2621i();
        m2625m();
        m2627o();
    }

    /* JADX INFO: renamed from: m */
    public final void m2625m() {
        Bitmap bitmap;
        if ((this.f4473C != null || this.f4475E) ? true : !this.f4505u) {
            this.f4477G = true;
            return;
        }
        this.f4477G = false;
        if (!this.f4499o.m3497g() || this.f4499o.m3494d()) {
            dismiss();
        }
        if (!this.f4492V || (((bitmap = this.f4493W) != null && bitmap.isRecycled()) || this.f4493W == null)) {
            Bitmap bitmap2 = this.f4493W;
            if (bitmap2 != null && bitmap2.isRecycled()) {
                Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.f4493W);
            }
            this.f4482L.setVisibility(8);
            this.f4481K.setVisibility(8);
            this.f4480J.setImageBitmap(null);
        } else {
            this.f4482L.setVisibility(0);
            this.f4482L.setImageBitmap(this.f4493W);
            this.f4482L.setBackgroundColor(this.f4494X);
            this.f4481K.setVisibility(0);
            Bitmap bitmap3 = this.f4493W;
            RenderScript renderScriptCreate = RenderScript.create(this.f4504t);
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap3);
            Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            scriptIntrinsicBlurCreate.setRadius(10.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            Bitmap bitmapCopy = bitmap3.copy(bitmap3.getConfig(), true);
            allocationCreateTyped.copyTo(bitmapCopy);
            allocationCreateFromBitmap.destroy();
            allocationCreateTyped.destroy();
            scriptIntrinsicBlurCreate.destroy();
            renderScriptCreate.destroy();
            this.f4480J.setImageBitmap(bitmapCopy);
        }
        this.f4492V = false;
        this.f4493W = null;
        this.f4494X = 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.f4488R;
        CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.f3619h;
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.f4488R;
        CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f3620i : null;
        boolean zIsEmpty2 = TextUtils.isEmpty(charSequence2);
        if (zIsEmpty) {
            this.f4483M.setText(this.f4485O);
        } else {
            this.f4483M.setText(charSequence);
        }
        if (zIsEmpty2) {
            this.f4484N.setVisibility(8);
        } else {
            this.f4484N.setText(charSequence2);
            this.f4484N.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2626n() {
        ArrayList arrayList = this.f4500p;
        arrayList.clear();
        ArrayList arrayList2 = this.f4501q;
        arrayList2.clear();
        ArrayList arrayList3 = this.f4502r;
        arrayList3.clear();
        arrayList.addAll(Collections.unmodifiableList(this.f4499o.f6237v));
        C1402B c1402b = this.f4499o.f6216a;
        c1402b.getClass();
        C1405E.m3510b();
        for (C1403C c1403c : Collections.unmodifiableList(c1402b.f6212b)) {
            C1447t c1447tM3492b = this.f4499o.m3492b(c1403c);
            if (c1447tM3492b != null) {
                C1445r c1445r = (C1445r) c1447tM3492b.f6406h;
                if (c1445r != null && c1445r.f6398d) {
                    arrayList2.add(c1403c);
                }
                if (c1445r != null && c1445r.f6399e) {
                    arrayList3.add(c1403c);
                }
            }
        }
        m2620h(arrayList2);
        m2620h(arrayList3);
        C1036e c1036e = C1036e.f4554j;
        Collections.sort(arrayList, c1036e);
        Collections.sort(arrayList2, c1036e);
        Collections.sort(arrayList3, c1036e);
        this.f4510z.m2617i();
    }

    /* JADX INFO: renamed from: o */
    public final void m2627o() {
        if (this.f4506v) {
            if (SystemClock.uptimeMillis() - this.f4507w < 300) {
                HandlerC0881q handlerC0881q = this.f4508x;
                handlerC0881q.removeMessages(1);
                handlerC0881q.sendEmptyMessageAtTime(1, this.f4507w + 300);
                return;
            }
            if ((this.f4473C != null || this.f4475E) ? true : !this.f4505u) {
                this.f4476F = true;
                return;
            }
            this.f4476F = false;
            if (!this.f4499o.m3497g() || this.f4499o.m3494d()) {
                dismiss();
            }
            this.f4507w = SystemClock.uptimeMillis();
            this.f4510z.m2616h();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4506v = true;
        this.f4496l.m3517a(this.f4498n, this.f4497m, 1);
        m2626n();
        m2622j(C1405E.m3513e());
    }

    @Override // p091e.AbstractDialogC1460E, androidx.activity.DialogC0901k, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        Context context = this.f4504t;
        getWindow().getDecorView().setBackgroundColor(AbstractC0230e.m739q(context, AbstractC1303m.m3330w(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.f4478H = imageButton;
        imageButton.setColorFilter(-1);
        this.f4478H.setOnClickListener(new ViewOnClickListenerC1016C(this, 0));
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.f4479I = button;
        button.setTextColor(-1);
        this.f4479I.setOnClickListener(new ViewOnClickListenerC1016C(this, 1));
        this.f4510z = new C1026M(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.f4509y = recyclerView;
        recyclerView.setAdapter(this.f4510z);
        this.f4509y.setLayoutManager(new LinearLayoutManager());
        this.f4471A = new C1027N(this);
        this.f4472B = new HashMap();
        this.f4474D = new HashMap();
        this.f4480J = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.f4481K = findViewById(R.id.mr_cast_meta_black_scrim);
        this.f4482L = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.f4483M = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.f4484N = textView2;
        textView2.setTextColor(-1);
        this.f4485O = context.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.f4505u = true;
        m2624l();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4506v = false;
        this.f4496l.m3518h(this.f4497m);
        this.f4508x.removeCallbacksAndMessages(null);
        m2622j(null);
    }

    /* JADX INFO: renamed from: p */
    public final void m2628p() {
        if (this.f4476F) {
            m2627o();
        }
        if (this.f4477G) {
            m2625m();
        }
    }
}
