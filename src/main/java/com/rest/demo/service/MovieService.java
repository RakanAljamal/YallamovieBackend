package com.rest.demo.service;

import com.rest.demo.entity.Movie;

import java.util.List;
public interface MovieService {
    public List<Movie> findAllMovies();

    public Movie findMovieById(int employeeId);

    public void saveMovie(Movie employee);

    public void deleteMovie(int employeeId);
}
