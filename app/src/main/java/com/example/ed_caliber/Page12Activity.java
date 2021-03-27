package com.example.ed_caliber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Page12Activity extends android.app.Activity {
    ImageView prev,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page12);
        prev = (ImageView) findViewById(R.id.prev2);
        next = (ImageView) findViewById(R.id.next3);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page12Activity.this, Page11Activity.class);
                startActivity(intent);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page12Activity.this, Page13Activity.class);
                startActivity(intent);
            }
        });
    }
}