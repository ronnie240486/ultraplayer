package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import p063V1.BinderC0630b;
import p063V1.InterfaceC0629a;
import p066W1.AbstractC0664e;
import p069X1.AbstractBinderC0699b;
import p072Y1.CallableC0764a;
import p122m1.AbstractC2003a;

/* JADX INFO: loaded from: classes.dex */
public class FlagProviderImpl extends AbstractBinderC0699b {

    /* JADX INFO: renamed from: b */
    public boolean f5538b;

    /* JADX INFO: renamed from: c */
    public SharedPreferences f5539c;

    public FlagProviderImpl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        this.f5538b = false;
    }

    @Override // p069X1.InterfaceC0700c
    public boolean getBooleanFlagValue(String str, boolean z3, int i3) {
        if (!this.f5538b) {
            return z3;
        }
        SharedPreferences sharedPreferences = this.f5539c;
        Boolean boolValueOf = Boolean.valueOf(z3);
        try {
            boolValueOf = (Boolean) AbstractC0664e.m1740a0(new CallableC0764a(sharedPreferences, str, boolValueOf, 0));
        } catch (Exception e3) {
            String strValueOf = String.valueOf(e3.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return boolValueOf.booleanValue();
    }

    @Override // p069X1.InterfaceC0700c
    public int getIntFlagValue(String str, int i3, int i4) {
        if (!this.f5538b) {
            return i3;
        }
        SharedPreferences sharedPreferences = this.f5539c;
        Integer numValueOf = Integer.valueOf(i3);
        try {
            numValueOf = (Integer) AbstractC0664e.m1740a0(new CallableC0764a(sharedPreferences, str, numValueOf, 1));
        } catch (Exception e3) {
            String strValueOf = String.valueOf(e3.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return numValueOf.intValue();
    }

    @Override // p069X1.InterfaceC0700c
    public long getLongFlagValue(String str, long j3, int i3) {
        if (!this.f5538b) {
            return j3;
        }
        SharedPreferences sharedPreferences = this.f5539c;
        Long lValueOf = Long.valueOf(j3);
        try {
            lValueOf = (Long) AbstractC0664e.m1740a0(new CallableC0764a(sharedPreferences, str, lValueOf, 2));
        } catch (Exception e3) {
            String strValueOf = String.valueOf(e3.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return lValueOf.longValue();
    }

    @Override // p069X1.InterfaceC0700c
    public String getStringFlagValue(String str, String str2, int i3) {
        if (this.f5538b) {
            try {
                return (String) AbstractC0664e.m1740a0(new CallableC0764a(this.f5539c, str, str2, 3));
            } catch (Exception e3) {
                String strValueOf = String.valueOf(e3.getMessage());
                Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            }
        }
        return str2;
    }

    @Override // p069X1.InterfaceC0700c
    public void init(InterfaceC0629a interfaceC0629a) {
        Context context = (Context) BinderC0630b.m1559w0(interfaceC0629a);
        if (this.f5538b) {
            return;
        }
        try {
            this.f5539c = AbstractC2003a.m4550w(context.createPackageContext("com.google.android.gms", 0));
            this.f5538b = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e3) {
            String strValueOf = String.valueOf(e3.getMessage());
            Log.w("FlagProviderImpl", strValueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(strValueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
