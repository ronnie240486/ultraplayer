# UltraPlayer native WebView debug/release rules.
-keepclassmembers class * {
    @android.webkit.JavascriptInterface <methods>;
}
