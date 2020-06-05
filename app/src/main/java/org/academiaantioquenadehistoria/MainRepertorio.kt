package org.academiaantioquenadehistoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainRepertorio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_repertorio)

        val myWebView: WebView = findViewById(R.id.webView3)
        myWebView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url: String?
            ): Boolean {
                view?.loadUrl(url)
                return true
            }
        }

        myWebView.loadUrl("http://130.211.203.242/revista/index.php/repertoriohistorico")
        myWebView.settings.javaScriptEnabled=true
        myWebView.settings.allowContentAccess=true
        myWebView.settings.domStorageEnabled=true
        myWebView.settings.useWideViewPort=true
        myWebView.settings.setAppCacheEnabled(true)
    }
}