package com.example.ed_caliber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Page11Activity extends android.app.Activity {
    ImageView prev,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page11);
        prev = (ImageView) findViewById(R.id.prev4);
        next = (ImageView) findViewById(R.id.next2);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page11Activity.this, Page10Activity.class);
                startActivity(intent);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page11Activity.this, Page12Activity.class);
                startActivity(intent);
            }
        });
    }
}