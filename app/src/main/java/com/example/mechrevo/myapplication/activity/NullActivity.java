package com.example.mechrevo.myapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.MotionEvent;
import android.view.View;
import com.example.mechrevo.myapplication.R;
import com.example.mechrevo.myapplication.fm.OneFm;
import com.example.mechrevo.myapplication.view.A;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.net.ssl.SSLSocketFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public class NullActivity extends AppCompatActivity {

    static String a = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_null);
        Intent intent = getIntent();
        String value = intent.getStringExtra("key");
        AppCompatDelegate delegate = getDelegate();
        findViewById(R.id.tvLeakCheck).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = null;
            }
        });
        //设置OKHttpClient为网络客户端
    }

    static class A extends CallAdapter.Factory {
        @Override
        public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
            return null;
        }
    }
}
