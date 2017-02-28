package com.cegeka.neo4J;

import com.cegeka.neo4J.movie.MovieServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MovieServiceTest.class
})
public class AllTests {
}
