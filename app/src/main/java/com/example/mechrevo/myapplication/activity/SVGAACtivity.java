package com.example.mechrevo.myapplication.activity;

import android.net.http.HttpResponseCache;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.example.mechrevo.myapplication.R;
import com.example.mechrevo.myapplication.bean.User;
import com.opensource.svgaplayer.SVGADrawable;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;
import org.jetbrains.annotations.NotNull;

import java.net.MalformedURLException;
import java.net.URL;

public class SVGAACtivity extends AppCompatActivity implements ILoginManager{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svga);

        SVGAParser parser = new SVGAParser(this);
        URL url = null;
        try {
             url = new URL("https://github.com/yyued/SVGA-Samples/blob/master/posche.svga?raw=true");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        SVGAImageView svgaImageView = findViewById(R.id.svgaDrawable);
        parser.parse(url, new SVGAParser.ParseCompletion() {
            @Override
            public void onComplete(@NotNull SVGAVideoEntity svgaVideoEntity) {
                SVGADrawable svgaDrawable = new SVGADrawable(svgaVideoEntity);
                svgaImageView.setImageDrawable(svgaDrawable);
                svgaImageView.startAnimation();
            }

            @Override
            public void onError() {

            }
        });

    }

    @Override
    public void login() {

    }

    @Override
    public User getUser() {
        return null;
    }
}
