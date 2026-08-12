package android.support.v4.media;

import android.media.Rating;

/* JADX INFO: renamed from: android.support.v4.media.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0857c {
    /* JADX INFO: renamed from: a */
    public static float m2137a(Rating rating) {
        return rating.getPercentRating();
    }

    /* JADX INFO: renamed from: b */
    public static int m2138b(Rating rating) {
        return rating.getRatingStyle();
    }

    /* JADX INFO: renamed from: c */
    public static float m2139c(Rating rating) {
        return rating.getStarRating();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2140d(Rating rating) {
        return rating.hasHeart();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2141e(Rating rating) {
        return rating.isRated();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2142f(Rating rating) {
        return rating.isThumbUp();
    }

    /* JADX INFO: renamed from: g */
    public static Rating m2143g(boolean z3) {
        return Rating.newHeartRating(z3);
    }

    /* JADX INFO: renamed from: h */
    public static Rating m2144h(float f) {
        return Rating.newPercentageRating(f);
    }

    /* JADX INFO: renamed from: i */
    public static Rating m2145i(int i3, float f) {
        return Rating.newStarRating(i3, f);
    }

    /* JADX INFO: renamed from: j */
    public static Rating m2146j(boolean z3) {
        return Rating.newThumbRating(z3);
    }

    /* JADX INFO: renamed from: k */
    public static Rating m2147k(int i3) {
        return Rating.newUnratedRating(i3);
    }
}
