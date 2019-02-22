package com.example.mechrevo.myapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.mechrevo.myapplication.R;
import com.example.mechrevo.myapplication.view.A;

public class NullActivity extends AppCompatActivity {

    static String a = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_null);
        findViewById(R.id.tvLeakCheck).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = null;
//                System.gc();
                boolean b = a == null;
            }
        });

    }

    static class A {
    }
}
