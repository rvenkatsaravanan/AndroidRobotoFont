package com.example.customTextView;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;

/**
 * Created by Venkat on 16/1/14.
 * 
 */
public class TextFontAll {
	static Typeface typeface;

	public static Typeface getFont(Context context, int styleType) {
		switch (styleType) {
		case 1:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"Roboto-Thin.ttf");
			break;
		case 2:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"Roboto-Light.ttf");
			break;
		case 3:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"Roboto-Regular.ttf");
			break;
		case 4:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"Roboto-Medium.ttf");
			break;
		case 5:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"Roboto-Bold.ttf");
			break;
		case 6:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"Roboto-Black.ttf");
			break;
		case 7:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"Roboto-Light.ttf");
			break;
		case 8:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"Roboto-Light.ttf");
			break;

		}
		return typeface;
	}

}
