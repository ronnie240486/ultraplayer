package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.support.v4.media.session.C0872h;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.zuxoplayer.app.R;
import p009D0.C0106b;
import p089d1.C1405E;

/* JADX INFO: renamed from: androidx.mediarouter.app.o */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1046o implements View.OnClickListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4591g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DialogC1051t f4592h;

    public /* synthetic */ ViewOnClickListenerC1046o(DialogC1051t dialogC1051t, int i3) {
        this.f4591g = i3;
        this.f4592h = dialogC1051t;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3;
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        switch (this.f4591g) {
            case 0:
                int id = view.getId();
                DialogC1051t dialogC1051t = this.f4592h;
                if (id == 16908313 || id == 16908314) {
                    if (dialogC1051t.f4650o.m3497g()) {
                        i3 = id == 16908313 ? 2 : 1;
                        dialogC1051t.f4646m.getClass();
                        C1405E.m3516i(i3);
                    }
                    dialogC1051t.dismiss();
                    break;
                } else if (id != R.id.mr_control_playback_ctrl) {
                    if (id == R.id.mr_close) {
                        dialogC1051t.dismiss();
                    }
                    break;
                } else {
                    C0106b c0106b = dialogC1051t.f4632Y;
                    if (c0106b != null && (playbackStateCompat = dialogC1051t.f4634a0) != null) {
                        int i4 = 0;
                        i3 = playbackStateCompat.f3662g != 3 ? 0 : 1;
                        if (i3 != 0 && (playbackStateCompat.f3666k & 514) != 0) {
                            c0106b.m508F().f3691a.pause();
                            i4 = R.string.mr_controller_pause;
                        } else if (i3 != 0 && (playbackStateCompat.f3666k & 1) != 0) {
                            c0106b.m508F().f3691a.stop();
                            i4 = R.string.mr_controller_stop;
                        } else if (i3 == 0 && (playbackStateCompat.f3666k & 516) != 0) {
                            c0106b.m508F().f3691a.play();
                            i4 = R.string.mr_controller_play;
                        }
                        AccessibilityManager accessibilityManager = dialogC1051t.f4661t0;
                        if (accessibilityManager != null && accessibilityManager.isEnabled() && i4 != 0) {
                            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
                            accessibilityEventObtain.setPackageName(dialogC1051t.f4652p.getPackageName());
                            accessibilityEventObtain.setClassName(ViewOnClickListenerC1046o.class.getName());
                            accessibilityEventObtain.getText().add(dialogC1051t.f4652p.getString(i4));
                            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
                            break;
                        }
                    }
                }
                break;
            case 1:
                DialogC1051t dialogC1051t2 = this.f4592h;
                boolean z3 = dialogC1051t2.f4644k0;
                dialogC1051t2.f4644k0 = !z3;
                if (!z3) {
                    dialogC1051t2.f4618K.setVisibility(0);
                }
                dialogC1051t2.f4655q0 = dialogC1051t2.f4644k0 ? dialogC1051t2.f4657r0 : dialogC1051t2.f4659s0;
                dialogC1051t2.m2664u(true);
                break;
            case 2:
                this.f4592h.dismiss();
                break;
            default:
                DialogC1051t dialogC1051t3 = this.f4592h;
                C0106b c0106b2 = dialogC1051t3.f4632Y;
                if (c0106b2 != null && (sessionActivity = ((C0872h) c0106b2.f140h).f3686a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        dialogC1051t3.dismiss();
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                    }
                    break;
                }
                break;
        }
    }
}
