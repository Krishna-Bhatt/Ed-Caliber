package com.example.ed_caliber;
import android.app.ProgressDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class IntroActivity extends android.app.Activity {
    VideoView videoView;
    String video_url = "https://drive.google.com/file/d/184O4jM_7CRdjReenFOUH8-s34HhaExZx/view?usp=sharing";
    ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        ImageView prev = (ImageView) findViewById(R.id.prev);
        videoView =(VideoView)findViewById(R.id.intro_video);

        pd = new ProgressDialog(IntroActivity.this);
        pd.setMessage("Please wait...");
        pd.show();

        MediaController mediaController = new MediaController(this);
        videoView.setVideoURI(Uri.parse(video_url));
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                //close the progress dialog when buffering is done
                pd.dismiss();
                videoView.start();
            }
        });


        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                Intent intent=new  Intent(IntroActivity.this,StartPageActivity.class);
                startActivity(intent);

            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntroActivity.this,ChooseActivity.class);
                startActivity(intent);
            }
        });
    }
}