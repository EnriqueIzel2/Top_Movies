package com.enriqueizel.topmovies.Model;

public class Movie {
  private String titulo;
  private String capa;
  private String descricao;
  private String elenco;
  private String video;

  public String getTitle() {
    return titulo;
  }

  public void setTitle(String titulo) {
    this.titulo = titulo;
  }

  public String getCover() {
    return capa;
  }

  public void setCover(String capa) {
    this.capa = capa;
  }

  public String getDescription() {
    return descricao;
  }

  public void setDescription(String descricao) {
    this.descricao = descricao;
  }

  public String getCast() {
    return elenco;
  }

  public void setCast(String elenco) {
    this.elenco = elenco;
  }

  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }
}
