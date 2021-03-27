package com.example.ed_caliber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import pl.droidsonroids.gif.GifImageView;

public class Page13Activity extends android.app.Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page13);
        GifImageView g;
        ImageView prev;
        prev = (ImageView) findViewById(R.id.prev3);
        g = (GifImageView) findViewById(R.id.gifImageView3);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page13Activity.this, Page11Activity.class);
                startActivity(intent);
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page13Activity.this, Page14Activity.class);
                startActivity(intent);
            }
        });
    }
}