package com.enriqueizel.topmovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

  private VideoView videoView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_video);
    getSupportActionBar().hide();

    setContentView(R.layout.activity_video);
    this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

    videoView = findViewById(R.id.video_playing);
    String video = getIntent().getExtras().getString("video");

    videoView.setMediaController(new MediaController(this));
    videoView.setVideoURI(Uri.parse(video));
    videoView.requestFocus();
    videoView.start();
  }
}