package com.enriqueizel.topmovies.Model;

public class Movie {
  private String title;
  private int cover;
  private String description;
  private String cast;
  private String video;

  public Movie(int cover, String title) {
    this.title = title;
    this.cover = cover;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getCover() {
    return cover;
  }

  public void setCover(int cover) {
    this.cover = cover;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCast() {
    return cast;
  }

  public void setCast(String cast) {
    this.cast = cast;
  }

  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }
}
