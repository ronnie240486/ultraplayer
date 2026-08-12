package p104h1;

/* JADX INFO: renamed from: h1.O */
/* JADX INFO: loaded from: classes.dex */
public final class C1631O {

    /* JADX INFO: renamed from: a */
    public int f7385a;

    /* JADX INFO: renamed from: b */
    public int f7386b;

    /* JADX INFO: renamed from: c */
    public int f7387c;

    /* JADX INFO: renamed from: d */
    public int f7388d;

    /* JADX INFO: renamed from: e */
    public boolean f7389e;

    /* JADX INFO: renamed from: f */
    public boolean f7390f;

    /* JADX INFO: renamed from: g */
    public boolean f7391g;

    /* JADX INFO: renamed from: h */
    public boolean f7392h;

    /* JADX INFO: renamed from: i */
    public boolean f7393i;

    /* JADX INFO: renamed from: j */
    public boolean f7394j;

    /* JADX INFO: renamed from: k */
    public int f7395k;

    /* JADX INFO: renamed from: l */
    public long f7396l;

    /* JADX INFO: renamed from: m */
    public int f7397m;

    /* JADX INFO: renamed from: a */
    public final void m4044a(int i3) {
        if ((this.f7387c & i3) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i3) + " but it is " + Integer.toBinaryString(this.f7387c));
    }

    /* JADX INFO: renamed from: b */
    public final int m4045b() {
        return this.f7390f ? this.f7385a - this.f7386b : this.f7388d;
    }

    public final String toString() {
        return "State{mTargetPosition=-1, mData=null, mItemCount=" + this.f7388d + ", mIsMeasuring=" + this.f7392h + ", mPreviousLayoutItemCount=" + this.f7385a + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f7386b + ", mStructureChanged=" + this.f7389e + ", mInPreLayout=" + this.f7390f + ", mRunSimpleAnimations=" + this.f7393i + ", mRunPredictiveAnimations=" + this.f7394j + '}';
    }
}
