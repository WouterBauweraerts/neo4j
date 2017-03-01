package com.cegeka.neo4J.movie;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Iterable<Movie> getMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovie(String title) {
        return movieRepository.findByTitle(title);
    }

    public Movie getMovieByTagline(String tagline) {
        return movieRepository.findByTagline(tagline);
    }
}
