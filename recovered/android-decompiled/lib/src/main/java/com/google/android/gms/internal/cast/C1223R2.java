package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.R2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1223R2 extends AbstractC1231T2 {
    @Override // com.google.android.gms.internal.cast.AbstractC1231T2
    /* JADX INFO: renamed from: a */
    public final double mo3185a(long j3, Object obj) {
        return Double.longBitsToDouble(this.f5711a.getLong(obj, j3));
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1231T2
    /* JADX INFO: renamed from: b */
    public final float mo3186b(long j3, Object obj) {
        return Float.intBitsToFloat(this.f5711a.getInt(obj, j3));
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1231T2
    /* JADX INFO: renamed from: c */
    public final void mo3187c(Object obj, long j3, boolean z3) {
        if (AbstractC1235U2.f5720g) {
            AbstractC1235U2.m3196b(obj, j3, z3 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC1235U2.m3197c(obj, j3, z3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1231T2
    /* JADX INFO: renamed from: d */
    public final void mo3188d(Object obj, long j3, byte b3) {
        if (AbstractC1235U2.f5720g) {
            AbstractC1235U2.m3196b(obj, j3, b3);
        } else {
            AbstractC1235U2.m3197c(obj, j3, b3);
        }
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1231T2
    /* JADX INFO: renamed from: e */
    public final void mo3189e(Object obj, long j3, double d3) {
        this.f5711a.putLong(obj, j3, Double.doubleToLongBits(d3));
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1231T2
    /* JADX INFO: renamed from: f */
    public final void mo3190f(Object obj, long j3, float f) {
        this.f5711a.putInt(obj, j3, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1231T2
    /* JADX INFO: renamed from: g */
    public final boolean mo3191g(long j3, Object obj) {
        return AbstractC1235U2.f5720g ? AbstractC1235U2.m3206l(j3, obj) : AbstractC1235U2.m3207m(j3, obj);
    }
}
