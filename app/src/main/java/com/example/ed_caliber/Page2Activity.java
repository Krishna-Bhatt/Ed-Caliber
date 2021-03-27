package com.example.ed_caliber;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Page2Activity extends android.app.Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(Page2Activity.this, Page3Activity.class);
        startActivity(intent);
    }
}