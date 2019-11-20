//package com.rest.demo.rest;
//
//import com.rest.demo.entity.Movie;
//import com.rest.demo.service.MovieService;
//import com.rest.demo.service.MyMovieService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//@CrossOrigin
//public class DemoRest {
//    @Autowired
//    @Qualifier("MovieService")
//    private MovieService movieService;
//    @Autowired
//    @Qualifier("MyMovieService")
//    private MyMovieService myMovieService;
//
////    @Autowired
////    @Qualifier("myOwnMovieService")
////    private MyOwnMovieService myOwnMovieService;
//
//    @GetMapping("/movie")
//    private List<Movie> showMovies() {
//        return movieService.findAllMovies();
//    }
//
//
//    //  @GetMapping("/smovie/{movieName}?limit={limit}")
//    @GetMapping("/smovie/{movieName}")
//    private List<Movie> showName(@PathVariable String movieName, @RequestParam(value = "limit", defaultValue = "15") int limit) {
//        List<Movie> movies;
//        try {
//            movies = myMovieService.findMovieByName(movieName);
//            movies = limit > movies.size() ? movies : movies.subList(0, limit);
//        } catch (IndexOutOfBoundsException e) {
//            movies = new ArrayList<>();
//        }
//        return movies;
//    }
//
//
//    @GetMapping("/movie/{movieId}")
//    private Movie showMovie(@PathVariable int movieId) {
//        return movieService.findMovieById(movieId);
//    }
//
//    @PostMapping("/movie")
//    private void saveMovie(@RequestBody Movie movie) {
//        movieService.saveMovie(movie);
//    }
//
//    @PutMapping("/movie")
//    private String editMovie(@RequestBody Movie movie) {
//        movieService.saveMovie(movie);
//        return "UPDATED";
//    }
//
//
//    @DeleteMapping("/movie/{movieId}")
//    private String deleteTheMovie(@PathVariable int movieId) {
//        movieService.deleteMovie(movieId);
//        return "Deleted Successfully";
//    }
//}
