package com.cegeka.neo4J.movie;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Movie {
    @GraphId
    private Long movieId;
    private String title;
    private String tagline;
    private int released;

    public Movie(String title, String tagline, int released) {
        this.title = title;
        this.tagline = tagline;
        this.released = released;
    }

    public Movie() {
    }

    public Long getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getTagline() {
        return tagline;
    }

    public int getReleased() {
        return released;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (released != movie.released) return false;
        if (title != null ? !title.equals(movie.title) : movie.title != null) return false;
        return tagline != null ? tagline.equals(movie.tagline) : movie.tagline == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (tagline != null ? tagline.hashCode() : 0);
        result = 31 * result + released;
        return result;
    }
}
