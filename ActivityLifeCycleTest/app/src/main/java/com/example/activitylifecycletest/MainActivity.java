package com.example.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        Log.d("MainActivity","this tackTd is "+ getTaskId());

        if (savedInstanceState != null) {
            String tempData = savedInstanceState.getString("tempData");
            Log.d(TAG, tempData);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start_normal_activity = findViewById(R.id.start_normal_activity);
        start_normal_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });
        Button start_dialog_activity = findViewById(R.id.start_dialog_activity);
        start_dialog_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });
        Button toStandard = findViewById(R.id.toStandard);//
        toStandard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StandardActivity.class);
                startActivity(intent);
            }
        });
        Button toSingleTop = findViewById(R.id.toSingleTop);
        toSingleTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SingleTopActivity.class);
                startActivity(intent);
            }
        });
        Button toSingleTask = findViewById(R.id.toSingleTask);
        toSingleTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SingleTaskActivity.class);
                startActivity(intent);
            }
        });
        Button toSingleInstance = findViewById(R.id.toSingleInstance);
        toSingleInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SingleInstanceActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempData = "this is temp data";
        outState.putString("tempData", tempData);
    }
}
