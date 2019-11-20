package com.rest.demo.entity;

public class dummyMovie {
    int id;
    String movieName,movieDescription,moviePhoto,movieYoutube;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getMoviePhoto() {
        return moviePhoto;
    }

    public void setMoviePhoto(String moviePhoto) {
        this.moviePhoto = moviePhoto;
    }

    public String getMovieYoutube() {
        return movieYoutube;
    }

    public void setMovieYoutube(String movieYoutube) {
        this.movieYoutube = movieYoutube;
    }

    public dummyMovie(int id, String movieName, String movieDescription, String moviePhoto, String movieYoutube) {
        this.id = id;
        this.movieName = movieName;
        this.movieDescription = movieDescription;
        this.moviePhoto = moviePhoto;
        this.movieYoutube = movieYoutube;
    }
}
