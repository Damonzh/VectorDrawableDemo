package com.damon.vectordrawabledemo;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.image_view);
        Drawable drawable = imageView.getDrawable();
        //AnimatedVectorDrawableCompat实现了Animatable接口
        if (drawable instanceof Animatable){
            ((Animatable) drawable).start();
        }
    }
}
