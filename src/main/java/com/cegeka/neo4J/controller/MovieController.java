package com.cegeka.neo4J.controller;



import com.cegeka.neo4J.movie.Movie;
import com.cegeka.neo4J.movie.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Movie> getMovies(){
        return movieService.getMovies();
    }

    @RequestMapping(value = "/byTitle", method = RequestMethod.GET)
    public Movie getMovieByTitle(@RequestParam("title")String title){
        return movieService.getMovie(title);
    }

}
