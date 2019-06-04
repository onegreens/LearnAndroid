package com.example.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingleTopActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //位于栈顶则不创建
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top);

        Button single_top_button = findViewById(R.id.single_top_button);
        single_top_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SingleTopActivity.this,SingleTopActivity.class);
                startActivity(intent);
            }
        });
    }
}
