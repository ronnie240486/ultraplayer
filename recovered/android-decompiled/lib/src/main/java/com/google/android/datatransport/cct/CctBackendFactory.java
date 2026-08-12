package com.google.android.datatransport.cct;

import p130o1.C2080b;
import p142r1.AbstractC2198c;
import p142r1.C2197b;
import p142r1.InterfaceC2202g;

/* JADX INFO: loaded from: classes.dex */
public class CctBackendFactory {
    public InterfaceC2202g create(AbstractC2198c abstractC2198c) {
        C2197b c2197b = (C2197b) abstractC2198c;
        return new C2080b(c2197b.f9479a, c2197b.f9480b, c2197b.f9481c);
    }
}
