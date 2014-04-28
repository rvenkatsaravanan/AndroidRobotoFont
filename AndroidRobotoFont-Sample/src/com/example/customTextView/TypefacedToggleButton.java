package com.example.customTextView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/**
 * Created by Venkat on 16/1/14.
 */
public class TypefacedToggleButton extends ToggleButton {
    Typeface robotoFont;

    public TypefacedToggleButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TypefacedToggleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TypefacedToggleButton(Context context) {
        super(context);
        init();
    }

    private void init() {
        if(robotoFont == null)
            robotoFont=TextFont.getFont(getContext());
        setTypeface(robotoFont);
    }
}
