package com.wizards.edu.activityexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class ResourseDemonstrationLayout2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resoursr_demonstration_layout2);

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageDrawable(getResources().getDrawable(R.drawable.android));
    }
}
