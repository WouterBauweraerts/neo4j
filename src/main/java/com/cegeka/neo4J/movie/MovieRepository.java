package com.cegeka.neo4J.movie;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface MovieRepository extends GraphRepository<Movie>{

    Movie findByTitle(String title);

    @Query("Match(movie:Movie) Where movie.tagline = {0} Return movie")
    Movie findByTagline(String tagline);
}
