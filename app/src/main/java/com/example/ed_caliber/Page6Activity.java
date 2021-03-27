package com.example.ed_caliber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import pl.droidsonroids.gif.GifImageView;

public class Page6Activity extends android.app.Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);

        ImageView prev = (ImageView) findViewById(R.id.prev);
        GifImageView g = (GifImageView) findViewById(R.id.gifImageView);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page6Activity.this, Page4Activity.class);
                startActivity(intent);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page6Activity.this, Page7Activity.class);
                startActivity(intent);
            }
        });

    }
}
