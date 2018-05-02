package com.reinhard.interview.pratice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.reinhard.interview.pratice.measure.LinearActivity;
import com.reinhard.interview.pratice.measure.RelativeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goMeasure();
//        goLinear();
    }

    void goMeasure() {
        Intent intent = new Intent(this, RelativeActivity.class);
        startActivity(intent);
    }

    void goLinear() {
        Intent intent = new Intent(this, LinearActivity.class);
        startActivity(intent);
    }
}
