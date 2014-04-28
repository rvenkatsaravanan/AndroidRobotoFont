package com.example.customTextView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class TypefacedEditText extends EditText {

	Typeface robotoFont;

	public TypefacedEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}

	public TypefacedEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public TypefacedEditText(Context context) {
		super(context);
		init();
	}

	private void init() {
        if(robotoFont == null)
        robotoFont=TextFont.getFont(getContext());
		setTypeface(robotoFont);
	}

}
