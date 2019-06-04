package com.example.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SingleInstanceActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);
        Log.d("SingleInstanceActivity","this tackTd is "+ getTaskId());
        Button single_instance_button = findViewById(R.id.single_instance_button);
        single_instance_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SingleInstanceActivity.this, StandardActivity.class);
                startActivity(intent);
            }
        });
    }
}
