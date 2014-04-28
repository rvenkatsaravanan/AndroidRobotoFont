package com.example.customTextView;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

public class TypefacedTextView extends TextView {
	Typeface robotoFont;

	public TypefacedTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}

	public TypefacedTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public TypefacedTextView(Context context) {
		super(context);
		init();
	}

	private void init() {
        if(robotoFont == null)
        robotoFont=TextFont.getFont(getContext());
		setTypeface(robotoFont);
	}

}