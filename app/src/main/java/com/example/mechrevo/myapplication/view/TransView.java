package com.example.mechrevo.myapplication.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class TransView extends View {

    private Paint mYePaint,mRedPaint;

    public TransView(Context context) {
        this(context,null);
    }

    public TransView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TransView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mYePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mYePaint.setColor(Color.YELLOW);
        mYePaint.setStyle(Paint.Style.FILL);

        mRedPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mRedPaint.setColor(Color.RED);
        mRedPaint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(150,400,50,mYePaint);

        canvas.drawCircle(400,400,100,mRedPaint);

    }

}
