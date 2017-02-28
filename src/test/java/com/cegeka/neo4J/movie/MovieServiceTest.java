package com.cegeka.neo4J.movie;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class MovieServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private MovieService movieService;

    @Mock
    private MovieRepository movieRepository;


    private MovieService realMovieService = new MovieService();

    @Test
    public void getMovies_ShouldReturnAllMovies(){
        movieService.getMovies();
        verify(movieRepository).findAll();
    }

    @Test
    public void getMovies_ContainsTopGun_Testmapping(){
        Movie movie = new Movie("Top Gun", "I feel the need, the need for speed.", 1986);
        List<Movie> movies = new ArrayList<>();
        realMovieService.getMovies().forEach(movies::add);
        Assertions.assertThat(movies).contains(movie);
    }

}