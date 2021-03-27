package com.example.ed_caliber;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Page3Activity extends android.app.Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        ImageView v = (ImageView)findViewById(R.id.imageView10);
        v.setOnClickListener(new View.OnClickListener() {
                @Override
        public void onClick(View v) {
                    Intent intent = new Intent(Page3Activity.this, Page4Activity.class);
                    startActivity(intent);
        }
    });
}

}