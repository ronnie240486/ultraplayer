package p025I1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;

/* JADX INFO: renamed from: I1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0283b extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CastSeekBar f765a;

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        CastSeekBar castSeekBar = this.f765a;
        castSeekBar.f5481g.getClass();
        accessibilityEvent.setItemCount(1);
        accessibilityEvent.setCurrentItemIndex(castSeekBar.getProgress());
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i3, Bundle bundle) {
        if (view.isEnabled()) {
            if (super.performAccessibilityAction(view, i3, bundle)) {
                return true;
            }
            if (i3 == 4096 || i3 == 8192) {
                int i4 = CastSeekBar.f5480p;
                CastSeekBar castSeekBar = this.f765a;
                castSeekBar.f5481g.getClass();
                castSeekBar.getProgress();
                castSeekBar.f5481g.getClass();
                return false;
            }
        }
        return false;
    }
}
