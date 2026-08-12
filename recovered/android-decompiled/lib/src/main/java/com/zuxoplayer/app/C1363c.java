package com.zuxoplayer.app;

import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* JADX INFO: renamed from: com.zuxoplayer.app.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1363c extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Log.d("HDXWeb", "CONSOLE [" + consoleMessage.messageLevel() + "] " + consoleMessage.message() + " @" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber());
        return true;
    }
}
