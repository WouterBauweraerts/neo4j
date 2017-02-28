package com.cegeka.neo4J;

import com.cegeka.neo4J.movie.MovieServiceTest;
import com.cegeka.neo4J.movie.NoMockMovieServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MovieServiceTest.class,
        NoMockMovieServiceTest.class
})
public class AllTests {
}
