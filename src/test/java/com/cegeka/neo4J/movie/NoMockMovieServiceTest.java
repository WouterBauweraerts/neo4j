package com.cegeka.neo4J.movie;

import com.cegeka.neo4J.Neo4JApplication;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Neo4JApplication.class)
@SpringBootTest
public class NoMockMovieServiceTest {
    @Autowired
    private MovieService movieService;

    @Test
    public void getMovies_ContainsTopGun_Testmapping() {
        Movie movie = new Movie("Top Gun", "I feel the need, the need for speed.", 1986);
        List<Movie> movies = new ArrayList<>();
        movieService.getMovies().forEach(movies::add);
        Assertions.assertThat(movies).contains(movie);
    }
}
