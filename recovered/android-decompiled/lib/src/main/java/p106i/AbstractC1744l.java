package p106i;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* JADX INFO: renamed from: i.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1744l {
    /* JADX INFO: renamed from: a */
    public static void m4197a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i3) {
        callback.onProvideKeyboardShortcuts(list, menu, i3);
    }
}
