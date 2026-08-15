# UltraPlayer native WebView debug/release rules.
-keepclassmembers class * {
    @android.webkit.JavascriptInterface <methods>;
}

# O WebView chama estas APIs por reflexão e pelo nome registrado.
-keep class com.ultraplayer.app.MainActivity { *; }
-keep class com.ultraplayer.app.MainActivity$* { *; }
-keep class com.ultraplayer.app.ApkUpdateManager { *; }
-keep class com.ultraplayer.app.PlayerActivity { *; }

# Mantém as classes Media3 usadas pelo player nativo.
-keep class androidx.media3.** { *; }
-dontwarn androidx.media3.**
-dontwarn org.xmlpull.v1.**
