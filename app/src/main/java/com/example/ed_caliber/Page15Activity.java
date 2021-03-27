package com.example.ed_caliber;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Page15Activity extends android.app.Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page15);
        ImageView prev;
        Button incorrect, correct;
        prev = (ImageView) findViewById(R.id.prev6);
        incorrect = (Button)findViewById(R.id.incorrect);
        correct = (Button)findViewById(R.id.correct);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page15Activity.this, Page14Activity.class);
                startActivity(intent);
            }
        });

        correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(Page15Activity.this, "Correct! \"Process the Image\"", Toast.LENGTH_LONG);
                View view = toast.getView();

                //To change the Background of Toast
                view.setBackgroundResource(R.color.toast);

                TextView text = (TextView) view.findViewById(android.R.id.message);

                //Shadow of the Of the Text Color
                text.setShadowLayer(0, 0, 0, Color.BLACK);
                text.setTextColor(Color.WHITE);
                text.setTextSize(12);
                toast.show();
                Intent intent = new Intent(Page15Activity.this, Page14Activity.class);
                startActivity(intent);
            }
        });
        incorrect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(Page15Activity.this, "Incorrect", Toast.LENGTH_SHORT);
                View view = toast.getView();

                //To change the Background of Toast
                view.setBackgroundResource(R.color.red);

                TextView text = (TextView) view.findViewById(android.R.id.message);

                //Shadow of the Of the Text Color
                text.setShadowLayer(0, 0, 0, Color.BLACK);
                text.setTextColor(Color.WHITE);
                text.setTextSize(12);
                toast.show();
                incorrect.setBackgroundResource(R.drawable.incorrect);
            }
        });
    }
}