package com.enriqueizel.topmovies;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.enriqueizel.topmovies.Adapter.AdapterMovie;
import com.enriqueizel.topmovies.Model.Movie;
import com.enriqueizel.topmovies.Model.MovieApi;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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

//    configura a retrofit
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://firebasestorage.googleapis.com/v0/b/app-delivery-97d5b.appspot.com/o/")
            .addConverterFactory(GsonConverterFactory.create()).build();

//    inicia a retrofit
    MovieApi movieApi = retrofit.create(MovieApi.class);
    Call<List<Movie>> call = movieApi.getMovies();
    call.enqueue(new Callback<List<Movie>>() {
      @Override
      public void onResponse(Call<List<Movie>> call, @NonNull Response<List<Movie>> response) {
        if (response.code() != 200) {
          return;
        }

        List<Movie> movies = response.body();
        System.out.println("aqui é o response " + response.body().get(1).getVideo());

        for (Movie movie : movies) {
          movieList.add(movie);
        }

        adapterMovie = new AdapterMovie(getApplicationContext(), movieList);
        recyclerViewMovies.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        recyclerViewMovies.setHasFixedSize(true);
        recyclerViewMovies.setAdapter(adapterMovie);
      }

      @Override
      public void onFailure(Call<List<Movie>> call, Throwable t) {

      }
    });
  }

  private void getComponentsID() {
    recyclerViewMovies = findViewById(R.id.recycler_movies);
  }
}
