package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    Paint mPaint = new Paint();
    Paint mPaint1 = new Paint();
    Paint mPaint2 = new Paint();
    Paint mPaint3 = new Paint();
    Paint mPaint4 = new Paint();
    Paint mPaint5 = new Paint();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.RED);
        mPaint1.setColor(Color.WHITE);
        mPaint2.setColor(Color.BLUE);
        mPaint3.setColor(Color.YELLOW);
        mPaint4.setColor(Color.BLACK);
        mPaint5.setColor(Color.MAGENTA);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        RectF rectF = new RectF();
        rectF.set(150, 150, 550, 550);
        canvas.drawArc(rectF, -60, 55, true, mPaint);
        canvas.drawArc(rectF, 0, 25, true, mPaint2);
        canvas.drawArc(rectF, 30, 85, true, mPaint3);
        canvas.drawArc(rectF, 120, 75, true, mPaint4);

        canvas.drawArc(140, 140, 540, 540, 200, 95, true, mPaint5);
    }
}
