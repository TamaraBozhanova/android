package com.wizards.edu.educationproject1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_main);
        System.out.println("activity BaseActivity created");
    }
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("activity BaseActivity started");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Button btn = (Button)findViewById(R.id.transition_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(BaseActivity.this, MainActivity.class);

                startActivity(intent);

            }});
        System.out.println("activity BaseActivity resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("activity BaseActivity paused");
    }
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("activity BaseActivity stopped");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("activity BaseActivity destroyed");
    }
}
