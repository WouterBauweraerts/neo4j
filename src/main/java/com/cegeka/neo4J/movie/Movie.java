package com.cegeka.neo4J.movie;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Movie {
    @GraphId
    private Long movieId;
    private String title;
    private String tagLine;
    private int released;

    public Movie(String title, String tagline, int released) {
        this.title = title;
        this.tagLine = tagline;
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

    public String getTagLine() {
        return tagLine;
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
        return tagLine != null ? tagLine.equals(movie.tagLine) : movie.tagLine == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (tagLine != null ? tagLine.hashCode() : 0);
        result = 31 * result + released;
        return result;
    }
}
