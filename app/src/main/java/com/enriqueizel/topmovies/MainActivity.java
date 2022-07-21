package com.enriqueizel.topmovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  private RecyclerView recyclerViewMovies;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  private void getComponentsID(){
    recyclerViewMovies = findViewById(R.id.recycler_movies);
  }
}