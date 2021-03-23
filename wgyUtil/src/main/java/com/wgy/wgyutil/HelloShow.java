package com.wgy.wgyutil;

import android.content.Context;
import android.widget.Toast;

public class HelloShow {
    public static void showLog(Context context){
        Toast.makeText(context, "test...", Toast.LENGTH_SHORT).show();
    }
}
