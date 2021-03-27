package com.example.ed_caliber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import pl.droidsonroids.gif.GifImageView;

public class Page10Activity extends android.app.Activity  {
    ImageView prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page10);
        GifImageView g = (GifImageView) findViewById(R.id.gifImageView2);
        prev = (ImageView) findViewById(R.id.prev);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page10Activity.this, Page9Activity.class);
                startActivity(intent);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page10Activity.this, Page11Activity.class);
                startActivity(intent);
            }
        });
    }
}