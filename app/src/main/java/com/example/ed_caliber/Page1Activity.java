package com.example.ed_caliber;

//import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

public class Page1Activity extends android.app.Activity{
    String prevStarted = "yes";

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedpreferences = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);
        if (!sharedpreferences.getBoolean(prevStarted, false)) {
            SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putBoolean(prevStarted, Boolean.TRUE);
            editor.apply();
            VideoView videoView =(VideoView)findViewById(R.id.videoView);

            videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.entrance));
            videoView.start();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent=new  Intent(Page1Activity.this, Page2Activity.class);
                    startActivity(intent);
                }
            },5000);

        } else {
            moveToSecondary();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);




    }
    public void moveToSecondary(){
        // use an intent to travel from one activity to another.
        Intent intent = new Intent(Page1Activity.this, Page2Activity.class);
        startActivity(intent);
    }
}