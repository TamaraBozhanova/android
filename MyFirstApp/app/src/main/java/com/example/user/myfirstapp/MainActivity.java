package com.example.user.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout main_view = (RelativeLayout)findViewById(R.id.main_view);
        final TextView choosenButton = (TextView) findViewById(R.id.main_text);

        Button redButton = (Button) findViewById(R.id.red_button);
        Button yellowButton = (Button) findViewById(R.id.yellow_button);
        Button greenButton = (Button) findViewById(R.id.green_button);

        redButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                main_view.setBackgroundColor(getResources().getColor(R.color.redColor));
                choosenButton.setText(getResources().getText(R.string.red));
            }
        });

        yellowButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                main_view.setBackgroundColor(getResources().getColor(R.color.yellowColor));
                choosenButton.setText(getResources().getText(R.string.yellow));
            }
        });

        greenButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                main_view.setBackgroundColor(getResources().getColor(R.color.greenColor));
                choosenButton.setText(getResources().getText(R.string.green));
            }
        });
    }
}
