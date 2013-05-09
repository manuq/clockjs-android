package org.sugarlabs.clockjs;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import android.webkit.ConsoleMessage;

public class ClockActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Remove title bar as we already have the sugar toolbar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_clock);

        // Configure the webview setup in the xml layout
        WebView myWebview = (WebView) findViewById(R.id.webview);

        // Allow javascript
        WebSettings webSettings = myWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Make sure links in the webview is handled by the webview
        // and not sent to a full browser
        myWebview.setWebViewClient(new WebViewClient());

        myWebview.setWebChromeClient(new WebChromeClient() {
          public boolean onConsoleMessage(ConsoleMessage cm) {
            Log.d("MyApplication", cm.message() + " -- From line "
                                 + cm.lineNumber() + " of "
                                 + cm.sourceId() );
            return true;
          }
        });

        //And let the fun begin
        myWebview.loadUrl("file:///android_asset/index.html");
    }    

}
