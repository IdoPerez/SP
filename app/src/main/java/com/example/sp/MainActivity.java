package com.example.sp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView tv0;
     EditText et0;
     int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et0 = (EditText) findViewById(R.id.et0);
        tv0 = (TextView) findViewById(R.id.tv0);
    }

    public void Count(View view) {
        count++;
        tv0.setText("Score"+count);
    }

    public void Reset(View view) {
        count = 0;
        tv0.setText("Score:"+count);
    }

    public void Exit(View view) {
    }
}
