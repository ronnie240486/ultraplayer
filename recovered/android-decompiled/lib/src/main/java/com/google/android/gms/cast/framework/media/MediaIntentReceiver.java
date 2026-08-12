package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.gms.internal.cast.AbstractC1339v;
import p013E1.C0141p;
import p016F1.AbstractC0191h;
import p016F1.C0185b;
import p016F1.C0187d;
import p016F1.C0192i;
import p016F1.C0207x;
import p016F1.InterfaceC0209z;
import p019G1.C0233h;
import p019G1.C0234i;
import p019G1.C0239n;
import p028J1.C0296b;
import p046P1.AbstractC0491s;

/* JADX INFO: loaded from: classes.dex */
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";
    private static final String TAG = "MediaIntentReceiver";
    private static final C0296b log = new C0296b(TAG, null);

    private static C0233h getRemoteMediaClient(C0187d c0187d) {
        boolean z3 = false;
        if (c0187d == null) {
            return null;
        }
        AbstractC0491s.m1210b();
        InterfaceC0209z interfaceC0209z = c0187d.f468a;
        if (interfaceC0209z != null) {
            try {
                C0207x c0207x = (C0207x) interfaceC0209z;
                Parcel parcelM1895q0 = c0207x.m1895q0(c0207x.m1894e0(), 5);
                int i3 = AbstractC1339v.f5981a;
                boolean z4 = parcelM1895q0.readInt() != 0;
                parcelM1895q0.recycle();
                z3 = z4;
            } catch (RemoteException e3) {
                AbstractC0191h.f467b.m830a(e3, "Unable to call %s on %s.", "isConnected", InterfaceC0209z.class.getSimpleName());
            }
        }
        if (!z3) {
            return null;
        }
        AbstractC0491s.m1210b();
        return c0187d.f463j;
    }

    private void seek(C0187d c0187d, long j3) {
        C0233h remoteMediaClient;
        if (j3 == 0 || (remoteMediaClient = getRemoteMediaClient(c0187d)) == null || remoteMediaClient.m759i() || remoteMediaClient.m763m()) {
            return;
        }
        C0141p c0141p = new C0141p(remoteMediaClient.m751a() + j3);
        AbstractC0491s.m1210b();
        if (remoteMediaClient.m772w()) {
            C0233h.m750x(new C0239n(remoteMediaClient, c0141p, 1));
        } else {
            C0233h.m749r();
        }
    }

    private void togglePlayback(C0187d c0187d) {
        C0233h remoteMediaClient = getRemoteMediaClient(c0187d);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.m766p();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        log.m831b("onReceive action: %s", action);
        if (action == null) {
            return;
        }
        C0185b c0185bM670a = C0185b.m670a(context);
        c0185bM670a.getClass();
        AbstractC0491s.m1210b();
        C0192i c0192i = c0185bM670a.f428c;
        AbstractC0191h abstractC0191hM680c = c0192i.m680c();
        if (abstractC0191hM680c != null) {
            switch (action) {
                case "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK":
                    onReceiveActionTogglePlayback(abstractC0191hM680c);
                    break;
                case "com.google.android.gms.cast.framework.action.SKIP_NEXT":
                    onReceiveActionSkipNext(abstractC0191hM680c);
                    break;
                case "com.google.android.gms.cast.framework.action.SKIP_PREV":
                    onReceiveActionSkipPrev(abstractC0191hM680c);
                    break;
                case "com.google.android.gms.cast.framework.action.FORWARD":
                    onReceiveActionForward(abstractC0191hM680c, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                    break;
                case "com.google.android.gms.cast.framework.action.REWIND":
                    onReceiveActionRewind(abstractC0191hM680c, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                    break;
                case "com.google.android.gms.cast.framework.action.STOP_CASTING":
                    c0192i.m679b(true);
                    break;
                case "com.google.android.gms.cast.framework.action.DISCONNECT":
                    c0192i.m679b(false);
                    break;
                case "android.intent.action.MEDIA_BUTTON":
                    onReceiveActionMediaButton(abstractC0191hM680c, intent);
                    break;
                default:
                    onReceiveOtherAction(context, action, intent);
                    break;
            }
        }
    }

    public void onReceiveActionForward(AbstractC0191h abstractC0191h, long j3) {
        if (abstractC0191h instanceof C0187d) {
            seek((C0187d) abstractC0191h, j3);
        }
    }

    public void onReceiveActionMediaButton(AbstractC0191h abstractC0191h, Intent intent) {
        if ((abstractC0191h instanceof C0187d) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            AbstractC0491s.m1213e(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((C0187d) abstractC0191h);
            }
        }
    }

    public void onReceiveActionRewind(AbstractC0191h abstractC0191h, long j3) {
        if (abstractC0191h instanceof C0187d) {
            seek((C0187d) abstractC0191h, -j3);
        }
    }

    public void onReceiveActionSkipNext(AbstractC0191h abstractC0191h) {
        C0233h remoteMediaClient;
        if (!(abstractC0191h instanceof C0187d) || (remoteMediaClient = getRemoteMediaClient((C0187d) abstractC0191h)) == null || remoteMediaClient.m763m()) {
            return;
        }
        AbstractC0491s.m1210b();
        if (remoteMediaClient.m772w()) {
            C0233h.m750x(new C0234i(remoteMediaClient, 2));
        } else {
            C0233h.m749r();
        }
    }

    public void onReceiveActionSkipPrev(AbstractC0191h abstractC0191h) {
        C0233h remoteMediaClient;
        if (!(abstractC0191h instanceof C0187d) || (remoteMediaClient = getRemoteMediaClient((C0187d) abstractC0191h)) == null || remoteMediaClient.m763m()) {
            return;
        }
        AbstractC0491s.m1210b();
        if (remoteMediaClient.m772w()) {
            C0233h.m750x(new C0234i(remoteMediaClient, 1));
        } else {
            C0233h.m749r();
        }
    }

    public void onReceiveActionTogglePlayback(AbstractC0191h abstractC0191h) {
        if (abstractC0191h instanceof C0187d) {
            togglePlayback((C0187d) abstractC0191h);
        }
    }

    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }

    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }
}
