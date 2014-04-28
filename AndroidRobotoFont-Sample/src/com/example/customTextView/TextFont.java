package com.example.customTextView;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;

/**
 * Created by Venkat on 16/1/14.
 * 
 * Note: Here Roboto-Light and Roboto-Regular is used, 
 * For higher version Roboto-Light is good but not as much good in lower version.
 * So Roboto-Regular is used  
 * 
 */
public class TextFont {
    static Typeface typeface;

    public static Typeface getFont(Context context){
        if(typeface == null){
            if (Build.VERSION.SDK_INT > 13) {
                typeface = Typeface.createFromAsset(context.getAssets(),	"Roboto-Light.ttf");
            } else{
                typeface = Typeface.createFromAsset(context.getAssets(),	"Roboto-Medium.ttf");
            }
        }
        return typeface;
    }


}
