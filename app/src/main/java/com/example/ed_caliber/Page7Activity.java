package com.example.ed_caliber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import pl.droidsonroids.gif.GifImageView;


public class Page7Activity extends android.app.Activity {
    ImageView prev;
    GifImageView g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);
        prev = (ImageView) findViewById(R.id.prev);
        g = (GifImageView) findViewById(R.id.gifImageView);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page7Activity.this, Page6Activity.class);
                startActivity(intent);
            }
        });


        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page7Activity.this, Page8Activity.class);
                startActivity(intent);
            }
        });
    }
}
