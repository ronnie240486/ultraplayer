package p113k;

import android.graphics.drawable.LayerDrawable;

/* JADX INFO: renamed from: k.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1792A {
    /* JADX INFO: renamed from: a */
    public static void m4282a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i3) {
        layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
        layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
        layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
        layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
        layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
        layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
        layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
        layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
        layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
    }
}
