package com.firmfreez.android.canvasdemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView mImageView;
    private Canvas    mCanvas;
    private Bitmap    mBitmap;
    private Paint     mPaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Задаём размеры экрана
        int widthInPixels  = 800;
        int heightInPixels = 600;

        //Инициализируем битмап, на котором будем рисовать
        mBitmap = Bitmap.createBitmap(widthInPixels, heightInPixels, Bitmap.Config.ARGB_8888);

        //Инициализируем Canvas (Полотно), которое имеет методы для рисования
        mCanvas = new Canvas(mBitmap);

        //Иницализируем ImageView и Paint
        mImageView = new ImageView(this);
        mPaint = new Paint();

        //Закрашиваем фон в красный
        mCanvas.drawColor(Color.argb(255,0,0,255));
        //Устанавливаем размер нарисованного текста
        mPaint.setTextSize(100);
        //Устанавливаем цвет для текста
        mPaint.setColor(Color.argb(255,255,255,255));
        //Рисуем текст
        mCanvas.drawText("Hello world!", 100, 100, mPaint);
        //Задаем цвет для рисования круга
        mPaint.setColor(Color.argb(255,212,207, 62));
        //Рисуем круг
        mCanvas.drawCircle(400,250,100, mPaint);

        //Заносим Bitmap в ImageView
        mImageView.setImageBitmap(mBitmap);

        //Говорим активити нарисовать ImageView
        setContentView(mImageView);
    }
}