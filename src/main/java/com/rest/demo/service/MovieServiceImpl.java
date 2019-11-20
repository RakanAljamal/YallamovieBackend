package com.rest.demo.service;

import com.rest.demo.dao.MovieDAO;
import com.rest.demo.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Repository("MovieService")
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDAO movieDAO;

    @Override
    @Transactional
    public List<Movie> findAllMovies() {
        return movieDAO.findAll();
    }

    @Override
    @Transactional
    public Movie findMovieById(int movieId) {
      return  movieDAO.findById(movieId).get();
    }

    @Override
    @Transactional
    public void saveMovie(Movie movie) {
        movieDAO.save(movie);
    }

    @Override
    @Transactional
    public void deleteMovie(int movieId) {
        movieDAO.delete(findMovieById(movieId));
    }
}
