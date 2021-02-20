package com.example.ed_caliber;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class StartActivity extends android.app.Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(this,ChooseActivity.class);
        startActivity(intent);
    }
}