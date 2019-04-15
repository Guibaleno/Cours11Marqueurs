package com.example.a533.canvas;

import android.graphics.Bitmap;

public class Marqueur implements PlanViewDisplayable{
    private float positionX = 0;
    private float positionY = 0;
    private Bitmap plan;

    public Marqueur(Bitmap bitmap, float newPositionX, float newPositionY)
    {
        plan = bitmap;
        positionX = newPositionX;
        positionY = newPositionY;
    }

    @Override
    public float getPositionX() {
        return positionX;
    }

    @Override
    public float getPositionY() {
        return positionY;
    }

    @Override
    public float getWidth() {
        return plan.getWidth();
    }

    @Override
    public float getHeight() {
        return plan.getHeight();
    }

    @Override
    public Bitmap getBitmap() {
        return plan;
    }
}
