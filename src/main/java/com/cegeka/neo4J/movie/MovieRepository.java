package com.cegeka.neo4J.movie;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MovieRepository extends GraphRepository<Movie>{

    Movie findByTitle(String title);
}
