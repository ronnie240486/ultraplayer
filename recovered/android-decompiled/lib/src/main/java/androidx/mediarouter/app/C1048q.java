package androidx.mediarouter.app;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.BinderC0871g;
import android.support.v4.media.session.C0869e;
import android.support.v4.media.session.HandlerC0870f;
import android.support.v4.media.session.PlaybackStateCompat;
import p009D0.C0106b;
import p091e.AbstractDialogC1460E;

/* JADX INFO: renamed from: androidx.mediarouter.app.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1048q implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a */
    public final C0869e f4598a = new C0869e(this);

    /* JADX INFO: renamed from: b */
    public HandlerC0870f f4599b;

    /* JADX INFO: renamed from: c */
    public BinderC0871g f4600c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4601d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractDialogC1460E f4602e;

    public C1048q(AbstractDialogC1460E abstractDialogC1460E, int i3) {
        this.f4601d = i3;
        this.f4602e = abstractDialogC1460E;
    }

    /* JADX INFO: renamed from: a */
    public final void m2646a(MediaMetadataCompat mediaMetadataCompat) {
        switch (this.f4601d) {
            case 0:
                MediaDescriptionCompat mediaDescriptionCompatM2118d = mediaMetadataCompat == null ? null : mediaMetadataCompat.m2118d();
                DialogC1051t dialogC1051t = (DialogC1051t) this.f4602e;
                dialogC1051t.f4635b0 = mediaDescriptionCompatM2118d;
                dialogC1051t.m2662s();
                dialogC1051t.m2661r(false);
                break;
            default:
                MediaDescriptionCompat mediaDescriptionCompatM2118d2 = mediaMetadataCompat == null ? null : mediaMetadataCompat.m2118d();
                DialogC1028O dialogC1028O = (DialogC1028O) this.f4602e;
                dialogC1028O.f4488R = mediaDescriptionCompatM2118d2;
                dialogC1028O.m2621i();
                dialogC1028O.m2625m();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2647b(PlaybackStateCompat playbackStateCompat) {
        switch (this.f4601d) {
            case 0:
                DialogC1051t dialogC1051t = (DialogC1051t) this.f4602e;
                dialogC1051t.f4634a0 = playbackStateCompat;
                dialogC1051t.m2661r(false);
                break;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        m2650e(8, null, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m2649d() {
        switch (this.f4601d) {
            case 0:
                DialogC1051t dialogC1051t = (DialogC1051t) this.f4602e;
                C0106b c0106b = dialogC1051t.f4632Y;
                if (c0106b != null) {
                    c0106b.m510H(dialogC1051t.f4633Z);
                    dialogC1051t.f4632Y = null;
                }
                break;
            default:
                DialogC1028O dialogC1028O = (DialogC1028O) this.f4602e;
                C0106b c0106b2 = dialogC1028O.f4486P;
                if (c0106b2 != null) {
                    c0106b2.m510H(dialogC1028O.f4487Q);
                    dialogC1028O.f4486P = null;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2650e(int i3, Object obj, Bundle bundle) {
        HandlerC0870f handlerC0870f = this.f4599b;
        if (handlerC0870f != null) {
            Message messageObtainMessage = handlerC0870f.obtainMessage(i3, obj);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2651f(Handler handler) {
        if (handler != null) {
            HandlerC0870f handlerC0870f = new HandlerC0870f(this, handler.getLooper());
            this.f4599b = handlerC0870f;
            handlerC0870f.f3683b = true;
        } else {
            HandlerC0870f handlerC0870f2 = this.f4599b;
            if (handlerC0870f2 != null) {
                handlerC0870f2.f3683b = false;
                handlerC0870f2.removeCallbacksAndMessages(null);
                this.f4599b = null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2648c(PlaybackStateCompat playbackStateCompat) {
    }
}
