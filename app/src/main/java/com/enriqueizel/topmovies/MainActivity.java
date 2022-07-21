package com.enriqueizel.topmovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.enriqueizel.topmovies.Adapter.AdapterMovie;
import com.enriqueizel.topmovies.Model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  private RecyclerView recyclerViewMovies;
  private AdapterMovie adapterMovie;
  private List<Movie> movieList;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    getComponentsID();
    movieList = new ArrayList<>();
    adapterMovie = new AdapterMovie(getApplicationContext(), movieList);
    recyclerViewMovies.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
    recyclerViewMovies.setHasFixedSize(true);
    recyclerViewMovies.setAdapter(adapterMovie);
  }

  private void getComponentsID() {
    recyclerViewMovies = findViewById(R.id.recycler_movies);
  }
}