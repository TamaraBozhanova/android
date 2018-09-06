package com.wizards.edu.activityexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

public class ClickButtonActivity1 extends Activity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.click_button_layout1);

        textView=(TextView) findViewById(R.id.textView);

    }

    public void click(View view){
        String text = " ";
        if(view.getId() == R.id.button){
            text = "Hello World!!!";
        }
        textView.setText(text);
    }

}
