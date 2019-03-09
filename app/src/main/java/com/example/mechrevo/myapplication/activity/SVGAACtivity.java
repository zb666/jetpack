package com.example.mechrevo.myapplication.activity;

import android.net.http.HttpResponseCache;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.example.mechrevo.myapplication.R;
import com.example.mechrevo.myapplication.bean.User;
import com.example.mechrevo.myapplication.factory.aifac.AndroidFactory;
import com.example.mechrevo.myapplication.factory.simplefactory.IApi;
import com.example.mechrevo.myapplication.factory.simplefactory.SimpleFactory;
import com.opensource.svgaplayer.SVGADrawable;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;

import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;

public class SVGAACtivity extends AppCompatActivity implements ILoginManager {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svga);

        new AndroidFactory().create(1).show();

        IApi iApi = SimpleFactory.create(1);


    }

    int getT() {
        int i = 0;
        try {
            i = 1;
            return i;
        } catch (Exception ex) {

        } finally {
            i = 2;
            return i;
        }
    }


    @Override
    public void login() {
        new AndroidFactory().create(1).show();
    }

    @Override
    public User getUser() {
        return null;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
