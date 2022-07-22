package com.enriqueizel.topmovies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MovieDetailsActivity extends AppCompatActivity {

  private ImageView detailsCover, detailsPlayVideo;
  private TextView detailsTitle, detailsDescription, detailsCast;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_movie_details);

    getComponentsID();

    String cover = getIntent().getExtras().getString("cover");
    String title = getIntent().getExtras().getString("title");
    String description = getIntent().getExtras().getString("description");
    String cast = getIntent().getExtras().getString("cast");
    String video = getIntent().getExtras().getString("video");

    Glide.with(getApplicationContext()).load(cover).into(detailsCover);
    detailsTitle.setText(title);
    detailsDescription.setText(description);
    detailsCast.setText(cast);
  }

  private void getComponentsID() {
    detailsCover = findViewById(R.id.details_cover);
    detailsPlayVideo = findViewById(R.id.details_play_video);
    detailsTitle = findViewById(R.id.details_title);
    detailsDescription = findViewById(R.id.details_description);
    detailsCast = findViewById(R.id.details_cast);
  }
}