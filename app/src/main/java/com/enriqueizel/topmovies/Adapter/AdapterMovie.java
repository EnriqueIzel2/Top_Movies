package com.enriqueizel.topmovies.Adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterMovie extends RecyclerView.Adapter<AdapterMovie.MovieViewHolder> {

  @NonNull
  @Override
  public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return null;
  }

  @Override
  public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

  }

  @Override
  public int getItemCount() {
    return 0;
  }

  public class MovieViewHolder extends RecyclerView.ViewHolder{

    public MovieViewHolder(@NonNull View itemView) {
      super(itemView);
    }
  }
}
