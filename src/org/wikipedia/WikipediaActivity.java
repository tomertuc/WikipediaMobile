package org.wikipedia;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
//import android.util.Log;
//import android.webkit.WebView;

import com.phonegap.DroidGap;

public class WikipediaActivity extends DroidGap {
    /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
		super.loadUrl("file:///android_asset/www/index.html");
    }

}