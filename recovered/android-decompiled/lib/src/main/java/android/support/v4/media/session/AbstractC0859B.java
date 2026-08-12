package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.media.session.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0859B {
    /* JADX INFO: renamed from: a */
    public static void m2185a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }

    /* JADX INFO: renamed from: b */
    public static PlaybackState.CustomAction m2186b(PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: c */
    public static PlaybackState m2187c(PlaybackState.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: d */
    public static PlaybackState.Builder m2188d() {
        return new PlaybackState.Builder();
    }

    /* JADX INFO: renamed from: e */
    public static PlaybackState.CustomAction.Builder m2189e(String str, CharSequence charSequence, int i3) {
        return new PlaybackState.CustomAction.Builder(str, charSequence, i3);
    }

    /* JADX INFO: renamed from: f */
    public static String m2190f(PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    /* JADX INFO: renamed from: g */
    public static long m2191g(PlaybackState playbackState) {
        return playbackState.getActions();
    }

    /* JADX INFO: renamed from: h */
    public static long m2192h(PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }

    /* JADX INFO: renamed from: i */
    public static long m2193i(PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    /* JADX INFO: renamed from: j */
    public static List<PlaybackState.CustomAction> m2194j(PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    /* JADX INFO: renamed from: k */
    public static CharSequence m2195k(PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    /* JADX INFO: renamed from: l */
    public static Bundle m2196l(PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    /* JADX INFO: renamed from: m */
    public static int m2197m(PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }

    /* JADX INFO: renamed from: n */
    public static long m2198n(PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    /* JADX INFO: renamed from: o */
    public static CharSequence m2199o(PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    /* JADX INFO: renamed from: p */
    public static float m2200p(PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    /* JADX INFO: renamed from: q */
    public static long m2201q(PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    /* JADX INFO: renamed from: r */
    public static int m2202r(PlaybackState playbackState) {
        return playbackState.getState();
    }

    /* JADX INFO: renamed from: s */
    public static void m2203s(PlaybackState.Builder builder, long j3) {
        builder.setActions(j3);
    }

    /* JADX INFO: renamed from: t */
    public static void m2204t(PlaybackState.Builder builder, long j3) {
        builder.setActiveQueueItemId(j3);
    }

    /* JADX INFO: renamed from: u */
    public static void m2205u(PlaybackState.Builder builder, long j3) {
        builder.setBufferedPosition(j3);
    }

    /* JADX INFO: renamed from: v */
    public static void m2206v(PlaybackState.Builder builder, CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    /* JADX INFO: renamed from: w */
    public static void m2207w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* JADX INFO: renamed from: x */
    public static void m2208x(PlaybackState.Builder builder, int i3, long j3, float f, long j4) {
        builder.setState(i3, j3, f, j4);
    }
}
