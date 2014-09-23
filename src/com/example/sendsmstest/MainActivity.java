package com.example.sendsmstest;

import android.os.Bundle;
import org.apache.cordova.*;

public class MainActivity extends CordovaActivity 
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.init();
        String start_url = Config.getStartUrl(); 
        super.loadUrl(start_url);
    }
}
