package com.enriqueizel.topmovies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

  private VideoView videoView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_video);
    getSupportActionBar().hide();

    videoView = findViewById(R.id.video_playing);
    String video = getIntent().getExtras().getString("video");
  }
}