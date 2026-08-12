package androidx.mediarouter.app;

import android.widget.SeekBar;
import p089d1.C1403C;

/* JADX INFO: renamed from: androidx.mediarouter.app.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1049r implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a */
    public final RunnableC1040i f4603a = new RunnableC1040i(1, this);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DialogC1051t f4604b;

    public C1049r(DialogC1051t dialogC1051t) {
        this.f4604b = dialogC1051t;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i3, boolean z3) {
        if (z3) {
            C1403C c1403c = (C1403C) seekBar.getTag();
            int i4 = DialogC1051t.f4607v0;
            c1403c.m3500j(i3);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        DialogC1051t dialogC1051t = this.f4604b;
        if (dialogC1051t.f4626S != null) {
            dialogC1051t.f4624Q.removeCallbacks(this.f4603a);
        }
        dialogC1051t.f4626S = (C1403C) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f4604b.f4624Q.postDelayed(this.f4603a, 500L);
    }
}
