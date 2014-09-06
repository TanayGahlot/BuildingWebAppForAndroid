package com.example.tanaygahlot.webapp;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by tanaygahlot on 9/5/14.
 */
public class JsInterface {
    Context mContext;

    /** Instantiate the interface and set the context */
    JsInterface(Context c) {
        mContext = c;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }
}

