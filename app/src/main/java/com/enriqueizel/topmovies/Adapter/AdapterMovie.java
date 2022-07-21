package com.enriqueizel.topmovies.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.enriqueizel.topmovies.R;

public class AdapterMovie extends RecyclerView.Adapter<AdapterMovie.MovieViewHolder> {

  private Context context;

  @NonNull
  @Override
  public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View listItem;
    LayoutInflater layoutInflater = LayoutInflater.from(context);
    listItem = layoutInflater.inflate(R.layout.movie_item, parent, false);
    return new MovieViewHolder(listItem);
  }

  @Override
  public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

  }

  @Override
  public int getItemCount() {
    return 0;
  }

  public class MovieViewHolder extends RecyclerView.ViewHolder {

    public MovieViewHolder(@NonNull View itemView) {
      super(itemView);
    }
  }
}
