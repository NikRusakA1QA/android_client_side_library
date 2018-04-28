package com.gsma.mobileconnect.r2.android.clientside.utils;


import android.annotation.SuppressLint;
import android.webkit.WebSettings;

public class SettingsUtils {

    /**
     * Sets configuration for {@link com.gsma.mobileconnect.r2.android.clientside.view.InteractiveWebView}.
     * @param webSettings
     * @return
     */
    @SuppressLint("SetJavaScriptEnabled")
    public static WebSettings getDefaultWebSettings(WebSettings webSettings) {
        final WebSettings settings = webSettings;
        //enabling Java Script.
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        settings.setSupportMultipleWindows(false);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(false);
        return settings;
    }

}
