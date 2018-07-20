package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    Paint mPaint = new Paint();
    Path mPath = new Path();

    Paint mPaint2=new Paint();
    Path mPath2=new Path();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        mPaint.setStrokeWidth(5);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(50);

        mPaint2.setColor(Color.GREEN);
//        mPaint2.setStyle(Paint.Style.STROKE);
        mPaint2.setStrokeWidth(5);

        mPath.moveTo(100, 100);
        mPath.lineTo(100, 600);
        mPath.rLineTo(800, 0);

        mPath2.moveTo(120,600);
        mPath2.lineTo(120,500);
        mPath2.rLineTo(50,0);
        mPath2.rLineTo(0,100);




        canvas.drawPath(mPath, mPaint);
        canvas.drawPath(mPath2,mPaint2);

        canvas.drawText("直方图",350,650,mPaint);

    }
}
