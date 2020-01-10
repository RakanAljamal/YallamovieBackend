package com.rest.demo.service;

import com.rest.demo.entity.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MovieService {
    public List<Movie> findAllMovies();

    public Movie findMovieById(int employeeId);

    public void saveMovie(Movie employee);

    public void deleteMovie(int employeeId);

    public Page<Movie> findAllByPage(Pageable page);
}
