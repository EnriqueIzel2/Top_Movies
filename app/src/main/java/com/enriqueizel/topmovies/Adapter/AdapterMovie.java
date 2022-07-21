package com.enriqueizel.topmovies.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.enriqueizel.topmovies.Model.Movie;
import com.enriqueizel.topmovies.R;

import java.util.List;

public class AdapterMovie extends RecyclerView.Adapter<AdapterMovie.MovieViewHolder> {

  private Context context;
  private List<Movie> movieList;

  public AdapterMovie(Context context, List<Movie> movieList) {
    this.context = context;
    this.movieList = movieList;
  }

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
    Glide.with(context).load(movieList.get(position).getCover()).into(holder.cover);
    holder.title.setText(movieList.get(position).getTitle());
  }

  @Override
  public int getItemCount() {
    return movieList.size();
  }

  public class MovieViewHolder extends RecyclerView.ViewHolder {

    private ImageView cover;
    private TextView title;

    public MovieViewHolder(@NonNull View itemView) {
      super(itemView);
      cover = itemView.findViewById(R.id.item_movie_cover);
      title = itemView.findViewById(R.id.item_movie_title);
    }
  }
}
