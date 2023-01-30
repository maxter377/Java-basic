package MovieLibrary;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String name;
    private String title;
    private int releaseYear;
    private Director director;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String name, String title, int releaseYear, MovieLibrary.Director director, List<MovieLibrary.Actor> actors) {
        this.name = name;
        this.title = title;
        this.releaseYear = releaseYear;
        this.director = director;
        this.actors = actors;
    }
}
