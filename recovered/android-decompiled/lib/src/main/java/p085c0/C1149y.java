package p085c0;

import android.media.AudioTrack;
import android.support.v4.media.session.C0858A;
import p000A.C0031d;
import p077a0.C0793D;

/* JADX INFO: renamed from: c0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1149y extends AudioTrack.StreamEventCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0858A f5338a;

    public C1149y(C0858A c0858a) {
        this.f5338a = c0858a;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i3) {
        C1150z c1150z;
        C0031d c0031d;
        C0793D c0793d;
        if (audioTrack.equals(((C1150z) this.f5338a.f3641j).f5398v) && (c0031d = (c1150z = (C1150z) this.f5338a.f3641j).f5394r) != null && c1150z.f5363V && (c0793d = ((C1120B) c0031d.f38h).f7289L) != null) {
            c0793d.m1932a();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(((C1150z) this.f5338a.f3641j).f5398v)) {
            ((C1150z) this.f5338a.f3641j).f5362U = true;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        C1150z c1150z;
        C0031d c0031d;
        C0793D c0793d;
        if (audioTrack.equals(((C1150z) this.f5338a.f3641j).f5398v) && (c0031d = (c1150z = (C1150z) this.f5338a.f3641j).f5394r) != null && c1150z.f5363V && (c0793d = ((C1120B) c0031d.f38h).f7289L) != null) {
            c0793d.m1932a();
        }
    }
}
