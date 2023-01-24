package ch.ergon.shanselm.android.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadWebSite()
    }

    private fun loadWebSite() {
        val webView = findViewById<WebView>(R.id.webFormView)
        webView.loadUrl("file:///android_asset/web_form.html")
    }
}