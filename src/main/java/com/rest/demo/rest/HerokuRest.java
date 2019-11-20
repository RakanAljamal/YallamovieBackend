package com.rest.demo.rest;

import com.rest.demo.entity.Movie;
import com.rest.demo.service.MovieService;
import com.rest.demo.service.MyMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class HerokuRest {
    @Autowired
    @Qualifier("MovieService")
    private MovieService movieService;
    @Autowired
    @Qualifier("MyMovieService")
    private MyMovieService myMovieService;

    @RequestMapping("/")
    public String showHome(){
    return "Hello-heroku";
}

    @GetMapping("/movie")
    private List<Movie> showMovies() {
        return movieService.findAllMovies();
    }


}
