package androidx.mediarouter.app;

import android.widget.SeekBar;
import p089d1.C1403C;

/* JADX INFO: renamed from: androidx.mediarouter.app.N */
/* JADX INFO: loaded from: classes.dex */
public final class C1027N implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogC1028O f4469a;

    public C1027N(DialogC1028O dialogC1028O) {
        this.f4469a = dialogC1028O;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i3, boolean z3) {
        if (z3) {
            C1403C c1403c = (C1403C) seekBar.getTag();
            AbstractC1019F abstractC1019F = (AbstractC1019F) this.f4469a.f4472B.get(c1403c.f6218c);
            if (abstractC1019F != null) {
                abstractC1019F.m2600q(i3 == 0);
            }
            c1403c.m3500j(i3);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        DialogC1028O dialogC1028O = this.f4469a;
        if (dialogC1028O.f4473C != null) {
            dialogC1028O.f4508x.removeMessages(2);
        }
        dialogC1028O.f4473C = (C1403C) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f4469a.f4508x.sendEmptyMessageDelayed(2, 500L);
    }
}
