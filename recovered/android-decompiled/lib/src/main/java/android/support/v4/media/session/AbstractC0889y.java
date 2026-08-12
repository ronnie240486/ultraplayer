package android.support.v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* JADX INFO: renamed from: android.support.v4.media.session.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0889y {
    /* JADX INFO: renamed from: a */
    public static MediaSession.QueueItem m2285a(MediaDescription mediaDescription, long j3) {
        return new MediaSession.QueueItem(mediaDescription, j3);
    }

    /* JADX INFO: renamed from: b */
    public static MediaDescription m2286b(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    /* JADX INFO: renamed from: c */
    public static long m2287c(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }
}
